module Parser (parseExpr, optimizeStatement) where

import Syntax

import Control.Applicative ((<$>))
import Text.Parsec
import Text.Parsec.Expr
import Text.Parsec.Language (haskellStyle)
import qualified Text.Parsec.Token as P
import Text.Parsec.String (Parser)

lexer :: P.TokenParser ()
lexer = P.makeTokenParser $
  haskellStyle 
  { 
  P.reservedNames = [
                      "if"
                      , "then"
                      , "else"
                      , "do"
                      , "while"
                      , "skip"
                      , "write"
                      , "read"
                      , ";"
                    ],
  P.reservedOpNames = [
                      "+"
                      , "-"
                      , "*"
                      , "/"
                      , ":="
                      , "%"
                      , "=="
                      , "!="
                      , ">="
                      , ">"
                      , "<"
                      , "<="
                      , "&&"
                      , "||"
                      ] 
  }


natural    = P.natural    lexer
parens     = P.parens     lexer
reservedOp = P.reservedOp lexer
identifier = P.identifier lexer
reserved   = P.reserved   lexer
semi       = P.semi       lexer

term = parens expr
   <|> fmap Var identifier
   <|> Numeral <$> natural
   <?> "term"

expr = buildExpressionParser table term
    <?> "expression"

table = [ [ binary "*" Times AssocLeft, binary "/" Div AssocLeft, binary "%" Mod AssocLeft]
          
          , [ binary "+" Plus AssocLeft,  binary "-" Minus AssocLeft]

          , [ binary "==" Eq AssocNone, binary "!=" Neq AssocNone, binary ">=" Geq AssocNone
            , binary ">" Gt AssocNone,  binary "<=" Leq AssocNone, binary "<"  Lt AssocNone]

          , [ binary "&&" And AssocNone, binary "||" Or AssocNone]
       ]

binary name fun assoc = Infix (do { reservedOp name; return fun }) assoc

statement = do
    res <- sepBy1 stmtHelp (reserved ";")
    if length res == 1
        then return $ head res
        else return $ foldr1 Semicolon res

stmtHelp :: Parser Statement
stmtHelp = 
    assignSt
    <|> skipSt
    <|> readSt
    <|> writeSt
    <|> ifSt
    <|> whileSt
    <|> assignSt

skipSt = do 
    reserved "skip"
    spaces
    return Skip

readSt = do
    reserved "read"
    spaces
    ex <- expr 
    return (Read ex)

writeSt = do
    reserved "write"
    spaces
    ex <- expr
    return (Write ex)

ifSt = do
    reserved "if"
    ex <- expr
    reserved "then"
    st1 <- statement
    reserved "else"
    st2 <- statement
    return (IfC ex st1 st2)

whileSt = do
    reserved "while"
    ex <- expr
    reserved "do"
    st <- statement
    return (While ex st)

assignSt = do
    name <- expr
    spaces
    reservedOp ":="
    spaces
    ex <- expr
    return (Assign name ex)

parseExpr :: String -> Either ParseError Statement
parseExpr = parse statement ""

calculate :: Expr -> Expr
calculate (Plus ex (Numeral 0))  = calculate ex
calculate (Plus (Numeral 0) ex)  = calculate ex
calculate (Minus ex (Numeral 0)) = calculate ex
calculate (Minus (Numeral 0) ex) = calculate ex
calculate (Times ex (Numeral 1)) = calculate ex
calculate (Times (Numeral 1) ex) = calculate ex
calculate (Div ex (Numeral 1))   = calculate ex

calculate (Times ex (Numeral 0)) = Numeral 0
calculate (Times (Numeral 0) ex) = Numeral 0
calculate (Div (Numeral 0) ex)   = Numeral 0

calculate (Plus  (Numeral x) (Numeral y))  = Numeral (x + y)
calculate (Minus (Numeral x) (Numeral y))  = Numeral (x - y)
calculate (Times (Numeral x) (Numeral y))  = Numeral (x * y)
calculate (Div   (Numeral x) (Numeral y))  = Numeral (div x y)
calculate (Mod   (Numeral x) (Numeral y))  = Numeral (mod x y)

calculate (Plus ex1 ex2)         = Plus  (calculate ex1) (calculate ex2)
calculate (Minus ex1 ex2)        = Minus (calculate ex1) (calculate ex2)
calculate (Times ex1 ex2)        = Times (calculate ex1) (calculate ex2)
calculate (Div ex1 ex2)          = Div   (calculate ex1) (calculate ex2)

calculate (Gt ex1 ex2)           = Gt  (calculate ex1) (calculate ex2)
calculate (Geq ex1 ex2)          = Geq (calculate ex1) (calculate ex2)
calculate (Lt ex1 ex2)           = Lt  (calculate ex1) (calculate ex2)
calculate (Leq ex1 ex2)          = Leq (calculate ex1) (calculate ex2)


calculate st = st

optimizeStatement :: Statement -> Statement
optimizeStatement (Semicolon st1 st2) = Semicolon (optimizeStatement st1) (optimizeStatement st2)
optimizeStatement (Read  ex)          = Read (calculate ex)
optimizeStatement (Write ex)          = Write (calculate ex)
optimizeStatement (IfC ex st1 st2)    = IfC (calculate ex) (optimizeStatement st1) (optimizeStatement st2)
optimizeStatement (While ex st)       = While (calculate ex) (optimizeStatement st)
optimizeStatement (Assign ex1 ex2)    = Assign (calculate ex1) (calculate ex2)
optimizeStatement st = st

module Parser (parseExpr) where

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
    <|>skipSt
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

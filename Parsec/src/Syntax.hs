module Syntax where

data Expr = Var String
          | Numeral Integer
          | Plus Expr Expr
          | Minus Expr Expr
          | Times Expr Expr
          | Div Expr Expr
          | Mod Expr Expr
          | Eq Expr Expr
          | Neq Expr Expr
          | Gt Expr Expr
          | Geq Expr Expr
          | Lt Expr Expr
          | Leq Expr Expr
          | And Expr Expr
          | Or Expr Expr
          deriving (Eq)

instance Show Expr where
     show (Var name)      = name
     show (Numeral name)  = show name
     show (Plus ex1 ex2)  = show ex1 ++ " + "  ++ show ex2
     show (Minus ex1 ex2) = show ex1 ++ " - "  ++ show ex2
     show (Times ex1 ex2) = show ex1 ++ " * "  ++ show ex2
     show (Div ex1 ex2)   = show ex1 ++ " / "  ++ show ex2
     show (Mod ex1 ex2)   = show ex1 ++ " % "  ++ show ex2
     show (Eq ex1 ex2)    = show ex1 ++ " == " ++ show ex2
     show (Neq ex1 ex2)   = show ex1 ++ " != " ++ show ex2
     show (Gt ex1 ex2)    = show ex1 ++ " > "  ++ show ex2
     show (Geq ex1 ex2)   = show ex1 ++ " >= " ++ show ex2
     show (Lt ex1 ex2)    = show ex1 ++ " < "  ++ show ex2
     show (Leq ex1 ex2)   = show ex1 ++ " <= " ++ show ex2
     show (And ex1 ex2)   = show ex1 ++ " && " ++ show ex2
     show (Or ex1 ex2)    = show ex1 ++ " || " ++ show ex2

data Statement = Assign Expr Expr
               | IfC Expr Statement Statement 
               | Write Expr
               | Read Expr
               | While Expr Statement
               | Semicolon Statement Statement
               | Skip 
               deriving (Eq, Show)
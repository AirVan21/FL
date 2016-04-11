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
          deriving (Show)

data Statement = Assign Expr Expr
               | IfC Expr Statement Statement 
               | Write Expr
               | Read Expr
               | While Expr Statement
               | Semicolon Statement Statement
               | Skip deriving (Show)

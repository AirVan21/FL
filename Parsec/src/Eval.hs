module Eval (eval) where

import Control.Monad.Except

import Syntax

eval :: Expr -> Either String Integer
eval (Numeral n)  = return n
eval (Plus a b)   = binaryOp (+) a b
eval (Minus a b)  = binaryOp (-) a b
eval (Times a b)  = binaryOp (*) a b
eval (Div a b)    = binaryOp div a b
eval (Mod a b)    = binaryOp mod a b


binaryOp :: (Integer -> Integer -> Integer) -> Expr -> Expr -> Either String Integer
binaryOp op a b = do x <- eval a
                     y <- eval b
                     return $ op x y

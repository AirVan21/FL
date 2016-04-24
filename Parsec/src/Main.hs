module Main where

import System.IO

import Syntax
import Eval
import Parser

import Data.Tree.Pretty
import Data.Tree

evaluate :: String -> String
evaluate input =
  case parseExpr input of
    Left err -> "Syntax error: " ++ show err
    Right stmt -> buildTree stmt

buildTree :: Statement -> String
buildTree stmt = (drawVerticalTree $ buildTree' stmt) ++ "\n\n" ++ (parseTree $ buildTree' stmt)
        where
            buildTree' :: Statement -> Tree String
            buildTree' (Skip)              = Node "skip " []
            buildTree' (Assign exp1 exp2)  = Node (show exp1 ++ " := " ++ show exp2) []
            buildTree' (IfC exp1 st1 st2)  = Node ("if " ++ show exp1) [buildTree' st1, buildTree' st2]
            buildTree' (Write exp1)        = Node ("write " ++ show exp1) []
            buildTree' (Read exp1)         = Node ("read " ++ show exp1) []
            buildTree' (While exp1 st1)    = Node ("while " ++ show exp1) [buildTree' st1]
            buildTree' (Semicolon st1 st2) = Node ("; ") [buildTree' st1, buildTree' st2]

parseTree :: Tree String -> String
parseTree (Node label []) = label
parseTree (Node label (x:xs)) | null xs           = label ++ " do " ++ (parseTree x) 
                              | label == "; "     = (parseTree x) ++ label ++ (parseTree $ head xs)
                              | otherwise         = label ++ " then " ++ (parseTree x) ++ " else " ++ (parseTree $ head xs)
repl :: IO ()
repl = do
  putStr "> "
  hFlush stdout
  input <- getLine
  if input == ":q"
    then return ()
    else putStrLn (evaluate input) >> repl

main :: IO ()
main = do
  putStrLn "Type :q to quit"
  repl

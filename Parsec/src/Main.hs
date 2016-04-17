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
buildTree stmt = drawVerticalTree $ buildTree' stmt
        where
            buildTree' :: Statement -> Tree String
            buildTree' (Skip) = Node "Skip" []
            buildTree' (Assign exp1 exp2)  = Node ("Assign " ++ show exp1 ++ show exp2) []
            buildTree' (IfC exp1 st1 st2)  = Node ("If " ++ show exp1) [buildTree' st1, buildTree' st2]
            buildTree' (Write exp1)        = Node ("Write " ++ show exp1) []
            buildTree' (Read exp1)         = Node ("Read " ++ show exp1) []
            buildTree' (While exp1 st1)    = Node ("While " ++ show exp1) [buildTree' st1]
            buildTree' (Semicolon st1 st2) = Node (";") [buildTree' st1, buildTree' st2]

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

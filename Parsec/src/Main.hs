module Main where

import System.IO

import Syntax
import Eval
import Parser

evaluate :: String -> String
evaluate input =
  case parseExpr input of
    Left err -> "Syntax error: " ++ show err
    Right stmt -> show stmt

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

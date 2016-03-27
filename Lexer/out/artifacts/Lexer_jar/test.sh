#! /bin/bash

echo "if x > 1 then read y else skip"
java -cp Lexer.jar Main "if x > 1 then read y else skip"
echo

echo "read x; if y + 1 == x then write y else skip"
java -cp Lexer.jar Main "read x; if y + 1 == x then write y else skip"
echo

echo "read x; write y; while 10 >= 5 do x:= x + y"
java -cp Lexer.jar Main "read x; write y; while 10 >= 5 do x:= x + y"
echo 

echo "x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
java -cp Lexer.jar Main "x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
echo 



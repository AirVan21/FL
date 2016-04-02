# /bin/bash

mvn clean install package

echo "if x > 1 then read y else skip"
java -jar target/lexer-1.0.jar "if x > 1 then read y else skip"
echo

echo "read x; if y + 1 == x then write y else skip"
java -jar target/lexer-1.0.jar "read x; if y + 1 == x then write y else skip"
echo

echo "read x; write y; while 10 >= 5 do x:= x + y"
java -jar target/lexer-1.0.jar "read x; write y; while 10 >= 5 do x:= x + y"
echo 

echo "x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
java -jar target/lexer-1.0.jar "x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
echo 
#! /bin/bash

mvn compile

echo "if x > 1 then read y else skip"
mvn exec:java -Dexec.mainClass="Main" -Dexec.arguments="if x > 1 then read y else skip"
echo

echo "read x; if y + 1 == x then write y else skip"
mvn exec:java -Dexec.mainClass="Main" -Dexec.arguments="read x; if y + 1 == x then write y else skip"
echo

echo "read x; write y; while 10 >= 5 do x:= x + y"
mvn exec:java -Dexec.mainClass="Main" -Dexec.arguments="read x; write y; while 10 >= 5 do x:= x + y"
echo 

echo "x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
mvn exec:java -Dexec.mainClass="Main" -Dexec.arguments="x := 7  ; if x <= 20 then write 7 * 2 else read 12 || x"
echo 



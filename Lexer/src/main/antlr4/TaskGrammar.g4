grammar TaskGrammar;

/* ============================================================  */


IF   : 'if';
THEN : 'then';
ELSE : 'else';

DO    : 'do';
WHILE : 'while';
SKIP  : 'skip';
WRITE : 'write';
READ  : 'read';

AND : '&&';
OR  : '||';

GT  : '>';
GE  : '>=';
LT  : '<';
LE  : '<=';
EQ  : '==';
NEQ : '!=';

PLUS  : '+';
MINUS : '-';
MULT  : '*';
DIV   : '/';
MOD   : '%';

ASSIGN    : ':=';
SEMICOLON : ';';

VARIABLE : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [1-9][0-9]*;
SPACE : [ \r\t\u000C\n]+ -> skip;

/* ============================================================  */

operation : comparison_op | arithmetic_op;
comparison_op : GT | GE | LT | LE | EQ;
arithmetic_op : PLUS | MINUS | MULT | DIV | MOD;

expression : NUMBER | VARIABLE | expression operation expression;

assignment_operator : VARIABLE ASSIGN expression;
write_operator : WRITE expression;
read_operator  : READ expression;

statement : SKIP | assignment_operator | statement SEMICOLON statement | write_operator | read_operator |
            WHILE expression DO  statement | IF expression THEN statement ELSE statement;

program : statement EOF;





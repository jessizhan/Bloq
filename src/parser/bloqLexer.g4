// Referenced some grammar from
// https://github.com/antlr/grammars-v4/


/*** Commands ***\

antlr4 .\bloq*.g4 -visitor -o ./gen/
javac bloq*.java
grun bloq program -gui

canvas: 100, 100

watershape:
001;
010;
100;

lavax: 10

define draw(x,y){
    block: water
    start: x, 10
    shape: watershape

    block: lava
    start: lavax, y
    shape: 
    11;
    01;

    block: land
    start: 10, 10    
}

for i : 1 to 10 {
    if (i % 2 == 1) {
        call draw(i, i)
    }
}

^Z
\****************/

// Lexer
lexer grammar bloqLexer;
@header{
package parser.gen;
}
CANVAS: 'canvas';
BLOCK: 'block';
START: 'start';
FOR: 'for';
SHAPE:'shape';
IF:'if';
TO: 'to';
DEFINE: 'define';
CALL: 'call';
ELSE: 'else';

EQUAL: '==';
GREATER: '>';
GREATEREQ: '>=';
LESS: '<';
LESSRQ: '<=';
NOTEQ: '!=';

AND: '&&';
OR: '||';
NOT: '!';

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

NUMBER: '-'? [0-9]+;
TEXT: [a-zA-Z0-9]+; // no underscore
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
OPENCURLY: '{';
CLOSECURLY: '}';
OPENBRACKET: '(';
CLOSEBRACKET: ')';
NEWLINE: '\n';
WS: [\r\t ]+ -> skip;

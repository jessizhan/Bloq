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
\****************/

//  Parser
parser grammar bloqParser;
@header{
package parser.gen;
}
options { tokenVocab=bloqLexer;}
program: statement+;
statement: ((canvas_statement | simple_assignment_statement | shape_assignment_statement | define_statement | call_statement | block_statement | loop_statement | if_statement) (NEWLINE+| <EOF>));

canvas_statement: CANVAS COLON NUMBER COMMA NUMBER;
simple_assignment_statement: variable COLON expression;
shape_assignment_statement: variable COLON NEWLINE shape_row+;

call_statement: CALL variable OPENBRACKET args CLOSEBRACKET;
define_statement: DEFINE variable OPENBRACKET args CLOSEBRACKET OPENCURLY NEWLINE* (in_function_statement NEWLINE+)+ CLOSECURLY;
in_function_statement: (simple_assignment_statement | shape_assignment_statement | block_statement | call_statement | loop_statement | if_statement );
// block_statement: BLOCK COLON variable (NEWLINE block_substatement)*;
// block_substatement: (block_start_statement | block_shape_statement | block_extra_statement); // allowing multiple block initializations
block_statement: BLOCK COLON args (NEWLINE (block_start_statement | block_shape_statement))*;

// This way you can include multiple blocks in one pattern
// But it also means each block must be separted by a newline
block_start_statement: START COLON expression COMMA expression;
block_shape_statement: SHAPE COLON NEWLINE? (shape_row+ | variable);

loop_statement: FOR OPENBRACKET? variable COLON value TO value CLOSEBRACKET? OPENCURLY NEWLINE* (in_loop_statement NEWLINE+)+ CLOSECURLY;
in_loop_statement: (simple_assignment_statement | shape_assignment_statement | block_statement | call_statement | loop_statement | if_statement);

if_statement: IF OPENBRACKET? (condition|linked_condition) CLOSEBRACKET? OPENCURLY NEWLINE* (in_if_statement NEWLINE+)+ CLOSECURLY else_statement?;
else_statement: ELSE OPENCURLY NEWLINE* (in_if_statement NEWLINE+)+ CLOSECURLY; // I think its ok? to use in_if
// Enabled nested if statements and loop if if statemetns
in_if_statement: (simple_assignment_statement | shape_assignment_statement | block_statement | call_statement | loop_statement | if_statement );  // ik its the same but its safer this way, more customizable too

linked_condition: (condition (logic_operator condition)+);
condition: NOT? expression comparator expression;
expression: (value (operator value)*); // Not allowing parentesses atm 

args: (value (COMMA value)*);
shape_row: NEWLINE? NUMBER SEMICOLON;
variable: TEXT;
value: NUMBER | TEXT;
comparator: (EQUAL | GREATER | GREATEREQ | LESS | LESSRQ | NOTEQ) ;
operator: (PLUS | MINUS | MULTIPLY | DIVIDE | MODULO);
logic_operator: (AND | OR);
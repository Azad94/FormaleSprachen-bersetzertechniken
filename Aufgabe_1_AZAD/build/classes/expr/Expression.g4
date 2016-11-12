/**
 * Define a grammar called Expr
 */
grammar Expression;

r  : INT ;         // start with an integer

PLUS : '+' ;
MINUS : '-' ;
UMINUS : '#' ;
MUL : '*' ;
DIV : '/' ;
POW : '^' ;
INT : DIGIT+ ;
// Regular expressions used in token definitions
fragment DIGIT : ('0'..'9') ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

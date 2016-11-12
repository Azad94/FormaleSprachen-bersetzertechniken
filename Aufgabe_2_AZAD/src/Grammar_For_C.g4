/**
 * Define a grammar called Grammar_For_C 
 * Wihle und Do While erweiterung
 * JUNIT Test (JUNIT 5)
 * JUNIT Params Runner 
 * (TESTNG)
 */
 grammar Grammar_For_C;
r  : allTokens+ ;        	// match keyword hello followed by an identifier

allTokens: 
OPERATOR | OPERAND | IGNORE;

OPERATOR:  
RESERVED | TYPE_QUAL | SCSPEC | OPERATORS;

IGNORE: 
IGNORESYMBOLS2 | INCLUDE |  ALOTOFWHITESPACE | COMMENT | LINE_COMMENT | IGNORESYMBOLS;

OPERAND:  
TYPESPEC | IDENTIFIER | INT | FLOAT | STRING | CONSTANT;

RESERVED : 
'if' WHITESPACE* '(' | 'if' 
| 'asm' | 'break'| 'case'| 'class'
| 'continue'| 'default'| 'delete'
| 'while' WHITESPACE* '('| 'else'
| 'enum' | 'for' WHITESPACE* '(' 
|'goto'|  'new'| 'operator'| 'private'
| 'protected'| 'public'| 'return'|'sizeof'
| 'struct'| 'switch' WHITESPACE* '('
| 'this'| 'union'|'namespace'| 'using'
| 'try'| 'catch'|'throw'| 'const_cast'
| 'static_cast'| 'dynamic_cast'
| 'reiznterpret_cast'|'typeid'| 'template'
| 'explicit'| 'true'| 'false'| 'typename';

OPERATORS : 
'!'|'!='|'%'|'%='|'&'|'&&'|'&='|'*'|'*='
|'+'|'++'|'+='|','|'-'|'--'|'-='|'->'|'...'|'/'
|'/='|'::'|'<'|'<<'|'<<='|'<='|'=='|'>'|'>='|'>>'
|'>>='|'?'|'['|'^'|'^='|'{'|'||'|'='|'~'|';' | '(' ;

TYPE_QUAL: 
'const'|'friend'|'volatile';
 
SCSPEC : 
'auto'|'extern'|'inline'|'register'|'static'|'typedef'|'virtual'|'mutable';

IGNORESYMBOLS2 : 
'do';

CONSTANT: 
CAPITALLETTERS(CAPITALLETTERS|DIGITS)* | DIGITS+ | FLOAT ;

TYPESPEC: 'bool'|'char'|'double'|'float'|'int'|'long'|'short'|'signed'|'unsigned'|'void';

IDENTIFIER: LETTER(LETTER|DIGITS)*;

FLOAT: DIGITS+ '.' DIGITS* // match 1. 39. 3.14159 etc...
| '.' DIGITS+ // match .1 .14159
| '-' DIGITS+ '.' DIGITS* 
;

STRING : '"' .*? '"' | '\'' .*? '\'' ;
INT : DIGITS+;				// match 1 or more digits
LINE_COMMENT : '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip;
INCLUDE: ('#INCLUDE'.*? '\n' | '#include'.*? '\n') -> skip;
ALOTOFWHITESPACE: (WHITESPACE+) -> skip;
IGNORESYMBOLS: ('}' |')'| ']' | ':' | '\\' |['] ) -> skip;
fragment LETTER: [a-zA-Z_];
fragment CAPITALLETTERS: [A-Z_];
fragment DIGITS : [0-9] ;	// match 1 digit
fragment WHITESPACE : [ \t\r\n] ;
 
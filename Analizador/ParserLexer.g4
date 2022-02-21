lexer grammar ParserLexer;

LP:      '(';
RP:      ')';
L_LLAVE: '{';
R_LLAVE: '}';


SYSTEM:     'system';
OUT:        'out';
PRINTLN:    'println';
INTTYPE:    'int';
FLOATTYPE:  'float';
STRINGTYPE: 'string';
BOOLTYPE:   'boolean';

IF:     'if';
ELSE:   'else';
FOR:    'for';


PUNTO:  '.';
COMA:   ',';
PTCOMA: ';';

AND:        '&&';
OR:         '||';
NOT:        '!' ;
IGUAL:      '=';
DIFERENTE:  '!=';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
MAYOR:      '>';
MENOR:      '<';
MUL:        '*' ;
DIV:        '/' ;
ADD:        '+' ;
SUB:        '-' ;


NUMBER:     [0-9]+;
FLOAT:      [0-9]+[.][0-9]+;
STRING:     '"'~["]*'"';
ID:         [a-zA-Z_] [a-zA-Z0-9_]*;
WHITESPACE: [ \r\n\t]+ -> skip;


TRUE:   'true';
FALSE:  'false';

fragment
ESC_SEQ:   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ');

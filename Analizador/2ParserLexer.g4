lexer grammar ParserLexer;


// Tokens



LP       : '(';
RP       : ')';
L_LLAVE  : '{';
R_LLAVE  : '}';
L_CORCH  : '[';
R_CORCH  : ']';


PRINTLN:   'println!';


IF_TOK:     'if';
ELSE:       'else';

LET:        'let';
CLASS:      'class';
NEW_:       'new';
MAIN:       'main';
PRIVATE:    'private';
PUBLIC:     'public';
STATIC:     'static';
STRINGARGS: 'String';
RETURN_P:   'return';

INTTYPE:    'int';
FLOATTYPE:  'float';
STRINGTYPE: 'string';
VOIDTYPE:   'void';
BOOLTYPE:   'boolean';


PUNTO       : '.';
COMA        : ',';
PTCOMA      : ';';

AND:        '&&';
OR:         '||';
NOT:         '!' ;
IGUAL:     '=';
IGUAL_IGUAL:     '==';
DIFERENTE: '!=';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
MAYOR: '>';
MENOR: '<';
MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;


NUMBER: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';
TRUE: 'true';
FALSE: 'false';


ID: [a-zA-Z_] [a-zA-Z0-9_]*;


WHITESPACE: [ \r\n\t]+ -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

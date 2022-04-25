lexer grammar ParserLexer;


// Tokens



LP       : '(';
RP       : ')';
L_LLAVE  : '{';
R_LLAVE  : '}';
L_CORCH  : '[';
R_CORCH  : ']';
GUION_BAJO: '_';


PRINTLN:   'println!';

VEC:        'vec!';
VEC_VACIO:  'Vec';

IF_TOK:     'if';
ELSE:       'else';
MATCH:      'match';

WHILE:      'while';
LOOP:       'loop';
FOR:        'for';
IN:         'in';


MOD_:       'mod';
MUT:        'mut';
FN:          'fn';
LET:        'let';
CLASS:      'class';
NEW_:       'new';
MAIN:       'main';
PRIVATE:    'private';
PUB:     'pub';
STATIC:     'static';
RETURN_P:   'return';
BREAK_P:    'break';
CONTINUE_P: 'continue';
ABS:        'abs';
SQRT:        'sqrt';
TO_STRING:   'to_string';
CLONE:       'clone';
POW:         'pow';
POWF:         'powf';

INTTYPE:    'i64';
FLOATTYPE:  'f64';
STRINGTYPE: 'String';
STRTYPE:    '&str';
CHARTYPE:   'char';
VOIDTYPE:   'void';
BOOLTYPE:   'boolean';
USIZETYPE:  'usize';


PUNTO       : '.';
COMA        : ',';
PTCOMA      : ';';
DOSPUNTOS   : ':';

AND:        '&&';
OR_CASE:    '|';
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
MOD: '%' ;
// Tipos

NUMBER: [0-9]+;
USIZE: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';
CHAR: '\''~["]*'\'';
TRUE: 'true';
FALSE: 'false';


ID: [a-zA-Z_] [a-zA-Z0-9_]*;


WHITESPACE: [ \r\n\t]+ -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

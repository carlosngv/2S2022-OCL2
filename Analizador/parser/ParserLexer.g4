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

MUT:        'mut';
LET:        'let';
CLASS:      'class';
NEW_:       'new';
MAIN:       'main';
PRIVATE:    'private';
PUBLIC:     'public';
STATIC:     'static';
RETURN_P:   'return';
BREAK_P:    'break';
CONTINUE_P: 'continue';
ABS:        'abs';
SQRT:        'sqrt';
TO_STRING:   'to_string';
CLONE:       'clone';

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

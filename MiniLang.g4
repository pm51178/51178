grammar MiniLang;

// Punto de entrada
programa : instruccion+ ;

instruccion : repeticion ;

repeticion : 'repetir' '{' sentencia+ '}' 'hasta' condicion ';' ;

sentencia : (salida | terminar)+ ;

salida : 'imprimir' '(' CADENA ')' ';' ;

terminar : 'salir' ';' ;

condicion : 'verdadero' | 'falso' ;

// Tokens
CADENA : '"' (~["\r\n])* '"' ;
LETRA : [a-zA-Z] ;
DIGITO : [0-9] ;
SIMBOLO : '.' | ',' | '!' | '?' | ':' | ';' ;

// Ignorar espacios y saltos de línea
WS : [ \t\r\n]+ -> skip;
grammar Gramatica;
//TODO:
// CRIAR O FOR
// Precedência de exp matemática
// Verificação de tipos (atribuição x operação)
// Leitura (Scanner)
// Impressão
// Verificar se a variavél já foi iniciada

// Ínicio e fim de código principal
init: iniciar corpo finalizar;
iniciar: 'iniciar';
finalizar: 'finalizar';

// Pular espaços em branco
WS: [ \t\r\n]+ -> skip;

// Corpo do código
corpo: sentenca*;
sentenca : atribuicao | se | enquanto; 

// Atribuicao
atribuicao : ID ATRIBUICAO expressao FIM_LINHA;

expressao
 : NAO expressao
 | expressao (MULT | DIV) expressao
 | expressao (SOMA | SUB) expressao
 | expressao (MENOR_IGUAL | MAIOR_IGUAL | MENOR | MAIOR) expressao
 | expressao (IGUAL | NAO_IGUAL) expressao
 | expressao E expressao
 | expressao OU expressao
 | reservado
 ;

reservado
 : APAREN expressao FPAREN
 | (INTEIRO | FLUTUANTE)
 | (VERDADEIRO | FALSO)
 | ID 
 | TEXTO
 | NULO
 ;

se
: SE bloco_condicao (SENAO bloco_expressao)?
;

bloco_condicao
: expressao bloco_expressao
;
 
enquanto: ENQUANTO expressao bloco_expressao;

bloco_expressao: ACHAVE corpo FCHAVE | sentenca;

FIM_LINHA: ';';
ATRIBUICAO: '=';
MULT: '*';
DIV: '/';
SOMA: '+';
SUB: '-';
NULO: ' ';
NAO: '!';
APAREN: '(';
FPAREN: ')';
ACHAVE: '{';
FCHAVE: '}';
MENOR_IGUAL: '<=';
MAIOR_IGUAL: '>=';
MENOR: '<';
MAIOR: '>';
IGUAL: '==';
NAO_IGUAL: '!=';
E: '&&';
OU: '||';
SE: 'se';
SENAO: 'senao';
VERDADEIRO: 'verdadeiro';
FALSO: 'falso';
TEXTO: '"' (~["\r\n] | '""')* '"'; //SE DER MERDA VOLTA AQUI //FOI DE BOA
ENQUANTO: 'enquanto';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]* //[a-z][a-zA-Z0-9]+
 ;

FLUTUANTE
: [0-9]+ '.' [0-9]*
;

INTEIRO
 : [0-9]+
 ;


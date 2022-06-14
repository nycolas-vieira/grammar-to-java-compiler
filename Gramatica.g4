grammar Gramatica;
//TODO:
// Precedência de exp matemática -- VERIFICAR NO JAVA
// Verificação de tipos (atribuição x operação) // TRADUTOR
// Verificar se a variavél já foi iniciada // TRADUTOR

// Ínicio e fim de código principal
init: iniciar corpo finalizar;
iniciar: 'iniciar';
finalizar: 'finalizar';

// Pular espaços em branco
WS: [ \t\r\n]+ -> skip;

// Corpo do código
corpo: sentenca*;
sentenca
  : atribuicao FIM_LINHA
  | se
  | enquanto
  | para
  | ler FIM_LINHA
  | imprimir FIM_LINHA
  ;

// Atribuicao
atribuicao: declarar_variavel | atribuir_valor;
declarar_variavel: tipovar ID ATRIBUICAO expressao;
atribuir_valor: ID ATRIBUICAO expressao;

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

se: SE bloco_condicao (SENAO bloco_expressao)?;

bloco_condicao: expressao bloco_expressao;

enquanto: ENQUANTO expressao bloco_expressao;

bloco_expressao: ACHAVE corpo FCHAVE | sentenca;

para: PARA APAREN declarar_variavel SEPERADOR_ATRIBUTO expressao SEPERADOR_ATRIBUTO atribuir_valor FPAREN bloco_expressao;

ler: LER expressao;

imprimir: IMPRIMIR expressao;

tipovar
: TV_INTEIRO
| TV_BOOLEANO
| TV_TEXTO
| TV_DECIMAL
;

TV_INTEIRO: 'inteiro';
TV_BOOLEANO: 'booleano';
TV_TEXTO: 'texto';
TV_DECIMAL: 'decimal';
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
TEXTO: '"' (~["\r\n] | '""')* '"';
ENQUANTO: 'enquanto';
SEPERADOR_ATRIBUTO: ',';
LER: 'ler';
IMPRIMIR: 'imprimir';
PARA: 'para';

ID: [a-zA-Z_] [a-zA-Z_0-9]*; //[a-z][a-zA-Z0-9]+

FLUTUANTE: [0-9]+ '.' [0-9]*;

INTEIRO : [0-9]+;


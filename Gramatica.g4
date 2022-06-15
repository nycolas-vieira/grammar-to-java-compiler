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
  : atribuicao fim_linha
  | se_condicao
  | enquanto_loop
  | para_loop
  | ler_fun fim_linha
  | imprimir_fun fim_linha
  ;

// Atribuicao
atribuicao: declarar_variavel | atribuir_valor;
declarar_variavel: tipovar id atribuicao_sinal expressao;
atribuir_valor: id atribuicao_sinal expressao;

expressao
 : nao expressao
 | expressao (mult | div) expressao
 | expressao (soma | sub) expressao
 | expressao (menor_igual | maior_igual | menor | maior) expressao
 | expressao (igual | nao_igual) expressao
 | expressao e expressao
 | expressao ou expressao
 | reservado
 ;

reservado
 : aparen expressao fparen
 | (inteiro | flutuante)
 | (verdadeiro | falso)
 | id
 | texto
 | nulo
 ;

se_condicao: se bloco_condicao (senao bloco_expressao)?;

bloco_condicao: expressao bloco_expressao;

enquanto_loop: enquanto expressao bloco_expressao;

bloco_expressao: achave corpo fchave | sentenca;

para_loop: para aparen declarar_variavel separador_atributo expressao separador_atributo atribuir_valor fparen bloco_expressao;

ler_fun: id atribuicao_sinal ler aparen fparen;

imprimir_fun: imprimir expressao;

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
fim_linha: FIM_LINHA;

ATRIBUICAO: '=';
atribuicao_sinal: ATRIBUICAO;

MULT: '*';
mult: MULT;

DIV: '/';
div: DIV;

SOMA: '+';
soma: SOMA;

SUB: '-';
sub: SUB;

NULO: ' ';
nulo: NULO;

NAO: '!';
nao: NAO;

APAREN: '(';
aparen: APAREN;

FPAREN: ')';
fparen: FPAREN;

ACHAVE: '{';
achave: ACHAVE;

FCHAVE: '}';
fchave: FCHAVE;

MENOR_IGUAL: '<=';
menor_igual: MENOR_IGUAL;

MAIOR_IGUAL: '>=';
maior_igual: MAIOR_IGUAL;

MENOR: '<';
menor: MENOR;

MAIOR: '>';
maior: MAIOR;

IGUAL: '==';
igual: IGUAL;

NAO_IGUAL: '!=';
nao_igual: NAO_IGUAL;

E: '&&';
e: E;

OU: '||';
ou: OU;

SE: 'se';
se: SE;

SENAO: 'senao';
senao: SENAO;

VERDADEIRO: 'verdadeiro';
verdadeiro: VERDADEIRO;

FALSO: 'falso';
falso: FALSO;

TEXTO: '"' (~["\r\n] | '""')* '"';
texto: TEXTO;

ENQUANTO: 'enquanto';
enquanto: ENQUANTO;

SEPERADOR_ATRIBUTO: ',';
separador_atributo: SEPERADOR_ATRIBUTO;

LER: 'ler';
ler: LER;

IMPRIMIR: 'imprimir';
imprimir: IMPRIMIR;

PARA: 'para';
para: PARA;

ID: [a-zA-Z_] [a-zA-Z_0-9]*; //[a-z][a-zA-Z0-9]+
id: ID;

FLUTUANTE: [0-9]+ '.' [0-9]*;
flutuante: FLUTUANTE;

INTEIRO : [0-9]+;
inteiro: INTEIRO;

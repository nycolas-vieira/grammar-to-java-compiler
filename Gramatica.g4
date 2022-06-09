grammar Gramatica;

// 1
init: iniciar (linha_codigo)+ finalizar;

iniciar: 'iniciar';

finalizar: 'finalizar';

// 2 
linha_codigo: comando | expressao | variavel;

comando: cmd_leitura | cmd_escrita;

expressao: expr_repeticao | expr_decisao;

variavel: declarar_variavel | atribuir_variavel;

// 3
cmd_leitura: 'a';

cmd_escrita: 'b';

expr_repeticao: 'b';

expr_decisao: 'b';

declarar_variavel: 'b';

atribuir_variavel: 'b';
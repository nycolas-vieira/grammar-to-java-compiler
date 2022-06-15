grammar Gramatica;
// Inicio e fim do programa
init: start body finish;
start: 'start';
finish: 'finish';

// Pula espaços em branco do código
WS: [ \t\r\n]+ -> skip;

// Corpo do código
body: sentence*;
sentence:
	assignment end_line
	| if_condition
	| while_loop
	| for_loop
	| read_function end_line
	| print_function end_line;

// Declaração/Atribuição das variáveis
assignment: declare_variable | assign_value;
declare_variable: type_var id assignment_signal exp;
assign_value: id assignment_signal exp;

exp:
	not exp
	| exp (mult | div) exp
	| exp (sum | sub) exp
	| exp (lesser_equal | greater_equal | lesser | greater) exp
	| exp (equal | not_equal) exp
	| exp and exp
	| exp or exp
	| reserved;

reserved:
	open_parenthesis exp close_parenthesis
	| (integer | decimal)
	| boolean_val
	| id
	| text
	| null_type;

//Bloco IF
if_condition: if_stmt condition_block (else_stmt exp_block)?;

condition_block: exp exp_block;

exp_block: OPEN_BRACKET body CLOSE_BRACKET | sentence;

//BLOO FOR
for_loop:
	for_stmt open_parenthesis declare_variable attribute_separator exp attribute_separator
		incrementer_for close_parenthesis exp_block;

incrementer_for: id incrementer_type;

incrementer_type: decrement | increment;

//Bloco WHILE
while_loop: while_stmt exp exp_block;
//FUNÇÃO LEIA
read_function:
	id assignment_signal open_parenthesis close_parenthesis;

print_function: print exp;

type_var:
	TYPE_INTEGER
	| TYPE_BOOLEAN
	| TYPE_TEXT
	| TYPE_DECIMAL;

TYPE_INTEGER: 'integer';
TYPE_BOOLEAN: 'boolean';
TYPE_TEXT: 'text';
TYPE_DECIMAL: 'decimal';

boolean_val: true_type | false_type;

decrement: '--';
increment: '++';

END_LINE: ';';
end_line: END_LINE;

ASSIGNMENT: '=';
assignment_signal: ASSIGNMENT;

MULT: '*';
mult: MULT;

DIV: '/';
div: DIV;

SUM: '+';
sum: SUM;

SUB: '-';
sub: SUB;

NULL: ' ';
null_type: NULL;

NOT: '!';
not: NOT;

OPEN_PARENTHESIS: '(';
open_parenthesis: OPEN_PARENTHESIS;

CLOSE_PARENTHESIS: ')';
close_parenthesis: CLOSE_PARENTHESIS;

OPEN_BRACKET: '{';
open_bracket: OPEN_BRACKET;

CLOSE_BRACKET: '}';
close_bracket: CLOSE_BRACKET;

LESSER_EQUAL: '<=';
lesser_equal: LESSER_EQUAL;

GREATER_EQUAL: '>=';
greater_equal: GREATER_EQUAL;

LESSER: '<';
lesser: LESSER;

GREATER: '>';
greater: GREATER;

EQUAL: '==';
equal: EQUAL;

NOT_EQUAL: '!=';
not_equal: NOT_EQUAL;

AND: '&&';
and: AND;

OR: '||';
or: OR;

IF: 'if';
if_stmt: IF;

ELSE: 'else';
else_stmt: ELSE;

TRUE: 'true';
true_type: TRUE;

FALSE: 'false';
false_type: FALSE;

TEXT: '"' (~["\r\n] | '""')* '"';
text: TEXT;

WHILE: 'while';
while_stmt: WHILE;

ATTRIBUTE_SEPARATOR: ',';
attribute_separator: ATTRIBUTE_SEPARATOR;

READ: 'read';
read: READ;

PRINT: 'print';
print: PRINT;

FOR: 'for';
for_stmt: FOR;

ID: [a-zA-Z_] [a-zA-Z_0-9]*; //[a-z][a-zA-Z0-9]+
id: ID;

DECIMAL: [0-9]+ '.' [0-9]*;
decimal: DECIMAL;

INTEGER: [0-9]+;
integer: INTEGER;

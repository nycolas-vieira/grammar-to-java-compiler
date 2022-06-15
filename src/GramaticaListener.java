// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(GramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(GramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GramaticaParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GramaticaParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#finish}.
	 * @param ctx the parse tree
	 */
	void enterFinish(GramaticaParser.FinishContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#finish}.
	 * @param ctx the parse tree
	 */
	void exitFinish(GramaticaParser.FinishContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(GramaticaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(GramaticaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GramaticaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GramaticaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_variable(GramaticaParser.Declare_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declare_variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_variable(GramaticaParser.Declare_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void enterAssign_value(GramaticaParser.Assign_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assign_value}.
	 * @param ctx the parse tree
	 */
	void exitAssign_value(GramaticaParser.Assign_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(GramaticaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(GramaticaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(GramaticaParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(GramaticaParser.ReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(GramaticaParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(GramaticaParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(GramaticaParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(GramaticaParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exp_block}.
	 * @param ctx the parse tree
	 */
	void enterExp_block(GramaticaParser.Exp_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exp_block}.
	 * @param ctx the parse tree
	 */
	void exitExp_block(GramaticaParser.Exp_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(GramaticaParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(GramaticaParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#incrementer_for}.
	 * @param ctx the parse tree
	 */
	void enterIncrementer_for(GramaticaParser.Incrementer_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#incrementer_for}.
	 * @param ctx the parse tree
	 */
	void exitIncrementer_for(GramaticaParser.Incrementer_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#incrementer_type}.
	 * @param ctx the parse tree
	 */
	void enterIncrementer_type(GramaticaParser.Incrementer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#incrementer_type}.
	 * @param ctx the parse tree
	 */
	void exitIncrementer_type(GramaticaParser.Incrementer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(GramaticaParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(GramaticaParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#read_function}.
	 * @param ctx the parse tree
	 */
	void enterRead_function(GramaticaParser.Read_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#read_function}.
	 * @param ctx the parse tree
	 */
	void exitRead_function(GramaticaParser.Read_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print_function}.
	 * @param ctx the parse tree
	 */
	void enterPrint_function(GramaticaParser.Print_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print_function}.
	 * @param ctx the parse tree
	 */
	void exitPrint_function(GramaticaParser.Print_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type_var}.
	 * @param ctx the parse tree
	 */
	void enterType_var(GramaticaParser.Type_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type_var}.
	 * @param ctx the parse tree
	 */
	void exitType_var(GramaticaParser.Type_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_val(GramaticaParser.Boolean_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_val(GramaticaParser.Boolean_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(GramaticaParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(GramaticaParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(GramaticaParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(GramaticaParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#end_line}.
	 * @param ctx the parse tree
	 */
	void enterEnd_line(GramaticaParser.End_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#end_line}.
	 * @param ctx the parse tree
	 */
	void exitEnd_line(GramaticaParser.End_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assignment_signal}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_signal(GramaticaParser.Assignment_signalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assignment_signal}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_signal(GramaticaParser.Assignment_signalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(GramaticaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(GramaticaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(GramaticaParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(GramaticaParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(GramaticaParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(GramaticaParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(GramaticaParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(GramaticaParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#null_type}.
	 * @param ctx the parse tree
	 */
	void enterNull_type(GramaticaParser.Null_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#null_type}.
	 * @param ctx the parse tree
	 */
	void exitNull_type(GramaticaParser.Null_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(GramaticaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(GramaticaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#open_parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterOpen_parenthesis(GramaticaParser.Open_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#open_parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitOpen_parenthesis(GramaticaParser.Open_parenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#close_parenthesis}.
	 * @param ctx the parse tree
	 */
	void enterClose_parenthesis(GramaticaParser.Close_parenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#close_parenthesis}.
	 * @param ctx the parse tree
	 */
	void exitClose_parenthesis(GramaticaParser.Close_parenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#open_bracket}.
	 * @param ctx the parse tree
	 */
	void enterOpen_bracket(GramaticaParser.Open_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#open_bracket}.
	 * @param ctx the parse tree
	 */
	void exitOpen_bracket(GramaticaParser.Open_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void enterClose_bracket(GramaticaParser.Close_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#close_bracket}.
	 * @param ctx the parse tree
	 */
	void exitClose_bracket(GramaticaParser.Close_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lesser_equal}.
	 * @param ctx the parse tree
	 */
	void enterLesser_equal(GramaticaParser.Lesser_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lesser_equal}.
	 * @param ctx the parse tree
	 */
	void exitLesser_equal(GramaticaParser.Lesser_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#greater_equal}.
	 * @param ctx the parse tree
	 */
	void enterGreater_equal(GramaticaParser.Greater_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#greater_equal}.
	 * @param ctx the parse tree
	 */
	void exitGreater_equal(GramaticaParser.Greater_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(GramaticaParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(GramaticaParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(GramaticaParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(GramaticaParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(GramaticaParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(GramaticaParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal(GramaticaParser.Not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal(GramaticaParser.Not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(GramaticaParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(GramaticaParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(GramaticaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(GramaticaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(GramaticaParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(GramaticaParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#true_type}.
	 * @param ctx the parse tree
	 */
	void enterTrue_type(GramaticaParser.True_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#true_type}.
	 * @param ctx the parse tree
	 */
	void exitTrue_type(GramaticaParser.True_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#false_type}.
	 * @param ctx the parse tree
	 */
	void enterFalse_type(GramaticaParser.False_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#false_type}.
	 * @param ctx the parse tree
	 */
	void exitFalse_type(GramaticaParser.False_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(GramaticaParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(GramaticaParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(GramaticaParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(GramaticaParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#attribute_separator}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_separator(GramaticaParser.Attribute_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#attribute_separator}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_separator(GramaticaParser.Attribute_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GramaticaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GramaticaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GramaticaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(GramaticaParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(GramaticaParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GramaticaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GramaticaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(GramaticaParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(GramaticaParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GramaticaParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GramaticaParser.IntegerContext ctx);
}
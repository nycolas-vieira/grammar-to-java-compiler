// Generated from Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, TYPE_INTEGER=6, TYPE_BOOLEAN=7, 
		TYPE_TEXT=8, TYPE_DECIMAL=9, END_LINE=10, ASSIGNMENT=11, MULT=12, DIV=13, 
		SUM=14, SUB=15, NULL=16, NOT=17, OPEN_PARENTHESIS=18, CLOSE_PARENTHESIS=19, 
		OPEN_BRACKET=20, CLOSE_BRACKET=21, LESSER_EQUAL=22, GREATER_EQUAL=23, 
		LESSER=24, GREATER=25, EQUAL=26, NOT_EQUAL=27, AND=28, OR=29, IF=30, ELSE=31, 
		TRUE=32, FALSE=33, TEXT=34, WHILE=35, ATTRIBUTE_SEPARATOR=36, READ=37, 
		PRINT=38, FOR=39, ID=40, DECIMAL=41, INTEGER=42;
	public static final int
		RULE_init = 0, RULE_start = 1, RULE_finish = 2, RULE_body = 3, RULE_sentence = 4, 
		RULE_assignment = 5, RULE_declare_variable = 6, RULE_assign_value = 7, 
		RULE_exp = 8, RULE_reserved = 9, RULE_if_condition = 10, RULE_condition_block = 11, 
		RULE_exp_block = 12, RULE_for_loop = 13, RULE_incrementer_for = 14, RULE_incrementer_type = 15, 
		RULE_while_loop = 16, RULE_read_function = 17, RULE_print_function = 18, 
		RULE_type_var = 19, RULE_boolean_val = 20, RULE_decrement = 21, RULE_increment = 22, 
		RULE_end_line = 23, RULE_assignment_signal = 24, RULE_mult = 25, RULE_div = 26, 
		RULE_sum = 27, RULE_sub = 28, RULE_null_type = 29, RULE_not = 30, RULE_open_parenthesis = 31, 
		RULE_close_parenthesis = 32, RULE_open_bracket = 33, RULE_close_bracket = 34, 
		RULE_lesser_equal = 35, RULE_greater_equal = 36, RULE_lesser = 37, RULE_greater = 38, 
		RULE_equal = 39, RULE_not_equal = 40, RULE_and = 41, RULE_or = 42, RULE_if_stmt = 43, 
		RULE_else_stmt = 44, RULE_true_type = 45, RULE_false_type = 46, RULE_text = 47, 
		RULE_while_stmt = 48, RULE_attribute_separator = 49, RULE_read = 50, RULE_print = 51, 
		RULE_for_stmt = 52, RULE_id = 53, RULE_decimal = 54, RULE_integer = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "start", "finish", "body", "sentence", "assignment", "declare_variable", 
			"assign_value", "exp", "reserved", "if_condition", "condition_block", 
			"exp_block", "for_loop", "incrementer_for", "incrementer_type", "while_loop", 
			"read_function", "print_function", "type_var", "boolean_val", "decrement", 
			"increment", "end_line", "assignment_signal", "mult", "div", "sum", "sub", 
			"null_type", "not", "open_parenthesis", "close_parenthesis", "open_bracket", 
			"close_bracket", "lesser_equal", "greater_equal", "lesser", "greater", 
			"equal", "not_equal", "and", "or", "if_stmt", "else_stmt", "true_type", 
			"false_type", "text", "while_stmt", "attribute_separator", "read", "print", 
			"for_stmt", "id", "decimal", "integer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'finish'", "'--'", "'++'", null, "'integer'", "'boolean'", 
			"'text'", "'decimal'", "';'", "'='", "'*'", "'/'", "'+'", "'-'", "' '", 
			"'!'", "'('", "')'", "'{'", "'}'", "'<='", "'>='", "'<'", "'>'", "'=='", 
			"'!='", "'&&'", "'||'", "'if'", "'else'", "'true'", "'false'", null, 
			"'while'", "','", "'read'", "'print'", "'for'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "TYPE_INTEGER", "TYPE_BOOLEAN", "TYPE_TEXT", 
			"TYPE_DECIMAL", "END_LINE", "ASSIGNMENT", "MULT", "DIV", "SUM", "SUB", 
			"NULL", "NOT", "OPEN_PARENTHESIS", "CLOSE_PARENTHESIS", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "LESSER_EQUAL", "GREATER_EQUAL", "LESSER", "GREATER", 
			"EQUAL", "NOT_EQUAL", "AND", "OR", "IF", "ELSE", "TRUE", "FALSE", "TEXT", 
			"WHILE", "ATTRIBUTE_SEPARATOR", "READ", "PRINT", "FOR", "ID", "DECIMAL", 
			"INTEGER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FinishContext finish() {
			return getRuleContext(FinishContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			start();
			setState(113);
			body();
			setState(114);
			finish();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinishContext extends ParserRuleContext {
		public FinishContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finish; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFinish(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFinish(this);
		}
	}

	public final FinishContext finish() throws RecognitionException {
		FinishContext _localctx = new FinishContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_finish);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INTEGER) | (1L << TYPE_BOOLEAN) | (1L << TYPE_TEXT) | (1L << TYPE_DECIMAL) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(120);
				sentence();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public End_lineContext end_line() {
			return getRuleContext(End_lineContext.class,0);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Read_functionContext read_function() {
			return getRuleContext(Read_functionContext.class,0);
		}
		public Print_functionContext print_function() {
			return getRuleContext(Print_functionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				assignment();
				setState(127);
				end_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				if_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				read_function();
				setState(133);
				end_line();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				print_function();
				setState(136);
				end_line();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public Assign_valueContext assign_value() {
			return getRuleContext(Assign_valueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INTEGER:
			case TYPE_BOOLEAN:
			case TYPE_TEXT:
			case TYPE_DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				declare_variable();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				assign_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_variableContext extends ParserRuleContext {
		public Type_varContext type_var() {
			return getRuleContext(Type_varContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_signalContext assignment_signal() {
			return getRuleContext(Assignment_signalContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Declare_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclare_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclare_variable(this);
		}
	}

	public final Declare_variableContext declare_variable() throws RecognitionException {
		Declare_variableContext _localctx = new Declare_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declare_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			type_var();
			setState(145);
			id();
			setState(146);
			assignment_signal();
			setState(147);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_valueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_signalContext assignment_signal() {
			return getRuleContext(Assignment_signalContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Assign_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssign_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssign_value(this);
		}
	}

	public final Assign_valueContext assign_value() throws RecognitionException {
		Assign_valueContext _localctx = new Assign_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			id();
			setState(150);
			assignment_signal();
			setState(151);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ReservedContext reserved() {
			return getRuleContext(ReservedContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public Lesser_equalContext lesser_equal() {
			return getRuleContext(Lesser_equalContext.class,0);
		}
		public Greater_equalContext greater_equal() {
			return getRuleContext(Greater_equalContext.class,0);
		}
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(154);
				not();
				setState(155);
				exp(8);
				}
				break;
			case NULL:
			case OPEN_PARENTHESIS:
			case TRUE:
			case FALSE:
			case TEXT:
			case ID:
			case DECIMAL:
			case INTEGER:
				{
				setState(157);
				reserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(160);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(161);
							mult();
							}
							break;
						case DIV:
							{
							setState(162);
							div();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(165);
						exp(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(170);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUM:
							{
							setState(168);
							sum();
							}
							break;
						case SUB:
							{
							setState(169);
							sub();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(172);
						exp(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(174);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LESSER_EQUAL:
							{
							setState(175);
							lesser_equal();
							}
							break;
						case GREATER_EQUAL:
							{
							setState(176);
							greater_equal();
							}
							break;
						case LESSER:
							{
							setState(177);
							lesser();
							}
							break;
						case GREATER:
							{
							setState(178);
							greater();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(181);
						exp(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(183);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(186);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(184);
							equal();
							}
							break;
						case NOT_EQUAL:
							{
							setState(185);
							not_equal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(188);
						exp(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						and();
						setState(192);
						exp(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						or();
						setState(196);
						exp(3);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ReservedContext extends ParserRuleContext {
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public Null_typeContext null_type() {
			return getRuleContext(Null_typeContext.class,0);
		}
		public ReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReserved(this);
		}
	}

	public final ReservedContext reserved() throws RecognitionException {
		ReservedContext _localctx = new ReservedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reserved);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				open_parenthesis();
				setState(204);
				exp(0);
				setState(205);
				close_parenthesis();
				}
				break;
			case DECIMAL:
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(207);
					integer();
					}
					break;
				case DECIMAL:
					{
					setState(208);
					decimal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				boolean_val();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				id();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				text();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(214);
				null_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_conditionContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public Exp_blockContext exp_block() {
			return getRuleContext(Exp_blockContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIf_condition(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			if_stmt();
			setState(218);
			condition_block();
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(219);
				else_stmt();
				setState(220);
				exp_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_blockContext exp_block() {
			return getRuleContext(Exp_blockContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			exp(0);
			setState(225);
			exp_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GramaticaParser.OPEN_BRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GramaticaParser.CLOSE_BRACKET, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Exp_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExp_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExp_block(this);
		}
	}

	public final Exp_blockContext exp_block() throws RecognitionException {
		Exp_blockContext _localctx = new Exp_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_block);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(OPEN_BRACKET);
				setState(228);
				body();
				setState(229);
				match(CLOSE_BRACKET);
				}
				break;
			case TYPE_INTEGER:
			case TYPE_BOOLEAN:
			case TYPE_TEXT:
			case TYPE_DECIMAL:
			case IF:
			case WHILE:
			case PRINT:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				sentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_loopContext extends ParserRuleContext {
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public Declare_variableContext declare_variable() {
			return getRuleContext(Declare_variableContext.class,0);
		}
		public List<Attribute_separatorContext> attribute_separator() {
			return getRuleContexts(Attribute_separatorContext.class);
		}
		public Attribute_separatorContext attribute_separator(int i) {
			return getRuleContext(Attribute_separatorContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Incrementer_forContext incrementer_for() {
			return getRuleContext(Incrementer_forContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
		}
		public Exp_blockContext exp_block() {
			return getRuleContext(Exp_blockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			for_stmt();
			setState(235);
			open_parenthesis();
			setState(236);
			declare_variable();
			setState(237);
			attribute_separator();
			setState(238);
			exp(0);
			setState(239);
			attribute_separator();
			setState(240);
			incrementer_for();
			setState(241);
			close_parenthesis();
			setState(242);
			exp_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incrementer_forContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Incrementer_typeContext incrementer_type() {
			return getRuleContext(Incrementer_typeContext.class,0);
		}
		public Incrementer_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementer_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIncrementer_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIncrementer_for(this);
		}
	}

	public final Incrementer_forContext incrementer_for() throws RecognitionException {
		Incrementer_forContext _localctx = new Incrementer_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_incrementer_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			id();
			setState(245);
			incrementer_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Incrementer_typeContext extends ParserRuleContext {
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public Incrementer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIncrementer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIncrementer_type(this);
		}
	}

	public final Incrementer_typeContext incrementer_type() throws RecognitionException {
		Incrementer_typeContext _localctx = new Incrementer_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incrementer_type);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				decrement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				increment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_blockContext exp_block() {
			return getRuleContext(Exp_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			while_stmt();
			setState(252);
			exp(0);
			setState(253);
			exp_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_functionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Assignment_signalContext assignment_signal() {
			return getRuleContext(Assignment_signalContext.class,0);
		}
		public Open_parenthesisContext open_parenthesis() {
			return getRuleContext(Open_parenthesisContext.class,0);
		}
		public Close_parenthesisContext close_parenthesis() {
			return getRuleContext(Close_parenthesisContext.class,0);
		}
		public Read_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRead_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRead_function(this);
		}
	}

	public final Read_functionContext read_function() throws RecognitionException {
		Read_functionContext _localctx = new Read_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			id();
			setState(256);
			assignment_signal();
			setState(257);
			open_parenthesis();
			setState(258);
			close_parenthesis();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_functionContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Print_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrint_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrint_function(this);
		}
	}

	public final Print_functionContext print_function() throws RecognitionException {
		Print_functionContext _localctx = new Print_functionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			print();
			setState(261);
			exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_varContext extends ParserRuleContext {
		public TerminalNode TYPE_INTEGER() { return getToken(GramaticaParser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(GramaticaParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_TEXT() { return getToken(GramaticaParser.TYPE_TEXT, 0); }
		public TerminalNode TYPE_DECIMAL() { return getToken(GramaticaParser.TYPE_DECIMAL, 0); }
		public Type_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType_var(this);
		}
	}

	public final Type_varContext type_var() throws RecognitionException {
		Type_varContext _localctx = new Type_varContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_INTEGER) | (1L << TYPE_BOOLEAN) | (1L << TYPE_TEXT) | (1L << TYPE_DECIMAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_valContext extends ParserRuleContext {
		public True_typeContext true_type() {
			return getRuleContext(True_typeContext.class,0);
		}
		public False_typeContext false_type() {
			return getRuleContext(False_typeContext.class,0);
		}
		public Boolean_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBoolean_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBoolean_val(this);
		}
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolean_val);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				true_type();
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				false_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecrementContext extends ParserRuleContext {
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecrement(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_lineContext extends ParserRuleContext {
		public TerminalNode END_LINE() { return getToken(GramaticaParser.END_LINE, 0); }
		public End_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEnd_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEnd_line(this);
		}
	}

	public final End_lineContext end_line() throws RecognitionException {
		End_lineContext _localctx = new End_lineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_end_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(END_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_signalContext extends ParserRuleContext {
		public TerminalNode ASSIGNMENT() { return getToken(GramaticaParser.ASSIGNMENT, 0); }
		public Assignment_signalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_signal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssignment_signal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssignment_signal(this);
		}
	}

	public final Assignment_signalContext assignment_signal() throws RecognitionException {
		Assignment_signalContext _localctx = new Assignment_signalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_signal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ASSIGNMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(GramaticaParser.MULT, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(MULT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(GramaticaParser.DIV, 0); }
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(DIV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(GramaticaParser.SUM, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(SUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(GramaticaParser.SUB, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_typeContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(GramaticaParser.NULL, 0); }
		public Null_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNull_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNull_type(this);
		}
	}

	public final Null_typeContext null_type() throws RecognitionException {
		Null_typeContext _localctx = new Null_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_null_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaParser.NOT, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(NOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_parenthesisContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTHESIS() { return getToken(GramaticaParser.OPEN_PARENTHESIS, 0); }
		public Open_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpen_parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpen_parenthesis(this);
		}
	}

	public final Open_parenthesisContext open_parenthesis() throws RecognitionException {
		Open_parenthesisContext _localctx = new Open_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_open_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(OPEN_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_parenthesisContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENTHESIS() { return getToken(GramaticaParser.CLOSE_PARENTHESIS, 0); }
		public Close_parenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_parenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterClose_parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitClose_parenthesis(this);
		}
	}

	public final Close_parenthesisContext close_parenthesis() throws RecognitionException {
		Close_parenthesisContext _localctx = new Close_parenthesisContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_close_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(CLOSE_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_bracketContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(GramaticaParser.OPEN_BRACKET, 0); }
		public Open_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpen_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpen_bracket(this);
		}
	}

	public final Open_bracketContext open_bracket() throws RecognitionException {
		Open_bracketContext _localctx = new Open_bracketContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_open_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(OPEN_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_bracketContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(GramaticaParser.CLOSE_BRACKET, 0); }
		public Close_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterClose_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitClose_bracket(this);
		}
	}

	public final Close_bracketContext close_bracket() throws RecognitionException {
		Close_bracketContext _localctx = new Close_bracketContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_close_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lesser_equalContext extends ParserRuleContext {
		public TerminalNode LESSER_EQUAL() { return getToken(GramaticaParser.LESSER_EQUAL, 0); }
		public Lesser_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLesser_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLesser_equal(this);
		}
	}

	public final Lesser_equalContext lesser_equal() throws RecognitionException {
		Lesser_equalContext _localctx = new Lesser_equalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lesser_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(LESSER_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Greater_equalContext extends ParserRuleContext {
		public TerminalNode GREATER_EQUAL() { return getToken(GramaticaParser.GREATER_EQUAL, 0); }
		public Greater_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterGreater_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitGreater_equal(this);
		}
	}

	public final Greater_equalContext greater_equal() throws RecognitionException {
		Greater_equalContext _localctx = new Greater_equalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(GREATER_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LesserContext extends ParserRuleContext {
		public TerminalNode LESSER() { return getToken(GramaticaParser.LESSER, 0); }
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLesser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLesser(this);
		}
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LESSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GreaterContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(GramaticaParser.GREATER, 0); }
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(GREATER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GramaticaParser.EQUAL, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equalContext extends ParserRuleContext {
		public TerminalNode NOT_EQUAL() { return getToken(GramaticaParser.NOT_EQUAL, 0); }
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNot_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNot_equal(this);
		}
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(NOT_EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GramaticaParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitElse_stmt(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ELSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_typeContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GramaticaParser.TRUE, 0); }
		public True_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTrue_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTrue_type(this);
		}
	}

	public final True_typeContext true_type() throws RecognitionException {
		True_typeContext _localctx = new True_typeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_true_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(TRUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class False_typeContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(GramaticaParser.FALSE, 0); }
		public False_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFalse_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFalse_type(this);
		}
	}

	public final False_typeContext false_type() throws RecognitionException {
		False_typeContext _localctx = new False_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_false_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FALSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GramaticaParser.TEXT, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_separatorContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE_SEPARATOR() { return getToken(GramaticaParser.ATTRIBUTE_SEPARATOR, 0); }
		public Attribute_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAttribute_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAttribute_separator(this);
		}
	}

	public final Attribute_separatorContext attribute_separator() throws RecognitionException {
		Attribute_separatorContext _localctx = new Attribute_separatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_attribute_separator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ATTRIBUTE_SEPARATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GramaticaParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(READ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GramaticaParser.PRINT, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(PRINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFor_stmt(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(GramaticaParser.DECIMAL, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(DECIMAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0156\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u008d\n\6\3\7\3\7\5\7\u0091\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n\n\3\n\3\n\3\n\5\n"+
		"\u00a6\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bd\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16\n\u00cc\13\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00d4\n\13\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00e1\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00eb\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u010e\n\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\2\3"+
		"\22:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^`bdfhjlnp\2\3\3\2\b\13\2\u013b\2r\3\2\2\2\4v\3\2\2\2\6"+
		"x\3\2\2\2\b}\3\2\2\2\n\u008c\3\2\2\2\f\u0090\3\2\2\2\16\u0092\3\2\2\2"+
		"\20\u0097\3\2\2\2\22\u00a0\3\2\2\2\24\u00d9\3\2\2\2\26\u00db\3\2\2\2\30"+
		"\u00e2\3\2\2\2\32\u00ea\3\2\2\2\34\u00ec\3\2\2\2\36\u00f6\3\2\2\2 \u00fb"+
		"\3\2\2\2\"\u00fd\3\2\2\2$\u0101\3\2\2\2&\u0106\3\2\2\2(\u0109\3\2\2\2"+
		"*\u010d\3\2\2\2,\u010f\3\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u0115"+
		"\3\2\2\2\64\u0117\3\2\2\2\66\u0119\3\2\2\28\u011b\3\2\2\2:\u011d\3\2\2"+
		"\2<\u011f\3\2\2\2>\u0121\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D\u0127"+
		"\3\2\2\2F\u0129\3\2\2\2H\u012b\3\2\2\2J\u012d\3\2\2\2L\u012f\3\2\2\2N"+
		"\u0131\3\2\2\2P\u0133\3\2\2\2R\u0135\3\2\2\2T\u0137\3\2\2\2V\u0139\3\2"+
		"\2\2X\u013b\3\2\2\2Z\u013d\3\2\2\2\\\u013f\3\2\2\2^\u0141\3\2\2\2`\u0143"+
		"\3\2\2\2b\u0145\3\2\2\2d\u0147\3\2\2\2f\u0149\3\2\2\2h\u014b\3\2\2\2j"+
		"\u014d\3\2\2\2l\u014f\3\2\2\2n\u0151\3\2\2\2p\u0153\3\2\2\2rs\5\4\3\2"+
		"st\5\b\5\2tu\5\6\4\2u\3\3\2\2\2vw\7\3\2\2w\5\3\2\2\2xy\7\4\2\2y\7\3\2"+
		"\2\2z|\5\n\6\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\t\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0081\5\f\7\2\u0081\u0082\5\60\31\2\u0082\u008d\3\2\2"+
		"\2\u0083\u008d\5\26\f\2\u0084\u008d\5\"\22\2\u0085\u008d\5\34\17\2\u0086"+
		"\u0087\5$\23\2\u0087\u0088\5\60\31\2\u0088\u008d\3\2\2\2\u0089\u008a\5"+
		"&\24\2\u008a\u008b\5\60\31\2\u008b\u008d\3\2\2\2\u008c\u0080\3\2\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008d\13\3\2\2\2\u008e\u0091\5\16\b\2\u008f\u0091"+
		"\5\20\t\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\r\3\2\2\2\u0092"+
		"\u0093\5(\25\2\u0093\u0094\5l\67\2\u0094\u0095\5\62\32\2\u0095\u0096\5"+
		"\22\n\2\u0096\17\3\2\2\2\u0097\u0098\5l\67\2\u0098\u0099\5\62\32\2\u0099"+
		"\u009a\5\22\n\2\u009a\21\3\2\2\2\u009b\u009c\b\n\1\2\u009c\u009d\5> \2"+
		"\u009d\u009e\5\22\n\n\u009e\u00a1\3\2\2\2\u009f\u00a1\5\24\13\2\u00a0"+
		"\u009b\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00ca\3\2\2\2\u00a2\u00a5\f\t"+
		"\2\2\u00a3\u00a6\5\64\33\2\u00a4\u00a6\5\66\34\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\22\n\n\u00a8\u00c9\3"+
		"\2\2\2\u00a9\u00ac\f\b\2\2\u00aa\u00ad\58\35\2\u00ab\u00ad\5:\36\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\22"+
		"\n\t\u00af\u00c9\3\2\2\2\u00b0\u00b5\f\7\2\2\u00b1\u00b6\5H%\2\u00b2\u00b6"+
		"\5J&\2\u00b3\u00b6\5L\'\2\u00b4\u00b6\5N(\2\u00b5\u00b1\3\2\2\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\5\22\n\b\u00b8\u00c9\3\2\2\2\u00b9\u00bc\f\6\2\2\u00ba"+
		"\u00bd\5P)\2\u00bb\u00bd\5R*\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bf\5\22\n\7\u00bf\u00c9\3\2\2\2\u00c0\u00c1"+
		"\f\5\2\2\u00c1\u00c2\5T+\2\u00c2\u00c3\5\22\n\6\u00c3\u00c9\3\2\2\2\u00c4"+
		"\u00c5\f\4\2\2\u00c5\u00c6\5V,\2\u00c6\u00c7\5\22\n\5\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00a2\3\2\2\2\u00c8\u00a9\3\2\2\2\u00c8\u00b0\3\2\2\2\u00c8"+
		"\u00b9\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00ce\5@!\2\u00ce\u00cf\5\22\n\2\u00cf\u00d0\5B\"\2\u00d0"+
		"\u00da\3\2\2\2\u00d1\u00d4\5p9\2\u00d2\u00d4\5n8\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5\u00da\5*\26\2\u00d6\u00da"+
		"\5l\67\2\u00d7\u00da\5`\61\2\u00d8\u00da\5<\37\2\u00d9\u00cd\3\2\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\5X-\2\u00dc\u00e0"+
		"\5\30\r\2\u00dd\u00de\5Z.\2\u00de\u00df\5\32\16\2\u00df\u00e1\3\2\2\2"+
		"\u00e0\u00dd\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e3"+
		"\5\22\n\2\u00e3\u00e4\5\32\16\2\u00e4\31\3\2\2\2\u00e5\u00e6\7\26\2\2"+
		"\u00e6\u00e7\5\b\5\2\u00e7\u00e8\7\27\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb"+
		"\5\n\6\2\u00ea\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\33\3\2\2\2\u00ec"+
		"\u00ed\5j\66\2\u00ed\u00ee\5@!\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\5d\63"+
		"\2\u00f0\u00f1\5\22\n\2\u00f1\u00f2\5d\63\2\u00f2\u00f3\5\36\20\2\u00f3"+
		"\u00f4\5B\"\2\u00f4\u00f5\5\32\16\2\u00f5\35\3\2\2\2\u00f6\u00f7\5l\67"+
		"\2\u00f7\u00f8\5 \21\2\u00f8\37\3\2\2\2\u00f9\u00fc\5,\27\2\u00fa\u00fc"+
		"\5.\30\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc!\3\2\2\2\u00fd"+
		"\u00fe\5b\62\2\u00fe\u00ff\5\22\n\2\u00ff\u0100\5\32\16\2\u0100#\3\2\2"+
		"\2\u0101\u0102\5l\67\2\u0102\u0103\5\62\32\2\u0103\u0104\5@!\2\u0104\u0105"+
		"\5B\"\2\u0105%\3\2\2\2\u0106\u0107\5h\65\2\u0107\u0108\5\22\n\2\u0108"+
		"\'\3\2\2\2\u0109\u010a\t\2\2\2\u010a)\3\2\2\2\u010b\u010e\5\\/\2\u010c"+
		"\u010e\5^\60\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e+\3\2\2\2"+
		"\u010f\u0110\7\5\2\2\u0110-\3\2\2\2\u0111\u0112\7\6\2\2\u0112/\3\2\2\2"+
		"\u0113\u0114\7\f\2\2\u0114\61\3\2\2\2\u0115\u0116\7\r\2\2\u0116\63\3\2"+
		"\2\2\u0117\u0118\7\16\2\2\u0118\65\3\2\2\2\u0119\u011a\7\17\2\2\u011a"+
		"\67\3\2\2\2\u011b\u011c\7\20\2\2\u011c9\3\2\2\2\u011d\u011e\7\21\2\2\u011e"+
		";\3\2\2\2\u011f\u0120\7\22\2\2\u0120=\3\2\2\2\u0121\u0122\7\23\2\2\u0122"+
		"?\3\2\2\2\u0123\u0124\7\24\2\2\u0124A\3\2\2\2\u0125\u0126\7\25\2\2\u0126"+
		"C\3\2\2\2\u0127\u0128\7\26\2\2\u0128E\3\2\2\2\u0129\u012a\7\27\2\2\u012a"+
		"G\3\2\2\2\u012b\u012c\7\30\2\2\u012cI\3\2\2\2\u012d\u012e\7\31\2\2\u012e"+
		"K\3\2\2\2\u012f\u0130\7\32\2\2\u0130M\3\2\2\2\u0131\u0132\7\33\2\2\u0132"+
		"O\3\2\2\2\u0133\u0134\7\34\2\2\u0134Q\3\2\2\2\u0135\u0136\7\35\2\2\u0136"+
		"S\3\2\2\2\u0137\u0138\7\36\2\2\u0138U\3\2\2\2\u0139\u013a\7\37\2\2\u013a"+
		"W\3\2\2\2\u013b\u013c\7 \2\2\u013cY\3\2\2\2\u013d\u013e\7!\2\2\u013e["+
		"\3\2\2\2\u013f\u0140\7\"\2\2\u0140]\3\2\2\2\u0141\u0142\7#\2\2\u0142_"+
		"\3\2\2\2\u0143\u0144\7$\2\2\u0144a\3\2\2\2\u0145\u0146\7%\2\2\u0146c\3"+
		"\2\2\2\u0147\u0148\7&\2\2\u0148e\3\2\2\2\u0149\u014a\7\'\2\2\u014ag\3"+
		"\2\2\2\u014b\u014c\7(\2\2\u014ci\3\2\2\2\u014d\u014e\7)\2\2\u014ek\3\2"+
		"\2\2\u014f\u0150\7*\2\2\u0150m\3\2\2\2\u0151\u0152\7+\2\2\u0152o\3\2\2"+
		"\2\u0153\u0154\7,\2\2\u0154q\3\2\2\2\22}\u008c\u0090\u00a0\u00a5\u00ac"+
		"\u00b5\u00bc\u00c8\u00ca\u00d3\u00d9\u00e0\u00ea\u00fb\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
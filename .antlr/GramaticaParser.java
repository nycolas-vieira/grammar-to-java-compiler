// Generated from /Users/nyvieira/repos/grammar-to-java-compiler/Gramatica.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4;
	public static final int
		RULE_init = 0, RULE_iniciar = 1, RULE_finalizar = 2, RULE_linha_codigo = 3, 
		RULE_comando = 4, RULE_expressao = 5, RULE_variavel = 6, RULE_cmd_leitura = 7, 
		RULE_cmd_escrita = 8, RULE_expr_repeticao = 9, RULE_expr_decisao = 10, 
		RULE_declarar_variavel = 11, RULE_atribuir_variavel = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "iniciar", "finalizar", "linha_codigo", "comando", "expressao", 
			"variavel", "cmd_leitura", "cmd_escrita", "expr_repeticao", "expr_decisao", 
			"declarar_variavel", "atribuir_variavel"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'iniciar'", "'finalizar'", "'a'", "'b'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		public IniciarContext iniciar() {
			return getRuleContext(IniciarContext.class,0);
		}
		public FinalizarContext finalizar() {
			return getRuleContext(FinalizarContext.class,0);
		}
		public List<Linha_codigoContext> linha_codigo() {
			return getRuleContexts(Linha_codigoContext.class);
		}
		public Linha_codigoContext linha_codigo(int i) {
			return getRuleContext(Linha_codigoContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			iniciar();
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				linha_codigo();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
			setState(32);
			finalizar();
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

	public static class IniciarContext extends ParserRuleContext {
		public IniciarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciar; }
	}

	public final IniciarContext iniciar() throws RecognitionException {
		IniciarContext _localctx = new IniciarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iniciar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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

	public static class FinalizarContext extends ParserRuleContext {
		public FinalizarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar; }
	}

	public final FinalizarContext finalizar() throws RecognitionException {
		FinalizarContext _localctx = new FinalizarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_finalizar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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

	public static class Linha_codigoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Linha_codigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha_codigo; }
	}

	public final Linha_codigoContext linha_codigo() throws RecognitionException {
		Linha_codigoContext _localctx = new Linha_codigoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linha_codigo);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				variavel();
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

	public static class ComandoContext extends ParserRuleContext {
		public Cmd_leituraContext cmd_leitura() {
			return getRuleContext(Cmd_leituraContext.class,0);
		}
		public Cmd_escritaContext cmd_escrita() {
			return getRuleContext(Cmd_escritaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				cmd_leitura();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				cmd_escrita();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Expr_repeticaoContext expr_repeticao() {
			return getRuleContext(Expr_repeticaoContext.class,0);
		}
		public Expr_decisaoContext expr_decisao() {
			return getRuleContext(Expr_decisaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressao);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				expr_repeticao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				expr_decisao();
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

	public static class VariavelContext extends ParserRuleContext {
		public Declarar_variavelContext declarar_variavel() {
			return getRuleContext(Declarar_variavelContext.class,0);
		}
		public Atribuir_variavelContext atribuir_variavel() {
			return getRuleContext(Atribuir_variavelContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				declarar_variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				atribuir_variavel();
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

	public static class Cmd_leituraContext extends ParserRuleContext {
		public Cmd_leituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_leitura; }
	}

	public final Cmd_leituraContext cmd_leitura() throws RecognitionException {
		Cmd_leituraContext _localctx = new Cmd_leituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
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

	public static class Cmd_escritaContext extends ParserRuleContext {
		public Cmd_escritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_escrita; }
	}

	public final Cmd_escritaContext cmd_escrita() throws RecognitionException {
		Cmd_escritaContext _localctx = new Cmd_escritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmd_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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

	public static class Expr_repeticaoContext extends ParserRuleContext {
		public Expr_repeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_repeticao; }
	}

	public final Expr_repeticaoContext expr_repeticao() throws RecognitionException {
		Expr_repeticaoContext _localctx = new Expr_repeticaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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

	public static class Expr_decisaoContext extends ParserRuleContext {
		public Expr_decisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_decisao; }
	}

	public final Expr_decisaoContext expr_decisao() throws RecognitionException {
		Expr_decisaoContext _localctx = new Expr_decisaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_decisao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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

	public static class Declarar_variavelContext extends ParserRuleContext {
		public Declarar_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variavel; }
	}

	public final Declarar_variavelContext declarar_variavel() throws RecognitionException {
		Declarar_variavelContext _localctx = new Declarar_variavelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarar_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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

	public static class Atribuir_variavelContext extends ParserRuleContext {
		public Atribuir_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir_variavel; }
	}

	public final Atribuir_variavelContext atribuir_variavel() throws RecognitionException {
		Atribuir_variavelContext _localctx = new Atribuir_variavelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuir_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\6\2\37\n\2\r\2\16\2 \3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\5\6\60\n\6\3\7\3\7\5\7\64\n\7\3"+
		"\b\3\b\5\b8\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2>\2\34\3\2\2\2\4$\3\2"+
		"\2\2\6&\3\2\2\2\b+\3\2\2\2\n/\3\2\2\2\f\63\3\2\2\2\16\67\3\2\2\2\209\3"+
		"\2\2\2\22;\3\2\2\2\24=\3\2\2\2\26?\3\2\2\2\30A\3\2\2\2\32C\3\2\2\2\34"+
		"\36\5\4\3\2\35\37\5\b\5\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\"\3\2\2\2\"#\5\6\4\2#\3\3\2\2\2$%\7\3\2\2%\5\3\2\2\2&\'\7\4\2\2"+
		"\'\7\3\2\2\2(,\5\n\6\2),\5\f\7\2*,\5\16\b\2+(\3\2\2\2+)\3\2\2\2+*\3\2"+
		"\2\2,\t\3\2\2\2-\60\5\20\t\2.\60\5\22\n\2/-\3\2\2\2/.\3\2\2\2\60\13\3"+
		"\2\2\2\61\64\5\24\13\2\62\64\5\26\f\2\63\61\3\2\2\2\63\62\3\2\2\2\64\r"+
		"\3\2\2\2\658\5\30\r\2\668\5\32\16\2\67\65\3\2\2\2\67\66\3\2\2\28\17\3"+
		"\2\2\29:\7\5\2\2:\21\3\2\2\2;<\7\6\2\2<\23\3\2\2\2=>\7\6\2\2>\25\3\2\2"+
		"\2?@\7\6\2\2@\27\3\2\2\2AB\7\6\2\2B\31\3\2\2\2CD\7\6\2\2D\33\3\2\2\2\7"+
		" +/\63\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from c:\Users\Theo\Documents\GitHub\grammar-to-java-compiler\Gramatica.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, WS=3, MENOS_MENOS=4, MAIS_MAIS=5, TV_INTEIRO=6, TV_BOOLEANO=7, 
		TV_TEXTO=8, TV_DECIMAL=9, FIM_LINHA=10, ATRIBUICAO=11, MULT=12, DIV=13, 
		SOMA=14, SUB=15, NULO=16, NAO=17, APAREN=18, FPAREN=19, ACHAVE=20, FCHAVE=21, 
		MENOR_IGUAL=22, MAIOR_IGUAL=23, MENOR=24, MAIOR=25, IGUAL=26, NAO_IGUAL=27, 
		E=28, OU=29, SE=30, SENAO=31, VERDADEIRO=32, FALSO=33, TEXTO=34, ENQUANTO=35, 
		SEPERADOR_ATRIBUTO=36, LER=37, IMPRIMIR=38, PARA=39, ID=40, DECIMAL=41, 
		INTEIRO=42;
	public static final int
		RULE_init = 0, RULE_iniciar = 1, RULE_finalizar = 2, RULE_corpo = 3, RULE_sentenca = 4, 
		RULE_atribuicao = 5, RULE_declarar_variavel = 6, RULE_atribuir_valor = 7, 
		RULE_expressao = 8, RULE_reservado = 9, RULE_se_condicao = 10, RULE_bloco_condicao = 11, 
		RULE_enquanto_loop = 12, RULE_bloco_expressao = 13, RULE_para_loop = 14, 
		RULE_incremento_loop = 15, RULE_ler_fun = 16, RULE_imprimir_fun = 17, 
		RULE_incrementador = 18, RULE_tipovar = 19, RULE_fim_linha = 20, RULE_atribuicao_sinal = 21, 
		RULE_mult = 22, RULE_div = 23, RULE_soma = 24, RULE_sub = 25, RULE_nulo = 26, 
		RULE_nao = 27, RULE_aparen = 28, RULE_fparen = 29, RULE_achave = 30, RULE_fchave = 31, 
		RULE_menor_igual = 32, RULE_maior_igual = 33, RULE_menor = 34, RULE_maior = 35, 
		RULE_igual = 36, RULE_nao_igual = 37, RULE_e = 38, RULE_ou = 39, RULE_se = 40, 
		RULE_senao = 41, RULE_verdadeiro = 42, RULE_falso = 43, RULE_booleano = 44, 
		RULE_texto = 45, RULE_enquanto = 46, RULE_separador_atributo = 47, RULE_ler = 48, 
		RULE_imprimir = 49, RULE_para = 50, RULE_id = 51, RULE_decimal = 52, RULE_inteiro = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "iniciar", "finalizar", "corpo", "sentenca", "atribuicao", "declarar_variavel", 
			"atribuir_valor", "expressao", "reservado", "se_condicao", "bloco_condicao", 
			"enquanto_loop", "bloco_expressao", "para_loop", "incremento_loop", "ler_fun", 
			"imprimir_fun", "incrementador", "tipovar", "fim_linha", "atribuicao_sinal", 
			"mult", "div", "soma", "sub", "nulo", "nao", "aparen", "fparen", "achave", 
			"fchave", "menor_igual", "maior_igual", "menor", "maior", "igual", "nao_igual", 
			"e", "ou", "se", "senao", "verdadeiro", "falso", "booleano", "texto", 
			"enquanto", "separador_atributo", "ler", "imprimir", "para", "id", "decimal", 
			"inteiro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'iniciar'", "'finalizar'", null, "'--'", "'++'", "'inteiro'", 
			"'booleano'", "'texto'", "'decimal'", "';'", "'='", "'*'", "'/'", "'+'", 
			"'-'", "' '", "'!'", "'('", "')'", "'{'", "'}'", "'<='", "'>='", "'<'", 
			"'>'", "'=='", "'!='", "'&&'", "'||'", "'se'", "'senao'", "'verdadeiro'", 
			"'falso'", null, "'enquanto'", "','", "'ler'", "'imprimir'", "'para'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "MENOS_MENOS", "MAIS_MAIS", "TV_INTEIRO", "TV_BOOLEANO", 
			"TV_TEXTO", "TV_DECIMAL", "FIM_LINHA", "ATRIBUICAO", "MULT", "DIV", "SOMA", 
			"SUB", "NULO", "NAO", "APAREN", "FPAREN", "ACHAVE", "FCHAVE", "MENOR_IGUAL", 
			"MAIOR_IGUAL", "MENOR", "MAIOR", "IGUAL", "NAO_IGUAL", "E", "OU", "SE", 
			"SENAO", "VERDADEIRO", "FALSO", "TEXTO", "ENQUANTO", "SEPERADOR_ATRIBUTO", 
			"LER", "IMPRIMIR", "PARA", "ID", "DECIMAL", "INTEIRO"
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
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public FinalizarContext finalizar() {
			return getRuleContext(FinalizarContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			iniciar();
			setState(109);
			corpo();
			setState(110);
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
			setState(112);
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
			setState(114);
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

	public static class CorpoContext extends ParserRuleContext {
		public List<SentencaContext> sentenca() {
			return getRuleContexts(SentencaContext.class);
		}
		public SentencaContext sentenca(int i) {
			return getRuleContext(SentencaContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TV_INTEIRO) | (1L << TV_BOOLEANO) | (1L << TV_TEXTO) | (1L << TV_DECIMAL) | (1L << SE) | (1L << ENQUANTO) | (1L << IMPRIMIR) | (1L << PARA) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				sentenca();
				}
				}
				setState(121);
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

	public static class SentencaContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Fim_linhaContext fim_linha() {
			return getRuleContext(Fim_linhaContext.class,0);
		}
		public Se_condicaoContext se_condicao() {
			return getRuleContext(Se_condicaoContext.class,0);
		}
		public Enquanto_loopContext enquanto_loop() {
			return getRuleContext(Enquanto_loopContext.class,0);
		}
		public Para_loopContext para_loop() {
			return getRuleContext(Para_loopContext.class,0);
		}
		public Ler_funContext ler_fun() {
			return getRuleContext(Ler_funContext.class,0);
		}
		public Imprimir_funContext imprimir_fun() {
			return getRuleContext(Imprimir_funContext.class,0);
		}
		public SentencaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenca; }
	}

	public final SentencaContext sentenca() throws RecognitionException {
		SentencaContext _localctx = new SentencaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentenca);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				atribuicao();
				setState(123);
				fim_linha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				se_condicao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				enquanto_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				para_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				ler_fun();
				setState(129);
				fim_linha();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
				imprimir_fun();
				setState(132);
				fim_linha();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public Declarar_variavelContext declarar_variavel() {
			return getRuleContext(Declarar_variavelContext.class,0);
		}
		public Atribuir_valorContext atribuir_valor() {
			return getRuleContext(Atribuir_valorContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicao);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TV_INTEIRO:
			case TV_BOOLEANO:
			case TV_TEXTO:
			case TV_DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				declarar_variavel();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				atribuir_valor();
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

	public static class Declarar_variavelContext extends ParserRuleContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Atribuicao_sinalContext atribuicao_sinal() {
			return getRuleContext(Atribuicao_sinalContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Declarar_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_variavel; }
	}

	public final Declarar_variavelContext declarar_variavel() throws RecognitionException {
		Declarar_variavelContext _localctx = new Declarar_variavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarar_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			tipovar();
			setState(141);
			id();
			setState(142);
			atribuicao_sinal();
			setState(143);
			expressao(0);
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

	public static class Atribuir_valorContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Atribuicao_sinalContext atribuicao_sinal() {
			return getRuleContext(Atribuicao_sinalContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Atribuir_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuir_valor; }
	}

	public final Atribuir_valorContext atribuir_valor() throws RecognitionException {
		Atribuir_valorContext _localctx = new Atribuir_valorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atribuir_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			id();
			setState(146);
			atribuicao_sinal();
			setState(147);
			expressao(0);
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
		public NaoContext nao() {
			return getRuleContext(NaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ReservadoContext reservado() {
			return getRuleContext(ReservadoContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public SomaContext soma() {
			return getRuleContext(SomaContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public Menor_igualContext menor_igual() {
			return getRuleContext(Menor_igualContext.class,0);
		}
		public Maior_igualContext maior_igual() {
			return getRuleContext(Maior_igualContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MaiorContext maior() {
			return getRuleContext(MaiorContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public Nao_igualContext nao_igual() {
			return getRuleContext(Nao_igualContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public OuContext ou() {
			return getRuleContext(OuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAO:
				{
				setState(150);
				nao();
				setState(151);
				expressao(8);
				}
				break;
			case NULO:
			case APAREN:
			case VERDADEIRO:
			case FALSO:
			case TEXTO:
			case ID:
			case DECIMAL:
			case INTEIRO:
				{
				setState(153);
				reservado();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(157);
							mult();
							}
							break;
						case DIV:
							{
							setState(158);
							div();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(161);
						expressao(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(163);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SOMA:
							{
							setState(164);
							soma();
							}
							break;
						case SUB:
							{
							setState(165);
							sub();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(168);
						expressao(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(175);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MENOR_IGUAL:
							{
							setState(171);
							menor_igual();
							}
							break;
						case MAIOR_IGUAL:
							{
							setState(172);
							maior_igual();
							}
							break;
						case MENOR:
							{
							setState(173);
							menor();
							}
							break;
						case MAIOR:
							{
							setState(174);
							maior();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(177);
						expressao(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IGUAL:
							{
							setState(180);
							igual();
							}
							break;
						case NAO_IGUAL:
							{
							setState(181);
							nao_igual();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(184);
						expressao(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(186);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(187);
						e();
						setState(188);
						expressao(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						ou();
						setState(192);
						expressao(3);
						}
						break;
					}
					} 
				}
				setState(198);
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

	public static class ReservadoContext extends ParserRuleContext {
		public AparenContext aparen() {
			return getRuleContext(AparenContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FparenContext fparen() {
			return getRuleContext(FparenContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public NuloContext nulo() {
			return getRuleContext(NuloContext.class,0);
		}
		public ReservadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservado; }
	}

	public final ReservadoContext reservado() throws RecognitionException {
		ReservadoContext _localctx = new ReservadoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reservado);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				aparen();
				setState(200);
				expressao(0);
				setState(201);
				fparen();
				}
				break;
			case DECIMAL:
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEIRO:
					{
					setState(203);
					inteiro();
					}
					break;
				case DECIMAL:
					{
					setState(204);
					decimal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				booleano();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				id();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				texto();
				}
				break;
			case NULO:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				nulo();
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

	public static class Se_condicaoContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public Bloco_condicaoContext bloco_condicao() {
			return getRuleContext(Bloco_condicaoContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public Bloco_expressaoContext bloco_expressao() {
			return getRuleContext(Bloco_expressaoContext.class,0);
		}
		public Se_condicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_condicao; }
	}

	public final Se_condicaoContext se_condicao() throws RecognitionException {
		Se_condicaoContext _localctx = new Se_condicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_se_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			se();
			setState(214);
			bloco_condicao();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(215);
				senao();
				setState(216);
				bloco_expressao();
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

	public static class Bloco_condicaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Bloco_expressaoContext bloco_expressao() {
			return getRuleContext(Bloco_expressaoContext.class,0);
		}
		public Bloco_condicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_condicao; }
	}

	public final Bloco_condicaoContext bloco_condicao() throws RecognitionException {
		Bloco_condicaoContext _localctx = new Bloco_condicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloco_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expressao(0);
			setState(221);
			bloco_expressao();
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

	public static class Enquanto_loopContext extends ParserRuleContext {
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Bloco_expressaoContext bloco_expressao() {
			return getRuleContext(Bloco_expressaoContext.class,0);
		}
		public Enquanto_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto_loop; }
	}

	public final Enquanto_loopContext enquanto_loop() throws RecognitionException {
		Enquanto_loopContext _localctx = new Enquanto_loopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enquanto_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			enquanto();
			setState(224);
			expressao(0);
			setState(225);
			bloco_expressao();
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

	public static class Bloco_expressaoContext extends ParserRuleContext {
		public AchaveContext achave() {
			return getRuleContext(AchaveContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public FchaveContext fchave() {
			return getRuleContext(FchaveContext.class,0);
		}
		public SentencaContext sentenca() {
			return getRuleContext(SentencaContext.class,0);
		}
		public Bloco_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco_expressao; }
	}

	public final Bloco_expressaoContext bloco_expressao() throws RecognitionException {
		Bloco_expressaoContext _localctx = new Bloco_expressaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloco_expressao);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				achave();
				setState(228);
				corpo();
				setState(229);
				fchave();
				}
				break;
			case TV_INTEIRO:
			case TV_BOOLEANO:
			case TV_TEXTO:
			case TV_DECIMAL:
			case SE:
			case ENQUANTO:
			case IMPRIMIR:
			case PARA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				sentenca();
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

	public static class Para_loopContext extends ParserRuleContext {
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public AparenContext aparen() {
			return getRuleContext(AparenContext.class,0);
		}
		public Declarar_variavelContext declarar_variavel() {
			return getRuleContext(Declarar_variavelContext.class,0);
		}
		public List<Separador_atributoContext> separador_atributo() {
			return getRuleContexts(Separador_atributoContext.class);
		}
		public Separador_atributoContext separador_atributo(int i) {
			return getRuleContext(Separador_atributoContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Incremento_loopContext incremento_loop() {
			return getRuleContext(Incremento_loopContext.class,0);
		}
		public FparenContext fparen() {
			return getRuleContext(FparenContext.class,0);
		}
		public Bloco_expressaoContext bloco_expressao() {
			return getRuleContext(Bloco_expressaoContext.class,0);
		}
		public Para_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_loop; }
	}

	public final Para_loopContext para_loop() throws RecognitionException {
		Para_loopContext _localctx = new Para_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_para_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			para();
			setState(235);
			aparen();
			setState(236);
			declarar_variavel();
			setState(237);
			separador_atributo();
			setState(238);
			expressao(0);
			setState(239);
			separador_atributo();
			setState(240);
			incremento_loop();
			setState(241);
			fparen();
			setState(242);
			bloco_expressao();
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

	public static class Incremento_loopContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IncrementadorContext incrementador() {
			return getRuleContext(IncrementadorContext.class,0);
		}
		public Incremento_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento_loop; }
	}

	public final Incremento_loopContext incremento_loop() throws RecognitionException {
		Incremento_loopContext _localctx = new Incremento_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_incremento_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			id();
			setState(245);
			incrementador();
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

	public static class Ler_funContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Atribuicao_sinalContext atribuicao_sinal() {
			return getRuleContext(Atribuicao_sinalContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public AparenContext aparen() {
			return getRuleContext(AparenContext.class,0);
		}
		public FparenContext fparen() {
			return getRuleContext(FparenContext.class,0);
		}
		public Ler_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler_fun; }
	}

	public final Ler_funContext ler_fun() throws RecognitionException {
		Ler_funContext _localctx = new Ler_funContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ler_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			id();
			setState(248);
			atribuicao_sinal();
			setState(249);
			ler();
			setState(250);
			aparen();
			setState(251);
			fparen();
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

	public static class Imprimir_funContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Imprimir_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir_fun; }
	}

	public final Imprimir_funContext imprimir_fun() throws RecognitionException {
		Imprimir_funContext _localctx = new Imprimir_funContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_imprimir_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			imprimir();
			setState(254);
			expressao(0);
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

	public static class IncrementadorContext extends ParserRuleContext {
		public TerminalNode MENOS_MENOS() { return getToken(GramaticaParser.MENOS_MENOS, 0); }
		public TerminalNode MAIS_MAIS() { return getToken(GramaticaParser.MAIS_MAIS, 0); }
		public IncrementadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementador; }
	}

	public final IncrementadorContext incrementador() throws RecognitionException {
		IncrementadorContext _localctx = new IncrementadorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_incrementador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==MENOS_MENOS || _la==MAIS_MAIS) ) {
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

	public static class TipovarContext extends ParserRuleContext {
		public TerminalNode TV_INTEIRO() { return getToken(GramaticaParser.TV_INTEIRO, 0); }
		public TerminalNode TV_BOOLEANO() { return getToken(GramaticaParser.TV_BOOLEANO, 0); }
		public TerminalNode TV_TEXTO() { return getToken(GramaticaParser.TV_TEXTO, 0); }
		public TerminalNode TV_DECIMAL() { return getToken(GramaticaParser.TV_DECIMAL, 0); }
		public TipovarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipovar; }
	}

	public final TipovarContext tipovar() throws RecognitionException {
		TipovarContext _localctx = new TipovarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TV_INTEIRO) | (1L << TV_BOOLEANO) | (1L << TV_TEXTO) | (1L << TV_DECIMAL))) != 0)) ) {
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

	public static class Fim_linhaContext extends ParserRuleContext {
		public TerminalNode FIM_LINHA() { return getToken(GramaticaParser.FIM_LINHA, 0); }
		public Fim_linhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim_linha; }
	}

	public final Fim_linhaContext fim_linha() throws RecognitionException {
		Fim_linhaContext _localctx = new Fim_linhaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fim_linha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FIM_LINHA);
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

	public static class Atribuicao_sinalContext extends ParserRuleContext {
		public TerminalNode ATRIBUICAO() { return getToken(GramaticaParser.ATRIBUICAO, 0); }
		public Atribuicao_sinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_sinal; }
	}

	public final Atribuicao_sinalContext atribuicao_sinal() throws RecognitionException {
		Atribuicao_sinalContext _localctx = new Atribuicao_sinalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atribuicao_sinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ATRIBUICAO);
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
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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

	public static class SomaContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(GramaticaParser.SOMA, 0); }
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_soma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(SOMA);
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
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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

	public static class NuloContext extends ParserRuleContext {
		public TerminalNode NULO() { return getToken(GramaticaParser.NULO, 0); }
		public NuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nulo; }
	}

	public final NuloContext nulo() throws RecognitionException {
		NuloContext _localctx = new NuloContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NULO);
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

	public static class NaoContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(GramaticaParser.NAO, 0); }
		public NaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nao; }
	}

	public final NaoContext nao() throws RecognitionException {
		NaoContext _localctx = new NaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_nao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(NAO);
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

	public static class AparenContext extends ParserRuleContext {
		public TerminalNode APAREN() { return getToken(GramaticaParser.APAREN, 0); }
		public AparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aparen; }
	}

	public final AparenContext aparen() throws RecognitionException {
		AparenContext _localctx = new AparenContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(APAREN);
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

	public static class FparenContext extends ParserRuleContext {
		public TerminalNode FPAREN() { return getToken(GramaticaParser.FPAREN, 0); }
		public FparenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparen; }
	}

	public final FparenContext fparen() throws RecognitionException {
		FparenContext _localctx = new FparenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fparen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FPAREN);
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

	public static class AchaveContext extends ParserRuleContext {
		public TerminalNode ACHAVE() { return getToken(GramaticaParser.ACHAVE, 0); }
		public AchaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_achave; }
	}

	public final AchaveContext achave() throws RecognitionException {
		AchaveContext _localctx = new AchaveContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_achave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ACHAVE);
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

	public static class FchaveContext extends ParserRuleContext {
		public TerminalNode FCHAVE() { return getToken(GramaticaParser.FCHAVE, 0); }
		public FchaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fchave; }
	}

	public final FchaveContext fchave() throws RecognitionException {
		FchaveContext _localctx = new FchaveContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fchave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FCHAVE);
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

	public static class Menor_igualContext extends ParserRuleContext {
		public TerminalNode MENOR_IGUAL() { return getToken(GramaticaParser.MENOR_IGUAL, 0); }
		public Menor_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor_igual; }
	}

	public final Menor_igualContext menor_igual() throws RecognitionException {
		Menor_igualContext _localctx = new Menor_igualContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_menor_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(MENOR_IGUAL);
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

	public static class Maior_igualContext extends ParserRuleContext {
		public TerminalNode MAIOR_IGUAL() { return getToken(GramaticaParser.MAIOR_IGUAL, 0); }
		public Maior_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_igual; }
	}

	public final Maior_igualContext maior_igual() throws RecognitionException {
		Maior_igualContext _localctx = new Maior_igualContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_maior_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(MAIOR_IGUAL);
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

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(GramaticaParser.MENOR, 0); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(MENOR);
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

	public static class MaiorContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(GramaticaParser.MAIOR, 0); }
		public MaiorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior; }
	}

	public final MaiorContext maior() throws RecognitionException {
		MaiorContext _localctx = new MaiorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_maior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(MAIOR);
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(IGUAL);
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

	public static class Nao_igualContext extends ParserRuleContext {
		public TerminalNode NAO_IGUAL() { return getToken(GramaticaParser.NAO_IGUAL, 0); }
		public Nao_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nao_igual; }
	}

	public final Nao_igualContext nao_igual() throws RecognitionException {
		Nao_igualContext _localctx = new Nao_igualContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nao_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(NAO_IGUAL);
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(GramaticaParser.E, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(E);
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

	public static class OuContext extends ParserRuleContext {
		public TerminalNode OU() { return getToken(GramaticaParser.OU, 0); }
		public OuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ou; }
	}

	public final OuContext ou() throws RecognitionException {
		OuContext _localctx = new OuContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ou);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(OU);
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

	public static class SeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(GramaticaParser.SE, 0); }
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(SE);
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

	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(GramaticaParser.SENAO, 0); }
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(SENAO);
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

	public static class VerdadeiroContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(GramaticaParser.VERDADEIRO, 0); }
		public VerdadeiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verdadeiro; }
	}

	public final VerdadeiroContext verdadeiro() throws RecognitionException {
		VerdadeiroContext _localctx = new VerdadeiroContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_verdadeiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(VERDADEIRO);
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

	public static class FalsoContext extends ParserRuleContext {
		public TerminalNode FALSO() { return getToken(GramaticaParser.FALSO, 0); }
		public FalsoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_falso; }
	}

	public final FalsoContext falso() throws RecognitionException {
		FalsoContext _localctx = new FalsoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_falso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FALSO);
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

	public static class BooleanoContext extends ParserRuleContext {
		public VerdadeiroContext verdadeiro() {
			return getRuleContext(VerdadeiroContext.class,0);
		}
		public FalsoContext falso() {
			return getRuleContext(FalsoContext.class,0);
		}
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_booleano);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				verdadeiro();
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				falso();
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

	public static class TextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(GramaticaParser.TEXTO, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TEXTO);
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

	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(GramaticaParser.ENQUANTO, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ENQUANTO);
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

	public static class Separador_atributoContext extends ParserRuleContext {
		public TerminalNode SEPERADOR_ATRIBUTO() { return getToken(GramaticaParser.SEPERADOR_ATRIBUTO, 0); }
		public Separador_atributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separador_atributo; }
	}

	public final Separador_atributoContext separador_atributo() throws RecognitionException {
		Separador_atributoContext _localctx = new Separador_atributoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_separador_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(SEPERADOR_ATRIBUTO);
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

	public static class LerContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(GramaticaParser.LER, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LER);
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(GramaticaParser.IMPRIMIR, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IMPRIMIR);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(GramaticaParser.PARA, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(PARA);
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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

	public static class InteiroContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(GramaticaParser.INTEIRO, 0); }
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(INTEIRO);
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
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\7\5x\n\5\f\5\16\5{\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0089\n\6\3\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00a9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b2\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00b9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00d0\n\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00dd\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00eb\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\5.\u0139"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\2\3\228\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\4\3\2\6\7\3\2\b"+
		"\13\2\u0133\2n\3\2\2\2\4r\3\2\2\2\6t\3\2\2\2\by\3\2\2\2\n\u0088\3\2\2"+
		"\2\f\u008c\3\2\2\2\16\u008e\3\2\2\2\20\u0093\3\2\2\2\22\u009c\3\2\2\2"+
		"\24\u00d5\3\2\2\2\26\u00d7\3\2\2\2\30\u00de\3\2\2\2\32\u00e1\3\2\2\2\34"+
		"\u00ea\3\2\2\2\36\u00ec\3\2\2\2 \u00f6\3\2\2\2\"\u00f9\3\2\2\2$\u00ff"+
		"\3\2\2\2&\u0102\3\2\2\2(\u0104\3\2\2\2*\u0106\3\2\2\2,\u0108\3\2\2\2."+
		"\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u010e\3\2\2\2\64\u0110\3\2\2\2\66\u0112"+
		"\3\2\2\28\u0114\3\2\2\2:\u0116\3\2\2\2<\u0118\3\2\2\2>\u011a\3\2\2\2@"+
		"\u011c\3\2\2\2B\u011e\3\2\2\2D\u0120\3\2\2\2F\u0122\3\2\2\2H\u0124\3\2"+
		"\2\2J\u0126\3\2\2\2L\u0128\3\2\2\2N\u012a\3\2\2\2P\u012c\3\2\2\2R\u012e"+
		"\3\2\2\2T\u0130\3\2\2\2V\u0132\3\2\2\2X\u0134\3\2\2\2Z\u0138\3\2\2\2\\"+
		"\u013a\3\2\2\2^\u013c\3\2\2\2`\u013e\3\2\2\2b\u0140\3\2\2\2d\u0142\3\2"+
		"\2\2f\u0144\3\2\2\2h\u0146\3\2\2\2j\u0148\3\2\2\2l\u014a\3\2\2\2no\5\4"+
		"\3\2op\5\b\5\2pq\5\6\4\2q\3\3\2\2\2rs\7\3\2\2s\5\3\2\2\2tu\7\4\2\2u\7"+
		"\3\2\2\2vx\5\n\6\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\t\3\2\2\2"+
		"{y\3\2\2\2|}\5\f\7\2}~\5*\26\2~\u0089\3\2\2\2\177\u0089\5\26\f\2\u0080"+
		"\u0089\5\32\16\2\u0081\u0089\5\36\20\2\u0082\u0083\5\"\22\2\u0083\u0084"+
		"\5*\26\2\u0084\u0089\3\2\2\2\u0085\u0086\5$\23\2\u0086\u0087\5*\26\2\u0087"+
		"\u0089\3\2\2\2\u0088|\3\2\2\2\u0088\177\3\2\2\2\u0088\u0080\3\2\2\2\u0088"+
		"\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0085\3\2\2\2\u0089\13\3\2\2"+
		"\2\u008a\u008d\5\16\b\2\u008b\u008d\5\20\t\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\5(\25\2\u008f\u0090\5h\65\2"+
		"\u0090\u0091\5,\27\2\u0091\u0092\5\22\n\2\u0092\17\3\2\2\2\u0093\u0094"+
		"\5h\65\2\u0094\u0095\5,\27\2\u0095\u0096\5\22\n\2\u0096\21\3\2\2\2\u0097"+
		"\u0098\b\n\1\2\u0098\u0099\58\35\2\u0099\u009a\5\22\n\n\u009a\u009d\3"+
		"\2\2\2\u009b\u009d\5\24\13\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u00c6\3\2\2\2\u009e\u00a1\f\t\2\2\u009f\u00a2\5.\30\2\u00a0\u00a2\5\60"+
		"\31\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\5\22\n\n\u00a4\u00c5\3\2\2\2\u00a5\u00a8\f\b\2\2\u00a6\u00a9\5"+
		"\62\32\2\u00a7\u00a9\5\64\33\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5\22\n\t\u00ab\u00c5\3\2\2\2\u00ac\u00b1"+
		"\f\7\2\2\u00ad\u00b2\5B\"\2\u00ae\u00b2\5D#\2\u00af\u00b2\5F$\2\u00b0"+
		"\u00b2\5H%\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\5\22\n\b\u00b4"+
		"\u00c5\3\2\2\2\u00b5\u00b8\f\6\2\2\u00b6\u00b9\5J&\2\u00b7\u00b9\5L\'"+
		"\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\5\22\n\7\u00bb\u00c5\3\2\2\2\u00bc\u00bd\f\5\2\2\u00bd\u00be\5N(\2\u00be"+
		"\u00bf\5\22\n\6\u00bf\u00c5\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2\5"+
		"P)\2\u00c2\u00c3\5\22\n\5\u00c3\u00c5\3\2\2\2\u00c4\u009e\3\2\2\2\u00c4"+
		"\u00a5\3\2\2\2\u00c4\u00ac\3\2\2\2\u00c4\u00b5\3\2\2\2\u00c4\u00bc\3\2"+
		"\2\2\u00c4\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\5:\36"+
		"\2\u00ca\u00cb\5\22\n\2\u00cb\u00cc\5<\37\2\u00cc\u00d6\3\2\2\2\u00cd"+
		"\u00d0\5l\67\2\u00ce\u00d0\5j\66\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d6\5Z.\2\u00d2\u00d6\5h\65\2\u00d3\u00d6"+
		"\5\\/\2\u00d4\u00d6\5\66\34\2\u00d5\u00c9\3\2\2\2\u00d5\u00cf\3\2\2\2"+
		"\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d8\5R*\2\u00d8\u00dc\5\30\r\2\u00d9"+
		"\u00da\5T+\2\u00da\u00db\5\34\17\2\u00db\u00dd\3\2\2\2\u00dc\u00d9\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00df\5\22\n\2\u00df\u00e0"+
		"\5\34\17\2\u00e0\31\3\2\2\2\u00e1\u00e2\5^\60\2\u00e2\u00e3\5\22\n\2\u00e3"+
		"\u00e4\5\34\17\2\u00e4\33\3\2\2\2\u00e5\u00e6\5> \2\u00e6\u00e7\5\b\5"+
		"\2\u00e7\u00e8\5@!\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5\n\6\2\u00ea\u00e5"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\35\3\2\2\2\u00ec\u00ed\5f\64\2\u00ed"+
		"\u00ee\5:\36\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\5`\61\2\u00f0\u00f1\5"+
		"\22\n\2\u00f1\u00f2\5`\61\2\u00f2\u00f3\5 \21\2\u00f3\u00f4\5<\37\2\u00f4"+
		"\u00f5\5\34\17\2\u00f5\37\3\2\2\2\u00f6\u00f7\5h\65\2\u00f7\u00f8\5&\24"+
		"\2\u00f8!\3\2\2\2\u00f9\u00fa\5h\65\2\u00fa\u00fb\5,\27\2\u00fb\u00fc"+
		"\5b\62\2\u00fc\u00fd\5:\36\2\u00fd\u00fe\5<\37\2\u00fe#\3\2\2\2\u00ff"+
		"\u0100\5d\63\2\u0100\u0101\5\22\n\2\u0101%\3\2\2\2\u0102\u0103\t\2\2\2"+
		"\u0103\'\3\2\2\2\u0104\u0105\t\3\2\2\u0105)\3\2\2\2\u0106\u0107\7\f\2"+
		"\2\u0107+\3\2\2\2\u0108\u0109\7\r\2\2\u0109-\3\2\2\2\u010a\u010b\7\16"+
		"\2\2\u010b/\3\2\2\2\u010c\u010d\7\17\2\2\u010d\61\3\2\2\2\u010e\u010f"+
		"\7\20\2\2\u010f\63\3\2\2\2\u0110\u0111\7\21\2\2\u0111\65\3\2\2\2\u0112"+
		"\u0113\7\22\2\2\u0113\67\3\2\2\2\u0114\u0115\7\23\2\2\u01159\3\2\2\2\u0116"+
		"\u0117\7\24\2\2\u0117;\3\2\2\2\u0118\u0119\7\25\2\2\u0119=\3\2\2\2\u011a"+
		"\u011b\7\26\2\2\u011b?\3\2\2\2\u011c\u011d\7\27\2\2\u011dA\3\2\2\2\u011e"+
		"\u011f\7\30\2\2\u011fC\3\2\2\2\u0120\u0121\7\31\2\2\u0121E\3\2\2\2\u0122"+
		"\u0123\7\32\2\2\u0123G\3\2\2\2\u0124\u0125\7\33\2\2\u0125I\3\2\2\2\u0126"+
		"\u0127\7\34\2\2\u0127K\3\2\2\2\u0128\u0129\7\35\2\2\u0129M\3\2\2\2\u012a"+
		"\u012b\7\36\2\2\u012bO\3\2\2\2\u012c\u012d\7\37\2\2\u012dQ\3\2\2\2\u012e"+
		"\u012f\7 \2\2\u012fS\3\2\2\2\u0130\u0131\7!\2\2\u0131U\3\2\2\2\u0132\u0133"+
		"\7\"\2\2\u0133W\3\2\2\2\u0134\u0135\7#\2\2\u0135Y\3\2\2\2\u0136\u0139"+
		"\5V,\2\u0137\u0139\5X-\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"[\3\2\2\2\u013a\u013b\7$\2\2\u013b]\3\2\2\2\u013c\u013d\7%\2\2\u013d_"+
		"\3\2\2\2\u013e\u013f\7&\2\2\u013fa\3\2\2\2\u0140\u0141\7\'\2\2\u0141c"+
		"\3\2\2\2\u0142\u0143\7(\2\2\u0143e\3\2\2\2\u0144\u0145\7)\2\2\u0145g\3"+
		"\2\2\2\u0146\u0147\7*\2\2\u0147i\3\2\2\2\u0148\u0149\7+\2\2\u0149k\3\2"+
		"\2\2\u014a\u014b\7,\2\2\u014bm\3\2\2\2\21y\u0088\u008c\u009c\u00a1\u00a8"+
		"\u00b1\u00b8\u00c4\u00c6\u00cf\u00d5\u00dc\u00ea\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
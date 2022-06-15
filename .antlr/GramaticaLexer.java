// Generated from c:\Users\Theo\Documents\GitHub\grammar-to-java-compiler\Gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "MENOS_MENOS", "MAIS_MAIS", "TV_INTEIRO", "TV_BOOLEANO", 
			"TV_TEXTO", "TV_DECIMAL", "FIM_LINHA", "ATRIBUICAO", "MULT", "DIV", "SOMA", 
			"SUB", "NULO", "NAO", "APAREN", "FPAREN", "ACHAVE", "FCHAVE", "MENOR_IGUAL", 
			"MAIOR_IGUAL", "MENOR", "MAIOR", "IGUAL", "NAO_IGUAL", "E", "OU", "SE", 
			"SENAO", "VERDADEIRO", "FALSO", "TEXTO", "ENQUANTO", "SEPERADOR_ATRIBUTO", 
			"LER", "IMPRIMIR", "PARA", "ID", "DECIMAL", "INTEIRO"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\6\4k\n\4\r\4\16\4l\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\7#\u00e2\n#\f#\16#\u00e5\13#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3)\3)\7)\u0108\n)\f)\16)\u010b\13)\3*\6*\u010e\n*\r*\16*\u010f"+
		"\3*\3*\7*\u0114\n*\f*\16*\u0117\13*\3+\6+\u011a\n+\r+\16+\u011b\2\2,\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\7\5\2\13\f\17\17\"\"\5\2\f\f\17\17$$\5"+
		"\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u0123\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5_\3\2\2"+
		"\2\7j\3\2\2\2\tp\3\2\2\2\13s\3\2\2\2\rv\3\2\2\2\17~\3\2\2\2\21\u0087\3"+
		"\2\2\2\23\u008d\3\2\2\2\25\u0095\3\2\2\2\27\u0097\3\2\2\2\31\u0099\3\2"+
		"\2\2\33\u009b\3\2\2\2\35\u009d\3\2\2\2\37\u009f\3\2\2\2!\u00a1\3\2\2\2"+
		"#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3"+
		"\2\2\2-\u00ad\3\2\2\2/\u00b0\3\2\2\2\61\u00b3\3\2\2\2\63\u00b5\3\2\2\2"+
		"\65\u00b7\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c0\3\2\2\2=\u00c3"+
		"\3\2\2\2?\u00c6\3\2\2\2A\u00cc\3\2\2\2C\u00d7\3\2\2\2E\u00dd\3\2\2\2G"+
		"\u00e8\3\2\2\2I\u00f1\3\2\2\2K\u00f3\3\2\2\2M\u00f7\3\2\2\2O\u0100\3\2"+
		"\2\2Q\u0105\3\2\2\2S\u010d\3\2\2\2U\u0119\3\2\2\2WX\7k\2\2XY\7p\2\2YZ"+
		"\7k\2\2Z[\7e\2\2[\\\7k\2\2\\]\7c\2\2]^\7t\2\2^\4\3\2\2\2_`\7h\2\2`a\7"+
		"k\2\2ab\7p\2\2bc\7c\2\2cd\7n\2\2de\7k\2\2ef\7|\2\2fg\7c\2\2gh\7t\2\2h"+
		"\6\3\2\2\2ik\t\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2"+
		"no\b\4\2\2o\b\3\2\2\2pq\7/\2\2qr\7/\2\2r\n\3\2\2\2st\7-\2\2tu\7-\2\2u"+
		"\f\3\2\2\2vw\7k\2\2wx\7p\2\2xy\7v\2\2yz\7g\2\2z{\7k\2\2{|\7t\2\2|}\7q"+
		"\2\2}\16\3\2\2\2~\177\7d\2\2\177\u0080\7q\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2"+
		"\u0085\u0086\7q\2\2\u0086\20\3\2\2\2\u0087\u0088\7v\2\2\u0088\u0089\7"+
		"g\2\2\u0089\u008a\7z\2\2\u008a\u008b\7v\2\2\u008b\u008c\7q\2\2\u008c\22"+
		"\3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7n\2\2"+
		"\u0094\24\3\2\2\2\u0095\u0096\7=\2\2\u0096\26\3\2\2\2\u0097\u0098\7?\2"+
		"\2\u0098\30\3\2\2\2\u0099\u009a\7,\2\2\u009a\32\3\2\2\2\u009b\u009c\7"+
		"\61\2\2\u009c\34\3\2\2\2\u009d\u009e\7-\2\2\u009e\36\3\2\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7\"\2\2\u00a2\"\3\2\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7"+
		"+\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7\177"+
		"\2\2\u00ac,\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7?\2\2\u00af.\3\2\2"+
		"\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2\2\u00b2\60\3\2\2\2\u00b3\u00b4"+
		"\7>\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\64\3\2\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8\u00b9\7?\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc"+
		"\7?\2\2\u00bc8\3\2\2\2\u00bd\u00be\7(\2\2\u00be\u00bf\7(\2\2\u00bf:\3"+
		"\2\2\2\u00c0\u00c1\7~\2\2\u00c1\u00c2\7~\2\2\u00c2<\3\2\2\2\u00c3\u00c4"+
		"\7u\2\2\u00c4\u00c5\7g\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8"+
		"\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7t\2\2\u00cf"+
		"\u00d0\7f\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3\u00d4\7k\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7q\2\2\u00d6B\3\2\2"+
		"\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db"+
		"\7u\2\2\u00db\u00dc\7q\2\2\u00dcD\3\2\2\2\u00dd\u00e3\7$\2\2\u00de\u00e2"+
		"\n\3\2\2\u00df\u00e0\7$\2\2\u00e0\u00e2\7$\2\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7"+
		"F\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7s\2\2\u00eb"+
		"\u00ec\7w\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7v\2\2"+
		"\u00ef\u00f0\7q\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7.\2\2\u00f2J\3\2\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7t\2\2\u00f6L\3\2\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7t\2\2"+
		"\u00fb\u00fc\7k\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff"+
		"\7t\2\2\u00ffN\3\2\2\2\u0100\u0101\7r\2\2\u0101\u0102\7c\2\2\u0102\u0103"+
		"\7t\2\2\u0103\u0104\7c\2\2\u0104P\3\2\2\2\u0105\u0109\t\4\2\2\u0106\u0108"+
		"\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010aR\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\t\6\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0115\7\60\2\2\u0112\u0114\t\6\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116T\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\t\6\2\2\u0119"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011cV\3\2\2\2\n\2l\u00e1\u00e3\u0109\u010f\u0115\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
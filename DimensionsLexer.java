// Generated from Dimensions.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimensionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, DIGIT=13, LETTER=14, DIMID=15, ID=16, COMMENT=17, 
		MULTICOMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "DIGIT", "LETTER", "DIMID", "ID", "COMMENT", 
			"MULTICOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", "'.addUnit('", "')'", "'/'", "'*'", "','", "'='", 
			"'op'", "'real'", "'int'", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DIGIT", "LETTER", "DIMID", "ID", "COMMENT", "MULTICOMMENT", "WS"
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


	public DimensionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dimensions.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\6\16R\n\16\r\16\16"+
		"\16S\3\17\3\17\3\20\6\20Y\n\20\r\20\16\20Z\3\21\3\21\7\21_\n\21\f\21\16"+
		"\21b\13\21\3\22\3\22\3\22\3\22\7\22h\n\22\f\22\16\22k\13\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\7\23u\n\23\f\23\16\23x\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\4iv\2\25\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3"+
		"\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0086\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2"+
		"\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25E\3\2\2\2\27J\3\2\2\2\31N\3"+
		"\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37X\3\2\2\2!\\\3\2\2\2#c\3\2\2\2%p\3\2"+
		"\2\2\'~\3\2\2\2)*\7=\2\2*\4\3\2\2\2+,\7/\2\2,-\7@\2\2-\6\3\2\2\2./\7\60"+
		"\2\2/\60\7c\2\2\60\61\7f\2\2\61\62\7f\2\2\62\63\7W\2\2\63\64\7p\2\2\64"+
		"\65\7k\2\2\65\66\7v\2\2\66\67\7*\2\2\67\b\3\2\2\289\7+\2\29\n\3\2\2\2"+
		":;\7\61\2\2;\f\3\2\2\2<=\7,\2\2=\16\3\2\2\2>?\7.\2\2?\20\3\2\2\2@A\7?"+
		"\2\2A\22\3\2\2\2BC\7q\2\2CD\7r\2\2D\24\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7c"+
		"\2\2HI\7n\2\2I\26\3\2\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\30\3\2\2\2NO\7*"+
		"\2\2O\32\3\2\2\2PR\t\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\34"+
		"\3\2\2\2UV\t\3\2\2V\36\3\2\2\2WY\5\35\17\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[ \3\2\2\2\\`\5\35\17\2]_\5\35\17\2^]\3\2\2\2_b\3\2\2\2`^"+
		"\3\2\2\2`a\3\2\2\2a\"\3\2\2\2b`\3\2\2\2cd\7\61\2\2de\7\61\2\2ei\3\2\2"+
		"\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij\3\2\2\2ig\3\2\2\2jl\3\2\2\2ki\3\2"+
		"\2\2lm\7\f\2\2mn\3\2\2\2no\b\22\2\2o$\3\2\2\2pq\7\61\2\2qr\7,\2\2rv\3"+
		"\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2\2\2vt\3\2\2\2wy\3\2\2\2xv"+
		"\3\2\2\2yz\7,\2\2z{\7\61\2\2{|\3\2\2\2|}\b\23\2\2}&\3\2\2\2~\177\t\4\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\b\24\2\2\u0081(\3\2\2\2\b\2SZ`iv\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
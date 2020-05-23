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
		T__9=10, DIGIT=11, DIMID=12, ID=13, LETTER=14, COMMENT=15, MULTICOMMENT=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "DIGIT", "DIMID", "ID", "LETTER", "COMMENT", "MULTICOMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", "'-> addUnit'", "'*'", "'/'", "'='", "'real'", "'integer'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "DIGIT", 
			"DIMID", "ID", "LETTER", "COMMENT", "MULTICOMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\6\fN\n\f\r\f\16\fO\3\r\3\r\6\rT\n\r\r\r\16\rU\3"+
		"\16\6\16Y\n\16\r\16\16\16Z\3\17\3\17\3\20\3\20\3\20\3\20\7\20c\n\20\f"+
		"\20\16\20f\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21p\n\21\f"+
		"\21\16\21s\13\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\4dq\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23\3\2\6\3\2\62;\3\2C\\\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0081"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3%\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3"+
		"\2\2\2\17;\3\2\2\2\21@\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27M\3\2\2\2\31"+
		"Q\3\2\2\2\33X\3\2\2\2\35\\\3\2\2\2\37^\3\2\2\2!k\3\2\2\2#y\3\2\2\2%&\7"+
		"=\2\2&\4\3\2\2\2\'(\7/\2\2()\7@\2\2)\6\3\2\2\2*+\7/\2\2+,\7@\2\2,-\7\""+
		"\2\2-.\7c\2\2./\7f\2\2/\60\7f\2\2\60\61\7W\2\2\61\62\7p\2\2\62\63\7k\2"+
		"\2\63\64\7v\2\2\64\b\3\2\2\2\65\66\7,\2\2\66\n\3\2\2\2\678\7\61\2\28\f"+
		"\3\2\2\29:\7?\2\2:\16\3\2\2\2;<\7t\2\2<=\7g\2\2=>\7c\2\2>?\7n\2\2?\20"+
		"\3\2\2\2@A\7k\2\2AB\7p\2\2BC\7v\2\2CD\7g\2\2DE\7i\2\2EF\7g\2\2FG\7t\2"+
		"\2G\22\3\2\2\2HI\7*\2\2I\24\3\2\2\2JK\7+\2\2K\26\3\2\2\2LN\t\2\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\30\3\2\2\2QS\t\3\2\2RT\5\35\17\2"+
		"SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\32\3\2\2\2WY\5\35\17\2XW\3\2"+
		"\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\34\3\2\2\2\\]\t\4\2\2]\36\3\2\2\2"+
		"^_\7\61\2\2_`\7\61\2\2`d\3\2\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2"+
		"\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\f\2\2hi\3\2\2\2ij\b\20\2\2j \3"+
		"\2\2\2kl\7\61\2\2lm\7,\2\2mq\3\2\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2\2qr"+
		"\3\2\2\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7,\2\2uv\7\61\2\2vw\3\2\2\2w"+
		"x\b\21\2\2x\"\3\2\2\2yz\t\5\2\2z{\3\2\2\2{|\b\22\2\2|$\3\2\2\2\b\2OUZ"+
		"dq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
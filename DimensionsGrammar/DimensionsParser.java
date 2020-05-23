// Generated from Dimensions.g4 by ANTLR 4.8

import java.util.Map;
import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DimensionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, DIGIT=11, DIMID=12, ID=13, LETTER=14, COMMENT=15, MULTICOMMENT=16, 
		WS=17;
	public static final int
		RULE_program = 0, RULE_stats = 1, RULE_declaration = 2, RULE_addunit = 3, 
		RULE_type = 4, RULE_conversion = 5, RULE_datatype = 6, RULE_unit = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stats", "declaration", "addunit", "type", "conversion", "datatype", 
			"unit"
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

	@Override
	public String getGrammarFileName() { return "Dimensions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static protected Map<String,Dimension> dimTable = new HashMap<>();

	public DimensionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public TerminalNode EOF() { return getToken(DimensionsParser.EOF, 0); }
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitProg(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIMID) {
				{
				{
				setState(16);
				stats();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
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

	public static class StatsContext extends ParserRuleContext {
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	 
		public StatsContext() { }
		public void copyFrom(StatsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatContext extends StatsContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AddunitContext addunit() {
			return getRuleContext(AddunitContext.class,0);
		}
		public StatContext(StatsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitStat(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stats);
		try {
			_localctx = new StatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(24);
				declaration();
				}
				break;
			case 2:
				{
				setState(25);
				addunit();
				}
				break;
			}
			setState(28);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarContext extends DeclarationContext {
		public TerminalNode DIMID() { return getToken(DimensionsParser.DIMID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitDeclar(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			_localctx = new DeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(DIMID);
			setState(31);
			match(T__1);
			setState(32);
			type();
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

	public static class AddunitContext extends ParserRuleContext {
		public AddunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addunit; }
	 
		public AddunitContext() { }
		public void copyFrom(AddunitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddUnContext extends AddunitContext {
		public TerminalNode DIMID() { return getToken(DimensionsParser.DIMID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AddUnContext(AddunitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterAddUn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitAddUn(this);
		}
	}

	public final AddunitContext addunit() throws RecognitionException {
		AddunitContext _localctx = new AddunitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addunit);
		try {
			_localctx = new AddUnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DIMID);
			setState(35);
			match(T__2);
			setState(36);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeConversionsContext extends TypeContext {
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public TypeConversionsContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterTypeConversions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitTypeConversions(this);
		}
	}
	public static class TypeNormalContext extends TypeContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TypeNormalContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterTypeNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitTypeNormal(this);
		}
	}
	public static class TypeVarsContext extends TypeContext {
		public Token op;
		public List<TerminalNode> DIMID() { return getTokens(DimensionsParser.DIMID); }
		public TerminalNode DIMID(int i) {
			return getToken(DimensionsParser.DIMID, i);
		}
		public TypeVarsContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterTypeVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitTypeVars(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				_localctx = new TypeNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				datatype();
				setState(39);
				unit();
				}
				break;
			case DIMID:
				_localctx = new TypeVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(DIMID);
				setState(42);
				((TypeVarsContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((TypeVarsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				match(DIMID);
				}
				break;
			case ID:
				_localctx = new TypeConversionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				conversion();
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

	public static class ConversionContext extends ParserRuleContext {
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
	 
		public ConversionContext() { }
		public void copyFrom(ConversionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConvCheckContext extends ConversionContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(DimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DimensionsParser.ID, i);
		}
		public TerminalNode DIGIT() { return getToken(DimensionsParser.DIGIT, 0); }
		public ConvCheckContext(ConversionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterConvCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitConvCheck(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conversion);
		int _la;
		try {
			_localctx = new ConvCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(48);
			match(T__5);
			setState(49);
			match(DIGIT);
			setState(50);
			((ConvCheckContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
				((ConvCheckContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class UnitContext extends ParserRuleContext {
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	 
		public UnitContext() { }
		public void copyFrom(UnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnitCheckContext extends UnitContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(DimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DimensionsParser.ID, i);
		}
		public UnitCheckContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).enterUnitCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DimensionsListener ) ((DimensionsListener)listener).exitUnitCheck(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unit);
		int _la;
		try {
			_localctx = new UnitCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__8);
			setState(56);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(57);
				((UnitCheckContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((UnitCheckContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				match(ID);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(T__9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\3\2\3\3\3\3\5\3\35\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t>\n\t\f\t\16\tA\13\t\3\t\3\t\3\t\2\2\n"+
		"\2\4\6\b\n\f\16\20\2\4\3\2\6\7\3\2\t\n\2A\2\25\3\2\2\2\4\34\3\2\2\2\6"+
		" \3\2\2\2\b$\3\2\2\2\n/\3\2\2\2\f\61\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2"+
		"\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2"+
		"\26\30\3\2\2\2\27\25\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\35\5\6\4\2"+
		"\33\35\5\b\5\2\34\32\3\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\37\7\3\2\2"+
		"\37\5\3\2\2\2 !\7\16\2\2!\"\7\4\2\2\"#\5\n\6\2#\7\3\2\2\2$%\7\16\2\2%"+
		"&\7\5\2\2&\'\5\n\6\2\'\t\3\2\2\2()\5\16\b\2)*\5\20\t\2*\60\3\2\2\2+,\7"+
		"\16\2\2,-\t\2\2\2-\60\7\16\2\2.\60\5\f\7\2/(\3\2\2\2/+\3\2\2\2/.\3\2\2"+
		"\2\60\13\3\2\2\2\61\62\7\17\2\2\62\63\7\b\2\2\63\64\7\r\2\2\64\65\t\2"+
		"\2\2\65\66\7\17\2\2\66\r\3\2\2\2\678\t\3\2\28\17\3\2\2\29:\7\13\2\2:?"+
		"\7\17\2\2;<\t\2\2\2<>\7\17\2\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@B\3\2\2\2A?\3\2\2\2BC\7\f\2\2C\21\3\2\2\2\6\25\34/?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
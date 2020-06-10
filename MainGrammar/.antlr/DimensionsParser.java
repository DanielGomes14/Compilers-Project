// Generated from c:\Users\ASUS\Desktop\Compiler-Project\MainGrammar\Dimensions.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, REAL=11, INTEGER=12, ID=13, LETTER=14, COMMENT=15, MULTICOMMENT=16, 
		WS=17;
	public static final int
		RULE_program = 0, RULE_stats = 1, RULE_declaration = 2, RULE_addunit = 3, 
		RULE_type = 4, RULE_conversion = 5, RULE_datatype = 6, RULE_unit = 7, 
		RULE_number = 8;
	public static final String[] ruleNames = {
		"program", "stats", "declaration", "addunit", "type", "conversion", "datatype", 
		"unit", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'->'", "'-> addUnit'", "'*'", "'/'", "'='", "'real'", "'integer'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "REAL", 
		"INTEGER", "ID", "LETTER", "COMMENT", "MULTICOMMENT", "WS"
	};
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


	static protected Map <String,Dimension> dimTable = new HashMap<>();                                          // ( m, Length )

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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(18);
				stats();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stats);
		try {
			_localctx = new StatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(26);
				declaration();
				}
				break;
			case 2:
				{
				setState(27);
				addunit();
				}
				break;
			}
			setState(30);
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
		public TerminalNode ID() { return getToken(DimensionsParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclarContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			_localctx = new DeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(ID);
			setState(33);
			match(T__1);
			setState(34);
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
		public TerminalNode ID() { return getToken(DimensionsParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AddUnContext(AddunitContext ctx) { copyFrom(ctx); }
	}

	public final AddunitContext addunit() throws RecognitionException {
		AddunitContext _localctx = new AddunitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addunit);
		try {
			_localctx = new AddUnContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__2);
			setState(38);
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
	}
	public static class TypeNormalContext extends TypeContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TypeNormalContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class TypeVarsContext extends TypeContext {
		public Token op;
		public List<TerminalNode> ID() { return getTokens(DimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DimensionsParser.ID, i);
		}
		public TypeVarsContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new TypeNormalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				datatype();
				setState(41);
				unit();
				}
				break;
			case 2:
				_localctx = new TypeVarsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(ID);
				setState(44);
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
				setState(45);
				match(ID);
				}
				break;
			case 3:
				_localctx = new TypeConversionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				conversion();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ConvCheckContext(ConversionContext ctx) { copyFrom(ctx); }
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conversion);
		int _la;
		try {
			_localctx = new ConvCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(T__5);
			setState(51);
			number();
			setState(52);
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
			setState(53);
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
	 
		public DatatypeContext() { }
		public void copyFrom(DatatypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DTypeCheckContext extends DatatypeContext {
		public Token dt;
		public DTypeCheckContext(DatatypeContext ctx) { copyFrom(ctx); }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datatype);
		int _la;
		try {
			_localctx = new DTypeCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((DTypeCheckContext)_localctx).dt = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
				((DTypeCheckContext)_localctx).dt = (Token)_errHandler.recoverInline(this);
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
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unit);
		int _la;
		try {
			_localctx = new UnitCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__8);
			setState(58);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__4) {
				{
				{
				setState(59);
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
				setState(60);
				match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(DimensionsParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(DimensionsParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==REAL || _la==INTEGER) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\5\3\37\n\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\t\3\t\3"+
		"\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\6\7\3\2\t\n\3\2\r\16\2"+
		"D\2\27\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b&\3\2\2\2\n\61\3\2\2\2\f\63\3"+
		"\2\2\2\169\3\2\2\2\20;\3\2\2\2\22F\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2"+
		"\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2"+
		"\32\33\7\2\2\3\33\3\3\2\2\2\34\37\5\6\4\2\35\37\5\b\5\2\36\34\3\2\2\2"+
		"\36\35\3\2\2\2\37 \3\2\2\2 !\7\3\2\2!\5\3\2\2\2\"#\7\17\2\2#$\7\4\2\2"+
		"$%\5\n\6\2%\7\3\2\2\2&\'\7\17\2\2\'(\7\5\2\2()\5\n\6\2)\t\3\2\2\2*+\5"+
		"\16\b\2+,\5\20\t\2,\62\3\2\2\2-.\7\17\2\2./\t\2\2\2/\62\7\17\2\2\60\62"+
		"\5\f\7\2\61*\3\2\2\2\61-\3\2\2\2\61\60\3\2\2\2\62\13\3\2\2\2\63\64\7\17"+
		"\2\2\64\65\7\b\2\2\65\66\5\22\n\2\66\67\t\2\2\2\678\7\17\2\28\r\3\2\2"+
		"\29:\t\3\2\2:\17\3\2\2\2;<\7\13\2\2<A\7\17\2\2=>\t\2\2\2>@\7\17\2\2?="+
		"\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\f\2\2E"+
		"\21\3\2\2\2FG\t\4\2\2G\23\3\2\2\2\6\27\36\61A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from MainGram.g4 by ANTLR 4.8

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
public class MainGramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, BOOLEAN=33, DIMID=34, LETTER=35, ID=36, REAL=37, INTEGER=38, 
		COMMENT=39, MULTICOMMENT=40, WS=41, STRING=42;
	public static final int
		RULE_main = 0, RULE_statList = 1, RULE_stat = 2, RULE_print = 3, RULE_importDims = 4, 
		RULE_assignment = 5, RULE_declaration = 6, RULE_conditionalstat = 7, RULE_conditional = 8, 
		RULE_elseif = 9, RULE_forloop = 10, RULE_whileloop = 11, RULE_idList = 12, 
		RULE_input = 13, RULE_increment = 14, RULE_type = 15, RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statList", "stat", "print", "importDims", "assignment", "declaration", 
			"conditionalstat", "conditional", "elseif", "forloop", "whileloop", "idList", 
			"input", "increment", "type", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'println'", "'import'", "'='", "'if'", "'('", "')'", "'{'", 
			"'}'", "'else'", "'for'", "'while'", "','", "'scan'", "'++'", "'--'", 
			"'integer'", "'real'", "'boolean'", "'string'", "'^'", "'+'", "'-'", 
			"'!'", "'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOLEAN", "DIMID", 
			"LETTER", "ID", "REAL", "INTEGER", "COMMENT", "MULTICOMMENT", "WS", "STRING"
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
	public String getGrammarFileName() { return "MainGram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	static protected Map<String,Symbol> symbolTable = new HashMap<>();

	public MainGramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MainGramParser.EOF, 0); }
		public List<ImportDimsContext> importDims() {
			return getRuleContexts(ImportDimsContext.class);
		}
		public ImportDimsContext importDims(int i) {
			return getRuleContext(ImportDimsContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(34);
				importDims();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			statList();
			setState(41);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitStatList(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__10) | (1L << T__11) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << DIMID) | (1L << ID))) != 0)) {
				{
				{
				setState(43);
				stat();
				setState(44);
				match(T__0);
				}
				}
				setState(50);
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

	public static class StatContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalstatContext conditionalstat() {
			return getRuleContext(ConditionalstatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				assignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				conditionalstat();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckPrintContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CheckPrintContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterCheckPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitCheckPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			_localctx = new CheckPrintContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			expr(0);
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

	public static class ImportDimsContext extends ParserRuleContext {
		public ImportDimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDims; }
	 
		public ImportDimsContext() { }
		public void copyFrom(ImportDimsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportDimensionFileContext extends ImportDimsContext {
		public TerminalNode ID() { return getToken(MainGramParser.ID, 0); }
		public ImportDimensionFileContext(ImportDimsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterImportDimensionFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitImportDimensionFile(this);
		}
	}

	public final ImportDimsContext importDims() throws RecognitionException {
		ImportDimsContext _localctx = new ImportDimsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDims);
		try {
			_localctx = new ImportDimensionFileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(61);
			match(ID);
			setState(62);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecAssignContext extends AssignmentContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterDecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitDecAssign(this);
		}
	}
	public static class AssignContext extends AssignmentContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitAssign(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case DIMID:
				_localctx = new DecAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				declaration();
				setState(65);
				match(T__3);
				setState(66);
				expr(0);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				idList();
				setState(69);
				match(T__3);
				setState(70);
				expr(0);
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
	public static class DecContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public DecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitDec(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			_localctx = new DecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			idList();
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

	public static class ConditionalstatContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public ConditionalstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterConditionalstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitConditionalstat(this);
		}
	}

	public final ConditionalstatContext conditionalstat() throws RecognitionException {
		ConditionalstatContext _localctx = new ConditionalstatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_conditionalstat);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				conditional();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				forloop();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				whileloop();
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

	public static class ConditionalContext extends ParserRuleContext {
		public StatListContext trueSL;
		public ElseifContext falseSL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public ElseifContext elseif() {
			return getRuleContext(ElseifContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(83);
			match(T__5);
			setState(84);
			expr(0);
			setState(85);
			match(T__6);
			setState(86);
			match(T__7);
			setState(87);
			((ConditionalContext)_localctx).trueSL = statList();
			setState(88);
			match(T__8);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(89);
				match(T__9);
				setState(90);
				((ConditionalContext)_localctx).falseSL = elseif();
				}
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

	public static class ElseifContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitElseif(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseif);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				conditional();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__7);
				setState(95);
				statList();
				setState(96);
				match(T__8);
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

	public static class ForloopContext extends ParserRuleContext {
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
	 
		public ForloopContext() { }
		public void copyFrom(ForloopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends ForloopContext {
		public StatListContext trueSL;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public ForCondContext(ForloopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitForCond(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forloop);
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__10);
			setState(101);
			match(T__5);
			setState(102);
			assignment();
			setState(103);
			match(T__0);
			setState(104);
			expr(0);
			setState(105);
			match(T__0);
			setState(106);
			expr(0);
			setState(107);
			match(T__6);
			setState(108);
			match(T__7);
			setState(109);
			((ForCondContext)_localctx).trueSL = statList();
			setState(110);
			match(T__8);
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

	public static class WhileloopContext extends ParserRuleContext {
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	 
		public WhileloopContext() { }
		public void copyFrom(WhileloopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileCondContext extends WhileloopContext {
		public StatListContext trueSL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public WhileCondContext(WhileloopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterWhileCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitWhileCond(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileloop);
		try {
			_localctx = new WhileCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__11);
			setState(113);
			match(T__5);
			setState(114);
			expr(0);
			setState(115);
			match(T__6);
			setState(116);
			match(T__7);
			setState(117);
			((WhileCondContext)_localctx).trueSL = statList();
			setState(118);
			match(T__8);
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

	public static class IdListContext extends ParserRuleContext {
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
	 
		public IdListContext() { }
		public void copyFrom(IdListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckIDListContext extends IdListContext {
		public List<TerminalNode> ID() { return getTokens(MainGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MainGramParser.ID, i);
		}
		public CheckIDListContext(IdListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterCheckIDList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitCheckIDList(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_idList);
		int _la;
		try {
			_localctx = new CheckIDListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(121);
				match(T__12);
				setState(122);
				match(ID);
				}
				}
				setState(127);
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckInputContext extends InputContext {
		public TerminalNode STRING() { return getToken(MainGramParser.STRING, 0); }
		public CheckInputContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterCheckInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitCheckInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		try {
			_localctx = new CheckInputContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__13);
			setState(129);
			match(T__5);
			setState(130);
			match(STRING);
			setState(131);
			match(T__6);
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
		public Token incre;
		public TerminalNode ID() { return getToken(MainGramParser.ID, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(133);
			match(ID);
			setState(134);
			((IncrementContext)_localctx).incre = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
				((IncrementContext)_localctx).incre = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TypeContext extends ParserRuleContext {
		public Type res;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
		}
	}
	public static class TypeStrContext extends TypeContext {
		public TypeStrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterTypeStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitTypeStr(this);
		}
	}
	public static class DimensionTypeContext extends TypeContext {
		public TerminalNode DIMID() { return getToken(MainGramParser.DIMID, 0); }
		public DimensionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterDimensionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitDimensionType(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitTypeInt(this);
		}
	}
	public static class TypeRealContext extends TypeContext {
		public TypeRealContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterTypeReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitTypeReal(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitTypeBool(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__16);
				((TypeIntContext)_localctx).res =  new IntegerType();
				}
				break;
			case T__17:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__17);
				((TypeRealContext)_localctx).res =  new RealType();
				}
				break;
			case T__18:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__18);
				((TypeBoolContext)_localctx).res =  new BooleanType();
				}
				break;
			case T__19:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__19);
				((TypeStrContext)_localctx).res =  new StringType();
				}
				break;
			case DIMID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(DIMID);
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

	public static class ExprContext extends ParserRuleContext {
		public Type eType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.varName = ctx.varName;
		}
	}
	public static class StrExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(MainGramParser.STRING, 0); }
		public StrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitStrExpr(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitAddSubExpr(this);
		}
	}
	public static class EqualComparisonExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterEqualComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitEqualComparisonExpr(this);
		}
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(MainGramParser.INTEGER, 0); }
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIntegerExpr(this);
		}
	}
	public static class RealExprContext extends ExprContext {
		public TerminalNode REAL() { return getToken(MainGramParser.REAL, 0); }
		public RealExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterRealExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitRealExpr(this);
		}
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(MainGramParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitBooleanExpr(this);
		}
	}
	public static class InputExprContext extends ExprContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitInputExpr(this);
		}
	}
	public static class IncrExprContext extends ExprContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIncrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIncrExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitParenExpr(this);
		}
	}
	public static class GreatLowComparisonExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreatLowComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterGreatLowComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitGreatLowComparisonExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitNotExpr(this);
		}
	}
	public static class SignExprContext extends ExprContext {
		public Token sign;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterSignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitSignExpr(this);
		}
	}
	public static class MultDivExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitMultDivExpr(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitPowExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MainGramParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIdExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				((SignExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
					((SignExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				((SignExprContext)_localctx).e = expr(14);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T__23);
				setState(151);
				((NotExprContext)_localctx).e = expr(13);
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(T__5);
				setState(153);
				((ParenExprContext)_localctx).e = expr(0);
				setState(154);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new IncrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				increment();
				}
				break;
			case 5:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				input();
				}
				break;
			case 6:
				{
				_localctx = new RealExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(REAL);
				}
				break;
			case 7:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(INTEGER);
				}
				break;
			case 8:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(BOOLEAN);
				}
				break;
			case 9:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(166);
						match(T__20);
						setState(167);
						((PowExprContext)_localctx).e2 = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(169);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						((MultDivExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(172);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						((AddSubExprContext)_localctx).e2 = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualComparisonExprContext(new ExprContext(_parentctx, _parentState));
						((EqualComparisonExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(175);
						((EqualComparisonExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((EqualComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						((EqualComparisonExprContext)_localctx).e2 = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new GreatLowComparisonExprContext(new ExprContext(_parentctx, _parentState));
						((GreatLowComparisonExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(178);
						((GreatLowComparisonExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
							((GreatLowComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						((GreatLowComparisonExprContext)_localctx).e2 = expr(10);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\t\3\t\3\t\5\tS\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16~\n\16\f\16\16\16\u0081\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0094\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a6\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b7"+
		"\n\22\f\22\16\22\u00ba\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\7\3\2\21\22\3\2\30\31\3\2\33\34\3\2\35\36\3\2\37\"\2"+
		"\u00c7\2\'\3\2\2\2\4\62\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n>\3\2\2\2\fJ\3"+
		"\2\2\2\16L\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24d\3\2\2\2\26f\3\2\2\2\30"+
		"r\3\2\2\2\32z\3\2\2\2\34\u0082\3\2\2\2\36\u0087\3\2\2\2 \u0093\3\2\2\2"+
		"\"\u00a5\3\2\2\2$&\5\n\6\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2("+
		"*\3\2\2\2)\'\3\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-.\5\6\4\2./\7\3\2"+
		"\2/\61\3\2\2\2\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\5\3\2\2\2\64\62\3\2\2\2\65:\5\b\5\2\66:\5\16\b\2\67:\5\f\7\28:\5\20\t"+
		"\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\7\4\2\2"+
		"<=\5\"\22\2=\t\3\2\2\2>?\7\5\2\2?@\7&\2\2@A\7\3\2\2A\13\3\2\2\2BC\5\16"+
		"\b\2CD\7\6\2\2DE\5\"\22\2EK\3\2\2\2FG\5\32\16\2GH\7\6\2\2HI\5\"\22\2I"+
		"K\3\2\2\2JB\3\2\2\2JF\3\2\2\2K\r\3\2\2\2LM\5 \21\2MN\5\32\16\2N\17\3\2"+
		"\2\2OS\5\22\n\2PS\5\26\f\2QS\5\30\r\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2S\21"+
		"\3\2\2\2TU\7\7\2\2UV\7\b\2\2VW\5\"\22\2WX\7\t\2\2XY\7\n\2\2YZ\5\4\3\2"+
		"Z]\7\13\2\2[\\\7\f\2\2\\^\5\24\13\2][\3\2\2\2]^\3\2\2\2^\23\3\2\2\2_e"+
		"\5\22\n\2`a\7\n\2\2ab\5\4\3\2bc\7\13\2\2ce\3\2\2\2d_\3\2\2\2d`\3\2\2\2"+
		"e\25\3\2\2\2fg\7\r\2\2gh\7\b\2\2hi\5\f\7\2ij\7\3\2\2jk\5\"\22\2kl\7\3"+
		"\2\2lm\5\"\22\2mn\7\t\2\2no\7\n\2\2op\5\4\3\2pq\7\13\2\2q\27\3\2\2\2r"+
		"s\7\16\2\2st\7\b\2\2tu\5\"\22\2uv\7\t\2\2vw\7\n\2\2wx\5\4\3\2xy\7\13\2"+
		"\2y\31\3\2\2\2z\177\7&\2\2{|\7\17\2\2|~\7&\2\2}{\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\33\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\7\20\2\2\u0083\u0084\7\b\2\2\u0084\u0085\7,\2\2\u0085\u0086\7\t"+
		"\2\2\u0086\35\3\2\2\2\u0087\u0088\7&\2\2\u0088\u0089\t\2\2\2\u0089\37"+
		"\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u0094\b\21\1\2\u008c\u008d\7\24\2"+
		"\2\u008d\u0094\b\21\1\2\u008e\u008f\7\25\2\2\u008f\u0094\b\21\1\2\u0090"+
		"\u0091\7\26\2\2\u0091\u0094\b\21\1\2\u0092\u0094\7$\2\2\u0093\u008a\3"+
		"\2\2\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094!\3\2\2\2\u0095\u0096\b\22\1\2\u0096\u0097\t\3\2\2"+
		"\u0097\u00a6\5\"\22\20\u0098\u0099\7\32\2\2\u0099\u00a6\5\"\22\17\u009a"+
		"\u009b\7\b\2\2\u009b\u009c\5\"\22\2\u009c\u009d\7\t\2\2\u009d\u00a6\3"+
		"\2\2\2\u009e\u00a6\5\36\20\2\u009f\u00a6\5\34\17\2\u00a0\u00a6\7\'\2\2"+
		"\u00a1\u00a6\7(\2\2\u00a2\u00a6\7#\2\2\u00a3\u00a6\7,\2\2\u00a4\u00a6"+
		"\7&\2\2\u00a5\u0095\3\2\2\2\u00a5\u0098\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5"+
		"\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2"+
		"\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00b8\3\2\2\2\u00a7\u00a8\f\21\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00b7\5"+
		"\"\22\21\u00aa\u00ab\f\16\2\2\u00ab\u00ac\t\4\2\2\u00ac\u00b7\5\"\22\17"+
		"\u00ad\u00ae\f\r\2\2\u00ae\u00af\t\3\2\2\u00af\u00b7\5\"\22\16\u00b0\u00b1"+
		"\f\f\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b7\5\"\22\r\u00b3\u00b4\f\13\2\2"+
		"\u00b4\u00b5\t\6\2\2\u00b5\u00b7\5\"\22\f\u00b6\u00a7\3\2\2\2\u00b6\u00aa"+
		"\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9#\3\2\2\2"+
		"\u00ba\u00b8\3\2\2\2\16\'\629JR]d\177\u0093\u00a5\u00b6\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
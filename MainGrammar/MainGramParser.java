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
		T__31=32, BOOLEAN=33, ID=34, LETTER=35, REAL=36, INTEGER=37, COMMENT=38, 
		MULTICOMMENT=39, WS=40, STRING=41;
	public static final int
		RULE_main = 0, RULE_statList = 1, RULE_stat = 2, RULE_print = 3, RULE_importDims = 4, 
		RULE_declaration = 5, RULE_assignment = 6, RULE_idList = 7, RULE_conditionalstat = 8, 
		RULE_conditional = 9, RULE_elseif = 10, RULE_forloop = 11, RULE_whileloop = 12, 
		RULE_input = 13, RULE_increment = 14, RULE_type = 15, RULE_expr = 16, 
		RULE_unit = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statList", "stat", "print", "importDims", "declaration", "assignment", 
			"idList", "conditionalstat", "conditional", "elseif", "forloop", "whileloop", 
			"input", "increment", "type", "expr", "unit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'println'", "'('", "')'", "'import'", "'='", "','", "'if'", 
			"'{'", "'}'", "'else'", "'for'", "'while'", "'scan'", "'++'", "'--'", 
			"'integer'", "'real'", "'boolean'", "'string'", "'^'", "'+'", "'-'", 
			"'!'", "'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BOOLEAN", "ID", 
			"LETTER", "REAL", "INTEGER", "COMMENT", "MULTICOMMENT", "WS", "STRING"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(36);
				importDims();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			statList();
			setState(43);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				stat();
				setState(46);
				match(T__0);
				}
				}
				setState(52);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ConditionalstatContext conditionalstat() {
			return getRuleContext(ConditionalstatContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				conditionalstat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				increment();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__1);
			setState(61);
			match(T__2);
			setState(62);
			expr(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitImportDimensionFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDimsContext importDims() throws RecognitionException {
		ImportDimsContext _localctx = new ImportDimsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDims);
		try {
			_localctx = new ImportDimensionFileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(66);
			match(ID);
			setState(67);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			type();
			setState(70);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitDecAssign(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DecAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				declaration();
				setState(73);
				match(T__5);
				setState(74);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				idList();
				setState(77);
				match(T__5);
				setState(78);
				expr(0);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MainGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MainGramParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(83);
				match(T__6);
				setState(84);
				match(ID);
				}
				}
				setState(89);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitConditionalstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalstatContext conditionalstat() throws RecognitionException {
		ConditionalstatContext _localctx = new ConditionalstatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionalstat);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				conditional();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				forloop();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(T__2);
			setState(97);
			expr(0);
			setState(98);
			match(T__3);
			setState(99);
			match(T__8);
			setState(100);
			((ConditionalContext)_localctx).trueSL = statList();
			setState(101);
			match(T__9);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(102);
				match(T__10);
				setState(103);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseif);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				conditional();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__8);
				setState(108);
				statList();
				setState(109);
				match(T__9);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forloop);
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			match(T__2);
			setState(115);
			assignment();
			setState(116);
			match(T__0);
			setState(117);
			expr(0);
			setState(118);
			match(T__0);
			setState(119);
			expr(0);
			setState(120);
			match(T__3);
			setState(121);
			match(T__8);
			setState(122);
			((ForCondContext)_localctx).trueSL = statList();
			setState(123);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitWhileCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileloop);
		try {
			_localctx = new WhileCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__12);
			setState(126);
			match(T__2);
			setState(127);
			expr(0);
			setState(128);
			match(T__3);
			setState(129);
			match(T__8);
			setState(130);
			((WhileCondContext)_localctx).trueSL = statList();
			setState(131);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MainGramParser.STRING, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__13);
			setState(134);
			match(T__2);
			setState(135);
			match(STRING);
			setState(136);
			match(T__6);
			setState(137);
			type();
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
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
			setState(140);
			match(ID);
			setState(141);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DimensionTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(MainGramParser.ID, 0); }
		public DimensionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterDimensionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitDimensionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitDimensionType(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitTypeReal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__16);
				((TypeIntContext)_localctx).res =  new IntegerType();
				}
				break;
			case T__17:
				_localctx = new TypeRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__17);
				((TypeRealContext)_localctx).res =  new RealType();
				}
				break;
			case T__18:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__18);
				((TypeBoolContext)_localctx).res =  new BooleanType();
				}
				break;
			case T__19:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(T__19);
				((TypeStrContext)_localctx).res =  new StringType();
				}
				break;
			case ID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(ID);
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
		public String dim;
		public String uni;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.eType = ctx.eType;
			this.varName = ctx.varName;
			this.dim = ctx.dim;
			this.uni = ctx.uni;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitEqualComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(MainGramParser.INTEGER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIntegerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitIntegerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealExprContext extends ExprContext {
		public TerminalNode REAL() { return getToken(MainGramParser.REAL, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public RealExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterRealExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitRealExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitRealExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitInputExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitGreatLowComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncreExprContext extends ExprContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncreExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterIncreExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitIncreExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitIncreExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitSignExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitMultDivExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
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
				setState(156);
				((SignExprContext)_localctx).e = expr(14);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__23);
				setState(158);
				((NotExprContext)_localctx).e = expr(13);
				}
				break;
			case 3:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__2);
				setState(160);
				((ParenExprContext)_localctx).e = expr(0);
				setState(161);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				input();
				}
				break;
			case 5:
				{
				_localctx = new IncreExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				increment();
				}
				break;
			case 6:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new RealExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(REAL);
				setState(168);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(167);
					unit();
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(INTEGER);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(171);
					unit();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(BOOLEAN);
				}
				break;
			case 10:
				{
				_localctx = new StrExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(179);
						match(T__20);
						setState(180);
						((PowExprContext)_localctx).e2 = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(182);
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
						setState(183);
						((MultDivExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(185);
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
						setState(186);
						((AddSubExprContext)_localctx).e2 = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualComparisonExprContext(new ExprContext(_parentctx, _parentState));
						((EqualComparisonExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
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
						setState(189);
						((EqualComparisonExprContext)_localctx).e2 = expr(11);
						}
						break;
					case 5:
						{
						_localctx = new GreatLowComparisonExprContext(new ExprContext(_parentctx, _parentState));
						((GreatLowComparisonExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
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
						setState(192);
						((GreatLowComparisonExprContext)_localctx).e2 = expr(10);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public List<TerminalNode> ID() { return getTokens(MainGramParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MainGramParser.ID, i);
		}
		public UnitCheckContext(UnitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).enterUnitCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MainGramListener ) ((MainGramListener)listener).exitUnitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MainGramVisitor ) return ((MainGramVisitor<? extends T>)visitor).visitUnitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unit);
		int _la;
		try {
			_localctx = new UnitCheckContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__2);
			setState(199);
			match(ID);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				{
				setState(200);
				((UnitCheckContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
					((UnitCheckContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				match(ID);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b"+
		"\3\t\3\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\f\3\f\3\f\5\fr"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009b\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00ab\n\22\3\22\3\22\5\22\u00af\n\22\3\22\3\22\5\22\u00b3\n\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u00c4\n\22\f\22\16\22\u00c7\13\22\3\23\3\23\3\23\3\23\7\23\u00cd\n"+
		"\23\f\23\16\23\u00d0\13\23\3\23\3\23\3\23\2\3\"\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\7\3\2\21\22\3\2\30\31\3\2\33\34\3\2\35\36\3\2"+
		"\37\"\2\u00e2\2)\3\2\2\2\4\64\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nC\3\2\2\2"+
		"\fG\3\2\2\2\16R\3\2\2\2\20T\3\2\2\2\22_\3\2\2\2\24a\3\2\2\2\26q\3\2\2"+
		"\2\30s\3\2\2\2\32\177\3\2\2\2\34\u0087\3\2\2\2\36\u008e\3\2\2\2 \u009a"+
		"\3\2\2\2\"\u00b2\3\2\2\2$\u00c8\3\2\2\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\3\3\2\2"+
		"\2/\60\5\6\4\2\60\61\7\3\2\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64"+
		"\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\67=\5\b\5\28=\5\16"+
		"\b\29=\5\f\7\2:=\5\22\n\2;=\5\36\20\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2"+
		"<:\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7\4\2\2?@\7\5\2\2@A\5\"\22\2AB\7\6\2"+
		"\2B\t\3\2\2\2CD\7\7\2\2DE\7$\2\2EF\7\3\2\2F\13\3\2\2\2GH\5 \21\2HI\5\20"+
		"\t\2I\r\3\2\2\2JK\5\f\7\2KL\7\b\2\2LM\5\"\22\2MS\3\2\2\2NO\5\20\t\2OP"+
		"\7\b\2\2PQ\5\"\22\2QS\3\2\2\2RJ\3\2\2\2RN\3\2\2\2S\17\3\2\2\2TY\7$\2\2"+
		"UV\7\t\2\2VX\7$\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\21\3\2\2"+
		"\2[Y\3\2\2\2\\`\5\24\13\2]`\5\30\r\2^`\5\32\16\2_\\\3\2\2\2_]\3\2\2\2"+
		"_^\3\2\2\2`\23\3\2\2\2ab\7\n\2\2bc\7\5\2\2cd\5\"\22\2de\7\6\2\2ef\7\13"+
		"\2\2fg\5\4\3\2gj\7\f\2\2hi\7\r\2\2ik\5\26\f\2jh\3\2\2\2jk\3\2\2\2k\25"+
		"\3\2\2\2lr\5\24\13\2mn\7\13\2\2no\5\4\3\2op\7\f\2\2pr\3\2\2\2ql\3\2\2"+
		"\2qm\3\2\2\2r\27\3\2\2\2st\7\16\2\2tu\7\5\2\2uv\5\16\b\2vw\7\3\2\2wx\5"+
		"\"\22\2xy\7\3\2\2yz\5\"\22\2z{\7\6\2\2{|\7\13\2\2|}\5\4\3\2}~\7\f\2\2"+
		"~\31\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\"\22"+
		"\2\u0082\u0083\7\6\2\2\u0083\u0084\7\13\2\2\u0084\u0085\5\4\3\2\u0085"+
		"\u0086\7\f\2\2\u0086\33\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u0089\7\5\2"+
		"\2\u0089\u008a\7+\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5 \21\2\u008c\u008d"+
		"\7\6\2\2\u008d\35\3\2\2\2\u008e\u008f\7$\2\2\u008f\u0090\t\2\2\2\u0090"+
		"\37\3\2\2\2\u0091\u0092\7\23\2\2\u0092\u009b\b\21\1\2\u0093\u0094\7\24"+
		"\2\2\u0094\u009b\b\21\1\2\u0095\u0096\7\25\2\2\u0096\u009b\b\21\1\2\u0097"+
		"\u0098\7\26\2\2\u0098\u009b\b\21\1\2\u0099\u009b\7$\2\2\u009a\u0091\3"+
		"\2\2\2\u009a\u0093\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b!\3\2\2\2\u009c\u009d\b\22\1\2\u009d\u009e\t\3\2\2"+
		"\u009e\u00b3\5\"\22\20\u009f\u00a0\7\32\2\2\u00a0\u00b3\5\"\22\17\u00a1"+
		"\u00a2\7\5\2\2\u00a2\u00a3\5\"\22\2\u00a3\u00a4\7\6\2\2\u00a4\u00b3\3"+
		"\2\2\2\u00a5\u00b3\5\34\17\2\u00a6\u00b3\5\36\20\2\u00a7\u00b3\7$\2\2"+
		"\u00a8\u00aa\7&\2\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00b3\3\2\2\2\u00ac\u00ae\7\'\2\2\u00ad\u00af\5$\23\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b3\7#"+
		"\2\2\u00b1\u00b3\7+\2\2\u00b2\u009c\3\2\2\2\u00b2\u009f\3\2\2\2\u00b2"+
		"\u00a1\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a7\3\2"+
		"\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00c5\3\2\2\2\u00b4\u00b5\f\21\2\2\u00b5\u00b6\7"+
		"\27\2\2\u00b6\u00c4\5\"\22\21\u00b7\u00b8\f\16\2\2\u00b8\u00b9\t\4\2\2"+
		"\u00b9\u00c4\5\"\22\17\u00ba\u00bb\f\r\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00c4"+
		"\5\"\22\16\u00bd\u00be\f\f\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c4\5\"\22"+
		"\r\u00c0\u00c1\f\13\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00c4\5\"\22\f\u00c3"+
		"\u00b4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2"+
		"\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\5\2\2"+
		"\u00c9\u00ce\7$\2\2\u00ca\u00cb\t\4\2\2\u00cb\u00cd\7$\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\6\2\2\u00d2%\3\2\2\2"+
		"\21)\64<RY_jq\u009a\u00aa\u00ae\u00b2\u00c3\u00c5\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
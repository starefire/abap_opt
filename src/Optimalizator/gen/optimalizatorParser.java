package Optimalizator.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\optimalizator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class optimalizatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STAR=1, OPTIMIZE=2, SELECT=3, PREFIX=4, READ=5, OPTIMALIZATION=6, ENDOPTIMALIZATION=7, 
		ID=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_optimal = 1, RULE_endoptimal = 2, RULE_block = 3, 
		RULE_prefix = 4, RULE_star = 5, RULE_read = 6, RULE_select = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "optimal", "endoptimal", "block", "prefix", "star", "read", "select"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STAR", "OPTIMIZE", "SELECT", "PREFIX", "READ", "OPTIMALIZATION", 
			"ENDOPTIMALIZATION", "ID", "WS"
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
	public String getGrammarFileName() { return "optimalizator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public optimalizatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public BlockContext body;
		public OptimalContext optimal() {
			return getRuleContext(OptimalContext.class,0);
		}
		public EndoptimalContext endoptimal() {
			return getRuleContext(EndoptimalContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			optimal();
			setState(17);
			((ProgContext)_localctx).body = block();
			setState(18);
			endoptimal();
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

	public static class OptimalContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public TerminalNode OPTIMALIZATION() { return getToken(optimalizatorParser.OPTIMALIZATION, 0); }
		public OptimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterOptimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitOptimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitOptimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptimalContext optimal() throws RecognitionException {
		OptimalContext _localctx = new OptimalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(STAR);
			setState(21);
			match(OPTIMALIZATION);
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

	public static class EndoptimalContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public TerminalNode ENDOPTIMALIZATION() { return getToken(optimalizatorParser.ENDOPTIMALIZATION, 0); }
		public EndoptimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endoptimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterEndoptimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitEndoptimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitEndoptimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndoptimalContext endoptimal() throws RecognitionException {
		EndoptimalContext _localctx = new EndoptimalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_endoptimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(STAR);
			setState(24);
			match(ENDOPTIMALIZATION);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StarContext> star() {
			return getRuleContexts(StarContext.class);
		}
		public StarContext star(int i) {
			return getRuleContext(StarContext.class,i);
		}
		public List<SelectContext> select() {
			return getRuleContexts(SelectContext.class);
		}
		public SelectContext select(int i) {
			return getRuleContext(SelectContext.class,i);
		}
		public List<PrefixContext> prefix() {
			return getRuleContexts(PrefixContext.class);
		}
		public PrefixContext prefix(int i) {
			return getRuleContext(PrefixContext.class,i);
		}
		public List<ReadContext> read() {
			return getRuleContexts(ReadContext.class);
		}
		public ReadContext read(int i) {
			return getRuleContext(ReadContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(30);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(26);
						star();
						}
						break;
					case 2:
						{
						setState(27);
						select();
						}
						break;
					case 3:
						{
						setState(28);
						prefix();
						}
						break;
					case 4:
						{
						setState(29);
						read();
						}
						break;
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class PrefixContext extends ParserRuleContext {
		public Token prf;
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public TerminalNode OPTIMIZE() { return getToken(optimalizatorParser.OPTIMIZE, 0); }
		public TerminalNode PREFIX() { return getToken(optimalizatorParser.PREFIX, 0); }
		public TerminalNode ID() { return getToken(optimalizatorParser.ID, 0); }
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(STAR);
			setState(36);
			match(OPTIMIZE);
			setState(37);
			match(PREFIX);
			setState(38);
			((PrefixContext)_localctx).prf = match(ID);
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

	public static class StarContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(STAR);
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
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public TerminalNode OPTIMIZE() { return getToken(optimalizatorParser.OPTIMIZE, 0); }
		public TerminalNode READ() { return getToken(optimalizatorParser.READ, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(STAR);
			setState(43);
			match(OPTIMIZE);
			setState(44);
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

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	 
		public SelectContext() { }
		public void copyFrom(SelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectOptContext extends SelectContext {
		public TerminalNode STAR() { return getToken(optimalizatorParser.STAR, 0); }
		public TerminalNode OPTIMIZE() { return getToken(optimalizatorParser.OPTIMIZE, 0); }
		public TerminalNode SELECT() { return getToken(optimalizatorParser.SELECT, 0); }
		public SelectOptContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).enterSelectOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof optimalizatorListener ) ((optimalizatorListener)listener).exitSelectOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof optimalizatorVisitor ) return ((optimalizatorVisitor<? extends T>)visitor).visitSelectOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select);
		try {
			_localctx = new SelectOptContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(STAR);
			setState(47);
			match(OPTIMIZE);
			setState(48);
			match(SELECT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5!\n\5\f\5\16\5$\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b"+
		"\n\f\16\20\2\2\2\60\2\22\3\2\2\2\4\26\3\2\2\2\6\31\3\2\2\2\b\"\3\2\2\2"+
		"\n%\3\2\2\2\f*\3\2\2\2\16,\3\2\2\2\20\60\3\2\2\2\22\23\5\4\3\2\23\24\5"+
		"\b\5\2\24\25\5\6\4\2\25\3\3\2\2\2\26\27\7\3\2\2\27\30\7\b\2\2\30\5\3\2"+
		"\2\2\31\32\7\3\2\2\32\33\7\t\2\2\33\7\3\2\2\2\34!\5\f\7\2\35!\5\20\t\2"+
		"\36!\5\n\6\2\37!\5\16\b\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2"+
		"\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\t\3\2\2\2$\"\3\2\2\2%&\7\3\2\2&"+
		"\'\7\4\2\2\'(\7\6\2\2()\7\n\2\2)\13\3\2\2\2*+\7\3\2\2+\r\3\2\2\2,-\7\3"+
		"\2\2-.\7\4\2\2./\7\7\2\2/\17\3\2\2\2\60\61\7\3\2\2\61\62\7\4\2\2\62\63"+
		"\7\5\2\2\63\21\3\2\2\2\4 \"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
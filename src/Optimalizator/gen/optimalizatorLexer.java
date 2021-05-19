package Optimalizator.gen;// Generated from C:/Users/Honza/Desktop/Skola/DP/DP_ABAP_compiler/DP_ABAP_compiler/grammars\optimalizator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class optimalizatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STAR=1, OPTIMIZE=2, SELECT=3, PREFIX=4, READ=5, OPTIMALIZATION=6, ENDOPTIMALIZATION=7, 
		ID=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STAR", "OPTIMIZE", "SELECT", "PREFIX", "READ", "OPTIMALIZATION", "ENDOPTIMALIZATION", 
			"ID", "WS"
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


	public optimalizatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "optimalizator.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\7\t\\\n"+
		"\t\f\t\16\t_\13\t\3\n\3\n\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\3\2\27\3\2,,\3\2%%\4\2QQqq\4\2RRrr\4\2VVvv\4\2KKkk\4\2OOo"+
		"o\4\2\\\\||\4\2GGgg\4\2UUuu\4\2NNnn\4\2EEee\4\2TTtt\4\2HHhh\4\2ZZzz\4"+
		"\2CCcc\4\2FFff\4\2DDdd\4\2PPpp\6\2\62;C\\aac|\6\2\13\f\17\17\"\"))\2d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\30\3\2\2\2"+
		"\7!\3\2\2\2\t(\3\2\2\2\13/\3\2\2\2\r9\3\2\2\2\17H\3\2\2\2\21]\3\2\2\2"+
		"\23`\3\2\2\2\25\26\t\2\2\2\26\27\t\3\2\2\27\4\3\2\2\2\30\31\t\4\2\2\31"+
		"\32\t\5\2\2\32\33\t\6\2\2\33\34\t\7\2\2\34\35\t\b\2\2\35\36\t\7\2\2\36"+
		"\37\t\t\2\2\37 \t\n\2\2 \6\3\2\2\2!\"\t\13\2\2\"#\t\n\2\2#$\t\f\2\2$%"+
		"\t\n\2\2%&\t\r\2\2&\'\t\6\2\2\'\b\3\2\2\2()\t\5\2\2)*\t\16\2\2*+\t\n\2"+
		"\2+,\t\17\2\2,-\t\7\2\2-.\t\20\2\2.\n\3\2\2\2/\60\t\16\2\2\60\61\t\n\2"+
		"\2\61\62\t\21\2\2\62\63\t\22\2\2\63\64\t\6\2\2\64\65\t\21\2\2\65\66\t"+
		"\23\2\2\66\67\t\f\2\2\678\t\n\2\28\f\3\2\2\29:\t\4\2\2:;\t\5\2\2;<\t\6"+
		"\2\2<=\t\7\2\2=>\t\b\2\2>?\t\21\2\2?@\t\f\2\2@A\t\7\2\2AB\t\t\2\2BC\t"+
		"\21\2\2CD\t\6\2\2DE\t\7\2\2EF\t\4\2\2FG\t\24\2\2G\16\3\2\2\2HI\t\n\2\2"+
		"IJ\t\24\2\2JK\t\22\2\2KL\t\4\2\2LM\t\5\2\2MN\t\6\2\2NO\t\7\2\2OP\t\b\2"+
		"\2PQ\t\21\2\2QR\t\f\2\2RS\t\7\2\2ST\t\t\2\2TU\t\21\2\2UV\t\6\2\2VW\t\7"+
		"\2\2WX\t\4\2\2XY\t\24\2\2Y\20\3\2\2\2Z\\\t\25\2\2[Z\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\22\3\2\2\2_]\3\2\2\2`a\t\26\2\2ab\3\2\2\2bc\b\n"+
		"\2\2c\24\3\2\2\2\4\2]\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
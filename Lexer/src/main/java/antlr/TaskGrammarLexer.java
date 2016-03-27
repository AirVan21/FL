package antlr;// Generated from TaskGrammar.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, DO=4, WHILE=5, SKIP=6, WRITE=7, READ=8, AND=9, OR=10, 
		GT=11, GE=12, LT=13, LE=14, EQ=15, NEQ=16, PLUS=17, MINUS=18, MULT=19, 
		DIV=20, MOD=21, ASSIGN=22, SEMICOLON=23, VARIABLE=24, NUMBER=25, SPACE=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "DO", "WHILE", "SKIP", "WRITE", "READ", "AND", "OR", 
		"GT", "GE", "LT", "LE", "EQ", "NEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
		"ASSIGN", "SEMICOLON", "VARIABLE", "NUMBER", "SPACE"
	};


	public TaskGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TaskGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\7\31\u0085\n\31\f\31\16\31\u0088\13\31\3\32\3\32\7\32"+
		"\u008c\n\32\f\32\16\32\u008f\13\32\3\33\6\33\u0092\n\33\r\33\16\33\u0093"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\16\17\"\""+
		"\u0099\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5:\3\2\2"+
		"\2\7?\3\2\2\2\tD\3\2\2\2\13G\3\2\2\2\rM\3\2\2\2\17R\3\2\2\2\21X\3\2\2"+
		"\2\23]\3\2\2\2\25`\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33h\3\2\2\2\35j\3\2"+
		"\2\2\37m\3\2\2\2!p\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+{"+
		"\3\2\2\2-}\3\2\2\2/\u0080\3\2\2\2\61\u0082\3\2\2\2\63\u0089\3\2\2\2\65"+
		"\u0091\3\2\2\2\678\7k\2\289\7h\2\29\4\3\2\2\2:;\7v\2\2;<\7j\2\2<=\7g\2"+
		"\2=>\7p\2\2>\6\3\2\2\2?@\7g\2\2@A\7n\2\2AB\7u\2\2BC\7g\2\2C\b\3\2\2\2"+
		"DE\7f\2\2EF\7q\2\2F\n\3\2\2\2GH\7y\2\2HI\7j\2\2IJ\7k\2\2JK\7n\2\2KL\7"+
		"g\2\2L\f\3\2\2\2MN\7u\2\2NO\7m\2\2OP\7k\2\2PQ\7r\2\2Q\16\3\2\2\2RS\7y"+
		"\2\2ST\7t\2\2TU\7k\2\2UV\7v\2\2VW\7g\2\2W\20\3\2\2\2XY\7t\2\2YZ\7g\2\2"+
		"Z[\7c\2\2[\\\7f\2\2\\\22\3\2\2\2]^\7(\2\2^_\7(\2\2_\24\3\2\2\2`a\7~\2"+
		"\2ab\7~\2\2b\26\3\2\2\2cd\7@\2\2d\30\3\2\2\2ef\7@\2\2fg\7?\2\2g\32\3\2"+
		"\2\2hi\7>\2\2i\34\3\2\2\2jk\7>\2\2kl\7?\2\2l\36\3\2\2\2mn\7?\2\2no\7?"+
		"\2\2o \3\2\2\2pq\7#\2\2qr\7?\2\2r\"\3\2\2\2st\7-\2\2t$\3\2\2\2uv\7/\2"+
		"\2v&\3\2\2\2wx\7,\2\2x(\3\2\2\2yz\7\61\2\2z*\3\2\2\2{|\7\'\2\2|,\3\2\2"+
		"\2}~\7<\2\2~\177\7?\2\2\177.\3\2\2\2\u0080\u0081\7=\2\2\u0081\60\3\2\2"+
		"\2\u0082\u0086\t\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\62\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008d\t\4\2\2\u008a\u008c\t\5\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\64\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\b\33\2\2\u0096\66\3\2\2\2\6\2\u0086\u008d\u0093\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
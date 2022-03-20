// Generated from /Users/carlosngv/Documents/U/OCL2/OCL2 - 1S2022/Proyecto 1/Analizador/parser/ParserLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LP=1, RP=2, L_LLAVE=3, R_LLAVE=4, L_CORCH=5, R_CORCH=6, PRINTLN=7, IF_TOK=8, 
		ELSE=9, MUT=10, LET=11, CLASS=12, NEW_=13, MAIN=14, PRIVATE=15, PUBLIC=16, 
		STATIC=17, RETURN_P=18, INTTYPE=19, FLOATTYPE=20, STRINGTYPE=21, STRTYPE=22, 
		VOIDTYPE=23, BOOLTYPE=24, PUNTO=25, COMA=26, PTCOMA=27, DOSPUNTOS=28, 
		AND=29, OR=30, NOT=31, IGUAL=32, IGUAL_IGUAL=33, DIFERENTE=34, MAYORIGUAL=35, 
		MENORIGUAL=36, MAYOR=37, MENOR=38, MUL=39, DIV=40, ADD=41, SUB=42, NUMBER=43, 
		FLOAT=44, STRING=45, TRUE=46, FALSE=47, ID=48, WHITESPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "PRINTLN", "IF_TOK", 
			"ELSE", "MUT", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUBLIC", "STATIC", 
			"RETURN_P", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE", "VOIDTYPE", 
			"BOOLTYPE", "PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", "AND", "OR", "NOT", 
			"IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "MUL", "DIV", "ADD", "SUB", "NUMBER", "FLOAT", "STRING", "TRUE", 
			"FALSE", "ID", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'println!'", "'if'", 
			"'else'", "'mut'", "'let'", "'class'", "'new'", "'main'", "'private'", 
			"'public'", "'static'", "'return'", "'i64'", "'f64'", "'String'", "'&str'", 
			"'void'", "'boolean'", "'.'", "','", "';'", "':'", "'&&'", "'||'", "'!'", 
			"'='", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", 
			"'-'", null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "PRINTLN", 
			"IF_TOK", "ELSE", "MUT", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUBLIC", 
			"STATIC", "RETURN_P", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE", 
			"VOIDTYPE", "BOOLTYPE", "PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", "AND", 
			"OR", "NOT", "IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", 
			"MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "NUMBER", "FLOAT", "STRING", 
			"TRUE", "FALSE", "ID", "WHITESPACE"
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


	public ParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\6,\u0105"+
		"\n,\r,\16,\u0106\3-\6-\u010a\n-\r-\16-\u010b\3-\3-\6-\u0110\n-\r-\16-"+
		"\u0111\3.\3.\7.\u0116\n.\f.\16.\u0119\13.\3.\3.\3/\3/\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u012a\n\61\f\61\16\61\u012d\13"+
		"\61\3\62\6\62\u0130\n\62\r\62\16\62\u0131\3\62\3\62\3\63\3\63\3\63\2\2"+
		"\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2\3\2\t\3\2\62"+
		";\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\t\2\"#"+
		"%%--/\60<<BB]_\2\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2"+
		"\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21|\3\2\2\2\23\177\3"+
		"\2\2\2\25\u0084\3\2\2\2\27\u0088\3\2\2\2\31\u008c\3\2\2\2\33\u0092\3\2"+
		"\2\2\35\u0096\3\2\2\2\37\u009b\3\2\2\2!\u00a3\3\2\2\2#\u00aa\3\2\2\2%"+
		"\u00b1\3\2\2\2\'\u00b8\3\2\2\2)\u00bc\3\2\2\2+\u00c0\3\2\2\2-\u00c7\3"+
		"\2\2\2/\u00cc\3\2\2\2\61\u00d1\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e4\3\2\2\2?\u00e7"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E\u00ee\3\2\2\2G\u00f1\3\2\2\2I"+
		"\u00f4\3\2\2\2K\u00f7\3\2\2\2M\u00f9\3\2\2\2O\u00fb\3\2\2\2Q\u00fd\3\2"+
		"\2\2S\u00ff\3\2\2\2U\u0101\3\2\2\2W\u0104\3\2\2\2Y\u0109\3\2\2\2[\u0113"+
		"\3\2\2\2]\u011c\3\2\2\2_\u0121\3\2\2\2a\u0127\3\2\2\2c\u012f\3\2\2\2e"+
		"\u0135\3\2\2\2gh\7*\2\2h\4\3\2\2\2ij\7+\2\2j\6\3\2\2\2kl\7}\2\2l\b\3\2"+
		"\2\2mn\7\177\2\2n\n\3\2\2\2op\7]\2\2p\f\3\2\2\2qr\7_\2\2r\16\3\2\2\2s"+
		"t\7r\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2wx\7v\2\2xy\7n\2\2yz\7p\2\2z{\7#\2"+
		"\2{\20\3\2\2\2|}\7k\2\2}~\7h\2\2~\22\3\2\2\2\177\u0080\7g\2\2\u0080\u0081"+
		"\7n\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\24\3\2\2\2\u0084\u0085"+
		"\7o\2\2\u0085\u0086\7w\2\2\u0086\u0087\7v\2\2\u0087\26\3\2\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\30\3\2\2\2\u008c\u008d"+
		"\7e\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2\u0090"+
		"\u0091\7u\2\2\u0091\32\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7y\2\2\u0095\34\3\2\2\2\u0096\u0097\7o\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\36\3\2\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7x\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7v\2\2\u00a1\u00a2\7g\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7r\2"+
		"\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7e\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7e\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b4\7v\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7p\2\2"+
		"\u00b7&\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\78\2\2\u00ba\u00bb\7\66"+
		"\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\78\2\2\u00be\u00bf"+
		"\7\66\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7U\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3"+
		"\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7i\2\2\u00c6"+
		",\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce\7q\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7f\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7d\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7\u00d8\7p\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7"+
		"\60\2\2\u00da\64\3\2\2\2\u00db\u00dc\7.\2\2\u00dc\66\3\2\2\2\u00dd\u00de"+
		"\7=\2\2\u00de8\3\2\2\2\u00df\u00e0\7<\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7"+
		"(\2\2\u00e2\u00e3\7(\2\2\u00e3<\3\2\2\2\u00e4\u00e5\7~\2\2\u00e5\u00e6"+
		"\7~\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7"+
		"?\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7?\2\2\u00ec\u00ed\7?\2\2\u00edD\3\2"+
		"\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7?\2\2\u00f0F\3\2\2\2\u00f1\u00f2"+
		"\7@\2\2\u00f2\u00f3\7?\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7"+
		">\2\2\u00faN\3\2\2\2\u00fb\u00fc\7,\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7\61"+
		"\2\2\u00feR\3\2\2\2\u00ff\u0100\7-\2\2\u0100T\3\2\2\2\u0101\u0102\7/\2"+
		"\2\u0102V\3\2\2\2\u0103\u0105\t\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107X\3\2\2\2\u0108"+
		"\u010a\t\2\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\t\3\2\2\u010e"+
		"\u0110\t\2\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112Z\3\2\2\2\u0113\u0117\7$\2\2\u0114\u0116"+
		"\n\4\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7$"+
		"\2\2\u011b\\\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0120\7g\2\2\u0120^\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123"+
		"\7c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126"+
		"`\3\2\2\2\u0127\u012b\t\5\2\2\u0128\u012a\t\6\2\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012cb\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\t\7\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0134\b\62\2\2\u0134d\3\2\2\2\u0135\u0136\7^\2\2\u0136\u0137"+
		"\t\b\2\2\u0137f\3\2\2\2\t\2\u0106\u010b\u0111\u0117\u012b\u0131\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
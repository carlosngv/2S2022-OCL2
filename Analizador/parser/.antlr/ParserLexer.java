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
		LP=1, RP=2, L_LLAVE=3, R_LLAVE=4, L_CORCH=5, R_CORCH=6, GUION_BAJO=7, 
		PRINTLN=8, IF_TOK=9, ELSE=10, MATCH=11, WHILE=12, LOOP=13, FOR=14, IN=15, 
		MUT=16, LET=17, CLASS=18, NEW_=19, MAIN=20, PRIVATE=21, PUBLIC=22, STATIC=23, 
		RETURN_P=24, BREAK_P=25, CONTINUE_P=26, ABS=27, SQRT=28, TO_STRING=29, 
		CLONE=30, POW=31, POWF=32, INTTYPE=33, FLOATTYPE=34, STRINGTYPE=35, STRTYPE=36, 
		CHARTYPE=37, VOIDTYPE=38, BOOLTYPE=39, USIZETYPE=40, PUNTO=41, COMA=42, 
		PTCOMA=43, DOSPUNTOS=44, AND=45, OR_CASE=46, OR=47, NOT=48, IGUAL=49, 
		IGUAL_IGUAL=50, DIFERENTE=51, MAYORIGUAL=52, MENORIGUAL=53, MAYOR=54, 
		MENOR=55, MUL=56, DIV=57, ADD=58, SUB=59, MOD=60, NUMBER=61, USIZE=62, 
		FLOAT=63, STRING=64, CHAR=65, TRUE=66, FALSE=67, ID=68, WHITESPACE=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "GUION_BAJO", 
			"PRINTLN", "IF_TOK", "ELSE", "MATCH", "WHILE", "LOOP", "FOR", "IN", "MUT", 
			"LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUBLIC", "STATIC", "RETURN_P", 
			"BREAK_P", "CONTINUE_P", "ABS", "SQRT", "TO_STRING", "CLONE", "POW", 
			"POWF", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE", "CHARTYPE", 
			"VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", 
			"AND", "OR_CASE", "OR", "NOT", "IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "NUMBER", 
			"USIZE", "FLOAT", "STRING", "CHAR", "TRUE", "FALSE", "ID", "WHITESPACE", 
			"ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'_'", "'println!'", 
			"'if'", "'else'", "'match'", "'while'", "'loop'", "'for'", "'in'", "'mut'", 
			"'let'", "'class'", "'new'", "'main'", "'private'", "'public'", "'static'", 
			"'return'", "'break'", "'continue'", "'abs'", "'sqrt'", "'to_string'", 
			"'clone'", "'pow'", "'powf'", "'i64'", "'f64'", "'String'", "'&str'", 
			"'char'", "'void'", "'boolean'", "'usize'", "'.'", "','", "';'", "':'", 
			"'&&'", "'|'", "'||'", "'!'", "'='", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", null, null, null, null, 
			null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "GUION_BAJO", 
			"PRINTLN", "IF_TOK", "ELSE", "MATCH", "WHILE", "LOOP", "FOR", "IN", "MUT", 
			"LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUBLIC", "STATIC", "RETURN_P", 
			"BREAK_P", "CONTINUE_P", "ABS", "SQRT", "TO_STRING", "CLONE", "POW", 
			"POWF", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE", "CHARTYPE", 
			"VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", 
			"AND", "OR_CASE", "OR", "NOT", "IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "NUMBER", 
			"USIZE", "FLOAT", "STRING", "CHAR", "TRUE", "FALSE", "ID", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\6>\u0187"+
		"\n>\r>\16>\u0188\3?\6?\u018c\n?\r?\16?\u018d\3@\6@\u0191\n@\r@\16@\u0192"+
		"\3@\3@\6@\u0197\n@\r@\16@\u0198\3A\3A\7A\u019d\nA\fA\16A\u01a0\13A\3A"+
		"\3A\3B\3B\7B\u01a6\nB\fB\16B\u01a9\13B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3E\3E\7E\u01ba\nE\fE\16E\u01bd\13E\3F\6F\u01c0\nF\rF\16F\u01c1"+
		"\3F\3F\3G\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008d\2\3\2\t\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\5\2\13\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u01ce\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008f\3\2\2\2\5\u0091\3\2\2"+
		"\2\7\u0093\3\2\2\2\t\u0095\3\2\2\2\13\u0097\3\2\2\2\r\u0099\3\2\2\2\17"+
		"\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u00a6\3\2\2\2\25\u00a9\3\2\2\2\27\u00ae"+
		"\3\2\2\2\31\u00b4\3\2\2\2\33\u00ba\3\2\2\2\35\u00bf\3\2\2\2\37\u00c3\3"+
		"\2\2\2!\u00c6\3\2\2\2#\u00ca\3\2\2\2%\u00ce\3\2\2\2\'\u00d4\3\2\2\2)\u00d8"+
		"\3\2\2\2+\u00dd\3\2\2\2-\u00e5\3\2\2\2/\u00ec\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00fa\3\2\2\2\65\u0100\3\2\2\2\67\u0109\3\2\2\29\u010d\3\2\2\2;\u0112"+
		"\3\2\2\2=\u011c\3\2\2\2?\u0122\3\2\2\2A\u0126\3\2\2\2C\u012b\3\2\2\2E"+
		"\u012f\3\2\2\2G\u0133\3\2\2\2I\u013a\3\2\2\2K\u013f\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0149\3\2\2\2Q\u0151\3\2\2\2S\u0157\3\2\2\2U\u0159\3\2\2\2W\u015b"+
		"\3\2\2\2Y\u015d\3\2\2\2[\u015f\3\2\2\2]\u0162\3\2\2\2_\u0164\3\2\2\2a"+
		"\u0167\3\2\2\2c\u0169\3\2\2\2e\u016b\3\2\2\2g\u016e\3\2\2\2i\u0171\3\2"+
		"\2\2k\u0174\3\2\2\2m\u0177\3\2\2\2o\u0179\3\2\2\2q\u017b\3\2\2\2s\u017d"+
		"\3\2\2\2u\u017f\3\2\2\2w\u0181\3\2\2\2y\u0183\3\2\2\2{\u0186\3\2\2\2}"+
		"\u018b\3\2\2\2\177\u0190\3\2\2\2\u0081\u019a\3\2\2\2\u0083\u01a3\3\2\2"+
		"\2\u0085\u01ac\3\2\2\2\u0087\u01b1\3\2\2\2\u0089\u01b7\3\2\2\2\u008b\u01bf"+
		"\3\2\2\2\u008d\u01c5\3\2\2\2\u008f\u0090\7*\2\2\u0090\4\3\2\2\2\u0091"+
		"\u0092\7+\2\2\u0092\6\3\2\2\2\u0093\u0094\7}\2\2\u0094\b\3\2\2\2\u0095"+
		"\u0096\7\177\2\2\u0096\n\3\2\2\2\u0097\u0098\7]\2\2\u0098\f\3\2\2\2\u0099"+
		"\u009a\7_\2\2\u009a\16\3\2\2\2\u009b\u009c\7a\2\2\u009c\20\3\2\2\2\u009d"+
		"\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5"+
		"\7#\2\2\u00a5\22\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8\24"+
		"\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7j\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7n\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7"+
		"q\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7r\2\2\u00be\34\3\2\2\2\u00bf\u00c0"+
		"\7h\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\36\3\2\2\2\u00c3\u00c4"+
		"\7k\2\2\u00c4\u00c5\7p\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7o\2\2\u00c7\u00c8"+
		"\7w\2\2\u00c8\u00c9\7v\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7v\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"&\3\2\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7y\2\2\u00d7"+
		"(\3\2\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc*\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7k\2\2\u00e0\u00e1\7x\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7w\2"+
		"\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb"+
		"\7e\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7c\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7e\2\2\u00f2"+
		"\60\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2\u00f9\62\3\2\2\2\u00fa"+
		"\u00fb\7d\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7c\2\2"+
		"\u00fe\u00ff\7m\2\2\u00ff\64\3\2\2\2\u0100\u0101\7e\2\2\u0101\u0102\7"+
		"q\2\2\u0102\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106"+
		"\7p\2\2\u0106\u0107\7w\2\2\u0107\u0108\7g\2\2\u0108\66\3\2\2\2\u0109\u010a"+
		"\7c\2\2\u010a\u010b\7d\2\2\u010b\u010c\7u\2\2\u010c8\3\2\2\2\u010d\u010e"+
		"\7u\2\2\u010e\u010f\7s\2\2\u010f\u0110\7t\2\2\u0110\u0111\7v\2\2\u0111"+
		":\3\2\2\2\u0112\u0113\7v\2\2\u0113\u0114\7q\2\2\u0114\u0115\7a\2\2\u0115"+
		"\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118\u0119\7k\2\2"+
		"\u0119\u011a\7p\2\2\u011a\u011b\7i\2\2\u011b<\3\2\2\2\u011c\u011d\7e\2"+
		"\2\u011d\u011e\7n\2\2\u011e\u011f\7q\2\2\u011f\u0120\7p\2\2\u0120\u0121"+
		"\7g\2\2\u0121>\3\2\2\2\u0122\u0123\7r\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7y\2\2\u0125@\3\2\2\2\u0126\u0127\7r\2\2\u0127\u0128\7q\2\2\u0128\u0129"+
		"\7y\2\2\u0129\u012a\7h\2\2\u012aB\3\2\2\2\u012b\u012c\7k\2\2\u012c\u012d"+
		"\78\2\2\u012d\u012e\7\66\2\2\u012eD\3\2\2\2\u012f\u0130\7h\2\2\u0130\u0131"+
		"\78\2\2\u0131\u0132\7\66\2\2\u0132F\3\2\2\2\u0133\u0134\7U\2\2\u0134\u0135"+
		"\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2\u0137\u0138\7p\2\2\u0138"+
		"\u0139\7i\2\2\u0139H\3\2\2\2\u013a\u013b\7(\2\2\u013b\u013c\7u\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7t\2\2\u013eJ\3\2\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7j\2\2\u0141\u0142\7c\2\2\u0142\u0143\7t\2\2\u0143L\3\2\2\2\u0144"+
		"\u0145\7x\2\2\u0145\u0146\7q\2\2\u0146\u0147\7k\2\2\u0147\u0148\7f\2\2"+
		"\u0148N\3\2\2\2\u0149\u014a\7d\2\2\u014a\u014b\7q\2\2\u014b\u014c\7q\2"+
		"\2\u014c\u014d\7n\2\2\u014d\u014e\7g\2\2\u014e\u014f\7c\2\2\u014f\u0150"+
		"\7p\2\2\u0150P\3\2\2\2\u0151\u0152\7w\2\2\u0152\u0153\7u\2\2\u0153\u0154"+
		"\7k\2\2\u0154\u0155\7|\2\2\u0155\u0156\7g\2\2\u0156R\3\2\2\2\u0157\u0158"+
		"\7\60\2\2\u0158T\3\2\2\2\u0159\u015a\7.\2\2\u015aV\3\2\2\2\u015b\u015c"+
		"\7=\2\2\u015cX\3\2\2\2\u015d\u015e\7<\2\2\u015eZ\3\2\2\2\u015f\u0160\7"+
		"(\2\2\u0160\u0161\7(\2\2\u0161\\\3\2\2\2\u0162\u0163\7~\2\2\u0163^\3\2"+
		"\2\2\u0164\u0165\7~\2\2\u0165\u0166\7~\2\2\u0166`\3\2\2\2\u0167\u0168"+
		"\7#\2\2\u0168b\3\2\2\2\u0169\u016a\7?\2\2\u016ad\3\2\2\2\u016b\u016c\7"+
		"?\2\2\u016c\u016d\7?\2\2\u016df\3\2\2\2\u016e\u016f\7#\2\2\u016f\u0170"+
		"\7?\2\2\u0170h\3\2\2\2\u0171\u0172\7@\2\2\u0172\u0173\7?\2\2\u0173j\3"+
		"\2\2\2\u0174\u0175\7>\2\2\u0175\u0176\7?\2\2\u0176l\3\2\2\2\u0177\u0178"+
		"\7@\2\2\u0178n\3\2\2\2\u0179\u017a\7>\2\2\u017ap\3\2\2\2\u017b\u017c\7"+
		",\2\2\u017cr\3\2\2\2\u017d\u017e\7\61\2\2\u017et\3\2\2\2\u017f\u0180\7"+
		"-\2\2\u0180v\3\2\2\2\u0181\u0182\7/\2\2\u0182x\3\2\2\2\u0183\u0184\7\'"+
		"\2\2\u0184z\3\2\2\2\u0185\u0187\t\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189|\3\2\2\2\u018a"+
		"\u018c\t\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018e\3\2\2\2\u018e~\3\2\2\2\u018f\u0191\t\2\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\t\3\2\2\u0195\u0197\t\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u0080\3\2\2\2\u019a\u019e\7$\2\2\u019b\u019d\n\4\2\2\u019c\u019b\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7$\2\2\u01a2\u0082\3\2"+
		"\2\2\u01a3\u01a7\7)\2\2\u01a4\u01a6\n\4\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7)\2\2\u01ab\u0084\3\2\2\2\u01ac"+
		"\u01ad\7v\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7g\2\2"+
		"\u01b0\u0086\3\2\2\2\u01b1\u01b2\7h\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4"+
		"\7n\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7g\2\2\u01b6\u0088\3\2\2\2\u01b7"+
		"\u01bb\t\5\2\2\u01b8\u01ba\t\6\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u008a\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c0\t\7\2\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\bF\2\2\u01c4\u008c\3\2\2\2\u01c5\u01c6\7^\2\2\u01c6\u01c7\t\b\2"+
		"\2\u01c7\u008e\3\2\2\2\13\2\u0188\u018d\u0192\u0198\u019e\u01a7\u01bb"+
		"\u01c1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
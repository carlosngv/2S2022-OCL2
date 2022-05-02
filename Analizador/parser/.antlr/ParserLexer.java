// Generated from /Users/carlosngv/Documents/U/OCL2/OCL2 - 1S2022/Proyectos/Analizador/parser/ParserLexer.g4 by ANTLR 4.8
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
		PRINTLN=8, VEC=9, VEC_VACIO=10, IF_TOK=11, ELSE=12, MATCH=13, WHILE=14, 
		LOOP=15, FOR=16, IN=17, MOD_=18, MUT=19, FN=20, LET=21, CLASS=22, NEW_=23, 
		MAIN=24, PRIVATE=25, PUB=26, STATIC=27, RETURN_P=28, BREAK_P=29, CONTINUE_P=30, 
		ABS=31, SQRT=32, TO_STRING=33, CLONE=34, POW=35, POWF=36, INTTYPE=37, 
		FLOATTYPE=38, STRINGTYPE=39, STRTYPE=40, CHARTYPE=41, VOIDTYPE=42, BOOLTYPE=43, 
		USIZETYPE=44, PUNTO=45, COMA=46, PTCOMA=47, DOSPUNTOS=48, AND=49, OR_CASE=50, 
		OR=51, NOT=52, IGUAL=53, IGUAL_IGUAL=54, DIFERENTE=55, MAYORIGUAL=56, 
		MENORIGUAL=57, MAYOR=58, MENOR=59, MUL=60, DIV=61, ADD=62, SUB=63, MOD=64, 
		NUMBER=65, USIZE=66, FLOAT=67, STRING=68, CHAR=69, TRUE=70, FALSE=71, 
		ID=72, WHITESPACE=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "GUION_BAJO", 
			"PRINTLN", "VEC", "VEC_VACIO", "IF_TOK", "ELSE", "MATCH", "WHILE", "LOOP", 
			"FOR", "IN", "MOD_", "MUT", "FN", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", 
			"PUB", "STATIC", "RETURN_P", "BREAK_P", "CONTINUE_P", "ABS", "SQRT", 
			"TO_STRING", "CLONE", "POW", "POWF", "INTTYPE", "FLOATTYPE", "STRINGTYPE", 
			"STRTYPE", "CHARTYPE", "VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", 
			"COMA", "PTCOMA", "DOSPUNTOS", "AND", "OR_CASE", "OR", "NOT", "IGUAL", 
			"IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "NUMBER", "USIZE", "FLOAT", "STRING", 
			"CHAR", "TRUE", "FALSE", "ID", "WHITESPACE", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'_'", "'println!'", 
			"'vec!'", "'Vec'", "'if'", "'else'", "'match'", "'while'", "'loop'", 
			"'for'", "'in'", "'mod'", "'mut'", "'fn'", "'let'", "'class'", "'new'", 
			"'main'", "'private'", "'pub'", "'static'", "'return'", "'break'", "'continue'", 
			"'abs'", "'sqrt'", "'to_string'", "'clone'", "'pow'", "'powf'", "'i64'", 
			"'f64'", "'String'", "'&str'", "'char'", "'void'", "'bool'", "'usize'", 
			"'.'", "','", "';'", "':'", "'&&'", "'|'", "'||'", "'!'", "'='", "'=='", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			null, null, null, null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "GUION_BAJO", 
			"PRINTLN", "VEC", "VEC_VACIO", "IF_TOK", "ELSE", "MATCH", "WHILE", "LOOP", 
			"FOR", "IN", "MOD_", "MUT", "FN", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", 
			"PUB", "STATIC", "RETURN_P", "BREAK_P", "CONTINUE_P", "ABS", "SQRT", 
			"TO_STRING", "CLONE", "POW", "POWF", "INTTYPE", "FLOATTYPE", "STRINGTYPE", 
			"STRTYPE", "CHARTYPE", "VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", 
			"COMA", "PTCOMA", "DOSPUNTOS", "AND", "OR_CASE", "OR", "NOT", "IGUAL", 
			"IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", 
			"MUL", "DIV", "ADD", "SUB", "MOD", "NUMBER", "USIZE", "FLOAT", "STRING", 
			"CHAR", "TRUE", "FALSE", "ID", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3"+
		"\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3"+
		">\3>\3?\3?\3@\3@\3A\3A\3B\6B\u0199\nB\rB\16B\u019a\3C\6C\u019e\nC\rC\16"+
		"C\u019f\3D\6D\u01a3\nD\rD\16D\u01a4\3D\3D\6D\u01a9\nD\rD\16D\u01aa\3E"+
		"\3E\7E\u01af\nE\fE\16E\u01b2\13E\3E\3E\3F\3F\7F\u01b8\nF\fF\16F\u01bb"+
		"\13F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\7I\u01cc\nI\fI\16I\u01cf"+
		"\13I\3J\6J\u01d2\nJ\rJ\16J\u01d3\3J\3J\3K\3K\3K\2\2L\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095\2\3\2\t\3\2\62;\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\t\2\"#%%--/\60<<BB]_\2\u01e0\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2"+
		"\2\t\u009d\3\2\2\2\13\u009f\3\2\2\2\r\u00a1\3\2\2\2\17\u00a3\3\2\2\2\21"+
		"\u00a5\3\2\2\2\23\u00ae\3\2\2\2\25\u00b3\3\2\2\2\27\u00b7\3\2\2\2\31\u00ba"+
		"\3\2\2\2\33\u00bf\3\2\2\2\35\u00c5\3\2\2\2\37\u00cb\3\2\2\2!\u00d0\3\2"+
		"\2\2#\u00d4\3\2\2\2%\u00d7\3\2\2\2\'\u00db\3\2\2\2)\u00df\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e6\3\2\2\2/\u00ec\3\2\2\2\61\u00f0\3\2\2\2\63\u00f5\3\2\2"+
		"\2\65\u00fd\3\2\2\2\67\u0101\3\2\2\29\u0108\3\2\2\2;\u010f\3\2\2\2=\u0115"+
		"\3\2\2\2?\u011e\3\2\2\2A\u0122\3\2\2\2C\u0127\3\2\2\2E\u0131\3\2\2\2G"+
		"\u0137\3\2\2\2I\u013b\3\2\2\2K\u0140\3\2\2\2M\u0144\3\2\2\2O\u0148\3\2"+
		"\2\2Q\u014f\3\2\2\2S\u0154\3\2\2\2U\u0159\3\2\2\2W\u015e\3\2\2\2Y\u0163"+
		"\3\2\2\2[\u0169\3\2\2\2]\u016b\3\2\2\2_\u016d\3\2\2\2a\u016f\3\2\2\2c"+
		"\u0171\3\2\2\2e\u0174\3\2\2\2g\u0176\3\2\2\2i\u0179\3\2\2\2k\u017b\3\2"+
		"\2\2m\u017d\3\2\2\2o\u0180\3\2\2\2q\u0183\3\2\2\2s\u0186\3\2\2\2u\u0189"+
		"\3\2\2\2w\u018b\3\2\2\2y\u018d\3\2\2\2{\u018f\3\2\2\2}\u0191\3\2\2\2\177"+
		"\u0193\3\2\2\2\u0081\u0195\3\2\2\2\u0083\u0198\3\2\2\2\u0085\u019d\3\2"+
		"\2\2\u0087\u01a2\3\2\2\2\u0089\u01ac\3\2\2\2\u008b\u01b5\3\2\2\2\u008d"+
		"\u01be\3\2\2\2\u008f\u01c3\3\2\2\2\u0091\u01c9\3\2\2\2\u0093\u01d1\3\2"+
		"\2\2\u0095\u01d7\3\2\2\2\u0097\u0098\7*\2\2\u0098\4\3\2\2\2\u0099\u009a"+
		"\7+\2\2\u009a\6\3\2\2\2\u009b\u009c\7}\2\2\u009c\b\3\2\2\2\u009d\u009e"+
		"\7\177\2\2\u009e\n\3\2\2\2\u009f\u00a0\7]\2\2\u00a0\f\3\2\2\2\u00a1\u00a2"+
		"\7_\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7a\2\2\u00a4\20\3\2\2\2\u00a5\u00a6"+
		"\7r\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7#\2\2"+
		"\u00ad\22\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7"+
		"e\2\2\u00b1\u00b2\7#\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7X\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7e\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9"+
		"\7h\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7g\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7c\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4\7j\2\2\u00c4"+
		"\34\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7r\2\2\u00cf \3\2\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3\"\3\2\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7o\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7f\2\2\u00da&\3\2\2\2\u00db\u00dc\7o\2\2\u00dc"+
		"\u00dd\7w\2\2\u00dd\u00de\7v\2\2\u00de(\3\2\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7u\2\2\u00eb.\3\2\2\2\u00ec"+
		"\u00ed\7p\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7y\2\2\u00ef\60\3\2\2\2\u00f0"+
		"\u00f1\7o\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2"+
		"\u00f4\62\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7"+
		"k\2\2\u00f8\u00f9\7x\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100"+
		"\7d\2\2\u0100\66\3\2\2\2\u0101\u0102\7u\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7c\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107\7e\2\2\u0107"+
		"8\3\2\2\2\u0108\u0109\7t\2\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b"+
		"\u010c\7w\2\2\u010c\u010d\7t\2\2\u010d\u010e\7p\2\2\u010e:\3\2\2\2\u010f"+
		"\u0110\7d\2\2\u0110\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7m\2\2\u0114<\3\2\2\2\u0115\u0116\7e\2\2\u0116\u0117\7q\2"+
		"\2\u0117\u0118\7p\2\2\u0118\u0119\7v\2\2\u0119\u011a\7k\2\2\u011a\u011b"+
		"\7p\2\2\u011b\u011c\7w\2\2\u011c\u011d\7g\2\2\u011d>\3\2\2\2\u011e\u011f"+
		"\7c\2\2\u011f\u0120\7d\2\2\u0120\u0121\7u\2\2\u0121@\3\2\2\2\u0122\u0123"+
		"\7u\2\2\u0123\u0124\7s\2\2\u0124\u0125\7t\2\2\u0125\u0126\7v\2\2\u0126"+
		"B\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7q\2\2\u0129\u012a\7a\2\2\u012a"+
		"\u012b\7u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7k\2\2"+
		"\u012e\u012f\7p\2\2\u012f\u0130\7i\2\2\u0130D\3\2\2\2\u0131\u0132\7e\2"+
		"\2\u0132\u0133\7n\2\2\u0133\u0134\7q\2\2\u0134\u0135\7p\2\2\u0135\u0136"+
		"\7g\2\2\u0136F\3\2\2\2\u0137\u0138\7r\2\2\u0138\u0139\7q\2\2\u0139\u013a"+
		"\7y\2\2\u013aH\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7q\2\2\u013d\u013e"+
		"\7y\2\2\u013e\u013f\7h\2\2\u013fJ\3\2\2\2\u0140\u0141\7k\2\2\u0141\u0142"+
		"\78\2\2\u0142\u0143\7\66\2\2\u0143L\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146"+
		"\78\2\2\u0146\u0147\7\66\2\2\u0147N\3\2\2\2\u0148\u0149\7U\2\2\u0149\u014a"+
		"\7v\2\2\u014a\u014b\7t\2\2\u014b\u014c\7k\2\2\u014c\u014d\7p\2\2\u014d"+
		"\u014e\7i\2\2\u014eP\3\2\2\2\u014f\u0150\7(\2\2\u0150\u0151\7u\2\2\u0151"+
		"\u0152\7v\2\2\u0152\u0153\7t\2\2\u0153R\3\2\2\2\u0154\u0155\7e\2\2\u0155"+
		"\u0156\7j\2\2\u0156\u0157\7c\2\2\u0157\u0158\7t\2\2\u0158T\3\2\2\2\u0159"+
		"\u015a\7x\2\2\u015a\u015b\7q\2\2\u015b\u015c\7k\2\2\u015c\u015d\7f\2\2"+
		"\u015dV\3\2\2\2\u015e\u015f\7d\2\2\u015f\u0160\7q\2\2\u0160\u0161\7q\2"+
		"\2\u0161\u0162\7n\2\2\u0162X\3\2\2\2\u0163\u0164\7w\2\2\u0164\u0165\7"+
		"u\2\2\u0165\u0166\7k\2\2\u0166\u0167\7|\2\2\u0167\u0168\7g\2\2\u0168Z"+
		"\3\2\2\2\u0169\u016a\7\60\2\2\u016a\\\3\2\2\2\u016b\u016c\7.\2\2\u016c"+
		"^\3\2\2\2\u016d\u016e\7=\2\2\u016e`\3\2\2\2\u016f\u0170\7<\2\2\u0170b"+
		"\3\2\2\2\u0171\u0172\7(\2\2\u0172\u0173\7(\2\2\u0173d\3\2\2\2\u0174\u0175"+
		"\7~\2\2\u0175f\3\2\2\2\u0176\u0177\7~\2\2\u0177\u0178\7~\2\2\u0178h\3"+
		"\2\2\2\u0179\u017a\7#\2\2\u017aj\3\2\2\2\u017b\u017c\7?\2\2\u017cl\3\2"+
		"\2\2\u017d\u017e\7?\2\2\u017e\u017f\7?\2\2\u017fn\3\2\2\2\u0180\u0181"+
		"\7#\2\2\u0181\u0182\7?\2\2\u0182p\3\2\2\2\u0183\u0184\7@\2\2\u0184\u0185"+
		"\7?\2\2\u0185r\3\2\2\2\u0186\u0187\7>\2\2\u0187\u0188\7?\2\2\u0188t\3"+
		"\2\2\2\u0189\u018a\7@\2\2\u018av\3\2\2\2\u018b\u018c\7>\2\2\u018cx\3\2"+
		"\2\2\u018d\u018e\7,\2\2\u018ez\3\2\2\2\u018f\u0190\7\61\2\2\u0190|\3\2"+
		"\2\2\u0191\u0192\7-\2\2\u0192~\3\2\2\2\u0193\u0194\7/\2\2\u0194\u0080"+
		"\3\2\2\2\u0195\u0196\7\'\2\2\u0196\u0082\3\2\2\2\u0197\u0199\t\2\2\2\u0198"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u0084\3\2\2\2\u019c\u019e\t\2\2\2\u019d\u019c\3\2\2\2\u019e"+
		"\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u0086\3\2"+
		"\2\2\u01a1\u01a3\t\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\t\3"+
		"\2\2\u01a7\u01a9\t\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u0088\3\2\2\2\u01ac\u01b0\7$"+
		"\2\2\u01ad\u01af\n\4\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b4\7$\2\2\u01b4\u008a\3\2\2\2\u01b5\u01b9\7)\2\2\u01b6\u01b8"+
		"\n\4\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7)"+
		"\2\2\u01bd\u008c\3\2\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0\7t\2\2\u01c0\u01c1"+
		"\7w\2\2\u01c1\u01c2\7g\2\2\u01c2\u008e\3\2\2\2\u01c3\u01c4\7h\2\2\u01c4"+
		"\u01c5\7c\2\2\u01c5\u01c6\7n\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7g\2\2"+
		"\u01c8\u0090\3\2\2\2\u01c9\u01cd\t\5\2\2\u01ca\u01cc\t\6\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u0092\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\t\7\2\2\u01d1\u01d0\3\2"+
		"\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\bJ\2\2\u01d6\u0094\3\2\2\2\u01d7\u01d8\7^\2"+
		"\2\u01d8\u01d9\t\b\2\2\u01d9\u0096\3\2\2\2\13\2\u019a\u019f\u01a4\u01aa"+
		"\u01b0\u01b9\u01cd\u01d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
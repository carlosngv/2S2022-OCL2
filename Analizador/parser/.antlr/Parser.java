// Generated from /Users/carlosngv/Documents/U/OCL2/OCL2 - 1S2022/Proyectos/Analizador/parser/Parser.g4 by ANTLR 4.8


    import "p1/packages/Analizador/ast"
    import "p1/packages/Analizador/ast/interfaces"
    import "p1/packages/Analizador/ast/expresion" // id, operacion, primitivo
    import "p1/packages/Analizador/ast/expresion/Accesos" // AccesoArreglo, AccesoObjeto
    import "p1/packages/Analizador/ast/expresion2" // Llamada
    import "p1/packages/Analizador/ast/instrucciones" // print, declaracion, asignación, defClase
    import "p1/packages/Analizador/ast/asignacion" // asignación
    import "p1/packages/Analizador/ast/instrucciones/Definicion" // DefinicionArreglo, DefinicionObjeto
    import "p1/packages/Analizador/ast/instrucciones/SentenciasTransferencia"
    import "p1/packages/Analizador/ast/instrucciones/SentenciasControl"
    import "p1/packages/Analizador/ast/funcionesNativas" // sqrt, abs, to_string()
    import "p1/packages/Analizador/ast/instrucciones/SentenciasCiclicas"
    import "p1/packages/Analizador/entorno"
    import "p1/packages/Analizador/entorno/Simbolos"
    import arrayList "github.com/colegno/arraylist"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Parser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_listaClases = 1, RULE_clases = 2, RULE_cuerpoClase = 3, 
		RULE_contenidoClase = 4, RULE_itemClase = 5, RULE_funcionItem = 6, RULE_modaccess = 7, 
		RULE_parametros = 8, RULE_parametro = 9, RULE_funcmain = 10, RULE_bloque = 11, 
		RULE_instrucciones = 12, RULE_instruccion = 13, RULE_asignacion = 14, 
		RULE_if_instr = 15, RULE_listaelseif = 16, RULE_else_if = 17, RULE_match_instr = 18, 
		RULE_bloque_match = 19, RULE_listacase = 20, RULE_match_case = 21, RULE_listaexpre_case = 22, 
		RULE_while_instr = 23, RULE_loop_instr = 24, RULE_consola = 25, RULE_llamada = 26, 
		RULE_listaExpresiones = 27, RULE_declaracionIni = 28, RULE_declaracion = 29, 
		RULE_retorno = 30, RULE_sentencia_break = 31, RULE_sentencia_continue = 32, 
		RULE_listides = 33, RULE_tiposvars = 34, RULE_dec_arr = 35, RULE_dimensiones = 36, 
		RULE_dimension = 37, RULE_arraydata = 38, RULE_instancia = 39, RULE_listanchos = 40, 
		RULE_ancho = 41, RULE_dec_objeto = 42, RULE_instanciaClase = 43, RULE_accesoarr = 44, 
		RULE_accesoObjeto = 45, RULE_listaAccesos = 46, RULE_acceso = 47, RULE_asignacion_objeto = 48, 
		RULE_expresion = 49, RULE_expr_rel = 50, RULE_expr_log = 51, RULE_expr_arit = 52, 
		RULE_expr_valor = 53, RULE_primitivo = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaClases", "clases", "cuerpoClase", "contenidoClase", "itemClase", 
			"funcionItem", "modaccess", "parametros", "parametro", "funcmain", "bloque", 
			"instrucciones", "instruccion", "asignacion", "if_instr", "listaelseif", 
			"else_if", "match_instr", "bloque_match", "listacase", "match_case", 
			"listaexpre_case", "while_instr", "loop_instr", "consola", "llamada", 
			"listaExpresiones", "declaracionIni", "declaracion", "retorno", "sentencia_break", 
			"sentencia_continue", "listides", "tiposvars", "dec_arr", "dimensiones", 
			"dimension", "arraydata", "instancia", "listanchos", "ancho", "dec_objeto", 
			"instanciaClase", "accesoarr", "accesoObjeto", "listaAccesos", "acceso", 
			"asignacion_objeto", "expresion", "expr_rel", "expr_log", "expr_arit", 
			"expr_valor", "primitivo"
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
			"'f64'", "'String'", "'&str'", "'char'", "'void'", "'boolean'", "'usize'", 
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

	@Override
	public String getGrammarFileName() { return "Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    type  Prueba2 struct {
	        Op1 int
	        Operador string
	        Op2 int
	    }

	public Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ast.Ast ast;
		public ListaClasesContext listaClases;
		public ListaClasesContext listaClases() {
			return getRuleContext(ListaClasesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((StartContext)_localctx).listaClases = listaClases(0);
			 _localctx.ast = ast.NewAst( ((StartContext)_localctx).listaClases.lista)
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

	public static class ListaClasesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaClasesContext SUBLISTA;
		public ClasesContext clases;
		public ClasesContext clases() {
			return getRuleContext(ClasesContext.class,0);
		}
		public ListaClasesContext listaClases() {
			return getRuleContext(ListaClasesContext.class,0);
		}
		public ListaClasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaClases; }
	}

	public final ListaClasesContext listaClases() throws RecognitionException {
		return listaClases(0);
	}

	private ListaClasesContext listaClases(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaClasesContext _localctx = new ListaClasesContext(_ctx, _parentState);
		ListaClasesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_listaClases, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			((ListaClasesContext)_localctx).clases = clases();
			 _localctx.lista.Add( ((ListaClasesContext)_localctx).clases.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaClasesContext(_parentctx, _parentState);
					_localctx.SUBLISTA = _prevctx;
					_localctx.SUBLISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaClases);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					((ListaClasesContext)_localctx).clases = clases();

					                                                          ((ListaClasesContext)_localctx).SUBLISTA.lista.Add( ((ListaClasesContext)_localctx).clases.instr)
					                                                          _localctx.lista =  ((ListaClasesContext)_localctx).SUBLISTA.lista
					                                                      
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class ClasesContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public Token ID;
		public CuerpoClaseContext cuerpoClase;
		public TerminalNode MOD_() { return getToken(Parser.MOD_, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public CuerpoClaseContext cuerpoClase() {
			return getRuleContext(CuerpoClaseContext.class,0);
		}
		public ClasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clases; }
	}

	public final ClasesContext clases() throws RecognitionException {
		ClasesContext _localctx = new ClasesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(MOD_);
			setState(127);
			((ClasesContext)_localctx).ID = match(ID);
			setState(128);
			((ClasesContext)_localctx).cuerpoClase = cuerpoClase();
			_localctx.instr = instrucciones.NewDefClase((((ClasesContext)_localctx).ID!=null?((ClasesContext)_localctx).ID.getText():null), ((ClasesContext)_localctx).cuerpoClase.lista)
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

	public static class CuerpoClaseContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ContenidoClaseContext contenidoClase;
		public TerminalNode L_LLAVE() { return getToken(Parser.L_LLAVE, 0); }
		public ContenidoClaseContext contenidoClase() {
			return getRuleContext(ContenidoClaseContext.class,0);
		}
		public TerminalNode R_LLAVE() { return getToken(Parser.R_LLAVE, 0); }
		public CuerpoClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoClase; }
	}

	public final CuerpoClaseContext cuerpoClase() throws RecognitionException {
		CuerpoClaseContext _localctx = new CuerpoClaseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cuerpoClase);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(L_LLAVE);
				setState(132);
				((CuerpoClaseContext)_localctx).contenidoClase = contenidoClase(0);
				setState(133);
				match(R_LLAVE);
				_localctx.lista = ((CuerpoClaseContext)_localctx).contenidoClase.lista
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(L_LLAVE);
				setState(137);
				match(R_LLAVE);
				_localctx.lista = arrayList.New()
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

	public static class ContenidoClaseContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ContenidoClaseContext SUBLISTA;
		public ItemClaseContext itemClase;
		public ItemClaseContext itemClase() {
			return getRuleContext(ItemClaseContext.class,0);
		}
		public ContenidoClaseContext contenidoClase() {
			return getRuleContext(ContenidoClaseContext.class,0);
		}
		public ContenidoClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoClase; }
	}

	public final ContenidoClaseContext contenidoClase() throws RecognitionException {
		return contenidoClase(0);
	}

	private ContenidoClaseContext contenidoClase(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ContenidoClaseContext _localctx = new ContenidoClaseContext(_ctx, _parentState);
		ContenidoClaseContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_contenidoClase, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142);
			((ContenidoClaseContext)_localctx).itemClase = itemClase();

			                                                            _localctx.lista.Add( ((ContenidoClaseContext)_localctx).itemClase.instr )
			                                                        
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ContenidoClaseContext(_parentctx, _parentState);
					_localctx.SUBLISTA = _prevctx;
					_localctx.SUBLISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_contenidoClase);
					setState(145);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(146);
					((ContenidoClaseContext)_localctx).itemClase = itemClase();

					                                                                      ((ContenidoClaseContext)_localctx).SUBLISTA.lista.Add( ((ContenidoClaseContext)_localctx).itemClase.instr )
					                                                                      _localctx.lista = ((ContenidoClaseContext)_localctx).SUBLISTA.lista
					                                                                  
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ItemClaseContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public FuncionItemContext funcionItem;
		public DeclaracionIniContext declaracionIni;
		public DeclaracionContext declaracion;
		public FuncionItemContext funcionItem() {
			return getRuleContext(FuncionItemContext.class,0);
		}
		public DeclaracionIniContext declaracionIni() {
			return getRuleContext(DeclaracionIniContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(Parser.PTCOMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ItemClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemClase; }
	}

	public final ItemClaseContext itemClase() throws RecognitionException {
		ItemClaseContext _localctx = new ItemClaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_itemClase);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FN:
			case PUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				((ItemClaseContext)_localctx).funcionItem = funcionItem();
				_localctx.instr = ((ItemClaseContext)_localctx).funcionItem.instr
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((ItemClaseContext)_localctx).declaracionIni = declaracionIni();
				setState(158);
				match(PTCOMA);
				_localctx.instr = ((ItemClaseContext)_localctx).declaracionIni.instr
				}
				break;
			case INTTYPE:
			case FLOATTYPE:
			case STRINGTYPE:
			case STRTYPE:
			case CHARTYPE:
			case VOIDTYPE:
			case BOOLTYPE:
			case USIZETYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				((ItemClaseContext)_localctx).declaracion = declaracion();
				setState(162);
				match(PTCOMA);
				_localctx.instr = ((ItemClaseContext)_localctx).declaracion.instr
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

	public static class FuncionItemContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public FuncmainContext funcmain;
		public Token ID;
		public BloqueContext bloque;
		public ParametrosContext parametros;
		public TiposvarsContext tiposvars;
		public FuncmainContext funcmain() {
			return getRuleContext(FuncmainContext.class,0);
		}
		public ModaccessContext modaccess() {
			return getRuleContext(ModaccessContext.class,0);
		}
		public TerminalNode FN() { return getToken(Parser.FN, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public TerminalNode MAYOR() { return getToken(Parser.MAYOR, 0); }
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public FuncionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionItem; }
	}

	public final FuncionItemContext funcionItem() throws RecognitionException {
		FuncionItemContext _localctx = new FuncionItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcionItem);
		 listaParams :=  arrayList.New() 
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((FuncionItemContext)_localctx).funcmain = funcmain();
				 _localctx.instr =  ((FuncionItemContext)_localctx).funcmain.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				modaccess();
				setState(171);
				match(FN);
				setState(172);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(173);
				match(LP);
				setState(174);
				match(RP);
				setState(175);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NewFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				modaccess();
				setState(179);
				match(FN);
				setState(180);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(181);
				match(LP);
				setState(182);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(183);
				match(RP);
				setState(184);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NewFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),((FuncionItemContext)_localctx).parametros.lista,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID)
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				modaccess();
				setState(188);
				match(FN);
				setState(189);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(190);
				match(LP);
				setState(191);
				match(RP);
				setState(192);
				match(SUB);
				setState(193);
				match(MAYOR);
				setState(194);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(195);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NewFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,((FuncionItemContext)_localctx).tiposvars.tipo)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				modaccess();
				setState(199);
				match(FN);
				setState(200);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(201);
				match(LP);
				setState(202);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(203);
				match(RP);
				setState(204);
				match(SUB);
				setState(205);
				match(MAYOR);
				setState(206);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(207);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NewFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),((FuncionItemContext)_localctx).parametros.lista,((FuncionItemContext)_localctx).bloque.lista,((FuncionItemContext)_localctx).tiposvars.tipo)
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

	public static class ModaccessContext extends ParserRuleContext {
		public entorno.TipoModAccess modAccess;
		public TerminalNode PUB() { return getToken(Parser.PUB, 0); }
		public ModaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modaccess; }
	}

	public final ModaccessContext modaccess() throws RecognitionException {
		ModaccessContext _localctx = new ModaccessContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modaccess);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(PUB);
				 _localctx.modAccess = entorno.PUBLIC
				}
				break;
			case FN:
				enterOuterAlt(_localctx, 2);
				{
				 _localctx.modAccess = entorno.PRIVATE
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

	public static class ParametrosContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ParametrosContext sublista;
		public ParametroContext parametro;
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Parser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		return parametros(0);
	}

	private ParametrosContext parametros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParametrosContext _localctx = new ParametrosContext(_ctx, _parentState);
		ParametrosContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_parametros, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(218);
			((ParametrosContext)_localctx).parametro = parametro();

			                                                                    _localctx.lista.Add( ((ParametrosContext)_localctx).parametro.instr)
			                                                                 
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametrosContext(_parentctx, _parentState);
					_localctx.sublista = _prevctx;
					_localctx.sublista = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_parametros);
					setState(221);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(222);
					match(COMA);
					setState(223);
					((ParametrosContext)_localctx).parametro = parametro();

					                                                                              ((ParametrosContext)_localctx).sublista.lista.Add( ((ParametrosContext)_localctx).parametro.instr )
					                                                                              _localctx.lista =  ((ParametrosContext)_localctx).sublista.lista
					                                                                           
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ParametroContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public TiposvarsContext tiposvars;
		public Token ID;
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode MUL() { return getToken(Parser.MUL, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametro);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
			case FLOATTYPE:
			case STRINGTYPE:
			case STRTYPE:
			case CHARTYPE:
			case VOIDTYPE:
			case BOOLTYPE:
			case USIZETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((ParametroContext)_localctx).tiposvars = tiposvars();
				setState(232);
				((ParametroContext)_localctx).ID = match(ID);

				                                                                    listaIdes := arrayList.New()
				                                                                    listaIdes.Add(expresion.NewIdentificador((((ParametroContext)_localctx).ID!=null?((ParametroContext)_localctx).ID.getText():null)))
				                                                                    _localctx.instr = instrucciones.NewDeclaracionParametro(listaIdes, ((ParametroContext)_localctx).tiposvars.tipo,false)
				                                                                
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(MUL);
				setState(236);
				((ParametroContext)_localctx).tiposvars = tiposvars();
				setState(237);
				((ParametroContext)_localctx).ID = match(ID);

				                                                                    listaIdes := arrayList.New()
				                                                                    listaIdes.Add(expresion.NewIdentificador((((ParametroContext)_localctx).ID!=null?((ParametroContext)_localctx).ID.getText():null)))
				                                                                    _localctx.instr = instrucciones.NewDeclaracionParametro(listaIdes, ((ParametroContext)_localctx).tiposvars.tipo,true)
				                                                                
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

	public static class FuncmainContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public BloqueContext bloque;
		public TerminalNode FN() { return getToken(Parser.FN, 0); }
		public TerminalNode MAIN() { return getToken(Parser.MAIN, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public FuncmainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcmain; }
	}

	public final FuncmainContext funcmain() throws RecognitionException {
		FuncmainContext _localctx = new FuncmainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcmain);
		 listaParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(FN);
			setState(243);
			match(MAIN);
			setState(244);
			match(LP);
			setState(245);
			match(RP);
			setState(246);
			((FuncmainContext)_localctx).bloque = bloque();
			 _localctx.instr = Simbolos.NewFuncion("main",listaParams,((FuncmainContext)_localctx).bloque.lista,entorno.VOID)
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

	public static class BloqueContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionesContext instrucciones;
		public TerminalNode L_LLAVE() { return getToken(Parser.L_LLAVE, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode R_LLAVE() { return getToken(Parser.R_LLAVE, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(L_LLAVE);
				setState(250);
				((BloqueContext)_localctx).instrucciones = instrucciones();
				setState(251);
				match(R_LLAVE);
				_localctx.lista = ((BloqueContext)_localctx).instrucciones.lista 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(L_LLAVE);
				setState(255);
				match(R_LLAVE);
				_localctx.lista = arrayList.New()
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

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instrucciones);
		 _localctx.lista =  arrayList.New() 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << IF_TOK) | (1L << MATCH) | (1L << WHILE) | (1L << LOOP) | (1L << LET) | (1L << RETURN_P) | (1L << BREAK_P) | (1L << CONTINUE_P) | (1L << INTTYPE) | (1L << FLOATTYPE) | (1L << STRINGTYPE) | (1L << STRTYPE) | (1L << CHARTYPE) | (1L << VOIDTYPE) | (1L << BOOLTYPE) | (1L << USIZETYPE))) != 0) || _la==ID );

			                                                                    listInt := localctx.(*InstruccionesContext).GetE()
			                                                                        for _, e := range listInt {
			                                                                          _localctx.lista.Add(e.GetInstr())
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

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public AsignacionContext asignacion;
		public Sentencia_breakContext sentencia_break;
		public Match_instrContext match_instr;
		public ConsolaContext consola;
		public While_instrContext while_instr;
		public Loop_instrContext loop_instr;
		public If_instrContext if_instr;
		public DeclaracionIniContext declaracionIni;
		public DeclaracionContext declaracion;
		public LlamadaContext llamada;
		public RetornoContext retorno;
		public Sentencia_continueContext sentencia_continue;
		public Dec_arrContext dec_arr;
		public Dec_objetoContext dec_objeto;
		public Asignacion_objetoContext asignacion_objeto;
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(Parser.PTCOMA, 0); }
		public Sentencia_breakContext sentencia_break() {
			return getRuleContext(Sentencia_breakContext.class,0);
		}
		public Match_instrContext match_instr() {
			return getRuleContext(Match_instrContext.class,0);
		}
		public ConsolaContext consola() {
			return getRuleContext(ConsolaContext.class,0);
		}
		public While_instrContext while_instr() {
			return getRuleContext(While_instrContext.class,0);
		}
		public Loop_instrContext loop_instr() {
			return getRuleContext(Loop_instrContext.class,0);
		}
		public If_instrContext if_instr() {
			return getRuleContext(If_instrContext.class,0);
		}
		public DeclaracionIniContext declaracionIni() {
			return getRuleContext(DeclaracionIniContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Sentencia_continueContext sentencia_continue() {
			return getRuleContext(Sentencia_continueContext.class,0);
		}
		public Dec_arrContext dec_arr() {
			return getRuleContext(Dec_arrContext.class,0);
		}
		public Dec_objetoContext dec_objeto() {
			return getRuleContext(Dec_objetoContext.class,0);
		}
		public Asignacion_objetoContext asignacion_objeto() {
			return getRuleContext(Asignacion_objetoContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instruccion);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(267);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((InstruccionContext)_localctx).sentencia_break = sentencia_break();
				setState(271);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_break.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				((InstruccionContext)_localctx).match_instr = match_instr();
				_localctx.instr = ((InstruccionContext)_localctx).match_instr.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				((InstruccionContext)_localctx).consola = consola();
				setState(278);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				((InstruccionContext)_localctx).consola = consola();
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				((InstruccionContext)_localctx).while_instr = while_instr();
				_localctx.instr = ((InstruccionContext)_localctx).while_instr.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				((InstruccionContext)_localctx).loop_instr = loop_instr();
				_localctx.instr = ((InstruccionContext)_localctx).loop_instr.instr
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				((InstruccionContext)_localctx).if_instr = if_instr();
				_localctx.instr = ((InstruccionContext)_localctx).if_instr.instr
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(293);
				((InstruccionContext)_localctx).declaracionIni = declaracionIni();
				setState(294);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracionIni.instr
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(298);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(301);
				((InstruccionContext)_localctx).llamada = llamada();
				setState(302);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).llamada.instr
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(305);
				((InstruccionContext)_localctx).retorno = retorno();
				setState(306);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).retorno.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(309);
				((InstruccionContext)_localctx).sentencia_continue = sentencia_continue();
				setState(310);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_continue.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(313);
				((InstruccionContext)_localctx).dec_arr = dec_arr();
				setState(314);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_arr.instr
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(317);
				((InstruccionContext)_localctx).dec_objeto = dec_objeto();
				setState(318);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_objeto.instr
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(321);
				((InstruccionContext)_localctx).asignacion_objeto = asignacion_objeto();
				setState(322);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion_objeto.instr
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

	public static class AsignacionContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(328);
			match(IGUAL);
			setState(329);
			((AsignacionContext)_localctx).expresion = expresion();
			_localctx.instr = asignacion.NewAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expresion.expr, 0,0 )
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

	public static class If_instrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public BloqueContext bloque;
		public BloqueContext bprincipal;
		public BloqueContext belse;
		public ListaelseifContext listaelseif;
		public TerminalNode IF_TOK() { return getToken(Parser.IF_TOK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public ListaelseifContext listaelseif() {
			return getRuleContext(ListaelseifContext.class,0);
		}
		public If_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instr; }
	}

	public final If_instrContext if_instr() throws RecognitionException {
		If_instrContext _localctx = new If_instrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_instr);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(IF_TOK);
				setState(333);
				((If_instrContext)_localctx).expresion = expresion();
				setState(334);
				((If_instrContext)_localctx).bloque = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expresion.expr,((If_instrContext)_localctx).bloque.lista,nil,nil)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(IF_TOK);
				setState(338);
				((If_instrContext)_localctx).expresion = expresion();
				setState(339);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(340);
				match(ELSE);
				setState(341);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expresion.expr,((If_instrContext)_localctx).bprincipal.lista,nil,((If_instrContext)_localctx).belse.lista)
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(IF_TOK);
				setState(345);
				((If_instrContext)_localctx).expresion = expresion();
				setState(346);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(347);
				((If_instrContext)_localctx).listaelseif = listaelseif();
				setState(348);
				match(ELSE);
				setState(349);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expresion.expr,((If_instrContext)_localctx).bprincipal.lista,((If_instrContext)_localctx).listaelseif.lista,((If_instrContext)_localctx).belse.lista)
				    
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

	public static class ListaelseifContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_ifContext else_if;
		public List<Else_ifContext> list = new ArrayList<Else_ifContext>();
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public ListaelseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaelseif; }
	}

	public final ListaelseifContext listaelseif() throws RecognitionException {
		ListaelseifContext _localctx = new ListaelseifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listaelseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(354);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			    listInt := localctx.(*ListaelseifContext).GetList()
			    for _, e := range listInt {
			        _localctx.lista.Add(e.GetInstr())
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

	public static class Else_ifContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public BloqueContext bloque;
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public TerminalNode IF_TOK() { return getToken(Parser.IF_TOK, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ELSE);
			setState(362);
			match(IF_TOK);
			setState(363);
			((Else_ifContext)_localctx).expresion = expresion();
			setState(364);
			((Else_ifContext)_localctx).bloque = bloque();
			_localctx.instr = SentenciasControl.NewIfInstruccion(((Else_ifContext)_localctx).expresion.expr,((Else_ifContext)_localctx).bloque.lista,nil,nil)
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

	public static class Match_instrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public Bloque_matchContext bloque_match;
		public TerminalNode MATCH() { return getToken(Parser.MATCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Bloque_matchContext bloque_match() {
			return getRuleContext(Bloque_matchContext.class,0);
		}
		public Match_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_instr; }
	}

	public final Match_instrContext match_instr() throws RecognitionException {
		Match_instrContext _localctx = new Match_instrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_match_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(MATCH);
			setState(368);
			((Match_instrContext)_localctx).expresion = expresion();
			setState(369);
			((Match_instrContext)_localctx).bloque_match = bloque_match();

			            _localctx.instr = SentenciasControl.NewMatchInstruccion(((Match_instrContext)_localctx).expresion.expr,((Match_instrContext)_localctx).bloque_match.lista)
			        
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

	public static class Bloque_matchContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListacaseContext listacase;
		public TerminalNode L_LLAVE() { return getToken(Parser.L_LLAVE, 0); }
		public ListacaseContext listacase() {
			return getRuleContext(ListacaseContext.class,0);
		}
		public TerminalNode R_LLAVE() { return getToken(Parser.R_LLAVE, 0); }
		public Bloque_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_match; }
	}

	public final Bloque_matchContext bloque_match() throws RecognitionException {
		Bloque_matchContext _localctx = new Bloque_matchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bloque_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(L_LLAVE);
			setState(373);
			((Bloque_matchContext)_localctx).listacase = listacase();
			setState(374);
			match(R_LLAVE);

			        _localctx.lista = ((Bloque_matchContext)_localctx).listacase.lista
			    
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

	public static class ListacaseContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Match_caseContext match_case;
		public List<Match_caseContext> list = new ArrayList<Match_caseContext>();
		public List<Match_caseContext> match_case() {
			return getRuleContexts(Match_caseContext.class);
		}
		public Match_caseContext match_case(int i) {
			return getRuleContext(Match_caseContext.class,i);
		}
		public ListacaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listacase; }
	}

	public final ListacaseContext listacase() throws RecognitionException {
		ListacaseContext _localctx = new ListacaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listacase);
		 _localctx.lista = arrayList.New()
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				((ListacaseContext)_localctx).match_case = match_case();
				((ListacaseContext)_localctx).list.add(((ListacaseContext)_localctx).match_case);
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << L_CORCH) | (1L << GUION_BAJO) | (1L << NEW_) | (1L << INTTYPE) | (1L << FLOATTYPE) | (1L << STRINGTYPE) | (1L << STRTYPE) | (1L << CHARTYPE) | (1L << VOIDTYPE) | (1L << BOOLTYPE) | (1L << USIZETYPE) | (1L << NOT) | (1L << SUB))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (NUMBER - 65)) | (1L << (USIZE - 65)) | (1L << (FLOAT - 65)) | (1L << (STRING - 65)) | (1L << (CHAR - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (ID - 65)))) != 0) );

			    listInt := localctx.(*ListacaseContext).GetList()
			    for _, e := range listInt {
			        _localctx.lista.Add(e.GetMatchCase())
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

	public static class Match_caseContext extends ParserRuleContext {
		public SentenciasControl.MatchCase matchCase;
		public Listaexpre_caseContext listaexpre_case;
		public InstruccionContext instruccion;
		public BloqueContext bloque;
		public Listaexpre_caseContext listaexpre_case() {
			return getRuleContext(Listaexpre_caseContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(Parser.MAYOR, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Parser.COMA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Match_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case; }
	}

	public final Match_caseContext match_case() throws RecognitionException {
		Match_caseContext _localctx = new Match_caseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_match_case);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(385);
				match(IGUAL);
				setState(386);
				match(MAYOR);
				setState(387);
				((Match_caseContext)_localctx).instruccion = instruccion();
				setState(388);
				match(COMA);

				        listaInstr := arrayList.New()
				        listaInstr.Add(((Match_caseContext)_localctx).instruccion.instr)
				        _localctx.matchCase = SentenciasControl.NewMatchCase(((Match_caseContext)_localctx).listaexpre_case.lista, listaInstr)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(392);
				match(IGUAL);
				setState(393);
				match(MAYOR);
				setState(394);
				((Match_caseContext)_localctx).bloque = bloque();

				        _localctx.matchCase = SentenciasControl.NewMatchCase(((Match_caseContext)_localctx).listaexpre_case.lista, ((Match_caseContext)_localctx).bloque.lista)
				    
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

	public static class Listaexpre_caseContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Listaexpre_caseContext LISTA;
		public ExpresionContext expresion;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode GUION_BAJO() { return getToken(Parser.GUION_BAJO, 0); }
		public TerminalNode OR_CASE() { return getToken(Parser.OR_CASE, 0); }
		public Listaexpre_caseContext listaexpre_case() {
			return getRuleContext(Listaexpre_caseContext.class,0);
		}
		public Listaexpre_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexpre_case; }
	}

	public final Listaexpre_caseContext listaexpre_case() throws RecognitionException {
		return listaexpre_case(0);
	}

	private Listaexpre_caseContext listaexpre_case(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Listaexpre_caseContext _localctx = new Listaexpre_caseContext(_ctx, _parentState);
		Listaexpre_caseContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listaexpre_case, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case L_CORCH:
			case NEW_:
			case INTTYPE:
			case FLOATTYPE:
			case STRINGTYPE:
			case STRTYPE:
			case CHARTYPE:
			case VOIDTYPE:
			case BOOLTYPE:
			case USIZETYPE:
			case NOT:
			case SUB:
			case NUMBER:
			case USIZE:
			case FLOAT:
			case STRING:
			case CHAR:
			case TRUE:
			case FALSE:
			case ID:
				{
				setState(400);
				((Listaexpre_caseContext)_localctx).expresion = expresion();

				        _localctx.lista.Add( ((Listaexpre_caseContext)_localctx).expresion.expr )
				        
				}
				break;
			case GUION_BAJO:
				{
				setState(403);
				match(GUION_BAJO);

				    _localctx.lista.Add("_")

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Listaexpre_caseContext(_parentctx, _parentState);
					_localctx.LISTA = _prevctx;
					_localctx.LISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaexpre_case);
					setState(407);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(408);
					match(OR_CASE);
					setState(409);
					((Listaexpre_caseContext)_localctx).expresion = expresion();

					                                                              ((Listaexpre_caseContext)_localctx).LISTA.lista.Add( ((Listaexpre_caseContext)_localctx).expresion.expr )
					                                                              _localctx.lista =  ((Listaexpre_caseContext)_localctx).LISTA.lista
					                                                          
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class While_instrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public BloqueContext bloque;
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public While_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_instr; }
	}

	public final While_instrContext while_instr() throws RecognitionException {
		While_instrContext _localctx = new While_instrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(WHILE);
			setState(418);
			((While_instrContext)_localctx).expresion = expresion();
			setState(419);
			((While_instrContext)_localctx).bloque = bloque();

			            _localctx.instr = SentenciasCiclicas.NewWhileInstruccion(((While_instrContext)_localctx).expresion.expr,((While_instrContext)_localctx).bloque.lista)
			        
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

	public static class Loop_instrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public BloqueContext bloque;
		public TerminalNode LOOP() { return getToken(Parser.LOOP, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Loop_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_instr; }
	}

	public final Loop_instrContext loop_instr() throws RecognitionException {
		Loop_instrContext _localctx = new Loop_instrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LOOP);
			setState(423);
			((Loop_instrContext)_localctx).bloque = bloque();

			            _localctx.instr = SentenciasCiclicas.NewLoopInstruccion(((Loop_instrContext)_localctx).bloque.lista)
			        
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

	public static class ConsolaContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public TerminalNode PRINTLN() { return getToken(Parser.PRINTLN, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public ConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consola; }
	}

	public final ConsolaContext consola() throws RecognitionException {
		ConsolaContext _localctx = new ConsolaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_consola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(PRINTLN);
			setState(427);
			match(LP);
			setState(428);
			((ConsolaContext)_localctx).expresion = expresion();
			setState(429);
			match(RP);
			_localctx.instr = instrucciones.NewImprimir(((ConsolaContext)_localctx).expresion.expr)
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

	public static class LlamadaContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public interfaces.Expresion expr;
		public Token ID;
		public ListaExpresionesContext listaExpresiones;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public LlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada; }
	}

	public final LlamadaContext llamada() throws RecognitionException {
		LlamadaContext _localctx = new LlamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_llamada);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(433);
				match(LP);
				setState(434);
				match(RP);

				                                                                        _localctx.instr = expresion2.NewLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				                                                                        _localctx.expr = expresion2.NewLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(437);
				match(LP);
				setState(438);
				((LlamadaContext)_localctx).listaExpresiones = listaExpresiones(0);
				setState(439);
				match(RP);

				                                                                        _localctx.instr = expresion2.NewLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), ((LlamadaContext)_localctx).listaExpresiones.lista)
				                                                                        _localctx.expr = expresion2.NewLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), ((LlamadaContext)_localctx).listaExpresiones.lista)
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

	public static class ListaExpresionesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaExpresionesContext LISTA;
		public ExpresionContext expresion;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(Parser.COMA, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public ListaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresiones; }
	}

	public final ListaExpresionesContext listaExpresiones() throws RecognitionException {
		return listaExpresiones(0);
	}

	private ListaExpresionesContext listaExpresiones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaExpresionesContext _localctx = new ListaExpresionesContext(_ctx, _parentState);
		ListaExpresionesContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_listaExpresiones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			((ListaExpresionesContext)_localctx).expresion = expresion();

			                                                                        _localctx.lista.Add( ((ListaExpresionesContext)_localctx).expresion.expr )
			                                                                     
			}
			_ctx.stop = _input.LT(-1);
			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaExpresionesContext(_parentctx, _parentState);
					_localctx.LISTA = _prevctx;
					_localctx.LISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaExpresiones);
					setState(448);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(449);
					match(COMA);
					setState(450);
					((ListaExpresionesContext)_localctx).expresion = expresion();

					                                                                                  ((ListaExpresionesContext)_localctx).LISTA.lista.Add( ((ListaExpresionesContext)_localctx).expresion.expr )
					                                                                                  _localctx.lista =  ((ListaExpresionesContext)_localctx).LISTA.lista
					                                                                               
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class DeclaracionIniContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ListidesContext listides;
		public ExpresionContext expresion;
		public TiposvarsContext tiposvars;
		public Token ID;
		public TerminalNode LET() { return getToken(Parser.LET, 0); }
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(Parser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(Parser.DOSPUNTOS, i);
		}
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode MUT() { return getToken(Parser.MUT, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public List<TerminalNode> VEC_VACIO() { return getTokens(Parser.VEC_VACIO); }
		public TerminalNode VEC_VACIO(int i) {
			return getToken(Parser.VEC_VACIO, i);
		}
		public TerminalNode MENOR() { return getToken(Parser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(Parser.MAYOR, 0); }
		public TerminalNode NEW_() { return getToken(Parser.NEW_, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public DeclaracionIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionIni; }
	}

	public final DeclaracionIniContext declaracionIni() throws RecognitionException {
		DeclaracionIniContext _localctx = new DeclaracionIniContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaracionIni);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(LET);
				setState(459);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(460);
				match(IGUAL);
				setState(461);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NewDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL ,((DeclaracionIniContext)_localctx).expresion.expr)
				                                                                     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(LET);
				setState(465);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(466);
				match(DOSPUNTOS);
				setState(467);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(468);
				match(IGUAL);
				setState(469);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NewDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expresion.expr)
				                                                                     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(LET);
				setState(473);
				match(MUT);
				setState(474);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(475);
				match(IGUAL);
				setState(476);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NewDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,entorno.NULL,((DeclaracionIniContext)_localctx).expresion.expr)
				                                                                     
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(479);
				match(LET);
				setState(480);
				match(MUT);
				setState(481);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(482);
				match(DOSPUNTOS);
				setState(483);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(484);
				match(IGUAL);
				setState(485);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				                                                                       // linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                       // columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NewDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expresion.expr)
				                                                                     
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				match(LET);
				setState(489);
				((DeclaracionIniContext)_localctx).ID = match(ID);
				setState(490);
				match(DOSPUNTOS);
				setState(491);
				match(VEC_VACIO);
				setState(492);
				match(MENOR);
				setState(493);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(494);
				match(MAYOR);
				setState(495);
				match(IGUAL);
				setState(496);
				match(VEC_VACIO);
				setState(497);
				match(DOSPUNTOS);
				setState(498);
				match(DOSPUNTOS);
				setState(499);
				match(NEW_);
				setState(500);
				match(LP);
				setState(501);
				match(RP);
				 _localctx.instr = expresion2.NewVector((((DeclaracionIniContext)_localctx).ID!=null?((DeclaracionIniContext)_localctx).ID.getText():null),((DeclaracionIniContext)_localctx).tiposvars.tipo, false) 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				match(LET);
				setState(505);
				match(MUT);
				setState(506);
				((DeclaracionIniContext)_localctx).ID = match(ID);
				setState(507);
				match(DOSPUNTOS);
				setState(508);
				match(VEC_VACIO);
				setState(509);
				match(MENOR);
				setState(510);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(511);
				match(MAYOR);
				setState(512);
				match(IGUAL);
				setState(513);
				match(VEC_VACIO);
				setState(514);
				match(DOSPUNTOS);
				setState(515);
				match(DOSPUNTOS);
				setState(516);
				match(NEW_);
				setState(517);
				match(LP);
				setState(518);
				match(RP);
				 _localctx.instr = expresion2.NewVector((((DeclaracionIniContext)_localctx).ID!=null?((DeclaracionIniContext)_localctx).ID.getText():null),((DeclaracionIniContext)_localctx).tiposvars.tipo, true) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(521);
				match(LET);
				setState(522);
				((DeclaracionIniContext)_localctx).ID = match(ID);
				setState(523);
				match(IGUAL);
				setState(524);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				        fmt.Println("\n DECL ARRAY EN DECLARACIONINI")
				        _localctx.instr = Definicion.NewDeclaracionArray(0,(((DeclaracionIniContext)_localctx).ID!=null?((DeclaracionIniContext)_localctx).ID.getText():null),((DeclaracionIniContext)_localctx).expresion.expr,entorno.VOID, false)
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(527);
				match(LET);
				setState(528);
				match(MUT);
				setState(529);
				((DeclaracionIniContext)_localctx).ID = match(ID);
				setState(530);
				match(IGUAL);
				setState(531);
				((DeclaracionIniContext)_localctx).expresion = expresion();

				        fmt.Println("\n DECL ARRAY EN DECLARACIONINI")
				        _localctx.instr = Definicion.NewDeclaracionArray(0,(((DeclaracionIniContext)_localctx).ID!=null?((DeclaracionIniContext)_localctx).ID.getText():null),((DeclaracionIniContext)_localctx).expresion.expr,entorno.VOID, true)
				    
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

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public TiposvarsContext tiposvars;
		public ListidesContext listides;
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			((DeclaracionContext)_localctx).tiposvars = tiposvars();
			setState(537);
			((DeclaracionContext)_localctx).listides = listides(0);

			                                                                        _localctx.instr = instrucciones.NewDeclaracion(((DeclaracionContext)_localctx).listides.lista,((DeclaracionContext)_localctx).tiposvars.tipo)
			                                                                    
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

	public static class RetornoContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public TerminalNode RETURN_P() { return getToken(Parser.RETURN_P, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_retorno);
		try {
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(RETURN_P);
				 _localctx.instr = SentenciasTransferencia.NewReturn(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(RETURN_P);
				setState(543);
				((RetornoContext)_localctx).expresion = expresion();
				 _localctx.instr = SentenciasTransferencia.NewReturn(entorno.NULL,((RetornoContext)_localctx).expresion.expr)
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

	public static class Sentencia_breakContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpresionContext expresion;
		public TerminalNode BREAK_P() { return getToken(Parser.BREAK_P, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_break; }
	}

	public final Sentencia_breakContext sentencia_break() throws RecognitionException {
		Sentencia_breakContext _localctx = new Sentencia_breakContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sentencia_break);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(BREAK_P);
				 _localctx.instr = SentenciasTransferencia.NewBreak(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				match(BREAK_P);
				setState(551);
				((Sentencia_breakContext)_localctx).expresion = expresion();
				 _localctx.instr = SentenciasTransferencia.NewBreak(entorno.NULL,((Sentencia_breakContext)_localctx).expresion.expr)
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

	public static class Sentencia_continueContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public TerminalNode CONTINUE_P() { return getToken(Parser.CONTINUE_P, 0); }
		public Sentencia_continueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_continue; }
	}

	public final Sentencia_continueContext sentencia_continue() throws RecognitionException {
		Sentencia_continueContext _localctx = new Sentencia_continueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sentencia_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(CONTINUE_P);
			 _localctx.instr = SentenciasTransferencia.NewContinue(entorno.VOID)
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

	public static class ListidesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListidesContext sub;
		public Token ID;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode COMA() { return getToken(Parser.COMA, 0); }
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public ListidesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listides; }
	}

	public final ListidesContext listides() throws RecognitionException {
		return listides(0);
	}

	private ListidesContext listides(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListidesContext _localctx = new ListidesContext(_ctx, _parentState);
		ListidesContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_listides, _p);
		  _localctx.lista =  arrayList.New() 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(560);
			((ListidesContext)_localctx).ID = match(ID);
			_localctx.lista.Add(expresion.NewIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
			}
			_ctx.stop = _input.LT(-1);
			setState(569);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListidesContext(_parentctx, _parentState);
					_localctx.sub = _prevctx;
					_localctx.sub = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listides);
					setState(563);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(564);
					match(COMA);
					setState(565);
					((ListidesContext)_localctx).ID = match(ID);

					                                                                              ((ListidesContext)_localctx).sub.lista.Add(expresion.NewIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
					                                                                              _localctx.lista = ((ListidesContext)_localctx).sub.lista
					                                                                          
					}
					} 
				}
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class TiposvarsContext extends ParserRuleContext {
		public entorno.TipoDato tipo;
		public TerminalNode INTTYPE() { return getToken(Parser.INTTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(Parser.STRINGTYPE, 0); }
		public TerminalNode STRTYPE() { return getToken(Parser.STRTYPE, 0); }
		public TerminalNode CHARTYPE() { return getToken(Parser.CHARTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(Parser.FLOATTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(Parser.BOOLTYPE, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parser.VOIDTYPE, 0); }
		public TerminalNode USIZETYPE() { return getToken(Parser.USIZETYPE, 0); }
		public TiposvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiposvars; }
	}

	public final TiposvarsContext tiposvars() throws RecognitionException {
		TiposvarsContext _localctx = new TiposvarsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tiposvars);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(INTTYPE);
				_localctx.tipo = entorno.INTEGER
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				match(STRINGTYPE);
				_localctx.tipo = entorno.STRING
				}
				break;
			case STRTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(STRTYPE);
				_localctx.tipo = entorno.STRING2
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(578);
				match(CHARTYPE);
				_localctx.tipo = entorno.CHAR
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(FLOATTYPE);
				_localctx.tipo = entorno.FLOAT
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(582);
				match(BOOLTYPE);
				_localctx.tipo = entorno.BOOLEAN
				}
				break;
			case VOIDTYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(584);
				match(VOIDTYPE);
				_localctx.tipo = entorno.VOID
				}
				break;
			case USIZETYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(586);
				match(USIZETYPE);
				_localctx.tipo = entorno.USIZE
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

	public static class Dec_arrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public Token ID;
		public TiposvarsContext tiposvars;
		public Token NUMBER;
		public ExpresionContext expresion;
		public TerminalNode LET() { return getToken(Parser.LET, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(Parser.DOSPUNTOS, 0); }
		public TerminalNode L_CORCH() { return getToken(Parser.L_CORCH, 0); }
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(Parser.PTCOMA, 0); }
		public TerminalNode NUMBER() { return getToken(Parser.NUMBER, 0); }
		public TerminalNode R_CORCH() { return getToken(Parser.R_CORCH, 0); }
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode MUT() { return getToken(Parser.MUT, 0); }
		public Dec_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_arr; }
	}

	public final Dec_arrContext dec_arr() throws RecognitionException {
		Dec_arrContext _localctx = new Dec_arrContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dec_arr);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(LET);
				setState(591);
				((Dec_arrContext)_localctx).ID = match(ID);
				setState(592);
				match(DOSPUNTOS);
				setState(593);
				match(L_CORCH);
				setState(594);
				((Dec_arrContext)_localctx).tiposvars = tiposvars();
				setState(595);
				match(PTCOMA);
				setState(596);
				((Dec_arrContext)_localctx).NUMBER = match(NUMBER);
				setState(597);
				match(R_CORCH);
				setState(598);
				match(IGUAL);
				setState(599);
				((Dec_arrContext)_localctx).expresion = expresion();

				        num, _ := strconv.Atoi((((Dec_arrContext)_localctx).NUMBER!=null?((Dec_arrContext)_localctx).NUMBER.getText():null))
				        _localctx.instr = Definicion.NewDeclaracionArray(num,(((Dec_arrContext)_localctx).ID!=null?((Dec_arrContext)_localctx).ID.getText():null),((Dec_arrContext)_localctx).expresion.expr,((Dec_arrContext)_localctx).tiposvars.tipo, false)
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				match(LET);
				setState(603);
				match(MUT);
				setState(604);
				((Dec_arrContext)_localctx).ID = match(ID);
				setState(605);
				match(DOSPUNTOS);
				setState(606);
				match(L_CORCH);
				setState(607);
				((Dec_arrContext)_localctx).tiposvars = tiposvars();
				setState(608);
				match(PTCOMA);
				setState(609);
				((Dec_arrContext)_localctx).NUMBER = match(NUMBER);
				setState(610);
				match(R_CORCH);
				setState(611);
				match(IGUAL);
				setState(612);
				((Dec_arrContext)_localctx).expresion = expresion();

				        num, _ := strconv.Atoi((((Dec_arrContext)_localctx).NUMBER!=null?((Dec_arrContext)_localctx).NUMBER.getText():null))
				        _localctx.instr = Definicion.NewDeclaracionArray(num,(((Dec_arrContext)_localctx).ID!=null?((Dec_arrContext)_localctx).ID.getText():null),((Dec_arrContext)_localctx).expresion.expr,((Dec_arrContext)_localctx).tiposvars.tipo, true)
				    
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

	public static class DimensionesContext extends ParserRuleContext {
		public int tam;
		public DimensionesContext tamano;
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public DimensionesContext dimensiones() {
			return getRuleContext(DimensionesContext.class,0);
		}
		public DimensionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensiones; }
	}

	public final DimensionesContext dimensiones() throws RecognitionException {
		return dimensiones(0);
	}

	private DimensionesContext dimensiones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DimensionesContext _localctx = new DimensionesContext(_ctx, _parentState);
		DimensionesContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_dimensiones, _p);
		 _localctx.tam = 0
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(618);
			dimension();
			_localctx.tam = 1
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimensionesContext(_parentctx, _parentState);
					_localctx.tamano = _prevctx;
					_localctx.tamano = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_dimensiones);
					setState(621);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(622);
					dimension();

					                                                                              _localctx.tam = ((DimensionesContext)_localctx).tamano.tam + 1
					                                                                           
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode L_CORCH() { return getToken(Parser.L_CORCH, 0); }
		public TerminalNode R_CORCH() { return getToken(Parser.R_CORCH, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(L_CORCH);
			setState(631);
			match(R_CORCH);
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

	public static class ArraydataContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public ListaExpresionesContext listaExpresiones;
		public TerminalNode L_CORCH() { return getToken(Parser.L_CORCH, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public TerminalNode R_CORCH() { return getToken(Parser.R_CORCH, 0); }
		public ArraydataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydata; }
	}

	public final ArraydataContext arraydata() throws RecognitionException {
		ArraydataContext _localctx = new ArraydataContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arraydata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(L_CORCH);
			setState(634);
			((ArraydataContext)_localctx).listaExpresiones = listaExpresiones(0);
			setState(635);
			match(R_CORCH);
			_localctx.expr = expresion2.NewValorArreglo(((ArraydataContext)_localctx).listaExpresiones.lista)
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

	public static class InstanciaContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public TiposvarsContext tiposvars;
		public ListanchosContext listanchos;
		public TerminalNode NEW_() { return getToken(Parser.NEW_, 0); }
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public ListanchosContext listanchos() {
			return getRuleContext(ListanchosContext.class,0);
		}
		public InstanciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instancia; }
	}

	public final InstanciaContext instancia() throws RecognitionException {
		InstanciaContext _localctx = new InstanciaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(NEW_);
			setState(639);
			((InstanciaContext)_localctx).tiposvars = tiposvars();
			setState(640);
			((InstanciaContext)_localctx).listanchos = listanchos(0);
			_localctx.expr = expresion2.NewInstanciaArreglo(((InstanciaContext)_localctx).tiposvars.tipo, ((InstanciaContext)_localctx).listanchos.lista )
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

	public static class ListanchosContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListanchosContext sublist;
		public AnchoContext ancho;
		public AnchoContext ancho() {
			return getRuleContext(AnchoContext.class,0);
		}
		public ListanchosContext listanchos() {
			return getRuleContext(ListanchosContext.class,0);
		}
		public ListanchosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listanchos; }
	}

	public final ListanchosContext listanchos() throws RecognitionException {
		return listanchos(0);
	}

	private ListanchosContext listanchos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListanchosContext _localctx = new ListanchosContext(_ctx, _parentState);
		ListanchosContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_listanchos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(644);
			((ListanchosContext)_localctx).ancho = ancho();
			_localctx.lista.Add(((ListanchosContext)_localctx).ancho.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListanchosContext(_parentctx, _parentState);
					_localctx.sublist = _prevctx;
					_localctx.sublist = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listanchos);
					setState(647);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(648);
					((ListanchosContext)_localctx).ancho = ancho();

					                                                                                          ((ListanchosContext)_localctx).sublist.lista.Add(((ListanchosContext)_localctx).ancho.expr)
					                                                                                          _localctx.lista = ((ListanchosContext)_localctx).sublist.lista
					                                                                                      
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class AnchoContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public ExpresionContext expresion;
		public TerminalNode L_CORCH() { return getToken(Parser.L_CORCH, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode R_CORCH() { return getToken(Parser.R_CORCH, 0); }
		public AnchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ancho; }
	}

	public final AnchoContext ancho() throws RecognitionException {
		AnchoContext _localctx = new AnchoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ancho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(L_CORCH);
			setState(657);
			((AnchoContext)_localctx).expresion = expresion();
			setState(658);
			match(R_CORCH);
			_localctx.expr = ((AnchoContext)_localctx).expresion.expr
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

	public static class Dec_objetoContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public Token ID;
		public ListidesContext listides;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Dec_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_objeto; }
	}

	public final Dec_objetoContext dec_objeto() throws RecognitionException {
		Dec_objetoContext _localctx = new Dec_objetoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dec_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			((Dec_objetoContext)_localctx).ID = match(ID);
			setState(662);
			((Dec_objetoContext)_localctx).listides = listides(0);
			setState(663);
			match(IGUAL);
			setState(664);
			((Dec_objetoContext)_localctx).expresion = expresion();
			_localctx.instr = Definicion.NewDeclararObjeto( (((Dec_objetoContext)_localctx).ID!=null?((Dec_objetoContext)_localctx).ID.getText():null), ((Dec_objetoContext)_localctx).listides.lista, ((Dec_objetoContext)_localctx).expresion.expr)
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

	public static class InstanciaClaseContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Token ID;
		public TerminalNode NEW_() { return getToken(Parser.NEW_, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public InstanciaClaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanciaClase; }
	}

	public final InstanciaClaseContext instanciaClase() throws RecognitionException {
		InstanciaClaseContext _localctx = new InstanciaClaseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_instanciaClase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(NEW_);
			setState(668);
			((InstanciaClaseContext)_localctx).ID = match(ID);
			setState(669);
			match(LP);
			setState(670);
			match(RP);
			_localctx.expr = expresion2.NewInstanciaObjeto((((InstanciaClaseContext)_localctx).ID!=null?((InstanciaClaseContext)_localctx).ID.getText():null) )
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

	public static class AccesoarrContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Token ID;
		public ListanchosContext listanchos;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public ListanchosContext listanchos() {
			return getRuleContext(ListanchosContext.class,0);
		}
		public AccesoarrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoarr; }
	}

	public final AccesoarrContext accesoarr() throws RecognitionException {
		AccesoarrContext _localctx = new AccesoarrContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_accesoarr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			((AccesoarrContext)_localctx).ID = match(ID);
			setState(674);
			((AccesoarrContext)_localctx).listanchos = listanchos(0);
			_localctx.expr = Accesos.NewAccessoArr((((AccesoarrContext)_localctx).ID!=null?((AccesoarrContext)_localctx).ID.getText():null),((AccesoarrContext)_localctx).listanchos.lista)
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

	public static class AccesoObjetoContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public ListaAccesosContext listaAccesos;
		public ListaAccesosContext listaAccesos() {
			return getRuleContext(ListaAccesosContext.class,0);
		}
		public AccesoObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesoObjeto; }
	}

	public final AccesoObjetoContext accesoObjeto() throws RecognitionException {
		AccesoObjetoContext _localctx = new AccesoObjetoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_accesoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			((AccesoObjetoContext)_localctx).listaAccesos = listaAccesos(0);
			_localctx.expr = Accesos.NewAccesoObjeto( ((AccesoObjetoContext)_localctx).listaAccesos.lista)
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

	public static class ListaAccesosContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaAccesosContext SUBLISTA;
		public AccesoContext acceso;
		public AccesoContext acceso() {
			return getRuleContext(AccesoContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(Parser.PUNTO, 0); }
		public ListaAccesosContext listaAccesos() {
			return getRuleContext(ListaAccesosContext.class,0);
		}
		public ListaAccesosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaAccesos; }
	}

	public final ListaAccesosContext listaAccesos() throws RecognitionException {
		return listaAccesos(0);
	}

	private ListaAccesosContext listaAccesos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaAccesosContext _localctx = new ListaAccesosContext(_ctx, _parentState);
		ListaAccesosContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_listaAccesos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(681);
			((ListaAccesosContext)_localctx).acceso = acceso();
			   _localctx.lista.Add(((ListaAccesosContext)_localctx).acceso.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaAccesosContext(_parentctx, _parentState);
					_localctx.SUBLISTA = _prevctx;
					_localctx.SUBLISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaAccesos);
					setState(684);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(685);
					match(PUNTO);
					setState(686);
					((ListaAccesosContext)_localctx).acceso = acceso();

					                                                              ((ListaAccesosContext)_localctx).SUBLISTA.lista.Add( ((ListaAccesosContext)_localctx).acceso.expr)
					                                                              _localctx.lista = ((ListaAccesosContext)_localctx).SUBLISTA.lista
					                                                          
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class AccesoContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Token ID;
		public AccesoarrContext accesoarr;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public AccesoarrContext accesoarr() {
			return getRuleContext(AccesoarrContext.class,0);
		}
		public AccesoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acceso; }
	}

	public final AccesoContext acceso() throws RecognitionException {
		AccesoContext _localctx = new AccesoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_acceso);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				((AccesoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NewIdentificador((((AccesoContext)_localctx).ID!=null?((AccesoContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				((AccesoContext)_localctx).accesoarr = accesoarr();
				 _localctx.expr = ((AccesoContext)_localctx).accesoarr.expr
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

	public static class Asignacion_objetoContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ListaAccesosContext listaAccesos;
		public ExpresionContext expresion;
		public ListaAccesosContext listaAccesos() {
			return getRuleContext(ListaAccesosContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Asignacion_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_objeto; }
	}

	public final Asignacion_objetoContext asignacion_objeto() throws RecognitionException {
		Asignacion_objetoContext _localctx = new Asignacion_objetoContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_asignacion_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			((Asignacion_objetoContext)_localctx).listaAccesos = listaAccesos(0);
			setState(702);
			match(IGUAL);
			setState(703);
			((Asignacion_objetoContext)_localctx).expresion = expresion();
			_localctx.instr = asignacion.NewAsignacionObjeto(((Asignacion_objetoContext)_localctx).listaAccesos.lista, ((Asignacion_objetoContext)_localctx).expresion.expr )
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

	public static class ExpresionContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_relContext expr_rel;
		public Expr_aritContext expr_arit;
		public Expr_logContext expr_log;
		public InstanciaContext instancia;
		public ArraydataContext arraydata;
		public TiposvarsContext tiposvars;
		public Token POW;
		public ExpresionContext opIz;
		public ExpresionContext opDe;
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public Expr_logContext expr_log() {
			return getRuleContext(Expr_logContext.class,0);
		}
		public InstanciaContext instancia() {
			return getRuleContext(InstanciaContext.class,0);
		}
		public ArraydataContext arraydata() {
			return getRuleContext(ArraydataContext.class,0);
		}
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public List<TerminalNode> DOSPUNTOS() { return getTokens(Parser.DOSPUNTOS); }
		public TerminalNode DOSPUNTOS(int i) {
			return getToken(Parser.DOSPUNTOS, i);
		}
		public TerminalNode POW() { return getToken(Parser.POW, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode COMA() { return getToken(Parser.COMA, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode POWF() { return getToken(Parser.POWF, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expresion);
		try {
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				((ExpresionContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((ExpresionContext)_localctx).expr_rel.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				((ExpresionContext)_localctx).expr_arit = expr_arit(0);
				_localctx.expr = ((ExpresionContext)_localctx).expr_arit.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				((ExpresionContext)_localctx).expr_log = expr_log(0);
				_localctx.expr = ((ExpresionContext)_localctx).expr_log.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				((ExpresionContext)_localctx).instancia = instancia();
				_localctx.expr = ((ExpresionContext)_localctx).instancia.expr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(718);
				((ExpresionContext)_localctx).arraydata = arraydata();
				_localctx.expr = ((ExpresionContext)_localctx).arraydata.expr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(721);
				((ExpresionContext)_localctx).tiposvars = tiposvars();
				setState(722);
				match(DOSPUNTOS);
				setState(723);
				match(DOSPUNTOS);
				setState(724);
				((ExpresionContext)_localctx).POW = match(POW);
				setState(725);
				match(LP);
				setState(726);
				((ExpresionContext)_localctx).opIz = expresion();
				setState(727);
				match(COMA);
				setState(728);
				((ExpresionContext)_localctx).opDe = expresion();
				setState(729);
				match(RP);
				 _localctx.expr = expresion.NewOperacion(((ExpresionContext)_localctx).opIz.expr,(((ExpresionContext)_localctx).POW!=null?((ExpresionContext)_localctx).POW.getText():null),((ExpresionContext)_localctx).opDe.expr,false, ((ExpresionContext)_localctx).tiposvars.tipo) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(732);
				((ExpresionContext)_localctx).tiposvars = tiposvars();
				setState(733);
				match(DOSPUNTOS);
				setState(734);
				match(DOSPUNTOS);
				setState(735);
				match(POWF);
				setState(736);
				match(LP);
				setState(737);
				((ExpresionContext)_localctx).opIz = expresion();
				setState(738);
				match(COMA);
				setState(739);
				((ExpresionContext)_localctx).opDe = expresion();
				setState(740);
				match(RP);
				 _localctx.expr = expresion.NewOperacion(((ExpresionContext)_localctx).opIz.expr,"pow",((ExpresionContext)_localctx).opDe.expr,false, ((ExpresionContext)_localctx).tiposvars.tipo) 
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

	public static class Expr_relContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_relContext opIz;
		public Expr_aritContext expr_arit;
		public Token op;
		public Expr_relContext opDe;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public List<Expr_relContext> expr_rel() {
			return getRuleContexts(Expr_relContext.class);
		}
		public Expr_relContext expr_rel(int i) {
			return getRuleContext(Expr_relContext.class,i);
		}
		public TerminalNode DIFERENTE() { return getToken(Parser.DIFERENTE, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Parser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Parser.MENORIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(Parser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(Parser.MAYOR, 0); }
		public TerminalNode IGUAL_IGUAL() { return getToken(Parser.IGUAL_IGUAL, 0); }
		public Expr_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_rel; }
	}

	public final Expr_relContext expr_rel() throws RecognitionException {
		return expr_rel(0);
	}

	private Expr_relContext expr_rel(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_relContext _localctx = new Expr_relContext(_ctx, _parentState);
		Expr_relContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expr_rel, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(746);
			((Expr_relContext)_localctx).expr_arit = expr_arit(0);
			_localctx.expr = ((Expr_relContext)_localctx).expr_arit.expr
			}
			_ctx.stop = _input.LT(-1);
			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_relContext(_parentctx, _parentState);
					_localctx.opIz = _prevctx;
					_localctx.opIz = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr_rel);
					setState(749);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(750);
					((Expr_relContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL_IGUAL) | (1L << DIFERENTE) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
						((Expr_relContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(751);
					((Expr_relContext)_localctx).opDe = expr_rel(3);
					_localctx.expr = expresion.NewOperacion(((Expr_relContext)_localctx).opIz.expr,(((Expr_relContext)_localctx).op!=null?((Expr_relContext)_localctx).op.getText():null),((Expr_relContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class Expr_logContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_logContext opIz;
		public Expr_logContext opU;
		public Expr_relContext expr_rel;
		public Token op;
		public Expr_logContext opDe;
		public TerminalNode NOT() { return getToken(Parser.NOT, 0); }
		public List<Expr_logContext> expr_log() {
			return getRuleContexts(Expr_logContext.class);
		}
		public Expr_logContext expr_log(int i) {
			return getRuleContext(Expr_logContext.class,i);
		}
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public TerminalNode OR() { return getToken(Parser.OR, 0); }
		public TerminalNode AND() { return getToken(Parser.AND, 0); }
		public Expr_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_log; }
	}

	public final Expr_logContext expr_log() throws RecognitionException {
		return expr_log(0);
	}

	private Expr_logContext expr_log(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logContext _localctx = new Expr_logContext(_ctx, _parentState);
		Expr_logContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expr_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(760);
				match(NOT);
				setState(761);
				((Expr_logContext)_localctx).opU = expr_log(3);
				_localctx.expr = expresion.NewOperacion(((Expr_logContext)_localctx).opU.expr,"!",nil,true, entorno.NULL)
				}
				break;
			case LP:
			case SUB:
			case NUMBER:
			case USIZE:
			case FLOAT:
			case STRING:
			case CHAR:
			case TRUE:
			case FALSE:
			case ID:
				{
				setState(764);
				((Expr_logContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((Expr_logContext)_localctx).expr_rel.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_logContext(_parentctx, _parentState);
					_localctx.opIz = _prevctx;
					_localctx.opIz = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr_log);
					setState(769);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(770);
					((Expr_logContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((Expr_logContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(771);
					((Expr_logContext)_localctx).opDe = expr_log(3);
					_localctx.expr = expresion.NewOperacion(((Expr_logContext)_localctx).opIz.expr,(((Expr_logContext)_localctx).op!=null?((Expr_logContext)_localctx).op.getText():null),((Expr_logContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_aritContext opIz;
		public ExpresionContext opU;
		public ExpresionContext expresion;
		public Expr_valorContext expr_valor;
		public Token op;
		public Expr_aritContext opDe;
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expr_valorContext expr_valor() {
			return getRuleContext(Expr_valorContext.class,0);
		}
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode MUL() { return getToken(Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(Parser.MOD, 0); }
		public TerminalNode ADD() { return getToken(Parser.ADD, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(780);
				match(SUB);
				setState(781);
				((Expr_aritContext)_localctx).opU = ((Expr_aritContext)_localctx).expresion = expresion();
				_localctx.expr = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.expr,"-",nil,true, entorno.NULL)
				}
				break;
			case NUMBER:
			case USIZE:
			case FLOAT:
			case STRING:
			case CHAR:
			case TRUE:
			case FALSE:
			case ID:
				{
				setState(784);
				((Expr_aritContext)_localctx).expr_valor = expr_valor();
				_localctx.expr = ((Expr_aritContext)_localctx).expr_valor.expr
				}
				break;
			case LP:
				{
				setState(787);
				match(LP);
				setState(788);
				((Expr_aritContext)_localctx).expresion = expresion();
				setState(789);
				match(RP);
				_localctx.expr = ((Expr_aritContext)_localctx).expresion.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(804);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(794);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(795);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (MUL - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(796);
						((Expr_aritContext)_localctx).opDe = expr_arit(5);
						_localctx.expr = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false, entorno.NULL)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(799);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(800);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(801);
						((Expr_aritContext)_localctx).opDe = expr_arit(4);
						_localctx.expr = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false, entorno.NULL)
						}
						break;
					}
					} 
				}
				setState(808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Expr_valorContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public PrimitivoContext primitivo;
		public LlamadaContext llamada;
		public AccesoarrContext accesoarr;
		public AccesoObjetoContext accesoObjeto;
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public LlamadaContext llamada() {
			return getRuleContext(LlamadaContext.class,0);
		}
		public AccesoarrContext accesoarr() {
			return getRuleContext(AccesoarrContext.class,0);
		}
		public AccesoObjetoContext accesoObjeto() {
			return getRuleContext(AccesoObjetoContext.class,0);
		}
		public Expr_valorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_valor; }
	}

	public final Expr_valorContext expr_valor() throws RecognitionException {
		Expr_valorContext _localctx = new Expr_valorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expr_valor);
		try {
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				((Expr_valorContext)_localctx).primitivo = primitivo();
				_localctx.expr = ((Expr_valorContext)_localctx).primitivo.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				((Expr_valorContext)_localctx).llamada = llamada();
				_localctx.expr = ((Expr_valorContext)_localctx).llamada.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				((Expr_valorContext)_localctx).accesoarr = accesoarr();
				_localctx.expr = ((Expr_valorContext)_localctx).accesoarr.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(818);
				((Expr_valorContext)_localctx).accesoObjeto = accesoObjeto();
				_localctx.expr = ((Expr_valorContext)_localctx).accesoObjeto.expr
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

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Token NUMBER;
		public Token USIZE;
		public Token FLOAT;
		public Token STRING;
		public Token CHAR;
		public Token ID;
		public TerminalNode NUMBER() { return getToken(Parser.NUMBER, 0); }
		public TerminalNode USIZE() { return getToken(Parser.USIZE, 0); }
		public TerminalNode FLOAT() { return getToken(Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(Parser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(Parser.CHAR, 0); }
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode TRUE() { return getToken(Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Parser.FALSE, 0); }
		public TerminalNode PUNTO() { return getToken(Parser.PUNTO, 0); }
		public TerminalNode ABS() { return getToken(Parser.ABS, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public TerminalNode SQRT() { return getToken(Parser.SQRT, 0); }
		public TerminalNode TO_STRING() { return getToken(Parser.TO_STRING, 0); }
		public TerminalNode CLONE() { return getToken(Parser.CLONE, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primitivo);
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				                                                                    num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                                                                    if err!= nil{
				                                                                        fmt.Println(err)
				                                                                    }
				                                                                    _localctx.expr = expresion.NewPrimitivo(num,entorno.INTEGER)
				                                                                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				((PrimitivoContext)_localctx).USIZE = match(USIZE);

				                                                                    num,err := strconv.Atoi((((PrimitivoContext)_localctx).USIZE!=null?((PrimitivoContext)_localctx).USIZE.getText():null))
				                                                                    if err!= nil{
				                                                                        fmt.Println(err)
				                                                                    }
				                                                                    _localctx.expr = expresion.NewPrimitivo(num,entorno.USIZE)
				                                                                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(827);
				((PrimitivoContext)_localctx).FLOAT = match(FLOAT);

				                                                                     num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getText():null),64)
				                                                                     if err!= nil{
				                                                                         fmt.Println(err)
				                                                                     }
				                                                                     _localctx.expr = expresion.NewPrimitivo(num,entorno.FLOAT)

				                                                                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				((PrimitivoContext)_localctx).STRING = match(STRING);

				                                                                    str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				                                                                    _localctx.expr = expresion.NewPrimitivo(str,entorno.STRING)
				                                                                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(831);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                                                                    str:= (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null))-1]
				                                                                    _localctx.expr = expresion.NewPrimitivo(str,entorno.CHAR)
				                                                                
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(833);
				((PrimitivoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NewIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null))
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(835);
				match(TRUE);
				 _localctx.expr = expresion.NewPrimitivo(true,entorno.BOOLEAN) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(837);
				match(FALSE);
				 _localctx.expr = expresion.NewPrimitivo(false,entorno.BOOLEAN) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(839);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(840);
				match(PUNTO);
				setState(841);
				match(ABS);
				setState(842);
				match(LP);
				setState(843);
				match(RP);

				        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NewValorAbs((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(845);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(846);
				match(PUNTO);
				setState(847);
				match(SQRT);
				setState(848);
				match(LP);
				setState(849);
				match(RP);

				        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NewValorSqrt((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(851);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(852);
				match(PUNTO);
				setState(853);
				match(TO_STRING);
				setState(854);
				match(LP);
				setState(855);
				match(RP);

				        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NewValorStr((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(857);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(858);
				match(PUNTO);
				setState(859);
				match(CLONE);
				setState(860);
				match(LP);
				setState(861);
				match(RP);

				        linea := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NewValorClone((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return listaClases_sempred((ListaClasesContext)_localctx, predIndex);
		case 4:
			return contenidoClase_sempred((ContenidoClaseContext)_localctx, predIndex);
		case 8:
			return parametros_sempred((ParametrosContext)_localctx, predIndex);
		case 22:
			return listaexpre_case_sempred((Listaexpre_caseContext)_localctx, predIndex);
		case 27:
			return listaExpresiones_sempred((ListaExpresionesContext)_localctx, predIndex);
		case 33:
			return listides_sempred((ListidesContext)_localctx, predIndex);
		case 36:
			return dimensiones_sempred((DimensionesContext)_localctx, predIndex);
		case 40:
			return listanchos_sempred((ListanchosContext)_localctx, predIndex);
		case 46:
			return listaAccesos_sempred((ListaAccesosContext)_localctx, predIndex);
		case 50:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 51:
			return expr_log_sempred((Expr_logContext)_localctx, predIndex);
		case 52:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaClases_sempred(ListaClasesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean contenidoClase_sempred(ContenidoClaseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parametros_sempred(ParametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaexpre_case_sempred(Listaexpre_caseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listaExpresiones_sempred(ListaExpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listides_sempred(ListidesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dimensiones_sempred(DimensionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listanchos_sempred(ListanchosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaAccesos_sempred(ListaAccesosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_rel_sempred(Expr_relContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_log_sempred(Expr_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0364\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00a8\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d5\n\b\3"+
		"\t\3\t\3\t\5\t\u00da\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e5"+
		"\n\n\f\n\16\n\u00e8\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00f3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0104\n\r\3\16\6\16\u0107\n\16\r\16\16\16\u0108\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u0148\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0163\n\21\3\22\6\22\u0166\n\22\r\22\16\22\u0167"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\6\26\u017d\n\26\r\26\16\26\u017e\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0190"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0198\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u019f\n\30\f\30\16\30\u01a2\13\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01bd\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u01c8\n\35\f\35\16\35\u01cb\13\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0219\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \5 \u0225\n \3!\3!\3!\3!\3!\3!\5!\u022d\n!\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u023a\n#\f#\16#\u023d\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\5$\u024f\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u026a\n%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\7&\u0274\n&\f&\16&\u0277\13&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\7*\u028e\n*\f*\16*\u0291\13*\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u02b4\n\60\f\60\16\60\u02b7"+
		"\13\60\3\61\3\61\3\61\3\61\3\61\5\61\u02be\n\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02ea\n\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u02f5\n\64\f\64\16\64\u02f8"+
		"\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0302\n\65\3\65\3"+
		"\65\3\65\3\65\3\65\7\65\u0309\n\65\f\65\16\65\u030c\13\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u031b\n\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0327\n\66\f\66"+
		"\16\66\u032a\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0338\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\58\u0362\n8\38\2\16\4\n\22.8DJR^fhj9\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\6\3\2"+
		"8=\4\2\63\63\65\65\4\2>?BB\3\2@A\2\u0383\2p\3\2\2\2\4s\3\2\2\2\6\u0080"+
		"\3\2\2\2\b\u008d\3\2\2\2\n\u008f\3\2\2\2\f\u00a7\3\2\2\2\16\u00d4\3\2"+
		"\2\2\20\u00d9\3\2\2\2\22\u00db\3\2\2\2\24\u00f2\3\2\2\2\26\u00f4\3\2\2"+
		"\2\30\u0103\3\2\2\2\32\u0106\3\2\2\2\34\u0147\3\2\2\2\36\u0149\3\2\2\2"+
		" \u0162\3\2\2\2\"\u0165\3\2\2\2$\u016b\3\2\2\2&\u0171\3\2\2\2(\u0176\3"+
		"\2\2\2*\u017c\3\2\2\2,\u018f\3\2\2\2.\u0197\3\2\2\2\60\u01a3\3\2\2\2\62"+
		"\u01a8\3\2\2\2\64\u01ac\3\2\2\2\66\u01bc\3\2\2\28\u01be\3\2\2\2:\u0218"+
		"\3\2\2\2<\u021a\3\2\2\2>\u0224\3\2\2\2@\u022c\3\2\2\2B\u022e\3\2\2\2D"+
		"\u0231\3\2\2\2F\u024e\3\2\2\2H\u0269\3\2\2\2J\u026b\3\2\2\2L\u0278\3\2"+
		"\2\2N\u027b\3\2\2\2P\u0280\3\2\2\2R\u0285\3\2\2\2T\u0292\3\2\2\2V\u0297"+
		"\3\2\2\2X\u029d\3\2\2\2Z\u02a3\3\2\2\2\\\u02a7\3\2\2\2^\u02aa\3\2\2\2"+
		"`\u02bd\3\2\2\2b\u02bf\3\2\2\2d\u02e9\3\2\2\2f\u02eb\3\2\2\2h\u0301\3"+
		"\2\2\2j\u031a\3\2\2\2l\u0337\3\2\2\2n\u0361\3\2\2\2pq\5\4\3\2qr\b\2\1"+
		"\2r\3\3\2\2\2st\b\3\1\2tu\5\6\4\2uv\b\3\1\2v}\3\2\2\2wx\f\4\2\2xy\5\6"+
		"\4\2yz\b\3\1\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\5"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\24\2\2\u0081\u0082\7J\2\2\u0082\u0083"+
		"\5\b\5\2\u0083\u0084\b\4\1\2\u0084\7\3\2\2\2\u0085\u0086\7\5\2\2\u0086"+
		"\u0087\5\n\6\2\u0087\u0088\7\6\2\2\u0088\u0089\b\5\1\2\u0089\u008e\3\2"+
		"\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7\6\2\2\u008c\u008e\b\5\1\2\u008d"+
		"\u0085\3\2\2\2\u008d\u008a\3\2\2\2\u008e\t\3\2\2\2\u008f\u0090\b\6\1\2"+
		"\u0090\u0091\5\f\7\2\u0091\u0092\b\6\1\2\u0092\u0099\3\2\2\2\u0093\u0094"+
		"\f\4\2\2\u0094\u0095\5\f\7\2\u0095\u0096\b\6\1\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\13\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\16\b\2\u009d\u009e"+
		"\b\7\1\2\u009e\u00a8\3\2\2\2\u009f\u00a0\5:\36\2\u00a0\u00a1\7\61\2\2"+
		"\u00a1\u00a2\b\7\1\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\5<\37\2\u00a4\u00a5"+
		"\7\61\2\2\u00a5\u00a6\b\7\1\2\u00a6\u00a8\3\2\2\2\u00a7\u009c\3\2\2\2"+
		"\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\r\3\2\2\2\u00a9\u00aa\5"+
		"\26\f\2\u00aa\u00ab\b\b\1\2\u00ab\u00d5\3\2\2\2\u00ac\u00ad\5\20\t\2\u00ad"+
		"\u00ae\7\26\2\2\u00ae\u00af\7J\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\7\4"+
		"\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\b\1\2\u00b3\u00d5\3\2\2\2\u00b4"+
		"\u00b5\5\20\t\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\7J\2\2\u00b7\u00b8\7"+
		"\3\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5\30\r\2\u00bb"+
		"\u00bc\b\b\1\2\u00bc\u00d5\3\2\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7"+
		"\26\2\2\u00bf\u00c0\7J\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00c2\7\4\2\2\u00c2"+
		"\u00c3\7A\2\2\u00c3\u00c4\7<\2\2\u00c4\u00c5\5F$\2\u00c5\u00c6\5\30\r"+
		"\2\u00c6\u00c7\b\b\1\2\u00c7\u00d5\3\2\2\2\u00c8\u00c9\5\20\t\2\u00c9"+
		"\u00ca\7\26\2\2\u00ca\u00cb\7J\2\2\u00cb\u00cc\7\3\2\2\u00cc\u00cd\5\22"+
		"\n\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\7A\2\2\u00cf\u00d0\7<\2\2\u00d0\u00d1"+
		"\5F$\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\b\b\1\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00a9\3\2\2\2\u00d4\u00ac\3\2\2\2\u00d4\u00b4\3\2\2\2\u00d4\u00bd\3\2"+
		"\2\2\u00d4\u00c8\3\2\2\2\u00d5\17\3\2\2\2\u00d6\u00d7\7\34\2\2\u00d7\u00da"+
		"\b\t\1\2\u00d8\u00da\b\t\1\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\21\3\2\2\2\u00db\u00dc\b\n\1\2\u00dc\u00dd\5\24\13\2\u00dd\u00de\b\n"+
		"\1\2\u00de\u00e6\3\2\2\2\u00df\u00e0\f\4\2\2\u00e0\u00e1\7\60\2\2\u00e1"+
		"\u00e2\5\24\13\2\u00e2\u00e3\b\n\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00df\3"+
		"\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\23\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\5F$\2\u00ea\u00eb\7J\2\2\u00eb"+
		"\u00ec\b\13\1\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\5F"+
		"$\2\u00ef\u00f0\7J\2\2\u00f0\u00f1\b\13\1\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00e9\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f3\25\3\2\2\2\u00f4\u00f5\7\26\2"+
		"\2\u00f5\u00f6\7\32\2\2\u00f6\u00f7\7\3\2\2\u00f7\u00f8\7\4\2\2\u00f8"+
		"\u00f9\5\30\r\2\u00f9\u00fa\b\f\1\2\u00fa\27\3\2\2\2\u00fb\u00fc\7\5\2"+
		"\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe\7\6\2\2\u00fe\u00ff\b\r\1\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u0101\7\5\2\2\u0101\u0102\7\6\2\2\u0102\u0104\b\r"+
		"\1\2\u0103\u00fb\3\2\2\2\u0103\u0100\3\2\2\2\u0104\31\3\2\2\2\u0105\u0107"+
		"\5\34\17\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\16\1\2\u010b\33"+
		"\3\2\2\2\u010c\u010d\5\36\20\2\u010d\u010e\7\61\2\2\u010e\u010f\b\17\1"+
		"\2\u010f\u0148\3\2\2\2\u0110\u0111\5@!\2\u0111\u0112\7\61\2\2\u0112\u0113"+
		"\b\17\1\2\u0113\u0148\3\2\2\2\u0114\u0115\5&\24\2\u0115\u0116\b\17\1\2"+
		"\u0116\u0148\3\2\2\2\u0117\u0118\5\64\33\2\u0118\u0119\7\61\2\2\u0119"+
		"\u011a\b\17\1\2\u011a\u0148\3\2\2\2\u011b\u011c\5\64\33\2\u011c\u011d"+
		"\b\17\1\2\u011d\u0148\3\2\2\2\u011e\u011f\5\60\31\2\u011f\u0120\b\17\1"+
		"\2\u0120\u0148\3\2\2\2\u0121\u0122\5\62\32\2\u0122\u0123\b\17\1\2\u0123"+
		"\u0148\3\2\2\2\u0124\u0125\5 \21\2\u0125\u0126\b\17\1\2\u0126\u0148\3"+
		"\2\2\2\u0127\u0128\5:\36\2\u0128\u0129\7\61\2\2\u0129\u012a\b\17\1\2\u012a"+
		"\u0148\3\2\2\2\u012b\u012c\5<\37\2\u012c\u012d\7\61\2\2\u012d\u012e\b"+
		"\17\1\2\u012e\u0148\3\2\2\2\u012f\u0130\5\66\34\2\u0130\u0131\7\61\2\2"+
		"\u0131\u0132\b\17\1\2\u0132\u0148\3\2\2\2\u0133\u0134\5> \2\u0134\u0135"+
		"\7\61\2\2\u0135\u0136\b\17\1\2\u0136\u0148\3\2\2\2\u0137\u0138\5B\"\2"+
		"\u0138\u0139\7\61\2\2\u0139\u013a\b\17\1\2\u013a\u0148\3\2\2\2\u013b\u013c"+
		"\5H%\2\u013c\u013d\7\61\2\2\u013d\u013e\b\17\1\2\u013e\u0148\3\2\2\2\u013f"+
		"\u0140\5V,\2\u0140\u0141\7\61\2\2\u0141\u0142\b\17\1\2\u0142\u0148\3\2"+
		"\2\2\u0143\u0144\5b\62\2\u0144\u0145\7\61\2\2\u0145\u0146\b\17\1\2\u0146"+
		"\u0148\3\2\2\2\u0147\u010c\3\2\2\2\u0147\u0110\3\2\2\2\u0147\u0114\3\2"+
		"\2\2\u0147\u0117\3\2\2\2\u0147\u011b\3\2\2\2\u0147\u011e\3\2\2\2\u0147"+
		"\u0121\3\2\2\2\u0147\u0124\3\2\2\2\u0147\u0127\3\2\2\2\u0147\u012b\3\2"+
		"\2\2\u0147\u012f\3\2\2\2\u0147\u0133\3\2\2\2\u0147\u0137\3\2\2\2\u0147"+
		"\u013b\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0143\3\2\2\2\u0148\35\3\2\2"+
		"\2\u0149\u014a\7J\2\2\u014a\u014b\7\67\2\2\u014b\u014c\5d\63\2\u014c\u014d"+
		"\b\20\1\2\u014d\37\3\2\2\2\u014e\u014f\7\r\2\2\u014f\u0150\5d\63\2\u0150"+
		"\u0151\5\30\r\2\u0151\u0152\b\21\1\2\u0152\u0163\3\2\2\2\u0153\u0154\7"+
		"\r\2\2\u0154\u0155\5d\63\2\u0155\u0156\5\30\r\2\u0156\u0157\7\16\2\2\u0157"+
		"\u0158\5\30\r\2\u0158\u0159\b\21\1\2\u0159\u0163\3\2\2\2\u015a\u015b\7"+
		"\r\2\2\u015b\u015c\5d\63\2\u015c\u015d\5\30\r\2\u015d\u015e\5\"\22\2\u015e"+
		"\u015f\7\16\2\2\u015f\u0160\5\30\r\2\u0160\u0161\b\21\1\2\u0161\u0163"+
		"\3\2\2\2\u0162\u014e\3\2\2\2\u0162\u0153\3\2\2\2\u0162\u015a\3\2\2\2\u0163"+
		"!\3\2\2\2\u0164\u0166\5$\23\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2"+
		"\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\b\22\1\2\u016a#\3\2\2\2\u016b\u016c\7\16\2\2\u016c\u016d\7\r\2\2\u016d"+
		"\u016e\5d\63\2\u016e\u016f\5\30\r\2\u016f\u0170\b\23\1\2\u0170%\3\2\2"+
		"\2\u0171\u0172\7\17\2\2\u0172\u0173\5d\63\2\u0173\u0174\5(\25\2\u0174"+
		"\u0175\b\24\1\2\u0175\'\3\2\2\2\u0176\u0177\7\5\2\2\u0177\u0178\5*\26"+
		"\2\u0178\u0179\7\6\2\2\u0179\u017a\b\25\1\2\u017a)\3\2\2\2\u017b\u017d"+
		"\5,\27\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\26\1\2\u0181+\3\2\2\2"+
		"\u0182\u0183\5.\30\2\u0183\u0184\7\67\2\2\u0184\u0185\7<\2\2\u0185\u0186"+
		"\5\34\17\2\u0186\u0187\7\60\2\2\u0187\u0188\b\27\1\2\u0188\u0190\3\2\2"+
		"\2\u0189\u018a\5.\30\2\u018a\u018b\7\67\2\2\u018b\u018c\7<\2\2\u018c\u018d"+
		"\5\30\r\2\u018d\u018e\b\27\1\2\u018e\u0190\3\2\2\2\u018f\u0182\3\2\2\2"+
		"\u018f\u0189\3\2\2\2\u0190-\3\2\2\2\u0191\u0192\b\30\1\2\u0192\u0193\5"+
		"d\63\2\u0193\u0194\b\30\1\2\u0194\u0198\3\2\2\2\u0195\u0196\7\t\2\2\u0196"+
		"\u0198\b\30\1\2\u0197\u0191\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u01a0\3"+
		"\2\2\2\u0199\u019a\f\5\2\2\u019a\u019b\7\64\2\2\u019b\u019c\5d\63\2\u019c"+
		"\u019d\b\30\1\2\u019d\u019f\3\2\2\2\u019e\u0199\3\2\2\2\u019f\u01a2\3"+
		"\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1/\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a3\u01a4\7\20\2\2\u01a4\u01a5\5d\63\2\u01a5\u01a6\5\30\r\2"+
		"\u01a6\u01a7\b\31\1\2\u01a7\61\3\2\2\2\u01a8\u01a9\7\21\2\2\u01a9\u01aa"+
		"\5\30\r\2\u01aa\u01ab\b\32\1\2\u01ab\63\3\2\2\2\u01ac\u01ad\7\n\2\2\u01ad"+
		"\u01ae\7\3\2\2\u01ae\u01af\5d\63\2\u01af\u01b0\7\4\2\2\u01b0\u01b1\b\33"+
		"\1\2\u01b1\65\3\2\2\2\u01b2\u01b3\7J\2\2\u01b3\u01b4\7\3\2\2\u01b4\u01b5"+
		"\7\4\2\2\u01b5\u01bd\b\34\1\2\u01b6\u01b7\7J\2\2\u01b7\u01b8\7\3\2\2\u01b8"+
		"\u01b9\58\35\2\u01b9\u01ba\7\4\2\2\u01ba\u01bb\b\34\1\2\u01bb\u01bd\3"+
		"\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bd\67\3\2\2\2\u01be"+
		"\u01bf\b\35\1\2\u01bf\u01c0\5d\63\2\u01c0\u01c1\b\35\1\2\u01c1\u01c9\3"+
		"\2\2\2\u01c2\u01c3\f\4\2\2\u01c3\u01c4\7\60\2\2\u01c4\u01c5\5d\63\2\u01c5"+
		"\u01c6\b\35\1\2\u01c6\u01c8\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c8\u01cb\3"+
		"\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca9\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cc\u01cd\7\27\2\2\u01cd\u01ce\5D#\2\u01ce\u01cf\7\67\2\2\u01cf"+
		"\u01d0\5d\63\2\u01d0\u01d1\b\36\1\2\u01d1\u0219\3\2\2\2\u01d2\u01d3\7"+
		"\27\2\2\u01d3\u01d4\5D#\2\u01d4\u01d5\7\62\2\2\u01d5\u01d6\5F$\2\u01d6"+
		"\u01d7\7\67\2\2\u01d7\u01d8\5d\63\2\u01d8\u01d9\b\36\1\2\u01d9\u0219\3"+
		"\2\2\2\u01da\u01db\7\27\2\2\u01db\u01dc\7\25\2\2\u01dc\u01dd\5D#\2\u01dd"+
		"\u01de\7\67\2\2\u01de\u01df\5d\63\2\u01df\u01e0\b\36\1\2\u01e0\u0219\3"+
		"\2\2\2\u01e1\u01e2\7\27\2\2\u01e2\u01e3\7\25\2\2\u01e3\u01e4\5D#\2\u01e4"+
		"\u01e5\7\62\2\2\u01e5\u01e6\5F$\2\u01e6\u01e7\7\67\2\2\u01e7\u01e8\5d"+
		"\63\2\u01e8\u01e9\b\36\1\2\u01e9\u0219\3\2\2\2\u01ea\u01eb\7\27\2\2\u01eb"+
		"\u01ec\7J\2\2\u01ec\u01ed\7\62\2\2\u01ed\u01ee\7\f\2\2\u01ee\u01ef\7="+
		"\2\2\u01ef\u01f0\5F$\2\u01f0\u01f1\7<\2\2\u01f1\u01f2\7\67\2\2\u01f2\u01f3"+
		"\7\f\2\2\u01f3\u01f4\7\62\2\2\u01f4\u01f5\7\62\2\2\u01f5\u01f6\7\31\2"+
		"\2\u01f6\u01f7\7\3\2\2\u01f7\u01f8\7\4\2\2\u01f8\u01f9\b\36\1\2\u01f9"+
		"\u0219\3\2\2\2\u01fa\u01fb\7\27\2\2\u01fb\u01fc\7\25\2\2\u01fc\u01fd\7"+
		"J\2\2\u01fd\u01fe\7\62\2\2\u01fe\u01ff\7\f\2\2\u01ff\u0200\7=\2\2\u0200"+
		"\u0201\5F$\2\u0201\u0202\7<\2\2\u0202\u0203\7\67\2\2\u0203\u0204\7\f\2"+
		"\2\u0204\u0205\7\62\2\2\u0205\u0206\7\62\2\2\u0206\u0207\7\31\2\2\u0207"+
		"\u0208\7\3\2\2\u0208\u0209\7\4\2\2\u0209\u020a\b\36\1\2\u020a\u0219\3"+
		"\2\2\2\u020b\u020c\7\27\2\2\u020c\u020d\7J\2\2\u020d\u020e\7\67\2\2\u020e"+
		"\u020f\5d\63\2\u020f\u0210\b\36\1\2\u0210\u0219\3\2\2\2\u0211\u0212\7"+
		"\27\2\2\u0212\u0213\7\25\2\2\u0213\u0214\7J\2\2\u0214\u0215\7\67\2\2\u0215"+
		"\u0216\5d\63\2\u0216\u0217\b\36\1\2\u0217\u0219\3\2\2\2\u0218\u01cc\3"+
		"\2\2\2\u0218\u01d2\3\2\2\2\u0218\u01da\3\2\2\2\u0218\u01e1\3\2\2\2\u0218"+
		"\u01ea\3\2\2\2\u0218\u01fa\3\2\2\2\u0218\u020b\3\2\2\2\u0218\u0211\3\2"+
		"\2\2\u0219;\3\2\2\2\u021a\u021b\5F$\2\u021b\u021c\5D#\2\u021c\u021d\b"+
		"\37\1\2\u021d=\3\2\2\2\u021e\u021f\7\36\2\2\u021f\u0225\b \1\2\u0220\u0221"+
		"\7\36\2\2\u0221\u0222\5d\63\2\u0222\u0223\b \1\2\u0223\u0225\3\2\2\2\u0224"+
		"\u021e\3\2\2\2\u0224\u0220\3\2\2\2\u0225?\3\2\2\2\u0226\u0227\7\37\2\2"+
		"\u0227\u022d\b!\1\2\u0228\u0229\7\37\2\2\u0229\u022a\5d\63\2\u022a\u022b"+
		"\b!\1\2\u022b\u022d\3\2\2\2\u022c\u0226\3\2\2\2\u022c\u0228\3\2\2\2\u022d"+
		"A\3\2\2\2\u022e\u022f\7 \2\2\u022f\u0230\b\"\1\2\u0230C\3\2\2\2\u0231"+
		"\u0232\b#\1\2\u0232\u0233\7J\2\2\u0233\u0234\b#\1\2\u0234\u023b\3\2\2"+
		"\2\u0235\u0236\f\4\2\2\u0236\u0237\7\60\2\2\u0237\u0238\7J\2\2\u0238\u023a"+
		"\b#\1\2\u0239\u0235\3\2\2\2\u023a\u023d\3\2\2\2\u023b\u0239\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023cE\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7\'\2\2"+
		"\u023f\u024f\b$\1\2\u0240\u0241\7)\2\2\u0241\u024f\b$\1\2\u0242\u0243"+
		"\7*\2\2\u0243\u024f\b$\1\2\u0244\u0245\7+\2\2\u0245\u024f\b$\1\2\u0246"+
		"\u0247\7(\2\2\u0247\u024f\b$\1\2\u0248\u0249\7-\2\2\u0249\u024f\b$\1\2"+
		"\u024a\u024b\7,\2\2\u024b\u024f\b$\1\2\u024c\u024d\7.\2\2\u024d\u024f"+
		"\b$\1\2\u024e\u023e\3\2\2\2\u024e\u0240\3\2\2\2\u024e\u0242\3\2\2\2\u024e"+
		"\u0244\3\2\2\2\u024e\u0246\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u024a\3\2"+
		"\2\2\u024e\u024c\3\2\2\2\u024fG\3\2\2\2\u0250\u0251\7\27\2\2\u0251\u0252"+
		"\7J\2\2\u0252\u0253\7\62\2\2\u0253\u0254\7\7\2\2\u0254\u0255\5F$\2\u0255"+
		"\u0256\7\61\2\2\u0256\u0257\7C\2\2\u0257\u0258\7\b\2\2\u0258\u0259\7\67"+
		"\2\2\u0259\u025a\5d\63\2\u025a\u025b\b%\1\2\u025b\u026a\3\2\2\2\u025c"+
		"\u025d\7\27\2\2\u025d\u025e\7\25\2\2\u025e\u025f\7J\2\2\u025f\u0260\7"+
		"\62\2\2\u0260\u0261\7\7\2\2\u0261\u0262\5F$\2\u0262\u0263\7\61\2\2\u0263"+
		"\u0264\7C\2\2\u0264\u0265\7\b\2\2\u0265\u0266\7\67\2\2\u0266\u0267\5d"+
		"\63\2\u0267\u0268\b%\1\2\u0268\u026a\3\2\2\2\u0269\u0250\3\2\2\2\u0269"+
		"\u025c\3\2\2\2\u026aI\3\2\2\2\u026b\u026c\b&\1\2\u026c\u026d\5L\'\2\u026d"+
		"\u026e\b&\1\2\u026e\u0275\3\2\2\2\u026f\u0270\f\4\2\2\u0270\u0271\5L\'"+
		"\2\u0271\u0272\b&\1\2\u0272\u0274\3\2\2\2\u0273\u026f\3\2\2\2\u0274\u0277"+
		"\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276K\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0278\u0279\7\7\2\2\u0279\u027a\7\b\2\2\u027aM\3\2\2\2"+
		"\u027b\u027c\7\7\2\2\u027c\u027d\58\35\2\u027d\u027e\7\b\2\2\u027e\u027f"+
		"\b(\1\2\u027fO\3\2\2\2\u0280\u0281\7\31\2\2\u0281\u0282\5F$\2\u0282\u0283"+
		"\5R*\2\u0283\u0284\b)\1\2\u0284Q\3\2\2\2\u0285\u0286\b*\1\2\u0286\u0287"+
		"\5T+\2\u0287\u0288\b*\1\2\u0288\u028f\3\2\2\2\u0289\u028a\f\4\2\2\u028a"+
		"\u028b\5T+\2\u028b\u028c\b*\1\2\u028c\u028e\3\2\2\2\u028d\u0289\3\2\2"+
		"\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290S"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7\7\2\2\u0293\u0294\5d\63\2\u0294"+
		"\u0295\7\b\2\2\u0295\u0296\b+\1\2\u0296U\3\2\2\2\u0297\u0298\7J\2\2\u0298"+
		"\u0299\5D#\2\u0299\u029a\7\67\2\2\u029a\u029b\5d\63\2\u029b\u029c\b,\1"+
		"\2\u029cW\3\2\2\2\u029d\u029e\7\31\2\2\u029e\u029f\7J\2\2\u029f\u02a0"+
		"\7\3\2\2\u02a0\u02a1\7\4\2\2\u02a1\u02a2\b-\1\2\u02a2Y\3\2\2\2\u02a3\u02a4"+
		"\7J\2\2\u02a4\u02a5\5R*\2\u02a5\u02a6\b.\1\2\u02a6[\3\2\2\2\u02a7\u02a8"+
		"\5^\60\2\u02a8\u02a9\b/\1\2\u02a9]\3\2\2\2\u02aa\u02ab\b\60\1\2\u02ab"+
		"\u02ac\5`\61\2\u02ac\u02ad\b\60\1\2\u02ad\u02b5\3\2\2\2\u02ae\u02af\f"+
		"\4\2\2\u02af\u02b0\7/\2\2\u02b0\u02b1\5`\61\2\u02b1\u02b2\b\60\1\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02ae\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b6\3\2\2\2\u02b6_\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9"+
		"\7J\2\2\u02b9\u02be\b\61\1\2\u02ba\u02bb\5Z.\2\u02bb\u02bc\b\61\1\2\u02bc"+
		"\u02be\3\2\2\2\u02bd\u02b8\3\2\2\2\u02bd\u02ba\3\2\2\2\u02bea\3\2\2\2"+
		"\u02bf\u02c0\5^\60\2\u02c0\u02c1\7\67\2\2\u02c1\u02c2\5d\63\2\u02c2\u02c3"+
		"\b\62\1\2\u02c3c\3\2\2\2\u02c4\u02c5\5f\64\2\u02c5\u02c6\b\63\1\2\u02c6"+
		"\u02ea\3\2\2\2\u02c7\u02c8\5j\66\2\u02c8\u02c9\b\63\1\2\u02c9\u02ea\3"+
		"\2\2\2\u02ca\u02cb\5h\65\2\u02cb\u02cc\b\63\1\2\u02cc\u02ea\3\2\2\2\u02cd"+
		"\u02ce\5P)\2\u02ce\u02cf\b\63\1\2\u02cf\u02ea\3\2\2\2\u02d0\u02d1\5N("+
		"\2\u02d1\u02d2\b\63\1\2\u02d2\u02ea\3\2\2\2\u02d3\u02d4\5F$\2\u02d4\u02d5"+
		"\7\62\2\2\u02d5\u02d6\7\62\2\2\u02d6\u02d7\7%\2\2\u02d7\u02d8\7\3\2\2"+
		"\u02d8\u02d9\5d\63\2\u02d9\u02da\7\60\2\2\u02da\u02db\5d\63\2\u02db\u02dc"+
		"\7\4\2\2\u02dc\u02dd\b\63\1\2\u02dd\u02ea\3\2\2\2\u02de\u02df\5F$\2\u02df"+
		"\u02e0\7\62\2\2\u02e0\u02e1\7\62\2\2\u02e1\u02e2\7&\2\2\u02e2\u02e3\7"+
		"\3\2\2\u02e3\u02e4\5d\63\2\u02e4\u02e5\7\60\2\2\u02e5\u02e6\5d\63\2\u02e6"+
		"\u02e7\7\4\2\2\u02e7\u02e8\b\63\1\2\u02e8\u02ea\3\2\2\2\u02e9\u02c4\3"+
		"\2\2\2\u02e9\u02c7\3\2\2\2\u02e9\u02ca\3\2\2\2\u02e9\u02cd\3\2\2\2\u02e9"+
		"\u02d0\3\2\2\2\u02e9\u02d3\3\2\2\2\u02e9\u02de\3\2\2\2\u02eae\3\2\2\2"+
		"\u02eb\u02ec\b\64\1\2\u02ec\u02ed\5j\66\2\u02ed\u02ee\b\64\1\2\u02ee\u02f6"+
		"\3\2\2\2\u02ef\u02f0\f\4\2\2\u02f0\u02f1\t\2\2\2\u02f1\u02f2\5f\64\5\u02f2"+
		"\u02f3\b\64\1\2\u02f3\u02f5\3\2\2\2\u02f4\u02ef\3\2\2\2\u02f5\u02f8\3"+
		"\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7g\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f9\u02fa\b\65\1\2\u02fa\u02fb\7\66\2\2\u02fb\u02fc\5h\65\5"+
		"\u02fc\u02fd\b\65\1\2\u02fd\u0302\3\2\2\2\u02fe\u02ff\5f\64\2\u02ff\u0300"+
		"\b\65\1\2\u0300\u0302\3\2\2\2\u0301\u02f9\3\2\2\2\u0301\u02fe\3\2\2\2"+
		"\u0302\u030a\3\2\2\2\u0303\u0304\f\4\2\2\u0304\u0305\t\3\2\2\u0305\u0306"+
		"\5h\65\5\u0306\u0307\b\65\1\2\u0307\u0309\3\2\2\2\u0308\u0303\3\2\2\2"+
		"\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030bi\3"+
		"\2\2\2\u030c\u030a\3\2\2\2\u030d\u030e\b\66\1\2\u030e\u030f\7A\2\2\u030f"+
		"\u0310\5d\63\2\u0310\u0311\b\66\1\2\u0311\u031b\3\2\2\2\u0312\u0313\5"+
		"l\67\2\u0313\u0314\b\66\1\2\u0314\u031b\3\2\2\2\u0315\u0316\7\3\2\2\u0316"+
		"\u0317\5d\63\2\u0317\u0318\7\4\2\2\u0318\u0319\b\66\1\2\u0319\u031b\3"+
		"\2\2\2\u031a\u030d\3\2\2\2\u031a\u0312\3\2\2\2\u031a\u0315\3\2\2\2\u031b"+
		"\u0328\3\2\2\2\u031c\u031d\f\6\2\2\u031d\u031e\t\4\2\2\u031e\u031f\5j"+
		"\66\7\u031f\u0320\b\66\1\2\u0320\u0327\3\2\2\2\u0321\u0322\f\5\2\2\u0322"+
		"\u0323\t\5\2\2\u0323\u0324\5j\66\6\u0324\u0325\b\66\1\2\u0325\u0327\3"+
		"\2\2\2\u0326\u031c\3\2\2\2\u0326\u0321\3\2\2\2\u0327\u032a\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329k\3\2\2\2\u032a\u0328\3\2\2\2"+
		"\u032b\u032c\5n8\2\u032c\u032d\b\67\1\2\u032d\u0338\3\2\2\2\u032e\u032f"+
		"\5\66\34\2\u032f\u0330\b\67\1\2\u0330\u0338\3\2\2\2\u0331\u0332\5Z.\2"+
		"\u0332\u0333\b\67\1\2\u0333\u0338\3\2\2\2\u0334\u0335\5\\/\2\u0335\u0336"+
		"\b\67\1\2\u0336\u0338\3\2\2\2\u0337\u032b\3\2\2\2\u0337\u032e\3\2\2\2"+
		"\u0337\u0331\3\2\2\2\u0337\u0334\3\2\2\2\u0338m\3\2\2\2\u0339\u033a\7"+
		"C\2\2\u033a\u0362\b8\1\2\u033b\u033c\7D\2\2\u033c\u0362\b8\1\2\u033d\u033e"+
		"\7E\2\2\u033e\u0362\b8\1\2\u033f\u0340\7F\2\2\u0340\u0362\b8\1\2\u0341"+
		"\u0342\7G\2\2\u0342\u0362\b8\1\2\u0343\u0344\7J\2\2\u0344\u0362\b8\1\2"+
		"\u0345\u0346\7H\2\2\u0346\u0362\b8\1\2\u0347\u0348\7I\2\2\u0348\u0362"+
		"\b8\1\2\u0349\u034a\7J\2\2\u034a\u034b\7/\2\2\u034b\u034c\7!\2\2\u034c"+
		"\u034d\7\3\2\2\u034d\u034e\7\4\2\2\u034e\u0362\b8\1\2\u034f\u0350\7J\2"+
		"\2\u0350\u0351\7/\2\2\u0351\u0352\7\"\2\2\u0352\u0353\7\3\2\2\u0353\u0354"+
		"\7\4\2\2\u0354\u0362\b8\1\2\u0355\u0356\7J\2\2\u0356\u0357\7/\2\2\u0357"+
		"\u0358\7#\2\2\u0358\u0359\7\3\2\2\u0359\u035a\7\4\2\2\u035a\u0362\b8\1"+
		"\2\u035b\u035c\7J\2\2\u035c\u035d\7/\2\2\u035d\u035e\7$\2\2\u035e\u035f"+
		"\7\3\2\2\u035f\u0360\7\4\2\2\u0360\u0362\b8\1\2\u0361\u0339\3\2\2\2\u0361"+
		"\u033b\3\2\2\2\u0361\u033d\3\2\2\2\u0361\u033f\3\2\2\2\u0361\u0341\3\2"+
		"\2\2\u0361\u0343\3\2\2\2\u0361\u0345\3\2\2\2\u0361\u0347\3\2\2\2\u0361"+
		"\u0349\3\2\2\2\u0361\u034f\3\2\2\2\u0361\u0355\3\2\2\2\u0361\u035b\3\2"+
		"\2\2\u0362o\3\2\2\2(}\u008d\u0099\u00a7\u00d4\u00d9\u00e6\u00f2\u0103"+
		"\u0108\u0147\u0162\u0167\u017e\u018f\u0197\u01a0\u01bc\u01c9\u0218\u0224"+
		"\u022c\u023b\u024e\u0269\u0275\u028f\u02b5\u02bd\u02e9\u02f6\u0301\u030a"+
		"\u031a\u0326\u0328\u0337\u0361";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
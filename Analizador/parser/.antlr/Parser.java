// Generated from /Users/carlosngv/Documents/U/OCL2/OCL2 - 1S2022/Proyecto 1/Analizador/parser/Parser.g4 by ANTLR 4.8


    import "p1/packages/Analizador/ast"
    import "p1/packages/Analizador/ast/interfaces"
    import "p1/packages/Analizador/ast/expresion" // id, operacion, primitivo
    import "p1/packages/Analizador/ast/expresion/Accesos" // AccesoArreglo, AccesoObjeto
    import "p1/packages/Analizador/ast/expresion2" // Llamada
    import "p1/packages/Analizador/ast/instrucciones" // print, declaracion, asignación
    import "p1/packages/Analizador/ast/asignacion" // asignación
    import "p1/packages/Analizador/ast/instrucciones/Definicion" // DefinicionArreglo, DefinicionObjeto
    import "p1/packages/Analizador/ast/instrucciones/SentenciasTransferencia"
    import "p1/packages/Analizador/ast/instrucciones/SentenciasControl"
    import "p1/packages/Analizador/ast/funcionesNativas" // sqrt, abs, to_string()
    //import "p1/packages/Analizador/ast/instrucciones/SentenciasCiclicas"
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
		PRINTLN=8, IF_TOK=9, ELSE=10, MATCH=11, MUT=12, LET=13, CLASS=14, NEW_=15, 
		MAIN=16, PRIVATE=17, PUBLIC=18, STATIC=19, RETURN_P=20, BREAK_P=21, CONTINUE_P=22, 
		ABS=23, SQRT=24, TO_STRING=25, CLONE=26, POW=27, POWF=28, INTTYPE=29, 
		FLOATTYPE=30, STRINGTYPE=31, STRTYPE=32, CHARTYPE=33, VOIDTYPE=34, BOOLTYPE=35, 
		USIZETYPE=36, PUNTO=37, COMA=38, PTCOMA=39, DOSPUNTOS=40, AND=41, OR_CASE=42, 
		OR=43, NOT=44, IGUAL=45, IGUAL_IGUAL=46, DIFERENTE=47, MAYORIGUAL=48, 
		MENORIGUAL=49, MAYOR=50, MENOR=51, MUL=52, DIV=53, ADD=54, SUB=55, MOD=56, 
		NUMBER=57, USIZE=58, FLOAT=59, STRING=60, CHAR=61, TRUE=62, FALSE=63, 
		ID=64, WHITESPACE=65;
	public static final int
		RULE_start = 0, RULE_listaFunciones = 1, RULE_funcionItem = 2, RULE_modaccess = 3, 
		RULE_parametros = 4, RULE_funcmain = 5, RULE_bloque = 6, RULE_instrucciones = 7, 
		RULE_instruccion = 8, RULE_asignacion = 9, RULE_if_instr = 10, RULE_listaelseif = 11, 
		RULE_else_if = 12, RULE_match_instr = 13, RULE_bloque_match = 14, RULE_listacase = 15, 
		RULE_match_case = 16, RULE_listaexpre_case = 17, RULE_consola = 18, RULE_llamada = 19, 
		RULE_listaExpresiones = 20, RULE_declaracionIni = 21, RULE_declaracion = 22, 
		RULE_retorno = 23, RULE_sentencia_break = 24, RULE_sentencia_continue = 25, 
		RULE_listides = 26, RULE_tiposvars = 27, RULE_dec_arr = 28, RULE_dimensiones = 29, 
		RULE_dimension = 30, RULE_arraydata = 31, RULE_instancia = 32, RULE_listanchos = 33, 
		RULE_ancho = 34, RULE_dec_objeto = 35, RULE_instanciaClase = 36, RULE_accesoarr = 37, 
		RULE_accesoObjeto = 38, RULE_listaAccesos = 39, RULE_acceso = 40, RULE_expression = 41, 
		RULE_expr_rel = 42, RULE_expr_log = 43, RULE_expr_arit = 44, RULE_expr_valor = 45, 
		RULE_primitivo = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaFunciones", "funcionItem", "modaccess", "parametros", 
			"funcmain", "bloque", "instrucciones", "instruccion", "asignacion", "if_instr", 
			"listaelseif", "else_if", "match_instr", "bloque_match", "listacase", 
			"match_case", "listaexpre_case", "consola", "llamada", "listaExpresiones", 
			"declaracionIni", "declaracion", "retorno", "sentencia_break", "sentencia_continue", 
			"listides", "tiposvars", "dec_arr", "dimensiones", "dimension", "arraydata", 
			"instancia", "listanchos", "ancho", "dec_objeto", "instanciaClase", "accesoarr", 
			"accesoObjeto", "listaAccesos", "acceso", "expression", "expr_rel", "expr_log", 
			"expr_arit", "expr_valor", "primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'_'", "'println!'", 
			"'if'", "'else'", "'match'", "'mut'", "'let'", "'class'", "'new'", "'main'", 
			"'private'", "'public'", "'static'", "'return'", "'break'", "'continue'", 
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
			"PRINTLN", "IF_TOK", "ELSE", "MATCH", "MUT", "LET", "CLASS", "NEW_", 
			"MAIN", "PRIVATE", "PUBLIC", "STATIC", "RETURN_P", "BREAK_P", "CONTINUE_P", 
			"ABS", "SQRT", "TO_STRING", "CLONE", "POW", "POWF", "INTTYPE", "FLOATTYPE", 
			"STRINGTYPE", "STRTYPE", "CHARTYPE", "VOIDTYPE", "BOOLTYPE", "USIZETYPE", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", "AND", "OR_CASE", "OR", "NOT", 
			"IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "MUL", "DIV", "ADD", "SUB", "MOD", "NUMBER", "USIZE", "FLOAT", 
			"STRING", "CHAR", "TRUE", "FALSE", "ID", "WHITESPACE"
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
		public ListaFuncionesContext listaFunciones;
		public ListaFuncionesContext listaFunciones() {
			return getRuleContext(ListaFuncionesContext.class,0);
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
			setState(94);
			((StartContext)_localctx).listaFunciones = listaFunciones(0);
			 _localctx.ast = ast.NuevoAst( ((StartContext)_localctx).listaFunciones.lista)
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

	public static class ListaFuncionesContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaFuncionesContext SUBLISTA;
		public FuncionItemContext funcionItem;
		public FuncionItemContext funcionItem() {
			return getRuleContext(FuncionItemContext.class,0);
		}
		public ListaFuncionesContext listaFunciones() {
			return getRuleContext(ListaFuncionesContext.class,0);
		}
		public ListaFuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaFunciones; }
	}

	public final ListaFuncionesContext listaFunciones() throws RecognitionException {
		return listaFunciones(0);
	}

	private ListaFuncionesContext listaFunciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaFuncionesContext _localctx = new ListaFuncionesContext(_ctx, _parentState);
		ListaFuncionesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_listaFunciones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			((ListaFuncionesContext)_localctx).funcionItem = funcionItem();
			 _localctx.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaFuncionesContext(_parentctx, _parentState);
					_localctx.SUBLISTA = _prevctx;
					_localctx.SUBLISTA = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaFunciones);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					((ListaFuncionesContext)_localctx).funcionItem = funcionItem();

					                                                          ((ListaFuncionesContext)_localctx).SUBLISTA.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr)
					                                                          _localctx.lista =  ((ListaFuncionesContext)_localctx).SUBLISTA.lista
					              
					}
					} 
				}
				setState(109);
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

	public static class FuncionItemContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public FuncmainContext funcmain;
		public Token ID;
		public BloqueContext bloque;
		public TiposvarsContext tiposvars;
		public ParametrosContext parametros;
		public FuncmainContext funcmain() {
			return getRuleContext(FuncmainContext.class,0);
		}
		public ModaccessContext modaccess() {
			return getRuleContext(ModaccessContext.class,0);
		}
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionItem; }
	}

	public final FuncionItemContext funcionItem() throws RecognitionException {
		FuncionItemContext _localctx = new FuncionItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcionItem);
		 listaParams :=  arrayList.New() 
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((FuncionItemContext)_localctx).funcmain = funcmain();
				 _localctx.instr =  ((FuncionItemContext)_localctx).funcmain.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				modaccess();
				setState(114);
				tiposvars();
				setState(115);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(116);
				match(LP);
				setState(117);
				match(RP);
				setState(118);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				modaccess();
				setState(122);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(123);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(124);
				match(LP);
				setState(125);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(126);
				match(RP);
				setState(127);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),((FuncionItemContext)_localctx).parametros.lista,((FuncionItemContext)_localctx).bloque.lista,((FuncionItemContext)_localctx).tiposvars.tipo)
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
		public TerminalNode PUBLIC() { return getToken(Parser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(Parser.PRIVATE, 0); }
		public ModaccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modaccess; }
	}

	public final ModaccessContext modaccess() throws RecognitionException {
		ModaccessContext _localctx = new ModaccessContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_modaccess);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(PUBLIC);
				 _localctx.modAccess = entorno.PUBLIC
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(PRIVATE);
				 _localctx.modAccess = entorno.PRIVATE
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
		public TiposvarsContext tiposvars;
		public Token ID;
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_parametros, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(140);
			((ParametrosContext)_localctx).tiposvars = tiposvars();
			setState(141);
			((ParametrosContext)_localctx).ID = match(ID);

			                                                                    listaIdes := arrayList.New()
			                                                                    listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))
			                                                                    decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
			                                                                    _localctx.lista.Add( decl)
			                                                                 
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					match(COMA);
					setState(146);
					((ParametrosContext)_localctx).tiposvars = tiposvars();
					setState(147);
					((ParametrosContext)_localctx).ID = match(ID);

					                                                                              listaIdes := arrayList.New()
					                                                                              listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))

					                                                                              decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
					                                                                              ((ParametrosContext)_localctx).sublista.lista.Add( decl )
					                                                                              _localctx.lista =  ((ParametrosContext)_localctx).sublista.lista

					                                                                           
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FuncmainContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public BloqueContext bloque;
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
		enterRule(_localctx, 10, RULE_funcmain);
		 listaParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(MAIN);
			setState(156);
			match(LP);
			setState(157);
			match(RP);
			setState(158);
			((FuncmainContext)_localctx).bloque = bloque();
			 _localctx.instr = Simbolos.NuevoFuncion("main",listaParams,((FuncmainContext)_localctx).bloque.lista,entorno.VOID)
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
		enterRule(_localctx, 12, RULE_bloque);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(L_LLAVE);
				setState(162);
				((BloqueContext)_localctx).instrucciones = instrucciones();
				setState(163);
				match(R_LLAVE);
				_localctx.lista = ((BloqueContext)_localctx).instrucciones.lista 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(L_LLAVE);
				setState(167);
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
		enterRule(_localctx, 14, RULE_instrucciones);
		 _localctx.lista =  arrayList.New() 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (PRINTLN - 8)) | (1L << (IF_TOK - 8)) | (1L << (MATCH - 8)) | (1L << (LET - 8)) | (1L << (RETURN_P - 8)) | (1L << (BREAK_P - 8)) | (1L << (CONTINUE_P - 8)) | (1L << (INTTYPE - 8)) | (1L << (FLOATTYPE - 8)) | (1L << (STRINGTYPE - 8)) | (1L << (STRTYPE - 8)) | (1L << (CHARTYPE - 8)) | (1L << (VOIDTYPE - 8)) | (1L << (BOOLTYPE - 8)) | (1L << (USIZETYPE - 8)) | (1L << (ID - 8)))) != 0) );

			                                                                    listInt := localctx.(*InstruccionesContext).GetE()
			                                                                        for _, e := range listInt {
			                                                                          _localctx.lista.Add(e.GetInstr())
			                                                                        }
			                                                                    fmt.Printf("\ntipo %T",localctx.(*InstruccionesContext).GetE())
			                                                                
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
		public If_instrContext if_instr;
		public Match_instrContext match_instr;
		public ConsolaContext consola;
		public DeclaracionIniContext declaracionIni;
		public DeclaracionContext declaracion;
		public LlamadaContext llamada;
		public RetornoContext retorno;
		public Sentencia_breakContext sentencia_break;
		public Sentencia_continueContext sentencia_continue;
		public Dec_arrContext dec_arr;
		public Dec_objetoContext dec_objeto;
		public AsignacionContext asignacion;
		public If_instrContext if_instr() {
			return getRuleContext(If_instrContext.class,0);
		}
		public Match_instrContext match_instr() {
			return getRuleContext(Match_instrContext.class,0);
		}
		public ConsolaContext consola() {
			return getRuleContext(ConsolaContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(Parser.PTCOMA, 0); }
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
		public Sentencia_breakContext sentencia_break() {
			return getRuleContext(Sentencia_breakContext.class,0);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((InstruccionContext)_localctx).if_instr = if_instr();
				_localctx.instr = ((InstruccionContext)_localctx).if_instr.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((InstruccionContext)_localctx).match_instr = match_instr();
				_localctx.instr = ((InstruccionContext)_localctx).match_instr.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				((InstruccionContext)_localctx).consola = consola();
				setState(185);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				((InstruccionContext)_localctx).consola = consola();
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				((InstruccionContext)_localctx).declaracionIni = declaracionIni();
				setState(192);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracionIni.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(196);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				((InstruccionContext)_localctx).llamada = llamada();
				setState(200);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).llamada.instr
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				((InstruccionContext)_localctx).retorno = retorno();
				setState(204);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).retorno.instr
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(207);
				((InstruccionContext)_localctx).sentencia_break = sentencia_break();
				setState(208);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_break.instr
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				((InstruccionContext)_localctx).sentencia_continue = sentencia_continue();
				setState(212);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_continue.instr
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(215);
				((InstruccionContext)_localctx).dec_arr = dec_arr();
				setState(216);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_arr.instr
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219);
				((InstruccionContext)_localctx).dec_objeto = dec_objeto();
				setState(220);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_objeto.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(223);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(224);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
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
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(230);
			match(IGUAL);
			setState(231);
			((AsignacionContext)_localctx).expression = expression();

			            linea := localctx.(*AsignacionContext).Get_expression().GetStart().GetLine()
			            columna := localctx.(*AsignacionContext).Get_expression().GetStart().GetColumn()
			            _localctx.instr = asignacion.NuevaAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expression.expr, linea, columna)
			        
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
		public ExpressionContext expression;
		public BloqueContext bloque;
		public BloqueContext bprincipal;
		public BloqueContext belse;
		public ListaelseifContext listaelseif;
		public TerminalNode IF_TOK() { return getToken(Parser.IF_TOK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 20, RULE_if_instr);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(IF_TOK);
				setState(235);
				((If_instrContext)_localctx).expression = expression();
				setState(236);
				((If_instrContext)_localctx).bloque = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bloque.lista,nil,nil)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(IF_TOK);
				setState(240);
				((If_instrContext)_localctx).expression = expression();
				setState(241);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(242);
				match(ELSE);
				setState(243);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bprincipal.lista,nil,((If_instrContext)_localctx).belse.lista)
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(IF_TOK);
				setState(247);
				((If_instrContext)_localctx).expression = expression();
				setState(248);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(249);
				((If_instrContext)_localctx).listaelseif = listaelseif();
				setState(250);
				match(ELSE);
				setState(251);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bprincipal.lista,((If_instrContext)_localctx).listaelseif.lista,((If_instrContext)_localctx).belse.lista)
				    
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
		enterRule(_localctx, 22, RULE_listaelseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(256);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(259); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ExpressionContext expression;
		public BloqueContext bloque;
		public TerminalNode ELSE() { return getToken(Parser.ELSE, 0); }
		public TerminalNode IF_TOK() { return getToken(Parser.IF_TOK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ELSE);
			setState(264);
			match(IF_TOK);
			setState(265);
			((Else_ifContext)_localctx).expression = expression();
			setState(266);
			((Else_ifContext)_localctx).bloque = bloque();
			_localctx.instr = SentenciasControl.NewIfInstruccion(((Else_ifContext)_localctx).expression.expr,((Else_ifContext)_localctx).bloque.lista,nil,nil)
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
		public ExpressionContext expression;
		public Bloque_matchContext bloque_match;
		public TerminalNode MATCH() { return getToken(Parser.MATCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 26, RULE_match_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(MATCH);
			setState(270);
			((Match_instrContext)_localctx).expression = expression();
			setState(271);
			((Match_instrContext)_localctx).bloque_match = bloque_match();

			            _localctx.instr = SentenciasControl.NewMatchInstruccion(((Match_instrContext)_localctx).expression.expr,((Match_instrContext)_localctx).bloque_match.lista)
			        
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
		enterRule(_localctx, 28, RULE_bloque_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(L_LLAVE);
			setState(275);
			((Bloque_matchContext)_localctx).listacase = listacase();
			setState(276);
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
		enterRule(_localctx, 30, RULE_listacase);
		 _localctx.lista = arrayList.New()
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				((ListacaseContext)_localctx).match_case = match_case();
				((ListacaseContext)_localctx).list.add(((ListacaseContext)_localctx).match_case);
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (LP - 1)) | (1L << (L_LLAVE - 1)) | (1L << (GUION_BAJO - 1)) | (1L << (NEW_ - 1)) | (1L << (INTTYPE - 1)) | (1L << (FLOATTYPE - 1)) | (1L << (STRINGTYPE - 1)) | (1L << (STRTYPE - 1)) | (1L << (CHARTYPE - 1)) | (1L << (VOIDTYPE - 1)) | (1L << (BOOLTYPE - 1)) | (1L << (USIZETYPE - 1)) | (1L << (NOT - 1)) | (1L << (SUB - 1)) | (1L << (NUMBER - 1)) | (1L << (USIZE - 1)) | (1L << (FLOAT - 1)) | (1L << (STRING - 1)) | (1L << (CHAR - 1)) | (1L << (TRUE - 1)) | (1L << (FALSE - 1)) | (1L << (ID - 1)))) != 0) );

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
		enterRule(_localctx, 32, RULE_match_case);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(287);
				match(IGUAL);
				setState(288);
				match(MAYOR);
				setState(289);
				((Match_caseContext)_localctx).instruccion = instruccion();
				setState(290);
				match(COMA);

				        listaInstr := arrayList.New()
				        listaInstr.Add(((Match_caseContext)_localctx).instruccion.instr)
				        _localctx.matchCase = SentenciasControl.NewMatchCase(((Match_caseContext)_localctx).listaexpre_case.lista, listaInstr)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(294);
				match(IGUAL);
				setState(295);
				match(MAYOR);
				setState(296);
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
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_listaexpre_case, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case L_LLAVE:
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
				setState(302);
				((Listaexpre_caseContext)_localctx).expression = expression();

				        _localctx.lista.Add( ((Listaexpre_caseContext)_localctx).expression.expr )
				        
				}
				break;
			case GUION_BAJO:
				{
				setState(305);
				match(GUION_BAJO);

				    _localctx.lista.Add("_")

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
					setState(309);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(310);
					match(OR_CASE);
					setState(311);
					((Listaexpre_caseContext)_localctx).expression = expression();

					                                                              ((Listaexpre_caseContext)_localctx).LISTA.lista.Add( ((Listaexpre_caseContext)_localctx).expression.expr )
					                                                              _localctx.lista =  ((Listaexpre_caseContext)_localctx).LISTA.lista
					                                                          
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ConsolaContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpressionContext expression;
		public TerminalNode PRINTLN() { return getToken(Parser.PRINTLN, 0); }
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
		public ConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consola; }
	}

	public final ConsolaContext consola() throws RecognitionException {
		ConsolaContext _localctx = new ConsolaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_consola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(PRINTLN);
			setState(320);
			match(LP);
			setState(321);
			((ConsolaContext)_localctx).expression = expression();
			setState(322);
			match(RP);
			_localctx.instr = instrucciones.NuevoImprimir(((ConsolaContext)_localctx).expression.expr)
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
		enterRule(_localctx, 38, RULE_llamada);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(326);
				match(LP);
				setState(327);
				match(RP);

				                                                                        _localctx.instr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				                                                                        _localctx.expr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(330);
				match(LP);
				setState(331);
				((LlamadaContext)_localctx).listaExpresiones = listaExpresiones(0);
				setState(332);
				match(RP);

				                                                                        _localctx.instr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), ((LlamadaContext)_localctx).listaExpresiones.lista)
				                                                                        _localctx.expr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), ((LlamadaContext)_localctx).listaExpresiones.lista)
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
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_listaExpresiones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(338);
			((ListaExpresionesContext)_localctx).expression = expression();

			                                                                        _localctx.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
			                                                                     
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(341);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(342);
					match(COMA);
					setState(343);
					((ListaExpresionesContext)_localctx).expression = expression();

					                                                                                  ((ListaExpresionesContext)_localctx).LISTA.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
					                                                                                  _localctx.lista =  ((ListaExpresionesContext)_localctx).LISTA.lista
					                                                                               
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public ExpressionContext expression;
		public TiposvarsContext tiposvars;
		public TerminalNode LET() { return getToken(Parser.LET, 0); }
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(Parser.DOSPUNTOS, 0); }
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public TerminalNode MUT() { return getToken(Parser.MUT, 0); }
		public DeclaracionIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionIni; }
	}

	public final DeclaracionIniContext declaracionIni() throws RecognitionException {
		DeclaracionIniContext _localctx = new DeclaracionIniContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declaracionIni);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(LET);
				setState(352);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(353);
				match(IGUAL);
				setState(354);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(LET);
				setState(358);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(359);
				match(DOSPUNTOS);
				setState(360);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(361);
				match(IGUAL);
				setState(362);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(LET);
				setState(366);
				match(MUT);
				setState(367);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(368);
				match(IGUAL);
				setState(369);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, true, linea, columna)
				                                                                     
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(LET);
				setState(373);
				match(MUT);
				setState(374);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(375);
				match(DOSPUNTOS);
				setState(376);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(377);
				match(IGUAL);
				setState(378);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expression.expr, true, linea, columna)
				                                                                     
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
		enterRule(_localctx, 44, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((DeclaracionContext)_localctx).tiposvars = tiposvars();
			setState(384);
			((DeclaracionContext)_localctx).listides = listides(0);

			                                                                        _localctx.instr = instrucciones.NuevaDeclaracion(((DeclaracionContext)_localctx).listides.lista,((DeclaracionContext)_localctx).tiposvars.tipo)
			                                                                    
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
		public ExpressionContext expression;
		public TerminalNode RETURN_P() { return getToken(Parser.RETURN_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_retorno);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(RETURN_P);
				 _localctx.instr = SentenciaTransferencia.NewReturn(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(RETURN_P);
				setState(390);
				((RetornoContext)_localctx).expression = expression();
				 _localctx.instr = SentenciaTransferencia.NewReturn(entorno.NULL,((RetornoContext)_localctx).expression.expr)
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
		public ExpressionContext expression;
		public TerminalNode BREAK_P() { return getToken(Parser.BREAK_P, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Sentencia_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_break; }
	}

	public final Sentencia_breakContext sentencia_break() throws RecognitionException {
		Sentencia_breakContext _localctx = new Sentencia_breakContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sentencia_break);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(BREAK_P);
				 _localctx.instr = SentenciaTransferencia.NewBreak(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(BREAK_P);
				setState(398);
				((Sentencia_breakContext)_localctx).expression = expression();
				 _localctx.instr = SentenciaTransferencia.NewBreak(entorno.NULL,((Sentencia_breakContext)_localctx).expression.expr)
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
		enterRule(_localctx, 50, RULE_sentencia_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(CONTINUE_P);
			 _localctx.instr = SentenciaTransferencia.NewContinue(entorno.VOID)
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_listides, _p);
		  _localctx.lista =  arrayList.New() 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(407);
			((ListidesContext)_localctx).ID = match(ID);
			_localctx.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
					setState(410);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(411);
					match(COMA);
					setState(412);
					((ListidesContext)_localctx).ID = match(ID);

					                                                                              ((ListidesContext)_localctx).sub.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
					                                                                              _localctx.lista = ((ListidesContext)_localctx).sub.lista
					                                                                          
					}
					} 
				}
				setState(418);
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
		enterRule(_localctx, 54, RULE_tiposvars);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(INTTYPE);
				_localctx.tipo = entorno.INTEGER
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(STRINGTYPE);
				_localctx.tipo = entorno.STRING
				}
				break;
			case STRTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(STRTYPE);
				_localctx.tipo = entorno.STRING2
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(CHARTYPE);
				_localctx.tipo = entorno.CHAR
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(427);
				match(FLOATTYPE);
				_localctx.tipo = entorno.FLOAT
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(429);
				match(BOOLTYPE);
				_localctx.tipo = entorno.BOOLEAN
				}
				break;
			case VOIDTYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				match(VOIDTYPE);
				_localctx.tipo = entorno.VOID
				}
				break;
			case USIZETYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
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
		public TiposvarsContext tiposvars;
		public DimensionesContext dimensiones;
		public Token ID;
		public ExpressionContext expression;
		public TiposvarsContext tiposvars() {
			return getRuleContext(TiposvarsContext.class,0);
		}
		public DimensionesContext dimensiones() {
			return getRuleContext(DimensionesContext.class,0);
		}
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Dec_arrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_arr; }
	}

	public final Dec_arrContext dec_arr() throws RecognitionException {
		Dec_arrContext _localctx = new Dec_arrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dec_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			((Dec_arrContext)_localctx).tiposvars = tiposvars();
			setState(438);
			((Dec_arrContext)_localctx).dimensiones = dimensiones(0);
			setState(439);
			((Dec_arrContext)_localctx).ID = match(ID);
			setState(440);
			match(IGUAL);
			setState(441);
			((Dec_arrContext)_localctx).expression = expression();
			_localctx.instr = Definicion.NewDeclaracionArray(((Dec_arrContext)_localctx).dimensiones.tam,(((Dec_arrContext)_localctx).ID!=null?((Dec_arrContext)_localctx).ID.getText():null),((Dec_arrContext)_localctx).expression.expr,((Dec_arrContext)_localctx).tiposvars.tipo)
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_dimensiones, _p);
		 _localctx.tam = 0
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(445);
			dimension();
			_localctx.tam = 1
			}
			_ctx.stop = _input.LT(-1);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
					setState(448);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(449);
					dimension();

					                                                                              _localctx.tam = ((DimensionesContext)_localctx).tamano.tam + 1
					                                                                           
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 60, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(L_CORCH);
			setState(458);
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
		public TerminalNode L_LLAVE() { return getToken(Parser.L_LLAVE, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public TerminalNode R_LLAVE() { return getToken(Parser.R_LLAVE, 0); }
		public ArraydataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydata; }
	}

	public final ArraydataContext arraydata() throws RecognitionException {
		ArraydataContext _localctx = new ArraydataContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_arraydata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(L_LLAVE);
			setState(461);
			((ArraydataContext)_localctx).listaExpresiones = listaExpresiones(0);
			setState(462);
			match(R_LLAVE);
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
		enterRule(_localctx, 64, RULE_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(NEW_);
			setState(466);
			((InstanciaContext)_localctx).tiposvars = tiposvars();
			setState(467);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_listanchos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471);
			((ListanchosContext)_localctx).ancho = ancho();
			_localctx.lista.Add(((ListanchosContext)_localctx).ancho.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
					setState(474);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(475);
					((ListanchosContext)_localctx).ancho = ancho();

					                                                                                          ((ListanchosContext)_localctx).sublist.lista.Add(((ListanchosContext)_localctx).ancho.expr)
					                                                                                          _localctx.lista = ((ListanchosContext)_localctx).sublist.lista
					                                                                                      
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public ExpressionContext expression;
		public TerminalNode L_CORCH() { return getToken(Parser.L_CORCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_CORCH() { return getToken(Parser.R_CORCH, 0); }
		public AnchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ancho; }
	}

	public final AnchoContext ancho() throws RecognitionException {
		AnchoContext _localctx = new AnchoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ancho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(L_CORCH);
			setState(484);
			((AnchoContext)_localctx).expression = expression();
			setState(485);
			match(R_CORCH);
			_localctx.expr = ((AnchoContext)_localctx).expression.expr
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
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public ListidesContext listides() {
			return getRuleContext(ListidesContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(Parser.IGUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Dec_objetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_objeto; }
	}

	public final Dec_objetoContext dec_objeto() throws RecognitionException {
		Dec_objetoContext _localctx = new Dec_objetoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dec_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			((Dec_objetoContext)_localctx).ID = match(ID);
			setState(489);
			((Dec_objetoContext)_localctx).listides = listides(0);
			setState(490);
			match(IGUAL);
			setState(491);
			((Dec_objetoContext)_localctx).expression = expression();
			_localctx.instr = Definicion.NewDeclararObjeto( (((Dec_objetoContext)_localctx).ID!=null?((Dec_objetoContext)_localctx).ID.getText():null), ((Dec_objetoContext)_localctx).listides.lista, ((Dec_objetoContext)_localctx).expression.expr)
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
		enterRule(_localctx, 72, RULE_instanciaClase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(NEW_);
			setState(495);
			((InstanciaClaseContext)_localctx).ID = match(ID);
			setState(496);
			match(LP);
			setState(497);
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
		enterRule(_localctx, 74, RULE_accesoarr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			((AccesoarrContext)_localctx).ID = match(ID);
			setState(501);
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
		enterRule(_localctx, 76, RULE_accesoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_listaAccesos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(508);
			((ListaAccesosContext)_localctx).acceso = acceso();
			   _localctx.lista.Add(((ListaAccesosContext)_localctx).acceso.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
					setState(511);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(512);
					match(PUNTO);
					setState(513);
					((ListaAccesosContext)_localctx).acceso = acceso();

					                                                              ((ListaAccesosContext)_localctx).SUBLISTA.lista.Add( ((ListaAccesosContext)_localctx).acceso.expr)
					                                                              _localctx.lista = ((ListaAccesosContext)_localctx).SUBLISTA.lista
					                                                          
					}
					} 
				}
				setState(520);
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
		enterRule(_localctx, 80, RULE_acceso);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				((AccesoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((AccesoContext)_localctx).ID!=null?((AccesoContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
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

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_relContext expr_rel;
		public Expr_aritContext expr_arit;
		public Expr_logContext expr_log;
		public InstanciaContext instancia;
		public ArraydataContext arraydata;
		public TiposvarsContext tiposvars;
		public Token POW;
		public ExpressionContext opIz;
		public ExpressionContext opDe;
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWF() { return getToken(Parser.POWF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				((ExpressionContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_rel.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				((ExpressionContext)_localctx).expr_arit = expr_arit(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_arit.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				((ExpressionContext)_localctx).expr_log = expr_log(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_log.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				((ExpressionContext)_localctx).instancia = instancia();
				_localctx.expr = ((ExpressionContext)_localctx).instancia.expr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				((ExpressionContext)_localctx).arraydata = arraydata();
				_localctx.expr = ((ExpressionContext)_localctx).arraydata.expr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(543);
				((ExpressionContext)_localctx).tiposvars = tiposvars();
				setState(544);
				match(DOSPUNTOS);
				setState(545);
				match(DOSPUNTOS);
				setState(546);
				((ExpressionContext)_localctx).POW = match(POW);
				setState(547);
				match(LP);
				setState(548);
				((ExpressionContext)_localctx).opIz = expression();
				setState(549);
				match(COMA);
				setState(550);
				((ExpressionContext)_localctx).opDe = expression();
				setState(551);
				match(RP);
				 _localctx.expr = expresion.NuevaOperacion(((ExpressionContext)_localctx).opIz.expr,(((ExpressionContext)_localctx).POW!=null?((ExpressionContext)_localctx).POW.getText():null),((ExpressionContext)_localctx).opDe.expr,false, ((ExpressionContext)_localctx).tiposvars.tipo) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
				((ExpressionContext)_localctx).tiposvars = tiposvars();
				setState(555);
				match(DOSPUNTOS);
				setState(556);
				match(DOSPUNTOS);
				setState(557);
				match(POWF);
				setState(558);
				match(LP);
				setState(559);
				((ExpressionContext)_localctx).opIz = expression();
				setState(560);
				match(COMA);
				setState(561);
				((ExpressionContext)_localctx).opDe = expression();
				setState(562);
				match(RP);
				 _localctx.expr = expresion.NuevaOperacion(((ExpressionContext)_localctx).opIz.expr,"pow",((ExpressionContext)_localctx).opDe.expr,false, ((ExpressionContext)_localctx).tiposvars.tipo) 
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr_rel, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(568);
			((Expr_relContext)_localctx).expr_arit = expr_arit(0);
			_localctx.expr = ((Expr_relContext)_localctx).expr_arit.expr
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
					setState(571);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(572);
					((Expr_relContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL_IGUAL) | (1L << MAYORIGUAL) | (1L << MENORIGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
						((Expr_relContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(573);
					((Expr_relContext)_localctx).opDe = expr_rel(3);
					_localctx.expr = expresion.NuevaOperacion(((Expr_relContext)_localctx).opIz.expr,(((Expr_relContext)_localctx).op!=null?((Expr_relContext)_localctx).op.getText():null),((Expr_relContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(580);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(582);
				match(NOT);
				setState(583);
				((Expr_logContext)_localctx).opU = expr_log(3);
				_localctx.expr = expresion.NuevaOperacion(((Expr_logContext)_localctx).opU.expr,"!",nil,true, entorno.NULL)
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
				setState(586);
				((Expr_logContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((Expr_logContext)_localctx).expr_rel.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
					setState(591);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(592);
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
					setState(593);
					((Expr_logContext)_localctx).opDe = expr_log(3);
					_localctx.expr = expresion.NuevaOperacion(((Expr_logContext)_localctx).opIz.expr,(((Expr_logContext)_localctx).op!=null?((Expr_logContext)_localctx).op.getText():null),((Expr_logContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(600);
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

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion expr;
		public Expr_aritContext opIz;
		public ExpressionContext opU;
		public ExpressionContext expression;
		public Expr_valorContext expr_valor;
		public Token op;
		public Expr_aritContext opDe;
		public TerminalNode SUB() { return getToken(Parser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(602);
				match(SUB);
				setState(603);
				((Expr_aritContext)_localctx).opU = ((Expr_aritContext)_localctx).expression = expression();
				_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opU.expr,"-",nil,true, entorno.NULL)
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
				setState(606);
				((Expr_aritContext)_localctx).expr_valor = expr_valor();
				_localctx.expr = ((Expr_aritContext)_localctx).expr_valor.expr
				}
				break;
			case LP:
				{
				setState(609);
				match(LP);
				setState(610);
				((Expr_aritContext)_localctx).expression = expression();
				setState(611);
				match(RP);
				_localctx.expr = ((Expr_aritContext)_localctx).expression.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(616);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(617);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(618);
						((Expr_aritContext)_localctx).opDe = expr_arit(5);
						_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false, entorno.NULL)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(621);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(622);
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
						setState(623);
						((Expr_aritContext)_localctx).opDe = expr_arit(4);
						_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false, entorno.NULL)
						}
						break;
					}
					} 
				}
				setState(630);
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
		enterRule(_localctx, 90, RULE_expr_valor);
		try {
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				((Expr_valorContext)_localctx).primitivo = primitivo();
				_localctx.expr = ((Expr_valorContext)_localctx).primitivo.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				((Expr_valorContext)_localctx).llamada = llamada();
				_localctx.expr = ((Expr_valorContext)_localctx).llamada.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				((Expr_valorContext)_localctx).accesoarr = accesoarr();
				_localctx.expr = ((Expr_valorContext)_localctx).accesoarr.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
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
		enterRule(_localctx, 92, RULE_primitivo);
		try {
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				                                                                    num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                                                                    if err!= nil{
				                                                                        fmt.Println(err)
				                                                                    }
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(num,entorno.INTEGER)
				                                                                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				((PrimitivoContext)_localctx).USIZE = match(USIZE);

				                                                                    num,err := strconv.Atoi((((PrimitivoContext)_localctx).USIZE!=null?((PrimitivoContext)_localctx).USIZE.getText():null))
				                                                                    if err!= nil{
				                                                                        fmt.Println(err)
				                                                                    }
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(num,entorno.USIZE)
				                                                                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(649);
				((PrimitivoContext)_localctx).FLOAT = match(FLOAT);

				                                                                     num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getText():null),64)
				                                                                     if err!= nil{
				                                                                         fmt.Println(err)
				                                                                     }
				                                                                     _localctx.expr = expresion.NuevoPrimitivo(num,entorno.FLOAT)

				                                                                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				((PrimitivoContext)_localctx).STRING = match(STRING);

				                                                                    str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.STRING)
				                                                                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(653);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                                                                    str:= (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.CHAR)
				                                                                
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				((PrimitivoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null))
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(657);
				match(TRUE);
				 _localctx.expr = expresion.NuevoPrimitivo(true,entorno.BOOLEAN) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(659);
				match(FALSE);
				 _localctx.expr = expresion.NuevoPrimitivo(false,entorno.BOOLEAN) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(661);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(662);
				match(PUNTO);
				setState(663);
				match(ABS);
				setState(664);
				match(LP);
				setState(665);
				match(RP);

				        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorAbs((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(667);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(668);
				match(PUNTO);
				setState(669);
				match(SQRT);
				setState(670);
				match(LP);
				setState(671);
				match(RP);

				        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorSqrt((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(673);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(674);
				match(PUNTO);
				setState(675);
				match(TO_STRING);
				setState(676);
				match(LP);
				setState(677);
				match(RP);

				        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorStr((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(679);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(680);
				match(PUNTO);
				setState(681);
				match(CLONE);
				setState(682);
				match(LP);
				setState(683);
				match(RP);

				        linea := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorClone((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
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
			return listaFunciones_sempred((ListaFuncionesContext)_localctx, predIndex);
		case 4:
			return parametros_sempred((ParametrosContext)_localctx, predIndex);
		case 17:
			return listaexpre_case_sempred((Listaexpre_caseContext)_localctx, predIndex);
		case 20:
			return listaExpresiones_sempred((ListaExpresionesContext)_localctx, predIndex);
		case 26:
			return listides_sempred((ListidesContext)_localctx, predIndex);
		case 29:
			return dimensiones_sempred((DimensionesContext)_localctx, predIndex);
		case 33:
			return listanchos_sempred((ListanchosContext)_localctx, predIndex);
		case 39:
			return listaAccesos_sempred((ListaAccesosContext)_localctx, predIndex);
		case 42:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 43:
			return expr_log_sempred((Expr_logContext)_localctx, predIndex);
		case 44:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaFunciones_sempred(ListaFuncionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parametros_sempred(ParametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaexpre_case_sempred(Listaexpre_caseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean listaExpresiones_sempred(ListaExpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listides_sempred(ListidesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dimensiones_sempred(DimensionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listanchos_sempred(ListanchosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaAccesos_sempred(ListaAccesosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_rel_sempred(Expr_relContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_log_sempred(Expr_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u02b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0085\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u008c\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099"+
		"\n\6\f\6\16\6\u009c\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00ac\n\b\3\t\6\t\u00af\n\t\r\t\16\t\u00b0\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e6\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0101\n\f\3\r\6\r\u0104\n\r\r\r\16"+
		"\r\u0105\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u011b\n\21\r\21\16\21\u011c\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u012e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0136\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u013d\n\23\f\23\16\23\u0140\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0152\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015d\n"+
		"\26\f\26\16\26\u0160\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0180\n\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018c\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0194\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\7\34\u01a1\n\34\f\34\16\34\u01a4\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b6\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u01c7\n\37\f\37\16\37\u01ca\13\37\3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01e1\n#\f#\16#\u01e4\13"+
		"#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0207\n)\f)\16)\u020a\13)\3*\3*"+
		"\3*\3*\3*\5*\u0211\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0238"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0243\n,\f,\16,\u0246\13,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u0250\n-\3-\3-\3-\3-\3-\7-\u0257\n-\f-\16-\u025a\13-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0269\n.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\7.\u0275\n.\f.\16.\u0278\13.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u0286\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\5\60\u02b0\n\60\3\60\2\r\4\n$*\66<DPVXZ\61\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\6\4"+
		"\2\60\60\62\65\4\2++--\4\2\66\67::\3\289\2\u02cb\2`\3\2\2\2\4c\3\2\2\2"+
		"\6\u0084\3\2\2\2\b\u008b\3\2\2\2\n\u008d\3\2\2\2\f\u009d\3\2\2\2\16\u00ab"+
		"\3\2\2\2\20\u00ae\3\2\2\2\22\u00e5\3\2\2\2\24\u00e7\3\2\2\2\26\u0100\3"+
		"\2\2\2\30\u0103\3\2\2\2\32\u0109\3\2\2\2\34\u010f\3\2\2\2\36\u0114\3\2"+
		"\2\2 \u011a\3\2\2\2\"\u012d\3\2\2\2$\u0135\3\2\2\2&\u0141\3\2\2\2(\u0151"+
		"\3\2\2\2*\u0153\3\2\2\2,\u017f\3\2\2\2.\u0181\3\2\2\2\60\u018b\3\2\2\2"+
		"\62\u0193\3\2\2\2\64\u0195\3\2\2\2\66\u0198\3\2\2\28\u01b5\3\2\2\2:\u01b7"+
		"\3\2\2\2<\u01be\3\2\2\2>\u01cb\3\2\2\2@\u01ce\3\2\2\2B\u01d3\3\2\2\2D"+
		"\u01d8\3\2\2\2F\u01e5\3\2\2\2H\u01ea\3\2\2\2J\u01f0\3\2\2\2L\u01f6\3\2"+
		"\2\2N\u01fa\3\2\2\2P\u01fd\3\2\2\2R\u0210\3\2\2\2T\u0237\3\2\2\2V\u0239"+
		"\3\2\2\2X\u024f\3\2\2\2Z\u0268\3\2\2\2\\\u0285\3\2\2\2^\u02af\3\2\2\2"+
		"`a\5\4\3\2ab\b\2\1\2b\3\3\2\2\2cd\b\3\1\2de\5\6\4\2ef\b\3\1\2fm\3\2\2"+
		"\2gh\f\4\2\2hi\5\6\4\2ij\b\3\1\2jl\3\2\2\2kg\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\5\3\2\2\2om\3\2\2\2pq\5\f\7\2qr\b\4\1\2r\u0085\3\2\2\2s"+
		"t\5\b\5\2tu\58\35\2uv\7B\2\2vw\7\3\2\2wx\7\4\2\2xy\5\16\b\2yz\b\4\1\2"+
		"z\u0085\3\2\2\2{|\5\b\5\2|}\58\35\2}~\7B\2\2~\177\7\3\2\2\177\u0080\5"+
		"\n\6\2\u0080\u0081\7\4\2\2\u0081\u0082\5\16\b\2\u0082\u0083\b\4\1\2\u0083"+
		"\u0085\3\2\2\2\u0084p\3\2\2\2\u0084s\3\2\2\2\u0084{\3\2\2\2\u0085\7\3"+
		"\2\2\2\u0086\u0087\7\24\2\2\u0087\u008c\b\5\1\2\u0088\u0089\7\23\2\2\u0089"+
		"\u008c\b\5\1\2\u008a\u008c\b\5\1\2\u008b\u0086\3\2\2\2\u008b\u0088\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\t\3\2\2\2\u008d\u008e\b\6\1\2\u008e\u008f"+
		"\58\35\2\u008f\u0090\7B\2\2\u0090\u0091\b\6\1\2\u0091\u009a\3\2\2\2\u0092"+
		"\u0093\f\4\2\2\u0093\u0094\7(\2\2\u0094\u0095\58\35\2\u0095\u0096\7B\2"+
		"\2\u0096\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\13\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\22\2\2\u009e\u009f\7\3\2\2\u009f\u00a0\7"+
		"\4\2\2\u00a0\u00a1\5\16\b\2\u00a1\u00a2\b\7\1\2\u00a2\r\3\2\2\2\u00a3"+
		"\u00a4\7\5\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\b"+
		"\b\1\2\u00a7\u00ac\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\7\6\2\2\u00aa"+
		"\u00ac\b\b\1\2\u00ab\u00a3\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\17\3\2\2"+
		"\2\u00ad\u00af\5\22\n\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\t"+
		"\1\2\u00b3\21\3\2\2\2\u00b4\u00b5\5\26\f\2\u00b5\u00b6\b\n\1\2\u00b6\u00e6"+
		"\3\2\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\b\n\1\2\u00b9\u00e6\3\2\2\2"+
		"\u00ba\u00bb\5&\24\2\u00bb\u00bc\7)\2\2\u00bc\u00bd\b\n\1\2\u00bd\u00e6"+
		"\3\2\2\2\u00be\u00bf\5&\24\2\u00bf\u00c0\b\n\1\2\u00c0\u00e6\3\2\2\2\u00c1"+
		"\u00c2\5,\27\2\u00c2\u00c3\7)\2\2\u00c3\u00c4\b\n\1\2\u00c4\u00e6\3\2"+
		"\2\2\u00c5\u00c6\5.\30\2\u00c6\u00c7\7)\2\2\u00c7\u00c8\b\n\1\2\u00c8"+
		"\u00e6\3\2\2\2\u00c9\u00ca\5(\25\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\b\n"+
		"\1\2\u00cc\u00e6\3\2\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\7)\2\2\u00cf"+
		"\u00d0\b\n\1\2\u00d0\u00e6\3\2\2\2\u00d1\u00d2\5\62\32\2\u00d2\u00d3\7"+
		")\2\2\u00d3\u00d4\b\n\1\2\u00d4\u00e6\3\2\2\2\u00d5\u00d6\5\64\33\2\u00d6"+
		"\u00d7\7)\2\2\u00d7\u00d8\b\n\1\2\u00d8\u00e6\3\2\2\2\u00d9\u00da\5:\36"+
		"\2\u00da\u00db\7)\2\2\u00db\u00dc\b\n\1\2\u00dc\u00e6\3\2\2\2\u00dd\u00de"+
		"\5H%\2\u00de\u00df\7)\2\2\u00df\u00e0\b\n\1\2\u00e0\u00e6\3\2\2\2\u00e1"+
		"\u00e2\5\24\13\2\u00e2\u00e3\7)\2\2\u00e3\u00e4\b\n\1\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00b4\3\2\2\2\u00e5\u00b7\3\2\2\2\u00e5\u00ba\3\2\2\2\u00e5"+
		"\u00be\3\2\2\2\u00e5\u00c1\3\2\2\2\u00e5\u00c5\3\2\2\2\u00e5\u00c9\3\2"+
		"\2\2\u00e5\u00cd\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5"+
		"\u00d9\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e6\23\3\2\2"+
		"\2\u00e7\u00e8\7B\2\2\u00e8\u00e9\7/\2\2\u00e9\u00ea\5T+\2\u00ea\u00eb"+
		"\b\13\1\2\u00eb\25\3\2\2\2\u00ec\u00ed\7\13\2\2\u00ed\u00ee\5T+\2\u00ee"+
		"\u00ef\5\16\b\2\u00ef\u00f0\b\f\1\2\u00f0\u0101\3\2\2\2\u00f1\u00f2\7"+
		"\13\2\2\u00f2\u00f3\5T+\2\u00f3\u00f4\5\16\b\2\u00f4\u00f5\7\f\2\2\u00f5"+
		"\u00f6\5\16\b\2\u00f6\u00f7\b\f\1\2\u00f7\u0101\3\2\2\2\u00f8\u00f9\7"+
		"\13\2\2\u00f9\u00fa\5T+\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc\5\30\r\2\u00fc"+
		"\u00fd\7\f\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\b\f\1\2\u00ff\u0101\3"+
		"\2\2\2\u0100\u00ec\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00f8\3\2\2\2\u0101"+
		"\27\3\2\2\2\u0102\u0104\5\32\16\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b\r\1\2\u0108\31\3\2\2\2\u0109\u010a\7\f\2\2\u010a\u010b\7\13\2"+
		"\2\u010b\u010c\5T+\2\u010c\u010d\5\16\b\2\u010d\u010e\b\16\1\2\u010e\33"+
		"\3\2\2\2\u010f\u0110\7\r\2\2\u0110\u0111\5T+\2\u0111\u0112\5\36\20\2\u0112"+
		"\u0113\b\17\1\2\u0113\35\3\2\2\2\u0114\u0115\7\5\2\2\u0115\u0116\5 \21"+
		"\2\u0116\u0117\7\6\2\2\u0117\u0118\b\20\1\2\u0118\37\3\2\2\2\u0119\u011b"+
		"\5\"\22\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b\21\1\2\u011f!\3"+
		"\2\2\2\u0120\u0121\5$\23\2\u0121\u0122\7/\2\2\u0122\u0123\7\64\2\2\u0123"+
		"\u0124\5\22\n\2\u0124\u0125\7(\2\2\u0125\u0126\b\22\1\2\u0126\u012e\3"+
		"\2\2\2\u0127\u0128\5$\23\2\u0128\u0129\7/\2\2\u0129\u012a\7\64\2\2\u012a"+
		"\u012b\5\16\b\2\u012b\u012c\b\22\1\2\u012c\u012e\3\2\2\2\u012d\u0120\3"+
		"\2\2\2\u012d\u0127\3\2\2\2\u012e#\3\2\2\2\u012f\u0130\b\23\1\2\u0130\u0131"+
		"\5T+\2\u0131\u0132\b\23\1\2\u0132\u0136\3\2\2\2\u0133\u0134\7\t\2\2\u0134"+
		"\u0136\b\23\1\2\u0135\u012f\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u013e\3"+
		"\2\2\2\u0137\u0138\f\5\2\2\u0138\u0139\7,\2\2\u0139\u013a\5T+\2\u013a"+
		"\u013b\b\23\1\2\u013b\u013d\3\2\2\2\u013c\u0137\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f%\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\7\n\2\2\u0142\u0143\7\3\2\2\u0143\u0144\5T+\2\u0144"+
		"\u0145\7\4\2\2\u0145\u0146\b\24\1\2\u0146\'\3\2\2\2\u0147\u0148\7B\2\2"+
		"\u0148\u0149\7\3\2\2\u0149\u014a\7\4\2\2\u014a\u0152\b\25\1\2\u014b\u014c"+
		"\7B\2\2\u014c\u014d\7\3\2\2\u014d\u014e\5*\26\2\u014e\u014f\7\4\2\2\u014f"+
		"\u0150\b\25\1\2\u0150\u0152\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u014b\3"+
		"\2\2\2\u0152)\3\2\2\2\u0153\u0154\b\26\1\2\u0154\u0155\5T+\2\u0155\u0156"+
		"\b\26\1\2\u0156\u015e\3\2\2\2\u0157\u0158\f\4\2\2\u0158\u0159\7(\2\2\u0159"+
		"\u015a\5T+\2\u015a\u015b\b\26\1\2\u015b\u015d\3\2\2\2\u015c\u0157\3\2"+
		"\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"+\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\17\2\2\u0162\u0163\5\66\34"+
		"\2\u0163\u0164\7/\2\2\u0164\u0165\5T+\2\u0165\u0166\b\27\1\2\u0166\u0180"+
		"\3\2\2\2\u0167\u0168\7\17\2\2\u0168\u0169\5\66\34\2\u0169\u016a\7*\2\2"+
		"\u016a\u016b\58\35\2\u016b\u016c\7/\2\2\u016c\u016d\5T+\2\u016d\u016e"+
		"\b\27\1\2\u016e\u0180\3\2\2\2\u016f\u0170\7\17\2\2\u0170\u0171\7\16\2"+
		"\2\u0171\u0172\5\66\34\2\u0172\u0173\7/\2\2\u0173\u0174\5T+\2\u0174\u0175"+
		"\b\27\1\2\u0175\u0180\3\2\2\2\u0176\u0177\7\17\2\2\u0177\u0178\7\16\2"+
		"\2\u0178\u0179\5\66\34\2\u0179\u017a\7*\2\2\u017a\u017b\58\35\2\u017b"+
		"\u017c\7/\2\2\u017c\u017d\5T+\2\u017d\u017e\b\27\1\2\u017e\u0180\3\2\2"+
		"\2\u017f\u0161\3\2\2\2\u017f\u0167\3\2\2\2\u017f\u016f\3\2\2\2\u017f\u0176"+
		"\3\2\2\2\u0180-\3\2\2\2\u0181\u0182\58\35\2\u0182\u0183\5\66\34\2\u0183"+
		"\u0184\b\30\1\2\u0184/\3\2\2\2\u0185\u0186\7\26\2\2\u0186\u018c\b\31\1"+
		"\2\u0187\u0188\7\26\2\2\u0188\u0189\5T+\2\u0189\u018a\b\31\1\2\u018a\u018c"+
		"\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u0187\3\2\2\2\u018c\61\3\2\2\2\u018d"+
		"\u018e\7\27\2\2\u018e\u0194\b\32\1\2\u018f\u0190\7\27\2\2\u0190\u0191"+
		"\5T+\2\u0191\u0192\b\32\1\2\u0192\u0194\3\2\2\2\u0193\u018d\3\2\2\2\u0193"+
		"\u018f\3\2\2\2\u0194\63\3\2\2\2\u0195\u0196\7\30\2\2\u0196\u0197\b\33"+
		"\1\2\u0197\65\3\2\2\2\u0198\u0199\b\34\1\2\u0199\u019a\7B\2\2\u019a\u019b"+
		"\b\34\1\2\u019b\u01a2\3\2\2\2\u019c\u019d\f\4\2\2\u019d\u019e\7(\2\2\u019e"+
		"\u019f\7B\2\2\u019f\u01a1\b\34\1\2\u01a0\u019c\3\2\2\2\u01a1\u01a4\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\67\3\2\2\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5\u01a6\7\37\2\2\u01a6\u01b6\b\35\1\2\u01a7\u01a8\7!\2\2"+
		"\u01a8\u01b6\b\35\1\2\u01a9\u01aa\7\"\2\2\u01aa\u01b6\b\35\1\2\u01ab\u01ac"+
		"\7#\2\2\u01ac\u01b6\b\35\1\2\u01ad\u01ae\7 \2\2\u01ae\u01b6\b\35\1\2\u01af"+
		"\u01b0\7%\2\2\u01b0\u01b6\b\35\1\2\u01b1\u01b2\7$\2\2\u01b2\u01b6\b\35"+
		"\1\2\u01b3\u01b4\7&\2\2\u01b4\u01b6\b\35\1\2\u01b5\u01a5\3\2\2\2\u01b5"+
		"\u01a7\3\2\2\2\u01b5\u01a9\3\2\2\2\u01b5\u01ab\3\2\2\2\u01b5\u01ad\3\2"+
		"\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"9\3\2\2\2\u01b7\u01b8\58\35\2\u01b8\u01b9\5<\37\2\u01b9\u01ba\7B\2\2\u01ba"+
		"\u01bb\7/\2\2\u01bb\u01bc\5T+\2\u01bc\u01bd\b\36\1\2\u01bd;\3\2\2\2\u01be"+
		"\u01bf\b\37\1\2\u01bf\u01c0\5> \2\u01c0\u01c1\b\37\1\2\u01c1\u01c8\3\2"+
		"\2\2\u01c2\u01c3\f\4\2\2\u01c3\u01c4\5> \2\u01c4\u01c5\b\37\1\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9=\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc"+
		"\7\7\2\2\u01cc\u01cd\7\b\2\2\u01cd?\3\2\2\2\u01ce\u01cf\7\5\2\2\u01cf"+
		"\u01d0\5*\26\2\u01d0\u01d1\7\6\2\2\u01d1\u01d2\b!\1\2\u01d2A\3\2\2\2\u01d3"+
		"\u01d4\7\21\2\2\u01d4\u01d5\58\35\2\u01d5\u01d6\5D#\2\u01d6\u01d7\b\""+
		"\1\2\u01d7C\3\2\2\2\u01d8\u01d9\b#\1\2\u01d9\u01da\5F$\2\u01da\u01db\b"+
		"#\1\2\u01db\u01e2\3\2\2\2\u01dc\u01dd\f\4\2\2\u01dd\u01de\5F$\2\u01de"+
		"\u01df\b#\1\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3E\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01e6\7\7\2\2\u01e6\u01e7\5T+\2\u01e7\u01e8\7\b\2\2\u01e8"+
		"\u01e9\b$\1\2\u01e9G\3\2\2\2\u01ea\u01eb\7B\2\2\u01eb\u01ec\5\66\34\2"+
		"\u01ec\u01ed\7/\2\2\u01ed\u01ee\5T+\2\u01ee\u01ef\b%\1\2\u01efI\3\2\2"+
		"\2\u01f0\u01f1\7\21\2\2\u01f1\u01f2\7B\2\2\u01f2\u01f3\7\3\2\2\u01f3\u01f4"+
		"\7\4\2\2\u01f4\u01f5\b&\1\2\u01f5K\3\2\2\2\u01f6\u01f7\7B\2\2\u01f7\u01f8"+
		"\5D#\2\u01f8\u01f9\b\'\1\2\u01f9M\3\2\2\2\u01fa\u01fb\5P)\2\u01fb\u01fc"+
		"\b(\1\2\u01fcO\3\2\2\2\u01fd\u01fe\b)\1\2\u01fe\u01ff\5R*\2\u01ff\u0200"+
		"\b)\1\2\u0200\u0208\3\2\2\2\u0201\u0202\f\4\2\2\u0202\u0203\7\'\2\2\u0203"+
		"\u0204\5R*\2\u0204\u0205\b)\1\2\u0205\u0207\3\2\2\2\u0206\u0201\3\2\2"+
		"\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209Q"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020c\7B\2\2\u020c\u0211\b*\1\2\u020d"+
		"\u020e\5L\'\2\u020e\u020f\b*\1\2\u020f\u0211\3\2\2\2\u0210\u020b\3\2\2"+
		"\2\u0210\u020d\3\2\2\2\u0211S\3\2\2\2\u0212\u0213\5V,\2\u0213\u0214\b"+
		"+\1\2\u0214\u0238\3\2\2\2\u0215\u0216\5Z.\2\u0216\u0217\b+\1\2\u0217\u0238"+
		"\3\2\2\2\u0218\u0219\5X-\2\u0219\u021a\b+\1\2\u021a\u0238\3\2\2\2\u021b"+
		"\u021c\5B\"\2\u021c\u021d\b+\1\2\u021d\u0238\3\2\2\2\u021e\u021f\5@!\2"+
		"\u021f\u0220\b+\1\2\u0220\u0238\3\2\2\2\u0221\u0222\58\35\2\u0222\u0223"+
		"\7*\2\2\u0223\u0224\7*\2\2\u0224\u0225\7\35\2\2\u0225\u0226\7\3\2\2\u0226"+
		"\u0227\5T+\2\u0227\u0228\7(\2\2\u0228\u0229\5T+\2\u0229\u022a\7\4\2\2"+
		"\u022a\u022b\b+\1\2\u022b\u0238\3\2\2\2\u022c\u022d\58\35\2\u022d\u022e"+
		"\7*\2\2\u022e\u022f\7*\2\2\u022f\u0230\7\36\2\2\u0230\u0231\7\3\2\2\u0231"+
		"\u0232\5T+\2\u0232\u0233\7(\2\2\u0233\u0234\5T+\2\u0234\u0235\7\4\2\2"+
		"\u0235\u0236\b+\1\2\u0236\u0238\3\2\2\2\u0237\u0212\3\2\2\2\u0237\u0215"+
		"\3\2\2\2\u0237\u0218\3\2\2\2\u0237\u021b\3\2\2\2\u0237\u021e\3\2\2\2\u0237"+
		"\u0221\3\2\2\2\u0237\u022c\3\2\2\2\u0238U\3\2\2\2\u0239\u023a\b,\1\2\u023a"+
		"\u023b\5Z.\2\u023b\u023c\b,\1\2\u023c\u0244\3\2\2\2\u023d\u023e\f\4\2"+
		"\2\u023e\u023f\t\2\2\2\u023f\u0240\5V,\5\u0240\u0241\b,\1\2\u0241\u0243"+
		"\3\2\2\2\u0242\u023d\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245W\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\b-\1\2\u0248"+
		"\u0249\7.\2\2\u0249\u024a\5X-\5\u024a\u024b\b-\1\2\u024b\u0250\3\2\2\2"+
		"\u024c\u024d\5V,\2\u024d\u024e\b-\1\2\u024e\u0250\3\2\2\2\u024f\u0247"+
		"\3\2\2\2\u024f\u024c\3\2\2\2\u0250\u0258\3\2\2\2\u0251\u0252\f\4\2\2\u0252"+
		"\u0253\t\3\2\2\u0253\u0254\5X-\5\u0254\u0255\b-\1\2\u0255\u0257\3\2\2"+
		"\2\u0256\u0251\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259Y\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\b.\1\2\u025c\u025d"+
		"\79\2\2\u025d\u025e\5T+\2\u025e\u025f\b.\1\2\u025f\u0269\3\2\2\2\u0260"+
		"\u0261\5\\/\2\u0261\u0262\b.\1\2\u0262\u0269\3\2\2\2\u0263\u0264\7\3\2"+
		"\2\u0264\u0265\5T+\2\u0265\u0266\7\4\2\2\u0266\u0267\b.\1\2\u0267\u0269"+
		"\3\2\2\2\u0268\u025b\3\2\2\2\u0268\u0260\3\2\2\2\u0268\u0263\3\2\2\2\u0269"+
		"\u0276\3\2\2\2\u026a\u026b\f\6\2\2\u026b\u026c\t\4\2\2\u026c\u026d\5Z"+
		".\7\u026d\u026e\b.\1\2\u026e\u0275\3\2\2\2\u026f\u0270\f\5\2\2\u0270\u0271"+
		"\t\5\2\2\u0271\u0272\5Z.\6\u0272\u0273\b.\1\2\u0273\u0275\3\2\2\2\u0274"+
		"\u026a\3\2\2\2\u0274\u026f\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277[\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a"+
		"\5^\60\2\u027a\u027b\b/\1\2\u027b\u0286\3\2\2\2\u027c\u027d\5(\25\2\u027d"+
		"\u027e\b/\1\2\u027e\u0286\3\2\2\2\u027f\u0280\5L\'\2\u0280\u0281\b/\1"+
		"\2\u0281\u0286\3\2\2\2\u0282\u0283\5N(\2\u0283\u0284\b/\1\2\u0284\u0286"+
		"\3\2\2\2\u0285\u0279\3\2\2\2\u0285\u027c\3\2\2\2\u0285\u027f\3\2\2\2\u0285"+
		"\u0282\3\2\2\2\u0286]\3\2\2\2\u0287\u0288\7;\2\2\u0288\u02b0\b\60\1\2"+
		"\u0289\u028a\7<\2\2\u028a\u02b0\b\60\1\2\u028b\u028c\7=\2\2\u028c\u02b0"+
		"\b\60\1\2\u028d\u028e\7>\2\2\u028e\u02b0\b\60\1\2\u028f\u0290\7?\2\2\u0290"+
		"\u02b0\b\60\1\2\u0291\u0292\7B\2\2\u0292\u02b0\b\60\1\2\u0293\u0294\7"+
		"@\2\2\u0294\u02b0\b\60\1\2\u0295\u0296\7A\2\2\u0296\u02b0\b\60\1\2\u0297"+
		"\u0298\7B\2\2\u0298\u0299\7\'\2\2\u0299\u029a\7\31\2\2\u029a\u029b\7\3"+
		"\2\2\u029b\u029c\7\4\2\2\u029c\u02b0\b\60\1\2\u029d\u029e\7B\2\2\u029e"+
		"\u029f\7\'\2\2\u029f\u02a0\7\32\2\2\u02a0\u02a1\7\3\2\2\u02a1\u02a2\7"+
		"\4\2\2\u02a2\u02b0\b\60\1\2\u02a3\u02a4\7B\2\2\u02a4\u02a5\7\'\2\2\u02a5"+
		"\u02a6\7\33\2\2\u02a6\u02a7\7\3\2\2\u02a7\u02a8\7\4\2\2\u02a8\u02b0\b"+
		"\60\1\2\u02a9\u02aa\7B\2\2\u02aa\u02ab\7\'\2\2\u02ab\u02ac\7\34\2\2\u02ac"+
		"\u02ad\7\3\2\2\u02ad\u02ae\7\4\2\2\u02ae\u02b0\b\60\1\2\u02af\u0287\3"+
		"\2\2\2\u02af\u0289\3\2\2\2\u02af\u028b\3\2\2\2\u02af\u028d\3\2\2\2\u02af"+
		"\u028f\3\2\2\2\u02af\u0291\3\2\2\2\u02af\u0293\3\2\2\2\u02af\u0295\3\2"+
		"\2\2\u02af\u0297\3\2\2\2\u02af\u029d\3\2\2\2\u02af\u02a3\3\2\2\2\u02af"+
		"\u02a9\3\2\2\2\u02b0_\3\2\2\2#m\u0084\u008b\u009a\u00ab\u00b0\u00e5\u0100"+
		"\u0105\u011c\u012d\u0135\u013e\u0151\u015e\u017f\u018b\u0193\u01a2\u01b5"+
		"\u01c8\u01e2\u0208\u0210\u0237\u0244\u024f\u0258\u0268\u0274\u0276\u0285"+
		"\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
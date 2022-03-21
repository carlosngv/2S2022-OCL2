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
		LP=1, RP=2, L_LLAVE=3, R_LLAVE=4, L_CORCH=5, R_CORCH=6, PRINTLN=7, IF_TOK=8, 
		ELSE=9, MUT=10, LET=11, CLASS=12, NEW_=13, MAIN=14, PRIVATE=15, PUBLIC=16, 
		STATIC=17, RETURN_P=18, BREAK_P=19, CONTINUE_P=20, ABS=21, SQRT=22, TO_STRING=23, 
		CLONE=24, INTTYPE=25, FLOATTYPE=26, STRINGTYPE=27, STRTYPE=28, CHARTYPE=29, 
		VOIDTYPE=30, BOOLTYPE=31, USIZETYPE=32, PUNTO=33, COMA=34, PTCOMA=35, 
		DOSPUNTOS=36, AND=37, OR=38, NOT=39, IGUAL=40, IGUAL_IGUAL=41, DIFERENTE=42, 
		MAYORIGUAL=43, MENORIGUAL=44, MAYOR=45, MENOR=46, MUL=47, DIV=48, ADD=49, 
		SUB=50, NUMBER=51, USIZE=52, FLOAT=53, STRING=54, CHAR=55, TRUE=56, FALSE=57, 
		ID=58, WHITESPACE=59;
	public static final int
		RULE_start = 0, RULE_listaFunciones = 1, RULE_funcionItem = 2, RULE_modaccess = 3, 
		RULE_parametros = 4, RULE_funcmain = 5, RULE_bloque = 6, RULE_instrucciones = 7, 
		RULE_instruccion = 8, RULE_asignacion = 9, RULE_if_instr = 10, RULE_listaelseif = 11, 
		RULE_else_if = 12, RULE_consola = 13, RULE_llamada = 14, RULE_listaExpresiones = 15, 
		RULE_declaracionIni = 16, RULE_declaracion = 17, RULE_retorno = 18, RULE_sentencia_break = 19, 
		RULE_sentencia_continue = 20, RULE_listides = 21, RULE_tiposvars = 22, 
		RULE_dec_arr = 23, RULE_dimensiones = 24, RULE_dimension = 25, RULE_arraydata = 26, 
		RULE_instancia = 27, RULE_listanchos = 28, RULE_ancho = 29, RULE_dec_objeto = 30, 
		RULE_instanciaClase = 31, RULE_accesoarr = 32, RULE_accesoObjeto = 33, 
		RULE_listaAccesos = 34, RULE_acceso = 35, RULE_expression = 36, RULE_expr_rel = 37, 
		RULE_expr_arit = 38, RULE_expr_valor = 39, RULE_primitivo = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaFunciones", "funcionItem", "modaccess", "parametros", 
			"funcmain", "bloque", "instrucciones", "instruccion", "asignacion", "if_instr", 
			"listaelseif", "else_if", "consola", "llamada", "listaExpresiones", "declaracionIni", 
			"declaracion", "retorno", "sentencia_break", "sentencia_continue", "listides", 
			"tiposvars", "dec_arr", "dimensiones", "dimension", "arraydata", "instancia", 
			"listanchos", "ancho", "dec_objeto", "instanciaClase", "accesoarr", "accesoObjeto", 
			"listaAccesos", "acceso", "expression", "expr_rel", "expr_arit", "expr_valor", 
			"primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'println!'", "'if'", 
			"'else'", "'mut'", "'let'", "'class'", "'new'", "'main'", "'private'", 
			"'public'", "'static'", "'return'", "'break'", "'continue'", "'abs'", 
			"'sqrt'", "'to_string'", "'clone'", "'i64'", "'f64'", "'String'", "'&str'", 
			"'char'", "'void'", "'boolean'", "'usize'", "'.'", "','", "';'", "':'", 
			"'&&'", "'||'", "'!'", "'='", "'=='", "'!='", "'>='", "'<='", "'>'", 
			"'<'", "'*'", "'/'", "'+'", "'-'", null, null, null, null, null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "PRINTLN", 
			"IF_TOK", "ELSE", "MUT", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUBLIC", 
			"STATIC", "RETURN_P", "BREAK_P", "CONTINUE_P", "ABS", "SQRT", "TO_STRING", 
			"CLONE", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE", "CHARTYPE", 
			"VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", "COMA", "PTCOMA", "DOSPUNTOS", 
			"AND", "OR", "NOT", "IGUAL", "IGUAL_IGUAL", "DIFERENTE", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB", "NUMBER", 
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
			setState(82);
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
			setState(86);
			((ListaFuncionesContext)_localctx).funcionItem = funcionItem();
			 _localctx.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
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
					setState(89);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(90);
					((ListaFuncionesContext)_localctx).funcionItem = funcionItem();

					                                                          ((ListaFuncionesContext)_localctx).SUBLISTA.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr)
					                                                          _localctx.lista =  ((ListaFuncionesContext)_localctx).SUBLISTA.lista
					              
					}
					} 
				}
				setState(97);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((FuncionItemContext)_localctx).funcmain = funcmain();
				 _localctx.instr =  ((FuncionItemContext)_localctx).funcmain.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				modaccess();
				setState(102);
				tiposvars();
				setState(103);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(104);
				match(LP);
				setState(105);
				match(RP);
				setState(106);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				modaccess();
				setState(110);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(111);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(112);
				match(LP);
				setState(113);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(114);
				match(RP);
				setState(115);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(PUBLIC);
				 _localctx.modAccess = entorno.PUBLIC
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
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
			setState(128);
			((ParametrosContext)_localctx).tiposvars = tiposvars();
			setState(129);
			((ParametrosContext)_localctx).ID = match(ID);

			                                                                    listaIdes := arrayList.New()
			                                                                    listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))
			                                                                    decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
			                                                                    _localctx.lista.Add( decl)
			                                                                 
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
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
					setState(132);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(133);
					match(COMA);
					setState(134);
					((ParametrosContext)_localctx).tiposvars = tiposvars();
					setState(135);
					((ParametrosContext)_localctx).ID = match(ID);

					                                                                              listaIdes := arrayList.New()
					                                                                              listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))

					                                                                              decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
					                                                                              ((ParametrosContext)_localctx).sublista.lista.Add( decl )
					                                                                              _localctx.lista =  ((ParametrosContext)_localctx).sublista.lista

					                                                                           
					}
					} 
				}
				setState(142);
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
			setState(143);
			match(MAIN);
			setState(144);
			match(LP);
			setState(145);
			match(RP);
			setState(146);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(L_LLAVE);
				setState(150);
				((BloqueContext)_localctx).instrucciones = instrucciones();
				setState(151);
				match(R_LLAVE);
				_localctx.lista = ((BloqueContext)_localctx).instrucciones.lista 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(L_LLAVE);
				setState(155);
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
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << IF_TOK) | (1L << LET) | (1L << RETURN_P) | (1L << BREAK_P) | (1L << CONTINUE_P) | (1L << INTTYPE) | (1L << FLOATTYPE) | (1L << STRINGTYPE) | (1L << STRTYPE) | (1L << CHARTYPE) | (1L << VOIDTYPE) | (1L << BOOLTYPE) | (1L << USIZETYPE) | (1L << ID))) != 0) );

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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((InstruccionContext)_localctx).if_instr = if_instr();
				_localctx.instr = ((InstruccionContext)_localctx).if_instr.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((InstruccionContext)_localctx).consola = consola();
				setState(170);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				((InstruccionContext)_localctx).declaracionIni = declaracionIni();
				setState(174);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracionIni.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(178);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				((InstruccionContext)_localctx).llamada = llamada();
				setState(182);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).llamada.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				((InstruccionContext)_localctx).retorno = retorno();
				setState(186);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).retorno.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				((InstruccionContext)_localctx).sentencia_break = sentencia_break();
				setState(190);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_break.instr
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				((InstruccionContext)_localctx).sentencia_continue = sentencia_continue();
				setState(194);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_continue.instr
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				((InstruccionContext)_localctx).dec_arr = dec_arr();
				setState(198);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_arr.instr
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(201);
				((InstruccionContext)_localctx).dec_objeto = dec_objeto();
				setState(202);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_objeto.instr
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(205);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(206);
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
			setState(211);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(212);
			match(IGUAL);
			setState(213);
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
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(IF_TOK);
				setState(217);
				match(LP);
				setState(218);
				((If_instrContext)_localctx).expression = expression();
				setState(219);
				match(RP);
				setState(220);
				((If_instrContext)_localctx).bloque = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bloque.lista,nil,nil)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(IF_TOK);
				setState(224);
				match(LP);
				setState(225);
				((If_instrContext)_localctx).expression = expression();
				setState(226);
				match(RP);
				setState(227);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(228);
				match(ELSE);
				setState(229);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bprincipal.lista,nil,((If_instrContext)_localctx).belse.lista)
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(IF_TOK);
				setState(233);
				match(LP);
				setState(234);
				((If_instrContext)_localctx).expression = expression();
				setState(235);
				match(RP);
				setState(236);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(237);
				((If_instrContext)_localctx).listaelseif = listaelseif();
				setState(238);
				match(ELSE);
				setState(239);
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
			setState(245); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(244);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247); 
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
		public TerminalNode LP() { return getToken(Parser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(Parser.RP, 0); }
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
			setState(251);
			match(ELSE);
			setState(252);
			match(IF_TOK);
			setState(253);
			match(LP);
			setState(254);
			((Else_ifContext)_localctx).expression = expression();
			setState(255);
			match(RP);
			setState(256);
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
		enterRule(_localctx, 26, RULE_consola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PRINTLN);
			setState(260);
			match(LP);
			setState(261);
			((ConsolaContext)_localctx).expression = expression();
			setState(262);
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
		enterRule(_localctx, 28, RULE_llamada);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(266);
				match(LP);
				setState(267);
				match(RP);

				                                                                        _localctx.instr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				                                                                        _localctx.expr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(270);
				match(LP);
				setState(271);
				((LlamadaContext)_localctx).listaExpresiones = listaExpresiones(0);
				setState(272);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_listaExpresiones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			((ListaExpresionesContext)_localctx).expression = expression();

			                                                                        _localctx.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
			                                                                     
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
					setState(281);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(282);
					match(COMA);
					setState(283);
					((ListaExpresionesContext)_localctx).expression = expression();

					                                                                                  ((ListaExpresionesContext)_localctx).LISTA.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
					                                                                                  _localctx.lista =  ((ListaExpresionesContext)_localctx).LISTA.lista
					                                                                               
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 32, RULE_declaracionIni);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(LET);
				setState(292);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(293);
				match(IGUAL);
				setState(294);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(LET);
				setState(298);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(299);
				match(DOSPUNTOS);
				setState(300);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(301);
				match(IGUAL);
				setState(302);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(LET);
				setState(306);
				match(MUT);
				setState(307);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(308);
				match(IGUAL);
				setState(309);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, true, linea, columna)
				                                                                     
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(LET);
				setState(313);
				match(MUT);
				setState(314);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(315);
				match(DOSPUNTOS);
				setState(316);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(317);
				match(IGUAL);
				setState(318);
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
		enterRule(_localctx, 34, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			((DeclaracionContext)_localctx).tiposvars = tiposvars();
			setState(324);
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
		enterRule(_localctx, 36, RULE_retorno);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(RETURN_P);
				 _localctx.instr = SentenciaTransferencia.NewReturn(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(RETURN_P);
				setState(330);
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
		enterRule(_localctx, 38, RULE_sentencia_break);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(BREAK_P);
				 _localctx.instr = SentenciaTransferencia.NewBreak(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(BREAK_P);
				setState(338);
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
		enterRule(_localctx, 40, RULE_sentencia_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_listides, _p);
		  _localctx.lista =  arrayList.New() 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(347);
			((ListidesContext)_localctx).ID = match(ID);
			_localctx.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
					setState(350);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(351);
					match(COMA);
					setState(352);
					((ListidesContext)_localctx).ID = match(ID);

					                                                                              ((ListidesContext)_localctx).sub.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
					                                                                              _localctx.lista = ((ListidesContext)_localctx).sub.lista
					                                                                          
					}
					} 
				}
				setState(358);
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
		enterRule(_localctx, 44, RULE_tiposvars);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(INTTYPE);
				_localctx.tipo = entorno.INTEGER
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(STRINGTYPE);
				_localctx.tipo = entorno.STRING
				}
				break;
			case STRTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(STRTYPE);
				_localctx.tipo = entorno.STRING2
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				match(CHARTYPE);
				_localctx.tipo = entorno.CHAR
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				match(FLOATTYPE);
				_localctx.tipo = entorno.FLOAT
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				match(BOOLTYPE);
				_localctx.tipo = entorno.BOOLEAN
				}
				break;
			case VOIDTYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				match(VOIDTYPE);
				_localctx.tipo = entorno.VOID
				}
				break;
			case USIZETYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(373);
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
		enterRule(_localctx, 46, RULE_dec_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((Dec_arrContext)_localctx).tiposvars = tiposvars();
			setState(378);
			((Dec_arrContext)_localctx).dimensiones = dimensiones(0);
			setState(379);
			((Dec_arrContext)_localctx).ID = match(ID);
			setState(380);
			match(IGUAL);
			setState(381);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_dimensiones, _p);
		 _localctx.tam = 0
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(385);
			dimension();
			_localctx.tam = 1
			}
			_ctx.stop = _input.LT(-1);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
					setState(388);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(389);
					dimension();

					                                                                              _localctx.tam = ((DimensionesContext)_localctx).tamano.tam + 1
					                                                                           
					}
					} 
				}
				setState(396);
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
		enterRule(_localctx, 50, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(L_CORCH);
			setState(398);
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
		enterRule(_localctx, 52, RULE_arraydata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(L_LLAVE);
			setState(401);
			((ArraydataContext)_localctx).listaExpresiones = listaExpresiones(0);
			setState(402);
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
		enterRule(_localctx, 54, RULE_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(NEW_);
			setState(406);
			((InstanciaContext)_localctx).tiposvars = tiposvars();
			setState(407);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listanchos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(411);
			((ListanchosContext)_localctx).ancho = ancho();
			_localctx.lista.Add(((ListanchosContext)_localctx).ancho.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
					setState(414);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(415);
					((ListanchosContext)_localctx).ancho = ancho();

					                                                                                          ((ListanchosContext)_localctx).sublist.lista.Add(((ListanchosContext)_localctx).ancho.expr)
					                                                                                          _localctx.lista = ((ListanchosContext)_localctx).sublist.lista
					                                                                                      
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 58, RULE_ancho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(L_CORCH);
			setState(424);
			((AnchoContext)_localctx).expression = expression();
			setState(425);
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
		enterRule(_localctx, 60, RULE_dec_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			((Dec_objetoContext)_localctx).ID = match(ID);
			setState(429);
			((Dec_objetoContext)_localctx).listides = listides(0);
			setState(430);
			match(IGUAL);
			setState(431);
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
		enterRule(_localctx, 62, RULE_instanciaClase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(NEW_);
			setState(435);
			((InstanciaClaseContext)_localctx).ID = match(ID);
			setState(436);
			match(LP);
			setState(437);
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
		enterRule(_localctx, 64, RULE_accesoarr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			((AccesoarrContext)_localctx).ID = match(ID);
			setState(441);
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
		enterRule(_localctx, 66, RULE_accesoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_listaAccesos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(448);
			((ListaAccesosContext)_localctx).acceso = acceso();
			   _localctx.lista.Add(((ListaAccesosContext)_localctx).acceso.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
					setState(451);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(452);
					match(PUNTO);
					setState(453);
					((ListaAccesosContext)_localctx).acceso = acceso();

					                                                              ((ListaAccesosContext)_localctx).SUBLISTA.lista.Add( ((ListaAccesosContext)_localctx).acceso.expr)
					                                                              _localctx.lista = ((ListaAccesosContext)_localctx).SUBLISTA.lista
					                                                          
					}
					} 
				}
				setState(460);
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
		enterRule(_localctx, 70, RULE_acceso);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((AccesoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((AccesoContext)_localctx).ID!=null?((AccesoContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
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
		public InstanciaContext instancia;
		public ArraydataContext arraydata;
		public Expr_relContext expr_rel() {
			return getRuleContext(Expr_relContext.class,0);
		}
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public InstanciaContext instancia() {
			return getRuleContext(InstanciaContext.class,0);
		}
		public ArraydataContext arraydata() {
			return getRuleContext(ArraydataContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expression);
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				((ExpressionContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_rel.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((ExpressionContext)_localctx).expr_arit = expr_arit(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_arit.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				((ExpressionContext)_localctx).instancia = instancia();
				_localctx.expr = ((ExpressionContext)_localctx).instancia.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				((ExpressionContext)_localctx).arraydata = arraydata();
				_localctx.expr = ((ExpressionContext)_localctx).arraydata.expr
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
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_expr_rel, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483);
			((Expr_relContext)_localctx).expr_arit = expr_arit(0);
			_localctx.expr = ((Expr_relContext)_localctx).expr_arit.expr
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
					setState(486);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(487);
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
					setState(488);
					((Expr_relContext)_localctx).opDe = expr_rel(3);
					_localctx.expr = expresion.NuevaOperacion(((Expr_relContext)_localctx).opIz.expr,(((Expr_relContext)_localctx).op!=null?((Expr_relContext)_localctx).op.getText():null),((Expr_relContext)_localctx).opDe.expr,false)
					}
					} 
				}
				setState(495);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(497);
				match(SUB);
				setState(498);
				((Expr_aritContext)_localctx).opU = ((Expr_aritContext)_localctx).expression = expression();
				_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opU.expr,"-",nil,true)
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
				setState(501);
				((Expr_aritContext)_localctx).expr_valor = expr_valor();
				_localctx.expr = ((Expr_aritContext)_localctx).expr_valor.expr
				}
				break;
			case LP:
				{
				setState(504);
				match(LP);
				setState(505);
				((Expr_aritContext)_localctx).expression = expression();
				setState(506);
				match(RP);
				_localctx.expr = ((Expr_aritContext)_localctx).expression.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(511);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(512);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(513);
						((Expr_aritContext)_localctx).opDe = expr_arit(5);
						_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false)
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(516);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(517);
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
						setState(518);
						((Expr_aritContext)_localctx).opDe = expr_arit(4);
						_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false)
						}
						break;
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 78, RULE_expr_valor);
		try {
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				((Expr_valorContext)_localctx).primitivo = primitivo();
				_localctx.expr = ((Expr_valorContext)_localctx).primitivo.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				((Expr_valorContext)_localctx).llamada = llamada();
				_localctx.expr = ((Expr_valorContext)_localctx).llamada.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				((Expr_valorContext)_localctx).accesoarr = accesoarr();
				_localctx.expr = ((Expr_valorContext)_localctx).accesoarr.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
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
		enterRule(_localctx, 80, RULE_primitivo);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
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
				setState(542);
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
				setState(544);
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
				setState(546);
				((PrimitivoContext)_localctx).STRING = match(STRING);

				                                                                    str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.STRING)
				                                                                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(548);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                                                                    str:= (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.CHAR)
				                                                                
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(550);
				((PrimitivoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null))
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				match(TRUE);
				 _localctx.expr = expresion.NuevoPrimitivo(true,entorno.BOOLEAN) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(554);
				match(FALSE);
				 _localctx.expr = expresion.NuevoPrimitivo(false,entorno.BOOLEAN) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(556);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(557);
				match(PUNTO);
				setState(558);
				match(ABS);
				setState(559);
				match(LP);
				setState(560);
				match(RP);

				        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorAbs((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(562);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(563);
				match(PUNTO);
				setState(564);
				match(SQRT);
				setState(565);
				match(LP);
				setState(566);
				match(RP);

				        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorSqrt((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(568);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(569);
				match(PUNTO);
				setState(570);
				match(TO_STRING);
				setState(571);
				match(LP);
				setState(572);
				match(RP);

				        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorStr((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(574);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(575);
				match(PUNTO);
				setState(576);
				match(CLONE);
				setState(577);
				match(LP);
				setState(578);
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
		case 15:
			return listaExpresiones_sempred((ListaExpresionesContext)_localctx, predIndex);
		case 21:
			return listides_sempred((ListidesContext)_localctx, predIndex);
		case 24:
			return dimensiones_sempred((DimensionesContext)_localctx, predIndex);
		case 28:
			return listanchos_sempred((ListanchosContext)_localctx, predIndex);
		case 34:
			return listaAccesos_sempred((ListaAccesosContext)_localctx, predIndex);
		case 37:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 38:
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
	private boolean listaExpresiones_sempred(ListaExpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listides_sempred(ListidesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dimensiones_sempred(DimensionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listanchos_sempred(ListanchosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaAccesos_sempred(ListaAccesosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_rel_sempred(Expr_relContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0249\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4y\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a0\n\b\3\t\6\t\u00a3\n\t"+
		"\r\t\16\t\u00a4\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d4\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f5"+
		"\n\f\3\r\6\r\u00f8\n\r\r\r\16\r\u00f9\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0116\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0121\n\21\f\21\16\21\u0124\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0144\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0150"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0158\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0165\n\27\f\27\16\27\u0168\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u017a\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u018b\n\32\f\32\16\32\u018e\13"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01a5\n\36\f\36\16\36\u01a8"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u01cb\n$\f$\16$"+
		"\u01ce\13$\3%\3%\3%\3%\3%\5%\u01d5\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\5&\u01e3\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01ee\n\'\f\'"+
		"\16\'\u01f1\13\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0200\n(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u020c\n(\f(\16(\u020f\13(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\5)\u021d\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u0247\n*\3*\2\13\4\n ,\62:FLN+\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\5\4\2++-\60"+
		"\3\2\61\62\3\2\63\64\2\u025d\2T\3\2\2\2\4W\3\2\2\2\6x\3\2\2\2\b\177\3"+
		"\2\2\2\n\u0081\3\2\2\2\f\u0091\3\2\2\2\16\u009f\3\2\2\2\20\u00a2\3\2\2"+
		"\2\22\u00d3\3\2\2\2\24\u00d5\3\2\2\2\26\u00f4\3\2\2\2\30\u00f7\3\2\2\2"+
		"\32\u00fd\3\2\2\2\34\u0105\3\2\2\2\36\u0115\3\2\2\2 \u0117\3\2\2\2\"\u0143"+
		"\3\2\2\2$\u0145\3\2\2\2&\u014f\3\2\2\2(\u0157\3\2\2\2*\u0159\3\2\2\2,"+
		"\u015c\3\2\2\2.\u0179\3\2\2\2\60\u017b\3\2\2\2\62\u0182\3\2\2\2\64\u018f"+
		"\3\2\2\2\66\u0192\3\2\2\28\u0197\3\2\2\2:\u019c\3\2\2\2<\u01a9\3\2\2\2"+
		">\u01ae\3\2\2\2@\u01b4\3\2\2\2B\u01ba\3\2\2\2D\u01be\3\2\2\2F\u01c1\3"+
		"\2\2\2H\u01d4\3\2\2\2J\u01e2\3\2\2\2L\u01e4\3\2\2\2N\u01ff\3\2\2\2P\u021c"+
		"\3\2\2\2R\u0246\3\2\2\2TU\5\4\3\2UV\b\2\1\2V\3\3\2\2\2WX\b\3\1\2XY\5\6"+
		"\4\2YZ\b\3\1\2Za\3\2\2\2[\\\f\4\2\2\\]\5\6\4\2]^\b\3\1\2^`\3\2\2\2_[\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\5\3\2\2\2ca\3\2\2\2de\5\f\7\2ef"+
		"\b\4\1\2fy\3\2\2\2gh\5\b\5\2hi\5.\30\2ij\7<\2\2jk\7\3\2\2kl\7\4\2\2lm"+
		"\5\16\b\2mn\b\4\1\2ny\3\2\2\2op\5\b\5\2pq\5.\30\2qr\7<\2\2rs\7\3\2\2s"+
		"t\5\n\6\2tu\7\4\2\2uv\5\16\b\2vw\b\4\1\2wy\3\2\2\2xd\3\2\2\2xg\3\2\2\2"+
		"xo\3\2\2\2y\7\3\2\2\2z{\7\22\2\2{\u0080\b\5\1\2|}\7\21\2\2}\u0080\b\5"+
		"\1\2~\u0080\b\5\1\2\177z\3\2\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080\t\3\2"+
		"\2\2\u0081\u0082\b\6\1\2\u0082\u0083\5.\30\2\u0083\u0084\7<\2\2\u0084"+
		"\u0085\b\6\1\2\u0085\u008e\3\2\2\2\u0086\u0087\f\4\2\2\u0087\u0088\7$"+
		"\2\2\u0088\u0089\5.\30\2\u0089\u008a\7<\2\2\u008a\u008b\b\6\1\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0086\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\13\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092"+
		"\7\20\2\2\u0092\u0093\7\3\2\2\u0093\u0094\7\4\2\2\u0094\u0095\5\16\b\2"+
		"\u0095\u0096\b\7\1\2\u0096\r\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5"+
		"\20\t\2\u0099\u009a\7\6\2\2\u009a\u009b\b\b\1\2\u009b\u00a0\3\2\2\2\u009c"+
		"\u009d\7\5\2\2\u009d\u009e\7\6\2\2\u009e\u00a0\b\b\1\2\u009f\u0097\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a3\5\22\n\2\u00a2\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\b\t\1\2\u00a7\21\3\2\2\2\u00a8\u00a9\5\26\f"+
		"\2\u00a9\u00aa\b\n\1\2\u00aa\u00d4\3\2\2\2\u00ab\u00ac\5\34\17\2\u00ac"+
		"\u00ad\7%\2\2\u00ad\u00ae\b\n\1\2\u00ae\u00d4\3\2\2\2\u00af\u00b0\5\""+
		"\22\2\u00b0\u00b1\7%\2\2\u00b1\u00b2\b\n\1\2\u00b2\u00d4\3\2\2\2\u00b3"+
		"\u00b4\5$\23\2\u00b4\u00b5\7%\2\2\u00b5\u00b6\b\n\1\2\u00b6\u00d4\3\2"+
		"\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\7%\2\2\u00b9\u00ba\b\n\1\2\u00ba"+
		"\u00d4\3\2\2\2\u00bb\u00bc\5&\24\2\u00bc\u00bd\7%\2\2\u00bd\u00be\b\n"+
		"\1\2\u00be\u00d4\3\2\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\7%\2\2\u00c1"+
		"\u00c2\b\n\1\2\u00c2\u00d4\3\2\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7%"+
		"\2\2\u00c5\u00c6\b\n\1\2\u00c6\u00d4\3\2\2\2\u00c7\u00c8\5\60\31\2\u00c8"+
		"\u00c9\7%\2\2\u00c9\u00ca\b\n\1\2\u00ca\u00d4\3\2\2\2\u00cb\u00cc\5> "+
		"\2\u00cc\u00cd\7%\2\2\u00cd\u00ce\b\n\1\2\u00ce\u00d4\3\2\2\2\u00cf\u00d0"+
		"\5\24\13\2\u00d0\u00d1\7%\2\2\u00d1\u00d2\b\n\1\2\u00d2\u00d4\3\2\2\2"+
		"\u00d3\u00a8\3\2\2\2\u00d3\u00ab\3\2\2\2\u00d3\u00af\3\2\2\2\u00d3\u00b3"+
		"\3\2\2\2\u00d3\u00b7\3\2\2\2\u00d3\u00bb\3\2\2\2\u00d3\u00bf\3\2\2\2\u00d3"+
		"\u00c3\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cf\3\2"+
		"\2\2\u00d4\23\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8"+
		"\5J&\2\u00d8\u00d9\b\13\1\2\u00d9\25\3\2\2\2\u00da\u00db\7\n\2\2\u00db"+
		"\u00dc\7\3\2\2\u00dc\u00dd\5J&\2\u00dd\u00de\7\4\2\2\u00de\u00df\5\16"+
		"\b\2\u00df\u00e0\b\f\1\2\u00e0\u00f5\3\2\2\2\u00e1\u00e2\7\n\2\2\u00e2"+
		"\u00e3\7\3\2\2\u00e3\u00e4\5J&\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5\16"+
		"\b\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5\16\b\2\u00e8\u00e9\b\f\1\2\u00e9"+
		"\u00f5\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed\5J"+
		"&\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\5\30\r\2\u00f0"+
		"\u00f1\7\13\2\2\u00f1\u00f2\5\16\b\2\u00f2\u00f3\b\f\1\2\u00f3\u00f5\3"+
		"\2\2\2\u00f4\u00da\3\2\2\2\u00f4\u00e1\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5"+
		"\27\3\2\2\2\u00f6\u00f8\5\32\16\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b\r\1\2\u00fc\31\3\2\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\7\n\2"+
		"\2\u00ff\u0100\7\3\2\2\u0100\u0101\5J&\2\u0101\u0102\7\4\2\2\u0102\u0103"+
		"\5\16\b\2\u0103\u0104\b\16\1\2\u0104\33\3\2\2\2\u0105\u0106\7\t\2\2\u0106"+
		"\u0107\7\3\2\2\u0107\u0108\5J&\2\u0108\u0109\7\4\2\2\u0109\u010a\b\17"+
		"\1\2\u010a\35\3\2\2\2\u010b\u010c\7<\2\2\u010c\u010d\7\3\2\2\u010d\u010e"+
		"\7\4\2\2\u010e\u0116\b\20\1\2\u010f\u0110\7<\2\2\u0110\u0111\7\3\2\2\u0111"+
		"\u0112\5 \21\2\u0112\u0113\7\4\2\2\u0113\u0114\b\20\1\2\u0114\u0116\3"+
		"\2\2\2\u0115\u010b\3\2\2\2\u0115\u010f\3\2\2\2\u0116\37\3\2\2\2\u0117"+
		"\u0118\b\21\1\2\u0118\u0119\5J&\2\u0119\u011a\b\21\1\2\u011a\u0122\3\2"+
		"\2\2\u011b\u011c\f\4\2\2\u011c\u011d\7$\2\2\u011d\u011e\5J&\2\u011e\u011f"+
		"\b\21\1\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123!\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0125\u0126\7\r\2\2\u0126\u0127\5,\27\2\u0127\u0128\7*\2\2\u0128"+
		"\u0129\5J&\2\u0129\u012a\b\22\1\2\u012a\u0144\3\2\2\2\u012b\u012c\7\r"+
		"\2\2\u012c\u012d\5,\27\2\u012d\u012e\7&\2\2\u012e\u012f\5.\30\2\u012f"+
		"\u0130\7*\2\2\u0130\u0131\5J&\2\u0131\u0132\b\22\1\2\u0132\u0144\3\2\2"+
		"\2\u0133\u0134\7\r\2\2\u0134\u0135\7\f\2\2\u0135\u0136\5,\27\2\u0136\u0137"+
		"\7*\2\2\u0137\u0138\5J&\2\u0138\u0139\b\22\1\2\u0139\u0144\3\2\2\2\u013a"+
		"\u013b\7\r\2\2\u013b\u013c\7\f\2\2\u013c\u013d\5,\27\2\u013d\u013e\7&"+
		"\2\2\u013e\u013f\5.\30\2\u013f\u0140\7*\2\2\u0140\u0141\5J&\2\u0141\u0142"+
		"\b\22\1\2\u0142\u0144\3\2\2\2\u0143\u0125\3\2\2\2\u0143\u012b\3\2\2\2"+
		"\u0143\u0133\3\2\2\2\u0143\u013a\3\2\2\2\u0144#\3\2\2\2\u0145\u0146\5"+
		".\30\2\u0146\u0147\5,\27\2\u0147\u0148\b\23\1\2\u0148%\3\2\2\2\u0149\u014a"+
		"\7\24\2\2\u014a\u0150\b\24\1\2\u014b\u014c\7\24\2\2\u014c\u014d\5J&\2"+
		"\u014d\u014e\b\24\1\2\u014e\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014b"+
		"\3\2\2\2\u0150\'\3\2\2\2\u0151\u0152\7\25\2\2\u0152\u0158\b\25\1\2\u0153"+
		"\u0154\7\25\2\2\u0154\u0155\5J&\2\u0155\u0156\b\25\1\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0151\3\2\2\2\u0157\u0153\3\2\2\2\u0158)\3\2\2\2\u0159\u015a"+
		"\7\26\2\2\u015a\u015b\b\26\1\2\u015b+\3\2\2\2\u015c\u015d\b\27\1\2\u015d"+
		"\u015e\7<\2\2\u015e\u015f\b\27\1\2\u015f\u0166\3\2\2\2\u0160\u0161\f\4"+
		"\2\2\u0161\u0162\7$\2\2\u0162\u0163\7<\2\2\u0163\u0165\b\27\1\2\u0164"+
		"\u0160\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167-\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\33\2\2\u016a\u017a"+
		"\b\30\1\2\u016b\u016c\7\35\2\2\u016c\u017a\b\30\1\2\u016d\u016e\7\36\2"+
		"\2\u016e\u017a\b\30\1\2\u016f\u0170\7\37\2\2\u0170\u017a\b\30\1\2\u0171"+
		"\u0172\7\34\2\2\u0172\u017a\b\30\1\2\u0173\u0174\7!\2\2\u0174\u017a\b"+
		"\30\1\2\u0175\u0176\7 \2\2\u0176\u017a\b\30\1\2\u0177\u0178\7\"\2\2\u0178"+
		"\u017a\b\30\1\2\u0179\u0169\3\2\2\2\u0179\u016b\3\2\2\2\u0179\u016d\3"+
		"\2\2\2\u0179\u016f\3\2\2\2\u0179\u0171\3\2\2\2\u0179\u0173\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u0179\u0177\3\2\2\2\u017a/\3\2\2\2\u017b\u017c\5.\30\2"+
		"\u017c\u017d\5\62\32\2\u017d\u017e\7<\2\2\u017e\u017f\7*\2\2\u017f\u0180"+
		"\5J&\2\u0180\u0181\b\31\1\2\u0181\61\3\2\2\2\u0182\u0183\b\32\1\2\u0183"+
		"\u0184\5\64\33\2\u0184\u0185\b\32\1\2\u0185\u018c\3\2\2\2\u0186\u0187"+
		"\f\4\2\2\u0187\u0188\5\64\33\2\u0188\u0189\b\32\1\2\u0189\u018b\3\2\2"+
		"\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\63\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7\7\2\2\u0190"+
		"\u0191\7\b\2\2\u0191\65\3\2\2\2\u0192\u0193\7\5\2\2\u0193\u0194\5 \21"+
		"\2\u0194\u0195\7\6\2\2\u0195\u0196\b\34\1\2\u0196\67\3\2\2\2\u0197\u0198"+
		"\7\17\2\2\u0198\u0199\5.\30\2\u0199\u019a\5:\36\2\u019a\u019b\b\35\1\2"+
		"\u019b9\3\2\2\2\u019c\u019d\b\36\1\2\u019d\u019e\5<\37\2\u019e\u019f\b"+
		"\36\1\2\u019f\u01a6\3\2\2\2\u01a0\u01a1\f\4\2\2\u01a1\u01a2\5<\37\2\u01a2"+
		"\u01a3\b\36\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a8\3"+
		"\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7;\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a9\u01aa\7\7\2\2\u01aa\u01ab\5J&\2\u01ab\u01ac\7\b\2\2\u01ac"+
		"\u01ad\b\37\1\2\u01ad=\3\2\2\2\u01ae\u01af\7<\2\2\u01af\u01b0\5,\27\2"+
		"\u01b0\u01b1\7*\2\2\u01b1\u01b2\5J&\2\u01b2\u01b3\b \1\2\u01b3?\3\2\2"+
		"\2\u01b4\u01b5\7\17\2\2\u01b5\u01b6\7<\2\2\u01b6\u01b7\7\3\2\2\u01b7\u01b8"+
		"\7\4\2\2\u01b8\u01b9\b!\1\2\u01b9A\3\2\2\2\u01ba\u01bb\7<\2\2\u01bb\u01bc"+
		"\5:\36\2\u01bc\u01bd\b\"\1\2\u01bdC\3\2\2\2\u01be\u01bf\5F$\2\u01bf\u01c0"+
		"\b#\1\2\u01c0E\3\2\2\2\u01c1\u01c2\b$\1\2\u01c2\u01c3\5H%\2\u01c3\u01c4"+
		"\b$\1\2\u01c4\u01cc\3\2\2\2\u01c5\u01c6\f\4\2\2\u01c6\u01c7\7#\2\2\u01c7"+
		"\u01c8\5H%\2\u01c8\u01c9\b$\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01c5\3\2\2"+
		"\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdG"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7<\2\2\u01d0\u01d5\b%\1\2\u01d1"+
		"\u01d2\5B\"\2\u01d2\u01d3\b%\1\2\u01d3\u01d5\3\2\2\2\u01d4\u01cf\3\2\2"+
		"\2\u01d4\u01d1\3\2\2\2\u01d5I\3\2\2\2\u01d6\u01d7\5L\'\2\u01d7\u01d8\b"+
		"&\1\2\u01d8\u01e3\3\2\2\2\u01d9\u01da\5N(\2\u01da\u01db\b&\1\2\u01db\u01e3"+
		"\3\2\2\2\u01dc\u01dd\58\35\2\u01dd\u01de\b&\1\2\u01de\u01e3\3\2\2\2\u01df"+
		"\u01e0\5\66\34\2\u01e0\u01e1\b&\1\2\u01e1\u01e3\3\2\2\2\u01e2\u01d6\3"+
		"\2\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01dc\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3"+
		"K\3\2\2\2\u01e4\u01e5\b\'\1\2\u01e5\u01e6\5N(\2\u01e6\u01e7\b\'\1\2\u01e7"+
		"\u01ef\3\2\2\2\u01e8\u01e9\f\4\2\2\u01e9\u01ea\t\2\2\2\u01ea\u01eb\5L"+
		"\'\5\u01eb\u01ec\b\'\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0M\3\2\2\2"+
		"\u01f1\u01ef\3\2\2\2\u01f2\u01f3\b(\1\2\u01f3\u01f4\7\64\2\2\u01f4\u01f5"+
		"\5J&\2\u01f5\u01f6\b(\1\2\u01f6\u0200\3\2\2\2\u01f7\u01f8\5P)\2\u01f8"+
		"\u01f9\b(\1\2\u01f9\u0200\3\2\2\2\u01fa\u01fb\7\3\2\2\u01fb\u01fc\5J&"+
		"\2\u01fc\u01fd\7\4\2\2\u01fd\u01fe\b(\1\2\u01fe\u0200\3\2\2\2\u01ff\u01f2"+
		"\3\2\2\2\u01ff\u01f7\3\2\2\2\u01ff\u01fa\3\2\2\2\u0200\u020d\3\2\2\2\u0201"+
		"\u0202\f\6\2\2\u0202\u0203\t\3\2\2\u0203\u0204\5N(\7\u0204\u0205\b(\1"+
		"\2\u0205\u020c\3\2\2\2\u0206\u0207\f\5\2\2\u0207\u0208\t\4\2\2\u0208\u0209"+
		"\5N(\6\u0209\u020a\b(\1\2\u020a\u020c\3\2\2\2\u020b\u0201\3\2\2\2\u020b"+
		"\u0206\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020eO\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5R*\2\u0211\u0212"+
		"\b)\1\2\u0212\u021d\3\2\2\2\u0213\u0214\5\36\20\2\u0214\u0215\b)\1\2\u0215"+
		"\u021d\3\2\2\2\u0216\u0217\5B\"\2\u0217\u0218\b)\1\2\u0218\u021d\3\2\2"+
		"\2\u0219\u021a\5D#\2\u021a\u021b\b)\1\2\u021b\u021d\3\2\2\2\u021c\u0210"+
		"\3\2\2\2\u021c\u0213\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0219\3\2\2\2\u021d"+
		"Q\3\2\2\2\u021e\u021f\7\65\2\2\u021f\u0247\b*\1\2\u0220\u0221\7\66\2\2"+
		"\u0221\u0247\b*\1\2\u0222\u0223\7\67\2\2\u0223\u0247\b*\1\2\u0224\u0225"+
		"\78\2\2\u0225\u0247\b*\1\2\u0226\u0227\79\2\2\u0227\u0247\b*\1\2\u0228"+
		"\u0229\7<\2\2\u0229\u0247\b*\1\2\u022a\u022b\7:\2\2\u022b\u0247\b*\1\2"+
		"\u022c\u022d\7;\2\2\u022d\u0247\b*\1\2\u022e\u022f\7<\2\2\u022f\u0230"+
		"\7#\2\2\u0230\u0231\7\27\2\2\u0231\u0232\7\3\2\2\u0232\u0233\7\4\2\2\u0233"+
		"\u0247\b*\1\2\u0234\u0235\7<\2\2\u0235\u0236\7#\2\2\u0236\u0237\7\30\2"+
		"\2\u0237\u0238\7\3\2\2\u0238\u0239\7\4\2\2\u0239\u0247\b*\1\2\u023a\u023b"+
		"\7<\2\2\u023b\u023c\7#\2\2\u023c\u023d\7\31\2\2\u023d\u023e\7\3\2\2\u023e"+
		"\u023f\7\4\2\2\u023f\u0247\b*\1\2\u0240\u0241\7<\2\2\u0241\u0242\7#\2"+
		"\2\u0242\u0243\7\32\2\2\u0243\u0244\7\3\2\2\u0244\u0245\7\4\2\2\u0245"+
		"\u0247\b*\1\2\u0246\u021e\3\2\2\2\u0246\u0220\3\2\2\2\u0246\u0222\3\2"+
		"\2\2\u0246\u0224\3\2\2\2\u0246\u0226\3\2\2\2\u0246\u0228\3\2\2\2\u0246"+
		"\u022a\3\2\2\2\u0246\u022c\3\2\2\2\u0246\u022e\3\2\2\2\u0246\u0234\3\2"+
		"\2\2\u0246\u023a\3\2\2\2\u0246\u0240\3\2\2\2\u0247S\3\2\2\2\35ax\177\u008e"+
		"\u009f\u00a4\u00d3\u00f4\u00f9\u0115\u0122\u0143\u014f\u0157\u0166\u0179"+
		"\u018c\u01a6\u01cc\u01d4\u01e2\u01ef\u01ff\u020b\u020d\u021c\u0246";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
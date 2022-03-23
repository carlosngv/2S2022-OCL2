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
		LOOP=15, FOR=16, IN=17, MUT=18, FN=19, LET=20, CLASS=21, NEW_=22, MAIN=23, 
		PRIVATE=24, PUB=25, STATIC=26, RETURN_P=27, BREAK_P=28, CONTINUE_P=29, 
		ABS=30, SQRT=31, TO_STRING=32, CLONE=33, POW=34, POWF=35, INTTYPE=36, 
		FLOATTYPE=37, STRINGTYPE=38, STRTYPE=39, CHARTYPE=40, VOIDTYPE=41, BOOLTYPE=42, 
		USIZETYPE=43, PUNTO=44, COMA=45, PTCOMA=46, DOSPUNTOS=47, AND=48, OR_CASE=49, 
		OR=50, NOT=51, IGUAL=52, IGUAL_IGUAL=53, DIFERENTE=54, MAYORIGUAL=55, 
		MENORIGUAL=56, MAYOR=57, MENOR=58, MUL=59, DIV=60, ADD=61, SUB=62, MOD=63, 
		NUMBER=64, USIZE=65, FLOAT=66, STRING=67, CHAR=68, TRUE=69, FALSE=70, 
		ID=71, WHITESPACE=72;
	public static final int
		RULE_start = 0, RULE_listaFunciones = 1, RULE_funcionItem = 2, RULE_modaccess = 3, 
		RULE_parametros = 4, RULE_funcmain = 5, RULE_bloque = 6, RULE_instrucciones = 7, 
		RULE_instruccion = 8, RULE_asignacion = 9, RULE_if_instr = 10, RULE_listaelseif = 11, 
		RULE_else_if = 12, RULE_match_instr = 13, RULE_bloque_match = 14, RULE_listacase = 15, 
		RULE_match_case = 16, RULE_listaexpre_case = 17, RULE_while_instr = 18, 
		RULE_loop_instr = 19, RULE_consola = 20, RULE_llamada = 21, RULE_listaExpresiones = 22, 
		RULE_declaracionIni = 23, RULE_declaracion = 24, RULE_retorno = 25, RULE_sentencia_break = 26, 
		RULE_sentencia_continue = 27, RULE_listides = 28, RULE_tiposvars = 29, 
		RULE_dec_arr = 30, RULE_dimensiones = 31, RULE_dimension = 32, RULE_arraydata = 33, 
		RULE_instancia = 34, RULE_listanchos = 35, RULE_ancho = 36, RULE_dec_objeto = 37, 
		RULE_instanciaClase = 38, RULE_accesoarr = 39, RULE_accesoObjeto = 40, 
		RULE_listaAccesos = 41, RULE_acceso = 42, RULE_expression = 43, RULE_expr_rel = 44, 
		RULE_expr_log = 45, RULE_expr_arit = 46, RULE_expr_valor = 47, RULE_primitivo = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaFunciones", "funcionItem", "modaccess", "parametros", 
			"funcmain", "bloque", "instrucciones", "instruccion", "asignacion", "if_instr", 
			"listaelseif", "else_if", "match_instr", "bloque_match", "listacase", 
			"match_case", "listaexpre_case", "while_instr", "loop_instr", "consola", 
			"llamada", "listaExpresiones", "declaracionIni", "declaracion", "retorno", 
			"sentencia_break", "sentencia_continue", "listides", "tiposvars", "dec_arr", 
			"dimensiones", "dimension", "arraydata", "instancia", "listanchos", "ancho", 
			"dec_objeto", "instanciaClase", "accesoarr", "accesoObjeto", "listaAccesos", 
			"acceso", "expression", "expr_rel", "expr_log", "expr_arit", "expr_valor", 
			"primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'_'", "'println!'", 
			"'vec!'", "'Vec'", "'if'", "'else'", "'match'", "'while'", "'loop'", 
			"'for'", "'in'", "'mut'", "'fn'", "'let'", "'class'", "'new'", "'main'", 
			"'private'", "'pub'", "'static'", "'return'", "'break'", "'continue'", 
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
			"FOR", "IN", "MUT", "FN", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", 
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
			setState(98);
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
			setState(102);
			((ListaFuncionesContext)_localctx).funcionItem = funcionItem();
			 _localctx.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
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
					setState(105);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(106);
					((ListaFuncionesContext)_localctx).funcionItem = funcionItem();

					                                                          ((ListaFuncionesContext)_localctx).SUBLISTA.lista.Add( ((ListaFuncionesContext)_localctx).funcionItem.instr)
					                                                          _localctx.lista =  ((ListaFuncionesContext)_localctx).SUBLISTA.lista
					              
					}
					} 
				}
				setState(113);
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
		public ModaccessContext modaccess;
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
		enterRule(_localctx, 4, RULE_funcionItem);
		 listaParams :=  arrayList.New() 
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((FuncionItemContext)_localctx).funcmain = funcmain();
				 _localctx.instr =  ((FuncionItemContext)_localctx).funcmain.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((FuncionItemContext)_localctx).modaccess = modaccess();
				setState(118);
				match(FN);
				setState(119);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(120);
				match(LP);
				setState(121);
				match(RP);
				setState(122);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID, ((FuncionItemContext)_localctx).modaccess.modAccess)
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				((FuncionItemContext)_localctx).modaccess = modaccess();
				setState(126);
				match(FN);
				setState(127);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(128);
				match(LP);
				setState(129);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(130);
				match(RP);
				setState(131);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),((FuncionItemContext)_localctx).parametros.lista,((FuncionItemContext)_localctx).bloque.lista,entorno.VOID, ((FuncionItemContext)_localctx).modaccess.modAccess)
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				((FuncionItemContext)_localctx).modaccess = modaccess();
				setState(135);
				match(FN);
				setState(136);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(137);
				match(LP);
				setState(138);
				match(RP);
				setState(139);
				match(SUB);
				setState(140);
				match(MAYOR);
				setState(141);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(142);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),listaParams,((FuncionItemContext)_localctx).bloque.lista,((FuncionItemContext)_localctx).tiposvars.tipo, ((FuncionItemContext)_localctx).modaccess.modAccess)
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				((FuncionItemContext)_localctx).modaccess = modaccess();
				setState(146);
				match(FN);
				setState(147);
				((FuncionItemContext)_localctx).ID = match(ID);
				setState(148);
				match(LP);
				setState(149);
				((FuncionItemContext)_localctx).parametros = parametros(0);
				setState(150);
				match(RP);
				setState(151);
				match(SUB);
				setState(152);
				match(MAYOR);
				setState(153);
				((FuncionItemContext)_localctx).tiposvars = tiposvars();
				setState(154);
				((FuncionItemContext)_localctx).bloque = bloque();
				 _localctx.instr = Simbolos.NuevoFuncion((((FuncionItemContext)_localctx).ID!=null?((FuncionItemContext)_localctx).ID.getText():null),((FuncionItemContext)_localctx).parametros.lista,((FuncionItemContext)_localctx).bloque.lista,((FuncionItemContext)_localctx).tiposvars.tipo, ((FuncionItemContext)_localctx).modaccess.modAccess)
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
		enterRule(_localctx, 6, RULE_modaccess);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
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
			setState(165);
			((ParametrosContext)_localctx).tiposvars = tiposvars();
			setState(166);
			((ParametrosContext)_localctx).ID = match(ID);

			                                                                    listaIdes := arrayList.New()
			                                                                    listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))
			                                                                    decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
			                                                                    _localctx.lista.Add( decl)
			                                                                 
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
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
					setState(169);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(170);
					match(COMA);
					setState(171);
					((ParametrosContext)_localctx).tiposvars = tiposvars();
					setState(172);
					((ParametrosContext)_localctx).ID = match(ID);

					                                                                              listaIdes := arrayList.New()
					                                                                              listaIdes.Add(expresion.NuevoIdentificador((((ParametrosContext)_localctx).ID!=null?((ParametrosContext)_localctx).ID.getText():null)))

					                                                                              decl := instrucciones.NuevaDeclaracion(listaIdes, ((ParametrosContext)_localctx).tiposvars.tipo)
					                                                                              ((ParametrosContext)_localctx).sublista.lista.Add( decl )
					                                                                              _localctx.lista =  ((ParametrosContext)_localctx).sublista.lista

					                                                                           
					}
					} 
				}
				setState(179);
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
		enterRule(_localctx, 10, RULE_funcmain);
		 listaParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FN);
			setState(181);
			match(MAIN);
			setState(182);
			match(LP);
			setState(183);
			match(RP);
			setState(184);
			((FuncmainContext)_localctx).bloque = bloque();
			 _localctx.instr = Simbolos.NuevoFuncion("main",listaParams,((FuncmainContext)_localctx).bloque.lista,entorno.VOID, entorno.PRIVATE)
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(L_LLAVE);
				setState(188);
				((BloqueContext)_localctx).instrucciones = instrucciones();
				setState(189);
				match(R_LLAVE);
				_localctx.lista = ((BloqueContext)_localctx).instrucciones.lista 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(L_LLAVE);
				setState(193);
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
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (PRINTLN - 8)) | (1L << (IF_TOK - 8)) | (1L << (MATCH - 8)) | (1L << (WHILE - 8)) | (1L << (LOOP - 8)) | (1L << (LET - 8)) | (1L << (RETURN_P - 8)) | (1L << (BREAK_P - 8)) | (1L << (CONTINUE_P - 8)) | (1L << (INTTYPE - 8)) | (1L << (FLOATTYPE - 8)) | (1L << (STRINGTYPE - 8)) | (1L << (STRTYPE - 8)) | (1L << (CHARTYPE - 8)) | (1L << (VOIDTYPE - 8)) | (1L << (BOOLTYPE - 8)) | (1L << (USIZETYPE - 8)) | (1L << (ID - 8)))) != 0) );

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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				((InstruccionContext)_localctx).asignacion = asignacion();
				setState(205);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((InstruccionContext)_localctx).sentencia_break = sentencia_break();
				setState(209);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_break.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				((InstruccionContext)_localctx).match_instr = match_instr();
				_localctx.instr = ((InstruccionContext)_localctx).match_instr.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				((InstruccionContext)_localctx).consola = consola();
				setState(216);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				((InstruccionContext)_localctx).consola = consola();
				_localctx.instr = ((InstruccionContext)_localctx).consola.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				((InstruccionContext)_localctx).while_instr = while_instr();
				_localctx.instr = ((InstruccionContext)_localctx).while_instr.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				((InstruccionContext)_localctx).loop_instr = loop_instr();
				_localctx.instr = ((InstruccionContext)_localctx).loop_instr.instr
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(228);
				((InstruccionContext)_localctx).if_instr = if_instr();
				_localctx.instr = ((InstruccionContext)_localctx).if_instr.instr
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(231);
				((InstruccionContext)_localctx).declaracionIni = declaracionIni();
				setState(232);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracionIni.instr
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(235);
				((InstruccionContext)_localctx).declaracion = declaracion();
				setState(236);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(239);
				((InstruccionContext)_localctx).llamada = llamada();
				setState(240);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).llamada.instr
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(243);
				((InstruccionContext)_localctx).retorno = retorno();
				setState(244);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).retorno.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(247);
				((InstruccionContext)_localctx).sentencia_continue = sentencia_continue();
				setState(248);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).sentencia_continue.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(251);
				((InstruccionContext)_localctx).dec_arr = dec_arr();
				setState(252);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_arr.instr
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(255);
				((InstruccionContext)_localctx).dec_objeto = dec_objeto();
				setState(256);
				match(PTCOMA);
				_localctx.instr = ((InstruccionContext)_localctx).dec_objeto.instr
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
			setState(261);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(262);
			match(IGUAL);
			setState(263);
			((AsignacionContext)_localctx).expression = expression();
			_localctx.instr = asignacion.NuevaAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expression.expr, 0,0 )
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(IF_TOK);
				setState(267);
				((If_instrContext)_localctx).expression = expression();
				setState(268);
				((If_instrContext)_localctx).bloque = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bloque.lista,nil,nil)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(IF_TOK);
				setState(272);
				((If_instrContext)_localctx).expression = expression();
				setState(273);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(274);
				match(ELSE);
				setState(275);
				((If_instrContext)_localctx).belse = bloque();

				        _localctx.instr = SentenciasControl.NewIfInstruccion(((If_instrContext)_localctx).expression.expr,((If_instrContext)_localctx).bprincipal.lista,nil,((If_instrContext)_localctx).belse.lista)
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(IF_TOK);
				setState(279);
				((If_instrContext)_localctx).expression = expression();
				setState(280);
				((If_instrContext)_localctx).bprincipal = bloque();
				setState(281);
				((If_instrContext)_localctx).listaelseif = listaelseif();
				setState(282);
				match(ELSE);
				setState(283);
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
			setState(289); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(288);
					((ListaelseifContext)_localctx).else_if = else_if();
					((ListaelseifContext)_localctx).list.add(((ListaelseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
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
			setState(295);
			match(ELSE);
			setState(296);
			match(IF_TOK);
			setState(297);
			((Else_ifContext)_localctx).expression = expression();
			setState(298);
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
			setState(301);
			match(MATCH);
			setState(302);
			((Match_instrContext)_localctx).expression = expression();
			setState(303);
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
			setState(306);
			match(L_LLAVE);
			setState(307);
			((Bloque_matchContext)_localctx).listacase = listacase();
			setState(308);
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
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				((ListacaseContext)_localctx).match_case = match_case();
				((ListacaseContext)_localctx).list.add(((ListacaseContext)_localctx).match_case);
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << L_LLAVE) | (1L << GUION_BAJO) | (1L << VEC_VACIO) | (1L << NEW_) | (1L << INTTYPE) | (1L << FLOATTYPE) | (1L << STRINGTYPE) | (1L << STRTYPE) | (1L << CHARTYPE) | (1L << VOIDTYPE) | (1L << BOOLTYPE) | (1L << USIZETYPE) | (1L << NOT) | (1L << SUB))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NUMBER - 64)) | (1L << (USIZE - 64)) | (1L << (FLOAT - 64)) | (1L << (STRING - 64)) | (1L << (CHAR - 64)) | (1L << (TRUE - 64)) | (1L << (FALSE - 64)) | (1L << (ID - 64)))) != 0) );

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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(319);
				match(IGUAL);
				setState(320);
				match(MAYOR);
				setState(321);
				((Match_caseContext)_localctx).instruccion = instruccion();
				setState(322);
				match(COMA);

				        listaInstr := arrayList.New()
				        listaInstr.Add(((Match_caseContext)_localctx).instruccion.instr)
				        _localctx.matchCase = SentenciasControl.NewMatchCase(((Match_caseContext)_localctx).listaexpre_case.lista, listaInstr)
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				((Match_caseContext)_localctx).listaexpre_case = listaexpre_case(0);
				setState(326);
				match(IGUAL);
				setState(327);
				match(MAYOR);
				setState(328);
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
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
			case L_LLAVE:
			case VEC_VACIO:
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
				setState(334);
				((Listaexpre_caseContext)_localctx).expression = expression();

				        _localctx.lista.Add( ((Listaexpre_caseContext)_localctx).expression.expr )
				        
				}
				break;
			case GUION_BAJO:
				{
				setState(337);
				match(GUION_BAJO);

				    _localctx.lista.Add("_")

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
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
					setState(341);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(342);
					match(OR_CASE);
					setState(343);
					((Listaexpre_caseContext)_localctx).expression = expression();

					                                                              ((Listaexpre_caseContext)_localctx).LISTA.lista.Add( ((Listaexpre_caseContext)_localctx).expression.expr )
					                                                              _localctx.lista =  ((Listaexpre_caseContext)_localctx).LISTA.lista
					                                                          
					}
					} 
				}
				setState(350);
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

	public static class While_instrContext extends ParserRuleContext {
		public interfaces.Instruccion instr;
		public ExpressionContext expression;
		public BloqueContext bloque;
		public TerminalNode WHILE() { return getToken(Parser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 36, RULE_while_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(WHILE);
			setState(352);
			((While_instrContext)_localctx).expression = expression();
			setState(353);
			((While_instrContext)_localctx).bloque = bloque();

			            _localctx.instr = SentenciasCiclicas.NewWhileInstruccion(((While_instrContext)_localctx).expression.expr,((While_instrContext)_localctx).bloque.lista)
			        
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
		enterRule(_localctx, 38, RULE_loop_instr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LOOP);
			setState(357);
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
		enterRule(_localctx, 40, RULE_consola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(PRINTLN);
			setState(361);
			match(LP);
			setState(362);
			((ConsolaContext)_localctx).expression = expression();
			setState(363);
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
		enterRule(_localctx, 42, RULE_llamada);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(367);
				match(LP);
				setState(368);
				match(RP);

				                                                                        _localctx.instr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				                                                                        _localctx.expr = expresion2.NuevaLlamada((((LlamadaContext)_localctx).ID!=null?((LlamadaContext)_localctx).ID.getText():null), arrayList.New())
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				((LlamadaContext)_localctx).ID = match(ID);
				setState(371);
				match(LP);
				setState(372);
				((LlamadaContext)_localctx).listaExpresiones = listaExpresiones(0);
				setState(373);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listaExpresiones, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(379);
			((ListaExpresionesContext)_localctx).expression = expression();

			                                                                        _localctx.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
			                                                                     
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
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
					setState(382);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(383);
					match(COMA);
					setState(384);
					((ListaExpresionesContext)_localctx).expression = expression();

					                                                                                  ((ListaExpresionesContext)_localctx).LISTA.lista.Add( ((ListaExpresionesContext)_localctx).expression.expr )
					                                                                                  _localctx.lista =  ((ListaExpresionesContext)_localctx).LISTA.lista
					                                                                               
					}
					} 
				}
				setState(391);
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
		public Token ID;
		public ListaExpresionesContext listaExpresiones;
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
		public TerminalNode ID() { return getToken(Parser.ID, 0); }
		public TerminalNode VEC_VACIO() { return getToken(Parser.VEC_VACIO, 0); }
		public TerminalNode MENOR() { return getToken(Parser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(Parser.MAYOR, 0); }
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public DeclaracionIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionIni; }
	}

	public final DeclaracionIniContext declaracionIni() throws RecognitionException {
		DeclaracionIniContext _localctx = new DeclaracionIniContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracionIni);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(LET);
				setState(393);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(394);
				match(IGUAL);
				setState(395);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(LET);
				setState(399);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(400);
				match(DOSPUNTOS);
				setState(401);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(402);
				match(IGUAL);
				setState(403);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expression.expr, false, linea, columna)
				                                                                     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				match(LET);
				setState(407);
				match(MUT);
				setState(408);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(409);
				match(IGUAL);
				setState(410);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista, entorno.NULL,((DeclaracionIniContext)_localctx).expression.expr, true, linea, columna)
				                                                                     
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				match(LET);
				setState(414);
				match(MUT);
				setState(415);
				((DeclaracionIniContext)_localctx).listides = listides(0);
				setState(416);
				match(DOSPUNTOS);
				setState(417);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(418);
				match(IGUAL);
				setState(419);
				((DeclaracionIniContext)_localctx).expression = expression();

				                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
				                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
				                                                                        _localctx.instr = instrucciones.NuevaDeclaracionInicializacion(((DeclaracionIniContext)_localctx).listides.lista,((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).expression.expr, true, linea, columna)
				                                                                     
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				match(LET);
				setState(423);
				match(MUT);
				setState(424);
				((DeclaracionIniContext)_localctx).ID = match(ID);
				setState(425);
				match(DOSPUNTOS);
				setState(426);
				match(VEC_VACIO);
				setState(427);
				match(MENOR);
				setState(428);
				((DeclaracionIniContext)_localctx).tiposvars = tiposvars();
				setState(429);
				match(MAYOR);
				setState(430);
				match(IGUAL);
				setState(431);
				((DeclaracionIniContext)_localctx).listaExpresiones = listaExpresiones(0);
				 _localctx.instr = expresion2.NewVector((((DeclaracionIniContext)_localctx).ID!=null?((DeclaracionIniContext)_localctx).ID.getText():null),((DeclaracionIniContext)_localctx).tiposvars.tipo,((DeclaracionIniContext)_localctx).listaExpresiones.lista) 
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
		enterRule(_localctx, 48, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			((DeclaracionContext)_localctx).tiposvars = tiposvars();
			setState(437);
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
		enterRule(_localctx, 50, RULE_retorno);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(RETURN_P);
				 _localctx.instr = SentenciasTransferencia.NewReturn(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(RETURN_P);
				setState(443);
				((RetornoContext)_localctx).expression = expression();
				 _localctx.instr = SentenciasTransferencia.NewReturn(entorno.NULL,((RetornoContext)_localctx).expression.expr)
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
		enterRule(_localctx, 52, RULE_sentencia_break);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(BREAK_P);
				 _localctx.instr = SentenciasTransferencia.NewBreak(entorno.VOID,nil)
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(BREAK_P);
				setState(451);
				((Sentencia_breakContext)_localctx).expression = expression();
				 _localctx.instr = SentenciasTransferencia.NewBreak(entorno.NULL,((Sentencia_breakContext)_localctx).expression.expr)
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
		enterRule(_localctx, 54, RULE_sentencia_continue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_listides, _p);
		  _localctx.lista =  arrayList.New() 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460);
			((ListidesContext)_localctx).ID = match(ID);
			_localctx.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
			}
			_ctx.stop = _input.LT(-1);
			setState(469);
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
					setState(463);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(464);
					match(COMA);
					setState(465);
					((ListidesContext)_localctx).ID = match(ID);

					                                                                              ((ListidesContext)_localctx).sub.lista.Add(expresion.NuevoIdentificador((((ListidesContext)_localctx).ID!=null?((ListidesContext)_localctx).ID.getText():null)))
					                                                                              _localctx.lista = ((ListidesContext)_localctx).sub.lista
					                                                                          
					}
					} 
				}
				setState(471);
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
		enterRule(_localctx, 58, RULE_tiposvars);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(INTTYPE);
				_localctx.tipo = entorno.INTEGER
				}
				break;
			case STRINGTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(STRINGTYPE);
				_localctx.tipo = entorno.STRING
				}
				break;
			case STRTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(STRTYPE);
				_localctx.tipo = entorno.STRING2
				}
				break;
			case CHARTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				match(CHARTYPE);
				_localctx.tipo = entorno.CHAR
				}
				break;
			case FLOATTYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(480);
				match(FLOATTYPE);
				_localctx.tipo = entorno.FLOAT
				}
				break;
			case BOOLTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(482);
				match(BOOLTYPE);
				_localctx.tipo = entorno.BOOLEAN
				}
				break;
			case VOIDTYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(484);
				match(VOIDTYPE);
				_localctx.tipo = entorno.VOID
				}
				break;
			case USIZETYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(486);
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
		enterRule(_localctx, 60, RULE_dec_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((Dec_arrContext)_localctx).tiposvars = tiposvars();
			setState(491);
			((Dec_arrContext)_localctx).dimensiones = dimensiones(0);
			setState(492);
			((Dec_arrContext)_localctx).ID = match(ID);
			setState(493);
			match(IGUAL);
			setState(494);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_dimensiones, _p);
		 _localctx.tam = 0
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(498);
			dimension();
			_localctx.tam = 1
			}
			_ctx.stop = _input.LT(-1);
			setState(507);
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
					setState(501);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(502);
					dimension();

					                                                                              _localctx.tam = ((DimensionesContext)_localctx).tamano.tam + 1
					                                                                           
					}
					} 
				}
				setState(509);
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
		enterRule(_localctx, 64, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(L_CORCH);
			setState(511);
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
		enterRule(_localctx, 66, RULE_arraydata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(L_LLAVE);
			setState(514);
			((ArraydataContext)_localctx).listaExpresiones = listaExpresiones(0);
			setState(515);
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
		enterRule(_localctx, 68, RULE_instancia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(NEW_);
			setState(519);
			((InstanciaContext)_localctx).tiposvars = tiposvars();
			setState(520);
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
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_listanchos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(524);
			((ListanchosContext)_localctx).ancho = ancho();
			_localctx.lista.Add(((ListanchosContext)_localctx).ancho.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(533);
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
					setState(527);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(528);
					((ListanchosContext)_localctx).ancho = ancho();

					                                                                                          ((ListanchosContext)_localctx).sublist.lista.Add(((ListanchosContext)_localctx).ancho.expr)
					                                                                                          _localctx.lista = ((ListanchosContext)_localctx).sublist.lista
					                                                                                      
					}
					} 
				}
				setState(535);
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
		enterRule(_localctx, 72, RULE_ancho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(L_CORCH);
			setState(537);
			((AnchoContext)_localctx).expression = expression();
			setState(538);
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
		enterRule(_localctx, 74, RULE_dec_objeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			((Dec_objetoContext)_localctx).ID = match(ID);
			setState(542);
			((Dec_objetoContext)_localctx).listides = listides(0);
			setState(543);
			match(IGUAL);
			setState(544);
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
		enterRule(_localctx, 76, RULE_instanciaClase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(NEW_);
			setState(548);
			((InstanciaClaseContext)_localctx).ID = match(ID);
			setState(549);
			match(LP);
			setState(550);
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
		enterRule(_localctx, 78, RULE_accesoarr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			((AccesoarrContext)_localctx).ID = match(ID);
			setState(554);
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
		enterRule(_localctx, 80, RULE_accesoObjeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_listaAccesos, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(561);
			((ListaAccesosContext)_localctx).acceso = acceso();
			   _localctx.lista.Add(((ListaAccesosContext)_localctx).acceso.expr)
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
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
					setState(564);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(565);
					match(PUNTO);
					setState(566);
					((ListaAccesosContext)_localctx).acceso = acceso();

					                                                              ((ListaAccesosContext)_localctx).SUBLISTA.lista.Add( ((ListaAccesosContext)_localctx).acceso.expr)
					                                                              _localctx.lista = ((ListaAccesosContext)_localctx).SUBLISTA.lista
					                                                          
					}
					} 
				}
				setState(573);
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
		enterRule(_localctx, 84, RULE_acceso);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				((AccesoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((AccesoContext)_localctx).ID!=null?((AccesoContext)_localctx).ID.getText():null))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
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
		public TerminalNode VEC_VACIO() { return getToken(Parser.VEC_VACIO, 0); }
		public TerminalNode NEW_() { return getToken(Parser.NEW_, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression);
		try {
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				((ExpressionContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_rel.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				((ExpressionContext)_localctx).expr_arit = expr_arit(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_arit.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(587);
				((ExpressionContext)_localctx).expr_log = expr_log(0);
				_localctx.expr = ((ExpressionContext)_localctx).expr_log.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(590);
				((ExpressionContext)_localctx).instancia = instancia();
				_localctx.expr = ((ExpressionContext)_localctx).instancia.expr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				((ExpressionContext)_localctx).arraydata = arraydata();
				_localctx.expr = ((ExpressionContext)_localctx).arraydata.expr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				((ExpressionContext)_localctx).tiposvars = tiposvars();
				setState(597);
				match(DOSPUNTOS);
				setState(598);
				match(DOSPUNTOS);
				setState(599);
				((ExpressionContext)_localctx).POW = match(POW);
				setState(600);
				match(LP);
				setState(601);
				((ExpressionContext)_localctx).opIz = expression();
				setState(602);
				match(COMA);
				setState(603);
				((ExpressionContext)_localctx).opDe = expression();
				setState(604);
				match(RP);
				 _localctx.expr = expresion.NuevaOperacion(((ExpressionContext)_localctx).opIz.expr,(((ExpressionContext)_localctx).POW!=null?((ExpressionContext)_localctx).POW.getText():null),((ExpressionContext)_localctx).opDe.expr,false, ((ExpressionContext)_localctx).tiposvars.tipo) 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(607);
				((ExpressionContext)_localctx).tiposvars = tiposvars();
				setState(608);
				match(DOSPUNTOS);
				setState(609);
				match(DOSPUNTOS);
				setState(610);
				match(POWF);
				setState(611);
				match(LP);
				setState(612);
				((ExpressionContext)_localctx).opIz = expression();
				setState(613);
				match(COMA);
				setState(614);
				((ExpressionContext)_localctx).opDe = expression();
				setState(615);
				match(RP);
				 _localctx.expr = expresion.NuevaOperacion(((ExpressionContext)_localctx).opIz.expr,"pow",((ExpressionContext)_localctx).opDe.expr,false, ((ExpressionContext)_localctx).tiposvars.tipo) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(618);
				match(VEC_VACIO);
				setState(619);
				match(DOSPUNTOS);
				setState(620);
				match(DOSPUNTOS);
				setState(621);
				match(NEW_);
				setState(622);
				match(LP);
				setState(623);
				match(RP);
				 
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr_rel, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(628);
			((Expr_relContext)_localctx).expr_arit = expr_arit(0);
			_localctx.expr = ((Expr_relContext)_localctx).expr_arit.expr
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
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
					setState(631);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(632);
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
					setState(633);
					((Expr_relContext)_localctx).opDe = expr_rel(3);
					_localctx.expr = expresion.NuevaOperacion(((Expr_relContext)_localctx).opIz.expr,(((Expr_relContext)_localctx).op!=null?((Expr_relContext)_localctx).op.getText():null),((Expr_relContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(640);
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(642);
				match(NOT);
				setState(643);
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
				setState(646);
				((Expr_logContext)_localctx).expr_rel = expr_rel(0);
				_localctx.expr = ((Expr_logContext)_localctx).expr_rel.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(658);
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
					setState(651);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(652);
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
					setState(653);
					((Expr_logContext)_localctx).opDe = expr_log(3);
					_localctx.expr = expresion.NuevaOperacion(((Expr_logContext)_localctx).opIz.expr,(((Expr_logContext)_localctx).op!=null?((Expr_logContext)_localctx).op.getText():null),((Expr_logContext)_localctx).opDe.expr,false, entorno.NULL)
					}
					} 
				}
				setState(660);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				setState(662);
				match(SUB);
				setState(663);
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
				setState(666);
				((Expr_aritContext)_localctx).expr_valor = expr_valor();
				_localctx.expr = ((Expr_aritContext)_localctx).expr_valor.expr
				}
				break;
			case LP:
				{
				setState(669);
				match(LP);
				setState(670);
				((Expr_aritContext)_localctx).expression = expression();
				setState(671);
				match(RP);
				_localctx.expr = ((Expr_aritContext)_localctx).expression.expr
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(676);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(677);
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
						setState(678);
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
						setState(681);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(682);
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
						setState(683);
						((Expr_aritContext)_localctx).opDe = expr_arit(4);
						_localctx.expr = expresion.NuevaOperacion(((Expr_aritContext)_localctx).opIz.expr,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.expr,false, entorno.NULL)
						}
						break;
					}
					} 
				}
				setState(690);
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
		enterRule(_localctx, 94, RULE_expr_valor);
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				((Expr_valorContext)_localctx).primitivo = primitivo();
				_localctx.expr = ((Expr_valorContext)_localctx).primitivo.expr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				((Expr_valorContext)_localctx).llamada = llamada();
				_localctx.expr = ((Expr_valorContext)_localctx).llamada.expr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				((Expr_valorContext)_localctx).accesoarr = accesoarr();
				_localctx.expr = ((Expr_valorContext)_localctx).accesoarr.expr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(700);
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
		enterRule(_localctx, 96, RULE_primitivo);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
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
				setState(707);
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
				setState(709);
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
				setState(711);
				((PrimitivoContext)_localctx).STRING = match(STRING);

				                                                                    str:= (((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null)[1:len((((PrimitivoContext)_localctx).STRING!=null?((PrimitivoContext)_localctx).STRING.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.STRING)
				                                                                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                                                                    str:= (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)[1:len((((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null))-1]
				                                                                    _localctx.expr = expresion.NuevoPrimitivo(str,entorno.CHAR)
				                                                                
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(715);
				((PrimitivoContext)_localctx).ID = match(ID);
				 _localctx.expr = expresion.NuevoIdentificador((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null))
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(717);
				match(TRUE);
				 _localctx.expr = expresion.NuevoPrimitivo(true,entorno.BOOLEAN) 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(719);
				match(FALSE);
				 _localctx.expr = expresion.NuevoPrimitivo(false,entorno.BOOLEAN) 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(721);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(722);
				match(PUNTO);
				setState(723);
				match(ABS);
				setState(724);
				match(LP);
				setState(725);
				match(RP);

				        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorAbs((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(727);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(728);
				match(PUNTO);
				setState(729);
				match(SQRT);
				setState(730);
				match(LP);
				setState(731);
				match(RP);

				        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorSqrt((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(733);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(734);
				match(PUNTO);
				setState(735);
				match(TO_STRING);
				setState(736);
				match(LP);
				setState(737);
				match(RP);

				        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
						columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
				        _localctx.expr = funcionesNativas.NuevoValorStr((((PrimitivoContext)_localctx).ID!=null?((PrimitivoContext)_localctx).ID.getText():null), linea, columna)
				    
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(739);
				((PrimitivoContext)_localctx).ID = match(ID);
				setState(740);
				match(PUNTO);
				setState(741);
				match(CLONE);
				setState(742);
				match(LP);
				setState(743);
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
		case 22:
			return listaExpresiones_sempred((ListaExpresionesContext)_localctx, predIndex);
		case 28:
			return listides_sempred((ListidesContext)_localctx, predIndex);
		case 31:
			return dimensiones_sempred((DimensionesContext)_localctx, predIndex);
		case 35:
			return listanchos_sempred((ListanchosContext)_localctx, predIndex);
		case 41:
			return listaAccesos_sempred((ListaAccesosContext)_localctx, predIndex);
		case 44:
			return expr_rel_sempred((Expr_relContext)_localctx, predIndex);
		case 45:
			return expr_log_sempred((Expr_logContext)_localctx, predIndex);
		case 46:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u02ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3p\n\3\f\3\16\3s\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u00a0\n\4\3\5\3\5\3\5\5\5\u00a5\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b2\n\6\f\6\16\6\u00b5\13\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c6\n\b\3\t\6"+
		"\t\u00c9\n\t\r\t\16\t\u00ca\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0106\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0121\n\f\3\r\6\r\u0124\n\r\r\r\16\r\u0125"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\6\21\u013b\n\21\r\21\16\21\u013c\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014e"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0156\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u015d\n\23\f\23\16\23\u0160\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017b\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0186\n\30\f\30\16\30\u0189\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01b5"+
		"\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c1\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01c9\n\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01d6\n\36\f\36\16\36\u01d9\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01eb\n\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\7!\u01fc\n!\f!\16!\u01ff\13!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0216\n%\f%\16%\u0219\13%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\7+\u023c\n+\f+\16+\u023f\13+\3,\3,\3,\3,\3,\5,"+
		"\u0246\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u0274\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u027f\n.\f.\16.\u0282\13"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\5/\u028c\n/\3/\3/\3/\3/\3/\7/\u0293\n/\f/\16"+
		"/\u0296\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u02a5\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u02b1\n\60\f\60\16\60\u02b4\13\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u02c2\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02ec\n\62\3\62\2\r\4\n$.:@H"+
		"TZ\\^\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`b\2\6\4\2\67\679<\4\2\62\62\64\64\4\2=>AA\3\2?@\2"+
		"\u030a\2d\3\2\2\2\4g\3\2\2\2\6\u009f\3\2\2\2\b\u00a4\3\2\2\2\n\u00a6\3"+
		"\2\2\2\f\u00b6\3\2\2\2\16\u00c5\3\2\2\2\20\u00c8\3\2\2\2\22\u0105\3\2"+
		"\2\2\24\u0107\3\2\2\2\26\u0120\3\2\2\2\30\u0123\3\2\2\2\32\u0129\3\2\2"+
		"\2\34\u012f\3\2\2\2\36\u0134\3\2\2\2 \u013a\3\2\2\2\"\u014d\3\2\2\2$\u0155"+
		"\3\2\2\2&\u0161\3\2\2\2(\u0166\3\2\2\2*\u016a\3\2\2\2,\u017a\3\2\2\2."+
		"\u017c\3\2\2\2\60\u01b4\3\2\2\2\62\u01b6\3\2\2\2\64\u01c0\3\2\2\2\66\u01c8"+
		"\3\2\2\28\u01ca\3\2\2\2:\u01cd\3\2\2\2<\u01ea\3\2\2\2>\u01ec\3\2\2\2@"+
		"\u01f3\3\2\2\2B\u0200\3\2\2\2D\u0203\3\2\2\2F\u0208\3\2\2\2H\u020d\3\2"+
		"\2\2J\u021a\3\2\2\2L\u021f\3\2\2\2N\u0225\3\2\2\2P\u022b\3\2\2\2R\u022f"+
		"\3\2\2\2T\u0232\3\2\2\2V\u0245\3\2\2\2X\u0273\3\2\2\2Z\u0275\3\2\2\2\\"+
		"\u028b\3\2\2\2^\u02a4\3\2\2\2`\u02c1\3\2\2\2b\u02eb\3\2\2\2de\5\4\3\2"+
		"ef\b\2\1\2f\3\3\2\2\2gh\b\3\1\2hi\5\6\4\2ij\b\3\1\2jq\3\2\2\2kl\f\4\2"+
		"\2lm\5\6\4\2mn\b\3\1\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\5\3\2\2\2sq\3\2\2\2tu\5\f\7\2uv\b\4\1\2v\u00a0\3\2\2\2wx\5\b\5\2x"+
		"y\7\25\2\2yz\7I\2\2z{\7\3\2\2{|\7\4\2\2|}\5\16\b\2}~\b\4\1\2~\u00a0\3"+
		"\2\2\2\177\u0080\5\b\5\2\u0080\u0081\7\25\2\2\u0081\u0082\7I\2\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7\4\2\2\u0085\u0086\5\16"+
		"\b\2\u0086\u0087\b\4\1\2\u0087\u00a0\3\2\2\2\u0088\u0089\5\b\5\2\u0089"+
		"\u008a\7\25\2\2\u008a\u008b\7I\2\2\u008b\u008c\7\3\2\2\u008c\u008d\7\4"+
		"\2\2\u008d\u008e\7@\2\2\u008e\u008f\7;\2\2\u008f\u0090\5<\37\2\u0090\u0091"+
		"\5\16\b\2\u0091\u0092\b\4\1\2\u0092\u00a0\3\2\2\2\u0093\u0094\5\b\5\2"+
		"\u0094\u0095\7\25\2\2\u0095\u0096\7I\2\2\u0096\u0097\7\3\2\2\u0097\u0098"+
		"\5\n\6\2\u0098\u0099\7\4\2\2\u0099\u009a\7@\2\2\u009a\u009b\7;\2\2\u009b"+
		"\u009c\5<\37\2\u009c\u009d\5\16\b\2\u009d\u009e\b\4\1\2\u009e\u00a0\3"+
		"\2\2\2\u009ft\3\2\2\2\u009fw\3\2\2\2\u009f\177\3\2\2\2\u009f\u0088\3\2"+
		"\2\2\u009f\u0093\3\2\2\2\u00a0\7\3\2\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a5"+
		"\b\5\1\2\u00a3\u00a5\b\5\1\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\t\3\2\2\2\u00a6\u00a7\b\6\1\2\u00a7\u00a8\5<\37\2\u00a8\u00a9\7I\2\2"+
		"\u00a9\u00aa\b\6\1\2\u00aa\u00b3\3\2\2\2\u00ab\u00ac\f\4\2\2\u00ac\u00ad"+
		"\7/\2\2\u00ad\u00ae\5<\37\2\u00ae\u00af\7I\2\2\u00af\u00b0\b\6\1\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\7\25\2\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\7\3\2\2\u00b9\u00ba\7\4\2\2"+
		"\u00ba\u00bb\5\16\b\2\u00bb\u00bc\b\7\1\2\u00bc\r\3\2\2\2\u00bd\u00be"+
		"\7\5\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\b\b\1\2"+
		"\u00c1\u00c6\3\2\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c6"+
		"\b\b\1\2\u00c5\u00bd\3\2\2\2\u00c5\u00c2\3\2\2\2\u00c6\17\3\2\2\2\u00c7"+
		"\u00c9\5\22\n\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\t\1\2\u00cd"+
		"\21\3\2\2\2\u00ce\u00cf\5\24\13\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\b\n"+
		"\1\2\u00d1\u0106\3\2\2\2\u00d2\u00d3\5\66\34\2\u00d3\u00d4\7\60\2\2\u00d4"+
		"\u00d5\b\n\1\2\u00d5\u0106\3\2\2\2\u00d6\u00d7\5\34\17\2\u00d7\u00d8\b"+
		"\n\1\2\u00d8\u0106\3\2\2\2\u00d9\u00da\5*\26\2\u00da\u00db\7\60\2\2\u00db"+
		"\u00dc\b\n\1\2\u00dc\u0106\3\2\2\2\u00dd\u00de\5*\26\2\u00de\u00df\b\n"+
		"\1\2\u00df\u0106\3\2\2\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\b\n\1\2\u00e2"+
		"\u0106\3\2\2\2\u00e3\u00e4\5(\25\2\u00e4\u00e5\b\n\1\2\u00e5\u0106\3\2"+
		"\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00e8\b\n\1\2\u00e8\u0106\3\2\2\2\u00e9"+
		"\u00ea\5\60\31\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\b\n\1\2\u00ec\u0106"+
		"\3\2\2\2\u00ed\u00ee\5\62\32\2\u00ee\u00ef\7\60\2\2\u00ef\u00f0\b\n\1"+
		"\2\u00f0\u0106\3\2\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3\7\60\2\2\u00f3"+
		"\u00f4\b\n\1\2\u00f4\u0106\3\2\2\2\u00f5\u00f6\5\64\33\2\u00f6\u00f7\7"+
		"\60\2\2\u00f7\u00f8\b\n\1\2\u00f8\u0106\3\2\2\2\u00f9\u00fa\58\35\2\u00fa"+
		"\u00fb\7\60\2\2\u00fb\u00fc\b\n\1\2\u00fc\u0106\3\2\2\2\u00fd\u00fe\5"+
		"> \2\u00fe\u00ff\7\60\2\2\u00ff\u0100\b\n\1\2\u0100\u0106\3\2\2\2\u0101"+
		"\u0102\5L\'\2\u0102\u0103\7\60\2\2\u0103\u0104\b\n\1\2\u0104\u0106\3\2"+
		"\2\2\u0105\u00ce\3\2\2\2\u0105\u00d2\3\2\2\2\u0105\u00d6\3\2\2\2\u0105"+
		"\u00d9\3\2\2\2\u0105\u00dd\3\2\2\2\u0105\u00e0\3\2\2\2\u0105\u00e3\3\2"+
		"\2\2\u0105\u00e6\3\2\2\2\u0105\u00e9\3\2\2\2\u0105\u00ed\3\2\2\2\u0105"+
		"\u00f1\3\2\2\2\u0105\u00f5\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fd\3\2"+
		"\2\2\u0105\u0101\3\2\2\2\u0106\23\3\2\2\2\u0107\u0108\7I\2\2\u0108\u0109"+
		"\7\66\2\2\u0109\u010a\5X-\2\u010a\u010b\b\13\1\2\u010b\25\3\2\2\2\u010c"+
		"\u010d\7\r\2\2\u010d\u010e\5X-\2\u010e\u010f\5\16\b\2\u010f\u0110\b\f"+
		"\1\2\u0110\u0121\3\2\2\2\u0111\u0112\7\r\2\2\u0112\u0113\5X-\2\u0113\u0114"+
		"\5\16\b\2\u0114\u0115\7\16\2\2\u0115\u0116\5\16\b\2\u0116\u0117\b\f\1"+
		"\2\u0117\u0121\3\2\2\2\u0118\u0119\7\r\2\2\u0119\u011a\5X-\2\u011a\u011b"+
		"\5\16\b\2\u011b\u011c\5\30\r\2\u011c\u011d\7\16\2\2\u011d\u011e\5\16\b"+
		"\2\u011e\u011f\b\f\1\2\u011f\u0121\3\2\2\2\u0120\u010c\3\2\2\2\u0120\u0111"+
		"\3\2\2\2\u0120\u0118\3\2\2\2\u0121\27\3\2\2\2\u0122\u0124\5\32\16\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b\r\1\2\u0128\31\3\2\2\2\u0129\u012a"+
		"\7\16\2\2\u012a\u012b\7\r\2\2\u012b\u012c\5X-\2\u012c\u012d\5\16\b\2\u012d"+
		"\u012e\b\16\1\2\u012e\33\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0131\5X-"+
		"\2\u0131\u0132\5\36\20\2\u0132\u0133\b\17\1\2\u0133\35\3\2\2\2\u0134\u0135"+
		"\7\5\2\2\u0135\u0136\5 \21\2\u0136\u0137\7\6\2\2\u0137\u0138\b\20\1\2"+
		"\u0138\37\3\2\2\2\u0139\u013b\5\"\22\2\u013a\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\b\21\1\2\u013f!\3\2\2\2\u0140\u0141\5$\23\2\u0141\u0142\7\66\2"+
		"\2\u0142\u0143\7;\2\2\u0143\u0144\5\22\n\2\u0144\u0145\7/\2\2\u0145\u0146"+
		"\b\22\1\2\u0146\u014e\3\2\2\2\u0147\u0148\5$\23\2\u0148\u0149\7\66\2\2"+
		"\u0149\u014a\7;\2\2\u014a\u014b\5\16\b\2\u014b\u014c\b\22\1\2\u014c\u014e"+
		"\3\2\2\2\u014d\u0140\3\2\2\2\u014d\u0147\3\2\2\2\u014e#\3\2\2\2\u014f"+
		"\u0150\b\23\1\2\u0150\u0151\5X-\2\u0151\u0152\b\23\1\2\u0152\u0156\3\2"+
		"\2\2\u0153\u0154\7\t\2\2\u0154\u0156\b\23\1\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u015e\3\2\2\2\u0157\u0158\f\5\2\2\u0158\u0159\7\63"+
		"\2\2\u0159\u015a\5X-\2\u015a\u015b\b\23\1\2\u015b\u015d\3\2\2\2\u015c"+
		"\u0157\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f%\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\7\20\2\2\u0162\u0163"+
		"\5X-\2\u0163\u0164\5\16\b\2\u0164\u0165\b\24\1\2\u0165\'\3\2\2\2\u0166"+
		"\u0167\7\21\2\2\u0167\u0168\5\16\b\2\u0168\u0169\b\25\1\2\u0169)\3\2\2"+
		"\2\u016a\u016b\7\n\2\2\u016b\u016c\7\3\2\2\u016c\u016d\5X-\2\u016d\u016e"+
		"\7\4\2\2\u016e\u016f\b\26\1\2\u016f+\3\2\2\2\u0170\u0171\7I\2\2\u0171"+
		"\u0172\7\3\2\2\u0172\u0173\7\4\2\2\u0173\u017b\b\27\1\2\u0174\u0175\7"+
		"I\2\2\u0175\u0176\7\3\2\2\u0176\u0177\5.\30\2\u0177\u0178\7\4\2\2\u0178"+
		"\u0179\b\27\1\2\u0179\u017b\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0174\3"+
		"\2\2\2\u017b-\3\2\2\2\u017c\u017d\b\30\1\2\u017d\u017e\5X-\2\u017e\u017f"+
		"\b\30\1\2\u017f\u0187\3\2\2\2\u0180\u0181\f\4\2\2\u0181\u0182\7/\2\2\u0182"+
		"\u0183\5X-\2\u0183\u0184\b\30\1\2\u0184\u0186\3\2\2\2\u0185\u0180\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"/\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\26\2\2\u018b\u018c\5:\36\2"+
		"\u018c\u018d\7\66\2\2\u018d\u018e\5X-\2\u018e\u018f\b\31\1\2\u018f\u01b5"+
		"\3\2\2\2\u0190\u0191\7\26\2\2\u0191\u0192\5:\36\2\u0192\u0193\7\61\2\2"+
		"\u0193\u0194\5<\37\2\u0194\u0195\7\66\2\2\u0195\u0196\5X-\2\u0196\u0197"+
		"\b\31\1\2\u0197\u01b5\3\2\2\2\u0198\u0199\7\26\2\2\u0199\u019a\7\24\2"+
		"\2\u019a\u019b\5:\36\2\u019b\u019c\7\66\2\2\u019c\u019d\5X-\2\u019d\u019e"+
		"\b\31\1\2\u019e\u01b5\3\2\2\2\u019f\u01a0\7\26\2\2\u01a0\u01a1\7\24\2"+
		"\2\u01a1\u01a2\5:\36\2\u01a2\u01a3\7\61\2\2\u01a3\u01a4\5<\37\2\u01a4"+
		"\u01a5\7\66\2\2\u01a5\u01a6\5X-\2\u01a6\u01a7\b\31\1\2\u01a7\u01b5\3\2"+
		"\2\2\u01a8\u01a9\7\26\2\2\u01a9\u01aa\7\24\2\2\u01aa\u01ab\7I\2\2\u01ab"+
		"\u01ac\7\61\2\2\u01ac\u01ad\7\f\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af\5<"+
		"\37\2\u01af\u01b0\7;\2\2\u01b0\u01b1\7\66\2\2\u01b1\u01b2\5.\30\2\u01b2"+
		"\u01b3\b\31\1\2\u01b3\u01b5\3\2\2\2\u01b4\u018a\3\2\2\2\u01b4\u0190\3"+
		"\2\2\2\u01b4\u0198\3\2\2\2\u01b4\u019f\3\2\2\2\u01b4\u01a8\3\2\2\2\u01b5"+
		"\61\3\2\2\2\u01b6\u01b7\5<\37\2\u01b7\u01b8\5:\36\2\u01b8\u01b9\b\32\1"+
		"\2\u01b9\63\3\2\2\2\u01ba\u01bb\7\35\2\2\u01bb\u01c1\b\33\1\2\u01bc\u01bd"+
		"\7\35\2\2\u01bd\u01be\5X-\2\u01be\u01bf\b\33\1\2\u01bf\u01c1\3\2\2\2\u01c0"+
		"\u01ba\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c1\65\3\2\2\2\u01c2\u01c3\7\36\2"+
		"\2\u01c3\u01c9\b\34\1\2\u01c4\u01c5\7\36\2\2\u01c5\u01c6\5X-\2\u01c6\u01c7"+
		"\b\34\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c4\3\2\2\2"+
		"\u01c9\67\3\2\2\2\u01ca\u01cb\7\37\2\2\u01cb\u01cc\b\35\1\2\u01cc9\3\2"+
		"\2\2\u01cd\u01ce\b\36\1\2\u01ce\u01cf\7I\2\2\u01cf\u01d0\b\36\1\2\u01d0"+
		"\u01d7\3\2\2\2\u01d1\u01d2\f\4\2\2\u01d2\u01d3\7/\2\2\u01d3\u01d4\7I\2"+
		"\2\u01d4\u01d6\b\36\1\2\u01d5\u01d1\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8;\3\2\2\2\u01d9\u01d7\3\2\2\2"+
		"\u01da\u01db\7&\2\2\u01db\u01eb\b\37\1\2\u01dc\u01dd\7(\2\2\u01dd\u01eb"+
		"\b\37\1\2\u01de\u01df\7)\2\2\u01df\u01eb\b\37\1\2\u01e0\u01e1\7*\2\2\u01e1"+
		"\u01eb\b\37\1\2\u01e2\u01e3\7\'\2\2\u01e3\u01eb\b\37\1\2\u01e4\u01e5\7"+
		",\2\2\u01e5\u01eb\b\37\1\2\u01e6\u01e7\7+\2\2\u01e7\u01eb\b\37\1\2\u01e8"+
		"\u01e9\7-\2\2\u01e9\u01eb\b\37\1\2\u01ea\u01da\3\2\2\2\u01ea\u01dc\3\2"+
		"\2\2\u01ea\u01de\3\2\2\2\u01ea\u01e0\3\2\2\2\u01ea\u01e2\3\2\2\2\u01ea"+
		"\u01e4\3\2\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb=\3\2\2\2"+
		"\u01ec\u01ed\5<\37\2\u01ed\u01ee\5@!\2\u01ee\u01ef\7I\2\2\u01ef\u01f0"+
		"\7\66\2\2\u01f0\u01f1\5X-\2\u01f1\u01f2\b \1\2\u01f2?\3\2\2\2\u01f3\u01f4"+
		"\b!\1\2\u01f4\u01f5\5B\"\2\u01f5\u01f6\b!\1\2\u01f6\u01fd\3\2\2\2\u01f7"+
		"\u01f8\f\4\2\2\u01f8\u01f9\5B\"\2\u01f9\u01fa\b!\1\2\u01fa\u01fc\3\2\2"+
		"\2\u01fb\u01f7\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe"+
		"\3\2\2\2\u01feA\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7\7\2\2\u0201"+
		"\u0202\7\b\2\2\u0202C\3\2\2\2\u0203\u0204\7\5\2\2\u0204\u0205\5.\30\2"+
		"\u0205\u0206\7\6\2\2\u0206\u0207\b#\1\2\u0207E\3\2\2\2\u0208\u0209\7\30"+
		"\2\2\u0209\u020a\5<\37\2\u020a\u020b\5H%\2\u020b\u020c\b$\1\2\u020cG\3"+
		"\2\2\2\u020d\u020e\b%\1\2\u020e\u020f\5J&\2\u020f\u0210\b%\1\2\u0210\u0217"+
		"\3\2\2\2\u0211\u0212\f\4\2\2\u0212\u0213\5J&\2\u0213\u0214\b%\1\2\u0214"+
		"\u0216\3\2\2\2\u0215\u0211\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218I\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b"+
		"\7\7\2\2\u021b\u021c\5X-\2\u021c\u021d\7\b\2\2\u021d\u021e\b&\1\2\u021e"+
		"K\3\2\2\2\u021f\u0220\7I\2\2\u0220\u0221\5:\36\2\u0221\u0222\7\66\2\2"+
		"\u0222\u0223\5X-\2\u0223\u0224\b\'\1\2\u0224M\3\2\2\2\u0225\u0226\7\30"+
		"\2\2\u0226\u0227\7I\2\2\u0227\u0228\7\3\2\2\u0228\u0229\7\4\2\2\u0229"+
		"\u022a\b(\1\2\u022aO\3\2\2\2\u022b\u022c\7I\2\2\u022c\u022d\5H%\2\u022d"+
		"\u022e\b)\1\2\u022eQ\3\2\2\2\u022f\u0230\5T+\2\u0230\u0231\b*\1\2\u0231"+
		"S\3\2\2\2\u0232\u0233\b+\1\2\u0233\u0234\5V,\2\u0234\u0235\b+\1\2\u0235"+
		"\u023d\3\2\2\2\u0236\u0237\f\4\2\2\u0237\u0238\7.\2\2\u0238\u0239\5V,"+
		"\2\u0239\u023a\b+\1\2\u023a\u023c\3\2\2\2\u023b\u0236\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023eU\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\7I\2\2\u0241\u0246\b,\1\2\u0242\u0243\5P)\2"+
		"\u0243\u0244\b,\1\2\u0244\u0246\3\2\2\2\u0245\u0240\3\2\2\2\u0245\u0242"+
		"\3\2\2\2\u0246W\3\2\2\2\u0247\u0248\5Z.\2\u0248\u0249\b-\1\2\u0249\u0274"+
		"\3\2\2\2\u024a\u024b\5^\60\2\u024b\u024c\b-\1\2\u024c\u0274\3\2\2\2\u024d"+
		"\u024e\5\\/\2\u024e\u024f\b-\1\2\u024f\u0274\3\2\2\2\u0250\u0251\5F$\2"+
		"\u0251\u0252\b-\1\2\u0252\u0274\3\2\2\2\u0253\u0254\5D#\2\u0254\u0255"+
		"\b-\1\2\u0255\u0274\3\2\2\2\u0256\u0257\5<\37\2\u0257\u0258\7\61\2\2\u0258"+
		"\u0259\7\61\2\2\u0259\u025a\7$\2\2\u025a\u025b\7\3\2\2\u025b\u025c\5X"+
		"-\2\u025c\u025d\7/\2\2\u025d\u025e\5X-\2\u025e\u025f\7\4\2\2\u025f\u0260"+
		"\b-\1\2\u0260\u0274\3\2\2\2\u0261\u0262\5<\37\2\u0262\u0263\7\61\2\2\u0263"+
		"\u0264\7\61\2\2\u0264\u0265\7%\2\2\u0265\u0266\7\3\2\2\u0266\u0267\5X"+
		"-\2\u0267\u0268\7/\2\2\u0268\u0269\5X-\2\u0269\u026a\7\4\2\2\u026a\u026b"+
		"\b-\1\2\u026b\u0274\3\2\2\2\u026c\u026d\7\f\2\2\u026d\u026e\7\61\2\2\u026e"+
		"\u026f\7\61\2\2\u026f\u0270\7\30\2\2\u0270\u0271\7\3\2\2\u0271\u0272\7"+
		"\4\2\2\u0272\u0274\b-\1\2\u0273\u0247\3\2\2\2\u0273\u024a\3\2\2\2\u0273"+
		"\u024d\3\2\2\2\u0273\u0250\3\2\2\2\u0273\u0253\3\2\2\2\u0273\u0256\3\2"+
		"\2\2\u0273\u0261\3\2\2\2\u0273\u026c\3\2\2\2\u0274Y\3\2\2\2\u0275\u0276"+
		"\b.\1\2\u0276\u0277\5^\60\2\u0277\u0278\b.\1\2\u0278\u0280\3\2\2\2\u0279"+
		"\u027a\f\4\2\2\u027a\u027b\t\2\2\2\u027b\u027c\5Z.\5\u027c\u027d\b.\1"+
		"\2\u027d\u027f\3\2\2\2\u027e\u0279\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e"+
		"\3\2\2\2\u0280\u0281\3\2\2\2\u0281[\3\2\2\2\u0282\u0280\3\2\2\2\u0283"+
		"\u0284\b/\1\2\u0284\u0285\7\65\2\2\u0285\u0286\5\\/\5\u0286\u0287\b/\1"+
		"\2\u0287\u028c\3\2\2\2\u0288\u0289\5Z.\2\u0289\u028a\b/\1\2\u028a\u028c"+
		"\3\2\2\2\u028b\u0283\3\2\2\2\u028b\u0288\3\2\2\2\u028c\u0294\3\2\2\2\u028d"+
		"\u028e\f\4\2\2\u028e\u028f\t\3\2\2\u028f\u0290\5\\/\5\u0290\u0291\b/\1"+
		"\2\u0291\u0293\3\2\2\2\u0292\u028d\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295]\3\2\2\2\u0296\u0294\3\2\2\2\u0297"+
		"\u0298\b\60\1\2\u0298\u0299\7@\2\2\u0299\u029a\5X-\2\u029a\u029b\b\60"+
		"\1\2\u029b\u02a5\3\2\2\2\u029c\u029d\5`\61\2\u029d\u029e\b\60\1\2\u029e"+
		"\u02a5\3\2\2\2\u029f\u02a0\7\3\2\2\u02a0\u02a1\5X-\2\u02a1\u02a2\7\4\2"+
		"\2\u02a2\u02a3\b\60\1\2\u02a3\u02a5\3\2\2\2\u02a4\u0297\3\2\2\2\u02a4"+
		"\u029c\3\2\2\2\u02a4\u029f\3\2\2\2\u02a5\u02b2\3\2\2\2\u02a6\u02a7\f\6"+
		"\2\2\u02a7\u02a8\t\4\2\2\u02a8\u02a9\5^\60\7\u02a9\u02aa\b\60\1\2\u02aa"+
		"\u02b1\3\2\2\2\u02ab\u02ac\f\5\2\2\u02ac\u02ad\t\5\2\2\u02ad\u02ae\5^"+
		"\60\6\u02ae\u02af\b\60\1\2\u02af\u02b1\3\2\2\2\u02b0\u02a6\3\2\2\2\u02b0"+
		"\u02ab\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2"+
		"\2\2\u02b3_\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\5b\62\2\u02b6\u02b7"+
		"\b\61\1\2\u02b7\u02c2\3\2\2\2\u02b8\u02b9\5,\27\2\u02b9\u02ba\b\61\1\2"+
		"\u02ba\u02c2\3\2\2\2\u02bb\u02bc\5P)\2\u02bc\u02bd\b\61\1\2\u02bd\u02c2"+
		"\3\2\2\2\u02be\u02bf\5R*\2\u02bf\u02c0\b\61\1\2\u02c0\u02c2\3\2\2\2\u02c1"+
		"\u02b5\3\2\2\2\u02c1\u02b8\3\2\2\2\u02c1\u02bb\3\2\2\2\u02c1\u02be\3\2"+
		"\2\2\u02c2a\3\2\2\2\u02c3\u02c4\7B\2\2\u02c4\u02ec\b\62\1\2\u02c5\u02c6"+
		"\7C\2\2\u02c6\u02ec\b\62\1\2\u02c7\u02c8\7D\2\2\u02c8\u02ec\b\62\1\2\u02c9"+
		"\u02ca\7E\2\2\u02ca\u02ec\b\62\1\2\u02cb\u02cc\7F\2\2\u02cc\u02ec\b\62"+
		"\1\2\u02cd\u02ce\7I\2\2\u02ce\u02ec\b\62\1\2\u02cf\u02d0\7G\2\2\u02d0"+
		"\u02ec\b\62\1\2\u02d1\u02d2\7H\2\2\u02d2\u02ec\b\62\1\2\u02d3\u02d4\7"+
		"I\2\2\u02d4\u02d5\7.\2\2\u02d5\u02d6\7 \2\2\u02d6\u02d7\7\3\2\2\u02d7"+
		"\u02d8\7\4\2\2\u02d8\u02ec\b\62\1\2\u02d9\u02da\7I\2\2\u02da\u02db\7."+
		"\2\2\u02db\u02dc\7!\2\2\u02dc\u02dd\7\3\2\2\u02dd\u02de\7\4\2\2\u02de"+
		"\u02ec\b\62\1\2\u02df\u02e0\7I\2\2\u02e0\u02e1\7.\2\2\u02e1\u02e2\7\""+
		"\2\2\u02e2\u02e3\7\3\2\2\u02e3\u02e4\7\4\2\2\u02e4\u02ec\b\62\1\2\u02e5"+
		"\u02e6\7I\2\2\u02e6\u02e7\7.\2\2\u02e7\u02e8\7#\2\2\u02e8\u02e9\7\3\2"+
		"\2\u02e9\u02ea\7\4\2\2\u02ea\u02ec\b\62\1\2\u02eb\u02c3\3\2\2\2\u02eb"+
		"\u02c5\3\2\2\2\u02eb\u02c7\3\2\2\2\u02eb\u02c9\3\2\2\2\u02eb\u02cb\3\2"+
		"\2\2\u02eb\u02cd\3\2\2\2\u02eb\u02cf\3\2\2\2\u02eb\u02d1\3\2\2\2\u02eb"+
		"\u02d3\3\2\2\2\u02eb\u02d9\3\2\2\2\u02eb\u02df\3\2\2\2\u02eb\u02e5\3\2"+
		"\2\2\u02ecc\3\2\2\2#q\u009f\u00a4\u00b3\u00c5\u00ca\u0105\u0120\u0125"+
		"\u013c\u014d\u0155\u015e\u017a\u0187\u01b4\u01c0\u01c8\u01d7\u01ea\u01fd"+
		"\u0217\u023d\u0245\u0273\u0280\u028b\u0294\u02a4\u02b0\u02b2\u02c1\u02eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Code generated from Parser.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // Parser

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseParserListener is a complete listener for a parse tree produced by Parser.
type BaseParserListener struct{}

var _ ParserListener = &BaseParserListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseParserListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseParserListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseParserListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseParserListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseParserListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseParserListener) ExitStart(ctx *StartContext) {}

// EnterListaFunciones is called when production listaFunciones is entered.
func (s *BaseParserListener) EnterListaFunciones(ctx *ListaFuncionesContext) {}

// ExitListaFunciones is called when production listaFunciones is exited.
func (s *BaseParserListener) ExitListaFunciones(ctx *ListaFuncionesContext) {}

// EnterFuncionItem is called when production funcionItem is entered.
func (s *BaseParserListener) EnterFuncionItem(ctx *FuncionItemContext) {}

// ExitFuncionItem is called when production funcionItem is exited.
func (s *BaseParserListener) ExitFuncionItem(ctx *FuncionItemContext) {}

// EnterModaccess is called when production modaccess is entered.
func (s *BaseParserListener) EnterModaccess(ctx *ModaccessContext) {}

// ExitModaccess is called when production modaccess is exited.
func (s *BaseParserListener) ExitModaccess(ctx *ModaccessContext) {}

// EnterParametros is called when production parametros is entered.
func (s *BaseParserListener) EnterParametros(ctx *ParametrosContext) {}

// ExitParametros is called when production parametros is exited.
func (s *BaseParserListener) ExitParametros(ctx *ParametrosContext) {}

// EnterFuncmain is called when production funcmain is entered.
func (s *BaseParserListener) EnterFuncmain(ctx *FuncmainContext) {}

// ExitFuncmain is called when production funcmain is exited.
func (s *BaseParserListener) ExitFuncmain(ctx *FuncmainContext) {}

// EnterBloque is called when production bloque is entered.
func (s *BaseParserListener) EnterBloque(ctx *BloqueContext) {}

// ExitBloque is called when production bloque is exited.
func (s *BaseParserListener) ExitBloque(ctx *BloqueContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseParserListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseParserListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseParserListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseParserListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterAsignacion is called when production asignacion is entered.
func (s *BaseParserListener) EnterAsignacion(ctx *AsignacionContext) {}

// ExitAsignacion is called when production asignacion is exited.
func (s *BaseParserListener) ExitAsignacion(ctx *AsignacionContext) {}

// EnterIf_instr is called when production if_instr is entered.
func (s *BaseParserListener) EnterIf_instr(ctx *If_instrContext) {}

// ExitIf_instr is called when production if_instr is exited.
func (s *BaseParserListener) ExitIf_instr(ctx *If_instrContext) {}

// EnterListaelseif is called when production listaelseif is entered.
func (s *BaseParserListener) EnterListaelseif(ctx *ListaelseifContext) {}

// ExitListaelseif is called when production listaelseif is exited.
func (s *BaseParserListener) ExitListaelseif(ctx *ListaelseifContext) {}

// EnterElse_if is called when production else_if is entered.
func (s *BaseParserListener) EnterElse_if(ctx *Else_ifContext) {}

// ExitElse_if is called when production else_if is exited.
func (s *BaseParserListener) ExitElse_if(ctx *Else_ifContext) {}

// EnterMatch_instr is called when production match_instr is entered.
func (s *BaseParserListener) EnterMatch_instr(ctx *Match_instrContext) {}

// ExitMatch_instr is called when production match_instr is exited.
func (s *BaseParserListener) ExitMatch_instr(ctx *Match_instrContext) {}

// EnterBloque_match is called when production bloque_match is entered.
func (s *BaseParserListener) EnterBloque_match(ctx *Bloque_matchContext) {}

// ExitBloque_match is called when production bloque_match is exited.
func (s *BaseParserListener) ExitBloque_match(ctx *Bloque_matchContext) {}

// EnterListacase is called when production listacase is entered.
func (s *BaseParserListener) EnterListacase(ctx *ListacaseContext) {}

// ExitListacase is called when production listacase is exited.
func (s *BaseParserListener) ExitListacase(ctx *ListacaseContext) {}

// EnterMatch_case is called when production match_case is entered.
func (s *BaseParserListener) EnterMatch_case(ctx *Match_caseContext) {}

// ExitMatch_case is called when production match_case is exited.
func (s *BaseParserListener) ExitMatch_case(ctx *Match_caseContext) {}

// EnterListaexpre_case is called when production listaexpre_case is entered.
func (s *BaseParserListener) EnterListaexpre_case(ctx *Listaexpre_caseContext) {}

// ExitListaexpre_case is called when production listaexpre_case is exited.
func (s *BaseParserListener) ExitListaexpre_case(ctx *Listaexpre_caseContext) {}

// EnterWhile_instr is called when production while_instr is entered.
func (s *BaseParserListener) EnterWhile_instr(ctx *While_instrContext) {}

// ExitWhile_instr is called when production while_instr is exited.
func (s *BaseParserListener) ExitWhile_instr(ctx *While_instrContext) {}

// EnterLoop_instr is called when production loop_instr is entered.
func (s *BaseParserListener) EnterLoop_instr(ctx *Loop_instrContext) {}

// ExitLoop_instr is called when production loop_instr is exited.
func (s *BaseParserListener) ExitLoop_instr(ctx *Loop_instrContext) {}

// EnterConsola is called when production consola is entered.
func (s *BaseParserListener) EnterConsola(ctx *ConsolaContext) {}

// ExitConsola is called when production consola is exited.
func (s *BaseParserListener) ExitConsola(ctx *ConsolaContext) {}

// EnterLlamada is called when production llamada is entered.
func (s *BaseParserListener) EnterLlamada(ctx *LlamadaContext) {}

// ExitLlamada is called when production llamada is exited.
func (s *BaseParserListener) ExitLlamada(ctx *LlamadaContext) {}

// EnterListaExpresiones is called when production listaExpresiones is entered.
func (s *BaseParserListener) EnterListaExpresiones(ctx *ListaExpresionesContext) {}

// ExitListaExpresiones is called when production listaExpresiones is exited.
func (s *BaseParserListener) ExitListaExpresiones(ctx *ListaExpresionesContext) {}

// EnterDeclaracionIni is called when production declaracionIni is entered.
func (s *BaseParserListener) EnterDeclaracionIni(ctx *DeclaracionIniContext) {}

// ExitDeclaracionIni is called when production declaracionIni is exited.
func (s *BaseParserListener) ExitDeclaracionIni(ctx *DeclaracionIniContext) {}

// EnterDeclaracion is called when production declaracion is entered.
func (s *BaseParserListener) EnterDeclaracion(ctx *DeclaracionContext) {}

// ExitDeclaracion is called when production declaracion is exited.
func (s *BaseParserListener) ExitDeclaracion(ctx *DeclaracionContext) {}

// EnterRetorno is called when production retorno is entered.
func (s *BaseParserListener) EnterRetorno(ctx *RetornoContext) {}

// ExitRetorno is called when production retorno is exited.
func (s *BaseParserListener) ExitRetorno(ctx *RetornoContext) {}

// EnterSentencia_break is called when production sentencia_break is entered.
func (s *BaseParserListener) EnterSentencia_break(ctx *Sentencia_breakContext) {}

// ExitSentencia_break is called when production sentencia_break is exited.
func (s *BaseParserListener) ExitSentencia_break(ctx *Sentencia_breakContext) {}

// EnterSentencia_continue is called when production sentencia_continue is entered.
func (s *BaseParserListener) EnterSentencia_continue(ctx *Sentencia_continueContext) {}

// ExitSentencia_continue is called when production sentencia_continue is exited.
func (s *BaseParserListener) ExitSentencia_continue(ctx *Sentencia_continueContext) {}

// EnterListides is called when production listides is entered.
func (s *BaseParserListener) EnterListides(ctx *ListidesContext) {}

// ExitListides is called when production listides is exited.
func (s *BaseParserListener) ExitListides(ctx *ListidesContext) {}

// EnterTiposvars is called when production tiposvars is entered.
func (s *BaseParserListener) EnterTiposvars(ctx *TiposvarsContext) {}

// ExitTiposvars is called when production tiposvars is exited.
func (s *BaseParserListener) ExitTiposvars(ctx *TiposvarsContext) {}

// EnterDec_arr is called when production dec_arr is entered.
func (s *BaseParserListener) EnterDec_arr(ctx *Dec_arrContext) {}

// ExitDec_arr is called when production dec_arr is exited.
func (s *BaseParserListener) ExitDec_arr(ctx *Dec_arrContext) {}

// EnterDimensiones is called when production dimensiones is entered.
func (s *BaseParserListener) EnterDimensiones(ctx *DimensionesContext) {}

// ExitDimensiones is called when production dimensiones is exited.
func (s *BaseParserListener) ExitDimensiones(ctx *DimensionesContext) {}

// EnterDimension is called when production dimension is entered.
func (s *BaseParserListener) EnterDimension(ctx *DimensionContext) {}

// ExitDimension is called when production dimension is exited.
func (s *BaseParserListener) ExitDimension(ctx *DimensionContext) {}

// EnterArraydata is called when production arraydata is entered.
func (s *BaseParserListener) EnterArraydata(ctx *ArraydataContext) {}

// ExitArraydata is called when production arraydata is exited.
func (s *BaseParserListener) ExitArraydata(ctx *ArraydataContext) {}

// EnterInstancia is called when production instancia is entered.
func (s *BaseParserListener) EnterInstancia(ctx *InstanciaContext) {}

// ExitInstancia is called when production instancia is exited.
func (s *BaseParserListener) ExitInstancia(ctx *InstanciaContext) {}

// EnterListanchos is called when production listanchos is entered.
func (s *BaseParserListener) EnterListanchos(ctx *ListanchosContext) {}

// ExitListanchos is called when production listanchos is exited.
func (s *BaseParserListener) ExitListanchos(ctx *ListanchosContext) {}

// EnterAncho is called when production ancho is entered.
func (s *BaseParserListener) EnterAncho(ctx *AnchoContext) {}

// ExitAncho is called when production ancho is exited.
func (s *BaseParserListener) ExitAncho(ctx *AnchoContext) {}

// EnterDec_objeto is called when production dec_objeto is entered.
func (s *BaseParserListener) EnterDec_objeto(ctx *Dec_objetoContext) {}

// ExitDec_objeto is called when production dec_objeto is exited.
func (s *BaseParserListener) ExitDec_objeto(ctx *Dec_objetoContext) {}

// EnterInstanciaClase is called when production instanciaClase is entered.
func (s *BaseParserListener) EnterInstanciaClase(ctx *InstanciaClaseContext) {}

// ExitInstanciaClase is called when production instanciaClase is exited.
func (s *BaseParserListener) ExitInstanciaClase(ctx *InstanciaClaseContext) {}

// EnterAccesoarr is called when production accesoarr is entered.
func (s *BaseParserListener) EnterAccesoarr(ctx *AccesoarrContext) {}

// ExitAccesoarr is called when production accesoarr is exited.
func (s *BaseParserListener) ExitAccesoarr(ctx *AccesoarrContext) {}

// EnterAccesoObjeto is called when production accesoObjeto is entered.
func (s *BaseParserListener) EnterAccesoObjeto(ctx *AccesoObjetoContext) {}

// ExitAccesoObjeto is called when production accesoObjeto is exited.
func (s *BaseParserListener) ExitAccesoObjeto(ctx *AccesoObjetoContext) {}

// EnterListaAccesos is called when production listaAccesos is entered.
func (s *BaseParserListener) EnterListaAccesos(ctx *ListaAccesosContext) {}

// ExitListaAccesos is called when production listaAccesos is exited.
func (s *BaseParserListener) ExitListaAccesos(ctx *ListaAccesosContext) {}

// EnterAcceso is called when production acceso is entered.
func (s *BaseParserListener) EnterAcceso(ctx *AccesoContext) {}

// ExitAcceso is called when production acceso is exited.
func (s *BaseParserListener) ExitAcceso(ctx *AccesoContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseParserListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseParserListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpr_rel is called when production expr_rel is entered.
func (s *BaseParserListener) EnterExpr_rel(ctx *Expr_relContext) {}

// ExitExpr_rel is called when production expr_rel is exited.
func (s *BaseParserListener) ExitExpr_rel(ctx *Expr_relContext) {}

// EnterExpr_log is called when production expr_log is entered.
func (s *BaseParserListener) EnterExpr_log(ctx *Expr_logContext) {}

// ExitExpr_log is called when production expr_log is exited.
func (s *BaseParserListener) ExitExpr_log(ctx *Expr_logContext) {}

// EnterExpr_arit is called when production expr_arit is entered.
func (s *BaseParserListener) EnterExpr_arit(ctx *Expr_aritContext) {}

// ExitExpr_arit is called when production expr_arit is exited.
func (s *BaseParserListener) ExitExpr_arit(ctx *Expr_aritContext) {}

// EnterExpr_valor is called when production expr_valor is entered.
func (s *BaseParserListener) EnterExpr_valor(ctx *Expr_valorContext) {}

// ExitExpr_valor is called when production expr_valor is exited.
func (s *BaseParserListener) ExitExpr_valor(ctx *Expr_valorContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseParserListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseParserListener) ExitPrimitivo(ctx *PrimitivoContext) {}

parser grammar Parser;

options {
  tokenVocab = ParserLexer;
}


@header {

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
}

@members{
    type  Prueba2 struct {
        Op1 int
        Operador string
        Op2 int
    }
}


start returns [ast.Ast  ast]
    : listaFunciones                      { $ast = ast.NuevoAst( $listaFunciones.lista)}
;

listaFunciones returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : SUBLISTA =  listaFunciones funcionItem         {
                                                $SUBLISTA.lista.Add( $funcionItem.instr)
                                                $lista =  $SUBLISTA.lista
    }
    | funcionItem                                    { $lista.Add( $funcionItem.instr ) }
;

funcionItem   returns [ interfaces.Instruccion  instr]
@init{ listaParams :=  arrayList.New() }
    : funcmain                                              { $instr =  $funcmain.instr}
    | modaccess tiposvars ID '(' ')' bloque                 { $instr = Simbolos.NuevoFuncion($ID.text,listaParams,$bloque.lista,entorno.VOID)}
    | modaccess tiposvars ID '('  parametros ')' bloque     { $instr = Simbolos.NuevoFuncion($ID.text,$parametros.lista,$bloque.lista,$tiposvars.tipo)}
;

modaccess returns [entorno.TipoModAccess  modAccess]
    : PUBLIC                                                { $modAccess = entorno.PUBLIC}
    | PRIVATE                                               { $modAccess = entorno.PRIVATE}
    |                                                       { $modAccess = entorno.PRIVATE}
;

parametros returns [*arrayList.List lista]
@init{
$lista =  arrayList.New()
}
    : sublista = parametros ','  tiposvars ID                     {
                                                                    listaIdes := arrayList.New()
                                                                    listaIdes.Add(expresion.NuevoIdentificador($ID.text))

                                                                    decl := instrucciones.NuevaDeclaracion(listaIdes, $tiposvars.tipo)
                                                                    $sublista.lista.Add( decl )
                                                                    $lista =  $sublista.lista

                                                                 }
    | tiposvars ID                                               {
                                                                    listaIdes := arrayList.New()
                                                                    listaIdes.Add(expresion.NuevoIdentificador($ID.text))
                                                                    decl := instrucciones.NuevaDeclaracion(listaIdes, $tiposvars.tipo)
                                                                    $lista.Add( decl)
                                                                 }
;


funcmain returns[interfaces.Instruccion instr]
@init{ listaParams:= arrayList.New() }
    : MAIN '(' ')' bloque
    { $instr = Simbolos.NuevoFuncion("main",listaParams,$bloque.lista,entorno.VOID)}
;


bloque returns [ *arrayList.List  lista]
    : L_LLAVE instrucciones R_LLAVE                                     {$lista = $instrucciones.lista }
    | L_LLAVE R_LLAVE                                                   {$lista = arrayList.New()}
;


instrucciones returns [*arrayList.List lista]
@init{ $lista =  arrayList.New() }
  : e += instruccion+                                           {
                                                                    listInt := localctx.(*InstruccionesContext).GetE()
                                                                        for _, e := range listInt {
                                                                          $lista.Add(e.GetInstr())
                                                                        }
                                                                    fmt.Printf("\ntipo %T",localctx.(*InstruccionesContext).GetE())
                                                                }

;

instruccion returns [interfaces.Instruccion instr]
  : if_instr                                                    {$instr = $if_instr.instr}
  | match_instr                                                 {$instr = $match_instr.instr}
  | loop_instr                                                  {$instr = $loop_instr.instr}
  | while_instr                                                 {$instr = $while_instr.instr}
  | consola                                  ';'                {$instr = $consola.instr}
  | consola                                                     {$instr = $consola.instr}
  | declaracionIni                           ';'                {$instr = $declaracionIni.instr}
  | declaracion                              ';'                {$instr = $declaracion.instr}
  | llamada                                  ';'                {$instr = $llamada.instr}
  | retorno                                  ';'                {$instr = $retorno.instr}
  | sentencia_break                          ';'                {$instr = $sentencia_break.instr}
  | sentencia_continue                       ';'                {$instr = $sentencia_continue.instr}
  | dec_arr                                  ';'                {$instr = $dec_arr.instr}
  | dec_objeto                               ';'                {$instr = $dec_objeto.instr}
  | asignacion                               ';'                {$instr = $asignacion.instr}
;


// SECCIón ASIGNACIóN

asignacion returns[interfaces.Instruccion instr]
    : ID '=' expression {
            linea := localctx.(*AsignacionContext).Get_expression().GetStart().GetLine()
            columna := localctx.(*AsignacionContext).Get_expression().GetStart().GetColumn()
            $instr = asignacion.NuevaAsignacion($ID.text, $expression.expr, linea, columna)
        }
;

// Sección If

if_instr  returns [interfaces.Instruccion instr]
    : IF_TOK expression  bloque                                        {
        $instr = SentenciasControl.NewIfInstruccion($expression.expr,$bloque.lista,nil,nil)
    }
    | IF_TOK  expression  bprincipal = bloque ELSE  belse = bloque      {
        $instr = SentenciasControl.NewIfInstruccion($expression.expr,$bprincipal.lista,nil,$belse.lista)
    }
    | IF_TOK  expression  bprincipal = bloque listaelseif ELSE  belse = bloque {
        $instr = SentenciasControl.NewIfInstruccion($expression.expr,$bprincipal.lista,$listaelseif.lista,$belse.lista)
    }
;

listaelseif returns [*arrayList.List lista]
@init{ $lista = arrayList.New()} // Se inicializa la lista que servirá de recolector de no terminales "else_if"
: list += else_if+ {
    listInt := localctx.(*ListaelseifContext).GetList()
    for _, e := range listInt {
        $lista.Add(e.GetInstr())
    }
} // Como la producción retorna una lista de contexto, se llena una lista de instrucciones para mejor manejo.
;

else_if returns [interfaces.Instruccion instr]
    : ELSE IF_TOK expression bloque   {$instr = SentenciasControl.NewIfInstruccion($expression.expr,$bloque.lista,nil,nil)}
;

// Seccion match

match_instr returns [interfaces.Instruccion instr]
    : MATCH expression bloque_match  {
            $instr = SentenciasControl.NewMatchInstruccion($expression.expr,$bloque_match.lista)
        }
;

/*

    {
        1 | 2 => ...
        .
        .

        .
        .
        .
    }

*/
bloque_match returns [ *arrayList.List  lista]
    : L_LLAVE listacase  R_LLAVE {
        $lista = $listacase.lista
    }
;

listacase returns [*arrayList.List lista]
@init{ $lista = arrayList.New()} // Se inicializa la lista que servirá de recolector de no terminales "match_case"
: list += match_case+ {
    listInt := localctx.(*ListacaseContext).GetList()
    for _, e := range listInt {
        $lista.Add(e.GetMatchCase())
    }
} // Se retorna una lista con todas las instrucciones "match_case"
;


// Retornará una lista de MatchCases
match_case returns [SentenciasControl.MatchCase matchCase]
    : listaexpre_case '=' '>' instruccion ',' {
        listaInstr := arrayList.New()
        listaInstr.Add($instruccion.instr)
        $matchCase = SentenciasControl.NewMatchCase($listaexpre_case.lista, listaInstr)
    }
    | listaexpre_case '=' '>' bloque     {
        $matchCase = SentenciasControl.NewMatchCase($listaexpre_case.lista, $bloque.lista)
    }
;

listaexpre_case returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : LISTA = listaexpre_case OR_CASE expression{
                                                    $LISTA.lista.Add( $expression.expr )
                                                    $lista =  $LISTA.lista
                                                }
| expression{
        $lista.Add( $expression.expr )
        }
|  GUION_BAJO {
    $lista.Add("_")
}
;


// Sección while

while_instr returns [interfaces.Instruccion instr]
    : WHILE expression bloque  {
            $instr = SentenciasCiclicas.NewWhileInstruccion($expression.expr,$bloque.lista)
        }
;


// Sección loop

loop_instr returns [interfaces.Instruccion instr]
    : LOOP bloque  {
            $instr = SentenciasCiclicas.NewLoopInstruccion($bloque.lista)
        }
;



// Seicción Print

consola returns [interfaces.Instruccion instr]
    : PRINTLN LP expression RP   {$instr = instrucciones.NuevoImprimir($expression.expr)}
;




/* LLAMADA**/

llamada returns [interfaces.Instruccion instr, interfaces.Expresion expr]
    : ID '(' ')'                                                    {
                                                                        $instr = expresion2.NuevaLlamada($ID.text, arrayList.New())
                                                                        $expr = expresion2.NuevaLlamada($ID.text, arrayList.New())}
    | ID '(' listaExpresiones ')'                                   {
                                                                        $instr = expresion2.NuevaLlamada($ID.text, $listaExpresiones.lista)
                                                                        $expr = expresion2.NuevaLlamada($ID.text, $listaExpresiones.lista)}
;

listaExpresiones returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : LISTA = listaExpresiones ',' expression                        {
                                                                        $LISTA.lista.Add( $expression.expr )
                                                                        $lista =  $LISTA.lista
                                                                     }
    | expression                                                    {
                                                                        $lista.Add( $expression.expr )
                                                                     }
;

declaracionIni returns [interfaces.Instruccion instr]
    : LET listides '=' expression                                    {
                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NuevaDeclaracionInicializacion($listides.lista, entorno.NULL,$expression.expr, false, linea, columna)
                                                                     }
    | LET listides DOSPUNTOS tiposvars '=' expression                {
                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NuevaDeclaracionInicializacion($listides.lista,$tiposvars.tipo,$expression.expr, false, linea, columna)
                                                                     }
    | LET MUT listides   '=' expression                              {
                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NuevaDeclaracionInicializacion($listides.lista, entorno.NULL,$expression.expr, true, linea, columna)
                                                                     }
    | LET MUT listides DOSPUNTOS tiposvars  '=' expression           {
                                                                        linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NuevaDeclaracionInicializacion($listides.lista,$tiposvars.tipo,$expression.expr, true, linea, columna)
                                                                     }
;

declaracion returns [interfaces.Instruccion instr]
    : tiposvars listides                                            {
                                                                        $instr = instrucciones.NuevaDeclaracion($listides.lista,$tiposvars.tipo)
                                                                    }
;

retorno returns [interfaces.Instruccion instr]
    : RETURN_P                                                      { $instr = SentenciaTransferencia.NewReturn(entorno.VOID,nil)}
    | RETURN_P  expression                                          { $instr = SentenciaTransferencia.NewReturn(entorno.NULL,$expression.expr)}
;

sentencia_break returns [interfaces.Instruccion instr]
    : BREAK_P                                                      { $instr = SentenciaTransferencia.NewBreak(entorno.VOID,nil)}
    | BREAK_P  expression                                          { $instr = SentenciaTransferencia.NewBreak(entorno.NULL,$expression.expr)}
;

sentencia_continue returns [interfaces.Instruccion instr]
    : CONTINUE_P                                                      { $instr = SentenciaTransferencia.NewContinue(entorno.VOID)}

;



listides returns [*arrayList.List lista]
  @init{  $lista =  arrayList.New() }
    : sub = listides ',' ID                                     {
                                                                    $sub.lista.Add(expresion.NuevoIdentificador($ID.text))
                                                                    $lista = $sub.lista
                                                                }
    | ID                                                        {$lista.Add(expresion.NuevoIdentificador($ID.text))}
;

tiposvars returns[entorno.TipoDato tipo]
    : INTTYPE                                                   {$tipo = entorno.INTEGER}
    | STRINGTYPE                                                {$tipo = entorno.STRING}
    | STRTYPE                                                   {$tipo = entorno.STRING2}
    | CHARTYPE                                                    {$tipo = entorno.CHAR}
    | FLOATTYPE                                                 {$tipo = entorno.FLOAT}
    | BOOLTYPE                                                  {$tipo = entorno.BOOLEAN}
    | VOIDTYPE                                                  {$tipo = entorno.VOID}
    | USIZETYPE                                                  {$tipo = entorno.USIZE}
;


//SECCIÓN ARREGLOS
dec_arr returns [interfaces.Instruccion instr]
    // int [][][] ejemplo = new int[5]
    // las dimensiones son llaves cuadradas vacías
    : tiposvars  dimensiones ID '=' expression                  {$instr = Definicion.NewDeclaracionArray($dimensiones.tam,$ID.text,$expression.expr,$tiposvars.tipo)}
;


dimensiones returns [int tam]
@init{ $tam = 0}
    :  tamano = dimensiones dimension                           {
                                                                    $tam = $tamano.tam + 1
                                                                 }
    |  dimension                                                {$tam = 1}
;

dimension

    : '[' ']'
;



arraydata returns [interfaces.Expresion expr]
    : L_LLAVE listaExpresiones R_LLAVE                          {$expr = expresion2.NewValorArreglo($listaExpresiones.lista)}
;

instancia returns[interfaces.Expresion expr]
        // new int [e][e][e]
    : NEW_ tiposvars listanchos                                 {$expr = expresion2.NewInstanciaArreglo($tiposvars.tipo, $listanchos.lista )}
;

listanchos returns[*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    :  sublist = listanchos ancho                                          {
                                                                                $sublist.lista.Add($ancho.expr)
                                                                                $lista = $sublist.lista
                                                                            }
    |  ancho                                                                {$lista.Add($ancho.expr)}
;

ancho   returns [interfaces.Expresion expr]
    :   '[' expression ']'                                                  {$expr = $expression.expr}
;

// SECCIÓN CLASES

dec_objeto returns[interfaces.Instruccion instr]
    : ID listides '=' expression                                {$instr = Definicion.NewDeclararObjeto( $ID.text, $listides.lista, $expression.expr)}
;


instanciaClase returns[interfaces.Expresion expr]
    : NEW_ ID '(' ')'                                           {$expr = expresion2.NewInstanciaObjeto($ID.text )}
;


accesoarr returns[interfaces.Expresion expr]
    : ID listanchos                                             {$expr = Accesos.NewAccessoArr($ID.text,$listanchos.lista)}
;

accesoObjeto returns[interfaces.Expresion expr]
    :  listaAccesos                                             {$expr = Accesos.NewAccesoObjeto( $listaAccesos.lista)}
;

listaAccesos returns[*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    :  SUBLISTA =  listaAccesos '.' acceso       {
                                                    $SUBLISTA.lista.Add( $acceso.expr)
                                                    $lista = $SUBLISTA.lista
                                                }
    | acceso                                    {   $lista.Add($acceso.expr)}
;

acceso  returns [interfaces.Expresion expr]
    : ID                                        { $expr = expresion.NuevoIdentificador($ID.text)}
    | accesoarr                                 { $expr = $accesoarr.expr}
;





/*
    SECCION DE EXPRESSIONES ************************************************
 */




expression returns[interfaces.Expresion expr]
    : expr_rel                                                  {$expr = $expr_rel.expr}
    | expr_arit                                                 {$expr = $expr_arit.expr}
    | expr_log                                                 {$expr = $expr_log.expr}
    | instancia                                                 {$expr = $instancia.expr} // new int[4]
    | arraydata                                                 {$expr = $arraydata.expr} // datos del arreglo
    | tiposvars ':' ':' POW '(' opIz = expression ',' opDe = expression ')'    { $expr = expresion.NuevaOperacion($opIz.expr,$POW.text,$opDe.expr,false, $tiposvars.tipo) }
    | tiposvars ':' ':' POWF '(' opIz = expression ',' opDe = expression ')'    { $expr = expresion.NuevaOperacion($opIz.expr,"pow",$opDe.expr,false, $tiposvars.tipo) }

;

expr_rel returns[interfaces.Expresion expr]
    : opIz = expr_rel op=( MAYORIGUAL | MENORIGUAL | MENOR | MAYOR | IGUAL_IGUAL) opDe = expr_rel {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_arit  {$expr = $expr_arit.expr}
;

expr_log returns[interfaces.Expresion expr]
    : '!' opU = expr_log {$expr = expresion.NuevaOperacion($opU.expr,"!",nil,true, entorno.NULL)}
    | opIz = expr_log op=( '||' | '&&') opDe = expr_log {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_rel  {$expr = $expr_rel.expr}
;

expr_arit returns[interfaces.Expresion expr]
    : '-' opU = expression                                      {$expr = expresion.NuevaOperacion($opU.expr,"-",nil,true, entorno.NULL)}
    | opIz = expr_arit op=('*'|'/'| MOD) opDe = expr_arit       {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit            {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_valor                                                {$expr = $expr_valor.expr}
    | LP expression RP                                          {$expr = $expression.expr}
;

expr_valor returns[interfaces.Expresion expr]
  : primitivo                                                   {$expr = $primitivo.expr}
  | llamada                                                     {$expr = $llamada.expr}
  | accesoarr                                                   {$expr = $accesoarr.expr}
  | accesoObjeto                                                {$expr = $accesoObjeto.expr}

;

primitivo returns[interfaces.Expresion expr]
    :NUMBER                                                     {
                                                                    num,err := strconv.Atoi($NUMBER.text)
                                                                    if err!= nil{
                                                                        fmt.Println(err)
                                                                    }
                                                                    $expr = expresion.NuevoPrimitivo(num,entorno.INTEGER)
                                                                }
    |USIZE                                                      {
                                                                    num,err := strconv.Atoi($USIZE.text)
                                                                    if err!= nil{
                                                                        fmt.Println(err)
                                                                    }
                                                                    $expr = expresion.NuevoPrimitivo(num,entorno.USIZE)
                                                                }
    | FLOAT                                                     {
                                                                     num,err := strconv.ParseFloat($FLOAT.text,64)
                                                                     if err!= nil{
                                                                         fmt.Println(err)
                                                                     }
                                                                     $expr = expresion.NuevoPrimitivo(num,entorno.FLOAT)

                                                                }

    | STRING                                                    {
                                                                    str:= $STRING.text[1:len($STRING.text)-1]
                                                                    $expr = expresion.NuevoPrimitivo(str,entorno.STRING)
                                                                }
    | CHAR                                                      {
                                                                    str:= $CHAR.text[1:len($CHAR.text)-1]
                                                                    $expr = expresion.NuevoPrimitivo(str,entorno.CHAR)
                                                                }

    | ID                                                        { $expr = expresion.NuevoIdentificador($ID.text)}

    | TRUE                                                      { $expr = expresion.NuevoPrimitivo(true,entorno.BOOLEAN) }
    | FALSE                                                     { $expr = expresion.NuevoPrimitivo(false,entorno.BOOLEAN) }
    | ID '.' ABS '(' ')' {
        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
        $expr = funcionesNativas.NuevoValorAbs($ID.text, linea, columna)
    }
    | ID '.' SQRT '(' ')' {
        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
        $expr = funcionesNativas.NuevoValorSqrt($ID.text, linea, columna)
    }
    | ID '.' TO_STRING '(' ')' {
        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
        $expr = funcionesNativas.NuevoValorStr($ID.text, linea, columna)
    }
    | ID '.' CLONE '(' ')' {
        linea := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetColumn()
        $expr = funcionesNativas.NuevoValorClone($ID.text, linea, columna)
    }

;

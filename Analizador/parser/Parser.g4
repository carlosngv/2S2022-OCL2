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
}

@members{
    type  Prueba2 struct {
        Op1 int
        Operador string
        Op2 int
    }
}


start returns [ast.Ast  ast]
    : listaClases                           { $ast = ast.NewAst( $listaClases.lista)}
    //| listaFunciones                      { $ast = ast.NewAst( $listaFunciones.lista)}
;

// Sección clases (Modulos)

listaClases returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : SUBLISTA =  listaClases clases        {
                                                $SUBLISTA.lista.Add( $clases.instr)
                                                $lista =  $SUBLISTA.lista
                                            }
    | clases                                { $lista.Add( $clases.instr ) }
;


clases returns[interfaces.Instruccion instr]
    : MOD_ ID cuerpoClase                              {$instr = instrucciones.NewDefClase($ID.text, $cuerpoClase.lista)}
;



cuerpoClase returns[*arrayList.List lista]
    : L_LLAVE contenidoClase R_LLAVE                    {$lista = $contenidoClase.lista}
    | L_LLAVE R_LLAVE                                   {$lista = arrayList.New()}
;

contenidoClase returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : SUBLISTA = contenidoClase itemClase              {
                                                            $SUBLISTA.lista.Add( $itemClase.instr )
                                                            $lista = $SUBLISTA.lista
                                                        }
    | itemClase                                         {
                                                            $lista.Add( $itemClase.instr )
                                                        }
;

itemClase returns[interfaces.Instruccion instr]
    : funcionItem                               {$instr = $funcionItem.instr}
    | declaracionIni       ';'                  {$instr = $declaracionIni.instr}
    | declaracion          ';'                  {$instr = $declaracion.instr}
;



funcionItem   returns [ interfaces.Instruccion  instr]
@init{ listaParams :=  arrayList.New() }
    : funcmain                                              { $instr =  $funcmain.instr}
    | modaccess FN ID '(' ')' bloque                 { $instr = Simbolos.NewFuncion($ID.text,listaParams,$bloque.lista,entorno.VOID)}
    | modaccess FN ID '('  parametros ')' bloque     { $instr = Simbolos.NewFuncion($ID.text,$parametros.lista,$bloque.lista,entorno.VOID)}
    | modaccess FN ID '(' ')' '-' '>' tiposvars bloque                 { $instr = Simbolos.NewFuncion($ID.text,listaParams,$bloque.lista,$tiposvars.tipo)}
    | modaccess FN ID '('  parametros ')' '-' '>' tiposvars bloque     { $instr = Simbolos.NewFuncion($ID.text,$parametros.lista,$bloque.lista,$tiposvars.tipo)}
;

modaccess returns [entorno.TipoModAccess  modAccess]
    : PUB                                                { $modAccess = entorno.PUBLIC}
    |                                                       { $modAccess = entorno.PRIVATE}
;

parametros returns [*arrayList.List lista]
@init{
$lista =  arrayList.New()
}
    : sublista = parametros ','  parametro                      {
                                                                    $sublista.lista.Add( $parametro.instr )
                                                                    $lista =  $sublista.lista
                                                                 }
    | parametro                                                 {
                                                                    $lista.Add( $parametro.instr)
                                                                 }
;

parametro returns [interfaces.Instruccion instr]
    :   tiposvars ID                                            {
                                                                    listaIdes := arrayList.New()
                                                                    listaIdes.Add(expresion.NewIdentificador($ID.text))
                                                                    $instr = instrucciones.NewDeclaracionParametro(listaIdes, $tiposvars.tipo,false)
                                                                }
    | '*' tiposvars ID                                          {
                                                                    listaIdes := arrayList.New()
                                                                    listaIdes.Add(expresion.NewIdentificador($ID.text))
                                                                    $instr = instrucciones.NewDeclaracionParametro(listaIdes, $tiposvars.tipo,true)
                                                                }
;



funcmain returns[interfaces.Instruccion instr]
@init{ listaParams:= arrayList.New() }
    : FN MAIN '(' ')' bloque
    { $instr = Simbolos.NewFuncion("main",listaParams,$bloque.lista,entorno.VOID)}
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

                                                                }

;

instruccion returns [interfaces.Instruccion instr]
  : asignacion                               ';'                {$instr = $asignacion.instr}
  | sentencia_break                          ';'                {$instr = $sentencia_break.instr}
  | match_instr                                                 {$instr = $match_instr.instr}
  | consola                                  ';'                {$instr = $consola.instr}
  | consola                                                     {$instr = $consola.instr}
  | while_instr                                                 {$instr = $while_instr.instr}
  | loop_instr                                                  {$instr = $loop_instr.instr}
  | if_instr                                                    {$instr = $if_instr.instr}
  | declaracionIni                           ';'                {$instr = $declaracionIni.instr}
  | declaracion                              ';'                {$instr = $declaracion.instr}
  | llamada                                  ';'                {$instr = $llamada.instr}
  | retorno                                  ';'                {$instr = $retorno.instr}
  | sentencia_continue                       ';'                {$instr = $sentencia_continue.instr}
  | dec_arr                                  ';'                {$instr = $dec_arr.instr}
  | dec_objeto                               ';'                {$instr = $dec_objeto.instr}
  | asignacion_objeto                        ';'                {$instr = $asignacion_objeto.instr}
;


// SECCIón ASIGNACIóN

asignacion returns[interfaces.Instruccion instr]
    : ID '=' expresion {$instr = asignacion.NewAsignacion($ID.text, $expresion.expr, 0,0 )}
;

// Sección If

if_instr  returns [interfaces.Instruccion instr]
    : IF_TOK expresion  bloque                                        {
        $instr = SentenciasControl.NewIfInstruccion($expresion.expr,$bloque.lista,nil,nil)
    }
    | IF_TOK  expresion  bprincipal = bloque ELSE  belse = bloque      {
        $instr = SentenciasControl.NewIfInstruccion($expresion.expr,$bprincipal.lista,nil,$belse.lista)
    }
    | IF_TOK  expresion  bprincipal = bloque listaelseif ELSE  belse = bloque {
        $instr = SentenciasControl.NewIfInstruccion($expresion.expr,$bprincipal.lista,$listaelseif.lista,$belse.lista)
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
    : ELSE IF_TOK expresion bloque   {$instr = SentenciasControl.NewIfInstruccion($expresion.expr,$bloque.lista,nil,nil)}
;

// Seccion match

match_instr returns [interfaces.Instruccion instr]
    : MATCH expresion bloque_match  {
            $instr = SentenciasControl.NewMatchInstruccion($expresion.expr,$bloque_match.lista)
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
    : LISTA = listaexpre_case OR_CASE expresion{
                                                    $LISTA.lista.Add( $expresion.expr )
                                                    $lista =  $LISTA.lista
                                                }
| expresion{
        $lista.Add( $expresion.expr )
        }
|  GUION_BAJO {
    $lista.Add("_")
}
;


// Sección while

while_instr returns [interfaces.Instruccion instr]
    : WHILE expresion bloque  {
            $instr = SentenciasCiclicas.NewWhileInstruccion($expresion.expr,$bloque.lista)
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
    : PRINTLN LP expresion RP   {$instr = instrucciones.NewImprimir($expresion.expr)}
;




/* LLAMADA**/

llamada returns [interfaces.Instruccion instr, interfaces.Expresion expr]
    : ID '(' ')'                                                    {
                                                                        $instr = expresion2.NewLlamada($ID.text, arrayList.New())
                                                                        $expr = expresion2.NewLlamada($ID.text, arrayList.New())}
    | ID '(' listaExpresiones ')'                                   {
                                                                        $instr = expresion2.NewLlamada($ID.text, $listaExpresiones.lista)
                                                                        $expr = expresion2.NewLlamada($ID.text, $listaExpresiones.lista)}
;

listaExpresiones returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : LISTA = listaExpresiones ',' expresion                        {
                                                                        $LISTA.lista.Add( $expresion.expr )
                                                                        $lista =  $LISTA.lista
                                                                     }
    | expresion                                                    {
                                                                        $lista.Add( $expresion.expr )
                                                                     }
;

declaracionIni returns [interfaces.Instruccion instr]
    : LET listides '=' expresion                                    {
                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NewDeclaracionInicializacion($listides.lista, entorno.NULL ,$expresion.expr)
                                                                     }
    | LET listides DOSPUNTOS tiposvars '=' expresion                {
                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NewDeclaracionInicializacion($listides.lista,$tiposvars.tipo,$expresion.expr)
                                                                     }
    | LET MUT listides   '=' expresion                              {
                                                                        //linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                        //columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NewDeclaracionInicializacion($listides.lista,entorno.NULL,$expresion.expr)
                                                                     }
    | LET MUT listides DOSPUNTOS tiposvars  '=' expresion           {
                                                                       // linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
                                                                       // columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
                                                                        $instr = instrucciones.NewDeclaracionInicializacion($listides.lista,$tiposvars.tipo,$expresion.expr)
                                                                     }
    | LET ID DOSPUNTOS VEC_VACIO '<' tiposvars  '>' '=' VEC_VACIO ':' ':' NEW_ '(' ')'  { $instr = expresion2.NewVector($ID.text,$tiposvars.tipo, false) }

    | LET MUT ID DOSPUNTOS VEC_VACIO '<' tiposvars  '>' '=' VEC_VACIO ':' ':' NEW_ '(' ')'  { $instr = expresion2.NewVector($ID.text,$tiposvars.tipo, true) }

    | LET ID '=' expresion {
        fmt.Println("\n DECL ARRAY EN DECLARACIONINI")
        $instr = Definicion.NewDeclaracionArray(0,$ID.text,$expresion.expr,entorno.VOID, false)
    }

    | LET MUT ID '=' expresion {
        fmt.Println("\n DECL ARRAY EN DECLARACIONINI")
        $instr = Definicion.NewDeclaracionArray(0,$ID.text,$expresion.expr,entorno.VOID, true)
    }
;

declaracion returns [interfaces.Instruccion instr]
    : tiposvars listides                                            {
                                                                        $instr = instrucciones.NewDeclaracion($listides.lista,$tiposvars.tipo)
                                                                    }
;

retorno returns [interfaces.Instruccion instr]
    : RETURN_P                                                      { $instr = SentenciasTransferencia.NewReturn(entorno.VOID,nil)}
    | RETURN_P  expresion                                          { $instr = SentenciasTransferencia.NewReturn(entorno.NULL,$expresion.expr)}
;

sentencia_break returns [interfaces.Instruccion instr]
    : BREAK_P                                                      { $instr = SentenciasTransferencia.NewBreak(entorno.VOID,nil)}
    | BREAK_P  expresion                                          { $instr = SentenciasTransferencia.NewBreak(entorno.NULL,$expresion.expr)}
;

sentencia_continue returns [interfaces.Instruccion instr]
    : CONTINUE_P                                                      { $instr = SentenciasTransferencia.NewContinue(entorno.VOID)}

;



listides returns [*arrayList.List lista]
  @init{  $lista =  arrayList.New() }
    : sub = listides ',' ID                                     {
                                                                    $sub.lista.Add(expresion.NewIdentificador($ID.text))
                                                                    $lista = $sub.lista
                                                                }
    | ID                                                        {$lista.Add(expresion.NewIdentificador($ID.text))}
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
    // decl1 -> let arr1: [ TYPE ; SIZE] = expr
    // decl1 -> let mut arr1: [ TYPE ; SIZE] = expr
    // decl2 -> let arr1 = expr         // Estos dos ultimos se realizan en la declaración normal
    // decl2 -> let mut arr1 = expr

    //: tiposvars  dimensiones ID '=' expresion                  {$instr = Definicion.NewDeclaracionArray($dimensiones.tam,$ID.text,$expresion.expr,$tiposvars.tipo)}

    // DE MOMENTO OMITIR EL TAMAñO

    : LET ID ':' '[' tiposvars ';' NUMBER ']' '=' expresion {
        num, _ := strconv.Atoi($NUMBER.text)
        $instr = Definicion.NewDeclaracionArray(num,$ID.text,$expresion.expr,$tiposvars.tipo, false)
        }
    | LET MUT ID ':' '[' tiposvars ';' NUMBER ']''=' expresion  {
        num, _ := strconv.Atoi($NUMBER.text)
        $instr = Definicion.NewDeclaracionArray(num,$ID.text,$expresion.expr,$tiposvars.tipo, true)
    }
;


dimensiones returns [int tam]
@init{ $tam = 0}
    :  tamano = dimensiones dimension                           {
                                                                    $tam = $tamano.tam + 1
                                                                 }
    |  dimension                                                {$tam = 1}
;

dimension

    : '['  ']'
;


// FUNCIONAL -> [32, 43, [434, 34], [434]] (Es el valor del array).
arraydata returns [interfaces.Expresion expr]
    : '[' listaExpresiones ']'                          {$expr = expresion2.NewValorArreglo($listaExpresiones.lista)}
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
    :   '[' expresion ']'                                                  {$expr = $expresion.expr}
;

// SECCIÓN CLASES

dec_objeto returns[interfaces.Instruccion instr]
    : ID listides '=' expresion                                {$instr = Definicion.NewDeclararObjeto( $ID.text, $listides.lista, $expresion.expr)}
;


instanciaClase returns[interfaces.Expresion expr]
    : NEW_ ID '(' ')'                                           {$expr = expresion2.NewInstanciaObjeto($ID.text )}
;


// arra1[2][3][4]
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
    : ID                                        { $expr = expresion.NewIdentificador($ID.text)}
    | accesoarr                                 { $expr = $accesoarr.expr}
;


asignacion_objeto returns[interfaces.Instruccion instr]
    : listaAccesos '=' expresion {$instr = asignacion.NewAsignacionObjeto($listaAccesos.lista, $expresion.expr )}
;






// Sección Expresiones
expresion returns[interfaces.Expresion expr]
    : expr_rel                                                  {$expr = $expr_rel.expr}
    | expr_arit                                                 {$expr = $expr_arit.expr}
    | expr_log                                                 {$expr = $expr_log.expr}
    | instancia                                                 {$expr = $instancia.expr} // new int[4]
    | arraydata                                                 {$expr = $arraydata.expr} // datos del arreglo
    | tiposvars ':' ':' POW '(' opIz = expresion ',' opDe = expresion ')'     { $expr = expresion.NewOperacion($opIz.expr,$POW.text,$opDe.expr,false, $tiposvars.tipo) }
    | tiposvars ':' ':' POWF '(' opIz = expresion ',' opDe = expresion ')'    { $expr = expresion.NewOperacion($opIz.expr,"pow",$opDe.expr,false, $tiposvars.tipo) }

;

expr_rel returns[interfaces.Expresion expr]
    : opIz = expr_rel op=( DIFERENTE | MAYORIGUAL | MENORIGUAL | MENOR | MAYOR | IGUAL_IGUAL ) opDe = expr_rel {$expr = expresion.NewOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_arit  {$expr = $expr_arit.expr}
;

expr_log returns[interfaces.Expresion expr]
    : '!' opU = expr_log {$expr = expresion.NewOperacion($opU.expr,"!",nil,true, entorno.NULL)}
    | opIz = expr_log op=( '||' | '&&') opDe = expr_log {$expr = expresion.NewOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_rel  {$expr = $expr_rel.expr}
;

expr_arit returns[interfaces.Expresion expr]
    : '-' opU = expresion                                      {$expr = expresion.NewOperacion($opU.expr,"-",nil,true, entorno.NULL)}
    | opIz = expr_arit op=('*'|'/'| MOD) opDe = expr_arit       {$expr = expresion.NewOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit            {$expr = expresion.NewOperacion($opIz.expr,$op.text,$opDe.expr,false, entorno.NULL)}
    | expr_valor                                                {$expr = $expr_valor.expr}
    | LP expresion RP                                          {$expr = $expresion.expr}
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
                                                                    $expr = expresion.NewPrimitivo(num,entorno.INTEGER)
                                                                }
    |USIZE                                                      {
                                                                    num,err := strconv.Atoi($USIZE.text)
                                                                    if err!= nil{
                                                                        fmt.Println(err)
                                                                    }
                                                                    $expr = expresion.NewPrimitivo(num,entorno.USIZE)
                                                                }
    | FLOAT                                                     {
                                                                     num,err := strconv.ParseFloat($FLOAT.text,64)
                                                                     if err!= nil{
                                                                         fmt.Println(err)
                                                                     }
                                                                     $expr = expresion.NewPrimitivo(num,entorno.FLOAT)

                                                                }

    | STRING                                                    {
                                                                    str:= $STRING.text[1:len($STRING.text)-1]
                                                                    $expr = expresion.NewPrimitivo(str,entorno.STRING)
                                                                }
    | CHAR                                                      {
                                                                    str:= $CHAR.text[1:len($CHAR.text)-1]
                                                                    $expr = expresion.NewPrimitivo(str,entorno.CHAR)
                                                                }

    | ID                                                        { $expr = expresion.NewIdentificador($ID.text)}

    | TRUE                                                      { $expr = expresion.NewPrimitivo(true,entorno.BOOLEAN) }
    | FALSE                                                     { $expr = expresion.NewPrimitivo(false,entorno.BOOLEAN) }
    | ID '.' ABS '(' ')' {
        linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
        $expr = funcionesNativas.NewValorAbs($ID.text, linea, columna)
    }
    | ID '.' SQRT '(' ')' {
        linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
        $expr = funcionesNativas.NewValorSqrt($ID.text, linea, columna)
    }
    | ID '.' TO_STRING '(' ')' {
        linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
        $expr = funcionesNativas.NewValorStr($ID.text, linea, columna)
    }
    | ID '.' CLONE '(' ')' {
        linea := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetColumn()
        $expr = funcionesNativas.NewValorClone($ID.text, linea, columna)
    }

;

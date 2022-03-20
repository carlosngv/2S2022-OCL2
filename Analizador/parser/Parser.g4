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
    //import "p1/packages/Analizador/ast/instrucciones/SentenciasCiclicas"
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
  | consola                                  ';'                {$instr = $consola.instr}
  | declaracionIni                           ';'                {$instr = $declaracionIni.instr}
  | declaracion                              ';'                {$instr = $declaracion.instr}
  | llamada                                  ';'                {$instr = $llamada.instr}
  | retorno                                  ';'                {$instr = $retorno.instr}
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
    : IF_TOK LP expression RP bloque                                        {
        $instr = SentenciasControl.NewIfInstruccion($expression.expr,$bloque.lista,nil,nil)
    }
    | IF_TOK LP expression RP bprincipal = bloque ELSE  belse = bloque      {
        $instr = SentenciasControl.NewIfInstruccion($expression.expr,$bprincipal.lista,nil,$belse.lista)
    }
    | IF_TOK LP expression RP bprincipal = bloque listaelseif ELSE  belse = bloque {
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
    : ELSE IF_TOK LP expression RP bloque   {$instr = SentenciasControl.NewIfInstruccion($expression.expr,$bloque.lista,nil,nil)}
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
    | FLOATTYPE                                                 {$tipo = entorno.FLOAT}
    | BOOLTYPE                                                  {$tipo = entorno.BOOLEAN}
    | VOIDTYPE                                                  {$tipo = entorno.VOID}
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
    | instancia                                                 {$expr = $instancia.expr} // new int[4]
    | arraydata                                                 {$expr = $arraydata.expr} // datos del arreglo

;

expr_rel returns[interfaces.Expresion expr]
    : opIz = expr_rel op=( MAYORIGUAL | MENORIGUAL | MENOR | MAYOR | IGUAL_IGUAL) opDe = expr_rel {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false)}
    | expr_arit  {$expr = $expr_arit.expr}
;

expr_arit returns[interfaces.Expresion expr]
    : '-' opU = expression                                      {$expr = expresion.NuevaOperacion($opU.expr,"-",nil,true)}
    | opIz = expr_arit op=('*'|'/') opDe = expr_arit            {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false)}
    | opIz = expr_arit op=('+'|'-') opDe = expr_arit            {$expr = expresion.NuevaOperacion($opIz.expr,$op.text,$opDe.expr,false)}
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

    | ID                                                        { $expr = expresion.NuevoIdentificador($ID.text)}

    | TRUE                                                      { $expr = expresion.NuevoPrimitivo(true,entorno.BOOLEAN) }
    | FALSE                                                     { $expr = expresion.NuevoPrimitivo(false,entorno.BOOLEAN) }

;

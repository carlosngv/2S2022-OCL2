package Simbolos

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/instrucciones"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"reflect"
	"strings"

	"github.com/colegno/arraylist"
)


type Funcion struct {
	entorno.Simbolo
	ListaParamsDecl    *arraylist.List
	ListaInstrucciones *arraylist.List

	Generado bool
}

func NewFuncion(nombre string, listaParams *arraylist.List, listaInstrucciones *arraylist.List, tipo entorno.TipoDato) Funcion {
	funcSimbolo := entorno.NewSimboloFuncion(0, 0, nombre, tipo, listaParams)

	return Funcion{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Simbolo:            funcSimbolo,
	}
}

func (f Funcion) EjecutarParametros(ent *entorno.Entorno, expresiones *arraylist.List, TEMPORAL_ENTORNO string, entRef *entorno.Entorno) (bool, string) {

	CODIGO_SALIDA := ""

	declaraciones := f.ListaParamsDecl.Clone()

	if declaraciones.Len() != expresiones.Len() {
		fmt.Println("Error en variables")
		return false, ""
	}

	for i := 0; i < declaraciones.Len(); i++ {

		pivoteDec := declaraciones.GetValue(i).(*instrucciones.Declaracion)
		pivoteExpr := expresiones.GetValue(i).(interfaces.Expresion)

		if pivoteDec.Referencia {

			pivoteDec.EntornoRef = entRef
			pivoteDec.ValorInicializacion3D = pivoteExpr.Obtener3DRef(entRef)

		} else {
			pivoteDec.ValorInicializacion3D = pivoteExpr.Obtener3D(entRef)
		}

		pivoteDec.DecFuncion = true
		pivoteDec.TemporalEntorno = TEMPORAL_ENTORNO

		CODIGO_SALIDA += pivoteDec.Get3D(ent)
	}

	return true, CODIGO_SALIDA
}

func (f Funcion) Get3D(ent *entorno.Entorno) string {

	etiquetaRetorno := Analizador.GeneradorGlobal.ObtenerEtiqueta()

	ENTORNO_FUNCION := entorno.NewEntorno("FUNCION", ent)
	CODIGO_FUNCION := ""

	CODIGO_FUNCION += fmt.Sprintf("void %s(){ \n", f.Identificador)


	f.generarParametros(&ENTORNO_FUNCION) // ? Genera las referencias en C3D de los parametros

	for i := 0; i < f.ListaInstrucciones.Len(); i++ {

		INSTR := f.ListaInstrucciones.GetValue(i)

		codigoINSTR := INSTR.(interfaces.Instruccion).Get3D(&ENTORNO_FUNCION)

		CODIGO_FUNCION += Analizador.GeneradorGlobal.Tabular(codigoINSTR) // ? Tabulamos y concatenamos el código 3D de cada instrucción
	}

	CODIGO_FUNCION += Analizador.GeneradorGlobal.TabularLinea(etiquetaRetorno + ": /* Etiqueta salida de la funcion */ \n", 1)
	CODIGO_FUNCION += Analizador.GeneradorGlobal.TabularLinea("return;\n", 1)
	CODIGO_FUNCION += "}"

	PRUEBA := string(CODIGO_FUNCION)

	CODIGO_FUNCION = strings.ReplaceAll(PRUEBA, "#RETURN", "goto " + etiquetaRetorno + ";")


	return CODIGO_FUNCION
}

func (this Funcion) generarParametros(ent *entorno.Entorno) {

	ENTORNO := entorno.NewEntorno("", nil)

	ENTORNO.Tamanio = 1

	if this.ListaParamsDecl.Len() > 0 {

		Analizador.GeneradorGlobal.Bloquear = true

		for i := 0; i < this.ListaParamsDecl.Len(); i++ {

			pivodeDec := this.ListaParamsDecl.GetValue(i)

			if reflect.TypeOf(pivodeDec) == reflect.TypeOf(instrucciones.NewDeclaracion(nil, entorno.NULL)) {
				fmt.Println("ENTRA ACA")
				DECLARACION := pivodeDec.(*instrucciones.Declaracion)

				if DECLARACION.Referencia {
					DECLARACION.Temporal_Ref = Analizador.GeneradorGlobal.ObtenerTemporalForzado()
				}

				DECLARACION.Get3D(&ENTORNO)

			}
		}

		Analizador.GeneradorGlobal.Bloquear = false

	}

	for ID, VARIABLE := range ENTORNO.Tabla {
		ent.AgregarSimbolo(ID, VARIABLE)
	}
	ent.Tamanio = ENTORNO.Tamanio

}

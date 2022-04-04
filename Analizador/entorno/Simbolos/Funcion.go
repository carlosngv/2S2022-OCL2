package Simbolos

import (
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

var retornoVal = [6][56]entorno.TipoDato{
	{entorno.INTEGER, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.STRING, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.BOOLEAN, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.VOID},
}

type Funcion struct {
	entorno.Simbolo
	ListaParamsDecl    *arraylist.List
	ListaInstrucciones *arraylist.List
	Acceso 				entorno.TipoModAccess
}

func NuevoFuncion(nombre string, listaParams *arraylist.List, listaInstrucciones *arraylist.List, tipo entorno.TipoDato, acceso entorno.TipoModAccess) Funcion {
	funcSimbolo := entorno.NuevoSimboloFuncion(0, 0, nombre, tipo, listaParams)

	nuevoItemTS := Analizador.TablaSimbolos{
		nombre,
		"Funcion",
		tipo,
		"Global",
		12,
		32,
	}

	Analizador.ListaTablaSimbolos = append(Analizador.ListaTablaSimbolos, nuevoItemTS)

	return Funcion{
		ListaInstrucciones: listaInstrucciones,
		ListaParamsDecl:    listaParams,
		Simbolo:            funcSimbolo,
		Acceso:				acceso,
	}
}

func (f Funcion) EjecutarParametros(ent *entorno.Entorno, expresiones *arraylist.List, entRef *entorno.Entorno) bool {

	return true
}

func (f Funcion) Get3D(ent *entorno.Entorno) string {

	etiquetaRetonro := Analizador.GeneradorGlobal.ObtenerEtiqueta()

	ENTORNO_FUNCION := entorno.NewEntorno("Funcion", ent)

	codigoFuncion := ""

	codigoFuncion += "void " + f.Identificador + " {\n\n"

	for i := 0; i < f.ListaInstrucciones.Len(); i++ {

		INSTR := f.ListaInstrucciones.GetValue(i)

		codigoINSTR := INSTR.(interfaces.Instruccion).Get3D(&ENTORNO_FUNCION)

		codigoFuncion += Analizador.GeneradorGlobal.Tabular(codigoINSTR)
	}

	codigoFuncion += Analizador.GeneradorGlobal.TabularLinea(etiquetaRetonro+"\n", 1)
	codigoFuncion += Analizador.GeneradorGlobal.TabularLinea("return\n", 1)

	codigoFuncion += "}"

	return codigoFuncion
}

package SentenciasControl

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/expresion"

	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
)

type MatchInstruccion struct {
	Condicion                   interfaces.Expresion
	ListaCases *arrayList.List
}

func NewMatchInstruccion(condicion interfaces.Expresion, listaCases *arrayList.List) MatchInstruccion {
	return MatchInstruccion{
		Condicion:  condicion,
		ListaCases: listaCases,
	}
}


func (mc MatchInstruccion) Get3D(ent *entorno.Entorno) string {

	casoDefault := ""
	numCasos := 0

	codigo := "/************ Switch Case ************/"
	etiquetaSalida := Analizador.GeneradorGlobal.ObtenerEtiqueta()
	etiquetaAux := Analizador.GeneradorGlobal.ObtenerEtiqueta()

	// ? Validando si existe un default case

	ultimoCase := mc.ListaCases.GetValue(mc.ListaCases.Len() - 1).(MatchCase)

	if(ultimoCase.ListaExpresiones.GetValue(0) == "_") {
		casoDefault = ultimoCase.Get3D(ent)
		// ? Se omite generar el ultimo caso (default)
		numCasos = mc.ListaCases.Len() - 1
	} else {
		numCasos = mc.ListaCases.Len()
	}


	for i := 0; i < numCasos; i++ {

		caseActual := mc.ListaCases.GetValue(i)
		expresionesCase := caseActual.(MatchCase).ListaExpresiones
		expresionCase := expresionesCase.GetValue(0).(interfaces.Expresion)

		condicion := expresion.NewOperacion(mc.Condicion,"==", expresionCase, false, entorno.NULL)
		codigo += etiquetaAux + ":"
		expresion := condicion.Obtener3D(ent)
		if expresion.Tipo != entorno.BOOLEAN {
			// ! ERROR
			return ""
		}

		codigo += expresion.Codigo
		codigo += fmt.Sprintf("\n %s: \n", expresion.EtiquetaV)
		codigo += caseActual.(MatchCase).Get3D(ent)
		codigo += Analizador.GeneradorGlobal.TabularLinea("goto " + etiquetaSalida + ";\n", 1)
		etiquetaAux = expresion.EtiquetaF
	}

	codigo += etiquetaAux + ":\n"
	if casoDefault != "" {
		codigo += "\n" + casoDefault + "\n"
	}

	codigo += etiquetaSalida + ": \n"

	return Analizador.GeneradorGlobal.Tabular(codigo)
}

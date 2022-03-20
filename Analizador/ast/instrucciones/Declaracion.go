package instrucciones

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	"github.com/colegno/arraylist"
)

var tipoDef = [5][5]entorno.TipoDato{
	{entorno.INTEGER, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.FLOAT, entorno.FLOAT, entorno.NULL, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.STRING, entorno.NULL, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.BOOLEAN, entorno.NULL},
	{entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL, entorno.NULL},
}

type Declaracion struct {
	ValorInicializacion interfaces.Expresion
	TipoVariables       entorno.TipoDato
	ListaVars           *arraylist.List
	EsMutable    	    bool
	Linea 				int
	Columna				int
}

func NuevaDeclaracion(listaVars *arraylist.List, tipoVariables entorno.TipoDato) *Declaracion {
	return &Declaracion{
		TipoVariables: tipoVariables,
		ListaVars:     listaVars,

	}
}
func NuevaDeclaracionInicializacion(listaVars *arraylist.List, tipoVariables entorno.TipoDato, valInicial interfaces.Expresion, esMutable bool, linea int, columna int) *Declaracion {
	return &Declaracion{
		TipoVariables:       tipoVariables,
		ListaVars:           listaVars,
		ValorInicializacion: valInicial,
		EsMutable:			 esMutable,
		Linea: 				 linea,
		Columna: 			 columna,
	}
}

func (dec *Declaracion) Ejecutar(ent entorno.Entorno) interface{} {

	/*

		int a,b,c,d;

	*/

	if dec.esInicializado() {
		if dec.ListaVars.Len() > 1 {
			// TODO: ALMACENAR ERROR SINTACTICO
			return nil
		}

		var tipoResultante entorno.TipoDato

		retornoExpresion := dec.ValorInicializacion.ObtenerValor(ent)

		tipoExpresion := retornoExpresion.Tipo
		tipoVariable := dec.TipoVariables

		fmt.Printf("\nTIPO DE EXPRESION A DECLARAR: %v", tipoExpresion)
		fmt.Printf("\nLinea: %v", dec.Linea)
		fmt.Printf("\nColumna: %v", dec.Columna)

		/*
			Inferencia de tipos
			En caso el tipo de la variable venga NULL, al tipo
			resultante se le asigna el valor del tipo de la expresión.
		*/
		if tipoVariable != entorno.NULL {
			tipoResultante = tipoDef[tipoVariable][tipoExpresion]
		} else {
			tipoResultante = tipoExpresion
		}

		if tipoResultante == entorno.NULL {
			return nil
		}

		for i := 0; i < dec.ListaVars.Len(); i++ {

			varDeclarar := dec.ListaVars.GetValue(i).(expresion.Identificador)

			if ent.ExisteSimbolo(varDeclarar.Identificador) {
				// TODO: ALMACENAR ERROR SINTACTICO
				nuevoError := Analizador.NewErrorSemantico(
					dec.Linea,
					dec.Columna,
					"Error Semántico, la variable " + varDeclarar.Identificador + " ya está declarada.",
				)
				Analizador.ListaErrores.Add(nuevoError)

			} else {

				simboloTabla := entorno.NuevoSimboloIdentificadorValor(
					0,
					0,
					varDeclarar.Identificador,
					retornoExpresion.Valor,
					tipoResultante,
					dec.EsMutable)

				ent.AgregarSimbolo(varDeclarar.Identificador, simboloTabla)

			}

		}

	}

	return nil
}

func (dec *Declaracion) esInicializado() bool {
	return dec.ValorInicializacion != nil
}

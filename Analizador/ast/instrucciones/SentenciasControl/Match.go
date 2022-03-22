package SentenciasControl

import (
	"fmt"
	"p1/packages/Analizador"
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

func (m MatchInstruccion) Ejecutar(ent entorno.Entorno) interface{} {

	fmt.Printf("\nMATCH CASE: %v\n", m)

	// Validando que ultimo case sea el default
	ultimoCase := m.ListaCases.GetValue(m.ListaCases.Len() - 1).(MatchCase)
	ultimaListaExpr := ultimoCase.ListaExpresiones.Clone()
	ultimExpr := ultimaListaExpr.GetValue(0).(string)
	ultimaListaInstr := ultimoCase.ListaInstrucciones.Clone()

	fmt.Printf("\nULTIMA EXPRESION: %v\n", ultimExpr)

	// Validando que venga caso por defecto.
	if ultimExpr != "_" {
		nuevoError := Analizador.NewErrorSemantico(
			30,
			10,
			"Error Semántico, el caso por defecto no se encuentra defintido..",
		)
		Analizador.ListaErrores.Add(nuevoError)
		return nil
	}


	entornoNuevoMatch := entorno.NewEntorno("MATCH", &ent)

	// Iteramos todos los casos, se omite el ultimo (caso por defecto)
	for i := 0; i < m.ListaCases.Len() - 1; i++ {

		matchCase := m.ListaCases.GetValue(i).(MatchCase) // Case actual
		matchCaseExpresiones := matchCase.ListaExpresiones.Clone()
		matchCaseInstrucciones := matchCase.ListaInstrucciones.Clone()

		// loop de la lista de expresiones del match
		for j := 0; j < matchCaseExpresiones.Len(); j++ {

			expresionActual := matchCaseExpresiones.GetValue(j).(interfaces.Expresion)
			retornoActual := expresionActual.ObtenerValor(ent)

			fmt.Printf("\nRetorno Actual: %v\n", retornoActual.Valor)

			// Los tipos no coinciden (Case y condición)
			if m.Condicion.ObtenerValor(ent).Tipo != retornoActual.Tipo {
				nuevoError := Analizador.NewErrorSemantico(
					30,
					10,
					"Error Semántico, el tipo de la condición no coincide con el tipo del case.",
				)
				Analizador.ListaErrores.Add(nuevoError)
				return nil
			}

			// Hace match con el case
			if m.Condicion.ObtenerValor(ent).Valor == retornoActual.Valor {
				for k := 0; k < matchCaseInstrucciones.Len(); k++ {

					instr := matchCaseInstrucciones.GetValue(k).(interfaces.Instruccion)
					instr.Ejecutar(entornoNuevoMatch)
				}
				return nil
			}
		}
	}


	for r := 0; r < ultimaListaInstr.Len(); r++ {

		instr := ultimaListaInstr.GetValue(r).(interfaces.Instruccion)

		instr.Ejecutar(entornoNuevoMatch)
	}

	return nil
}

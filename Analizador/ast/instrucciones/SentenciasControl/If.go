package SentenciasControl

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
)

type IfInstruccion struct {
	Condicion                   interfaces.Expresion
	ListaInstruccionesPrincipal *arrayList.List
	ListaIfElse                 *arrayList.List
	ListaInstruccionesElse      *arrayList.List
}

func NewIfInstruccion(condicion interfaces.Expresion, listaInstruccionesPrincipal *arrayList.List, listaIfElse *arrayList.List, listaInstruccionesElse *arrayList.List) IfInstruccion {
	return IfInstruccion{
		Condicion:                   condicion,
		ListaInstruccionesPrincipal: listaInstruccionesPrincipal,
		ListaIfElse:                 listaIfElse,
		ListaInstruccionesElse:      listaInstruccionesElse,
	}
}

func (i IfInstruccion) Ejecutar(ent entorno.Entorno) interface{} {

	retornoCondicionPrincipal := i.Condicion.ObtenerValor(ent)


	if retornoCondicionPrincipal.Tipo != entorno.BOOLEAN {
		//Analizador.Salida += "\ntipo no bool\n"
		// TODO: Almacenar error sintáctico
		return nil
	}

	if retornoCondicionPrincipal.Valor.(bool) {

		entornoNuevoIf := entorno.NewEntorno("IF", &ent)

		for j := 0; j < i.ListaInstruccionesPrincipal.Len(); j++ {

			instr := i.ListaInstruccionesPrincipal.GetValue(j).(interfaces.Instruccion)

			retorno := instr.Ejecutar(entornoNuevoIf)
			if retorno != nil {
				if retorno.(entorno.TipoRetorno).Tipo == entorno.VOID {
					return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
				}
			}
		}

	} else {

		if i.ListaIfElse != nil {
			for _, elseIf_instruccion := range i.ListaIfElse.ToArray() {

				nuevoIf := elseIf_instruccion.(IfInstruccion)

				retornoCondicionNuevoIf := nuevoIf.Condicion.ObtenerValor(ent)

				if retornoCondicionNuevoIf.Tipo != entorno.BOOLEAN {
					return nil
				}


				if retornoCondicionNuevoIf.Valor.(bool) {

					entornoNuevoElseIf := entorno.NewEntorno("Else if", &ent)

					for j := 0; j < nuevoIf.ListaInstruccionesPrincipal.Len(); j++ {

						instr := nuevoIf.ListaInstruccionesPrincipal.GetValue(j).(interfaces.Instruccion)

						retorno := instr.Ejecutar(entornoNuevoElseIf)
						if retorno != nil {
							if retorno.(entorno.TipoRetorno).Tipo == entorno.VOID {
								return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
							}
						}
					}

					return nil
				}

			}
		}

		if i.ListaInstruccionesElse != nil {

			entornoElseFinal := entorno.NewEntorno("entorno Else final", &ent)

			for j := 0; j < i.ListaInstruccionesElse.Len(); j++ {

				instr := i.ListaInstruccionesElse.GetValue(j).(interfaces.Instruccion)

				retorno := instr.Ejecutar(entornoElseFinal)
				if retorno != nil {
					if retorno.(entorno.TipoRetorno).Tipo == entorno.VOID {
						return entorno.TipoRetorno{Tipo: entorno.VOID, Valor: 0}
					}
				}
			}

		}

	}

	return nil
}

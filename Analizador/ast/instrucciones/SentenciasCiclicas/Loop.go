package SentenciasCiclicas

import (
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
)

/*

	Es un búcle infinito. Unicamente puede
	pararse con sentencias de transferencia.


*/

type LoopInstruccion struct {
	ListaInstrucciones *arrayList.List
}

func NewLoopInstruccion(listaInstrucciones *arrayList.List) LoopInstruccion {
	return LoopInstruccion{
		ListaInstrucciones: listaInstrucciones,
	}
}

func (l LoopInstruccion) Ejecutar(ent entorno.Entorno) interface{} {

	var retorno interface{}
	sale := false
	for {
		// nuevoEntornoLoop := entorno.NewEntorno("LOOP", &ent)
		for i := 0; i < l.ListaInstrucciones.Len(); i++ {
			instr := l.ListaInstrucciones.GetValue(i).(interfaces.Instruccion)
			retorno = instr.Ejecutar(ent)

			if retorno != nil {
				if retorno.(entorno.TipoRetorno).Tipo == entorno.VOID {
					sale = true
					break
				}
			}

		}
		if sale {
			break
		}
	}

	return nil
 }

package SentenciasCiclicas

import (
	"fmt"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"

	arrayList "github.com/colegno/arraylist"
)

type WhileInstruccion struct {
	Condicion          interfaces.Expresion
	ListaInstrucciones *arrayList.List
}

func NewWhileInstruccion(condicion interfaces.Expresion, listaInstrucciones *arrayList.List) WhileInstruccion {
	return WhileInstruccion{
		Condicion:  condicion,
		ListaInstrucciones: listaInstrucciones,
	}
}

func (w WhileInstruccion) Ejecutar(ent entorno.Entorno) interface{} {
	var resultado entorno.TipoRetorno

	for {
		resultado = w.Condicion.ObtenerValor(ent)

		if resultado.Valor != true {
			// entTmp := entorno.NewEntorno("WHILE", &ent)
			for _, s := range w.ListaInstrucciones.ToArray(){
				s.(interfaces.Instruccion).Ejecutar(ent)
				fmt.Printf("\nInstr While: %v\n", s)
			}
		} else {
			break
		}
	}

	return resultado.Valor
}

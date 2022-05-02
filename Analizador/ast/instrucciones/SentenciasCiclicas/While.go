package SentenciasCiclicas

import (
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/expresion"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"strings"

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

func (wh WhileInstruccion) Get3D(ent *entorno.Entorno) string {

	codigo := "\n/******** Codigo while *********/\n"

	etiquetaInicio := Analizador.GeneradorGlobal.ObtenerEtiqueta()
	expresionCondicion := wh.Condicion.(expresion.Operacion)
	expresionCondicion.EtiquetaVerdadera = Analizador.GeneradorGlobal.ObtenerEtiqueta()
	expresionCondicion.EtiquetaFalsa = Analizador.GeneradorGlobal.ObtenerEtiqueta()

	resultadoCondicion := expresionCondicion.Obtener3D(ent)

	codigo += etiquetaInicio + ": /* Etiqueta de inicio (While) */\n"
	codigo += "/* Codigo condicion (While) */\n"+  resultadoCondicion.Codigo
	codigo += resultadoCondicion.EtiquetaV + ": /* Etiqueta verdadera (While) */\n"

	for i := 0; i < wh.ListaInstrucciones.Len(); i++ {
		instruccionActual := wh.ListaInstrucciones.GetValue(i).(interfaces.Instruccion)
		codigo += Analizador.GeneradorGlobal.Tabular(instruccionActual.Get3D(ent))
	}

	codigo += "goto " + etiquetaInicio + "; /* regresa al inicio */\n"
	codigo += resultadoCondicion.EtiquetaF + ":\n"
	codigo += "/******** Fin ciclo While *********/"

	codigoAux := string(codigo)

	codigo = strings.ReplaceAll(codigoAux, "#RETURN", "goto " + resultadoCondicion.EtiquetaF + ";")
	codigo = strings.ReplaceAll(codigoAux, "#BREAK", "goto " + resultadoCondicion.EtiquetaF + ";")
	codigo = strings.ReplaceAll(codigoAux, "#CONTINUE", "goto " + etiquetaInicio + ";")

	return codigo
}

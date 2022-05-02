package funcionesNativas

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"strings"
)

type  ValorAbs struct {
	ID 	  string
	Temporal string
	Linea int
	Columna int
}

func NewValorAbs(id string, linea int, columna int) *ValorAbs {
	fmt.Println("Crea abs")
	return &ValorAbs{
		ID: id,
		Temporal: "",
		Linea: linea,
		Columna: columna,
	}
}

func (abs ValorAbs) Get3D(ent *entorno.Entorno) string {

	codigo := "\n/****** Inicia abs ******/\n"





	existeSimbolo := ent.ExisteSimbolo(abs.ID)

	if !existeSimbolo {
		// ! ERROR
		return ""
	}

	varOperar := obtenerPosicionVariable(ent, abs.ID) // ? retorna el result3D con el temporal donde se posiciona el valor del identificador, en caso exista.

	codigo += varOperar.Codigo
	temporalValor := Analizador.GeneradorGlobal.ObtenerTemporal()
	temporalResultado := ""
	temporalResultado = Analizador.GeneradorGlobal.ObtenerTemporal()
	abs.Temporal = temporalResultado

	if varOperar.Tipo == entorno.FLOAT || varOperar.Tipo == entorno.INTEGER {


		codigo += fmt.Sprintf("%s = Stack[(int) %s];\n", temporalValor, varOperar.Temporal) // abs del valor
		codigo += "/***** abs de: " + abs.ID + " *****/\n"
		codigo += fmt.Sprintf("%s = fabs(%s);\n", temporalResultado, temporalValor) // abs del valor

	} else {
		// ! ERROR, el tipo de la variable no es válido.

		return ""
	}

	codigo += "\n/****** Finaliza abs ******/\n"

	return codigo + "TEMPORAL_ABS" + temporalResultado
}


func (abs ValorAbs) Obtener3D(ent *entorno.Entorno) entorno.Result3D {
	valorabs := entorno.Result3D{}
	res := strings.Split(abs.Get3D(ent), "TEMPORAL_ABS")
	valorabs.Codigo = res[0]
	valorabs.Temporal = res[1]
	valorabs.Tipo = entorno.FLOAT
	return valorabs

}

func (this ValorAbs) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}

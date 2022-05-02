package funcionesNativas

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
	"strings"
)

type  ValorSqrt struct {
	ID 	  string
	Temporal string
	Linea int
	Columna int
}

func NewValorSqrt(id string, linea int, columna int) *ValorSqrt {
	fmt.Println("Crea sqrt")
	return &ValorSqrt{
		ID: id,
		Temporal: "",
		Linea: linea,
		Columna: columna,
	}
}

func (sqrt ValorSqrt) Get3D(ent *entorno.Entorno) string {

	codigo := "\n/****** Inicia SQRT ******/\n"





	existeSimbolo := ent.ExisteSimbolo(sqrt.ID)

	if !existeSimbolo {
		// ! ERROR
		return ""
	}

	varOperar := obtenerPosicionVariable(ent, sqrt.ID) // ? retorna el result3D con el temporal donde se posiciona el valor del identificador, en caso exista.

	codigo += varOperar.Codigo
	temporalValor := Analizador.GeneradorGlobal.ObtenerTemporal()
	temporalResultado := ""
	temporalResultado = Analizador.GeneradorGlobal.ObtenerTemporal()
	sqrt.Temporal = temporalResultado

	if varOperar.Tipo == entorno.FLOAT || varOperar.Tipo == entorno.INTEGER {


		codigo += fmt.Sprintf("%s = Stack[(int) %s];\n", temporalValor, varOperar.Temporal) // SQRT del valor
		codigo += "/***** Sqrt de: " + sqrt.ID + " *****/\n"
		codigo += fmt.Sprintf("%s = sqrt(%s);\n", temporalResultado, temporalValor) // SQRT del valor
		fmt.Printf("Temporal2: %v", sqrt.Temporal)

	} else {
		// ! ERROR, el tipo de la variable no es válido.

		return ""
	}

	codigo += "\n/****** Finaliza SQRT ******/\n"

	return codigo + "TEMPORAL_SQRT" + temporalResultado
}


func (sqrt ValorSqrt) Obtener3D(ent *entorno.Entorno) entorno.Result3D {
	valorSqrt := entorno.Result3D{}
	res := strings.Split(sqrt.Get3D(ent), "TEMPORAL_SQRT")
	valorSqrt.Codigo = res[0]
	valorSqrt.Temporal = res[1]
	fmt.Printf("Temporal: %v", valorSqrt.Temporal)
	valorSqrt.Tipo = entorno.FLOAT
	return valorSqrt

}

func (this ValorSqrt) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}

func obtenerPosicionVariable(ent *entorno.Entorno, identificadorVariable string) entorno.Result3D {
	result := entorno.Result3D{}

	temporal1 := Analizador.GeneradorGlobal.ObtenerTemporal()

	result.Codigo = "/****** Buscando posicion del identificador: " + identificadorVariable + " (Busqueda posicion SQRT) *******/\n"
	result.Codigo += temporal1 + " = SP;\n" // ? Nos posicionamos en el stack (entorno actual)

	for entActual := ent; entActual != nil; entActual = entActual.EntAnterior {

		for key, simbolo := range entActual.Tabla {

			// ? Hacemos match del identificador del existente en la tabla
			if key == identificadorVariable {
				simboloActual := simbolo.(entorno.Simbolo)
				result.Codigo = fmt.Sprintf("%s = %s + %d;\n", temporal1, temporal1, simboloActual.Posicion) // ? Nos posicionamos en la dirección de la variable encontrada
				if simboloActual.EsReferencia {
					// ? Si es referencia hacemos doble acceso
					temporal2 := Analizador.GeneradorGlobal.ObtenerTemporal()
					result.Temporal = temporal2
					result.Codigo += fmt.Sprintf("%s = Stack[(int) %s];\n", temporal2, temporal1) // ? Posición de la variable referenciada

				} else {
					result.Temporal = temporal1
				}

				result.Codigo += "/***** " + identificadorVariable + " *****/\n"

				result.Tipo = simboloActual.Tipo
				return result
			}
		}

		if entActual.EntAnterior != nil {
			result.Codigo += temporal1 + " = 0; /*Retrocedemos entre los entornos*/\n";
		}

	}

	return result
}

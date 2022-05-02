package asignacion

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Asignacion struct {
	ID           	string
	NuevoValor 		interfaces.Expresion
	Valor 			interface{} //asignacion con un valor objeto pasado desde alguna instruccion
	Linea			int
	Columna			int

	// NUEVOS
	EnHeap			string
	EstaEnObjeto    bool

}

func NewAsignacion(id string, nuevoValor interfaces.Expresion, linea int, columna int ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nuevoValor,
		Valor:			nil,
		Linea:			linea,
		Columna:		columna,
		EnHeap:  		"",
		EstaEnObjeto:    true,
	}
}

func NewAsignacionValor(id string, valor interface{} ) Asignacion{
	return Asignacion{
		ID:				id,
		NuevoValor:		nil,
		Valor:			valor,
		Linea:			0,
		Columna:		0,
		EnHeap:  		"",
		EstaEnObjeto:    true,
	}
}




func (asignacion Asignacion) Get3D(ent *entorno.Entorno) string {

	codigo := "/***** Inicia Asginacion ******/\n"

	fmt.Printf("Valor asignación: %v", asignacion.Valor)

	valorExpresion := asignacion.NuevoValor.(interfaces.Expresion).Obtener3D(ent)
	simbolo := ent.ObtenerSimbolo(asignacion.ID).(entorno.Simbolo)


	codigo += "/***** Finaliza Asginacion ******/\n"




	// // TODO: MANEJAR SI ES UN VALOR CONSTANTE

	// ? Validando tipos
	if !igualdadTipo(simbolo, valorExpresion.Tipo) {
		// ! ERROR, tipos incompatibles
		return ""
	}

	codigo += valorExpresion.Codigo

	// ? Obteniendo la posición del stack de la variable
	varAsignar := obtenerPosicionVariable(ent, asignacion.ID, &asignacion)

	codigo += varAsignar.Codigo
	if simbolo.EsReferencia {

		etiqueta1 := Analizador.GeneradorGlobal.ObtenerEtiqueta()
		etiqueta2 := Analizador.GeneradorGlobal.ObtenerEtiqueta()

		codigo += "/* Comprobando posición de referencia (Asignacion) */\n"
		codigo += fmt.Sprintf("if( %s == 1 ) goto %s;\n", simbolo.Temporal_REF, etiqueta1)
		codigo += fmt.Sprintf("%s = Stack[(int)%s]; /* Valor de la referencia */\n", varAsignar.Temporal, valorExpresion.Temporal)
		codigo += fmt.Sprintf("goto %s;\n", etiqueta2)
		codigo += fmt.Sprintf("%s: /* Etiqueta = 1 --> Buscar en Heap */ \n", etiqueta1)
		codigo += fmt.Sprintf("%s = Heap[(int)%s]; /* Valor de la referencia */\n", varAsignar.Temporal, valorExpresion.Temporal)
		codigo += fmt.Sprintf("%s: /* Etiqueta de salida */ \n", etiqueta2)

	} else {
		codigo += fmt.Sprintf("Stack[(int) %s] = %s;", varAsignar.Temporal, valorExpresion.Temporal) // ? A la posición de la variable asignar, le asignamos el temporal que guarda el valor de la expresión.
	}




	// if simbolo.Tipo == entorno.OBJETO {

	// } else {
	// 	// Es una asignación ID = PRIMITIVO
	// 	if asignacion.EnHeap == "" {
	// 		codigo += fmt.Sprintf("Stack[(int) %s] = %s", varAsignar.Temporal, valorExpresion.Temporal)
	// 	} else {
	// 		etiqueta1 := Analizador.GeneradorGlobal.ObtenerEtiqueta()
	// 		etiqueta2 := Analizador.GeneradorGlobal.ObtenerEtiqueta()


	// 	}
	// }





	return codigo
}

func obtenerPosicionVariable(ent *entorno.Entorno, identificadorVariable string, asignacion *Asignacion) entorno.Result3D {
	result := entorno.Result3D{}

	temporal1 := Analizador.GeneradorGlobal.ObtenerTemporal()

	result.Codigo = "/****** Buscando posicion del identificador: " + identificadorVariable + " (Busqueda posicion ASIGNACION) *******/\n"
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

					asignacion.EnHeap = simboloActual.Temporal_REF // ? Almacenamos
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

func verificarBoolean(reBooleano entorno.Result3D ) {

	// SE VALIDA UNA CONDICION DE LA FORMA
	//
	//      var = true and false;   -> lo cual genera una condicion if y no retorna un termporal
	//      por lo tanto generamos el codigo para obtener el valor true(1) o false(0)

	if reBooleano.Temporal == "" && reBooleano.Tipo == entorno.BOOLEAN {
		reBooleano.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()

		reBooleano.Codigo += reBooleano.EtiquetaV + ": \n"
		reBooleano.Codigo += Analizador.GeneradorGlobal.TabularLinea( reBooleano.Temporal + " = 1; \n", 1)
		reBooleano.Codigo += reBooleano.EtiquetaF + ": \n"
		reBooleano.Codigo += Analizador.GeneradorGlobal.TabularLinea( reBooleano.Temporal + " = 0; \n", 1)
	}

}

func igualdadTipo(simbolo entorno.Simbolo, tipo entorno.TipoDato) bool { // El tipoDato viene del result3D del valor

	if simbolo.Tipo != tipo {
		// ! ERROR, tipos incompatibles
		return false
	}

	return true
}

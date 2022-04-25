package SentenciasTransferencia

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
)

type Return struct {
	Tipo   entorno.TipoDato
	Salida interfaces.Expresion
}


func NewReturn(tipo entorno.TipoDato, salida interfaces.Expresion) Return {

	if salida != nil {
		return Return{
			Tipo:   tipo,
			Salida: salida,
		}
	}

	return Return{
		Tipo:   tipo,
		Salida: nil,
	}
}


func (r Return) Get3D(ent *entorno.Entorno) string {

	/*
	* 	En el entorno actual, el return de una función siempre lo ubicamos en la posición 0 relativa
	* 	al mismo entorno.
	*/

	codigo := "/* Código para el return */\n"
	temporalReturn := Analizador.GeneradorGlobal.ObtenerTemporal()

	// * Capturamos el tempora en el principio del entorno
	codigo += fmt.Sprintf("%s = SP + 0;\n", temporalReturn)
	codigo += "#RETURN \n"

	if r.Salida == nil {
		// * Como no retorna nada, asignamos un -1 en la posición del return
		codigo +=  fmt.Sprintf("Stack[(int) %s] = -1;", temporalReturn)
		} else {
			// * Extraemos el código de la expresión y se lo asignamos a la posición del return
			expresionRetorno := validarExpresion(r.Salida, ent)
			codigo += expresionRetorno.Codigo
			codigo += fmt.Sprintf("Stack[(int) %s]= %s;", temporalReturn, expresionRetorno.Temporal)
			codigo += "#RETURN \n"
	}

	return Analizador.GeneradorGlobal.Tabular(codigo)
}

func (r Return) Obtener3D(ent *entorno.Entorno) entorno.Result3D {
	retorno := entorno.Result3D{}
	retorno.Codigo = r.Get3D(ent)
	retorno.Temporal = Analizador.GeneradorGlobal.ObtenerTemporal()
	retorno.Tipo = r.Tipo
	return retorno
}


func validarExpresion(expresionSalida interfaces.Expresion, ent *entorno.Entorno) entorno.Result3D {
	resultadoExpresion := expresionSalida.Obtener3D(ent)

	/*
		TODO: En caso de que sea necesario, agregar validación
	*/

	return resultadoExpresion
}

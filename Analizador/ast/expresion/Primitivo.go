package expresion

import (
	"fmt"
	"p1/packages/Analizador"
	"p1/packages/Analizador/entorno"
)

type Primitivo struct {
	Valor interface{}
	Tipo entorno.TipoDato
}


func (p Primitivo) Obtener3D(ent *entorno.Entorno) entorno.Result3D {

	resultadoNuevo := entorno.Result3D{}

	if p.Tipo == entorno.BOOLEAN {

		valor := ""
		fmt.Printf("VALOR PRIMITIVO: %v", p.Valor)
		if p.Valor.(bool) == true {
			valor = "1"
		} else {
			valor = "0"
		}

		resultadoNuevo.Codigo = ""
		resultadoNuevo.Temporal = fmt.Sprint(valor)
		resultadoNuevo.Tipo = p.Tipo

	} else if p.Tipo == entorno.INTEGER {

		resultadoNuevo.Codigo = ""
		resultadoNuevo.Temporal = fmt.Sprint(p.Valor)
		resultadoNuevo.Tipo = p.Tipo

	} else if p.Tipo == entorno.CHAR {

		temporal := Analizador.GeneradorGlobal.ObtenerTemporal()
		resultadoNuevo.Tipo = entorno.STRING
		resultadoNuevo.Temporal = temporal // Dirección en donde se guardará el caracter
		resultadoNuevo.Codigo += "/* Almacenando caracter */\n"
		resultadoNuevo.Codigo += fmt.Sprintf("%s = HP;", temporal)
		stringPivote := fmt.Sprint(p.Valor)

		for _, caracter := range stringPivote {
			resultadoNuevo.Codigo += "Heap[HP] = " + fmt.Sprint(caracter)  + ";" + " // Caracter: " + string(caracter) + "\n"
			resultadoNuevo.Codigo += "HP = HP + 1; \n"
		}

		resultadoNuevo.Codigo += "Heap[HP] = 0;\n " // ? Asignamos un 0 luego de guardar los caracterers en sus espacios dentro del heap
													// ? que servirá para indicarnos que en ese ultimo espacio termina de almacenar el string
		resultadoNuevo.Codigo += "HP = HP + 1;\n" // ? Corremos el puntero Heap fuera de donde se almacena el string.
		resultadoNuevo.Codigo += "/* Fin de caracter */\n"

		return resultadoNuevo


	} else if p.Tipo == entorno.STRING {

		temporal := Analizador.GeneradorGlobal.ObtenerTemporal()

		resultadoNuevo.Temporal = temporal
		resultadoNuevo.Tipo = entorno.STRING

		resultadoNuevo.Codigo += "/* Almacenamiento de una cadena */\n"
		resultadoNuevo.Codigo += temporal + " = HP;\n"

		stringPivote := fmt.Sprint(p.Valor)

		for _, caracter := range stringPivote {

			resultadoNuevo.Codigo += "Heap[HP] = " + fmt.Sprint(caracter) + ";" + " // Letra: " + string(caracter) + "\n"
			resultadoNuevo.Codigo += "HP = HP + 1; \n"
		}

		resultadoNuevo.Codigo += "Heap[HP] = 0;\n "
		resultadoNuevo.Codigo += "HP = HP + 1;\n"
		resultadoNuevo.Codigo += "/*Fin de cadena*/\n"

		return resultadoNuevo
	}

	return resultadoNuevo
}

func NewPrimitivo(val interface{}, tipo entorno.TipoDato) Primitivo {
	e := Primitivo{val, tipo}
	return e
}

func (this Primitivo) Obtener3DRef(ent *entorno.Entorno) entorno.Result3D {
	return entorno.Result3D{}
}

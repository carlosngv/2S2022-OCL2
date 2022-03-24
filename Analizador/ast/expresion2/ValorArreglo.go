package expresion2

import (
	"fmt"
	"p1/packages/Analizador/ast/interfaces"
	"p1/packages/Analizador/entorno"
	"p1/packages/Analizador/entorno/Simbolos"

	arrayList "github.com/colegno/arraylist"
)

type ValorArreglo struct {
	Expresiones *arrayList.List
}

/*
	Es una expresión. Alternativa a la instancia.
	Unicamente recibe la lista de expresiones, cada expresión puede ser un nuevo arreglo o valores primitivos.

	Se enfoca en la data del arreglo, sus valores.
*/

func NewValorArreglo(expresiones *arrayList.List) ValorArreglo {

	return ValorArreglo{Expresiones: expresiones}

}


func (v ValorArreglo) ObtenerValor(ent entorno.Entorno) entorno.TipoRetorno {

	data, tipo := v.ObtenerData(ent)

	return entorno.TipoRetorno{Valor: data, Tipo: tipo}

}


func (v ValorArreglo) ObtenerData(ent entorno.Entorno) (interface{}, entorno.TipoDato) {

	/*
		Se obtiene el valor de cada expresión.

			- En la lista data, se almacenan los valores de cada expresión.
			-


	*/


	tipo := entorno.NULL
	data := arrayList.New()

	for i := 0; i < v.Expresiones.Len(); i++ {
		Expr := v.Expresiones.GetValue(i).(interfaces.Expresion)
		ValorExpr := Expr.ObtenerValor(ent)

		if i == 0 {
			// Unicamente en la primera iteración
			tipo = ValorExpr.Tipo
			data.Add(ValorExpr)
		} else {
			/*
				En las siguientes iteraciones se compara el tipo del primer valor
				con el tipo de las siguientes iteraciones. Si sus tipos no
				coinciden: Error sintáctico y return.
			*/
			if tipo != ValorExpr.Tipo {
				fmt.Println("ERROR, tipo de dato no coincide")
				return nil, entorno.NULL
			}
			data.Add(ValorExpr)
		}

	}

	/*

	*/

	ListaIntDimensiones := arrayList.New()
	ListaIntDimensiones.Add(data.Len())

	TipoDatos := entorno.NULL

	s := make([]interface{}, data.Len())

	for i := 0; i < data.Len(); i++ {

		dato := data.GetValue(i)
		valorDato := dato.(entorno.TipoRetorno)

		if valorDato.Tipo == entorno.NULL {
			fmt.Println("ERROR, tipo de dato nulo")
			return nil, entorno.NULL
		}

		/*
			Se valida {4, 4, 4}
			Se valida que las posiciones no sean arreglos.
			Es decir, se manejan unicamente primitivos.
		*/
		if valorDato.Tipo != entorno.ARREGLO {

			// Se almacena el tipo del primer valor para comparar el tipo de los siguientes valores
			if i == 0 {
				TipoDatos = valorDato.Tipo
			}   //else {
				//if TipoDatos != valorDato.Tipo {
				//	fmt.Println("ERROR, tipo de datos no coinciden")
				//	return nil, entorno.NULL
				//}
				//}
			s[i] = valorDato.Valor
			continue
		}

		// En el código de abajo se maneja en caso el tipo sea ARREGLO

		valorObjeto := valorDato.Valor.(entorno.TipoRetorno) // Como se habían manejado TipoRetornos anidados, de su valor se extrae su tipo de primitivo. El tipo del array
		ObjectoArreglo := valorObjeto.Valor.(Simbolos.ObjetoArray) //

		/*
			Se valida que el tipo del arreglo sea igual en cada posición.

		*/
		if i == 0 {
			TipoDatos = valorObjeto.Tipo
			ListaIntDimensiones.AddAll(ObjectoArreglo.ListaIntDimensiones.ToArray())
		}  //else {
			//if TipoDatos != valorObjeto.Tipo {

			//	fmt.Println("Error4")
			//	return nil, entorno.NULL
			//}
		//}

		s[i] = ObjectoArreglo.Valores

	}

	objeto := Simbolos.NewObjetoArray("", entorno.INTEGER, s, ListaIntDimensiones)

	objetoVal := entorno.TipoRetorno{
		Valor: objeto,
		Tipo:  TipoDatos,
	}

	return objetoVal, entorno.ARREGLO

}

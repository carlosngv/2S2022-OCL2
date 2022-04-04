package entorno

type TipoDato int
type TipoModAccess int

const (
	INTEGER TipoDato = iota			// 0
	FLOAT							// 1
	STRING							// 2
	STRING2 // &str					// 3
 	CHAR							// 4
	USIZE							// 5
	BOOLEAN							// 6
	NULL							// 7
	VOID							// 8
	ARREGLO							// 9
	VECTOR							// 10
	OBJETO							// 11
)

const (
	PUBLIC TipoModAccess = iota
	PRIVATE
)

type TipoRetorno struct {
	Tipo TipoDato
	Valor interface{}
}


type Result3D struct {
	Tipo 		TipoDato
	Codigo 		string
	Temporal 	string
	EtiquetaV	string
	EtiquetaF	string
}

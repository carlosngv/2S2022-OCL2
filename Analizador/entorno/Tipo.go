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
	OBJETO							// 10
)

const (
	PUBLIC TipoModAccess = iota
	PRIVATE
)

type TipoRetorno struct {
	Tipo TipoDato
	Valor interface{}
}

package entorno

type TipoDato int
type TipoModAccess int

const (
	INTEGER TipoDato = iota
	FLOAT
	STRING
	STRING2 // &str
	BOOLEAN
	NULL
	VOID
	ARREGLO
	OBJETO
)

const (
	PUBLIC TipoModAccess = iota
	PRIVATE
)

type TipoRetorno struct {
	Tipo TipoDato
	Valor interface{}
}

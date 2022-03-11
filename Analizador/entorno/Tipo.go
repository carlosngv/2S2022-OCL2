package entorno

type TipoDato int
type TipoModAccess int

const (
	INTEGER TipoDato = iota
	FLOAT
	STRING
	BOOLEAN
	NULL
	VOID
)

const (
	PUBLIC TipoModAccess = iota
	PRIVATE
)

type TipoRetorno struct {
	Tipo TipoDato
	Valor interface{}
}

package entorno

type TipoDato int

const (
	INTEGER TipoDato = iota
	FLOAT
	STRING
	BOOLEAN
	NULL
)

type TipoRetorno struct {
	Tipo TipoDato
	Valor interface{}
}

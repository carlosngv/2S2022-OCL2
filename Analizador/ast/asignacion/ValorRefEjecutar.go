package asignacion

type ValorRefEjecutar struct {
	referencia interface{}
}

func NewValorRefEjecutar(referencia interface{}) ValorRefEjecutar {
	return ValorRefEjecutar{referencia: referencia}
}

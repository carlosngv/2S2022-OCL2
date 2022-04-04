package funcionesNativas

type  ValorSqrt struct {
	ID 	  string
	Linea int
	Columna int
}

func NuevoValorSqrt(id string, linea int, columna int) *ValorSqrt {
	return &ValorSqrt{
		ID: id,
		Linea: linea,
		Columna: columna,
	}
}

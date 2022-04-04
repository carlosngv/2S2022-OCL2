package expresion

type Identificador struct {
	Identificador string
}

func NuevoIdentificador(identificador string) Identificador {
	return Identificador{Identificador: identificador}
}

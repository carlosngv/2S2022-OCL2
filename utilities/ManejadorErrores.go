package utilities

import (
	"time"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

type CustomSyntaxError struct {
	Linea, Columna   int
	Msg          string
	Time			 time.Time
}

type CustomErrorListener struct {
	*antlr.DefaultErrorListener // Embed default which ensures we fit the interface
	Errors                      []CustomSyntaxError
}

func (c *CustomErrorListener) SyntaxError(recognizer antlr.Recognizer, offendingSymbol interface{}, line, column int, msg string, e antlr.RecognitionException) {
	c.Errors = append(c.Errors, CustomSyntaxError{
		Linea:   line,
		Columna: column,
		Msg: msg,
		Time: 	time.Now(),
	})
}

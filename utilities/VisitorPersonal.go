package utilities

import (
	"p1/packages/Analizador/ast"
	"p1/packages/Analizador/parser"
)

type TreeShapeListener struct {
	*parser.BaseParserListener
	Ast ast.Ast
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	this.Ast = ctx.GetAst()
}

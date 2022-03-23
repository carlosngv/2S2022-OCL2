// Code generated from Parser.g4 by ANTLR 4.9. DO NOT EDIT.

package parser // Parser

import (
	"fmt"
	"reflect"
	"strconv"

	"github.com/antlr/antlr4/runtime/Go/antlr"
)

import "p1/packages/Analizador/ast"
import "p1/packages/Analizador/ast/interfaces"
import "p1/packages/Analizador/ast/expresion"                // id, operacion, primitivo
import "p1/packages/Analizador/ast/expresion/Accesos"        // AccesoArreglo, AccesoObjeto
import "p1/packages/Analizador/ast/expresion2"               // Llamada
import "p1/packages/Analizador/ast/instrucciones"            // print, declaracion, asignación
import "p1/packages/Analizador/ast/asignacion"               // asignación
import "p1/packages/Analizador/ast/instrucciones/Definicion" // DefinicionArreglo, DefinicionObjeto
import "p1/packages/Analizador/ast/instrucciones/SentenciasTransferencia"
import "p1/packages/Analizador/ast/instrucciones/SentenciasControl"
import "p1/packages/Analizador/ast/funcionesNativas" // sqrt, abs, to_string()
import "p1/packages/Analizador/ast/instrucciones/SentenciasCiclicas"
import "p1/packages/Analizador/entorno"
import "p1/packages/Analizador/entorno/Simbolos"
import arrayList "github.com/colegno/arraylist"

// Suppress unused import errors
var _ = fmt.Printf
var _ = reflect.Copy
var _ = strconv.Itoa

var parserATN = []uint16{
	3, 24715, 42794, 33075, 47597, 16764, 15335, 30598, 22884, 3, 74, 750,
	4, 2, 9, 2, 4, 3, 9, 3, 4, 4, 9, 4, 4, 5, 9, 5, 4, 6, 9, 6, 4, 7, 9, 7,
	4, 8, 9, 8, 4, 9, 9, 9, 4, 10, 9, 10, 4, 11, 9, 11, 4, 12, 9, 12, 4, 13,
	9, 13, 4, 14, 9, 14, 4, 15, 9, 15, 4, 16, 9, 16, 4, 17, 9, 17, 4, 18, 9,
	18, 4, 19, 9, 19, 4, 20, 9, 20, 4, 21, 9, 21, 4, 22, 9, 22, 4, 23, 9, 23,
	4, 24, 9, 24, 4, 25, 9, 25, 4, 26, 9, 26, 4, 27, 9, 27, 4, 28, 9, 28, 4,
	29, 9, 29, 4, 30, 9, 30, 4, 31, 9, 31, 4, 32, 9, 32, 4, 33, 9, 33, 4, 34,
	9, 34, 4, 35, 9, 35, 4, 36, 9, 36, 4, 37, 9, 37, 4, 38, 9, 38, 4, 39, 9,
	39, 4, 40, 9, 40, 4, 41, 9, 41, 4, 42, 9, 42, 4, 43, 9, 43, 4, 44, 9, 44,
	4, 45, 9, 45, 4, 46, 9, 46, 4, 47, 9, 47, 4, 48, 9, 48, 4, 49, 9, 49, 4,
	50, 9, 50, 3, 2, 3, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
	3, 3, 7, 3, 112, 10, 3, 12, 3, 14, 3, 115, 11, 3, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3,
	4, 3, 4, 3, 4, 3, 4, 5, 4, 160, 10, 4, 3, 5, 3, 5, 3, 5, 5, 5, 165, 10,
	5, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 3, 6, 7,
	6, 178, 10, 6, 12, 6, 14, 6, 181, 11, 6, 3, 7, 3, 7, 3, 7, 3, 7, 3, 7,
	3, 7, 3, 7, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 3, 8, 5, 8, 198,
	10, 8, 3, 9, 6, 9, 201, 10, 9, 13, 9, 14, 9, 202, 3, 9, 3, 9, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3,
	10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10, 3, 10,
	3, 10, 5, 10, 262, 10, 10, 3, 11, 3, 11, 3, 11, 3, 11, 3, 11, 3, 12, 3,
	12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12,
	3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 3, 12, 5, 12, 289, 10,
	12, 3, 13, 6, 13, 292, 10, 13, 13, 13, 14, 13, 293, 3, 13, 3, 13, 3, 14,
	3, 14, 3, 14, 3, 14, 3, 14, 3, 14, 3, 15, 3, 15, 3, 15, 3, 15, 3, 15, 3,
	16, 3, 16, 3, 16, 3, 16, 3, 16, 3, 17, 6, 17, 315, 10, 17, 13, 17, 14,
	17, 316, 3, 17, 3, 17, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18,
	3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 3, 18, 5, 18, 334, 10, 18, 3, 19, 3,
	19, 3, 19, 3, 19, 3, 19, 3, 19, 5, 19, 342, 10, 19, 3, 19, 3, 19, 3, 19,
	3, 19, 3, 19, 7, 19, 349, 10, 19, 12, 19, 14, 19, 352, 11, 19, 3, 20, 3,
	20, 3, 20, 3, 20, 3, 20, 3, 21, 3, 21, 3, 21, 3, 21, 3, 22, 3, 22, 3, 22,
	3, 22, 3, 22, 3, 22, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3, 23, 3,
	23, 3, 23, 3, 23, 5, 23, 379, 10, 23, 3, 24, 3, 24, 3, 24, 3, 24, 3, 24,
	3, 24, 3, 24, 3, 24, 3, 24, 7, 24, 390, 10, 24, 12, 24, 14, 24, 393, 11,
	24, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25,
	3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3,
	25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25,
	3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3, 25, 3,
	25, 5, 25, 437, 10, 25, 3, 26, 3, 26, 3, 26, 3, 26, 3, 27, 3, 27, 3, 27,
	3, 27, 3, 27, 3, 27, 5, 27, 449, 10, 27, 3, 28, 3, 28, 3, 28, 3, 28, 3,
	28, 3, 28, 5, 28, 457, 10, 28, 3, 29, 3, 29, 3, 29, 3, 30, 3, 30, 3, 30,
	3, 30, 3, 30, 3, 30, 3, 30, 3, 30, 7, 30, 470, 10, 30, 12, 30, 14, 30,
	473, 11, 30, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3,
	31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 3, 31, 5, 31, 491, 10, 31,
	3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 32, 3, 33, 3, 33, 3, 33, 3,
	33, 3, 33, 3, 33, 3, 33, 3, 33, 7, 33, 508, 10, 33, 12, 33, 14, 33, 511,
	11, 33, 3, 34, 3, 34, 3, 34, 3, 35, 3, 35, 3, 35, 3, 35, 3, 35, 3, 36,
	3, 36, 3, 36, 3, 36, 3, 36, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3, 37, 3,
	37, 3, 37, 7, 37, 534, 10, 37, 12, 37, 14, 37, 537, 11, 37, 3, 38, 3, 38,
	3, 38, 3, 38, 3, 38, 3, 39, 3, 39, 3, 39, 3, 39, 3, 39, 3, 39, 3, 40, 3,
	40, 3, 40, 3, 40, 3, 40, 3, 40, 3, 41, 3, 41, 3, 41, 3, 41, 3, 42, 3, 42,
	3, 42, 3, 43, 3, 43, 3, 43, 3, 43, 3, 43, 3, 43, 3, 43, 3, 43, 3, 43, 7,
	43, 572, 10, 43, 12, 43, 14, 43, 575, 11, 43, 3, 44, 3, 44, 3, 44, 3, 44,
	3, 44, 5, 44, 582, 10, 44, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3,
	45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45,
	3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3,
	45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45,
	3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 3, 45, 5, 45, 628, 10, 45, 3, 46, 3,
	46, 3, 46, 3, 46, 3, 46, 3, 46, 3, 46, 3, 46, 3, 46, 7, 46, 639, 10, 46,
	12, 46, 14, 46, 642, 11, 46, 3, 47, 3, 47, 3, 47, 3, 47, 3, 47, 3, 47,
	3, 47, 3, 47, 5, 47, 652, 10, 47, 3, 47, 3, 47, 3, 47, 3, 47, 3, 47, 7,
	47, 659, 10, 47, 12, 47, 14, 47, 662, 11, 47, 3, 48, 3, 48, 3, 48, 3, 48,
	3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 5, 48, 677,
	10, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48, 3, 48,
	3, 48, 7, 48, 689, 10, 48, 12, 48, 14, 48, 692, 11, 48, 3, 49, 3, 49, 3,
	49, 3, 49, 3, 49, 3, 49, 3, 49, 3, 49, 3, 49, 3, 49, 3, 49, 3, 49, 5, 49,
	706, 10, 49, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3,
	50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50,
	3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3,
	50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50, 3, 50,
	5, 50, 748, 10, 50, 3, 50, 2, 13, 4, 10, 36, 46, 58, 64, 72, 84, 90, 92,
	94, 51, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34,
	36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70,
	72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 2, 6, 4, 2, 55,
	55, 57, 60, 4, 2, 50, 50, 52, 52, 4, 2, 61, 62, 65, 65, 3, 2, 63, 64, 2,
	778, 2, 100, 3, 2, 2, 2, 4, 103, 3, 2, 2, 2, 6, 159, 3, 2, 2, 2, 8, 164,
	3, 2, 2, 2, 10, 166, 3, 2, 2, 2, 12, 182, 3, 2, 2, 2, 14, 197, 3, 2, 2,
	2, 16, 200, 3, 2, 2, 2, 18, 261, 3, 2, 2, 2, 20, 263, 3, 2, 2, 2, 22, 288,
	3, 2, 2, 2, 24, 291, 3, 2, 2, 2, 26, 297, 3, 2, 2, 2, 28, 303, 3, 2, 2,
	2, 30, 308, 3, 2, 2, 2, 32, 314, 3, 2, 2, 2, 34, 333, 3, 2, 2, 2, 36, 341,
	3, 2, 2, 2, 38, 353, 3, 2, 2, 2, 40, 358, 3, 2, 2, 2, 42, 362, 3, 2, 2,
	2, 44, 378, 3, 2, 2, 2, 46, 380, 3, 2, 2, 2, 48, 436, 3, 2, 2, 2, 50, 438,
	3, 2, 2, 2, 52, 448, 3, 2, 2, 2, 54, 456, 3, 2, 2, 2, 56, 458, 3, 2, 2,
	2, 58, 461, 3, 2, 2, 2, 60, 490, 3, 2, 2, 2, 62, 492, 3, 2, 2, 2, 64, 499,
	3, 2, 2, 2, 66, 512, 3, 2, 2, 2, 68, 515, 3, 2, 2, 2, 70, 520, 3, 2, 2,
	2, 72, 525, 3, 2, 2, 2, 74, 538, 3, 2, 2, 2, 76, 543, 3, 2, 2, 2, 78, 549,
	3, 2, 2, 2, 80, 555, 3, 2, 2, 2, 82, 559, 3, 2, 2, 2, 84, 562, 3, 2, 2,
	2, 86, 581, 3, 2, 2, 2, 88, 627, 3, 2, 2, 2, 90, 629, 3, 2, 2, 2, 92, 651,
	3, 2, 2, 2, 94, 676, 3, 2, 2, 2, 96, 705, 3, 2, 2, 2, 98, 747, 3, 2, 2,
	2, 100, 101, 5, 4, 3, 2, 101, 102, 8, 2, 1, 2, 102, 3, 3, 2, 2, 2, 103,
	104, 8, 3, 1, 2, 104, 105, 5, 6, 4, 2, 105, 106, 8, 3, 1, 2, 106, 113,
	3, 2, 2, 2, 107, 108, 12, 4, 2, 2, 108, 109, 5, 6, 4, 2, 109, 110, 8, 3,
	1, 2, 110, 112, 3, 2, 2, 2, 111, 107, 3, 2, 2, 2, 112, 115, 3, 2, 2, 2,
	113, 111, 3, 2, 2, 2, 113, 114, 3, 2, 2, 2, 114, 5, 3, 2, 2, 2, 115, 113,
	3, 2, 2, 2, 116, 117, 5, 12, 7, 2, 117, 118, 8, 4, 1, 2, 118, 160, 3, 2,
	2, 2, 119, 120, 5, 8, 5, 2, 120, 121, 7, 21, 2, 2, 121, 122, 7, 73, 2,
	2, 122, 123, 7, 3, 2, 2, 123, 124, 7, 4, 2, 2, 124, 125, 5, 14, 8, 2, 125,
	126, 8, 4, 1, 2, 126, 160, 3, 2, 2, 2, 127, 128, 5, 8, 5, 2, 128, 129,
	7, 21, 2, 2, 129, 130, 7, 73, 2, 2, 130, 131, 7, 3, 2, 2, 131, 132, 5,
	10, 6, 2, 132, 133, 7, 4, 2, 2, 133, 134, 5, 14, 8, 2, 134, 135, 8, 4,
	1, 2, 135, 160, 3, 2, 2, 2, 136, 137, 5, 8, 5, 2, 137, 138, 7, 21, 2, 2,
	138, 139, 7, 73, 2, 2, 139, 140, 7, 3, 2, 2, 140, 141, 7, 4, 2, 2, 141,
	142, 7, 64, 2, 2, 142, 143, 7, 59, 2, 2, 143, 144, 5, 60, 31, 2, 144, 145,
	5, 14, 8, 2, 145, 146, 8, 4, 1, 2, 146, 160, 3, 2, 2, 2, 147, 148, 5, 8,
	5, 2, 148, 149, 7, 21, 2, 2, 149, 150, 7, 73, 2, 2, 150, 151, 7, 3, 2,
	2, 151, 152, 5, 10, 6, 2, 152, 153, 7, 4, 2, 2, 153, 154, 7, 64, 2, 2,
	154, 155, 7, 59, 2, 2, 155, 156, 5, 60, 31, 2, 156, 157, 5, 14, 8, 2, 157,
	158, 8, 4, 1, 2, 158, 160, 3, 2, 2, 2, 159, 116, 3, 2, 2, 2, 159, 119,
	3, 2, 2, 2, 159, 127, 3, 2, 2, 2, 159, 136, 3, 2, 2, 2, 159, 147, 3, 2,
	2, 2, 160, 7, 3, 2, 2, 2, 161, 162, 7, 27, 2, 2, 162, 165, 8, 5, 1, 2,
	163, 165, 8, 5, 1, 2, 164, 161, 3, 2, 2, 2, 164, 163, 3, 2, 2, 2, 165,
	9, 3, 2, 2, 2, 166, 167, 8, 6, 1, 2, 167, 168, 5, 60, 31, 2, 168, 169,
	7, 73, 2, 2, 169, 170, 8, 6, 1, 2, 170, 179, 3, 2, 2, 2, 171, 172, 12,
	4, 2, 2, 172, 173, 7, 47, 2, 2, 173, 174, 5, 60, 31, 2, 174, 175, 7, 73,
	2, 2, 175, 176, 8, 6, 1, 2, 176, 178, 3, 2, 2, 2, 177, 171, 3, 2, 2, 2,
	178, 181, 3, 2, 2, 2, 179, 177, 3, 2, 2, 2, 179, 180, 3, 2, 2, 2, 180,
	11, 3, 2, 2, 2, 181, 179, 3, 2, 2, 2, 182, 183, 7, 21, 2, 2, 183, 184,
	7, 25, 2, 2, 184, 185, 7, 3, 2, 2, 185, 186, 7, 4, 2, 2, 186, 187, 5, 14,
	8, 2, 187, 188, 8, 7, 1, 2, 188, 13, 3, 2, 2, 2, 189, 190, 7, 5, 2, 2,
	190, 191, 5, 16, 9, 2, 191, 192, 7, 6, 2, 2, 192, 193, 8, 8, 1, 2, 193,
	198, 3, 2, 2, 2, 194, 195, 7, 5, 2, 2, 195, 196, 7, 6, 2, 2, 196, 198,
	8, 8, 1, 2, 197, 189, 3, 2, 2, 2, 197, 194, 3, 2, 2, 2, 198, 15, 3, 2,
	2, 2, 199, 201, 5, 18, 10, 2, 200, 199, 3, 2, 2, 2, 201, 202, 3, 2, 2,
	2, 202, 200, 3, 2, 2, 2, 202, 203, 3, 2, 2, 2, 203, 204, 3, 2, 2, 2, 204,
	205, 8, 9, 1, 2, 205, 17, 3, 2, 2, 2, 206, 207, 5, 20, 11, 2, 207, 208,
	7, 48, 2, 2, 208, 209, 8, 10, 1, 2, 209, 262, 3, 2, 2, 2, 210, 211, 5,
	54, 28, 2, 211, 212, 7, 48, 2, 2, 212, 213, 8, 10, 1, 2, 213, 262, 3, 2,
	2, 2, 214, 215, 5, 28, 15, 2, 215, 216, 8, 10, 1, 2, 216, 262, 3, 2, 2,
	2, 217, 218, 5, 42, 22, 2, 218, 219, 7, 48, 2, 2, 219, 220, 8, 10, 1, 2,
	220, 262, 3, 2, 2, 2, 221, 222, 5, 42, 22, 2, 222, 223, 8, 10, 1, 2, 223,
	262, 3, 2, 2, 2, 224, 225, 5, 38, 20, 2, 225, 226, 8, 10, 1, 2, 226, 262,
	3, 2, 2, 2, 227, 228, 5, 40, 21, 2, 228, 229, 8, 10, 1, 2, 229, 262, 3,
	2, 2, 2, 230, 231, 5, 22, 12, 2, 231, 232, 8, 10, 1, 2, 232, 262, 3, 2,
	2, 2, 233, 234, 5, 48, 25, 2, 234, 235, 7, 48, 2, 2, 235, 236, 8, 10, 1,
	2, 236, 262, 3, 2, 2, 2, 237, 238, 5, 50, 26, 2, 238, 239, 7, 48, 2, 2,
	239, 240, 8, 10, 1, 2, 240, 262, 3, 2, 2, 2, 241, 242, 5, 44, 23, 2, 242,
	243, 7, 48, 2, 2, 243, 244, 8, 10, 1, 2, 244, 262, 3, 2, 2, 2, 245, 246,
	5, 52, 27, 2, 246, 247, 7, 48, 2, 2, 247, 248, 8, 10, 1, 2, 248, 262, 3,
	2, 2, 2, 249, 250, 5, 56, 29, 2, 250, 251, 7, 48, 2, 2, 251, 252, 8, 10,
	1, 2, 252, 262, 3, 2, 2, 2, 253, 254, 5, 62, 32, 2, 254, 255, 7, 48, 2,
	2, 255, 256, 8, 10, 1, 2, 256, 262, 3, 2, 2, 2, 257, 258, 5, 76, 39, 2,
	258, 259, 7, 48, 2, 2, 259, 260, 8, 10, 1, 2, 260, 262, 3, 2, 2, 2, 261,
	206, 3, 2, 2, 2, 261, 210, 3, 2, 2, 2, 261, 214, 3, 2, 2, 2, 261, 217,
	3, 2, 2, 2, 261, 221, 3, 2, 2, 2, 261, 224, 3, 2, 2, 2, 261, 227, 3, 2,
	2, 2, 261, 230, 3, 2, 2, 2, 261, 233, 3, 2, 2, 2, 261, 237, 3, 2, 2, 2,
	261, 241, 3, 2, 2, 2, 261, 245, 3, 2, 2, 2, 261, 249, 3, 2, 2, 2, 261,
	253, 3, 2, 2, 2, 261, 257, 3, 2, 2, 2, 262, 19, 3, 2, 2, 2, 263, 264, 7,
	73, 2, 2, 264, 265, 7, 54, 2, 2, 265, 266, 5, 88, 45, 2, 266, 267, 8, 11,
	1, 2, 267, 21, 3, 2, 2, 2, 268, 269, 7, 13, 2, 2, 269, 270, 5, 88, 45,
	2, 270, 271, 5, 14, 8, 2, 271, 272, 8, 12, 1, 2, 272, 289, 3, 2, 2, 2,
	273, 274, 7, 13, 2, 2, 274, 275, 5, 88, 45, 2, 275, 276, 5, 14, 8, 2, 276,
	277, 7, 14, 2, 2, 277, 278, 5, 14, 8, 2, 278, 279, 8, 12, 1, 2, 279, 289,
	3, 2, 2, 2, 280, 281, 7, 13, 2, 2, 281, 282, 5, 88, 45, 2, 282, 283, 5,
	14, 8, 2, 283, 284, 5, 24, 13, 2, 284, 285, 7, 14, 2, 2, 285, 286, 5, 14,
	8, 2, 286, 287, 8, 12, 1, 2, 287, 289, 3, 2, 2, 2, 288, 268, 3, 2, 2, 2,
	288, 273, 3, 2, 2, 2, 288, 280, 3, 2, 2, 2, 289, 23, 3, 2, 2, 2, 290, 292,
	5, 26, 14, 2, 291, 290, 3, 2, 2, 2, 292, 293, 3, 2, 2, 2, 293, 291, 3,
	2, 2, 2, 293, 294, 3, 2, 2, 2, 294, 295, 3, 2, 2, 2, 295, 296, 8, 13, 1,
	2, 296, 25, 3, 2, 2, 2, 297, 298, 7, 14, 2, 2, 298, 299, 7, 13, 2, 2, 299,
	300, 5, 88, 45, 2, 300, 301, 5, 14, 8, 2, 301, 302, 8, 14, 1, 2, 302, 27,
	3, 2, 2, 2, 303, 304, 7, 15, 2, 2, 304, 305, 5, 88, 45, 2, 305, 306, 5,
	30, 16, 2, 306, 307, 8, 15, 1, 2, 307, 29, 3, 2, 2, 2, 308, 309, 7, 5,
	2, 2, 309, 310, 5, 32, 17, 2, 310, 311, 7, 6, 2, 2, 311, 312, 8, 16, 1,
	2, 312, 31, 3, 2, 2, 2, 313, 315, 5, 34, 18, 2, 314, 313, 3, 2, 2, 2, 315,
	316, 3, 2, 2, 2, 316, 314, 3, 2, 2, 2, 316, 317, 3, 2, 2, 2, 317, 318,
	3, 2, 2, 2, 318, 319, 8, 17, 1, 2, 319, 33, 3, 2, 2, 2, 320, 321, 5, 36,
	19, 2, 321, 322, 7, 54, 2, 2, 322, 323, 7, 59, 2, 2, 323, 324, 5, 18, 10,
	2, 324, 325, 7, 47, 2, 2, 325, 326, 8, 18, 1, 2, 326, 334, 3, 2, 2, 2,
	327, 328, 5, 36, 19, 2, 328, 329, 7, 54, 2, 2, 329, 330, 7, 59, 2, 2, 330,
	331, 5, 14, 8, 2, 331, 332, 8, 18, 1, 2, 332, 334, 3, 2, 2, 2, 333, 320,
	3, 2, 2, 2, 333, 327, 3, 2, 2, 2, 334, 35, 3, 2, 2, 2, 335, 336, 8, 19,
	1, 2, 336, 337, 5, 88, 45, 2, 337, 338, 8, 19, 1, 2, 338, 342, 3, 2, 2,
	2, 339, 340, 7, 9, 2, 2, 340, 342, 8, 19, 1, 2, 341, 335, 3, 2, 2, 2, 341,
	339, 3, 2, 2, 2, 342, 350, 3, 2, 2, 2, 343, 344, 12, 5, 2, 2, 344, 345,
	7, 51, 2, 2, 345, 346, 5, 88, 45, 2, 346, 347, 8, 19, 1, 2, 347, 349, 3,
	2, 2, 2, 348, 343, 3, 2, 2, 2, 349, 352, 3, 2, 2, 2, 350, 348, 3, 2, 2,
	2, 350, 351, 3, 2, 2, 2, 351, 37, 3, 2, 2, 2, 352, 350, 3, 2, 2, 2, 353,
	354, 7, 16, 2, 2, 354, 355, 5, 88, 45, 2, 355, 356, 5, 14, 8, 2, 356, 357,
	8, 20, 1, 2, 357, 39, 3, 2, 2, 2, 358, 359, 7, 17, 2, 2, 359, 360, 5, 14,
	8, 2, 360, 361, 8, 21, 1, 2, 361, 41, 3, 2, 2, 2, 362, 363, 7, 10, 2, 2,
	363, 364, 7, 3, 2, 2, 364, 365, 5, 88, 45, 2, 365, 366, 7, 4, 2, 2, 366,
	367, 8, 22, 1, 2, 367, 43, 3, 2, 2, 2, 368, 369, 7, 73, 2, 2, 369, 370,
	7, 3, 2, 2, 370, 371, 7, 4, 2, 2, 371, 379, 8, 23, 1, 2, 372, 373, 7, 73,
	2, 2, 373, 374, 7, 3, 2, 2, 374, 375, 5, 46, 24, 2, 375, 376, 7, 4, 2,
	2, 376, 377, 8, 23, 1, 2, 377, 379, 3, 2, 2, 2, 378, 368, 3, 2, 2, 2, 378,
	372, 3, 2, 2, 2, 379, 45, 3, 2, 2, 2, 380, 381, 8, 24, 1, 2, 381, 382,
	5, 88, 45, 2, 382, 383, 8, 24, 1, 2, 383, 391, 3, 2, 2, 2, 384, 385, 12,
	4, 2, 2, 385, 386, 7, 47, 2, 2, 386, 387, 5, 88, 45, 2, 387, 388, 8, 24,
	1, 2, 388, 390, 3, 2, 2, 2, 389, 384, 3, 2, 2, 2, 390, 393, 3, 2, 2, 2,
	391, 389, 3, 2, 2, 2, 391, 392, 3, 2, 2, 2, 392, 47, 3, 2, 2, 2, 393, 391,
	3, 2, 2, 2, 394, 395, 7, 22, 2, 2, 395, 396, 5, 58, 30, 2, 396, 397, 7,
	54, 2, 2, 397, 398, 5, 88, 45, 2, 398, 399, 8, 25, 1, 2, 399, 437, 3, 2,
	2, 2, 400, 401, 7, 22, 2, 2, 401, 402, 5, 58, 30, 2, 402, 403, 7, 49, 2,
	2, 403, 404, 5, 60, 31, 2, 404, 405, 7, 54, 2, 2, 405, 406, 5, 88, 45,
	2, 406, 407, 8, 25, 1, 2, 407, 437, 3, 2, 2, 2, 408, 409, 7, 22, 2, 2,
	409, 410, 7, 20, 2, 2, 410, 411, 5, 58, 30, 2, 411, 412, 7, 54, 2, 2, 412,
	413, 5, 88, 45, 2, 413, 414, 8, 25, 1, 2, 414, 437, 3, 2, 2, 2, 415, 416,
	7, 22, 2, 2, 416, 417, 7, 20, 2, 2, 417, 418, 5, 58, 30, 2, 418, 419, 7,
	49, 2, 2, 419, 420, 5, 60, 31, 2, 420, 421, 7, 54, 2, 2, 421, 422, 5, 88,
	45, 2, 422, 423, 8, 25, 1, 2, 423, 437, 3, 2, 2, 2, 424, 425, 7, 22, 2,
	2, 425, 426, 7, 20, 2, 2, 426, 427, 7, 73, 2, 2, 427, 428, 7, 49, 2, 2,
	428, 429, 7, 12, 2, 2, 429, 430, 7, 60, 2, 2, 430, 431, 5, 60, 31, 2, 431,
	432, 7, 59, 2, 2, 432, 433, 7, 54, 2, 2, 433, 434, 5, 46, 24, 2, 434, 435,
	8, 25, 1, 2, 435, 437, 3, 2, 2, 2, 436, 394, 3, 2, 2, 2, 436, 400, 3, 2,
	2, 2, 436, 408, 3, 2, 2, 2, 436, 415, 3, 2, 2, 2, 436, 424, 3, 2, 2, 2,
	437, 49, 3, 2, 2, 2, 438, 439, 5, 60, 31, 2, 439, 440, 5, 58, 30, 2, 440,
	441, 8, 26, 1, 2, 441, 51, 3, 2, 2, 2, 442, 443, 7, 29, 2, 2, 443, 449,
	8, 27, 1, 2, 444, 445, 7, 29, 2, 2, 445, 446, 5, 88, 45, 2, 446, 447, 8,
	27, 1, 2, 447, 449, 3, 2, 2, 2, 448, 442, 3, 2, 2, 2, 448, 444, 3, 2, 2,
	2, 449, 53, 3, 2, 2, 2, 450, 451, 7, 30, 2, 2, 451, 457, 8, 28, 1, 2, 452,
	453, 7, 30, 2, 2, 453, 454, 5, 88, 45, 2, 454, 455, 8, 28, 1, 2, 455, 457,
	3, 2, 2, 2, 456, 450, 3, 2, 2, 2, 456, 452, 3, 2, 2, 2, 457, 55, 3, 2,
	2, 2, 458, 459, 7, 31, 2, 2, 459, 460, 8, 29, 1, 2, 460, 57, 3, 2, 2, 2,
	461, 462, 8, 30, 1, 2, 462, 463, 7, 73, 2, 2, 463, 464, 8, 30, 1, 2, 464,
	471, 3, 2, 2, 2, 465, 466, 12, 4, 2, 2, 466, 467, 7, 47, 2, 2, 467, 468,
	7, 73, 2, 2, 468, 470, 8, 30, 1, 2, 469, 465, 3, 2, 2, 2, 470, 473, 3,
	2, 2, 2, 471, 469, 3, 2, 2, 2, 471, 472, 3, 2, 2, 2, 472, 59, 3, 2, 2,
	2, 473, 471, 3, 2, 2, 2, 474, 475, 7, 38, 2, 2, 475, 491, 8, 31, 1, 2,
	476, 477, 7, 40, 2, 2, 477, 491, 8, 31, 1, 2, 478, 479, 7, 41, 2, 2, 479,
	491, 8, 31, 1, 2, 480, 481, 7, 42, 2, 2, 481, 491, 8, 31, 1, 2, 482, 483,
	7, 39, 2, 2, 483, 491, 8, 31, 1, 2, 484, 485, 7, 44, 2, 2, 485, 491, 8,
	31, 1, 2, 486, 487, 7, 43, 2, 2, 487, 491, 8, 31, 1, 2, 488, 489, 7, 45,
	2, 2, 489, 491, 8, 31, 1, 2, 490, 474, 3, 2, 2, 2, 490, 476, 3, 2, 2, 2,
	490, 478, 3, 2, 2, 2, 490, 480, 3, 2, 2, 2, 490, 482, 3, 2, 2, 2, 490,
	484, 3, 2, 2, 2, 490, 486, 3, 2, 2, 2, 490, 488, 3, 2, 2, 2, 491, 61, 3,
	2, 2, 2, 492, 493, 5, 60, 31, 2, 493, 494, 5, 64, 33, 2, 494, 495, 7, 73,
	2, 2, 495, 496, 7, 54, 2, 2, 496, 497, 5, 88, 45, 2, 497, 498, 8, 32, 1,
	2, 498, 63, 3, 2, 2, 2, 499, 500, 8, 33, 1, 2, 500, 501, 5, 66, 34, 2,
	501, 502, 8, 33, 1, 2, 502, 509, 3, 2, 2, 2, 503, 504, 12, 4, 2, 2, 504,
	505, 5, 66, 34, 2, 505, 506, 8, 33, 1, 2, 506, 508, 3, 2, 2, 2, 507, 503,
	3, 2, 2, 2, 508, 511, 3, 2, 2, 2, 509, 507, 3, 2, 2, 2, 509, 510, 3, 2,
	2, 2, 510, 65, 3, 2, 2, 2, 511, 509, 3, 2, 2, 2, 512, 513, 7, 7, 2, 2,
	513, 514, 7, 8, 2, 2, 514, 67, 3, 2, 2, 2, 515, 516, 7, 5, 2, 2, 516, 517,
	5, 46, 24, 2, 517, 518, 7, 6, 2, 2, 518, 519, 8, 35, 1, 2, 519, 69, 3,
	2, 2, 2, 520, 521, 7, 24, 2, 2, 521, 522, 5, 60, 31, 2, 522, 523, 5, 72,
	37, 2, 523, 524, 8, 36, 1, 2, 524, 71, 3, 2, 2, 2, 525, 526, 8, 37, 1,
	2, 526, 527, 5, 74, 38, 2, 527, 528, 8, 37, 1, 2, 528, 535, 3, 2, 2, 2,
	529, 530, 12, 4, 2, 2, 530, 531, 5, 74, 38, 2, 531, 532, 8, 37, 1, 2, 532,
	534, 3, 2, 2, 2, 533, 529, 3, 2, 2, 2, 534, 537, 3, 2, 2, 2, 535, 533,
	3, 2, 2, 2, 535, 536, 3, 2, 2, 2, 536, 73, 3, 2, 2, 2, 537, 535, 3, 2,
	2, 2, 538, 539, 7, 7, 2, 2, 539, 540, 5, 88, 45, 2, 540, 541, 7, 8, 2,
	2, 541, 542, 8, 38, 1, 2, 542, 75, 3, 2, 2, 2, 543, 544, 7, 73, 2, 2, 544,
	545, 5, 58, 30, 2, 545, 546, 7, 54, 2, 2, 546, 547, 5, 88, 45, 2, 547,
	548, 8, 39, 1, 2, 548, 77, 3, 2, 2, 2, 549, 550, 7, 24, 2, 2, 550, 551,
	7, 73, 2, 2, 551, 552, 7, 3, 2, 2, 552, 553, 7, 4, 2, 2, 553, 554, 8, 40,
	1, 2, 554, 79, 3, 2, 2, 2, 555, 556, 7, 73, 2, 2, 556, 557, 5, 72, 37,
	2, 557, 558, 8, 41, 1, 2, 558, 81, 3, 2, 2, 2, 559, 560, 5, 84, 43, 2,
	560, 561, 8, 42, 1, 2, 561, 83, 3, 2, 2, 2, 562, 563, 8, 43, 1, 2, 563,
	564, 5, 86, 44, 2, 564, 565, 8, 43, 1, 2, 565, 573, 3, 2, 2, 2, 566, 567,
	12, 4, 2, 2, 567, 568, 7, 46, 2, 2, 568, 569, 5, 86, 44, 2, 569, 570, 8,
	43, 1, 2, 570, 572, 3, 2, 2, 2, 571, 566, 3, 2, 2, 2, 572, 575, 3, 2, 2,
	2, 573, 571, 3, 2, 2, 2, 573, 574, 3, 2, 2, 2, 574, 85, 3, 2, 2, 2, 575,
	573, 3, 2, 2, 2, 576, 577, 7, 73, 2, 2, 577, 582, 8, 44, 1, 2, 578, 579,
	5, 80, 41, 2, 579, 580, 8, 44, 1, 2, 580, 582, 3, 2, 2, 2, 581, 576, 3,
	2, 2, 2, 581, 578, 3, 2, 2, 2, 582, 87, 3, 2, 2, 2, 583, 584, 5, 90, 46,
	2, 584, 585, 8, 45, 1, 2, 585, 628, 3, 2, 2, 2, 586, 587, 5, 94, 48, 2,
	587, 588, 8, 45, 1, 2, 588, 628, 3, 2, 2, 2, 589, 590, 5, 92, 47, 2, 590,
	591, 8, 45, 1, 2, 591, 628, 3, 2, 2, 2, 592, 593, 5, 70, 36, 2, 593, 594,
	8, 45, 1, 2, 594, 628, 3, 2, 2, 2, 595, 596, 5, 68, 35, 2, 596, 597, 8,
	45, 1, 2, 597, 628, 3, 2, 2, 2, 598, 599, 5, 60, 31, 2, 599, 600, 7, 49,
	2, 2, 600, 601, 7, 49, 2, 2, 601, 602, 7, 36, 2, 2, 602, 603, 7, 3, 2,
	2, 603, 604, 5, 88, 45, 2, 604, 605, 7, 47, 2, 2, 605, 606, 5, 88, 45,
	2, 606, 607, 7, 4, 2, 2, 607, 608, 8, 45, 1, 2, 608, 628, 3, 2, 2, 2, 609,
	610, 5, 60, 31, 2, 610, 611, 7, 49, 2, 2, 611, 612, 7, 49, 2, 2, 612, 613,
	7, 37, 2, 2, 613, 614, 7, 3, 2, 2, 614, 615, 5, 88, 45, 2, 615, 616, 7,
	47, 2, 2, 616, 617, 5, 88, 45, 2, 617, 618, 7, 4, 2, 2, 618, 619, 8, 45,
	1, 2, 619, 628, 3, 2, 2, 2, 620, 621, 7, 12, 2, 2, 621, 622, 7, 49, 2,
	2, 622, 623, 7, 49, 2, 2, 623, 624, 7, 24, 2, 2, 624, 625, 7, 3, 2, 2,
	625, 626, 7, 4, 2, 2, 626, 628, 8, 45, 1, 2, 627, 583, 3, 2, 2, 2, 627,
	586, 3, 2, 2, 2, 627, 589, 3, 2, 2, 2, 627, 592, 3, 2, 2, 2, 627, 595,
	3, 2, 2, 2, 627, 598, 3, 2, 2, 2, 627, 609, 3, 2, 2, 2, 627, 620, 3, 2,
	2, 2, 628, 89, 3, 2, 2, 2, 629, 630, 8, 46, 1, 2, 630, 631, 5, 94, 48,
	2, 631, 632, 8, 46, 1, 2, 632, 640, 3, 2, 2, 2, 633, 634, 12, 4, 2, 2,
	634, 635, 9, 2, 2, 2, 635, 636, 5, 90, 46, 5, 636, 637, 8, 46, 1, 2, 637,
	639, 3, 2, 2, 2, 638, 633, 3, 2, 2, 2, 639, 642, 3, 2, 2, 2, 640, 638,
	3, 2, 2, 2, 640, 641, 3, 2, 2, 2, 641, 91, 3, 2, 2, 2, 642, 640, 3, 2,
	2, 2, 643, 644, 8, 47, 1, 2, 644, 645, 7, 53, 2, 2, 645, 646, 5, 92, 47,
	5, 646, 647, 8, 47, 1, 2, 647, 652, 3, 2, 2, 2, 648, 649, 5, 90, 46, 2,
	649, 650, 8, 47, 1, 2, 650, 652, 3, 2, 2, 2, 651, 643, 3, 2, 2, 2, 651,
	648, 3, 2, 2, 2, 652, 660, 3, 2, 2, 2, 653, 654, 12, 4, 2, 2, 654, 655,
	9, 3, 2, 2, 655, 656, 5, 92, 47, 5, 656, 657, 8, 47, 1, 2, 657, 659, 3,
	2, 2, 2, 658, 653, 3, 2, 2, 2, 659, 662, 3, 2, 2, 2, 660, 658, 3, 2, 2,
	2, 660, 661, 3, 2, 2, 2, 661, 93, 3, 2, 2, 2, 662, 660, 3, 2, 2, 2, 663,
	664, 8, 48, 1, 2, 664, 665, 7, 64, 2, 2, 665, 666, 5, 88, 45, 2, 666, 667,
	8, 48, 1, 2, 667, 677, 3, 2, 2, 2, 668, 669, 5, 96, 49, 2, 669, 670, 8,
	48, 1, 2, 670, 677, 3, 2, 2, 2, 671, 672, 7, 3, 2, 2, 672, 673, 5, 88,
	45, 2, 673, 674, 7, 4, 2, 2, 674, 675, 8, 48, 1, 2, 675, 677, 3, 2, 2,
	2, 676, 663, 3, 2, 2, 2, 676, 668, 3, 2, 2, 2, 676, 671, 3, 2, 2, 2, 677,
	690, 3, 2, 2, 2, 678, 679, 12, 6, 2, 2, 679, 680, 9, 4, 2, 2, 680, 681,
	5, 94, 48, 7, 681, 682, 8, 48, 1, 2, 682, 689, 3, 2, 2, 2, 683, 684, 12,
	5, 2, 2, 684, 685, 9, 5, 2, 2, 685, 686, 5, 94, 48, 6, 686, 687, 8, 48,
	1, 2, 687, 689, 3, 2, 2, 2, 688, 678, 3, 2, 2, 2, 688, 683, 3, 2, 2, 2,
	689, 692, 3, 2, 2, 2, 690, 688, 3, 2, 2, 2, 690, 691, 3, 2, 2, 2, 691,
	95, 3, 2, 2, 2, 692, 690, 3, 2, 2, 2, 693, 694, 5, 98, 50, 2, 694, 695,
	8, 49, 1, 2, 695, 706, 3, 2, 2, 2, 696, 697, 5, 44, 23, 2, 697, 698, 8,
	49, 1, 2, 698, 706, 3, 2, 2, 2, 699, 700, 5, 80, 41, 2, 700, 701, 8, 49,
	1, 2, 701, 706, 3, 2, 2, 2, 702, 703, 5, 82, 42, 2, 703, 704, 8, 49, 1,
	2, 704, 706, 3, 2, 2, 2, 705, 693, 3, 2, 2, 2, 705, 696, 3, 2, 2, 2, 705,
	699, 3, 2, 2, 2, 705, 702, 3, 2, 2, 2, 706, 97, 3, 2, 2, 2, 707, 708, 7,
	66, 2, 2, 708, 748, 8, 50, 1, 2, 709, 710, 7, 67, 2, 2, 710, 748, 8, 50,
	1, 2, 711, 712, 7, 68, 2, 2, 712, 748, 8, 50, 1, 2, 713, 714, 7, 69, 2,
	2, 714, 748, 8, 50, 1, 2, 715, 716, 7, 70, 2, 2, 716, 748, 8, 50, 1, 2,
	717, 718, 7, 73, 2, 2, 718, 748, 8, 50, 1, 2, 719, 720, 7, 71, 2, 2, 720,
	748, 8, 50, 1, 2, 721, 722, 7, 72, 2, 2, 722, 748, 8, 50, 1, 2, 723, 724,
	7, 73, 2, 2, 724, 725, 7, 46, 2, 2, 725, 726, 7, 32, 2, 2, 726, 727, 7,
	3, 2, 2, 727, 728, 7, 4, 2, 2, 728, 748, 8, 50, 1, 2, 729, 730, 7, 73,
	2, 2, 730, 731, 7, 46, 2, 2, 731, 732, 7, 33, 2, 2, 732, 733, 7, 3, 2,
	2, 733, 734, 7, 4, 2, 2, 734, 748, 8, 50, 1, 2, 735, 736, 7, 73, 2, 2,
	736, 737, 7, 46, 2, 2, 737, 738, 7, 34, 2, 2, 738, 739, 7, 3, 2, 2, 739,
	740, 7, 4, 2, 2, 740, 748, 8, 50, 1, 2, 741, 742, 7, 73, 2, 2, 742, 743,
	7, 46, 2, 2, 743, 744, 7, 35, 2, 2, 744, 745, 7, 3, 2, 2, 745, 746, 7,
	4, 2, 2, 746, 748, 8, 50, 1, 2, 747, 707, 3, 2, 2, 2, 747, 709, 3, 2, 2,
	2, 747, 711, 3, 2, 2, 2, 747, 713, 3, 2, 2, 2, 747, 715, 3, 2, 2, 2, 747,
	717, 3, 2, 2, 2, 747, 719, 3, 2, 2, 2, 747, 721, 3, 2, 2, 2, 747, 723,
	3, 2, 2, 2, 747, 729, 3, 2, 2, 2, 747, 735, 3, 2, 2, 2, 747, 741, 3, 2,
	2, 2, 748, 99, 3, 2, 2, 2, 35, 113, 159, 164, 179, 197, 202, 261, 288,
	293, 316, 333, 341, 350, 378, 391, 436, 448, 456, 471, 490, 509, 535, 573,
	581, 627, 640, 651, 660, 676, 688, 690, 705, 747,
}
var literalNames = []string{
	"", "'('", "')'", "'{'", "'}'", "'['", "']'", "'_'", "'println!'", "'vec!'",
	"'Vec'", "'if'", "'else'", "'match'", "'while'", "'loop'", "'for'", "'in'",
	"'mut'", "'fn'", "'let'", "'class'", "'new'", "'main'", "'private'", "'pub'",
	"'static'", "'return'", "'break'", "'continue'", "'abs'", "'sqrt'", "'to_string'",
	"'clone'", "'pow'", "'powf'", "'i64'", "'f64'", "'String'", "'&str'", "'char'",
	"'void'", "'boolean'", "'usize'", "'.'", "','", "';'", "':'", "'&&'", "'|'",
	"'||'", "'!'", "'='", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'",
	"'/'", "'+'", "'-'", "'%'", "", "", "", "", "", "'true'", "'false'",
}
var symbolicNames = []string{
	"", "LP", "RP", "L_LLAVE", "R_LLAVE", "L_CORCH", "R_CORCH", "GUION_BAJO",
	"PRINTLN", "VEC", "VEC_VACIO", "IF_TOK", "ELSE", "MATCH", "WHILE", "LOOP",
	"FOR", "IN", "MUT", "FN", "LET", "CLASS", "NEW_", "MAIN", "PRIVATE", "PUB",
	"STATIC", "RETURN_P", "BREAK_P", "CONTINUE_P", "ABS", "SQRT", "TO_STRING",
	"CLONE", "POW", "POWF", "INTTYPE", "FLOATTYPE", "STRINGTYPE", "STRTYPE",
	"CHARTYPE", "VOIDTYPE", "BOOLTYPE", "USIZETYPE", "PUNTO", "COMA", "PTCOMA",
	"DOSPUNTOS", "AND", "OR_CASE", "OR", "NOT", "IGUAL", "IGUAL_IGUAL", "DIFERENTE",
	"MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "MUL", "DIV", "ADD", "SUB",
	"MOD", "NUMBER", "USIZE", "FLOAT", "STRING", "CHAR", "TRUE", "FALSE", "ID",
	"WHITESPACE",
}

var ruleNames = []string{
	"start", "listaFunciones", "funcionItem", "modaccess", "parametros", "funcmain",
	"bloque", "instrucciones", "instruccion", "asignacion", "if_instr", "listaelseif",
	"else_if", "match_instr", "bloque_match", "listacase", "match_case", "listaexpre_case",
	"while_instr", "loop_instr", "consola", "llamada", "listaExpresiones",
	"declaracionIni", "declaracion", "retorno", "sentencia_break", "sentencia_continue",
	"listides", "tiposvars", "dec_arr", "dimensiones", "dimension", "arraydata",
	"instancia", "listanchos", "ancho", "dec_objeto", "instanciaClase", "accesoarr",
	"accesoObjeto", "listaAccesos", "acceso", "expression", "expr_rel", "expr_log",
	"expr_arit", "expr_valor", "primitivo",
}

type Parser struct {
	*antlr.BaseParser
}

// NewParser produces a new parser instance for the optional input antlr.TokenStream.
//
// The *Parser instance produced may be reused by calling the SetInputStream method.
// The initial parser configuration is expensive to construct, and the object is not thread-safe;
// however, if used within a Golang sync.Pool, the construction cost amortizes well and the
// objects can be used in a thread-safe manner.
func NewParser(input antlr.TokenStream) *Parser {
	this := new(Parser)
	deserializer := antlr.NewATNDeserializer(nil)
	deserializedATN := deserializer.DeserializeFromUInt16(parserATN)
	decisionToDFA := make([]*antlr.DFA, len(deserializedATN.DecisionToState))
	for index, ds := range deserializedATN.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(ds, index)
	}
	this.BaseParser = antlr.NewBaseParser(input)

	this.Interpreter = antlr.NewParserATNSimulator(this, deserializedATN, decisionToDFA, antlr.NewPredictionContextCache())
	this.RuleNames = ruleNames
	this.LiteralNames = literalNames
	this.SymbolicNames = symbolicNames
	this.GrammarFileName = "Parser.g4"

	return this
}

type Prueba2 struct {
	Op1      int
	Operador string
	Op2      int
}

// Parser tokens.
const (
	ParserEOF         = antlr.TokenEOF
	ParserLP          = 1
	ParserRP          = 2
	ParserL_LLAVE     = 3
	ParserR_LLAVE     = 4
	ParserL_CORCH     = 5
	ParserR_CORCH     = 6
	ParserGUION_BAJO  = 7
	ParserPRINTLN     = 8
	ParserVEC         = 9
	ParserVEC_VACIO   = 10
	ParserIF_TOK      = 11
	ParserELSE        = 12
	ParserMATCH       = 13
	ParserWHILE       = 14
	ParserLOOP        = 15
	ParserFOR         = 16
	ParserIN          = 17
	ParserMUT         = 18
	ParserFN          = 19
	ParserLET         = 20
	ParserCLASS       = 21
	ParserNEW_        = 22
	ParserMAIN        = 23
	ParserPRIVATE     = 24
	ParserPUB         = 25
	ParserSTATIC      = 26
	ParserRETURN_P    = 27
	ParserBREAK_P     = 28
	ParserCONTINUE_P  = 29
	ParserABS         = 30
	ParserSQRT        = 31
	ParserTO_STRING   = 32
	ParserCLONE       = 33
	ParserPOW         = 34
	ParserPOWF        = 35
	ParserINTTYPE     = 36
	ParserFLOATTYPE   = 37
	ParserSTRINGTYPE  = 38
	ParserSTRTYPE     = 39
	ParserCHARTYPE    = 40
	ParserVOIDTYPE    = 41
	ParserBOOLTYPE    = 42
	ParserUSIZETYPE   = 43
	ParserPUNTO       = 44
	ParserCOMA        = 45
	ParserPTCOMA      = 46
	ParserDOSPUNTOS   = 47
	ParserAND         = 48
	ParserOR_CASE     = 49
	ParserOR          = 50
	ParserNOT         = 51
	ParserIGUAL       = 52
	ParserIGUAL_IGUAL = 53
	ParserDIFERENTE   = 54
	ParserMAYORIGUAL  = 55
	ParserMENORIGUAL  = 56
	ParserMAYOR       = 57
	ParserMENOR       = 58
	ParserMUL         = 59
	ParserDIV         = 60
	ParserADD         = 61
	ParserSUB         = 62
	ParserMOD         = 63
	ParserNUMBER      = 64
	ParserUSIZE       = 65
	ParserFLOAT       = 66
	ParserSTRING      = 67
	ParserCHAR        = 68
	ParserTRUE        = 69
	ParserFALSE       = 70
	ParserID          = 71
	ParserWHITESPACE  = 72
)

// Parser rules.
const (
	ParserRULE_start              = 0
	ParserRULE_listaFunciones     = 1
	ParserRULE_funcionItem        = 2
	ParserRULE_modaccess          = 3
	ParserRULE_parametros         = 4
	ParserRULE_funcmain           = 5
	ParserRULE_bloque             = 6
	ParserRULE_instrucciones      = 7
	ParserRULE_instruccion        = 8
	ParserRULE_asignacion         = 9
	ParserRULE_if_instr           = 10
	ParserRULE_listaelseif        = 11
	ParserRULE_else_if            = 12
	ParserRULE_match_instr        = 13
	ParserRULE_bloque_match       = 14
	ParserRULE_listacase          = 15
	ParserRULE_match_case         = 16
	ParserRULE_listaexpre_case    = 17
	ParserRULE_while_instr        = 18
	ParserRULE_loop_instr         = 19
	ParserRULE_consola            = 20
	ParserRULE_llamada            = 21
	ParserRULE_listaExpresiones   = 22
	ParserRULE_declaracionIni     = 23
	ParserRULE_declaracion        = 24
	ParserRULE_retorno            = 25
	ParserRULE_sentencia_break    = 26
	ParserRULE_sentencia_continue = 27
	ParserRULE_listides           = 28
	ParserRULE_tiposvars          = 29
	ParserRULE_dec_arr            = 30
	ParserRULE_dimensiones        = 31
	ParserRULE_dimension          = 32
	ParserRULE_arraydata          = 33
	ParserRULE_instancia          = 34
	ParserRULE_listanchos         = 35
	ParserRULE_ancho              = 36
	ParserRULE_dec_objeto         = 37
	ParserRULE_instanciaClase     = 38
	ParserRULE_accesoarr          = 39
	ParserRULE_accesoObjeto       = 40
	ParserRULE_listaAccesos       = 41
	ParserRULE_acceso             = 42
	ParserRULE_expression         = 43
	ParserRULE_expr_rel           = 44
	ParserRULE_expr_log           = 45
	ParserRULE_expr_arit          = 46
	ParserRULE_expr_valor         = 47
	ParserRULE_primitivo          = 48
)

// IStartContext is an interface to support dynamic dispatch.
type IStartContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_listaFunciones returns the _listaFunciones rule contexts.
	Get_listaFunciones() IListaFuncionesContext

	// Set_listaFunciones sets the _listaFunciones rule contexts.
	Set_listaFunciones(IListaFuncionesContext)

	// GetAst returns the ast attribute.
	GetAst() ast.Ast

	// SetAst sets the ast attribute.
	SetAst(ast.Ast)

	// IsStartContext differentiates from other interfaces.
	IsStartContext()
}

type StartContext struct {
	*antlr.BaseParserRuleContext
	parser          antlr.Parser
	ast             ast.Ast
	_listaFunciones IListaFuncionesContext
}

func NewEmptyStartContext() *StartContext {
	var p = new(StartContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_start
	return p
}

func (*StartContext) IsStartContext() {}

func NewStartContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *StartContext {
	var p = new(StartContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_start

	return p
}

func (s *StartContext) GetParser() antlr.Parser { return s.parser }

func (s *StartContext) Get_listaFunciones() IListaFuncionesContext { return s._listaFunciones }

func (s *StartContext) Set_listaFunciones(v IListaFuncionesContext) { s._listaFunciones = v }

func (s *StartContext) GetAst() ast.Ast { return s.ast }

func (s *StartContext) SetAst(v ast.Ast) { s.ast = v }

func (s *StartContext) ListaFunciones() IListaFuncionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaFuncionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaFuncionesContext)
}

func (s *StartContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *StartContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *StartContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterStart(s)
	}
}

func (s *StartContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitStart(s)
	}
}

func (p *Parser) Start() (localctx IStartContext) {
	localctx = NewStartContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, ParserRULE_start)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(98)

		var _x = p.listaFunciones(0)

		localctx.(*StartContext)._listaFunciones = _x
	}
	localctx.(*StartContext).ast = ast.NuevoAst(localctx.(*StartContext).Get_listaFunciones().GetLista())

	return localctx
}

// IListaFuncionesContext is an interface to support dynamic dispatch.
type IListaFuncionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetSUBLISTA returns the SUBLISTA rule contexts.
	GetSUBLISTA() IListaFuncionesContext

	// Get_funcionItem returns the _funcionItem rule contexts.
	Get_funcionItem() IFuncionItemContext

	// SetSUBLISTA sets the SUBLISTA rule contexts.
	SetSUBLISTA(IListaFuncionesContext)

	// Set_funcionItem sets the _funcionItem rule contexts.
	Set_funcionItem(IFuncionItemContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaFuncionesContext differentiates from other interfaces.
	IsListaFuncionesContext()
}

type ListaFuncionesContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	lista        *arrayList.List
	SUBLISTA     IListaFuncionesContext
	_funcionItem IFuncionItemContext
}

func NewEmptyListaFuncionesContext() *ListaFuncionesContext {
	var p = new(ListaFuncionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listaFunciones
	return p
}

func (*ListaFuncionesContext) IsListaFuncionesContext() {}

func NewListaFuncionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaFuncionesContext {
	var p = new(ListaFuncionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listaFunciones

	return p
}

func (s *ListaFuncionesContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaFuncionesContext) GetSUBLISTA() IListaFuncionesContext { return s.SUBLISTA }

func (s *ListaFuncionesContext) Get_funcionItem() IFuncionItemContext { return s._funcionItem }

func (s *ListaFuncionesContext) SetSUBLISTA(v IListaFuncionesContext) { s.SUBLISTA = v }

func (s *ListaFuncionesContext) Set_funcionItem(v IFuncionItemContext) { s._funcionItem = v }

func (s *ListaFuncionesContext) GetLista() *arrayList.List { return s.lista }

func (s *ListaFuncionesContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListaFuncionesContext) FuncionItem() IFuncionItemContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFuncionItemContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFuncionItemContext)
}

func (s *ListaFuncionesContext) ListaFunciones() IListaFuncionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaFuncionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaFuncionesContext)
}

func (s *ListaFuncionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaFuncionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaFuncionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListaFunciones(s)
	}
}

func (s *ListaFuncionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListaFunciones(s)
	}
}

func (p *Parser) ListaFunciones() (localctx IListaFuncionesContext) {
	return p.listaFunciones(0)
}

func (p *Parser) listaFunciones(_p int) (localctx IListaFuncionesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListaFuncionesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListaFuncionesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 2
	p.EnterRecursionRule(localctx, 2, ParserRULE_listaFunciones, _p)

	localctx.(*ListaFuncionesContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(102)

		var _x = p.FuncionItem()

		localctx.(*ListaFuncionesContext)._funcionItem = _x
	}
	localctx.(*ListaFuncionesContext).lista.Add(localctx.(*ListaFuncionesContext).Get_funcionItem().GetInstr())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(111)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaFuncionesContext(p, _parentctx, _parentState)
			localctx.(*ListaFuncionesContext).SUBLISTA = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listaFunciones)
			p.SetState(105)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(106)

				var _x = p.FuncionItem()

				localctx.(*ListaFuncionesContext)._funcionItem = _x
			}

			localctx.(*ListaFuncionesContext).GetSUBLISTA().GetLista().Add(localctx.(*ListaFuncionesContext).Get_funcionItem().GetInstr())
			localctx.(*ListaFuncionesContext).lista = localctx.(*ListaFuncionesContext).GetSUBLISTA().GetLista()

		}
		p.SetState(113)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 0, p.GetParserRuleContext())
	}

	return localctx
}

// IFuncionItemContext is an interface to support dynamic dispatch.
type IFuncionItemContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_funcmain returns the _funcmain rule contexts.
	Get_funcmain() IFuncmainContext

	// Get_modaccess returns the _modaccess rule contexts.
	Get_modaccess() IModaccessContext

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Get_parametros returns the _parametros rule contexts.
	Get_parametros() IParametrosContext

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// Set_funcmain sets the _funcmain rule contexts.
	Set_funcmain(IFuncmainContext)

	// Set_modaccess sets the _modaccess rule contexts.
	Set_modaccess(IModaccessContext)

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// Set_parametros sets the _parametros rule contexts.
	Set_parametros(IParametrosContext)

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsFuncionItemContext differentiates from other interfaces.
	IsFuncionItemContext()
}

type FuncionItemContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_funcmain   IFuncmainContext
	_modaccess  IModaccessContext
	_ID         antlr.Token
	_bloque     IBloqueContext
	_parametros IParametrosContext
	_tiposvars  ITiposvarsContext
}

func NewEmptyFuncionItemContext() *FuncionItemContext {
	var p = new(FuncionItemContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_funcionItem
	return p
}

func (*FuncionItemContext) IsFuncionItemContext() {}

func NewFuncionItemContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncionItemContext {
	var p = new(FuncionItemContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_funcionItem

	return p
}

func (s *FuncionItemContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncionItemContext) Get_ID() antlr.Token { return s._ID }

func (s *FuncionItemContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *FuncionItemContext) Get_funcmain() IFuncmainContext { return s._funcmain }

func (s *FuncionItemContext) Get_modaccess() IModaccessContext { return s._modaccess }

func (s *FuncionItemContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *FuncionItemContext) Get_parametros() IParametrosContext { return s._parametros }

func (s *FuncionItemContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *FuncionItemContext) Set_funcmain(v IFuncmainContext) { s._funcmain = v }

func (s *FuncionItemContext) Set_modaccess(v IModaccessContext) { s._modaccess = v }

func (s *FuncionItemContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *FuncionItemContext) Set_parametros(v IParametrosContext) { s._parametros = v }

func (s *FuncionItemContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *FuncionItemContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *FuncionItemContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *FuncionItemContext) Funcmain() IFuncmainContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IFuncmainContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IFuncmainContext)
}

func (s *FuncionItemContext) Modaccess() IModaccessContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IModaccessContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IModaccessContext)
}

func (s *FuncionItemContext) FN() antlr.TerminalNode {
	return s.GetToken(ParserFN, 0)
}

func (s *FuncionItemContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *FuncionItemContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *FuncionItemContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *FuncionItemContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *FuncionItemContext) Parametros() IParametrosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParametrosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParametrosContext)
}

func (s *FuncionItemContext) SUB() antlr.TerminalNode {
	return s.GetToken(ParserSUB, 0)
}

func (s *FuncionItemContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(ParserMAYOR, 0)
}

func (s *FuncionItemContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *FuncionItemContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncionItemContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncionItemContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterFuncionItem(s)
	}
}

func (s *FuncionItemContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitFuncionItem(s)
	}
}

func (p *Parser) FuncionItem() (localctx IFuncionItemContext) {
	localctx = NewFuncionItemContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, ParserRULE_funcionItem)
	listaParams := arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(157)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 1, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(114)

			var _x = p.Funcmain()

			localctx.(*FuncionItemContext)._funcmain = _x
		}
		localctx.(*FuncionItemContext).instr = localctx.(*FuncionItemContext).Get_funcmain().GetInstr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(117)

			var _x = p.Modaccess()

			localctx.(*FuncionItemContext)._modaccess = _x
		}
		{
			p.SetState(118)
			p.Match(ParserFN)
		}
		{
			p.SetState(119)

			var _m = p.Match(ParserID)

			localctx.(*FuncionItemContext)._ID = _m
		}
		{
			p.SetState(120)
			p.Match(ParserLP)
		}
		{
			p.SetState(121)
			p.Match(ParserRP)
		}
		{
			p.SetState(122)

			var _x = p.Bloque()

			localctx.(*FuncionItemContext)._bloque = _x
		}
		localctx.(*FuncionItemContext).instr = Simbolos.NuevoFuncion((func() string {
			if localctx.(*FuncionItemContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionItemContext).Get_ID().GetText()
			}
		}()), listaParams, localctx.(*FuncionItemContext).Get_bloque().GetLista(), entorno.VOID, localctx.(*FuncionItemContext).Get_modaccess().GetModAccess())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(125)

			var _x = p.Modaccess()

			localctx.(*FuncionItemContext)._modaccess = _x
		}
		{
			p.SetState(126)
			p.Match(ParserFN)
		}
		{
			p.SetState(127)

			var _m = p.Match(ParserID)

			localctx.(*FuncionItemContext)._ID = _m
		}
		{
			p.SetState(128)
			p.Match(ParserLP)
		}
		{
			p.SetState(129)

			var _x = p.parametros(0)

			localctx.(*FuncionItemContext)._parametros = _x
		}
		{
			p.SetState(130)
			p.Match(ParserRP)
		}
		{
			p.SetState(131)

			var _x = p.Bloque()

			localctx.(*FuncionItemContext)._bloque = _x
		}
		localctx.(*FuncionItemContext).instr = Simbolos.NuevoFuncion((func() string {
			if localctx.(*FuncionItemContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionItemContext).Get_ID().GetText()
			}
		}()), localctx.(*FuncionItemContext).Get_parametros().GetLista(), localctx.(*FuncionItemContext).Get_bloque().GetLista(), entorno.VOID, localctx.(*FuncionItemContext).Get_modaccess().GetModAccess())

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(134)

			var _x = p.Modaccess()

			localctx.(*FuncionItemContext)._modaccess = _x
		}
		{
			p.SetState(135)
			p.Match(ParserFN)
		}
		{
			p.SetState(136)

			var _m = p.Match(ParserID)

			localctx.(*FuncionItemContext)._ID = _m
		}
		{
			p.SetState(137)
			p.Match(ParserLP)
		}
		{
			p.SetState(138)
			p.Match(ParserRP)
		}
		{
			p.SetState(139)
			p.Match(ParserSUB)
		}
		{
			p.SetState(140)
			p.Match(ParserMAYOR)
		}
		{
			p.SetState(141)

			var _x = p.Tiposvars()

			localctx.(*FuncionItemContext)._tiposvars = _x
		}
		{
			p.SetState(142)

			var _x = p.Bloque()

			localctx.(*FuncionItemContext)._bloque = _x
		}
		localctx.(*FuncionItemContext).instr = Simbolos.NuevoFuncion((func() string {
			if localctx.(*FuncionItemContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionItemContext).Get_ID().GetText()
			}
		}()), listaParams, localctx.(*FuncionItemContext).Get_bloque().GetLista(), localctx.(*FuncionItemContext).Get_tiposvars().GetTipo(), localctx.(*FuncionItemContext).Get_modaccess().GetModAccess())

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(145)

			var _x = p.Modaccess()

			localctx.(*FuncionItemContext)._modaccess = _x
		}
		{
			p.SetState(146)
			p.Match(ParserFN)
		}
		{
			p.SetState(147)

			var _m = p.Match(ParserID)

			localctx.(*FuncionItemContext)._ID = _m
		}
		{
			p.SetState(148)
			p.Match(ParserLP)
		}
		{
			p.SetState(149)

			var _x = p.parametros(0)

			localctx.(*FuncionItemContext)._parametros = _x
		}
		{
			p.SetState(150)
			p.Match(ParserRP)
		}
		{
			p.SetState(151)
			p.Match(ParserSUB)
		}
		{
			p.SetState(152)
			p.Match(ParserMAYOR)
		}
		{
			p.SetState(153)

			var _x = p.Tiposvars()

			localctx.(*FuncionItemContext)._tiposvars = _x
		}
		{
			p.SetState(154)

			var _x = p.Bloque()

			localctx.(*FuncionItemContext)._bloque = _x
		}
		localctx.(*FuncionItemContext).instr = Simbolos.NuevoFuncion((func() string {
			if localctx.(*FuncionItemContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*FuncionItemContext).Get_ID().GetText()
			}
		}()), localctx.(*FuncionItemContext).Get_parametros().GetLista(), localctx.(*FuncionItemContext).Get_bloque().GetLista(), localctx.(*FuncionItemContext).Get_tiposvars().GetTipo(), localctx.(*FuncionItemContext).Get_modaccess().GetModAccess())

	}

	return localctx
}

// IModaccessContext is an interface to support dynamic dispatch.
type IModaccessContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetModAccess returns the modAccess attribute.
	GetModAccess() entorno.TipoModAccess

	// SetModAccess sets the modAccess attribute.
	SetModAccess(entorno.TipoModAccess)

	// IsModaccessContext differentiates from other interfaces.
	IsModaccessContext()
}

type ModaccessContext struct {
	*antlr.BaseParserRuleContext
	parser    antlr.Parser
	modAccess entorno.TipoModAccess
}

func NewEmptyModaccessContext() *ModaccessContext {
	var p = new(ModaccessContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_modaccess
	return p
}

func (*ModaccessContext) IsModaccessContext() {}

func NewModaccessContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ModaccessContext {
	var p = new(ModaccessContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_modaccess

	return p
}

func (s *ModaccessContext) GetParser() antlr.Parser { return s.parser }

func (s *ModaccessContext) GetModAccess() entorno.TipoModAccess { return s.modAccess }

func (s *ModaccessContext) SetModAccess(v entorno.TipoModAccess) { s.modAccess = v }

func (s *ModaccessContext) PUB() antlr.TerminalNode {
	return s.GetToken(ParserPUB, 0)
}

func (s *ModaccessContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ModaccessContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ModaccessContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterModaccess(s)
	}
}

func (s *ModaccessContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitModaccess(s)
	}
}

func (p *Parser) Modaccess() (localctx IModaccessContext) {
	localctx = NewModaccessContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, ParserRULE_modaccess)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(162)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ParserPUB:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(159)
			p.Match(ParserPUB)
		}
		localctx.(*ModaccessContext).modAccess = entorno.PUBLIC

	case ParserFN:
		p.EnterOuterAlt(localctx, 2)
		localctx.(*ModaccessContext).modAccess = entorno.PRIVATE

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IParametrosContext is an interface to support dynamic dispatch.
type IParametrosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetSublista returns the sublista rule contexts.
	GetSublista() IParametrosContext

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// SetSublista sets the sublista rule contexts.
	SetSublista(IParametrosContext)

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsParametrosContext differentiates from other interfaces.
	IsParametrosContext()
}

type ParametrosContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	lista      *arrayList.List
	sublista   IParametrosContext
	_tiposvars ITiposvarsContext
	_ID        antlr.Token
}

func NewEmptyParametrosContext() *ParametrosContext {
	var p = new(ParametrosContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_parametros
	return p
}

func (*ParametrosContext) IsParametrosContext() {}

func NewParametrosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ParametrosContext {
	var p = new(ParametrosContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_parametros

	return p
}

func (s *ParametrosContext) GetParser() antlr.Parser { return s.parser }

func (s *ParametrosContext) Get_ID() antlr.Token { return s._ID }

func (s *ParametrosContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ParametrosContext) GetSublista() IParametrosContext { return s.sublista }

func (s *ParametrosContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *ParametrosContext) SetSublista(v IParametrosContext) { s.sublista = v }

func (s *ParametrosContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *ParametrosContext) GetLista() *arrayList.List { return s.lista }

func (s *ParametrosContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ParametrosContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *ParametrosContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *ParametrosContext) COMA() antlr.TerminalNode {
	return s.GetToken(ParserCOMA, 0)
}

func (s *ParametrosContext) Parametros() IParametrosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IParametrosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IParametrosContext)
}

func (s *ParametrosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ParametrosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ParametrosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterParametros(s)
	}
}

func (s *ParametrosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitParametros(s)
	}
}

func (p *Parser) Parametros() (localctx IParametrosContext) {
	return p.parametros(0)
}

func (p *Parser) parametros(_p int) (localctx IParametrosContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewParametrosContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IParametrosContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 8
	p.EnterRecursionRule(localctx, 8, ParserRULE_parametros, _p)

	localctx.(*ParametrosContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(165)

		var _x = p.Tiposvars()

		localctx.(*ParametrosContext)._tiposvars = _x
	}
	{
		p.SetState(166)

		var _m = p.Match(ParserID)

		localctx.(*ParametrosContext)._ID = _m
	}

	listaIdes := arrayList.New()
	listaIdes.Add(expresion.NuevoIdentificador((func() string {
		if localctx.(*ParametrosContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ParametrosContext).Get_ID().GetText()
		}
	}())))
	decl := instrucciones.NuevaDeclaracion(listaIdes, localctx.(*ParametrosContext).Get_tiposvars().GetTipo())
	localctx.(*ParametrosContext).lista.Add(decl)

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(177)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewParametrosContext(p, _parentctx, _parentState)
			localctx.(*ParametrosContext).sublista = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_parametros)
			p.SetState(169)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(170)
				p.Match(ParserCOMA)
			}
			{
				p.SetState(171)

				var _x = p.Tiposvars()

				localctx.(*ParametrosContext)._tiposvars = _x
			}
			{
				p.SetState(172)

				var _m = p.Match(ParserID)

				localctx.(*ParametrosContext)._ID = _m
			}

			listaIdes := arrayList.New()
			listaIdes.Add(expresion.NuevoIdentificador((func() string {
				if localctx.(*ParametrosContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*ParametrosContext).Get_ID().GetText()
				}
			}())))

			decl := instrucciones.NuevaDeclaracion(listaIdes, localctx.(*ParametrosContext).Get_tiposvars().GetTipo())
			localctx.(*ParametrosContext).GetSublista().GetLista().Add(decl)
			localctx.(*ParametrosContext).lista = localctx.(*ParametrosContext).GetSublista().GetLista()

		}
		p.SetState(179)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 3, p.GetParserRuleContext())
	}

	return localctx
}

// IFuncmainContext is an interface to support dynamic dispatch.
type IFuncmainContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsFuncmainContext differentiates from other interfaces.
	IsFuncmainContext()
}

type FuncmainContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	instr   interfaces.Instruccion
	_bloque IBloqueContext
}

func NewEmptyFuncmainContext() *FuncmainContext {
	var p = new(FuncmainContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_funcmain
	return p
}

func (*FuncmainContext) IsFuncmainContext() {}

func NewFuncmainContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *FuncmainContext {
	var p = new(FuncmainContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_funcmain

	return p
}

func (s *FuncmainContext) GetParser() antlr.Parser { return s.parser }

func (s *FuncmainContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *FuncmainContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *FuncmainContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *FuncmainContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *FuncmainContext) FN() antlr.TerminalNode {
	return s.GetToken(ParserFN, 0)
}

func (s *FuncmainContext) MAIN() antlr.TerminalNode {
	return s.GetToken(ParserMAIN, 0)
}

func (s *FuncmainContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *FuncmainContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *FuncmainContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *FuncmainContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *FuncmainContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *FuncmainContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterFuncmain(s)
	}
}

func (s *FuncmainContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitFuncmain(s)
	}
}

func (p *Parser) Funcmain() (localctx IFuncmainContext) {
	localctx = NewFuncmainContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, ParserRULE_funcmain)
	listaParams := arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(180)
		p.Match(ParserFN)
	}
	{
		p.SetState(181)
		p.Match(ParserMAIN)
	}
	{
		p.SetState(182)
		p.Match(ParserLP)
	}
	{
		p.SetState(183)
		p.Match(ParserRP)
	}
	{
		p.SetState(184)

		var _x = p.Bloque()

		localctx.(*FuncmainContext)._bloque = _x
	}
	localctx.(*FuncmainContext).instr = Simbolos.NuevoFuncion("main", listaParams, localctx.(*FuncmainContext).Get_bloque().GetLista(), entorno.VOID, entorno.PRIVATE)

	return localctx
}

// IBloqueContext is an interface to support dynamic dispatch.
type IBloqueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instrucciones returns the _instrucciones rule contexts.
	Get_instrucciones() IInstruccionesContext

	// Set_instrucciones sets the _instrucciones rule contexts.
	Set_instrucciones(IInstruccionesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsBloqueContext differentiates from other interfaces.
	IsBloqueContext()
}

type BloqueContext struct {
	*antlr.BaseParserRuleContext
	parser         antlr.Parser
	lista          *arrayList.List
	_instrucciones IInstruccionesContext
}

func NewEmptyBloqueContext() *BloqueContext {
	var p = new(BloqueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_bloque
	return p
}

func (*BloqueContext) IsBloqueContext() {}

func NewBloqueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *BloqueContext {
	var p = new(BloqueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_bloque

	return p
}

func (s *BloqueContext) GetParser() antlr.Parser { return s.parser }

func (s *BloqueContext) Get_instrucciones() IInstruccionesContext { return s._instrucciones }

func (s *BloqueContext) Set_instrucciones(v IInstruccionesContext) { s._instrucciones = v }

func (s *BloqueContext) GetLista() *arrayList.List { return s.lista }

func (s *BloqueContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *BloqueContext) L_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserL_LLAVE, 0)
}

func (s *BloqueContext) Instrucciones() IInstruccionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionesContext)
}

func (s *BloqueContext) R_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserR_LLAVE, 0)
}

func (s *BloqueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *BloqueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *BloqueContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterBloque(s)
	}
}

func (s *BloqueContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitBloque(s)
	}
}

func (p *Parser) Bloque() (localctx IBloqueContext) {
	localctx = NewBloqueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, ParserRULE_bloque)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(195)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 4, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(187)
			p.Match(ParserL_LLAVE)
		}
		{
			p.SetState(188)

			var _x = p.Instrucciones()

			localctx.(*BloqueContext)._instrucciones = _x
		}
		{
			p.SetState(189)
			p.Match(ParserR_LLAVE)
		}
		localctx.(*BloqueContext).lista = localctx.(*BloqueContext).Get_instrucciones().GetLista()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(192)
			p.Match(ParserL_LLAVE)
		}
		{
			p.SetState(193)
			p.Match(ParserR_LLAVE)
		}
		localctx.(*BloqueContext).lista = arrayList.New()

	}

	return localctx
}

// IInstruccionesContext is an interface to support dynamic dispatch.
type IInstruccionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_instruccion returns the _instruccion rule contexts.
	Get_instruccion() IInstruccionContext

	// Set_instruccion sets the _instruccion rule contexts.
	Set_instruccion(IInstruccionContext)

	// GetE returns the e rule context list.
	GetE() []IInstruccionContext

	// SetE sets the e rule context list.
	SetE([]IInstruccionContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsInstruccionesContext differentiates from other interfaces.
	IsInstruccionesContext()
}

type InstruccionesContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	lista        *arrayList.List
	_instruccion IInstruccionContext
	e            []IInstruccionContext
}

func NewEmptyInstruccionesContext() *InstruccionesContext {
	var p = new(InstruccionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_instrucciones
	return p
}

func (*InstruccionesContext) IsInstruccionesContext() {}

func NewInstruccionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionesContext {
	var p = new(InstruccionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_instrucciones

	return p
}

func (s *InstruccionesContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionesContext) Get_instruccion() IInstruccionContext { return s._instruccion }

func (s *InstruccionesContext) Set_instruccion(v IInstruccionContext) { s._instruccion = v }

func (s *InstruccionesContext) GetE() []IInstruccionContext { return s.e }

func (s *InstruccionesContext) SetE(v []IInstruccionContext) { s.e = v }

func (s *InstruccionesContext) GetLista() *arrayList.List { return s.lista }

func (s *InstruccionesContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *InstruccionesContext) AllInstruccion() []IInstruccionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IInstruccionContext)(nil)).Elem())
	var tst = make([]IInstruccionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IInstruccionContext)
		}
	}

	return tst
}

func (s *InstruccionesContext) Instruccion(i int) IInstruccionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IInstruccionContext)
}

func (s *InstruccionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterInstrucciones(s)
	}
}

func (s *InstruccionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitInstrucciones(s)
	}
}

func (p *Parser) Instrucciones() (localctx IInstruccionesContext) {
	localctx = NewInstruccionesContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 14, ParserRULE_instrucciones)
	localctx.(*InstruccionesContext).lista = arrayList.New()
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(198)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = (((_la-8)&-(0x1f+1)) == 0 && ((1<<uint((_la-8)))&((1<<(ParserPRINTLN-8))|(1<<(ParserIF_TOK-8))|(1<<(ParserMATCH-8))|(1<<(ParserWHILE-8))|(1<<(ParserLOOP-8))|(1<<(ParserLET-8))|(1<<(ParserRETURN_P-8))|(1<<(ParserBREAK_P-8))|(1<<(ParserCONTINUE_P-8))|(1<<(ParserINTTYPE-8))|(1<<(ParserFLOATTYPE-8))|(1<<(ParserSTRINGTYPE-8))|(1<<(ParserSTRTYPE-8)))) != 0) || (((_la-40)&-(0x1f+1)) == 0 && ((1<<uint((_la-40)))&((1<<(ParserCHARTYPE-40))|(1<<(ParserVOIDTYPE-40))|(1<<(ParserBOOLTYPE-40))|(1<<(ParserUSIZETYPE-40))|(1<<(ParserID-40)))) != 0) {
		{
			p.SetState(197)

			var _x = p.Instruccion()

			localctx.(*InstruccionesContext)._instruccion = _x
		}
		localctx.(*InstruccionesContext).e = append(localctx.(*InstruccionesContext).e, localctx.(*InstruccionesContext)._instruccion)

		p.SetState(200)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*InstruccionesContext).GetE()
	for _, e := range listInt {
		localctx.(*InstruccionesContext).lista.Add(e.GetInstr())
	}
	fmt.Printf("\ntipo %T", localctx.(*InstruccionesContext).GetE())

	return localctx
}

// IInstruccionContext is an interface to support dynamic dispatch.
type IInstruccionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_asignacion returns the _asignacion rule contexts.
	Get_asignacion() IAsignacionContext

	// Get_sentencia_break returns the _sentencia_break rule contexts.
	Get_sentencia_break() ISentencia_breakContext

	// Get_match_instr returns the _match_instr rule contexts.
	Get_match_instr() IMatch_instrContext

	// Get_consola returns the _consola rule contexts.
	Get_consola() IConsolaContext

	// Get_while_instr returns the _while_instr rule contexts.
	Get_while_instr() IWhile_instrContext

	// Get_loop_instr returns the _loop_instr rule contexts.
	Get_loop_instr() ILoop_instrContext

	// Get_if_instr returns the _if_instr rule contexts.
	Get_if_instr() IIf_instrContext

	// Get_declaracionIni returns the _declaracionIni rule contexts.
	Get_declaracionIni() IDeclaracionIniContext

	// Get_declaracion returns the _declaracion rule contexts.
	Get_declaracion() IDeclaracionContext

	// Get_llamada returns the _llamada rule contexts.
	Get_llamada() ILlamadaContext

	// Get_retorno returns the _retorno rule contexts.
	Get_retorno() IRetornoContext

	// Get_sentencia_continue returns the _sentencia_continue rule contexts.
	Get_sentencia_continue() ISentencia_continueContext

	// Get_dec_arr returns the _dec_arr rule contexts.
	Get_dec_arr() IDec_arrContext

	// Get_dec_objeto returns the _dec_objeto rule contexts.
	Get_dec_objeto() IDec_objetoContext

	// Set_asignacion sets the _asignacion rule contexts.
	Set_asignacion(IAsignacionContext)

	// Set_sentencia_break sets the _sentencia_break rule contexts.
	Set_sentencia_break(ISentencia_breakContext)

	// Set_match_instr sets the _match_instr rule contexts.
	Set_match_instr(IMatch_instrContext)

	// Set_consola sets the _consola rule contexts.
	Set_consola(IConsolaContext)

	// Set_while_instr sets the _while_instr rule contexts.
	Set_while_instr(IWhile_instrContext)

	// Set_loop_instr sets the _loop_instr rule contexts.
	Set_loop_instr(ILoop_instrContext)

	// Set_if_instr sets the _if_instr rule contexts.
	Set_if_instr(IIf_instrContext)

	// Set_declaracionIni sets the _declaracionIni rule contexts.
	Set_declaracionIni(IDeclaracionIniContext)

	// Set_declaracion sets the _declaracion rule contexts.
	Set_declaracion(IDeclaracionContext)

	// Set_llamada sets the _llamada rule contexts.
	Set_llamada(ILlamadaContext)

	// Set_retorno sets the _retorno rule contexts.
	Set_retorno(IRetornoContext)

	// Set_sentencia_continue sets the _sentencia_continue rule contexts.
	Set_sentencia_continue(ISentencia_continueContext)

	// Set_dec_arr sets the _dec_arr rule contexts.
	Set_dec_arr(IDec_arrContext)

	// Set_dec_objeto sets the _dec_objeto rule contexts.
	Set_dec_objeto(IDec_objetoContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsInstruccionContext differentiates from other interfaces.
	IsInstruccionContext()
}

type InstruccionContext struct {
	*antlr.BaseParserRuleContext
	parser              antlr.Parser
	instr               interfaces.Instruccion
	_asignacion         IAsignacionContext
	_sentencia_break    ISentencia_breakContext
	_match_instr        IMatch_instrContext
	_consola            IConsolaContext
	_while_instr        IWhile_instrContext
	_loop_instr         ILoop_instrContext
	_if_instr           IIf_instrContext
	_declaracionIni     IDeclaracionIniContext
	_declaracion        IDeclaracionContext
	_llamada            ILlamadaContext
	_retorno            IRetornoContext
	_sentencia_continue ISentencia_continueContext
	_dec_arr            IDec_arrContext
	_dec_objeto         IDec_objetoContext
}

func NewEmptyInstruccionContext() *InstruccionContext {
	var p = new(InstruccionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_instruccion
	return p
}

func (*InstruccionContext) IsInstruccionContext() {}

func NewInstruccionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstruccionContext {
	var p = new(InstruccionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_instruccion

	return p
}

func (s *InstruccionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstruccionContext) Get_asignacion() IAsignacionContext { return s._asignacion }

func (s *InstruccionContext) Get_sentencia_break() ISentencia_breakContext { return s._sentencia_break }

func (s *InstruccionContext) Get_match_instr() IMatch_instrContext { return s._match_instr }

func (s *InstruccionContext) Get_consola() IConsolaContext { return s._consola }

func (s *InstruccionContext) Get_while_instr() IWhile_instrContext { return s._while_instr }

func (s *InstruccionContext) Get_loop_instr() ILoop_instrContext { return s._loop_instr }

func (s *InstruccionContext) Get_if_instr() IIf_instrContext { return s._if_instr }

func (s *InstruccionContext) Get_declaracionIni() IDeclaracionIniContext { return s._declaracionIni }

func (s *InstruccionContext) Get_declaracion() IDeclaracionContext { return s._declaracion }

func (s *InstruccionContext) Get_llamada() ILlamadaContext { return s._llamada }

func (s *InstruccionContext) Get_retorno() IRetornoContext { return s._retorno }

func (s *InstruccionContext) Get_sentencia_continue() ISentencia_continueContext {
	return s._sentencia_continue
}

func (s *InstruccionContext) Get_dec_arr() IDec_arrContext { return s._dec_arr }

func (s *InstruccionContext) Get_dec_objeto() IDec_objetoContext { return s._dec_objeto }

func (s *InstruccionContext) Set_asignacion(v IAsignacionContext) { s._asignacion = v }

func (s *InstruccionContext) Set_sentencia_break(v ISentencia_breakContext) { s._sentencia_break = v }

func (s *InstruccionContext) Set_match_instr(v IMatch_instrContext) { s._match_instr = v }

func (s *InstruccionContext) Set_consola(v IConsolaContext) { s._consola = v }

func (s *InstruccionContext) Set_while_instr(v IWhile_instrContext) { s._while_instr = v }

func (s *InstruccionContext) Set_loop_instr(v ILoop_instrContext) { s._loop_instr = v }

func (s *InstruccionContext) Set_if_instr(v IIf_instrContext) { s._if_instr = v }

func (s *InstruccionContext) Set_declaracionIni(v IDeclaracionIniContext) { s._declaracionIni = v }

func (s *InstruccionContext) Set_declaracion(v IDeclaracionContext) { s._declaracion = v }

func (s *InstruccionContext) Set_llamada(v ILlamadaContext) { s._llamada = v }

func (s *InstruccionContext) Set_retorno(v IRetornoContext) { s._retorno = v }

func (s *InstruccionContext) Set_sentencia_continue(v ISentencia_continueContext) {
	s._sentencia_continue = v
}

func (s *InstruccionContext) Set_dec_arr(v IDec_arrContext) { s._dec_arr = v }

func (s *InstruccionContext) Set_dec_objeto(v IDec_objetoContext) { s._dec_objeto = v }

func (s *InstruccionContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *InstruccionContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *InstruccionContext) Asignacion() IAsignacionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAsignacionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAsignacionContext)
}

func (s *InstruccionContext) PTCOMA() antlr.TerminalNode {
	return s.GetToken(ParserPTCOMA, 0)
}

func (s *InstruccionContext) Sentencia_break() ISentencia_breakContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISentencia_breakContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISentencia_breakContext)
}

func (s *InstruccionContext) Match_instr() IMatch_instrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_instrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IMatch_instrContext)
}

func (s *InstruccionContext) Consola() IConsolaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IConsolaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IConsolaContext)
}

func (s *InstruccionContext) While_instr() IWhile_instrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IWhile_instrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IWhile_instrContext)
}

func (s *InstruccionContext) Loop_instr() ILoop_instrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILoop_instrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ILoop_instrContext)
}

func (s *InstruccionContext) If_instr() IIf_instrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IIf_instrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IIf_instrContext)
}

func (s *InstruccionContext) DeclaracionIni() IDeclaracionIniContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclaracionIniContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclaracionIniContext)
}

func (s *InstruccionContext) Declaracion() IDeclaracionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDeclaracionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDeclaracionContext)
}

func (s *InstruccionContext) Llamada() ILlamadaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILlamadaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ILlamadaContext)
}

func (s *InstruccionContext) Retorno() IRetornoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IRetornoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IRetornoContext)
}

func (s *InstruccionContext) Sentencia_continue() ISentencia_continueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ISentencia_continueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ISentencia_continueContext)
}

func (s *InstruccionContext) Dec_arr() IDec_arrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDec_arrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDec_arrContext)
}

func (s *InstruccionContext) Dec_objeto() IDec_objetoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDec_objetoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDec_objetoContext)
}

func (s *InstruccionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstruccionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstruccionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterInstruccion(s)
	}
}

func (s *InstruccionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitInstruccion(s)
	}
}

func (p *Parser) Instruccion() (localctx IInstruccionContext) {
	localctx = NewInstruccionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 16, ParserRULE_instruccion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(259)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 6, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(204)

			var _x = p.Asignacion()

			localctx.(*InstruccionContext)._asignacion = _x
		}
		{
			p.SetState(205)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_asignacion().GetInstr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(208)

			var _x = p.Sentencia_break()

			localctx.(*InstruccionContext)._sentencia_break = _x
		}
		{
			p.SetState(209)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_sentencia_break().GetInstr()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(212)

			var _x = p.Match_instr()

			localctx.(*InstruccionContext)._match_instr = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_match_instr().GetInstr()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(215)

			var _x = p.Consola()

			localctx.(*InstruccionContext)._consola = _x
		}
		{
			p.SetState(216)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_consola().GetInstr()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(219)

			var _x = p.Consola()

			localctx.(*InstruccionContext)._consola = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_consola().GetInstr()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(222)

			var _x = p.While_instr()

			localctx.(*InstruccionContext)._while_instr = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_while_instr().GetInstr()

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(225)

			var _x = p.Loop_instr()

			localctx.(*InstruccionContext)._loop_instr = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_loop_instr().GetInstr()

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(228)

			var _x = p.If_instr()

			localctx.(*InstruccionContext)._if_instr = _x
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_if_instr().GetInstr()

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(231)

			var _x = p.DeclaracionIni()

			localctx.(*InstruccionContext)._declaracionIni = _x
		}
		{
			p.SetState(232)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_declaracionIni().GetInstr()

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(235)

			var _x = p.Declaracion()

			localctx.(*InstruccionContext)._declaracion = _x
		}
		{
			p.SetState(236)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_declaracion().GetInstr()

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(239)

			var _x = p.Llamada()

			localctx.(*InstruccionContext)._llamada = _x
		}
		{
			p.SetState(240)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_llamada().GetInstr()

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(243)

			var _x = p.Retorno()

			localctx.(*InstruccionContext)._retorno = _x
		}
		{
			p.SetState(244)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_retorno().GetInstr()

	case 13:
		p.EnterOuterAlt(localctx, 13)
		{
			p.SetState(247)

			var _x = p.Sentencia_continue()

			localctx.(*InstruccionContext)._sentencia_continue = _x
		}
		{
			p.SetState(248)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_sentencia_continue().GetInstr()

	case 14:
		p.EnterOuterAlt(localctx, 14)
		{
			p.SetState(251)

			var _x = p.Dec_arr()

			localctx.(*InstruccionContext)._dec_arr = _x
		}
		{
			p.SetState(252)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_dec_arr().GetInstr()

	case 15:
		p.EnterOuterAlt(localctx, 15)
		{
			p.SetState(255)

			var _x = p.Dec_objeto()

			localctx.(*InstruccionContext)._dec_objeto = _x
		}
		{
			p.SetState(256)
			p.Match(ParserPTCOMA)
		}
		localctx.(*InstruccionContext).instr = localctx.(*InstruccionContext).Get_dec_objeto().GetInstr()

	}

	return localctx
}

// IAsignacionContext is an interface to support dynamic dispatch.
type IAsignacionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsAsignacionContext differentiates from other interfaces.
	IsAsignacionContext()
}

type AsignacionContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_ID         antlr.Token
	_expression IExpressionContext
}

func NewEmptyAsignacionContext() *AsignacionContext {
	var p = new(AsignacionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_asignacion
	return p
}

func (*AsignacionContext) IsAsignacionContext() {}

func NewAsignacionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AsignacionContext {
	var p = new(AsignacionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_asignacion

	return p
}

func (s *AsignacionContext) GetParser() antlr.Parser { return s.parser }

func (s *AsignacionContext) Get_ID() antlr.Token { return s._ID }

func (s *AsignacionContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *AsignacionContext) Get_expression() IExpressionContext { return s._expression }

func (s *AsignacionContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AsignacionContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *AsignacionContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *AsignacionContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *AsignacionContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL, 0)
}

func (s *AsignacionContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AsignacionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AsignacionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AsignacionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterAsignacion(s)
	}
}

func (s *AsignacionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitAsignacion(s)
	}
}

func (p *Parser) Asignacion() (localctx IAsignacionContext) {
	localctx = NewAsignacionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 18, ParserRULE_asignacion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(261)

		var _m = p.Match(ParserID)

		localctx.(*AsignacionContext)._ID = _m
	}
	{
		p.SetState(262)
		p.Match(ParserIGUAL)
	}
	{
		p.SetState(263)

		var _x = p.Expression()

		localctx.(*AsignacionContext)._expression = _x
	}
	localctx.(*AsignacionContext).instr = asignacion.NuevaAsignacion((func() string {
		if localctx.(*AsignacionContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*AsignacionContext).Get_ID().GetText()
		}
	}()), localctx.(*AsignacionContext).Get_expression().GetExpr(), 0, 0)

	return localctx
}

// IIf_instrContext is an interface to support dynamic dispatch.
type IIf_instrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// GetBprincipal returns the bprincipal rule contexts.
	GetBprincipal() IBloqueContext

	// GetBelse returns the belse rule contexts.
	GetBelse() IBloqueContext

	// Get_listaelseif returns the _listaelseif rule contexts.
	Get_listaelseif() IListaelseifContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// SetBprincipal sets the bprincipal rule contexts.
	SetBprincipal(IBloqueContext)

	// SetBelse sets the belse rule contexts.
	SetBelse(IBloqueContext)

	// Set_listaelseif sets the _listaelseif rule contexts.
	Set_listaelseif(IListaelseifContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsIf_instrContext differentiates from other interfaces.
	IsIf_instrContext()
}

type If_instrContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	instr        interfaces.Instruccion
	_expression  IExpressionContext
	_bloque      IBloqueContext
	bprincipal   IBloqueContext
	belse        IBloqueContext
	_listaelseif IListaelseifContext
}

func NewEmptyIf_instrContext() *If_instrContext {
	var p = new(If_instrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_if_instr
	return p
}

func (*If_instrContext) IsIf_instrContext() {}

func NewIf_instrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *If_instrContext {
	var p = new(If_instrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_if_instr

	return p
}

func (s *If_instrContext) GetParser() antlr.Parser { return s.parser }

func (s *If_instrContext) Get_expression() IExpressionContext { return s._expression }

func (s *If_instrContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *If_instrContext) GetBprincipal() IBloqueContext { return s.bprincipal }

func (s *If_instrContext) GetBelse() IBloqueContext { return s.belse }

func (s *If_instrContext) Get_listaelseif() IListaelseifContext { return s._listaelseif }

func (s *If_instrContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *If_instrContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *If_instrContext) SetBprincipal(v IBloqueContext) { s.bprincipal = v }

func (s *If_instrContext) SetBelse(v IBloqueContext) { s.belse = v }

func (s *If_instrContext) Set_listaelseif(v IListaelseifContext) { s._listaelseif = v }

func (s *If_instrContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *If_instrContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *If_instrContext) IF_TOK() antlr.TerminalNode {
	return s.GetToken(ParserIF_TOK, 0)
}

func (s *If_instrContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *If_instrContext) AllBloque() []IBloqueContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IBloqueContext)(nil)).Elem())
	var tst = make([]IBloqueContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IBloqueContext)
		}
	}

	return tst
}

func (s *If_instrContext) Bloque(i int) IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *If_instrContext) ELSE() antlr.TerminalNode {
	return s.GetToken(ParserELSE, 0)
}

func (s *If_instrContext) Listaelseif() IListaelseifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaelseifContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaelseifContext)
}

func (s *If_instrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *If_instrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *If_instrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterIf_instr(s)
	}
}

func (s *If_instrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitIf_instr(s)
	}
}

func (p *Parser) If_instr() (localctx IIf_instrContext) {
	localctx = NewIf_instrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 20, ParserRULE_if_instr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(286)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 7, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(266)
			p.Match(ParserIF_TOK)
		}
		{
			p.SetState(267)

			var _x = p.Expression()

			localctx.(*If_instrContext)._expression = _x
		}
		{
			p.SetState(268)

			var _x = p.Bloque()

			localctx.(*If_instrContext)._bloque = _x
		}

		localctx.(*If_instrContext).instr = SentenciasControl.NewIfInstruccion(localctx.(*If_instrContext).Get_expression().GetExpr(), localctx.(*If_instrContext).Get_bloque().GetLista(), nil, nil)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(271)
			p.Match(ParserIF_TOK)
		}
		{
			p.SetState(272)

			var _x = p.Expression()

			localctx.(*If_instrContext)._expression = _x
		}
		{
			p.SetState(273)

			var _x = p.Bloque()

			localctx.(*If_instrContext).bprincipal = _x
		}
		{
			p.SetState(274)
			p.Match(ParserELSE)
		}
		{
			p.SetState(275)

			var _x = p.Bloque()

			localctx.(*If_instrContext).belse = _x
		}

		localctx.(*If_instrContext).instr = SentenciasControl.NewIfInstruccion(localctx.(*If_instrContext).Get_expression().GetExpr(), localctx.(*If_instrContext).GetBprincipal().GetLista(), nil, localctx.(*If_instrContext).GetBelse().GetLista())

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(278)
			p.Match(ParserIF_TOK)
		}
		{
			p.SetState(279)

			var _x = p.Expression()

			localctx.(*If_instrContext)._expression = _x
		}
		{
			p.SetState(280)

			var _x = p.Bloque()

			localctx.(*If_instrContext).bprincipal = _x
		}
		{
			p.SetState(281)

			var _x = p.Listaelseif()

			localctx.(*If_instrContext)._listaelseif = _x
		}
		{
			p.SetState(282)
			p.Match(ParserELSE)
		}
		{
			p.SetState(283)

			var _x = p.Bloque()

			localctx.(*If_instrContext).belse = _x
		}

		localctx.(*If_instrContext).instr = SentenciasControl.NewIfInstruccion(localctx.(*If_instrContext).Get_expression().GetExpr(), localctx.(*If_instrContext).GetBprincipal().GetLista(), localctx.(*If_instrContext).Get_listaelseif().GetLista(), localctx.(*If_instrContext).GetBelse().GetLista())

	}

	return localctx
}

// IListaelseifContext is an interface to support dynamic dispatch.
type IListaelseifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_else_if returns the _else_if rule contexts.
	Get_else_if() IElse_ifContext

	// Set_else_if sets the _else_if rule contexts.
	Set_else_if(IElse_ifContext)

	// GetList returns the list rule context list.
	GetList() []IElse_ifContext

	// SetList sets the list rule context list.
	SetList([]IElse_ifContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaelseifContext differentiates from other interfaces.
	IsListaelseifContext()
}

type ListaelseifContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	_else_if IElse_ifContext
	list     []IElse_ifContext
}

func NewEmptyListaelseifContext() *ListaelseifContext {
	var p = new(ListaelseifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listaelseif
	return p
}

func (*ListaelseifContext) IsListaelseifContext() {}

func NewListaelseifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaelseifContext {
	var p = new(ListaelseifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listaelseif

	return p
}

func (s *ListaelseifContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaelseifContext) Get_else_if() IElse_ifContext { return s._else_if }

func (s *ListaelseifContext) Set_else_if(v IElse_ifContext) { s._else_if = v }

func (s *ListaelseifContext) GetList() []IElse_ifContext { return s.list }

func (s *ListaelseifContext) SetList(v []IElse_ifContext) { s.list = v }

func (s *ListaelseifContext) GetLista() *arrayList.List { return s.lista }

func (s *ListaelseifContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListaelseifContext) AllElse_if() []IElse_ifContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IElse_ifContext)(nil)).Elem())
	var tst = make([]IElse_ifContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IElse_ifContext)
		}
	}

	return tst
}

func (s *ListaelseifContext) Else_if(i int) IElse_ifContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IElse_ifContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IElse_ifContext)
}

func (s *ListaelseifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaelseifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaelseifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListaelseif(s)
	}
}

func (s *ListaelseifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListaelseif(s)
	}
}

func (p *Parser) Listaelseif() (localctx IListaelseifContext) {
	localctx = NewListaelseifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 22, ParserRULE_listaelseif)
	localctx.(*ListaelseifContext).lista = arrayList.New()

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(289)
	p.GetErrorHandler().Sync(p)
	_alt = 1
	for ok := true; ok; ok = _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		switch _alt {
		case 1:
			{
				p.SetState(288)

				var _x = p.Else_if()

				localctx.(*ListaelseifContext)._else_if = _x
			}
			localctx.(*ListaelseifContext).list = append(localctx.(*ListaelseifContext).list, localctx.(*ListaelseifContext)._else_if)

		default:
			panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		}

		p.SetState(291)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 8, p.GetParserRuleContext())
	}

	listInt := localctx.(*ListaelseifContext).GetList()
	for _, e := range listInt {
		localctx.(*ListaelseifContext).lista.Add(e.GetInstr())
	}

	return localctx
}

// IElse_ifContext is an interface to support dynamic dispatch.
type IElse_ifContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsElse_ifContext differentiates from other interfaces.
	IsElse_ifContext()
}

type Else_ifContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_expression IExpressionContext
	_bloque     IBloqueContext
}

func NewEmptyElse_ifContext() *Else_ifContext {
	var p = new(Else_ifContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_else_if
	return p
}

func (*Else_ifContext) IsElse_ifContext() {}

func NewElse_ifContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Else_ifContext {
	var p = new(Else_ifContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_else_if

	return p
}

func (s *Else_ifContext) GetParser() antlr.Parser { return s.parser }

func (s *Else_ifContext) Get_expression() IExpressionContext { return s._expression }

func (s *Else_ifContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *Else_ifContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Else_ifContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *Else_ifContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Else_ifContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Else_ifContext) ELSE() antlr.TerminalNode {
	return s.GetToken(ParserELSE, 0)
}

func (s *Else_ifContext) IF_TOK() antlr.TerminalNode {
	return s.GetToken(ParserIF_TOK, 0)
}

func (s *Else_ifContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Else_ifContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *Else_ifContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Else_ifContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Else_ifContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterElse_if(s)
	}
}

func (s *Else_ifContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitElse_if(s)
	}
}

func (p *Parser) Else_if() (localctx IElse_ifContext) {
	localctx = NewElse_ifContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 24, ParserRULE_else_if)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(295)
		p.Match(ParserELSE)
	}
	{
		p.SetState(296)
		p.Match(ParserIF_TOK)
	}
	{
		p.SetState(297)

		var _x = p.Expression()

		localctx.(*Else_ifContext)._expression = _x
	}
	{
		p.SetState(298)

		var _x = p.Bloque()

		localctx.(*Else_ifContext)._bloque = _x
	}
	localctx.(*Else_ifContext).instr = SentenciasControl.NewIfInstruccion(localctx.(*Else_ifContext).Get_expression().GetExpr(), localctx.(*Else_ifContext).Get_bloque().GetLista(), nil, nil)

	return localctx
}

// IMatch_instrContext is an interface to support dynamic dispatch.
type IMatch_instrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque_match returns the _bloque_match rule contexts.
	Get_bloque_match() IBloque_matchContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque_match sets the _bloque_match rule contexts.
	Set_bloque_match(IBloque_matchContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsMatch_instrContext differentiates from other interfaces.
	IsMatch_instrContext()
}

type Match_instrContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	instr         interfaces.Instruccion
	_expression   IExpressionContext
	_bloque_match IBloque_matchContext
}

func NewEmptyMatch_instrContext() *Match_instrContext {
	var p = new(Match_instrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_match_instr
	return p
}

func (*Match_instrContext) IsMatch_instrContext() {}

func NewMatch_instrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Match_instrContext {
	var p = new(Match_instrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_match_instr

	return p
}

func (s *Match_instrContext) GetParser() antlr.Parser { return s.parser }

func (s *Match_instrContext) Get_expression() IExpressionContext { return s._expression }

func (s *Match_instrContext) Get_bloque_match() IBloque_matchContext { return s._bloque_match }

func (s *Match_instrContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Match_instrContext) Set_bloque_match(v IBloque_matchContext) { s._bloque_match = v }

func (s *Match_instrContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Match_instrContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Match_instrContext) MATCH() antlr.TerminalNode {
	return s.GetToken(ParserMATCH, 0)
}

func (s *Match_instrContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Match_instrContext) Bloque_match() IBloque_matchContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloque_matchContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloque_matchContext)
}

func (s *Match_instrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Match_instrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Match_instrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterMatch_instr(s)
	}
}

func (s *Match_instrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitMatch_instr(s)
	}
}

func (p *Parser) Match_instr() (localctx IMatch_instrContext) {
	localctx = NewMatch_instrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 26, ParserRULE_match_instr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(301)
		p.Match(ParserMATCH)
	}
	{
		p.SetState(302)

		var _x = p.Expression()

		localctx.(*Match_instrContext)._expression = _x
	}
	{
		p.SetState(303)

		var _x = p.Bloque_match()

		localctx.(*Match_instrContext)._bloque_match = _x
	}

	localctx.(*Match_instrContext).instr = SentenciasControl.NewMatchInstruccion(localctx.(*Match_instrContext).Get_expression().GetExpr(), localctx.(*Match_instrContext).Get_bloque_match().GetLista())

	return localctx
}

// IBloque_matchContext is an interface to support dynamic dispatch.
type IBloque_matchContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_listacase returns the _listacase rule contexts.
	Get_listacase() IListacaseContext

	// Set_listacase sets the _listacase rule contexts.
	Set_listacase(IListacaseContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsBloque_matchContext differentiates from other interfaces.
	IsBloque_matchContext()
}

type Bloque_matchContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	lista      *arrayList.List
	_listacase IListacaseContext
}

func NewEmptyBloque_matchContext() *Bloque_matchContext {
	var p = new(Bloque_matchContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_bloque_match
	return p
}

func (*Bloque_matchContext) IsBloque_matchContext() {}

func NewBloque_matchContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Bloque_matchContext {
	var p = new(Bloque_matchContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_bloque_match

	return p
}

func (s *Bloque_matchContext) GetParser() antlr.Parser { return s.parser }

func (s *Bloque_matchContext) Get_listacase() IListacaseContext { return s._listacase }

func (s *Bloque_matchContext) Set_listacase(v IListacaseContext) { s._listacase = v }

func (s *Bloque_matchContext) GetLista() *arrayList.List { return s.lista }

func (s *Bloque_matchContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *Bloque_matchContext) L_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserL_LLAVE, 0)
}

func (s *Bloque_matchContext) Listacase() IListacaseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListacaseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListacaseContext)
}

func (s *Bloque_matchContext) R_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserR_LLAVE, 0)
}

func (s *Bloque_matchContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Bloque_matchContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Bloque_matchContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterBloque_match(s)
	}
}

func (s *Bloque_matchContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitBloque_match(s)
	}
}

func (p *Parser) Bloque_match() (localctx IBloque_matchContext) {
	localctx = NewBloque_matchContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 28, ParserRULE_bloque_match)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(306)
		p.Match(ParserL_LLAVE)
	}
	{
		p.SetState(307)

		var _x = p.Listacase()

		localctx.(*Bloque_matchContext)._listacase = _x
	}
	{
		p.SetState(308)
		p.Match(ParserR_LLAVE)
	}

	localctx.(*Bloque_matchContext).lista = localctx.(*Bloque_matchContext).Get_listacase().GetLista()

	return localctx
}

// IListacaseContext is an interface to support dynamic dispatch.
type IListacaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_match_case returns the _match_case rule contexts.
	Get_match_case() IMatch_caseContext

	// Set_match_case sets the _match_case rule contexts.
	Set_match_case(IMatch_caseContext)

	// GetList returns the list rule context list.
	GetList() []IMatch_caseContext

	// SetList sets the list rule context list.
	SetList([]IMatch_caseContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListacaseContext differentiates from other interfaces.
	IsListacaseContext()
}

type ListacaseContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	lista       *arrayList.List
	_match_case IMatch_caseContext
	list        []IMatch_caseContext
}

func NewEmptyListacaseContext() *ListacaseContext {
	var p = new(ListacaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listacase
	return p
}

func (*ListacaseContext) IsListacaseContext() {}

func NewListacaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListacaseContext {
	var p = new(ListacaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listacase

	return p
}

func (s *ListacaseContext) GetParser() antlr.Parser { return s.parser }

func (s *ListacaseContext) Get_match_case() IMatch_caseContext { return s._match_case }

func (s *ListacaseContext) Set_match_case(v IMatch_caseContext) { s._match_case = v }

func (s *ListacaseContext) GetList() []IMatch_caseContext { return s.list }

func (s *ListacaseContext) SetList(v []IMatch_caseContext) { s.list = v }

func (s *ListacaseContext) GetLista() *arrayList.List { return s.lista }

func (s *ListacaseContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListacaseContext) AllMatch_case() []IMatch_caseContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IMatch_caseContext)(nil)).Elem())
	var tst = make([]IMatch_caseContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IMatch_caseContext)
		}
	}

	return tst
}

func (s *ListacaseContext) Match_case(i int) IMatch_caseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IMatch_caseContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IMatch_caseContext)
}

func (s *ListacaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListacaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListacaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListacase(s)
	}
}

func (s *ListacaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListacase(s)
	}
}

func (p *Parser) Listacase() (localctx IListacaseContext) {
	localctx = NewListacaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 30, ParserRULE_listacase)
	localctx.(*ListacaseContext).lista = arrayList.New()
	var _la int

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	p.SetState(312)
	p.GetErrorHandler().Sync(p)
	_la = p.GetTokenStream().LA(1)

	for ok := true; ok; ok = (((_la)&-(0x1f+1)) == 0 && ((1<<uint(_la))&((1<<ParserLP)|(1<<ParserL_LLAVE)|(1<<ParserGUION_BAJO)|(1<<ParserVEC_VACIO)|(1<<ParserNEW_))) != 0) || (((_la-36)&-(0x1f+1)) == 0 && ((1<<uint((_la-36)))&((1<<(ParserINTTYPE-36))|(1<<(ParserFLOATTYPE-36))|(1<<(ParserSTRINGTYPE-36))|(1<<(ParserSTRTYPE-36))|(1<<(ParserCHARTYPE-36))|(1<<(ParserVOIDTYPE-36))|(1<<(ParserBOOLTYPE-36))|(1<<(ParserUSIZETYPE-36))|(1<<(ParserNOT-36))|(1<<(ParserSUB-36))|(1<<(ParserNUMBER-36))|(1<<(ParserUSIZE-36))|(1<<(ParserFLOAT-36))|(1<<(ParserSTRING-36)))) != 0) || (((_la-68)&-(0x1f+1)) == 0 && ((1<<uint((_la-68)))&((1<<(ParserCHAR-68))|(1<<(ParserTRUE-68))|(1<<(ParserFALSE-68))|(1<<(ParserID-68)))) != 0) {
		{
			p.SetState(311)

			var _x = p.Match_case()

			localctx.(*ListacaseContext)._match_case = _x
		}
		localctx.(*ListacaseContext).list = append(localctx.(*ListacaseContext).list, localctx.(*ListacaseContext)._match_case)

		p.SetState(314)
		p.GetErrorHandler().Sync(p)
		_la = p.GetTokenStream().LA(1)
	}

	listInt := localctx.(*ListacaseContext).GetList()
	for _, e := range listInt {
		localctx.(*ListacaseContext).lista.Add(e.GetMatchCase())
	}

	return localctx
}

// IMatch_caseContext is an interface to support dynamic dispatch.
type IMatch_caseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_listaexpre_case returns the _listaexpre_case rule contexts.
	Get_listaexpre_case() IListaexpre_caseContext

	// Get_instruccion returns the _instruccion rule contexts.
	Get_instruccion() IInstruccionContext

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Set_listaexpre_case sets the _listaexpre_case rule contexts.
	Set_listaexpre_case(IListaexpre_caseContext)

	// Set_instruccion sets the _instruccion rule contexts.
	Set_instruccion(IInstruccionContext)

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// GetMatchCase returns the matchCase attribute.
	GetMatchCase() SentenciasControl.MatchCase

	// SetMatchCase sets the matchCase attribute.
	SetMatchCase(SentenciasControl.MatchCase)

	// IsMatch_caseContext differentiates from other interfaces.
	IsMatch_caseContext()
}

type Match_caseContext struct {
	*antlr.BaseParserRuleContext
	parser           antlr.Parser
	matchCase        SentenciasControl.MatchCase
	_listaexpre_case IListaexpre_caseContext
	_instruccion     IInstruccionContext
	_bloque          IBloqueContext
}

func NewEmptyMatch_caseContext() *Match_caseContext {
	var p = new(Match_caseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_match_case
	return p
}

func (*Match_caseContext) IsMatch_caseContext() {}

func NewMatch_caseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Match_caseContext {
	var p = new(Match_caseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_match_case

	return p
}

func (s *Match_caseContext) GetParser() antlr.Parser { return s.parser }

func (s *Match_caseContext) Get_listaexpre_case() IListaexpre_caseContext { return s._listaexpre_case }

func (s *Match_caseContext) Get_instruccion() IInstruccionContext { return s._instruccion }

func (s *Match_caseContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *Match_caseContext) Set_listaexpre_case(v IListaexpre_caseContext) { s._listaexpre_case = v }

func (s *Match_caseContext) Set_instruccion(v IInstruccionContext) { s._instruccion = v }

func (s *Match_caseContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *Match_caseContext) GetMatchCase() SentenciasControl.MatchCase { return s.matchCase }

func (s *Match_caseContext) SetMatchCase(v SentenciasControl.MatchCase) { s.matchCase = v }

func (s *Match_caseContext) Listaexpre_case() IListaexpre_caseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaexpre_caseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaexpre_caseContext)
}

func (s *Match_caseContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL, 0)
}

func (s *Match_caseContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(ParserMAYOR, 0)
}

func (s *Match_caseContext) Instruccion() IInstruccionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstruccionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstruccionContext)
}

func (s *Match_caseContext) COMA() antlr.TerminalNode {
	return s.GetToken(ParserCOMA, 0)
}

func (s *Match_caseContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *Match_caseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Match_caseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Match_caseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterMatch_case(s)
	}
}

func (s *Match_caseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitMatch_case(s)
	}
}

func (p *Parser) Match_case() (localctx IMatch_caseContext) {
	localctx = NewMatch_caseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 32, ParserRULE_match_case)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(331)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 10, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(318)

			var _x = p.listaexpre_case(0)

			localctx.(*Match_caseContext)._listaexpre_case = _x
		}
		{
			p.SetState(319)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(320)
			p.Match(ParserMAYOR)
		}
		{
			p.SetState(321)

			var _x = p.Instruccion()

			localctx.(*Match_caseContext)._instruccion = _x
		}
		{
			p.SetState(322)
			p.Match(ParserCOMA)
		}

		listaInstr := arrayList.New()
		listaInstr.Add(localctx.(*Match_caseContext).Get_instruccion().GetInstr())
		localctx.(*Match_caseContext).matchCase = SentenciasControl.NewMatchCase(localctx.(*Match_caseContext).Get_listaexpre_case().GetLista(), listaInstr)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(325)

			var _x = p.listaexpre_case(0)

			localctx.(*Match_caseContext)._listaexpre_case = _x
		}
		{
			p.SetState(326)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(327)
			p.Match(ParserMAYOR)
		}
		{
			p.SetState(328)

			var _x = p.Bloque()

			localctx.(*Match_caseContext)._bloque = _x
		}

		localctx.(*Match_caseContext).matchCase = SentenciasControl.NewMatchCase(localctx.(*Match_caseContext).Get_listaexpre_case().GetLista(), localctx.(*Match_caseContext).Get_bloque().GetLista())

	}

	return localctx
}

// IListaexpre_caseContext is an interface to support dynamic dispatch.
type IListaexpre_caseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetLISTA returns the LISTA rule contexts.
	GetLISTA() IListaexpre_caseContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetLISTA sets the LISTA rule contexts.
	SetLISTA(IListaexpre_caseContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaexpre_caseContext differentiates from other interfaces.
	IsListaexpre_caseContext()
}

type Listaexpre_caseContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	lista       *arrayList.List
	LISTA       IListaexpre_caseContext
	_expression IExpressionContext
}

func NewEmptyListaexpre_caseContext() *Listaexpre_caseContext {
	var p = new(Listaexpre_caseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listaexpre_case
	return p
}

func (*Listaexpre_caseContext) IsListaexpre_caseContext() {}

func NewListaexpre_caseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Listaexpre_caseContext {
	var p = new(Listaexpre_caseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listaexpre_case

	return p
}

func (s *Listaexpre_caseContext) GetParser() antlr.Parser { return s.parser }

func (s *Listaexpre_caseContext) GetLISTA() IListaexpre_caseContext { return s.LISTA }

func (s *Listaexpre_caseContext) Get_expression() IExpressionContext { return s._expression }

func (s *Listaexpre_caseContext) SetLISTA(v IListaexpre_caseContext) { s.LISTA = v }

func (s *Listaexpre_caseContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Listaexpre_caseContext) GetLista() *arrayList.List { return s.lista }

func (s *Listaexpre_caseContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *Listaexpre_caseContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Listaexpre_caseContext) GUION_BAJO() antlr.TerminalNode {
	return s.GetToken(ParserGUION_BAJO, 0)
}

func (s *Listaexpre_caseContext) OR_CASE() antlr.TerminalNode {
	return s.GetToken(ParserOR_CASE, 0)
}

func (s *Listaexpre_caseContext) Listaexpre_case() IListaexpre_caseContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaexpre_caseContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaexpre_caseContext)
}

func (s *Listaexpre_caseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Listaexpre_caseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Listaexpre_caseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListaexpre_case(s)
	}
}

func (s *Listaexpre_caseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListaexpre_case(s)
	}
}

func (p *Parser) Listaexpre_case() (localctx IListaexpre_caseContext) {
	return p.listaexpre_case(0)
}

func (p *Parser) listaexpre_case(_p int) (localctx IListaexpre_caseContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListaexpre_caseContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListaexpre_caseContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 34
	p.EnterRecursionRule(localctx, 34, ParserRULE_listaexpre_case, _p)

	localctx.(*Listaexpre_caseContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(339)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ParserLP, ParserL_LLAVE, ParserVEC_VACIO, ParserNEW_, ParserINTTYPE, ParserFLOATTYPE, ParserSTRINGTYPE, ParserSTRTYPE, ParserCHARTYPE, ParserVOIDTYPE, ParserBOOLTYPE, ParserUSIZETYPE, ParserNOT, ParserSUB, ParserNUMBER, ParserUSIZE, ParserFLOAT, ParserSTRING, ParserCHAR, ParserTRUE, ParserFALSE, ParserID:
		{
			p.SetState(334)

			var _x = p.Expression()

			localctx.(*Listaexpre_caseContext)._expression = _x
		}

		localctx.(*Listaexpre_caseContext).lista.Add(localctx.(*Listaexpre_caseContext).Get_expression().GetExpr())

	case ParserGUION_BAJO:
		{
			p.SetState(337)
			p.Match(ParserGUION_BAJO)
		}

		localctx.(*Listaexpre_caseContext).lista.Add("_")

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(348)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaexpre_caseContext(p, _parentctx, _parentState)
			localctx.(*Listaexpre_caseContext).LISTA = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listaexpre_case)
			p.SetState(341)

			if !(p.Precpred(p.GetParserRuleContext(), 3)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 3)", ""))
			}
			{
				p.SetState(342)
				p.Match(ParserOR_CASE)
			}
			{
				p.SetState(343)

				var _x = p.Expression()

				localctx.(*Listaexpre_caseContext)._expression = _x
			}

			localctx.(*Listaexpre_caseContext).GetLISTA().GetLista().Add(localctx.(*Listaexpre_caseContext).Get_expression().GetExpr())
			localctx.(*Listaexpre_caseContext).lista = localctx.(*Listaexpre_caseContext).GetLISTA().GetLista()

		}
		p.SetState(350)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 12, p.GetParserRuleContext())
	}

	return localctx
}

// IWhile_instrContext is an interface to support dynamic dispatch.
type IWhile_instrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsWhile_instrContext differentiates from other interfaces.
	IsWhile_instrContext()
}

type While_instrContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_expression IExpressionContext
	_bloque     IBloqueContext
}

func NewEmptyWhile_instrContext() *While_instrContext {
	var p = new(While_instrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_while_instr
	return p
}

func (*While_instrContext) IsWhile_instrContext() {}

func NewWhile_instrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *While_instrContext {
	var p = new(While_instrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_while_instr

	return p
}

func (s *While_instrContext) GetParser() antlr.Parser { return s.parser }

func (s *While_instrContext) Get_expression() IExpressionContext { return s._expression }

func (s *While_instrContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *While_instrContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *While_instrContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *While_instrContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *While_instrContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *While_instrContext) WHILE() antlr.TerminalNode {
	return s.GetToken(ParserWHILE, 0)
}

func (s *While_instrContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *While_instrContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *While_instrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *While_instrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *While_instrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterWhile_instr(s)
	}
}

func (s *While_instrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitWhile_instr(s)
	}
}

func (p *Parser) While_instr() (localctx IWhile_instrContext) {
	localctx = NewWhile_instrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 36, ParserRULE_while_instr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(351)
		p.Match(ParserWHILE)
	}
	{
		p.SetState(352)

		var _x = p.Expression()

		localctx.(*While_instrContext)._expression = _x
	}
	{
		p.SetState(353)

		var _x = p.Bloque()

		localctx.(*While_instrContext)._bloque = _x
	}

	localctx.(*While_instrContext).instr = SentenciasCiclicas.NewWhileInstruccion(localctx.(*While_instrContext).Get_expression().GetExpr(), localctx.(*While_instrContext).Get_bloque().GetLista())

	return localctx
}

// ILoop_instrContext is an interface to support dynamic dispatch.
type ILoop_instrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_bloque returns the _bloque rule contexts.
	Get_bloque() IBloqueContext

	// Set_bloque sets the _bloque rule contexts.
	Set_bloque(IBloqueContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsLoop_instrContext differentiates from other interfaces.
	IsLoop_instrContext()
}

type Loop_instrContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	instr   interfaces.Instruccion
	_bloque IBloqueContext
}

func NewEmptyLoop_instrContext() *Loop_instrContext {
	var p = new(Loop_instrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_loop_instr
	return p
}

func (*Loop_instrContext) IsLoop_instrContext() {}

func NewLoop_instrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Loop_instrContext {
	var p = new(Loop_instrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_loop_instr

	return p
}

func (s *Loop_instrContext) GetParser() antlr.Parser { return s.parser }

func (s *Loop_instrContext) Get_bloque() IBloqueContext { return s._bloque }

func (s *Loop_instrContext) Set_bloque(v IBloqueContext) { s._bloque = v }

func (s *Loop_instrContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Loop_instrContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Loop_instrContext) LOOP() antlr.TerminalNode {
	return s.GetToken(ParserLOOP, 0)
}

func (s *Loop_instrContext) Bloque() IBloqueContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IBloqueContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IBloqueContext)
}

func (s *Loop_instrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Loop_instrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Loop_instrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterLoop_instr(s)
	}
}

func (s *Loop_instrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitLoop_instr(s)
	}
}

func (p *Parser) Loop_instr() (localctx ILoop_instrContext) {
	localctx = NewLoop_instrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 38, ParserRULE_loop_instr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(356)
		p.Match(ParserLOOP)
	}
	{
		p.SetState(357)

		var _x = p.Bloque()

		localctx.(*Loop_instrContext)._bloque = _x
	}

	localctx.(*Loop_instrContext).instr = SentenciasCiclicas.NewLoopInstruccion(localctx.(*Loop_instrContext).Get_bloque().GetLista())

	return localctx
}

// IConsolaContext is an interface to support dynamic dispatch.
type IConsolaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsConsolaContext differentiates from other interfaces.
	IsConsolaContext()
}

type ConsolaContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_expression IExpressionContext
}

func NewEmptyConsolaContext() *ConsolaContext {
	var p = new(ConsolaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_consola
	return p
}

func (*ConsolaContext) IsConsolaContext() {}

func NewConsolaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ConsolaContext {
	var p = new(ConsolaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_consola

	return p
}

func (s *ConsolaContext) GetParser() antlr.Parser { return s.parser }

func (s *ConsolaContext) Get_expression() IExpressionContext { return s._expression }

func (s *ConsolaContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ConsolaContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *ConsolaContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *ConsolaContext) PRINTLN() antlr.TerminalNode {
	return s.GetToken(ParserPRINTLN, 0)
}

func (s *ConsolaContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *ConsolaContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ConsolaContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *ConsolaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ConsolaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ConsolaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterConsola(s)
	}
}

func (s *ConsolaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitConsola(s)
	}
}

func (p *Parser) Consola() (localctx IConsolaContext) {
	localctx = NewConsolaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 40, ParserRULE_consola)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(360)
		p.Match(ParserPRINTLN)
	}
	{
		p.SetState(361)
		p.Match(ParserLP)
	}
	{
		p.SetState(362)

		var _x = p.Expression()

		localctx.(*ConsolaContext)._expression = _x
	}
	{
		p.SetState(363)
		p.Match(ParserRP)
	}
	localctx.(*ConsolaContext).instr = instrucciones.NuevoImprimir(localctx.(*ConsolaContext).Get_expression().GetExpr())

	return localctx
}

// ILlamadaContext is an interface to support dynamic dispatch.
type ILlamadaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_listaExpresiones returns the _listaExpresiones rule contexts.
	Get_listaExpresiones() IListaExpresionesContext

	// Set_listaExpresiones sets the _listaExpresiones rule contexts.
	Set_listaExpresiones(IListaExpresionesContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsLlamadaContext differentiates from other interfaces.
	IsLlamadaContext()
}

type LlamadaContext struct {
	*antlr.BaseParserRuleContext
	parser            antlr.Parser
	instr             interfaces.Instruccion
	expr              interfaces.Expresion
	_ID               antlr.Token
	_listaExpresiones IListaExpresionesContext
}

func NewEmptyLlamadaContext() *LlamadaContext {
	var p = new(LlamadaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_llamada
	return p
}

func (*LlamadaContext) IsLlamadaContext() {}

func NewLlamadaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LlamadaContext {
	var p = new(LlamadaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_llamada

	return p
}

func (s *LlamadaContext) GetParser() antlr.Parser { return s.parser }

func (s *LlamadaContext) Get_ID() antlr.Token { return s._ID }

func (s *LlamadaContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *LlamadaContext) Get_listaExpresiones() IListaExpresionesContext { return s._listaExpresiones }

func (s *LlamadaContext) Set_listaExpresiones(v IListaExpresionesContext) { s._listaExpresiones = v }

func (s *LlamadaContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *LlamadaContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *LlamadaContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *LlamadaContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *LlamadaContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *LlamadaContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *LlamadaContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *LlamadaContext) ListaExpresiones() IListaExpresionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaExpresionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaExpresionesContext)
}

func (s *LlamadaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LlamadaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *LlamadaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterLlamada(s)
	}
}

func (s *LlamadaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitLlamada(s)
	}
}

func (p *Parser) Llamada() (localctx ILlamadaContext) {
	localctx = NewLlamadaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 42, ParserRULE_llamada)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(376)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 13, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(366)

			var _m = p.Match(ParserID)

			localctx.(*LlamadaContext)._ID = _m
		}
		{
			p.SetState(367)
			p.Match(ParserLP)
		}
		{
			p.SetState(368)
			p.Match(ParserRP)
		}

		localctx.(*LlamadaContext).instr = expresion2.NuevaLlamada((func() string {
			if localctx.(*LlamadaContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*LlamadaContext).Get_ID().GetText()
			}
		}()), arrayList.New())
		localctx.(*LlamadaContext).expr = expresion2.NuevaLlamada((func() string {
			if localctx.(*LlamadaContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*LlamadaContext).Get_ID().GetText()
			}
		}()), arrayList.New())

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(370)

			var _m = p.Match(ParserID)

			localctx.(*LlamadaContext)._ID = _m
		}
		{
			p.SetState(371)
			p.Match(ParserLP)
		}
		{
			p.SetState(372)

			var _x = p.listaExpresiones(0)

			localctx.(*LlamadaContext)._listaExpresiones = _x
		}
		{
			p.SetState(373)
			p.Match(ParserRP)
		}

		localctx.(*LlamadaContext).instr = expresion2.NuevaLlamada((func() string {
			if localctx.(*LlamadaContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*LlamadaContext).Get_ID().GetText()
			}
		}()), localctx.(*LlamadaContext).Get_listaExpresiones().GetLista())
		localctx.(*LlamadaContext).expr = expresion2.NuevaLlamada((func() string {
			if localctx.(*LlamadaContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*LlamadaContext).Get_ID().GetText()
			}
		}()), localctx.(*LlamadaContext).Get_listaExpresiones().GetLista())

	}

	return localctx
}

// IListaExpresionesContext is an interface to support dynamic dispatch.
type IListaExpresionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetLISTA returns the LISTA rule contexts.
	GetLISTA() IListaExpresionesContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// SetLISTA sets the LISTA rule contexts.
	SetLISTA(IListaExpresionesContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaExpresionesContext differentiates from other interfaces.
	IsListaExpresionesContext()
}

type ListaExpresionesContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	lista       *arrayList.List
	LISTA       IListaExpresionesContext
	_expression IExpressionContext
}

func NewEmptyListaExpresionesContext() *ListaExpresionesContext {
	var p = new(ListaExpresionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listaExpresiones
	return p
}

func (*ListaExpresionesContext) IsListaExpresionesContext() {}

func NewListaExpresionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaExpresionesContext {
	var p = new(ListaExpresionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listaExpresiones

	return p
}

func (s *ListaExpresionesContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaExpresionesContext) GetLISTA() IListaExpresionesContext { return s.LISTA }

func (s *ListaExpresionesContext) Get_expression() IExpressionContext { return s._expression }

func (s *ListaExpresionesContext) SetLISTA(v IListaExpresionesContext) { s.LISTA = v }

func (s *ListaExpresionesContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *ListaExpresionesContext) GetLista() *arrayList.List { return s.lista }

func (s *ListaExpresionesContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListaExpresionesContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ListaExpresionesContext) COMA() antlr.TerminalNode {
	return s.GetToken(ParserCOMA, 0)
}

func (s *ListaExpresionesContext) ListaExpresiones() IListaExpresionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaExpresionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaExpresionesContext)
}

func (s *ListaExpresionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaExpresionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaExpresionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListaExpresiones(s)
	}
}

func (s *ListaExpresionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListaExpresiones(s)
	}
}

func (p *Parser) ListaExpresiones() (localctx IListaExpresionesContext) {
	return p.listaExpresiones(0)
}

func (p *Parser) listaExpresiones(_p int) (localctx IListaExpresionesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListaExpresionesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListaExpresionesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 44
	p.EnterRecursionRule(localctx, 44, ParserRULE_listaExpresiones, _p)

	localctx.(*ListaExpresionesContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(379)

		var _x = p.Expression()

		localctx.(*ListaExpresionesContext)._expression = _x
	}

	localctx.(*ListaExpresionesContext).lista.Add(localctx.(*ListaExpresionesContext).Get_expression().GetExpr())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(389)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaExpresionesContext(p, _parentctx, _parentState)
			localctx.(*ListaExpresionesContext).LISTA = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listaExpresiones)
			p.SetState(382)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(383)
				p.Match(ParserCOMA)
			}
			{
				p.SetState(384)

				var _x = p.Expression()

				localctx.(*ListaExpresionesContext)._expression = _x
			}

			localctx.(*ListaExpresionesContext).GetLISTA().GetLista().Add(localctx.(*ListaExpresionesContext).Get_expression().GetExpr())
			localctx.(*ListaExpresionesContext).lista = localctx.(*ListaExpresionesContext).GetLISTA().GetLista()

		}
		p.SetState(391)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 14, p.GetParserRuleContext())
	}

	return localctx
}

// IDeclaracionIniContext is an interface to support dynamic dispatch.
type IDeclaracionIniContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_listides returns the _listides rule contexts.
	Get_listides() IListidesContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// Get_listaExpresiones returns the _listaExpresiones rule contexts.
	Get_listaExpresiones() IListaExpresionesContext

	// Set_listides sets the _listides rule contexts.
	Set_listides(IListidesContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// Set_listaExpresiones sets the _listaExpresiones rule contexts.
	Set_listaExpresiones(IListaExpresionesContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsDeclaracionIniContext differentiates from other interfaces.
	IsDeclaracionIniContext()
}

type DeclaracionIniContext struct {
	*antlr.BaseParserRuleContext
	parser            antlr.Parser
	instr             interfaces.Instruccion
	_listides         IListidesContext
	_expression       IExpressionContext
	_tiposvars        ITiposvarsContext
	_ID               antlr.Token
	_listaExpresiones IListaExpresionesContext
}

func NewEmptyDeclaracionIniContext() *DeclaracionIniContext {
	var p = new(DeclaracionIniContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_declaracionIni
	return p
}

func (*DeclaracionIniContext) IsDeclaracionIniContext() {}

func NewDeclaracionIniContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclaracionIniContext {
	var p = new(DeclaracionIniContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_declaracionIni

	return p
}

func (s *DeclaracionIniContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclaracionIniContext) Get_ID() antlr.Token { return s._ID }

func (s *DeclaracionIniContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *DeclaracionIniContext) Get_listides() IListidesContext { return s._listides }

func (s *DeclaracionIniContext) Get_expression() IExpressionContext { return s._expression }

func (s *DeclaracionIniContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *DeclaracionIniContext) Get_listaExpresiones() IListaExpresionesContext {
	return s._listaExpresiones
}

func (s *DeclaracionIniContext) Set_listides(v IListidesContext) { s._listides = v }

func (s *DeclaracionIniContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *DeclaracionIniContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *DeclaracionIniContext) Set_listaExpresiones(v IListaExpresionesContext) {
	s._listaExpresiones = v
}

func (s *DeclaracionIniContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *DeclaracionIniContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *DeclaracionIniContext) LET() antlr.TerminalNode {
	return s.GetToken(ParserLET, 0)
}

func (s *DeclaracionIniContext) Listides() IListidesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListidesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListidesContext)
}

func (s *DeclaracionIniContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL, 0)
}

func (s *DeclaracionIniContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *DeclaracionIniContext) DOSPUNTOS() antlr.TerminalNode {
	return s.GetToken(ParserDOSPUNTOS, 0)
}

func (s *DeclaracionIniContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *DeclaracionIniContext) MUT() antlr.TerminalNode {
	return s.GetToken(ParserMUT, 0)
}

func (s *DeclaracionIniContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *DeclaracionIniContext) VEC_VACIO() antlr.TerminalNode {
	return s.GetToken(ParserVEC_VACIO, 0)
}

func (s *DeclaracionIniContext) MENOR() antlr.TerminalNode {
	return s.GetToken(ParserMENOR, 0)
}

func (s *DeclaracionIniContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(ParserMAYOR, 0)
}

func (s *DeclaracionIniContext) ListaExpresiones() IListaExpresionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaExpresionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaExpresionesContext)
}

func (s *DeclaracionIniContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclaracionIniContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclaracionIniContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDeclaracionIni(s)
	}
}

func (s *DeclaracionIniContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDeclaracionIni(s)
	}
}

func (p *Parser) DeclaracionIni() (localctx IDeclaracionIniContext) {
	localctx = NewDeclaracionIniContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 46, ParserRULE_declaracionIni)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(434)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 15, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(392)
			p.Match(ParserLET)
		}
		{
			p.SetState(393)

			var _x = p.listides(0)

			localctx.(*DeclaracionIniContext)._listides = _x
		}
		{
			p.SetState(394)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(395)

			var _x = p.Expression()

			localctx.(*DeclaracionIniContext)._expression = _x
		}

		linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
		columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
		localctx.(*DeclaracionIniContext).instr = instrucciones.NuevaDeclaracionInicializacion(localctx.(*DeclaracionIniContext).Get_listides().GetLista(), entorno.NULL, localctx.(*DeclaracionIniContext).Get_expression().GetExpr(), false, linea, columna)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(398)
			p.Match(ParserLET)
		}
		{
			p.SetState(399)

			var _x = p.listides(0)

			localctx.(*DeclaracionIniContext)._listides = _x
		}
		{
			p.SetState(400)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(401)

			var _x = p.Tiposvars()

			localctx.(*DeclaracionIniContext)._tiposvars = _x
		}
		{
			p.SetState(402)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(403)

			var _x = p.Expression()

			localctx.(*DeclaracionIniContext)._expression = _x
		}

		linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
		columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
		localctx.(*DeclaracionIniContext).instr = instrucciones.NuevaDeclaracionInicializacion(localctx.(*DeclaracionIniContext).Get_listides().GetLista(), localctx.(*DeclaracionIniContext).Get_tiposvars().GetTipo(), localctx.(*DeclaracionIniContext).Get_expression().GetExpr(), false, linea, columna)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(406)
			p.Match(ParserLET)
		}
		{
			p.SetState(407)
			p.Match(ParserMUT)
		}
		{
			p.SetState(408)

			var _x = p.listides(0)

			localctx.(*DeclaracionIniContext)._listides = _x
		}
		{
			p.SetState(409)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(410)

			var _x = p.Expression()

			localctx.(*DeclaracionIniContext)._expression = _x
		}

		linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
		columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
		localctx.(*DeclaracionIniContext).instr = instrucciones.NuevaDeclaracionInicializacion(localctx.(*DeclaracionIniContext).Get_listides().GetLista(), entorno.NULL, localctx.(*DeclaracionIniContext).Get_expression().GetExpr(), true, linea, columna)

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(413)
			p.Match(ParserLET)
		}
		{
			p.SetState(414)
			p.Match(ParserMUT)
		}
		{
			p.SetState(415)

			var _x = p.listides(0)

			localctx.(*DeclaracionIniContext)._listides = _x
		}
		{
			p.SetState(416)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(417)

			var _x = p.Tiposvars()

			localctx.(*DeclaracionIniContext)._tiposvars = _x
		}
		{
			p.SetState(418)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(419)

			var _x = p.Expression()

			localctx.(*DeclaracionIniContext)._expression = _x
		}

		linea := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetLine()
		columna := localctx.(*DeclaracionIniContext).Get_listides().GetStart().GetColumn()
		localctx.(*DeclaracionIniContext).instr = instrucciones.NuevaDeclaracionInicializacion(localctx.(*DeclaracionIniContext).Get_listides().GetLista(), localctx.(*DeclaracionIniContext).Get_tiposvars().GetTipo(), localctx.(*DeclaracionIniContext).Get_expression().GetExpr(), true, linea, columna)

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(422)
			p.Match(ParserLET)
		}
		{
			p.SetState(423)
			p.Match(ParserMUT)
		}
		{
			p.SetState(424)

			var _m = p.Match(ParserID)

			localctx.(*DeclaracionIniContext)._ID = _m
		}
		{
			p.SetState(425)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(426)
			p.Match(ParserVEC_VACIO)
		}
		{
			p.SetState(427)
			p.Match(ParserMENOR)
		}
		{
			p.SetState(428)

			var _x = p.Tiposvars()

			localctx.(*DeclaracionIniContext)._tiposvars = _x
		}
		{
			p.SetState(429)
			p.Match(ParserMAYOR)
		}
		{
			p.SetState(430)
			p.Match(ParserIGUAL)
		}
		{
			p.SetState(431)

			var _x = p.listaExpresiones(0)

			localctx.(*DeclaracionIniContext)._listaExpresiones = _x
		}
		localctx.(*DeclaracionIniContext).instr = expresion2.NewVector((func() string {
			if localctx.(*DeclaracionIniContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*DeclaracionIniContext).Get_ID().GetText()
			}
		}()), localctx.(*DeclaracionIniContext).Get_tiposvars().GetTipo(), localctx.(*DeclaracionIniContext).Get_listaExpresiones().GetLista())

	}

	return localctx
}

// IDeclaracionContext is an interface to support dynamic dispatch.
type IDeclaracionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// Get_listides returns the _listides rule contexts.
	Get_listides() IListidesContext

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// Set_listides sets the _listides rule contexts.
	Set_listides(IListidesContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsDeclaracionContext differentiates from other interfaces.
	IsDeclaracionContext()
}

type DeclaracionContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	instr      interfaces.Instruccion
	_tiposvars ITiposvarsContext
	_listides  IListidesContext
}

func NewEmptyDeclaracionContext() *DeclaracionContext {
	var p = new(DeclaracionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_declaracion
	return p
}

func (*DeclaracionContext) IsDeclaracionContext() {}

func NewDeclaracionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DeclaracionContext {
	var p = new(DeclaracionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_declaracion

	return p
}

func (s *DeclaracionContext) GetParser() antlr.Parser { return s.parser }

func (s *DeclaracionContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *DeclaracionContext) Get_listides() IListidesContext { return s._listides }

func (s *DeclaracionContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *DeclaracionContext) Set_listides(v IListidesContext) { s._listides = v }

func (s *DeclaracionContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *DeclaracionContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *DeclaracionContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *DeclaracionContext) Listides() IListidesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListidesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListidesContext)
}

func (s *DeclaracionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DeclaracionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DeclaracionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDeclaracion(s)
	}
}

func (s *DeclaracionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDeclaracion(s)
	}
}

func (p *Parser) Declaracion() (localctx IDeclaracionContext) {
	localctx = NewDeclaracionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 48, ParserRULE_declaracion)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(436)

		var _x = p.Tiposvars()

		localctx.(*DeclaracionContext)._tiposvars = _x
	}
	{
		p.SetState(437)

		var _x = p.listides(0)

		localctx.(*DeclaracionContext)._listides = _x
	}

	localctx.(*DeclaracionContext).instr = instrucciones.NuevaDeclaracion(localctx.(*DeclaracionContext).Get_listides().GetLista(), localctx.(*DeclaracionContext).Get_tiposvars().GetTipo())

	return localctx
}

// IRetornoContext is an interface to support dynamic dispatch.
type IRetornoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsRetornoContext differentiates from other interfaces.
	IsRetornoContext()
}

type RetornoContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_expression IExpressionContext
}

func NewEmptyRetornoContext() *RetornoContext {
	var p = new(RetornoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_retorno
	return p
}

func (*RetornoContext) IsRetornoContext() {}

func NewRetornoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *RetornoContext {
	var p = new(RetornoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_retorno

	return p
}

func (s *RetornoContext) GetParser() antlr.Parser { return s.parser }

func (s *RetornoContext) Get_expression() IExpressionContext { return s._expression }

func (s *RetornoContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *RetornoContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *RetornoContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *RetornoContext) RETURN_P() antlr.TerminalNode {
	return s.GetToken(ParserRETURN_P, 0)
}

func (s *RetornoContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *RetornoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *RetornoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *RetornoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterRetorno(s)
	}
}

func (s *RetornoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitRetorno(s)
	}
}

func (p *Parser) Retorno() (localctx IRetornoContext) {
	localctx = NewRetornoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 50, ParserRULE_retorno)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(446)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 16, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(440)
			p.Match(ParserRETURN_P)
		}
		localctx.(*RetornoContext).instr = SentenciasTransferencia.NewReturn(entorno.VOID, nil)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(442)
			p.Match(ParserRETURN_P)
		}
		{
			p.SetState(443)

			var _x = p.Expression()

			localctx.(*RetornoContext)._expression = _x
		}
		localctx.(*RetornoContext).instr = SentenciasTransferencia.NewReturn(entorno.NULL, localctx.(*RetornoContext).Get_expression().GetExpr())

	}

	return localctx
}

// ISentencia_breakContext is an interface to support dynamic dispatch.
type ISentencia_breakContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsSentencia_breakContext differentiates from other interfaces.
	IsSentencia_breakContext()
}

type Sentencia_breakContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_expression IExpressionContext
}

func NewEmptySentencia_breakContext() *Sentencia_breakContext {
	var p = new(Sentencia_breakContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_sentencia_break
	return p
}

func (*Sentencia_breakContext) IsSentencia_breakContext() {}

func NewSentencia_breakContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Sentencia_breakContext {
	var p = new(Sentencia_breakContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_sentencia_break

	return p
}

func (s *Sentencia_breakContext) GetParser() antlr.Parser { return s.parser }

func (s *Sentencia_breakContext) Get_expression() IExpressionContext { return s._expression }

func (s *Sentencia_breakContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Sentencia_breakContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Sentencia_breakContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Sentencia_breakContext) BREAK_P() antlr.TerminalNode {
	return s.GetToken(ParserBREAK_P, 0)
}

func (s *Sentencia_breakContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Sentencia_breakContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Sentencia_breakContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Sentencia_breakContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterSentencia_break(s)
	}
}

func (s *Sentencia_breakContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitSentencia_break(s)
	}
}

func (p *Parser) Sentencia_break() (localctx ISentencia_breakContext) {
	localctx = NewSentencia_breakContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 52, ParserRULE_sentencia_break)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(454)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 17, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(448)
			p.Match(ParserBREAK_P)
		}
		localctx.(*Sentencia_breakContext).instr = SentenciasTransferencia.NewBreak(entorno.VOID, nil)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(450)
			p.Match(ParserBREAK_P)
		}
		{
			p.SetState(451)

			var _x = p.Expression()

			localctx.(*Sentencia_breakContext)._expression = _x
		}
		localctx.(*Sentencia_breakContext).instr = SentenciasTransferencia.NewBreak(entorno.NULL, localctx.(*Sentencia_breakContext).Get_expression().GetExpr())

	}

	return localctx
}

// ISentencia_continueContext is an interface to support dynamic dispatch.
type ISentencia_continueContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsSentencia_continueContext differentiates from other interfaces.
	IsSentencia_continueContext()
}

type Sentencia_continueContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	instr  interfaces.Instruccion
}

func NewEmptySentencia_continueContext() *Sentencia_continueContext {
	var p = new(Sentencia_continueContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_sentencia_continue
	return p
}

func (*Sentencia_continueContext) IsSentencia_continueContext() {}

func NewSentencia_continueContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Sentencia_continueContext {
	var p = new(Sentencia_continueContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_sentencia_continue

	return p
}

func (s *Sentencia_continueContext) GetParser() antlr.Parser { return s.parser }

func (s *Sentencia_continueContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Sentencia_continueContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Sentencia_continueContext) CONTINUE_P() antlr.TerminalNode {
	return s.GetToken(ParserCONTINUE_P, 0)
}

func (s *Sentencia_continueContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Sentencia_continueContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Sentencia_continueContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterSentencia_continue(s)
	}
}

func (s *Sentencia_continueContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitSentencia_continue(s)
	}
}

func (p *Parser) Sentencia_continue() (localctx ISentencia_continueContext) {
	localctx = NewSentencia_continueContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 54, ParserRULE_sentencia_continue)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(456)
		p.Match(ParserCONTINUE_P)
	}
	localctx.(*Sentencia_continueContext).instr = SentenciasTransferencia.NewContinue(entorno.VOID)

	return localctx
}

// IListidesContext is an interface to support dynamic dispatch.
type IListidesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetSub returns the sub rule contexts.
	GetSub() IListidesContext

	// SetSub sets the sub rule contexts.
	SetSub(IListidesContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListidesContext differentiates from other interfaces.
	IsListidesContext()
}

type ListidesContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	lista  *arrayList.List
	sub    IListidesContext
	_ID    antlr.Token
}

func NewEmptyListidesContext() *ListidesContext {
	var p = new(ListidesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listides
	return p
}

func (*ListidesContext) IsListidesContext() {}

func NewListidesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListidesContext {
	var p = new(ListidesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listides

	return p
}

func (s *ListidesContext) GetParser() antlr.Parser { return s.parser }

func (s *ListidesContext) Get_ID() antlr.Token { return s._ID }

func (s *ListidesContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *ListidesContext) GetSub() IListidesContext { return s.sub }

func (s *ListidesContext) SetSub(v IListidesContext) { s.sub = v }

func (s *ListidesContext) GetLista() *arrayList.List { return s.lista }

func (s *ListidesContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListidesContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *ListidesContext) COMA() antlr.TerminalNode {
	return s.GetToken(ParserCOMA, 0)
}

func (s *ListidesContext) Listides() IListidesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListidesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListidesContext)
}

func (s *ListidesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListidesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListidesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListides(s)
	}
}

func (s *ListidesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListides(s)
	}
}

func (p *Parser) Listides() (localctx IListidesContext) {
	return p.listides(0)
}

func (p *Parser) listides(_p int) (localctx IListidesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListidesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListidesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 56
	p.EnterRecursionRule(localctx, 56, ParserRULE_listides, _p)
	localctx.(*ListidesContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(460)

		var _m = p.Match(ParserID)

		localctx.(*ListidesContext)._ID = _m
	}
	localctx.(*ListidesContext).lista.Add(expresion.NuevoIdentificador((func() string {
		if localctx.(*ListidesContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*ListidesContext).Get_ID().GetText()
		}
	}())))

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(469)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListidesContext(p, _parentctx, _parentState)
			localctx.(*ListidesContext).sub = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listides)
			p.SetState(463)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(464)
				p.Match(ParserCOMA)
			}
			{
				p.SetState(465)

				var _m = p.Match(ParserID)

				localctx.(*ListidesContext)._ID = _m
			}

			localctx.(*ListidesContext).GetSub().GetLista().Add(expresion.NuevoIdentificador((func() string {
				if localctx.(*ListidesContext).Get_ID() == nil {
					return ""
				} else {
					return localctx.(*ListidesContext).Get_ID().GetText()
				}
			}())))
			localctx.(*ListidesContext).lista = localctx.(*ListidesContext).GetSub().GetLista()

		}
		p.SetState(471)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 18, p.GetParserRuleContext())
	}

	return localctx
}

// ITiposvarsContext is an interface to support dynamic dispatch.
type ITiposvarsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTipo returns the tipo attribute.
	GetTipo() entorno.TipoDato

	// SetTipo sets the tipo attribute.
	SetTipo(entorno.TipoDato)

	// IsTiposvarsContext differentiates from other interfaces.
	IsTiposvarsContext()
}

type TiposvarsContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	tipo   entorno.TipoDato
}

func NewEmptyTiposvarsContext() *TiposvarsContext {
	var p = new(TiposvarsContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_tiposvars
	return p
}

func (*TiposvarsContext) IsTiposvarsContext() {}

func NewTiposvarsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *TiposvarsContext {
	var p = new(TiposvarsContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_tiposvars

	return p
}

func (s *TiposvarsContext) GetParser() antlr.Parser { return s.parser }

func (s *TiposvarsContext) GetTipo() entorno.TipoDato { return s.tipo }

func (s *TiposvarsContext) SetTipo(v entorno.TipoDato) { s.tipo = v }

func (s *TiposvarsContext) INTTYPE() antlr.TerminalNode {
	return s.GetToken(ParserINTTYPE, 0)
}

func (s *TiposvarsContext) STRINGTYPE() antlr.TerminalNode {
	return s.GetToken(ParserSTRINGTYPE, 0)
}

func (s *TiposvarsContext) STRTYPE() antlr.TerminalNode {
	return s.GetToken(ParserSTRTYPE, 0)
}

func (s *TiposvarsContext) CHARTYPE() antlr.TerminalNode {
	return s.GetToken(ParserCHARTYPE, 0)
}

func (s *TiposvarsContext) FLOATTYPE() antlr.TerminalNode {
	return s.GetToken(ParserFLOATTYPE, 0)
}

func (s *TiposvarsContext) BOOLTYPE() antlr.TerminalNode {
	return s.GetToken(ParserBOOLTYPE, 0)
}

func (s *TiposvarsContext) VOIDTYPE() antlr.TerminalNode {
	return s.GetToken(ParserVOIDTYPE, 0)
}

func (s *TiposvarsContext) USIZETYPE() antlr.TerminalNode {
	return s.GetToken(ParserUSIZETYPE, 0)
}

func (s *TiposvarsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *TiposvarsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *TiposvarsContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterTiposvars(s)
	}
}

func (s *TiposvarsContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitTiposvars(s)
	}
}

func (p *Parser) Tiposvars() (localctx ITiposvarsContext) {
	localctx = NewTiposvarsContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 58, ParserRULE_tiposvars)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(488)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ParserINTTYPE:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(472)
			p.Match(ParserINTTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.INTEGER

	case ParserSTRINGTYPE:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(474)
			p.Match(ParserSTRINGTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.STRING

	case ParserSTRTYPE:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(476)
			p.Match(ParserSTRTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.STRING2

	case ParserCHARTYPE:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(478)
			p.Match(ParserCHARTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.CHAR

	case ParserFLOATTYPE:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(480)
			p.Match(ParserFLOATTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.FLOAT

	case ParserBOOLTYPE:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(482)
			p.Match(ParserBOOLTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.BOOLEAN

	case ParserVOIDTYPE:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(484)
			p.Match(ParserVOIDTYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.VOID

	case ParserUSIZETYPE:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(486)
			p.Match(ParserUSIZETYPE)
		}
		localctx.(*TiposvarsContext).tipo = entorno.USIZE

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}

	return localctx
}

// IDec_arrContext is an interface to support dynamic dispatch.
type IDec_arrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// Get_dimensiones returns the _dimensiones rule contexts.
	Get_dimensiones() IDimensionesContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// Set_dimensiones sets the _dimensiones rule contexts.
	Set_dimensiones(IDimensionesContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsDec_arrContext differentiates from other interfaces.
	IsDec_arrContext()
}

type Dec_arrContext struct {
	*antlr.BaseParserRuleContext
	parser       antlr.Parser
	instr        interfaces.Instruccion
	_tiposvars   ITiposvarsContext
	_dimensiones IDimensionesContext
	_ID          antlr.Token
	_expression  IExpressionContext
}

func NewEmptyDec_arrContext() *Dec_arrContext {
	var p = new(Dec_arrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_dec_arr
	return p
}

func (*Dec_arrContext) IsDec_arrContext() {}

func NewDec_arrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Dec_arrContext {
	var p = new(Dec_arrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_dec_arr

	return p
}

func (s *Dec_arrContext) GetParser() antlr.Parser { return s.parser }

func (s *Dec_arrContext) Get_ID() antlr.Token { return s._ID }

func (s *Dec_arrContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *Dec_arrContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *Dec_arrContext) Get_dimensiones() IDimensionesContext { return s._dimensiones }

func (s *Dec_arrContext) Get_expression() IExpressionContext { return s._expression }

func (s *Dec_arrContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *Dec_arrContext) Set_dimensiones(v IDimensionesContext) { s._dimensiones = v }

func (s *Dec_arrContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Dec_arrContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Dec_arrContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Dec_arrContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *Dec_arrContext) Dimensiones() IDimensionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDimensionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDimensionesContext)
}

func (s *Dec_arrContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *Dec_arrContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL, 0)
}

func (s *Dec_arrContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Dec_arrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Dec_arrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Dec_arrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDec_arr(s)
	}
}

func (s *Dec_arrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDec_arr(s)
	}
}

func (p *Parser) Dec_arr() (localctx IDec_arrContext) {
	localctx = NewDec_arrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 60, ParserRULE_dec_arr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(490)

		var _x = p.Tiposvars()

		localctx.(*Dec_arrContext)._tiposvars = _x
	}
	{
		p.SetState(491)

		var _x = p.dimensiones(0)

		localctx.(*Dec_arrContext)._dimensiones = _x
	}
	{
		p.SetState(492)

		var _m = p.Match(ParserID)

		localctx.(*Dec_arrContext)._ID = _m
	}
	{
		p.SetState(493)
		p.Match(ParserIGUAL)
	}
	{
		p.SetState(494)

		var _x = p.Expression()

		localctx.(*Dec_arrContext)._expression = _x
	}
	localctx.(*Dec_arrContext).instr = Definicion.NewDeclaracionArray(localctx.(*Dec_arrContext).Get_dimensiones().GetTam(), (func() string {
		if localctx.(*Dec_arrContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*Dec_arrContext).Get_ID().GetText()
		}
	}()), localctx.(*Dec_arrContext).Get_expression().GetExpr(), localctx.(*Dec_arrContext).Get_tiposvars().GetTipo())

	return localctx
}

// IDimensionesContext is an interface to support dynamic dispatch.
type IDimensionesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetTamano returns the tamano rule contexts.
	GetTamano() IDimensionesContext

	// SetTamano sets the tamano rule contexts.
	SetTamano(IDimensionesContext)

	// GetTam returns the tam attribute.
	GetTam() int

	// SetTam sets the tam attribute.
	SetTam(int)

	// IsDimensionesContext differentiates from other interfaces.
	IsDimensionesContext()
}

type DimensionesContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	tam    int
	tamano IDimensionesContext
}

func NewEmptyDimensionesContext() *DimensionesContext {
	var p = new(DimensionesContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_dimensiones
	return p
}

func (*DimensionesContext) IsDimensionesContext() {}

func NewDimensionesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DimensionesContext {
	var p = new(DimensionesContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_dimensiones

	return p
}

func (s *DimensionesContext) GetParser() antlr.Parser { return s.parser }

func (s *DimensionesContext) GetTamano() IDimensionesContext { return s.tamano }

func (s *DimensionesContext) SetTamano(v IDimensionesContext) { s.tamano = v }

func (s *DimensionesContext) GetTam() int { return s.tam }

func (s *DimensionesContext) SetTam(v int) { s.tam = v }

func (s *DimensionesContext) Dimension() IDimensionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDimensionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDimensionContext)
}

func (s *DimensionesContext) Dimensiones() IDimensionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IDimensionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IDimensionesContext)
}

func (s *DimensionesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DimensionesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DimensionesContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDimensiones(s)
	}
}

func (s *DimensionesContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDimensiones(s)
	}
}

func (p *Parser) Dimensiones() (localctx IDimensionesContext) {
	return p.dimensiones(0)
}

func (p *Parser) dimensiones(_p int) (localctx IDimensionesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewDimensionesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IDimensionesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 62
	p.EnterRecursionRule(localctx, 62, ParserRULE_dimensiones, _p)
	localctx.(*DimensionesContext).tam = 0

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(498)
		p.Dimension()
	}
	localctx.(*DimensionesContext).tam = 1

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(507)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewDimensionesContext(p, _parentctx, _parentState)
			localctx.(*DimensionesContext).tamano = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_dimensiones)
			p.SetState(501)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(502)
				p.Dimension()
			}

			localctx.(*DimensionesContext).tam = localctx.(*DimensionesContext).GetTamano().GetTam() + 1

		}
		p.SetState(509)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 20, p.GetParserRuleContext())
	}

	return localctx
}

// IDimensionContext is an interface to support dynamic dispatch.
type IDimensionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// IsDimensionContext differentiates from other interfaces.
	IsDimensionContext()
}

type DimensionContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyDimensionContext() *DimensionContext {
	var p = new(DimensionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_dimension
	return p
}

func (*DimensionContext) IsDimensionContext() {}

func NewDimensionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *DimensionContext {
	var p = new(DimensionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_dimension

	return p
}

func (s *DimensionContext) GetParser() antlr.Parser { return s.parser }

func (s *DimensionContext) L_CORCH() antlr.TerminalNode {
	return s.GetToken(ParserL_CORCH, 0)
}

func (s *DimensionContext) R_CORCH() antlr.TerminalNode {
	return s.GetToken(ParserR_CORCH, 0)
}

func (s *DimensionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *DimensionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *DimensionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDimension(s)
	}
}

func (s *DimensionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDimension(s)
	}
}

func (p *Parser) Dimension() (localctx IDimensionContext) {
	localctx = NewDimensionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 64, ParserRULE_dimension)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(510)
		p.Match(ParserL_CORCH)
	}
	{
		p.SetState(511)
		p.Match(ParserR_CORCH)
	}

	return localctx
}

// IArraydataContext is an interface to support dynamic dispatch.
type IArraydataContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_listaExpresiones returns the _listaExpresiones rule contexts.
	Get_listaExpresiones() IListaExpresionesContext

	// Set_listaExpresiones sets the _listaExpresiones rule contexts.
	Set_listaExpresiones(IListaExpresionesContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsArraydataContext differentiates from other interfaces.
	IsArraydataContext()
}

type ArraydataContext struct {
	*antlr.BaseParserRuleContext
	parser            antlr.Parser
	expr              interfaces.Expresion
	_listaExpresiones IListaExpresionesContext
}

func NewEmptyArraydataContext() *ArraydataContext {
	var p = new(ArraydataContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_arraydata
	return p
}

func (*ArraydataContext) IsArraydataContext() {}

func NewArraydataContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ArraydataContext {
	var p = new(ArraydataContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_arraydata

	return p
}

func (s *ArraydataContext) GetParser() antlr.Parser { return s.parser }

func (s *ArraydataContext) Get_listaExpresiones() IListaExpresionesContext {
	return s._listaExpresiones
}

func (s *ArraydataContext) Set_listaExpresiones(v IListaExpresionesContext) { s._listaExpresiones = v }

func (s *ArraydataContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *ArraydataContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *ArraydataContext) L_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserL_LLAVE, 0)
}

func (s *ArraydataContext) ListaExpresiones() IListaExpresionesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaExpresionesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaExpresionesContext)
}

func (s *ArraydataContext) R_LLAVE() antlr.TerminalNode {
	return s.GetToken(ParserR_LLAVE, 0)
}

func (s *ArraydataContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ArraydataContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ArraydataContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterArraydata(s)
	}
}

func (s *ArraydataContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitArraydata(s)
	}
}

func (p *Parser) Arraydata() (localctx IArraydataContext) {
	localctx = NewArraydataContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 66, ParserRULE_arraydata)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(513)
		p.Match(ParserL_LLAVE)
	}
	{
		p.SetState(514)

		var _x = p.listaExpresiones(0)

		localctx.(*ArraydataContext)._listaExpresiones = _x
	}
	{
		p.SetState(515)
		p.Match(ParserR_LLAVE)
	}
	localctx.(*ArraydataContext).expr = expresion2.NewValorArreglo(localctx.(*ArraydataContext).Get_listaExpresiones().GetLista())

	return localctx
}

// IInstanciaContext is an interface to support dynamic dispatch.
type IInstanciaContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// Get_listanchos returns the _listanchos rule contexts.
	Get_listanchos() IListanchosContext

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// Set_listanchos sets the _listanchos rule contexts.
	Set_listanchos(IListanchosContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsInstanciaContext differentiates from other interfaces.
	IsInstanciaContext()
}

type InstanciaContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	expr        interfaces.Expresion
	_tiposvars  ITiposvarsContext
	_listanchos IListanchosContext
}

func NewEmptyInstanciaContext() *InstanciaContext {
	var p = new(InstanciaContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_instancia
	return p
}

func (*InstanciaContext) IsInstanciaContext() {}

func NewInstanciaContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstanciaContext {
	var p = new(InstanciaContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_instancia

	return p
}

func (s *InstanciaContext) GetParser() antlr.Parser { return s.parser }

func (s *InstanciaContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *InstanciaContext) Get_listanchos() IListanchosContext { return s._listanchos }

func (s *InstanciaContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *InstanciaContext) Set_listanchos(v IListanchosContext) { s._listanchos = v }

func (s *InstanciaContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *InstanciaContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *InstanciaContext) NEW_() antlr.TerminalNode {
	return s.GetToken(ParserNEW_, 0)
}

func (s *InstanciaContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *InstanciaContext) Listanchos() IListanchosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListanchosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListanchosContext)
}

func (s *InstanciaContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstanciaContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstanciaContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterInstancia(s)
	}
}

func (s *InstanciaContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitInstancia(s)
	}
}

func (p *Parser) Instancia() (localctx IInstanciaContext) {
	localctx = NewInstanciaContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 68, ParserRULE_instancia)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(518)
		p.Match(ParserNEW_)
	}
	{
		p.SetState(519)

		var _x = p.Tiposvars()

		localctx.(*InstanciaContext)._tiposvars = _x
	}
	{
		p.SetState(520)

		var _x = p.listanchos(0)

		localctx.(*InstanciaContext)._listanchos = _x
	}
	localctx.(*InstanciaContext).expr = expresion2.NewInstanciaArreglo(localctx.(*InstanciaContext).Get_tiposvars().GetTipo(), localctx.(*InstanciaContext).Get_listanchos().GetLista())

	return localctx
}

// IListanchosContext is an interface to support dynamic dispatch.
type IListanchosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetSublist returns the sublist rule contexts.
	GetSublist() IListanchosContext

	// Get_ancho returns the _ancho rule contexts.
	Get_ancho() IAnchoContext

	// SetSublist sets the sublist rule contexts.
	SetSublist(IListanchosContext)

	// Set_ancho sets the _ancho rule contexts.
	Set_ancho(IAnchoContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListanchosContext differentiates from other interfaces.
	IsListanchosContext()
}

type ListanchosContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	lista   *arrayList.List
	sublist IListanchosContext
	_ancho  IAnchoContext
}

func NewEmptyListanchosContext() *ListanchosContext {
	var p = new(ListanchosContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listanchos
	return p
}

func (*ListanchosContext) IsListanchosContext() {}

func NewListanchosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListanchosContext {
	var p = new(ListanchosContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listanchos

	return p
}

func (s *ListanchosContext) GetParser() antlr.Parser { return s.parser }

func (s *ListanchosContext) GetSublist() IListanchosContext { return s.sublist }

func (s *ListanchosContext) Get_ancho() IAnchoContext { return s._ancho }

func (s *ListanchosContext) SetSublist(v IListanchosContext) { s.sublist = v }

func (s *ListanchosContext) Set_ancho(v IAnchoContext) { s._ancho = v }

func (s *ListanchosContext) GetLista() *arrayList.List { return s.lista }

func (s *ListanchosContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListanchosContext) Ancho() IAnchoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAnchoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAnchoContext)
}

func (s *ListanchosContext) Listanchos() IListanchosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListanchosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListanchosContext)
}

func (s *ListanchosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListanchosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListanchosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListanchos(s)
	}
}

func (s *ListanchosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListanchos(s)
	}
}

func (p *Parser) Listanchos() (localctx IListanchosContext) {
	return p.listanchos(0)
}

func (p *Parser) listanchos(_p int) (localctx IListanchosContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListanchosContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListanchosContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 70
	p.EnterRecursionRule(localctx, 70, ParserRULE_listanchos, _p)

	localctx.(*ListanchosContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(524)

		var _x = p.Ancho()

		localctx.(*ListanchosContext)._ancho = _x
	}
	localctx.(*ListanchosContext).lista.Add(localctx.(*ListanchosContext).Get_ancho().GetExpr())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(533)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 21, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListanchosContext(p, _parentctx, _parentState)
			localctx.(*ListanchosContext).sublist = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listanchos)
			p.SetState(527)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(528)

				var _x = p.Ancho()

				localctx.(*ListanchosContext)._ancho = _x
			}

			localctx.(*ListanchosContext).GetSublist().GetLista().Add(localctx.(*ListanchosContext).Get_ancho().GetExpr())
			localctx.(*ListanchosContext).lista = localctx.(*ListanchosContext).GetSublist().GetLista()

		}
		p.SetState(535)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 21, p.GetParserRuleContext())
	}

	return localctx
}

// IAnchoContext is an interface to support dynamic dispatch.
type IAnchoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsAnchoContext differentiates from other interfaces.
	IsAnchoContext()
}

type AnchoContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	expr        interfaces.Expresion
	_expression IExpressionContext
}

func NewEmptyAnchoContext() *AnchoContext {
	var p = new(AnchoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_ancho
	return p
}

func (*AnchoContext) IsAnchoContext() {}

func NewAnchoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AnchoContext {
	var p = new(AnchoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_ancho

	return p
}

func (s *AnchoContext) GetParser() antlr.Parser { return s.parser }

func (s *AnchoContext) Get_expression() IExpressionContext { return s._expression }

func (s *AnchoContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *AnchoContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *AnchoContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *AnchoContext) L_CORCH() antlr.TerminalNode {
	return s.GetToken(ParserL_CORCH, 0)
}

func (s *AnchoContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *AnchoContext) R_CORCH() antlr.TerminalNode {
	return s.GetToken(ParserR_CORCH, 0)
}

func (s *AnchoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AnchoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AnchoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterAncho(s)
	}
}

func (s *AnchoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitAncho(s)
	}
}

func (p *Parser) Ancho() (localctx IAnchoContext) {
	localctx = NewAnchoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 72, ParserRULE_ancho)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(536)
		p.Match(ParserL_CORCH)
	}
	{
		p.SetState(537)

		var _x = p.Expression()

		localctx.(*AnchoContext)._expression = _x
	}
	{
		p.SetState(538)
		p.Match(ParserR_CORCH)
	}
	localctx.(*AnchoContext).expr = localctx.(*AnchoContext).Get_expression().GetExpr()

	return localctx
}

// IDec_objetoContext is an interface to support dynamic dispatch.
type IDec_objetoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_listides returns the _listides rule contexts.
	Get_listides() IListidesContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Set_listides sets the _listides rule contexts.
	Set_listides(IListidesContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// GetInstr returns the instr attribute.
	GetInstr() interfaces.Instruccion

	// SetInstr sets the instr attribute.
	SetInstr(interfaces.Instruccion)

	// IsDec_objetoContext differentiates from other interfaces.
	IsDec_objetoContext()
}

type Dec_objetoContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	instr       interfaces.Instruccion
	_ID         antlr.Token
	_listides   IListidesContext
	_expression IExpressionContext
}

func NewEmptyDec_objetoContext() *Dec_objetoContext {
	var p = new(Dec_objetoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_dec_objeto
	return p
}

func (*Dec_objetoContext) IsDec_objetoContext() {}

func NewDec_objetoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Dec_objetoContext {
	var p = new(Dec_objetoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_dec_objeto

	return p
}

func (s *Dec_objetoContext) GetParser() antlr.Parser { return s.parser }

func (s *Dec_objetoContext) Get_ID() antlr.Token { return s._ID }

func (s *Dec_objetoContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *Dec_objetoContext) Get_listides() IListidesContext { return s._listides }

func (s *Dec_objetoContext) Get_expression() IExpressionContext { return s._expression }

func (s *Dec_objetoContext) Set_listides(v IListidesContext) { s._listides = v }

func (s *Dec_objetoContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Dec_objetoContext) GetInstr() interfaces.Instruccion { return s.instr }

func (s *Dec_objetoContext) SetInstr(v interfaces.Instruccion) { s.instr = v }

func (s *Dec_objetoContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *Dec_objetoContext) Listides() IListidesContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListidesContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListidesContext)
}

func (s *Dec_objetoContext) IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL, 0)
}

func (s *Dec_objetoContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Dec_objetoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Dec_objetoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Dec_objetoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterDec_objeto(s)
	}
}

func (s *Dec_objetoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitDec_objeto(s)
	}
}

func (p *Parser) Dec_objeto() (localctx IDec_objetoContext) {
	localctx = NewDec_objetoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 74, ParserRULE_dec_objeto)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(541)

		var _m = p.Match(ParserID)

		localctx.(*Dec_objetoContext)._ID = _m
	}
	{
		p.SetState(542)

		var _x = p.listides(0)

		localctx.(*Dec_objetoContext)._listides = _x
	}
	{
		p.SetState(543)
		p.Match(ParserIGUAL)
	}
	{
		p.SetState(544)

		var _x = p.Expression()

		localctx.(*Dec_objetoContext)._expression = _x
	}
	localctx.(*Dec_objetoContext).instr = Definicion.NewDeclararObjeto((func() string {
		if localctx.(*Dec_objetoContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*Dec_objetoContext).Get_ID().GetText()
		}
	}()), localctx.(*Dec_objetoContext).Get_listides().GetLista(), localctx.(*Dec_objetoContext).Get_expression().GetExpr())

	return localctx
}

// IInstanciaClaseContext is an interface to support dynamic dispatch.
type IInstanciaClaseContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsInstanciaClaseContext differentiates from other interfaces.
	IsInstanciaClaseContext()
}

type InstanciaClaseContext struct {
	*antlr.BaseParserRuleContext
	parser antlr.Parser
	expr   interfaces.Expresion
	_ID    antlr.Token
}

func NewEmptyInstanciaClaseContext() *InstanciaClaseContext {
	var p = new(InstanciaClaseContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_instanciaClase
	return p
}

func (*InstanciaClaseContext) IsInstanciaClaseContext() {}

func NewInstanciaClaseContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstanciaClaseContext {
	var p = new(InstanciaClaseContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_instanciaClase

	return p
}

func (s *InstanciaClaseContext) GetParser() antlr.Parser { return s.parser }

func (s *InstanciaClaseContext) Get_ID() antlr.Token { return s._ID }

func (s *InstanciaClaseContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *InstanciaClaseContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *InstanciaClaseContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *InstanciaClaseContext) NEW_() antlr.TerminalNode {
	return s.GetToken(ParserNEW_, 0)
}

func (s *InstanciaClaseContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *InstanciaClaseContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *InstanciaClaseContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *InstanciaClaseContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstanciaClaseContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *InstanciaClaseContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterInstanciaClase(s)
	}
}

func (s *InstanciaClaseContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitInstanciaClase(s)
	}
}

func (p *Parser) InstanciaClase() (localctx IInstanciaClaseContext) {
	localctx = NewInstanciaClaseContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 76, ParserRULE_instanciaClase)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(547)
		p.Match(ParserNEW_)
	}
	{
		p.SetState(548)

		var _m = p.Match(ParserID)

		localctx.(*InstanciaClaseContext)._ID = _m
	}
	{
		p.SetState(549)
		p.Match(ParserLP)
	}
	{
		p.SetState(550)
		p.Match(ParserRP)
	}
	localctx.(*InstanciaClaseContext).expr = expresion2.NewInstanciaObjeto((func() string {
		if localctx.(*InstanciaClaseContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*InstanciaClaseContext).Get_ID().GetText()
		}
	}()))

	return localctx
}

// IAccesoarrContext is an interface to support dynamic dispatch.
type IAccesoarrContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_listanchos returns the _listanchos rule contexts.
	Get_listanchos() IListanchosContext

	// Set_listanchos sets the _listanchos rule contexts.
	Set_listanchos(IListanchosContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsAccesoarrContext differentiates from other interfaces.
	IsAccesoarrContext()
}

type AccesoarrContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	expr        interfaces.Expresion
	_ID         antlr.Token
	_listanchos IListanchosContext
}

func NewEmptyAccesoarrContext() *AccesoarrContext {
	var p = new(AccesoarrContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_accesoarr
	return p
}

func (*AccesoarrContext) IsAccesoarrContext() {}

func NewAccesoarrContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AccesoarrContext {
	var p = new(AccesoarrContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_accesoarr

	return p
}

func (s *AccesoarrContext) GetParser() antlr.Parser { return s.parser }

func (s *AccesoarrContext) Get_ID() antlr.Token { return s._ID }

func (s *AccesoarrContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *AccesoarrContext) Get_listanchos() IListanchosContext { return s._listanchos }

func (s *AccesoarrContext) Set_listanchos(v IListanchosContext) { s._listanchos = v }

func (s *AccesoarrContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *AccesoarrContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *AccesoarrContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *AccesoarrContext) Listanchos() IListanchosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListanchosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListanchosContext)
}

func (s *AccesoarrContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AccesoarrContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AccesoarrContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterAccesoarr(s)
	}
}

func (s *AccesoarrContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitAccesoarr(s)
	}
}

func (p *Parser) Accesoarr() (localctx IAccesoarrContext) {
	localctx = NewAccesoarrContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 78, ParserRULE_accesoarr)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(553)

		var _m = p.Match(ParserID)

		localctx.(*AccesoarrContext)._ID = _m
	}
	{
		p.SetState(554)

		var _x = p.listanchos(0)

		localctx.(*AccesoarrContext)._listanchos = _x
	}
	localctx.(*AccesoarrContext).expr = Accesos.NewAccessoArr((func() string {
		if localctx.(*AccesoarrContext).Get_ID() == nil {
			return ""
		} else {
			return localctx.(*AccesoarrContext).Get_ID().GetText()
		}
	}()), localctx.(*AccesoarrContext).Get_listanchos().GetLista())

	return localctx
}

// IAccesoObjetoContext is an interface to support dynamic dispatch.
type IAccesoObjetoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_listaAccesos returns the _listaAccesos rule contexts.
	Get_listaAccesos() IListaAccesosContext

	// Set_listaAccesos sets the _listaAccesos rule contexts.
	Set_listaAccesos(IListaAccesosContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsAccesoObjetoContext differentiates from other interfaces.
	IsAccesoObjetoContext()
}

type AccesoObjetoContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	expr          interfaces.Expresion
	_listaAccesos IListaAccesosContext
}

func NewEmptyAccesoObjetoContext() *AccesoObjetoContext {
	var p = new(AccesoObjetoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_accesoObjeto
	return p
}

func (*AccesoObjetoContext) IsAccesoObjetoContext() {}

func NewAccesoObjetoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AccesoObjetoContext {
	var p = new(AccesoObjetoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_accesoObjeto

	return p
}

func (s *AccesoObjetoContext) GetParser() antlr.Parser { return s.parser }

func (s *AccesoObjetoContext) Get_listaAccesos() IListaAccesosContext { return s._listaAccesos }

func (s *AccesoObjetoContext) Set_listaAccesos(v IListaAccesosContext) { s._listaAccesos = v }

func (s *AccesoObjetoContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *AccesoObjetoContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *AccesoObjetoContext) ListaAccesos() IListaAccesosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaAccesosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaAccesosContext)
}

func (s *AccesoObjetoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AccesoObjetoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AccesoObjetoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterAccesoObjeto(s)
	}
}

func (s *AccesoObjetoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitAccesoObjeto(s)
	}
}

func (p *Parser) AccesoObjeto() (localctx IAccesoObjetoContext) {
	localctx = NewAccesoObjetoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 80, ParserRULE_accesoObjeto)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(557)

		var _x = p.listaAccesos(0)

		localctx.(*AccesoObjetoContext)._listaAccesos = _x
	}
	localctx.(*AccesoObjetoContext).expr = Accesos.NewAccesoObjeto(localctx.(*AccesoObjetoContext).Get_listaAccesos().GetLista())

	return localctx
}

// IListaAccesosContext is an interface to support dynamic dispatch.
type IListaAccesosContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetSUBLISTA returns the SUBLISTA rule contexts.
	GetSUBLISTA() IListaAccesosContext

	// Get_acceso returns the _acceso rule contexts.
	Get_acceso() IAccesoContext

	// SetSUBLISTA sets the SUBLISTA rule contexts.
	SetSUBLISTA(IListaAccesosContext)

	// Set_acceso sets the _acceso rule contexts.
	Set_acceso(IAccesoContext)

	// GetLista returns the lista attribute.
	GetLista() *arrayList.List

	// SetLista sets the lista attribute.
	SetLista(*arrayList.List)

	// IsListaAccesosContext differentiates from other interfaces.
	IsListaAccesosContext()
}

type ListaAccesosContext struct {
	*antlr.BaseParserRuleContext
	parser   antlr.Parser
	lista    *arrayList.List
	SUBLISTA IListaAccesosContext
	_acceso  IAccesoContext
}

func NewEmptyListaAccesosContext() *ListaAccesosContext {
	var p = new(ListaAccesosContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_listaAccesos
	return p
}

func (*ListaAccesosContext) IsListaAccesosContext() {}

func NewListaAccesosContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ListaAccesosContext {
	var p = new(ListaAccesosContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_listaAccesos

	return p
}

func (s *ListaAccesosContext) GetParser() antlr.Parser { return s.parser }

func (s *ListaAccesosContext) GetSUBLISTA() IListaAccesosContext { return s.SUBLISTA }

func (s *ListaAccesosContext) Get_acceso() IAccesoContext { return s._acceso }

func (s *ListaAccesosContext) SetSUBLISTA(v IListaAccesosContext) { s.SUBLISTA = v }

func (s *ListaAccesosContext) Set_acceso(v IAccesoContext) { s._acceso = v }

func (s *ListaAccesosContext) GetLista() *arrayList.List { return s.lista }

func (s *ListaAccesosContext) SetLista(v *arrayList.List) { s.lista = v }

func (s *ListaAccesosContext) Acceso() IAccesoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAccesoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAccesoContext)
}

func (s *ListaAccesosContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(ParserPUNTO, 0)
}

func (s *ListaAccesosContext) ListaAccesos() IListaAccesosContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IListaAccesosContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IListaAccesosContext)
}

func (s *ListaAccesosContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ListaAccesosContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ListaAccesosContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterListaAccesos(s)
	}
}

func (s *ListaAccesosContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitListaAccesos(s)
	}
}

func (p *Parser) ListaAccesos() (localctx IListaAccesosContext) {
	return p.listaAccesos(0)
}

func (p *Parser) listaAccesos(_p int) (localctx IListaAccesosContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewListaAccesosContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IListaAccesosContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 82
	p.EnterRecursionRule(localctx, 82, ParserRULE_listaAccesos, _p)

	localctx.(*ListaAccesosContext).lista = arrayList.New()

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(561)

		var _x = p.Acceso()

		localctx.(*ListaAccesosContext)._acceso = _x
	}
	localctx.(*ListaAccesosContext).lista.Add(localctx.(*ListaAccesosContext).Get_acceso().GetExpr())

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(571)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 22, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewListaAccesosContext(p, _parentctx, _parentState)
			localctx.(*ListaAccesosContext).SUBLISTA = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_listaAccesos)
			p.SetState(564)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(565)
				p.Match(ParserPUNTO)
			}
			{
				p.SetState(566)

				var _x = p.Acceso()

				localctx.(*ListaAccesosContext)._acceso = _x
			}

			localctx.(*ListaAccesosContext).GetSUBLISTA().GetLista().Add(localctx.(*ListaAccesosContext).Get_acceso().GetExpr())
			localctx.(*ListaAccesosContext).lista = localctx.(*ListaAccesosContext).GetSUBLISTA().GetLista()

		}
		p.SetState(573)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 22, p.GetParserRuleContext())
	}

	return localctx
}

// IAccesoContext is an interface to support dynamic dispatch.
type IAccesoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// Get_accesoarr returns the _accesoarr rule contexts.
	Get_accesoarr() IAccesoarrContext

	// Set_accesoarr sets the _accesoarr rule contexts.
	Set_accesoarr(IAccesoarrContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsAccesoContext differentiates from other interfaces.
	IsAccesoContext()
}

type AccesoContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	expr       interfaces.Expresion
	_ID        antlr.Token
	_accesoarr IAccesoarrContext
}

func NewEmptyAccesoContext() *AccesoContext {
	var p = new(AccesoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_acceso
	return p
}

func (*AccesoContext) IsAccesoContext() {}

func NewAccesoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *AccesoContext {
	var p = new(AccesoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_acceso

	return p
}

func (s *AccesoContext) GetParser() antlr.Parser { return s.parser }

func (s *AccesoContext) Get_ID() antlr.Token { return s._ID }

func (s *AccesoContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *AccesoContext) Get_accesoarr() IAccesoarrContext { return s._accesoarr }

func (s *AccesoContext) Set_accesoarr(v IAccesoarrContext) { s._accesoarr = v }

func (s *AccesoContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *AccesoContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *AccesoContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *AccesoContext) Accesoarr() IAccesoarrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAccesoarrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAccesoarrContext)
}

func (s *AccesoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *AccesoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *AccesoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterAcceso(s)
	}
}

func (s *AccesoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitAcceso(s)
	}
}

func (p *Parser) Acceso() (localctx IAccesoContext) {
	localctx = NewAccesoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 84, ParserRULE_acceso)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(579)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 23, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(574)

			var _m = p.Match(ParserID)

			localctx.(*AccesoContext)._ID = _m
		}
		localctx.(*AccesoContext).expr = expresion.NuevoIdentificador((func() string {
			if localctx.(*AccesoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*AccesoContext).Get_ID().GetText()
			}
		}()))

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(576)

			var _x = p.Accesoarr()

			localctx.(*AccesoContext)._accesoarr = _x
		}
		localctx.(*AccesoContext).expr = localctx.(*AccesoContext).Get_accesoarr().GetExpr()

	}

	return localctx
}

// IExpressionContext is an interface to support dynamic dispatch.
type IExpressionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_POW returns the _POW token.
	Get_POW() antlr.Token

	// Set_POW sets the _POW token.
	Set_POW(antlr.Token)

	// Get_expr_rel returns the _expr_rel rule contexts.
	Get_expr_rel() IExpr_relContext

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

	// Get_expr_log returns the _expr_log rule contexts.
	Get_expr_log() IExpr_logContext

	// Get_instancia returns the _instancia rule contexts.
	Get_instancia() IInstanciaContext

	// Get_arraydata returns the _arraydata rule contexts.
	Get_arraydata() IArraydataContext

	// Get_tiposvars returns the _tiposvars rule contexts.
	Get_tiposvars() ITiposvarsContext

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpressionContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpressionContext

	// Set_expr_rel sets the _expr_rel rule contexts.
	Set_expr_rel(IExpr_relContext)

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

	// Set_expr_log sets the _expr_log rule contexts.
	Set_expr_log(IExpr_logContext)

	// Set_instancia sets the _instancia rule contexts.
	Set_instancia(IInstanciaContext)

	// Set_arraydata sets the _arraydata rule contexts.
	Set_arraydata(IArraydataContext)

	// Set_tiposvars sets the _tiposvars rule contexts.
	Set_tiposvars(ITiposvarsContext)

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpressionContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpressionContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsExpressionContext differentiates from other interfaces.
	IsExpressionContext()
}

type ExpressionContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	expr       interfaces.Expresion
	_expr_rel  IExpr_relContext
	_expr_arit IExpr_aritContext
	_expr_log  IExpr_logContext
	_instancia IInstanciaContext
	_arraydata IArraydataContext
	_tiposvars ITiposvarsContext
	_POW       antlr.Token
	opIz       IExpressionContext
	opDe       IExpressionContext
}

func NewEmptyExpressionContext() *ExpressionContext {
	var p = new(ExpressionContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_expression
	return p
}

func (*ExpressionContext) IsExpressionContext() {}

func NewExpressionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ExpressionContext {
	var p = new(ExpressionContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_expression

	return p
}

func (s *ExpressionContext) GetParser() antlr.Parser { return s.parser }

func (s *ExpressionContext) Get_POW() antlr.Token { return s._POW }

func (s *ExpressionContext) Set_POW(v antlr.Token) { s._POW = v }

func (s *ExpressionContext) Get_expr_rel() IExpr_relContext { return s._expr_rel }

func (s *ExpressionContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *ExpressionContext) Get_expr_log() IExpr_logContext { return s._expr_log }

func (s *ExpressionContext) Get_instancia() IInstanciaContext { return s._instancia }

func (s *ExpressionContext) Get_arraydata() IArraydataContext { return s._arraydata }

func (s *ExpressionContext) Get_tiposvars() ITiposvarsContext { return s._tiposvars }

func (s *ExpressionContext) GetOpIz() IExpressionContext { return s.opIz }

func (s *ExpressionContext) GetOpDe() IExpressionContext { return s.opDe }

func (s *ExpressionContext) Set_expr_rel(v IExpr_relContext) { s._expr_rel = v }

func (s *ExpressionContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

func (s *ExpressionContext) Set_expr_log(v IExpr_logContext) { s._expr_log = v }

func (s *ExpressionContext) Set_instancia(v IInstanciaContext) { s._instancia = v }

func (s *ExpressionContext) Set_arraydata(v IArraydataContext) { s._arraydata = v }

func (s *ExpressionContext) Set_tiposvars(v ITiposvarsContext) { s._tiposvars = v }

func (s *ExpressionContext) SetOpIz(v IExpressionContext) { s.opIz = v }

func (s *ExpressionContext) SetOpDe(v IExpressionContext) { s.opDe = v }

func (s *ExpressionContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *ExpressionContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *ExpressionContext) Expr_rel() IExpr_relContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_relContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_relContext)
}

func (s *ExpressionContext) Expr_arit() IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *ExpressionContext) Expr_log() IExpr_logContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_logContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_logContext)
}

func (s *ExpressionContext) Instancia() IInstanciaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IInstanciaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IInstanciaContext)
}

func (s *ExpressionContext) Arraydata() IArraydataContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IArraydataContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IArraydataContext)
}

func (s *ExpressionContext) Tiposvars() ITiposvarsContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ITiposvarsContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ITiposvarsContext)
}

func (s *ExpressionContext) AllDOSPUNTOS() []antlr.TerminalNode {
	return s.GetTokens(ParserDOSPUNTOS)
}

func (s *ExpressionContext) DOSPUNTOS(i int) antlr.TerminalNode {
	return s.GetToken(ParserDOSPUNTOS, i)
}

func (s *ExpressionContext) POW() antlr.TerminalNode {
	return s.GetToken(ParserPOW, 0)
}

func (s *ExpressionContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *ExpressionContext) COMA() antlr.TerminalNode {
	return s.GetToken(ParserCOMA, 0)
}

func (s *ExpressionContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *ExpressionContext) AllExpression() []IExpressionContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpressionContext)(nil)).Elem())
	var tst = make([]IExpressionContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpressionContext)
		}
	}

	return tst
}

func (s *ExpressionContext) Expression(i int) IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *ExpressionContext) POWF() antlr.TerminalNode {
	return s.GetToken(ParserPOWF, 0)
}

func (s *ExpressionContext) VEC_VACIO() antlr.TerminalNode {
	return s.GetToken(ParserVEC_VACIO, 0)
}

func (s *ExpressionContext) NEW_() antlr.TerminalNode {
	return s.GetToken(ParserNEW_, 0)
}

func (s *ExpressionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ExpressionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ExpressionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterExpression(s)
	}
}

func (s *ExpressionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitExpression(s)
	}
}

func (p *Parser) Expression() (localctx IExpressionContext) {
	localctx = NewExpressionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 86, ParserRULE_expression)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(625)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 24, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(581)

			var _x = p.expr_rel(0)

			localctx.(*ExpressionContext)._expr_rel = _x
		}
		localctx.(*ExpressionContext).expr = localctx.(*ExpressionContext).Get_expr_rel().GetExpr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(584)

			var _x = p.expr_arit(0)

			localctx.(*ExpressionContext)._expr_arit = _x
		}
		localctx.(*ExpressionContext).expr = localctx.(*ExpressionContext).Get_expr_arit().GetExpr()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(587)

			var _x = p.expr_log(0)

			localctx.(*ExpressionContext)._expr_log = _x
		}
		localctx.(*ExpressionContext).expr = localctx.(*ExpressionContext).Get_expr_log().GetExpr()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(590)

			var _x = p.Instancia()

			localctx.(*ExpressionContext)._instancia = _x
		}
		localctx.(*ExpressionContext).expr = localctx.(*ExpressionContext).Get_instancia().GetExpr()

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(593)

			var _x = p.Arraydata()

			localctx.(*ExpressionContext)._arraydata = _x
		}
		localctx.(*ExpressionContext).expr = localctx.(*ExpressionContext).Get_arraydata().GetExpr()

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(596)

			var _x = p.Tiposvars()

			localctx.(*ExpressionContext)._tiposvars = _x
		}
		{
			p.SetState(597)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(598)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(599)

			var _m = p.Match(ParserPOW)

			localctx.(*ExpressionContext)._POW = _m
		}
		{
			p.SetState(600)
			p.Match(ParserLP)
		}
		{
			p.SetState(601)

			var _x = p.Expression()

			localctx.(*ExpressionContext).opIz = _x
		}
		{
			p.SetState(602)
			p.Match(ParserCOMA)
		}
		{
			p.SetState(603)

			var _x = p.Expression()

			localctx.(*ExpressionContext).opDe = _x
		}
		{
			p.SetState(604)
			p.Match(ParserRP)
		}
		localctx.(*ExpressionContext).expr = expresion.NuevaOperacion(localctx.(*ExpressionContext).GetOpIz().GetExpr(), (func() string {
			if localctx.(*ExpressionContext).Get_POW() == nil {
				return ""
			} else {
				return localctx.(*ExpressionContext).Get_POW().GetText()
			}
		}()), localctx.(*ExpressionContext).GetOpDe().GetExpr(), false, localctx.(*ExpressionContext).Get_tiposvars().GetTipo())

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(607)

			var _x = p.Tiposvars()

			localctx.(*ExpressionContext)._tiposvars = _x
		}
		{
			p.SetState(608)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(609)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(610)
			p.Match(ParserPOWF)
		}
		{
			p.SetState(611)
			p.Match(ParserLP)
		}
		{
			p.SetState(612)

			var _x = p.Expression()

			localctx.(*ExpressionContext).opIz = _x
		}
		{
			p.SetState(613)
			p.Match(ParserCOMA)
		}
		{
			p.SetState(614)

			var _x = p.Expression()

			localctx.(*ExpressionContext).opDe = _x
		}
		{
			p.SetState(615)
			p.Match(ParserRP)
		}
		localctx.(*ExpressionContext).expr = expresion.NuevaOperacion(localctx.(*ExpressionContext).GetOpIz().GetExpr(), "pow", localctx.(*ExpressionContext).GetOpDe().GetExpr(), false, localctx.(*ExpressionContext).Get_tiposvars().GetTipo())

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(618)
			p.Match(ParserVEC_VACIO)
		}
		{
			p.SetState(619)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(620)
			p.Match(ParserDOSPUNTOS)
		}
		{
			p.SetState(621)
			p.Match(ParserNEW_)
		}
		{
			p.SetState(622)
			p.Match(ParserLP)
		}
		{
			p.SetState(623)
			p.Match(ParserRP)
		}

	}

	return localctx
}

// IExpr_relContext is an interface to support dynamic dispatch.
type IExpr_relContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_relContext

	// Get_expr_arit returns the _expr_arit rule contexts.
	Get_expr_arit() IExpr_aritContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_relContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_relContext)

	// Set_expr_arit sets the _expr_arit rule contexts.
	Set_expr_arit(IExpr_aritContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_relContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsExpr_relContext differentiates from other interfaces.
	IsExpr_relContext()
}

type Expr_relContext struct {
	*antlr.BaseParserRuleContext
	parser     antlr.Parser
	expr       interfaces.Expresion
	opIz       IExpr_relContext
	_expr_arit IExpr_aritContext
	op         antlr.Token
	opDe       IExpr_relContext
}

func NewEmptyExpr_relContext() *Expr_relContext {
	var p = new(Expr_relContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_expr_rel
	return p
}

func (*Expr_relContext) IsExpr_relContext() {}

func NewExpr_relContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_relContext {
	var p = new(Expr_relContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_expr_rel

	return p
}

func (s *Expr_relContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_relContext) GetOp() antlr.Token { return s.op }

func (s *Expr_relContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_relContext) GetOpIz() IExpr_relContext { return s.opIz }

func (s *Expr_relContext) Get_expr_arit() IExpr_aritContext { return s._expr_arit }

func (s *Expr_relContext) GetOpDe() IExpr_relContext { return s.opDe }

func (s *Expr_relContext) SetOpIz(v IExpr_relContext) { s.opIz = v }

func (s *Expr_relContext) Set_expr_arit(v IExpr_aritContext) { s._expr_arit = v }

func (s *Expr_relContext) SetOpDe(v IExpr_relContext) { s.opDe = v }

func (s *Expr_relContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *Expr_relContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *Expr_relContext) Expr_arit() IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *Expr_relContext) AllExpr_rel() []IExpr_relContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_relContext)(nil)).Elem())
	var tst = make([]IExpr_relContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_relContext)
		}
	}

	return tst
}

func (s *Expr_relContext) Expr_rel(i int) IExpr_relContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_relContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_relContext)
}

func (s *Expr_relContext) MAYORIGUAL() antlr.TerminalNode {
	return s.GetToken(ParserMAYORIGUAL, 0)
}

func (s *Expr_relContext) MENORIGUAL() antlr.TerminalNode {
	return s.GetToken(ParserMENORIGUAL, 0)
}

func (s *Expr_relContext) MENOR() antlr.TerminalNode {
	return s.GetToken(ParserMENOR, 0)
}

func (s *Expr_relContext) MAYOR() antlr.TerminalNode {
	return s.GetToken(ParserMAYOR, 0)
}

func (s *Expr_relContext) IGUAL_IGUAL() antlr.TerminalNode {
	return s.GetToken(ParserIGUAL_IGUAL, 0)
}

func (s *Expr_relContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_relContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_relContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterExpr_rel(s)
	}
}

func (s *Expr_relContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitExpr_rel(s)
	}
}

func (p *Parser) Expr_rel() (localctx IExpr_relContext) {
	return p.expr_rel(0)
}

func (p *Parser) expr_rel(_p int) (localctx IExpr_relContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_relContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_relContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 88
	p.EnterRecursionRule(localctx, 88, ParserRULE_expr_rel, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	{
		p.SetState(628)

		var _x = p.expr_arit(0)

		localctx.(*Expr_relContext)._expr_arit = _x
	}
	localctx.(*Expr_relContext).expr = localctx.(*Expr_relContext).Get_expr_arit().GetExpr()

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(638)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewExpr_relContext(p, _parentctx, _parentState)
			localctx.(*Expr_relContext).opIz = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_expr_rel)
			p.SetState(631)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(632)

				var _lt = p.GetTokenStream().LT(1)

				localctx.(*Expr_relContext).op = _lt

				_la = p.GetTokenStream().LA(1)

				if !(((_la-53)&-(0x1f+1)) == 0 && ((1<<uint((_la-53)))&((1<<(ParserIGUAL_IGUAL-53))|(1<<(ParserMAYORIGUAL-53))|(1<<(ParserMENORIGUAL-53))|(1<<(ParserMAYOR-53))|(1<<(ParserMENOR-53)))) != 0) {
					var _ri = p.GetErrorHandler().RecoverInline(p)

					localctx.(*Expr_relContext).op = _ri
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}
			{
				p.SetState(633)

				var _x = p.expr_rel(3)

				localctx.(*Expr_relContext).opDe = _x
			}
			localctx.(*Expr_relContext).expr = expresion.NuevaOperacion(localctx.(*Expr_relContext).GetOpIz().GetExpr(), (func() string {
				if localctx.(*Expr_relContext).GetOp() == nil {
					return ""
				} else {
					return localctx.(*Expr_relContext).GetOp().GetText()
				}
			}()), localctx.(*Expr_relContext).GetOpDe().GetExpr(), false, entorno.NULL)

		}
		p.SetState(640)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 25, p.GetParserRuleContext())
	}

	return localctx
}

// IExpr_logContext is an interface to support dynamic dispatch.
type IExpr_logContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_logContext

	// GetOpU returns the opU rule contexts.
	GetOpU() IExpr_logContext

	// Get_expr_rel returns the _expr_rel rule contexts.
	Get_expr_rel() IExpr_relContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_logContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_logContext)

	// SetOpU sets the opU rule contexts.
	SetOpU(IExpr_logContext)

	// Set_expr_rel sets the _expr_rel rule contexts.
	Set_expr_rel(IExpr_relContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_logContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsExpr_logContext differentiates from other interfaces.
	IsExpr_logContext()
}

type Expr_logContext struct {
	*antlr.BaseParserRuleContext
	parser    antlr.Parser
	expr      interfaces.Expresion
	opIz      IExpr_logContext
	opU       IExpr_logContext
	_expr_rel IExpr_relContext
	op        antlr.Token
	opDe      IExpr_logContext
}

func NewEmptyExpr_logContext() *Expr_logContext {
	var p = new(Expr_logContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_expr_log
	return p
}

func (*Expr_logContext) IsExpr_logContext() {}

func NewExpr_logContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_logContext {
	var p = new(Expr_logContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_expr_log

	return p
}

func (s *Expr_logContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_logContext) GetOp() antlr.Token { return s.op }

func (s *Expr_logContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_logContext) GetOpIz() IExpr_logContext { return s.opIz }

func (s *Expr_logContext) GetOpU() IExpr_logContext { return s.opU }

func (s *Expr_logContext) Get_expr_rel() IExpr_relContext { return s._expr_rel }

func (s *Expr_logContext) GetOpDe() IExpr_logContext { return s.opDe }

func (s *Expr_logContext) SetOpIz(v IExpr_logContext) { s.opIz = v }

func (s *Expr_logContext) SetOpU(v IExpr_logContext) { s.opU = v }

func (s *Expr_logContext) Set_expr_rel(v IExpr_relContext) { s._expr_rel = v }

func (s *Expr_logContext) SetOpDe(v IExpr_logContext) { s.opDe = v }

func (s *Expr_logContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *Expr_logContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *Expr_logContext) NOT() antlr.TerminalNode {
	return s.GetToken(ParserNOT, 0)
}

func (s *Expr_logContext) AllExpr_log() []IExpr_logContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_logContext)(nil)).Elem())
	var tst = make([]IExpr_logContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_logContext)
		}
	}

	return tst
}

func (s *Expr_logContext) Expr_log(i int) IExpr_logContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_logContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_logContext)
}

func (s *Expr_logContext) Expr_rel() IExpr_relContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_relContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_relContext)
}

func (s *Expr_logContext) OR() antlr.TerminalNode {
	return s.GetToken(ParserOR, 0)
}

func (s *Expr_logContext) AND() antlr.TerminalNode {
	return s.GetToken(ParserAND, 0)
}

func (s *Expr_logContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_logContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_logContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterExpr_log(s)
	}
}

func (s *Expr_logContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitExpr_log(s)
	}
}

func (p *Parser) Expr_log() (localctx IExpr_logContext) {
	return p.expr_log(0)
}

func (p *Parser) expr_log(_p int) (localctx IExpr_logContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_logContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_logContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 90
	p.EnterRecursionRule(localctx, 90, ParserRULE_expr_log, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(649)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ParserNOT:
		{
			p.SetState(642)
			p.Match(ParserNOT)
		}
		{
			p.SetState(643)

			var _x = p.expr_log(3)

			localctx.(*Expr_logContext).opU = _x
		}
		localctx.(*Expr_logContext).expr = expresion.NuevaOperacion(localctx.(*Expr_logContext).GetOpU().GetExpr(), "!", nil, true, entorno.NULL)

	case ParserLP, ParserSUB, ParserNUMBER, ParserUSIZE, ParserFLOAT, ParserSTRING, ParserCHAR, ParserTRUE, ParserFALSE, ParserID:
		{
			p.SetState(646)

			var _x = p.expr_rel(0)

			localctx.(*Expr_logContext)._expr_rel = _x
		}
		localctx.(*Expr_logContext).expr = localctx.(*Expr_logContext).Get_expr_rel().GetExpr()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(658)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 27, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewExpr_logContext(p, _parentctx, _parentState)
			localctx.(*Expr_logContext).opIz = _prevctx
			p.PushNewRecursionContext(localctx, _startState, ParserRULE_expr_log)
			p.SetState(651)

			if !(p.Precpred(p.GetParserRuleContext(), 2)) {
				panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 2)", ""))
			}
			{
				p.SetState(652)

				var _lt = p.GetTokenStream().LT(1)

				localctx.(*Expr_logContext).op = _lt

				_la = p.GetTokenStream().LA(1)

				if !(_la == ParserAND || _la == ParserOR) {
					var _ri = p.GetErrorHandler().RecoverInline(p)

					localctx.(*Expr_logContext).op = _ri
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}
			{
				p.SetState(653)

				var _x = p.expr_log(3)

				localctx.(*Expr_logContext).opDe = _x
			}
			localctx.(*Expr_logContext).expr = expresion.NuevaOperacion(localctx.(*Expr_logContext).GetOpIz().GetExpr(), (func() string {
				if localctx.(*Expr_logContext).GetOp() == nil {
					return ""
				} else {
					return localctx.(*Expr_logContext).GetOp().GetText()
				}
			}()), localctx.(*Expr_logContext).GetOpDe().GetExpr(), false, entorno.NULL)

		}
		p.SetState(660)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 27, p.GetParserRuleContext())
	}

	return localctx
}

// IExpr_aritContext is an interface to support dynamic dispatch.
type IExpr_aritContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// GetOp returns the op token.
	GetOp() antlr.Token

	// SetOp sets the op token.
	SetOp(antlr.Token)

	// GetOpIz returns the opIz rule contexts.
	GetOpIz() IExpr_aritContext

	// GetOpU returns the opU rule contexts.
	GetOpU() IExpressionContext

	// Get_expression returns the _expression rule contexts.
	Get_expression() IExpressionContext

	// Get_expr_valor returns the _expr_valor rule contexts.
	Get_expr_valor() IExpr_valorContext

	// GetOpDe returns the opDe rule contexts.
	GetOpDe() IExpr_aritContext

	// SetOpIz sets the opIz rule contexts.
	SetOpIz(IExpr_aritContext)

	// SetOpU sets the opU rule contexts.
	SetOpU(IExpressionContext)

	// Set_expression sets the _expression rule contexts.
	Set_expression(IExpressionContext)

	// Set_expr_valor sets the _expr_valor rule contexts.
	Set_expr_valor(IExpr_valorContext)

	// SetOpDe sets the opDe rule contexts.
	SetOpDe(IExpr_aritContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsExpr_aritContext differentiates from other interfaces.
	IsExpr_aritContext()
}

type Expr_aritContext struct {
	*antlr.BaseParserRuleContext
	parser      antlr.Parser
	expr        interfaces.Expresion
	opIz        IExpr_aritContext
	opU         IExpressionContext
	_expression IExpressionContext
	_expr_valor IExpr_valorContext
	op          antlr.Token
	opDe        IExpr_aritContext
}

func NewEmptyExpr_aritContext() *Expr_aritContext {
	var p = new(Expr_aritContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_expr_arit
	return p
}

func (*Expr_aritContext) IsExpr_aritContext() {}

func NewExpr_aritContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_aritContext {
	var p = new(Expr_aritContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_expr_arit

	return p
}

func (s *Expr_aritContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_aritContext) GetOp() antlr.Token { return s.op }

func (s *Expr_aritContext) SetOp(v antlr.Token) { s.op = v }

func (s *Expr_aritContext) GetOpIz() IExpr_aritContext { return s.opIz }

func (s *Expr_aritContext) GetOpU() IExpressionContext { return s.opU }

func (s *Expr_aritContext) Get_expression() IExpressionContext { return s._expression }

func (s *Expr_aritContext) Get_expr_valor() IExpr_valorContext { return s._expr_valor }

func (s *Expr_aritContext) GetOpDe() IExpr_aritContext { return s.opDe }

func (s *Expr_aritContext) SetOpIz(v IExpr_aritContext) { s.opIz = v }

func (s *Expr_aritContext) SetOpU(v IExpressionContext) { s.opU = v }

func (s *Expr_aritContext) Set_expression(v IExpressionContext) { s._expression = v }

func (s *Expr_aritContext) Set_expr_valor(v IExpr_valorContext) { s._expr_valor = v }

func (s *Expr_aritContext) SetOpDe(v IExpr_aritContext) { s.opDe = v }

func (s *Expr_aritContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *Expr_aritContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *Expr_aritContext) SUB() antlr.TerminalNode {
	return s.GetToken(ParserSUB, 0)
}

func (s *Expr_aritContext) Expression() IExpressionContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpressionContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpressionContext)
}

func (s *Expr_aritContext) Expr_valor() IExpr_valorContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_valorContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IExpr_valorContext)
}

func (s *Expr_aritContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *Expr_aritContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *Expr_aritContext) AllExpr_arit() []IExpr_aritContext {
	var ts = s.GetTypedRuleContexts(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem())
	var tst = make([]IExpr_aritContext, len(ts))

	for i, t := range ts {
		if t != nil {
			tst[i] = t.(IExpr_aritContext)
		}
	}

	return tst
}

func (s *Expr_aritContext) Expr_arit(i int) IExpr_aritContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IExpr_aritContext)(nil)).Elem(), i)

	if t == nil {
		return nil
	}

	return t.(IExpr_aritContext)
}

func (s *Expr_aritContext) MUL() antlr.TerminalNode {
	return s.GetToken(ParserMUL, 0)
}

func (s *Expr_aritContext) DIV() antlr.TerminalNode {
	return s.GetToken(ParserDIV, 0)
}

func (s *Expr_aritContext) MOD() antlr.TerminalNode {
	return s.GetToken(ParserMOD, 0)
}

func (s *Expr_aritContext) ADD() antlr.TerminalNode {
	return s.GetToken(ParserADD, 0)
}

func (s *Expr_aritContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_aritContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_aritContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterExpr_arit(s)
	}
}

func (s *Expr_aritContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitExpr_arit(s)
	}
}

func (p *Parser) Expr_arit() (localctx IExpr_aritContext) {
	return p.expr_arit(0)
}

func (p *Parser) expr_arit(_p int) (localctx IExpr_aritContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()
	_parentState := p.GetState()
	localctx = NewExpr_aritContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IExpr_aritContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 92
	p.EnterRecursionRule(localctx, 92, ParserRULE_expr_arit, _p)
	var _la int

	defer func() {
		p.UnrollRecursionContexts(_parentctx)
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(674)
	p.GetErrorHandler().Sync(p)

	switch p.GetTokenStream().LA(1) {
	case ParserSUB:
		{
			p.SetState(662)
			p.Match(ParserSUB)
		}
		{
			p.SetState(663)

			var _x = p.Expression()

			localctx.(*Expr_aritContext).opU = _x
			localctx.(*Expr_aritContext)._expression = _x
		}
		localctx.(*Expr_aritContext).expr = expresion.NuevaOperacion(localctx.(*Expr_aritContext).GetOpU().GetExpr(), "-", nil, true, entorno.NULL)

	case ParserNUMBER, ParserUSIZE, ParserFLOAT, ParserSTRING, ParserCHAR, ParserTRUE, ParserFALSE, ParserID:
		{
			p.SetState(666)

			var _x = p.Expr_valor()

			localctx.(*Expr_aritContext)._expr_valor = _x
		}
		localctx.(*Expr_aritContext).expr = localctx.(*Expr_aritContext).Get_expr_valor().GetExpr()

	case ParserLP:
		{
			p.SetState(669)
			p.Match(ParserLP)
		}
		{
			p.SetState(670)

			var _x = p.Expression()

			localctx.(*Expr_aritContext)._expression = _x
		}
		{
			p.SetState(671)
			p.Match(ParserRP)
		}
		localctx.(*Expr_aritContext).expr = localctx.(*Expr_aritContext).Get_expression().GetExpr()

	default:
		panic(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
	}
	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(688)
	p.GetErrorHandler().Sync(p)
	_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 30, p.GetParserRuleContext())

	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			p.SetState(686)
			p.GetErrorHandler().Sync(p)
			switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 29, p.GetParserRuleContext()) {
			case 1:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ParserRULE_expr_arit)
				p.SetState(676)

				if !(p.Precpred(p.GetParserRuleContext(), 4)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 4)", ""))
				}
				{
					p.SetState(677)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(((_la-59)&-(0x1f+1)) == 0 && ((1<<uint((_la-59)))&((1<<(ParserMUL-59))|(1<<(ParserDIV-59))|(1<<(ParserMOD-59)))) != 0) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(678)

					var _x = p.expr_arit(5)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).expr = expresion.NuevaOperacion(localctx.(*Expr_aritContext).GetOpIz().GetExpr(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetExpr(), false, entorno.NULL)

			case 2:
				localctx = NewExpr_aritContext(p, _parentctx, _parentState)
				localctx.(*Expr_aritContext).opIz = _prevctx
				p.PushNewRecursionContext(localctx, _startState, ParserRULE_expr_arit)
				p.SetState(681)

				if !(p.Precpred(p.GetParserRuleContext(), 3)) {
					panic(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 3)", ""))
				}
				{
					p.SetState(682)

					var _lt = p.GetTokenStream().LT(1)

					localctx.(*Expr_aritContext).op = _lt

					_la = p.GetTokenStream().LA(1)

					if !(_la == ParserADD || _la == ParserSUB) {
						var _ri = p.GetErrorHandler().RecoverInline(p)

						localctx.(*Expr_aritContext).op = _ri
					} else {
						p.GetErrorHandler().ReportMatch(p)
						p.Consume()
					}
				}
				{
					p.SetState(683)

					var _x = p.expr_arit(4)

					localctx.(*Expr_aritContext).opDe = _x
				}
				localctx.(*Expr_aritContext).expr = expresion.NuevaOperacion(localctx.(*Expr_aritContext).GetOpIz().GetExpr(), (func() string {
					if localctx.(*Expr_aritContext).GetOp() == nil {
						return ""
					} else {
						return localctx.(*Expr_aritContext).GetOp().GetText()
					}
				}()), localctx.(*Expr_aritContext).GetOpDe().GetExpr(), false, entorno.NULL)

			}

		}
		p.SetState(690)
		p.GetErrorHandler().Sync(p)
		_alt = p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 30, p.GetParserRuleContext())
	}

	return localctx
}

// IExpr_valorContext is an interface to support dynamic dispatch.
type IExpr_valorContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_primitivo returns the _primitivo rule contexts.
	Get_primitivo() IPrimitivoContext

	// Get_llamada returns the _llamada rule contexts.
	Get_llamada() ILlamadaContext

	// Get_accesoarr returns the _accesoarr rule contexts.
	Get_accesoarr() IAccesoarrContext

	// Get_accesoObjeto returns the _accesoObjeto rule contexts.
	Get_accesoObjeto() IAccesoObjetoContext

	// Set_primitivo sets the _primitivo rule contexts.
	Set_primitivo(IPrimitivoContext)

	// Set_llamada sets the _llamada rule contexts.
	Set_llamada(ILlamadaContext)

	// Set_accesoarr sets the _accesoarr rule contexts.
	Set_accesoarr(IAccesoarrContext)

	// Set_accesoObjeto sets the _accesoObjeto rule contexts.
	Set_accesoObjeto(IAccesoObjetoContext)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsExpr_valorContext differentiates from other interfaces.
	IsExpr_valorContext()
}

type Expr_valorContext struct {
	*antlr.BaseParserRuleContext
	parser        antlr.Parser
	expr          interfaces.Expresion
	_primitivo    IPrimitivoContext
	_llamada      ILlamadaContext
	_accesoarr    IAccesoarrContext
	_accesoObjeto IAccesoObjetoContext
}

func NewEmptyExpr_valorContext() *Expr_valorContext {
	var p = new(Expr_valorContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_expr_valor
	return p
}

func (*Expr_valorContext) IsExpr_valorContext() {}

func NewExpr_valorContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *Expr_valorContext {
	var p = new(Expr_valorContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_expr_valor

	return p
}

func (s *Expr_valorContext) GetParser() antlr.Parser { return s.parser }

func (s *Expr_valorContext) Get_primitivo() IPrimitivoContext { return s._primitivo }

func (s *Expr_valorContext) Get_llamada() ILlamadaContext { return s._llamada }

func (s *Expr_valorContext) Get_accesoarr() IAccesoarrContext { return s._accesoarr }

func (s *Expr_valorContext) Get_accesoObjeto() IAccesoObjetoContext { return s._accesoObjeto }

func (s *Expr_valorContext) Set_primitivo(v IPrimitivoContext) { s._primitivo = v }

func (s *Expr_valorContext) Set_llamada(v ILlamadaContext) { s._llamada = v }

func (s *Expr_valorContext) Set_accesoarr(v IAccesoarrContext) { s._accesoarr = v }

func (s *Expr_valorContext) Set_accesoObjeto(v IAccesoObjetoContext) { s._accesoObjeto = v }

func (s *Expr_valorContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *Expr_valorContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *Expr_valorContext) Primitivo() IPrimitivoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IPrimitivoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IPrimitivoContext)
}

func (s *Expr_valorContext) Llamada() ILlamadaContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*ILlamadaContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(ILlamadaContext)
}

func (s *Expr_valorContext) Accesoarr() IAccesoarrContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAccesoarrContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAccesoarrContext)
}

func (s *Expr_valorContext) AccesoObjeto() IAccesoObjetoContext {
	var t = s.GetTypedRuleContext(reflect.TypeOf((*IAccesoObjetoContext)(nil)).Elem(), 0)

	if t == nil {
		return nil
	}

	return t.(IAccesoObjetoContext)
}

func (s *Expr_valorContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *Expr_valorContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *Expr_valorContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterExpr_valor(s)
	}
}

func (s *Expr_valorContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitExpr_valor(s)
	}
}

func (p *Parser) Expr_valor() (localctx IExpr_valorContext) {
	localctx = NewExpr_valorContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 94, ParserRULE_expr_valor)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(703)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 31, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(691)

			var _x = p.Primitivo()

			localctx.(*Expr_valorContext)._primitivo = _x
		}
		localctx.(*Expr_valorContext).expr = localctx.(*Expr_valorContext).Get_primitivo().GetExpr()

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(694)

			var _x = p.Llamada()

			localctx.(*Expr_valorContext)._llamada = _x
		}
		localctx.(*Expr_valorContext).expr = localctx.(*Expr_valorContext).Get_llamada().GetExpr()

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(697)

			var _x = p.Accesoarr()

			localctx.(*Expr_valorContext)._accesoarr = _x
		}
		localctx.(*Expr_valorContext).expr = localctx.(*Expr_valorContext).Get_accesoarr().GetExpr()

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(700)

			var _x = p.AccesoObjeto()

			localctx.(*Expr_valorContext)._accesoObjeto = _x
		}
		localctx.(*Expr_valorContext).expr = localctx.(*Expr_valorContext).Get_accesoObjeto().GetExpr()

	}

	return localctx
}

// IPrimitivoContext is an interface to support dynamic dispatch.
type IPrimitivoContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Get_NUMBER returns the _NUMBER token.
	Get_NUMBER() antlr.Token

	// Get_USIZE returns the _USIZE token.
	Get_USIZE() antlr.Token

	// Get_FLOAT returns the _FLOAT token.
	Get_FLOAT() antlr.Token

	// Get_STRING returns the _STRING token.
	Get_STRING() antlr.Token

	// Get_CHAR returns the _CHAR token.
	Get_CHAR() antlr.Token

	// Get_ID returns the _ID token.
	Get_ID() antlr.Token

	// Set_NUMBER sets the _NUMBER token.
	Set_NUMBER(antlr.Token)

	// Set_USIZE sets the _USIZE token.
	Set_USIZE(antlr.Token)

	// Set_FLOAT sets the _FLOAT token.
	Set_FLOAT(antlr.Token)

	// Set_STRING sets the _STRING token.
	Set_STRING(antlr.Token)

	// Set_CHAR sets the _CHAR token.
	Set_CHAR(antlr.Token)

	// Set_ID sets the _ID token.
	Set_ID(antlr.Token)

	// GetExpr returns the expr attribute.
	GetExpr() interfaces.Expresion

	// SetExpr sets the expr attribute.
	SetExpr(interfaces.Expresion)

	// IsPrimitivoContext differentiates from other interfaces.
	IsPrimitivoContext()
}

type PrimitivoContext struct {
	*antlr.BaseParserRuleContext
	parser  antlr.Parser
	expr    interfaces.Expresion
	_NUMBER antlr.Token
	_USIZE  antlr.Token
	_FLOAT  antlr.Token
	_STRING antlr.Token
	_CHAR   antlr.Token
	_ID     antlr.Token
}

func NewEmptyPrimitivoContext() *PrimitivoContext {
	var p = new(PrimitivoContext)
	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(nil, -1)
	p.RuleIndex = ParserRULE_primitivo
	return p
}

func (*PrimitivoContext) IsPrimitivoContext() {}

func NewPrimitivoContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *PrimitivoContext {
	var p = new(PrimitivoContext)

	p.BaseParserRuleContext = antlr.NewBaseParserRuleContext(parent, invokingState)

	p.parser = parser
	p.RuleIndex = ParserRULE_primitivo

	return p
}

func (s *PrimitivoContext) GetParser() antlr.Parser { return s.parser }

func (s *PrimitivoContext) Get_NUMBER() antlr.Token { return s._NUMBER }

func (s *PrimitivoContext) Get_USIZE() antlr.Token { return s._USIZE }

func (s *PrimitivoContext) Get_FLOAT() antlr.Token { return s._FLOAT }

func (s *PrimitivoContext) Get_STRING() antlr.Token { return s._STRING }

func (s *PrimitivoContext) Get_CHAR() antlr.Token { return s._CHAR }

func (s *PrimitivoContext) Get_ID() antlr.Token { return s._ID }

func (s *PrimitivoContext) Set_NUMBER(v antlr.Token) { s._NUMBER = v }

func (s *PrimitivoContext) Set_USIZE(v antlr.Token) { s._USIZE = v }

func (s *PrimitivoContext) Set_FLOAT(v antlr.Token) { s._FLOAT = v }

func (s *PrimitivoContext) Set_STRING(v antlr.Token) { s._STRING = v }

func (s *PrimitivoContext) Set_CHAR(v antlr.Token) { s._CHAR = v }

func (s *PrimitivoContext) Set_ID(v antlr.Token) { s._ID = v }

func (s *PrimitivoContext) GetExpr() interfaces.Expresion { return s.expr }

func (s *PrimitivoContext) SetExpr(v interfaces.Expresion) { s.expr = v }

func (s *PrimitivoContext) NUMBER() antlr.TerminalNode {
	return s.GetToken(ParserNUMBER, 0)
}

func (s *PrimitivoContext) USIZE() antlr.TerminalNode {
	return s.GetToken(ParserUSIZE, 0)
}

func (s *PrimitivoContext) FLOAT() antlr.TerminalNode {
	return s.GetToken(ParserFLOAT, 0)
}

func (s *PrimitivoContext) STRING() antlr.TerminalNode {
	return s.GetToken(ParserSTRING, 0)
}

func (s *PrimitivoContext) CHAR() antlr.TerminalNode {
	return s.GetToken(ParserCHAR, 0)
}

func (s *PrimitivoContext) ID() antlr.TerminalNode {
	return s.GetToken(ParserID, 0)
}

func (s *PrimitivoContext) TRUE() antlr.TerminalNode {
	return s.GetToken(ParserTRUE, 0)
}

func (s *PrimitivoContext) FALSE() antlr.TerminalNode {
	return s.GetToken(ParserFALSE, 0)
}

func (s *PrimitivoContext) PUNTO() antlr.TerminalNode {
	return s.GetToken(ParserPUNTO, 0)
}

func (s *PrimitivoContext) ABS() antlr.TerminalNode {
	return s.GetToken(ParserABS, 0)
}

func (s *PrimitivoContext) LP() antlr.TerminalNode {
	return s.GetToken(ParserLP, 0)
}

func (s *PrimitivoContext) RP() antlr.TerminalNode {
	return s.GetToken(ParserRP, 0)
}

func (s *PrimitivoContext) SQRT() antlr.TerminalNode {
	return s.GetToken(ParserSQRT, 0)
}

func (s *PrimitivoContext) TO_STRING() antlr.TerminalNode {
	return s.GetToken(ParserTO_STRING, 0)
}

func (s *PrimitivoContext) CLONE() antlr.TerminalNode {
	return s.GetToken(ParserCLONE, 0)
}

func (s *PrimitivoContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *PrimitivoContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *PrimitivoContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.EnterPrimitivo(s)
	}
}

func (s *PrimitivoContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(ParserListener); ok {
		listenerT.ExitPrimitivo(s)
	}
}

func (p *Parser) Primitivo() (localctx IPrimitivoContext) {
	localctx = NewPrimitivoContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 96, ParserRULE_primitivo)

	defer func() {
		p.ExitRule()
	}()

	defer func() {
		if err := recover(); err != nil {
			if v, ok := err.(antlr.RecognitionException); ok {
				localctx.SetException(v)
				p.GetErrorHandler().ReportError(p, v)
				p.GetErrorHandler().Recover(p, v)
			} else {
				panic(err)
			}
		}
	}()

	p.SetState(745)
	p.GetErrorHandler().Sync(p)
	switch p.GetInterpreter().AdaptivePredict(p.GetTokenStream(), 32, p.GetParserRuleContext()) {
	case 1:
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(705)

			var _m = p.Match(ParserNUMBER)

			localctx.(*PrimitivoContext)._NUMBER = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_NUMBER() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_NUMBER().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(num, entorno.INTEGER)

	case 2:
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(707)

			var _m = p.Match(ParserUSIZE)

			localctx.(*PrimitivoContext)._USIZE = _m
		}

		num, err := strconv.Atoi((func() string {
			if localctx.(*PrimitivoContext).Get_USIZE() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_USIZE().GetText()
			}
		}()))
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(num, entorno.USIZE)

	case 3:
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(709)

			var _m = p.Match(ParserFLOAT)

			localctx.(*PrimitivoContext)._FLOAT = _m
		}

		num, err := strconv.ParseFloat((func() string {
			if localctx.(*PrimitivoContext).Get_FLOAT() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_FLOAT().GetText()
			}
		}()), 64)
		if err != nil {
			fmt.Println(err)
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(num, entorno.FLOAT)

	case 4:
		p.EnterOuterAlt(localctx, 4)
		{
			p.SetState(711)

			var _m = p.Match(ParserSTRING)

			localctx.(*PrimitivoContext)._STRING = _m
		}

		str := (func() string {
			if localctx.(*PrimitivoContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_STRING().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*PrimitivoContext).Get_STRING() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_STRING().GetText()
			}
		}()))-1]
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(str, entorno.STRING)

	case 5:
		p.EnterOuterAlt(localctx, 5)
		{
			p.SetState(713)

			var _m = p.Match(ParserCHAR)

			localctx.(*PrimitivoContext)._CHAR = _m
		}

		str := (func() string {
			if localctx.(*PrimitivoContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_CHAR().GetText()
			}
		}())[1 : len((func() string {
			if localctx.(*PrimitivoContext).Get_CHAR() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_CHAR().GetText()
			}
		}()))-1]
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(str, entorno.CHAR)

	case 6:
		p.EnterOuterAlt(localctx, 6)
		{
			p.SetState(715)

			var _m = p.Match(ParserID)

			localctx.(*PrimitivoContext)._ID = _m
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoIdentificador((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()))

	case 7:
		p.EnterOuterAlt(localctx, 7)
		{
			p.SetState(717)
			p.Match(ParserTRUE)
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(true, entorno.BOOLEAN)

	case 8:
		p.EnterOuterAlt(localctx, 8)
		{
			p.SetState(719)
			p.Match(ParserFALSE)
		}
		localctx.(*PrimitivoContext).expr = expresion.NuevoPrimitivo(false, entorno.BOOLEAN)

	case 9:
		p.EnterOuterAlt(localctx, 9)
		{
			p.SetState(721)

			var _m = p.Match(ParserID)

			localctx.(*PrimitivoContext)._ID = _m
		}
		{
			p.SetState(722)
			p.Match(ParserPUNTO)
		}
		{
			p.SetState(723)
			p.Match(ParserABS)
		}
		{
			p.SetState(724)
			p.Match(ParserLP)
		}
		{
			p.SetState(725)
			p.Match(ParserRP)
		}

		linea := localctx.(*PrimitivoContext).ABS().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).ABS().GetSymbol().GetColumn()
		localctx.(*PrimitivoContext).expr = funcionesNativas.NuevoValorAbs((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()), linea, columna)

	case 10:
		p.EnterOuterAlt(localctx, 10)
		{
			p.SetState(727)

			var _m = p.Match(ParserID)

			localctx.(*PrimitivoContext)._ID = _m
		}
		{
			p.SetState(728)
			p.Match(ParserPUNTO)
		}
		{
			p.SetState(729)
			p.Match(ParserSQRT)
		}
		{
			p.SetState(730)
			p.Match(ParserLP)
		}
		{
			p.SetState(731)
			p.Match(ParserRP)
		}

		linea := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).SQRT().GetSymbol().GetColumn()
		localctx.(*PrimitivoContext).expr = funcionesNativas.NuevoValorSqrt((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()), linea, columna)

	case 11:
		p.EnterOuterAlt(localctx, 11)
		{
			p.SetState(733)

			var _m = p.Match(ParserID)

			localctx.(*PrimitivoContext)._ID = _m
		}
		{
			p.SetState(734)
			p.Match(ParserPUNTO)
		}
		{
			p.SetState(735)
			p.Match(ParserTO_STRING)
		}
		{
			p.SetState(736)
			p.Match(ParserLP)
		}
		{
			p.SetState(737)
			p.Match(ParserRP)
		}

		linea := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).TO_STRING().GetSymbol().GetColumn()
		localctx.(*PrimitivoContext).expr = funcionesNativas.NuevoValorStr((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()), linea, columna)

	case 12:
		p.EnterOuterAlt(localctx, 12)
		{
			p.SetState(739)

			var _m = p.Match(ParserID)

			localctx.(*PrimitivoContext)._ID = _m
		}
		{
			p.SetState(740)
			p.Match(ParserPUNTO)
		}
		{
			p.SetState(741)
			p.Match(ParserCLONE)
		}
		{
			p.SetState(742)
			p.Match(ParserLP)
		}
		{
			p.SetState(743)
			p.Match(ParserRP)
		}

		linea := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetLine()
		columna := localctx.(*PrimitivoContext).CLONE().GetSymbol().GetColumn()
		localctx.(*PrimitivoContext).expr = funcionesNativas.NuevoValorClone((func() string {
			if localctx.(*PrimitivoContext).Get_ID() == nil {
				return ""
			} else {
				return localctx.(*PrimitivoContext).Get_ID().GetText()
			}
		}()), linea, columna)

	}

	return localctx
}

func (p *Parser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 1:
		var t *ListaFuncionesContext = nil
		if localctx != nil {
			t = localctx.(*ListaFuncionesContext)
		}
		return p.ListaFunciones_Sempred(t, predIndex)

	case 4:
		var t *ParametrosContext = nil
		if localctx != nil {
			t = localctx.(*ParametrosContext)
		}
		return p.Parametros_Sempred(t, predIndex)

	case 17:
		var t *Listaexpre_caseContext = nil
		if localctx != nil {
			t = localctx.(*Listaexpre_caseContext)
		}
		return p.Listaexpre_case_Sempred(t, predIndex)

	case 22:
		var t *ListaExpresionesContext = nil
		if localctx != nil {
			t = localctx.(*ListaExpresionesContext)
		}
		return p.ListaExpresiones_Sempred(t, predIndex)

	case 28:
		var t *ListidesContext = nil
		if localctx != nil {
			t = localctx.(*ListidesContext)
		}
		return p.Listides_Sempred(t, predIndex)

	case 31:
		var t *DimensionesContext = nil
		if localctx != nil {
			t = localctx.(*DimensionesContext)
		}
		return p.Dimensiones_Sempred(t, predIndex)

	case 35:
		var t *ListanchosContext = nil
		if localctx != nil {
			t = localctx.(*ListanchosContext)
		}
		return p.Listanchos_Sempred(t, predIndex)

	case 41:
		var t *ListaAccesosContext = nil
		if localctx != nil {
			t = localctx.(*ListaAccesosContext)
		}
		return p.ListaAccesos_Sempred(t, predIndex)

	case 44:
		var t *Expr_relContext = nil
		if localctx != nil {
			t = localctx.(*Expr_relContext)
		}
		return p.Expr_rel_Sempred(t, predIndex)

	case 45:
		var t *Expr_logContext = nil
		if localctx != nil {
			t = localctx.(*Expr_logContext)
		}
		return p.Expr_log_Sempred(t, predIndex)

	case 46:
		var t *Expr_aritContext = nil
		if localctx != nil {
			t = localctx.(*Expr_aritContext)
		}
		return p.Expr_arit_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *Parser) ListaFunciones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Parametros_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Listaexpre_case_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 2:
		return p.Precpred(p.GetParserRuleContext(), 3)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) ListaExpresiones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 3:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Listides_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 4:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Dimensiones_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 5:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Listanchos_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 6:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) ListaAccesos_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 7:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Expr_rel_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 8:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Expr_log_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 9:
		return p.Precpred(p.GetParserRuleContext(), 2)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *Parser) Expr_arit_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 10:
		return p.Precpred(p.GetParserRuleContext(), 4)

	case 11:
		return p.Precpred(p.GetParserRuleContext(), 3)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

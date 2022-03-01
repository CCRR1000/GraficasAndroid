/* - - - PRIMERA SECCION - - - */
package jflex;

import java_cup.runtime.*;
import sym;

%%

/* - - - SEGUNDA SECCION - - - */
%class LexerGraphics
%public
%unicode
%line
%column
%cup


/* Palabras Reservadas */
BARRAS = "Barras"
PIE = "Pie"
TITULO = "titulo"
EJEX = "ejex"
EJEY = "ejey"
UNIR = "unir"
TIPO = "tipo"
CANTIDAD = "Cantidad"
PORCENTAJE = "Porcentaje"
ETIQUETAS = "etiquetas"
VALORES = "valores"
TOTAL = "total"
EXTRA = "extra"
EJECUTAR = "Ejecutar"

/* Expresiones Regulares */
L = [a-zA-Z |á|é|í|ó|ú|Á|É|Í|Ó|Ú]
ENTERO = [0-9]+
LITERAL = \"( L | ENTERO | , | . | _ | - )+ \"
DECIMAL = {ENTERO} . {ENTERO}
DEF = [ Def | def ]
COMENT = # [^\n]
ESPACIO = [ |\n|\r|\t|\f]


/* Signos */

COMA = ","
PUNTO_COMA = ";"
DOS_PUNTOS = ":"
LLAVE_INI = "{"
LLAVE_FIN = "}"
PARENTESIS_INI = "("
PARENTESIS_FIN = ")"
CORCHETE_INI = "["
CORCHETE_FIN = "]"

/* Operadores */

MAS = "+"
MENOS = "-"
POR = "*"
ENTRE = "/"





%{
    
%}

%eof{
    
%eof}

%%

/* - - - TERCERA SECCION - - - */

        {BARRAS}    { return new Symbol (sym.BARRAS, yyline+1, yycolumn+1)}
           {PIE}    { return new Symbol (sym.PIE, yyline+1, yycolumn+1)}
        {TITULO}    { return new Symbol (sym.TITULO, yyline+1, yycolumn+1)} 
          {EJEX}    { return new Symbol (sym.EJEX, yyline+1, yycolumn+1)}
          {EJEY}    { return new Symbol (sym.EJEY, yyline+1, yycolumn+1)}
          {UNIR}    { return new Symbol (sym.UNIR, yyline+1, yycolumn+1)}
          {TIPO}    { return new Symbol (sym.TIPO, yyline+1, yycolumn+1)}
      {CANTIDAD}    { return new Symbol (sym.CANTIDAD, yyline+1, yycolumn+1)}
    {PORCENTAJE}    { return new Symbol (sym.PORCENTAJE, yyline+1, yycolumn+1)}
     {ETIQUETAS}    { return new Symbol (sym.ETIQUETAS, yyline+1, yycolumn+1)}
       {VALORES}    { return new Symbol (sym.VALORES, yyline+1, yycolumn+1)}
         {TOTAL}    { return new Symbol (sym.TOTAL, yyline+1, yycolumn+1)}
         {EXTRA}    { return new Symbol (sym.EXTRA, yyline+1, yycolumn+1)}
      {EJECUTAR}    { return new Symbol (sym.EJECUTAR, yyline+1, yycolumn+1)}
        {ENTERO}    { return new Symbol (sym.ENTERO, yyline+1, yycolumn+1)}
       {LITERAL}    { return new Symbol (sym.LITERAL, yyline+1, yycolumn+1)}
       {DECIMAL}    { return new Symbol (sym.DECIMAL, yyline+1, yycolumn+1)}
           {DEF}    { return new Symbol (sym.DEF, yyline+1, yycolumn+1)}
          {COMA}    { return new Symbol (sym.COMA, yyline+1, yycolumn+1)}
    {PUNTO_COMA}    { return new Symbol (sym.PUNTO_COMA, yyline+1, yycolumn+1)} 
    {DOS_PUNTOS}    { return new Symbol (sym.DOS_PUNTOS, yyline+1, yycolumn+1)}
     {LLAVE_INI}    { return new Symbol (sym.LLAVE_INI, yyline+1, yycolumn+1)}
     {LLAVE_FIN}    { return new Symbol (sym.LLAVE_FIN, yyline+1, yycolumn+1)}
{PARENTESIS_INI}    { return new Symbol (sym.PARENTESIS_INI, yyline+1, yycolumn+1)}
{PARENTESIS_FIN}    { return new Symbol (sym.PARENTESIS_FIN, yyline+1, yycolumn+1)}
  {CORCHETE_INI}    { return new Symbol (sym.CORCHETE_INI, yyline+1, yycolumn+1)}
  {CORCHETE_FIN}    { return new Symbol (sym.CORCHETE_FIN, yyline+1, yycolumn+1)}
           {MAS}    { return new Symbol (sym.MAS, yyline+1, yycolumn+1)}
         {MENOS}    { return new Symbol (sym.MENOS, yyline+1, yycolumn+1)} 
           {POR}    { return new Symbol (sym.POR, yyline+1, yycolumn+1)}
         {ENTRE}    { return new Symbol (sym.ENTRE, yyline+1, yycolumn+1)} 

       {ESPACIO}    { /* Se ignora */ }
        {COMENT}    { /* Se ignora */ }
             [^]    {}

//{VOCAL} {increaseCount();}
//{ENTERO} {System.out.println("Entero");}
//{ESPACIO} {actualizarConteo();}







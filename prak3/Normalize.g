tree grammar Normalize;

options {  
  	tokenVocab=SymbolRaetsel3;
	output=AST;
	ASTLabelType=CommonTree;
}
 

prog : zblock zblock zblock zblock zblock zblock;

zblock : ^(CALCULATION ^(ADD first second) equal)
     | ^(CALCULATION ^(SUB first second) equal) -> ^(CALCULATION ^(ADD["+"] equal second) first) //Umstellung
     ;
blockID :	ID+;
     
first : number;
second : number;
equal : number;

number : ^(BLOCK ID+);
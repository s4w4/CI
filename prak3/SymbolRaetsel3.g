grammar SymbolRaetsel3;

options { 
	output=AST;
	ASTLabelType=CommonTree;
}

tokens{
	BLOCK;
	CALCULATION; 
}


prog		:	b11 = blockID o11 = op b12 = blockID ASSIGN b13 = blockID
			o21 = op o22 = op o23 = op 
			b21 = blockID o31 = op b22 = blockID ASSIGN b23 = blockID 
			assignLine 
			b31 = blockID o41 = op b32 = blockID ASSIGN b33 = blockID
			
			-> ^(CALCULATION ^($o11 $b11 $b12) $b13)
			   ^(CALCULATION ^($o31 $b21 $b22) $b23)
			   ^(CALCULATION ^($o41 $b31 $b32) $b33)
			   ^(CALCULATION ^($o21 $b11 $b21) $b31)
			   ^(CALCULATION ^($o22 $b12 $b22) $b32)
			   ^(CALCULATION ^($o23 $b13 $b23) $b33);	// alles in einer Regel, weil mehrmals auf BlockIDs zugegriffen wird. senkrecht waagerecht

assignLine	:	ASSIGN ASSIGN ASSIGN;
op		:	ADD | SUB;
blockID		:	ID+
			-> ^(BLOCK ID+);		// Block zusammenfassen 

ID	:	('A'..'Z');
//OP	:	('+'|'-');				// wir wollen auf + und - zugreifen daher explizite Lexeme ADD und SUB
ADD	:	'+';
SUB	:	'-';
ASSIGN	:	'=';
WS 	: 	(' '|'\t'|'\n'|'\r')+ {$channel=HIDDEN;} ;
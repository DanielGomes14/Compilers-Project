grammar Dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser:: members{
    static protected Map<String,Symbol> symbolTable = new HashMap<>();
}

program: (stats)* EOF                        #Prog ;
stats: declaration ';'                         #Stat ;
declaration: DIMID  '->' type                  #Declar ;
type: datatype unit                             #TypeNormal             
| DIMID  op =('/'|'*') DIMID unit               #TypeVars
;  


datatype: 'real' | 'int'                       #DType ;
unit: '(' ID (op=('/'|'*') ID)*  ')'           #unitCheck ;



LETTER: [a-zA-Z];
DIMID: LETTER+;
ID: LETTER(LETTER)*;


 
COMMENT:'//' .*? '\n' -> skip;
MULTICOMMENT: '/*' .*? '*/' -> skip;
WS:[ \t\r\n] -> skip;
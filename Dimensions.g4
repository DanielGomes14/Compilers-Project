grammar Dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser:: members{
    static protected Map<String,Dimension> dimTable = new HashMap<>();
}

program: (stats)* EOF                           #Prog ;
stats: (declaration| addunit) ';'               #Stat ;
declaration: DIMID  '->' type                   #Declar ;
addunit: DIMID '.addUnit(' type ')'             #addUn;

type: datatype unit                             #TypeNormal             
| DIMID  op =('/'|'*') DIMID unit               #TypeVars
| datatype ',' conversion                       #TypeConversions
;  

conversion:ID '=' DIGIT op=('/' | 'op' ) ID    #ConvCheck ;
datatype: tp=('Real' | 'Integer')              #DTypeCheck ;
unit: '(' ID (op=('/'|'*') ID)*  ')'           #unitCheck ;


DIGIT: [0-9]+;
LETTER: [a-zA-Z];
DIMID: LETTER+;
ID: LETTER(LETTER)*;


 
COMMENT:'//' .*? '\n' -> skip;
MULTICOMMENT: '/*' .*? '*/' -> skip;
WS:[ \t\r\n] -> skip;


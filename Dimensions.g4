grammar Dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser:: members{
    static protected Map<String,Symbol> symbolTable = new HashMap<>();
}
/
program: (stats)* EOF                           #Prog ;          
stats: (declaration| addunit) ';'               #Stat ;
//Distance -> Distance
declaration: DIMID  '->' type                   #Declar ;
addunit: DIMID '-> addUnit' type                #addUn;

type: datatype unit                             #TypeNormal             
| DIMID  op =('/'|'*') DIMID unit               #TypeVars
| datatype ',' conversion                       #TypeConversions
;


conversion:ID '=' DIGIT op=('/' | '*' ) ID      #ConvCheck ;   //id[0]=unidade a criar; DIGIT=fator de mult;id[1]=unidade a comparar
// cm = 100 * m

datatype: 'real' | 'integer'                        #DTypeCheck ;

unit: '(' ID (op=('/'|'*') ID)*  ')'            #unitCheck ;
// m/s


DIGIT: [0-9]+;
LETTER: [a-zA-Z];
DIMID: LETTER+;
ID: LETTER(LETTER)*;



COMMENT:'//' .*? '\n' -> skip;
MULTICOMMENT: '/*' .*? '*/' -> skip;
WS:[ \t\r\n] -> skip;

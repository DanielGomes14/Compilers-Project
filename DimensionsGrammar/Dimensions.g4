grammar Dimensions;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
    static protected Map<String,Dimension> dimTable = new HashMap<>();
}

program: (stats)* EOF                           #Prog ;          
stats: (declaration| addunit) ';'               #Stat ;             //
declaration: DIMID  '->' type                   #Declar ;           //DIMID=grandeza a definir, type=tipo de var e unidades
addunit: DIMID '-> addUnit' type                #addUn;             //DIMID=grandeza a definir, type=tipo de var e unidades

type: datatype unit                             #TypeNormal         //definir grandezas base(que nao tem do mesmo tipo ja definido)
| DIMID  op =('*'|'/') DIMID                    #TypeVars           //
| conversion                                    #TypeConversions    //converter ordens de grandeza
;


conversion:ID '=' DIGIT op=('*' | '/' ) ID      #ConvCheck ;        //qual nome da unidade de conversao e respetiva escala em relaçao a ordem de grandeza definida anteriormente

datatype: 'real' | 'integer'                    #DTypeCheck ;       //tipos de dados primitivos

unit: '(' ID (op=('*'|'/') ID)*  ')'            #unitCheck ;        //unidades (ex: m, cm, s, ms, etc)



DIGIT: [0-9]+;
DIMID: [A-Z]LETTER+;                                                //Obrigar que o nome da dimensao seja comecado por maiuscula e ser mais que uma letra
ID: LETTER+;
LETTER: [a-zA-Z];

COMMENT:'//' .*? '\n' -> skip;
MULTICOMMENT: '/*' .*? '*/' -> skip;
WS:[ \t\r\n] -> skip;

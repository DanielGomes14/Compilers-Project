grammar MainGram;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}

main: statList EOF;

statList: (stat? ';')*;

stat: print
    | declaration
    | assignment
    | conditionalstat
    | get
    ;

print: 'println' expr  #checkPrint;

declaration: type idList     #dec;

assignment: declaration '=' expr  #decAssign
          | idList '=' expr      #Assign
            ;

conditionalstat: conditional 
               | forloop       
               | whileloop     
               ;

conditional: 'if ('  expr  ') { ' trueSL=statList ( 'else'  falseSL=elseif )?  ;
elseif: conditional |  '{' statList '}'  ;

forloop: 'for (' assignment ';' expr ';' expr ') {' trueSL=statList '}'   #forCond ;

whileloop: 'while (' expr ') {' trueSL=statList '}'   #whileCond ;

idList: ID (',' ID)*  #checkIDList;

input:  'scan(' STRING ')'   #checkInput;

get: 'getDimension(' expr ')'  #dimCheck
   | 'getUnit(' expr ')'  #unitCheck
;



type returns[Type res]:
     'integer' {$res = new IntegerType();}   #typeInt
   | 'real'    {$res = new RealType();}      #typeReal
   | 'boolean' {$res = new BooleanType();}   #typeBool
   | 'string' {$res = new StringType();}    #typeStr
   ;

expr returns[Type eType,String varName]:
     <assoc=right> e1=expr '^' e2=expr             #powExpr
    | sign=('+'|'-') e=expr                         #signExpr
    | '!' e=expr                                    #notExpr 
    | e1=expr op=('*'| '/' ) e2=expr                #multDivExpr
    | e1=expr op=('+' | '-') e2=expr                #addSubExpr
    | e1=expr op=('==' | '!=') e2=expr              #equalComparisonExpr
    | e1=expr op=('>=' | '<=' | '>' | '<') e2=expr  #greatLowComparisonExpr
    | '(' e=expr ')'                                #parenExpr
    | input                                         #inputExpr
    | REAL                                          #realExpr
    | INTEGER                                       #integerExpr
    | BOOLEAN                                       #booleanExpr
    | STRING                                        #strExpr
    | ID                                            #idExpr
    ;

BOOLEAN: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
REAL: [0-9]+ '.' [0-9]*;
INTEGER: [0-9]+;
COMMENT:'//' .*? '\n' -> skip;
MULTICOMMENT: '/*' .*? '*/' -> skip;
WS:[ \t\r\n] -> skip;
STRING: '"' .*? '"';
ERROR: .;

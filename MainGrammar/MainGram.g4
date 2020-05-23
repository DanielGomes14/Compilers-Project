grammar MainGram;

@parser::header {
import java.util.Map;
import java.util.HashMap;
}

@parser::members {
static protected Map<String,Symbol> symbolTable = new HashMap<>();
}

main: (importDims)* statList EOF;

statList: (stat ';')*;                //lista de stats

stat: print                           //tipo de expressoes possiveis
    | declaration
    | assignment
    | conditionalstat
    ;

print: 'println' expr  #checkPrint;                                                         //esrever texto ou variaveis

importDims: 'import' ID ';'  #importDimensionFile;                                          // dá import a File com as Dimensions

assignment: declaration '=' expr  #decAssign                                                //declarar variavel e atribuir o valor
          | idList '=' expr      #Assign                                                    //caso a variavel ja exista alterar valor
            ;
declaration: type idList     #dec;                                                          // tipo e nome da variavel a ser declarada



conditionalstat: conditional                                                                // definição if  e else 
               | forloop                                                                    // definição do for
               | whileloop                                                                  // definição do while
               ;

conditional: 'if' '('  expr  ')' '{' trueSL=statList '}' ( 'else'  falseSL=elseif )?  ;      //condição if
elseif: conditional |  '{' statList '}'  ;                                                   // condição else
 
forloop: 'for' '(' assignment ';' expr ';' expr ')' '{' trueSL=statList '}'   #forCond ;     //for loop

whileloop: 'while' '(' expr ')' '{' trueSL=statList '}'   #whileCond ;   //condição while

idList: ID (',' ID)*  #checkIDList;                                                          //nome da variavel a que se quer atribuir valor

input:  'scan''('  STRING ')'   #checkInput;                                                 //ler dados do utilizador


increment: (ID incre=( '++' | '--')) ;                                                        //incrementar ou decrementar uma variavel por 1

type returns[Type res]:                                                                       //diferentes tipos primitivos aceites pela linguagem, de futuro implementar o tipo Dimensão
     'integer' {$res = new IntegerType();}   #typeInt
   | 'real'    {$res = new RealType();}      #typeReal
   | 'boolean' {$res = new BooleanType();}   #typeBool
   | 'string' {$res = new StringType();}    #typeStr
   | DIMID     #DimensionType              
   ;

expr returns[Type eType,String varName]:                                                     //expressoes possiveis(operacoes, comparacoes ou respetivos tipos de variavel)
     <assoc=right> e1=expr '^' e2=expr              #powExpr
    | sign=('+'|'-') e=expr                         #signExpr
    | '!' e=expr                                    #notExpr 
    | e1=expr op=('*'| '/' ) e2=expr                #multDivExpr
    | e1=expr op=('+' | '-') e2=expr                #addSubExpr
    | e1=expr op=('==' | '!=') e2=expr              #equalComparisonExpr
    | e1=expr op=('>=' | '<=' | '>' | '<') e2=expr  #greatLowComparisonExpr
    | '(' e=expr ')'                                #parenExpr
    | increment                                     #incrExpr
    | input                                         #inputExpr
    | REAL                                          #realExpr
    | INTEGER                                       #integerExpr
    | BOOLEAN                                       #booleanExpr
    | STRING                                        #strExpr
    | ID                                            #idExpr
    ;

BOOLEAN: 'true' | 'false';                      //tipo boolean
DIMID: [A-Z]LETTER+;    
LETTER: [a-zA-Z];                         
ID: [a-zA-Z_][a-zA-Z_0-9]*;                     //nomes variaveis 
REAL: [0-9]+ '.' [0-9]*;                        //tipo real
INTEGER: [0-9]+;                                //tipo integer
COMMENT:'//' .*? '\n' -> skip;                  //comentario apenas para uma linha
MULTICOMMENT: '/*' .*? '*/' -> skip;            //comentario multilinha 
WS:[ \t\r\n]+ -> skip;                          // ignora espaços, tabs, e mudança de linha
STRING: '"' .*? '"';                            //tipo primitivo string 


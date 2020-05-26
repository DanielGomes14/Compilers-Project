O tema do nosso projeto consiste na análise Dimensional,pelo que decidimos criar 2 gramáticas:
    -O interpretador, Dimensions.g4, que tem como objetivo a criação das dimensões e a possivel 
adição de várias unidades a cada uma das dimensões criadas, tendo em conta que a análise semântica
futura irá verificar se tudo se encontra correto. O 'Parser' irá conter uma estrutura de dados contendo
todas as Dimensões criadas. Cada dimensão guardada será um objeto da class Dimension.java .
Objetos desta classe contêm o nome da dimensão, as unidades associadas, o tipo de dados primitivo
(real ou integer) e as conversões para a primeira unidade associada a esta dimensão (isto caso  
adicionemos mais que uma ordem de grandeza). Podemos declarar novas dimensões atribuindo o tipo de dados
e uma unidade associada, ou então através de uma  operação aritmética entre outras duas
dimensões, que devem ser previamente criadas;

---- CODIGO FONTE DA GRAMÁTICA ----
Abrir Pasta DimensionGrammar
Ver no ficheiro dimensoes1.txt
Ver no ficheiro dimensoes2.txt

-----------------------------------

    -O compilador, MainGram.g4 é a gramática principal, onde poderemos realizar diversas operações com 
instâncias das Dimensões, ou com instâncias adimensionais. Tal como na primeira gramática, é criado no
'Parser' uma estrutura de dados, neste caso tem como objetivo guardar todas variáveis ou instâncias
geradas. Cada variável é um objeto da classe Symbol, cada um destes contêm o atributo correspondente ao
tipo primitivo de dados(string,integer,real,boolean ou Dimensão), um nome de variável e valor.
    
  Importante dizer que as classes Dimension e Symbol foram criadas tendo em vista a análise semântica às 
gramáticas que irá ser feita numa versão posterior deste trabalho. Para conseguir utilizar as Dimensões 
temos de recorrer a regra 'importDims' nesta gramática, que no futuro terá como objetivo abrir um ficheiro
de texto com a definição de Dimensões tal como foi explicitada na gramática anterior (Dimensions.g4).
Podemos declarar variáveis atribuindo ou não logo o valor, como forma de guardar,por exemplo,o resultado
de expressões aritméticas( Sempre que declaramos uma variavel temos de referir o tipo de dados associado 
a esta.). Permite também expressões condicionais (if, else if,else, while, for).
O 'while' e 'for' são um tipo diferente de expressões condicionais visto que representam ciclos de iteração.
Dentro das chavetas ('{', '}' ), encontra-se o conteudo caso se verifique a expressão condicional 
enunciada entre parênteses ('(',')'). Para efetuar comparações entre duas expressões podemos recorrer os
operadores '>', '<', '>=','<= ', '==' (valor das expressões iguais) ou '!='(caso sejam diferentes).
    Permite 'prints' (imprimir um valor), 'scans'(ler input por parte do utilizador final), comentarios 
single e multi line. Alem disso, permite também as expressões "++" e "--" para incrementar ou e decrementar
uma variável por uma unidade, respetivamente.

---- CODIGO FONTE DA GRAMÁTICA ----
Abrir pasta MainGrammar
Ver no ficheiro programa1.txt
Ver no ficheiro programa2.txt
Ver ficheiro Funcionalidades.txt

-----------------------------------

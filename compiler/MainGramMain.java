import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.stringtemplate.v4.*;
public class MainGramMain {
   public static void main(String[] args) throws Exception {
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(System.in);
      // create a lexer that feeds off of input CharStream:
      MainGramLexer lexer = new MainGramLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      MainGramParser parser = new MainGramParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at main rule:
      ParseTree tree = parser.main();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         Compiler compiler = new Compiler();
         compiler.visit(tree);
         String outputLang = "java";

            if (!compiler.validTarget(outputLang)) {
               ErrorHandling.printError("Can't find template group file for " + outputLang);
               System.exit(1);
            }

            compiler.setTarget(outputLang);
            ST code = compiler.visit(tree);

            String outputFileName = args[0].split("\\.")[0];

            String outputFileExtension =  "." + outputLang;

            String outputFile = outputFileName + outputFileExtension;

            try {
               code.add("name", outputFileName);
               PrintWriter pw = new PrintWriter(new File(outputFile));
               pw.print(code.render());
               pw.close();

            } catch (FileNotFoundException e) {
               System.err.println("Failed to write code file");
               System.exit(1);
            }
      }
   }
   
}

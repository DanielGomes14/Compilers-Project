
import java.util.Iterator;

public class MainGramCheck extends MainGramBaseVisitor<Object> {

   private boolean validation = true;
   private final RealType realType = new RealType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();

   @Override
   public Object visitMain(MainGramParser.MainContext ctx) {
      validation = (boolean) visit(ctx.statList());
      if (validation)
         System.out.println("boi ");
      else {
         System.out.println("vaca");
      }
   }

   @Override
   public Object visitStatList(MainGramParser.StatListContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStat(MainGramParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitCheckPrint(MainGramParser.CheckPrintContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitDec(MainGramParser.DecContext ctx) {
   String id = ctx.ID().getText(), typeStr = ctx.type().getText();
    if (MainGramParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" already defined");
         return false;
    } 
    else {
      Boolean res = visit(ctx.type());
      if (res) {
        Type type = ctx.type().res;
        Symbol s = new Symbol(typeStr, type);

        s.setValueDefined();
        MainGramParser.map.put(id, s);
      }
    }
    return true;
   }

   @Override
   public Object visitDecAssign(MainGramParser.DecAssignContext ctx) {
      validation = (boolean) visit(ctx.expr());
      if (validation) {
         for (TerminalNode t : ctx.idList().ID()) {
            String id = t.getText();
            if (MainGramParser.symbolTable.containsKey(id)) {
               ErrorHandling.printError(ctx, "Variable \"" + id + "\" already defined ");
               validation = false;
            } else {
               Type tp = (Type) visit(ctx.declaration().type());
               if (!tp.conformsTo(ctx.expr().eType)) {
                  ErrorHandling.printError(ctx, "Variable \"" + id + "\" type does not match to expression ");
                  validation = false;
               } else {
                  Symbol sb = new Symbol(id, tp);
                  sb.setValueDefined();
                  MainGramParser.symbolTable.put(id, sb);
               }
            }
         }

      } else {
         return validation;
      }

      return visitChildren(ctx);
   }

   @Override
   public Object visitAssign(MainGramParser.AssignContext ctx) {
      Boolean res = visit(ctx.expr());
      String id = ctx.ID().getText();
      if (res)
      {
         if (!MainGramParser.symbolTable.containsKey(id))
         {
            ErrorHandling.printError(ctx, "Variable \""+id+"\" does not exists!");
            res = false;
         }
         else
         {
            Symbol sym = MainGramParser.symbolTable.get(id);
            if (!ctx.expr().eType.conformsTo(sym.type()))
            {
               ErrorHandling.printError(ctx, "Expression type does not conform to variable \""+id+"\" type!");
               res = false;
            }
            else
               sym.setValueDefined();
         }
      }
      
   }

   @Override
   public Object visitConditionalstat(MainGramParser.ConditionalstatContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitConditional(MainGramParser.ConditionalContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitElseif(MainGramParser.ElseifContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitForCond(MainGramParser.ForCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitWhileCond(MainGramParser.WhileCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitCheckIDList(MainGramParser.CheckIDListContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitCheckInput(MainGramParser.CheckInputContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitDimCheck(MainGramParser.DimCheckContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitTypeInt(MainGramParser.TypeIntContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitTypeReal(MainGramParser.TypeRealContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitTypeBool(MainGramParser.TypeBoolContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitTypeStr(MainGramParser.TypeStrContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitStrExpr(MainGramParser.StrExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitAddSubExpr(MainGramParser.AddSubExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitEqualComparisonExpr(MainGramParser.EqualComparisonExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitIntegerExpr(MainGramParser.IntegerExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitRealExpr(MainGramParser.RealExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitBooleanExpr(MainGramParser.BooleanExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitInputExpr(MainGramParser.InputExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitParenExpr(MainGramParser.ParenExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitGreatLowComparisonExpr(MainGramParser.GreatLowComparisonExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitNotExpr(MainGramParser.NotExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitSignExpr(MainGramParser.SignExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitMultDivExpr(MainGramParser.MultDivExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitPowExpr(MainGramParser.PowExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitIdExpr(MainGramParser.IdExprContext ctx) {
      return visitChildren(ctx);
   }
}

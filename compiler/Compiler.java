import org.stringtemplate.v4.*;
import java.util.*;

public class Compiler extends MainGramBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("templates.stg");
   private int x=0;
   private String newVar(){
      x+=1;
      return "v"+x;
   }
   @Override public ST visitMain(MainGramParser.MainContext ctx) {
      ST res = templates.getInstanceOf("module");
      Iterator<MainGramParser.StatListContext> list = ((Object) ctx.statList()).iterator();
      while(list.hasNext()){
         res.add("stat", visit(list.next().render()));
      }
      return res;
   }

   @Override public ST visitStatList(MainGramParser.StatListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitStat(MainGramParser.StatContext ctx) {
      ST res = visitChildren(ctx);
      return res;
   }

   @Override public ST visitCheckPrint(MainGramParser.CheckPrintContext ctx) {
      ST res = templates.getInstanceOf("print");
      res.add("value", visit(ctx.expr()).render());
      return res;
   }

   @Override public ST visitImportDimensionFile(MainGramParser.ImportDimensionFileContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDecAssign(MainGramParser.DecAssignContext ctx) {
      ST res = visit(ctx.declaration());
      res.add("value", visit(ctx.expr()).render());
      return res;
   }

   @Override public ST visitAssign(MainGramParser.AssignContext ctx) {
      ST res = templates.getInstanceOf("assign");
      res.add("var", visit(ctx.idList()).render());
      res.add("value", visit(ctx.expr()).render());
      return res;
   }

   @Override public ST visitDec(MainGramParser.DecContext ctx) {
      ST res = templates.getInstanceOf("decl");
      res.add("type", visit(ctx.type()).render());
      res.add("var", visit(ctx.idList()).render());
      return res;
   }

   @Override public ST visitConditionalstat(MainGramParser.ConditionalstatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitConditional(MainGramParser.ConditionalContext ctx) {
      if(ctx.falseSL != null) {
         ST res = visit(ctx.falseSL);
         res.add("expr",visit(ctx.expr()).render());
         res.add("true_stat", visit(ctx.trueSL.render()));
      } else {
         ST res = templates.getInstanceOf("condition");
         res.add("expr",visit(ctx.expr()).render());
         res.add("true_stat", visit(ctx.trueSL).render());
      }
      return visitChildren(ctx);
   }

   @Override public ST visitElseif(MainGramParser.ElseifContext ctx) {
      ST res;
      if(ctx.statList() != null) {
         res = templates.getInstanceOf("condition");
         res.add("false_stat", visit(ctx.statList()).render());
      } else {
         res = visit(ctx.conditional());
      }
      return res;
   }

   @Override public ST visitForCond(MainGramParser.ForCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitWhileCond(MainGramParser.WhileCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitCheckIDList(MainGramParser.CheckIDListContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitInput(MainGramParser.InputContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIncrement(MainGramParser.IncrementContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTypeInt(MainGramParser.TypeIntContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTypeReal(MainGramParser.TypeRealContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTypeBool(MainGramParser.TypeBoolContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTypeStr(MainGramParser.TypeStrContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDimensionType(MainGramParser.DimensionTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitAddSubExpr(MainGramParser.AddSubExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitEqualComparisonExpr(MainGramParser.EqualComparisonExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIntegerExpr(MainGramParser.IntegerExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitRealExpr(MainGramParser.RealExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitBooleanExpr(MainGramParser.BooleanExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitInputExpr(MainGramParser.InputExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitParenExpr(MainGramParser.ParenExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitGreatLowComparisonExpr(MainGramParser.GreatLowComparisonExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitNotExpr(MainGramParser.NotExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitSignExpr(MainGramParser.SignExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitStrExp(MainGramParser.StrExpContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitMultDivExpr(MainGramParser.MultDivExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitPowExpr(MainGramParser.PowExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIdExpr(MainGramParser.IdExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }
}

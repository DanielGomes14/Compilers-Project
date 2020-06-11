import java.io.File;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

import org.stringtemplate.v4.*;

public class Compiler extends MainGramBaseVisitor<ST> {
   protected int varCount = 0;
   protected String target = "java"; // default
   protected STGroup stg = null;

   private String newVar(){
      varCount+=1;
      return "v"+varCount;
   }
   @Override public ST visitMain(MainGramParser.MainContext ctx) {
      assert validTarget(target);

      stg = new STGroupFile(target+".stg");
      ST res = stg.getInstanceOf("module");
      res.add("stat", visit(ctx.statList()));
      return res;
   }

   @Override public ST visitStatList(MainGramParser.StatListContext ctx) {
      ST res = stg.getInstanceOf("stats");
      for(MainGramParser.StatContext sc: ctx.stat()){
         res.add("stat", visit(sc));}
      return res;   
   }


   @Override public ST visitPrint(MainGramParser.PrintContext ctx) {
      ST res = stg.getInstanceOf("print");
      res.add("stat", visit(ctx.expr()));
      //res.add("type", ctx.expr().eType.name());
      res.add("expr",ctx.expr().varName);
      return res;
   }

   @Override public ST visitImportDimensionFile(MainGramParser.ImportDimensionFileContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitDeclaration(MainGramParser.DeclarationContext ctx) {
      ST res = stg.getInstanceOf("decl");
      for(TerminalNode t: ctx.idList().ID())
      {
         String id = t.getText();
         Symbol s = MainGramParser.symbolTable.get(id);
         s.setVarName(newVar());
         res.add("type", s.type().getPrimType());
         res.add("var",s.varName());
     }
      return res;
   }

   @Override public ST visitDecAssign(MainGramParser.DecAssignContext ctx) {
      
      ST res = stg.getInstanceOf("decl");
      for(TerminalNode t: ctx.declaration().idList().ID())
      {
         String id = t.getText();
         Symbol s = MainGramParser.symbolTable.get(id);
         s.setVarName(newVar());
         res.add("stat", visit(ctx.expr()));
         res.add("type", s.type().getPrimType());
         res.add("var",s.varName());
         res.add("value",ctx.expr().varName);
      }
      return res;
   }

   @Override public ST visitAssign(MainGramParser.AssignContext ctx) {
      ST res = stg.getInstanceOf("assign");
      for(TerminalNode t: ctx.idList().ID())
      {
         String id = t.getText();
         Symbol s = MainGramParser.symbolTable.get(id);
         res.add("stat", visit(ctx.expr()).render());
         res.add("var", s.varName());
         res.add("value", ctx.expr().varName);
        
      }
      return res;
   }
/*
   @Override public ST visitIdList(MainGramParser.IdListContext ctx) {
      return visitChildren(ctx);
   }
*/
   @Override public ST visitConditionalstat(MainGramParser.ConditionalstatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitConditional(MainGramParser.ConditionalContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitElseif(MainGramParser.ElseifContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitForCond(MainGramParser.ForCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitWhileCond(MainGramParser.WhileCondContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitInput(MainGramParser.InputContext ctx) {
    return visitChildren(ctx);
   }

   @Override public ST visitIncrement(MainGramParser.IncrementContext ctx) {
      ST res = stg.getInstanceOf("inc");
      String id = ctx.increment().ID().getText();
      res.add("var",MainGramParser.symbolTable.get(id).varName());
      res.add("op",ctx.increment().incre.getText());
      return res;
   }

   /*
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
*/
   @Override public ST visitStrExpr(MainGramParser.StrExprContext ctx) {
      ST res = stg.getInstanceOf("decl");
      ctx.varName = newVar();
      res.add("type", "string");
      res.add("var", ctx.varName);
      res.add("value", ctx.STRING().getText());
      return res;
   }

   @Override public ST visitAddSubExpr(MainGramParser.AddSubExprContext ctx) {
      ctx.varName = newVar();
      return binaryExpression(ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.eType.getPrimType(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);  
    }

   @Override public ST visitEqualComparisonExpr(MainGramParser.EqualComparisonExprContext ctx) {
      
      return visitChildren(ctx);
   }
   @Override public ST  visitAndOrExpr(MainGramParser.AndOrExprContext ctx){
      return visitChildren(ctx);
   }
   @Override public ST visitIntegerExpr(MainGramParser.IntegerExprContext ctx) {
      ST res = stg.getInstanceOf("decl");
      ctx.varName = newVar();
      res.add("type", "integer");
      res.add("var", ctx.varName);
      res.add("value", ctx.INTEGER().getText());
      return res;
   }

   @Override public ST visitRealExpr(MainGramParser.RealExprContext ctx) {
      ST res = stg.getInstanceOf("decl");
      ctx.varName = newVar();
      res.add("type", "real");
      res.add("var", ctx.varName);
      res.add("value", ctx.REAL().getText());
      return res;
   }

   @Override public ST visitBooleanExpr(MainGramParser.BooleanExprContext ctx) {
      ST res = stg.getInstanceOf("decl");
      ctx.varName = newVar();
      res.add("type", "boolean");
      res.add("var", ctx.varName);
      res.add("value", ctx.BOOLEAN().getText());
      return res;
   }

   @Override public ST visitInputExpr(MainGramParser.InputExprContext ctx) {
      ST res = stg.getInstanceOf("input");
      ctx.varName=newVar();
      visit(ctx.input().type());
      res.add("type",ctx.input().type().res.getPrimType());
      res.add("var",ctx.varName);
      res.add("prompt",ctx.input().STRING().getText());
      return res;
      }

   @Override
      public ST visitIncreExpr(MainGramParser.IncreExprContext ctx){   
      ST res = stg.getInstanceOf("inc");
      String id = ctx.increment().ID().getText();
      ctx.varName=MainGramParser.symbolTable.get(id).varName();
      res.add("var",ctx.varName);
      res.add("op",ctx.increment().incre.getText());
      return res;
      }  
   @Override public ST visitParenExpr(MainGramParser.ParenExprContext ctx) {
      ST result = visit(ctx.expr());

      ctx.varName=ctx.expr().varName;
      return result;
   }

   @Override public ST visitGreatLowComparisonExpr(MainGramParser.GreatLowComparisonExprContext ctx) {
      ctx.varName = newVar();
      return binaryExpression(ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.eType.name(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);
   }



   @Override public ST visitNotExpr(MainGramParser.NotExprContext ctx) {
      ST res = stg.getInstanceOf("binaryOperator");
      ctx.varName = newVar();
      res.add("type", ctx.eType.getPrimType());
      res.add("var", ctx.varName);
      visit(ctx.expr());
      res.add("e1", ctx.expr().varName);
      res.add("op", "!");
      return res;
   }

   @Override public ST visitSignExpr(MainGramParser.SignExprContext ctx) {
      ST res = stg.getInstanceOf("binaryOperator");
      ctx.varName = newVar();
      res.add("type", ctx.eType.getPrimType());
      res.add("var", ctx.varName);
      visit(ctx.expr());
      res.add("e1", ctx.expr().varName);
      res.add("op", ctx.sign.getText());
      return res;
   }

   @Override public ST visitMultDivExpr(MainGramParser.MultDivExprContext ctx) {
      ctx.varName = newVar();
      return binaryExpression(ctx, visit(ctx.e1).render(), visit(ctx.e2).render(), ctx.eType.getPrimType(), ctx.varName, ctx.e1.varName, ctx.op.getText(), ctx.e2.varName);  
   }

   @Override public ST visitPowExpr(MainGramParser.PowExprContext ctx) {
      ST res = stg.getInstanceOf("powerExpression");
      ctx.varName = newVar();
      res.add("type", ctx.eType.getPrimType());
      res.add("var", ctx.varName);
      res.add("e1", ctx.e1.varName);
      res.add("e2", ctx.e2.varName);
      res.add("stat", visit(ctx.e1).render());
      res.add("stat", visit(ctx.e2).render());
      return res;
   }

   @Override public ST visitIdExpr(MainGramParser.IdExprContext ctx) {
      ST res = stg.getInstanceOf("decl");
      String id = ctx.ID().getText();
      ctx.varName = newVar();
      res.add("type",ctx.eType.getPrimType());
      res.add("var",ctx.varName);
      res.add("value",MainGramParser.symbolTable.get(id).varName());
      return res;
   }


   @Override public ST visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }



   protected ST binaryExpression(ParserRuleContext ctx, String e1Stats, String e2Stats, String type, String var, String e1Var, String op, String e2Var) {
      ST res = stg.getInstanceOf("binaryExpression");
      res.add("stat", e1Stats);
      res.add("stat", e2Stats);
      res.add("type", type);
      res.add("var", var);
      res.add("e1", e1Var);
      res.add("op", op);
      res.add("e2", e2Var);
      return res;
   }

   public boolean validTarget(String target) {
      File f = new File(target+".stg");

      return (f.exists() && f.isFile() && f.canRead());
   }

   public void setTarget(String target) {
      assert validTarget(target);

      this.target = target;
   }
}

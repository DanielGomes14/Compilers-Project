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
   public Object visitImportDimensionFile(MainGramParser.ImportDimensionFileContext ctx) {
      return visitChildren(ctx);
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
               if (tp.getClass().getName().equals("Dimension")) {
                  if (ctx.expr().unit != null) {
                     String unit = ctx.expr().unit.replace("(", "").replace(")", "");
                     Dimension dim = (Dimension) tp; // dimension is a type
                     if (!dim.checkUnit(unit)) { // check if unit is in the list of units of Dimension
                        ErrorHandling.printError(ctx,
                              "The unit \"" + unit + "\" is not allowed for dimension " + dim.name());
                        validation = false;
                     }
                  } else {
                     ErrorHandling.printError(ctx, "You must indicate the unit for Type \"" + tp + "\" .");
                  }
               }
               if (!tp.conformsTo(ctx.expr().eType)) {
                  ErrorHandling.printError(ctx, "Variable \"" + id + "\" type does not match to expression ");
                  validation = false;
               } else {
                  Symbol sb = new Symbol(id, tp);
                  if (tp.getClass().getName().equals("Dimension")) {
                     sb.setDim(ctx.declaration().type().getText());
                     sb.setUnit(ctx.expr().unit);
                  }
                  sb.setValueDefined();
                  MainGramParser.symbolTable.put(id, sb);
               }
            }
         }

      }
      return validation;
   }

   @Override
   public Object visitAssign(MainGramParser.AssignContext ctx) {
      validation = (boolean) visit(ctx.expr());
      if (validation) {
         for (TerminalNode t : ctx.idList().ID()) {
            String id = t.getText();
            if (!MainGramParser.symbolTable.containsKey(id)) {
               ErrorHandling.printError(ctx, "Variable \"" + id + "\" not defined ");
               validation = false;
            } else {
               Type tp = (Type) visit(ctx.declaration().type());
               if (tp.getClass().getName().equals("Dimension")) {
                  if (ctx.expr().unit != null) {
                     String unit = ctx.expr().unit.replace("(", "").replace(")", "");
                     Dimension dim = (Dimension) tp; // dimension is a type
                     if (dim.checkUnit(unit)) { // check if unit is in the list of units of Dimension
                        ErrorHandling.printError(ctx,
                              "The unit \"" + unit + "\" is not allowed for dimension " + dim.name());
                        validation = false;
                     }
                  } else {
                     ErrorHandling.printError(ctx, "You must indicate the unit for Type \"" + tp + "\" .");
                  }
               }
               if (!tp.conformsTo(ctx.expr().eType)) {
                  ErrorHandling.printError(ctx, "Variable \"" + id + "\" type does not match to expression ");
                  validation = false;
               } else {
                  Symbol sb = new Symbol(id, tp);
                  if (tp.getClass().getName().equals("Dimension")) {
                     sb.setDim(ctx.declaration().type().getText());
                     sb.setUnit(ctx.expr().unit);
                  }
                  sb.setValueDefined();

               }
            }
         }
      }
      return validation;
   }

   @Override
   public Object visitDec(MainGramParser.DecContext ctx) {
      String id = ctx.ID().getText(), typeStr = ctx.type().getText();
      if (MainGramParser.symbolTable.containsKey(id)) {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\" already defined");
         return false;
      } else {
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
   public Object visitConditionalstat(MainGramParser.ConditionalstatContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitConditional(MainGramParser.ConditionalContext ctx) {
      boolean validation = (boolean) visit(ctx.expr());
      if (validation) {
         if (ctx.expr().eType.conformsTo(booleanType)) {
            visit(ctx.trueSL);
            ctx.expr().unit = "NoUnit";
            ctx.expr().eType = "NoDim";
            if (ctx.falseSL != null) {
               // if it enter else / else if statement..
               visit(ctx.falseSL);
            }
         } else {
            ErrorHandling.printError(ctx, " Not a valid conditional expression for an if statement");
            validation = false;
         }
      }
   }

   @Override
   public Object visitElseif(MainGramParser.ElseifContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitForCond(MainGramParser.ForCondContext ctx) {
      boolean validation = (boolean) visit(ctx.assignment());
      if (validation) {
         validation = (boolean) visit(ctx.expr(0)) && (boolean) visit(ctx.expr(1)) && (boolean) visit(ctx.trueSL);
         if (validation) {
            if (!ctx.expr(0).eType.conformsTo(booleanType)) {
               ErrorHandling.printError(ctx, "Not a valid conditional expression in a for statement");
               validation = false;
            }
            if (!ctx.expr(1).eType.isNumeric()) {
               ErrorHandling.printError(ctx, "Increment expression must be a numeric expression");
               validation = false;
            }
         }
      }
      return validation;
   }

   @Override
   public Object visitWhileCond(MainGramParser.WhileCondContext ctx) {
      boolean validation = (boolean) visit(ctx.expr());
      if (validation) {
         if (!ctx.expr.eType.conformsTo(booleanType)) {
            ErrorHandling.printError(ctx, "Not a valid conditional expression in a while statement");
            validation = false;
         }
         visit(ctx.trueSL);
      }
      return validation;
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
   public Object visitIncrement(MainGramParser.IncrementContext ctx) {
      boolean validation=true;
      if(MainGramParser.symbolTable.containsKey(ctx.ID())){
         Symbol s = MainGramParser.symbolTable.get(ctx.ID());
         if(!s.type.isNumeric()){
            ErrorHandling.printError(ctx, "Cannot increment or decrement a not numeric Expression");
            validation=false;
         }
      }
      else{
         validation=false;
      }
      return validation;
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
   public Object visitDimensionType(MainGramParser.DimensionTypeContext ctx) {
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
   public Object visitIncrExpr(MainGramParser.IncrExprContext ctx) {
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
      boolean res=true;
      String id = ctx.ID().getText();
      if(MainGramParser.symbolTable.containsKey(id)){
         Symbol sb = MainGramParser.symbolTable.get(id);
         if(sym.valueDefined()){
            ctx.eType=sb.type();
            ctx.unit=sb.unitName;
            ctx.dim=sb.dimensionName;
         }
         else{
            ErrorHandling.printError(ctx, "Variable \"" + id + "\"  has no value associated");
            res=false;
         }
      }
      else{
         ErrorHandling.printError(ctx, "Variable \"" + id + "\"  not found");
         res=false;
      }
      
      return visitChildren(ctx);
   }

   @Override
   public Object visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }
}

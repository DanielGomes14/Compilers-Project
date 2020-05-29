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
      String var = ctx.ID().getText();
      boolean validation=true;
      if(MainGramParser.symbolTable.containsKey(var)){
         Symbol sb = MainGramParser.symbolTable.get(var);
         if(!sb.type().isNumeric()){
            ErrorHandling.printError(ctx, "Cannot use operator \"" + ctx.incre + "\"for non numeric type");
            validation=false;
         }
         if(!sb.type().conformsTo(integerType)){
            ErrorHandling.printError(ctx, "Cannot use operator \"" + ctx.incre + "\"for type real");
            validation=false;
         }
         if(!sb.valueDefined()){
            ErrorHandling.printError(ctx, "Variable \"" + sb.name() + "\" was not initialized");
            validation=false;
         }
    }
    else{
      ErrorHandling.printError(ctx, "Variable \"" + var+ "\" not defined");
      validation=false;
    }
    return validation;
   }

   @Override
   public Object visitTypeInt(MainGramParser.TypeIntContext ctx) {
      return true;
   }

   @Override
   public Object visitTypeReal(MainGramParser.TypeRealContext ctx) {
      return true;
   }

   @Override
   public Object visitTypeBool(MainGramParser.TypeBoolContext ctx) {
      return true;
   }

   @Override
   public Object visitTypeStr(MainGramParser.TypeStrContext ctx) {
      return true;
   }

   @Override
   public Object visitDimensionType(MainGramParser.DimensionTypeContext ctx) {
      String dimname=ctx.DIMID.getText();
      if(MainGramParser.dimTable.containsKey(dimname)){
         ctx.res=MainGramParser.dimTable.get(dimname);
         return true;
      }
      else{
         ErrorHandling.printError(ctx, "Dimension \"" + dimname + "\" not found!");
      return false;
      }
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
      boolean validation = true;
      ctx.eType=integerType;
      if (ctx.unit()!=null){
            validation=(boolean) visit(ctx.unit());
            if(validation){
               ctx.unit=ctx.unit().getText().replace("(","").replace(")","");

            }
            else{
               ErrorHandling.printError(ctx, "Invalid Unit");
            }
      }
      else{
         ctx.dim="NoDim";
         ctx.unit="NoUnit";
      }

      return validation;
   }

   @Override
   public Object visitRealExpr(MainGramParser.RealExprContext ctx) {
      boolean validation = true;
      ctx.eType=realType;
      if (ctx.unit()!=null){
            validation=(boolean) visit(ctx.unit());
            if(validation){
               ctx.unit=ctx.unit().getText().replace("(","").replace(")","");

            }
            else{
               ErrorHandling.printError(ctx, "Invalid Unit");
            }
      }
      else{
         ctx.dim="NoDim";
         ctx.unit="NoUnit";
      }

      return validation;
   }

   @Override
   public Object visitBooleanExpr(MainGramParser.BooleanExprContext ctx) {
      ctx.eType=booleanType;
      ctx.Dim="noDim";
      ctx.Unit="NoUnit";
      return true;
   }

   @Override
   public Object visitInputExpr(MainGramParser.InputExprContext ctx) {
      return visitChildren(ctx);
   }

   
   @Override
   public Object visitParenExpr(MainGramParser.ParenExprContext ctx) {
      boolean validation = (boolean)visit(ctx.expr());
      if(validation){
         ctx.eType=ctx.expr().eType;
         ctx.dim=ctx.expr().dim;
         ctx.unit=ctx.expr().unit;
      }
      return validation;
   }

   @Override
   public Object visitGreatLowComparisonExpr(MainGramParser.GreatLowComparisonExprContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Object visitNotExpr(MainGramParser.NotExprContext ctx) {
      boolean validation= (boolean) visit(ctx.expr());
      if(validation){
         //check if type of the context of expr() is boolean
            if(ctx.expr().eType.conformsTo(booleanType)){
               ctx.eType=booleanType;
               //boolean expressions dont have a dimension or unit associated
               ctx.dim="NoDim";
               ctx.unit="NoUnit";
            }
            else{
               ErrorHandling.printError(ctx,"Cannot use operator '!' for a non boolean expression");
            }
      }
      return validation;
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
      boolean validation=true;
      String id = ctx.ID().getText();
      if(MainGramParser.symbolTable.containsKey(id)){
         Symbol sb = MainGramParser.symbolTable.get(id);
         if(sb.valueDefined()){
            ctx.eType=sb.type();
            ctx.unit=sb.unitName;
            ctx.dim=sb.dimensionName;
         }
         else{
            ErrorHandling.printError(ctx, "Variable \"" + id + "\"  has no value associated");
            validation=false;
         }
      }
      else{
         ErrorHandling.printError(ctx, "Variable \"" + id + "\"  not found");
         validation=false;
      }
   
      return validation;
   }

   @Override
   public Object visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }
}

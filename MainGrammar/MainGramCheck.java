import java.util.Map;

import jdk.internal.org.xml.sax.ErrorHandler;
public class MainGramCheck extends MainGramBaseVisitor<Object> {
   private boolean validation = true;
   private final RealType realType = new RealType();
   private final IntegerType integerType = new IntegerType();
   private final BooleanType booleanType = new BooleanType();
   private final StringType stringType = new StringType();

   @Override
   public Object visitMain(MainGramParser.MainContext ctx) {
      if(ctx.importDims()!=null){
         validation=(boolean)visit(ctx.importDims());
      }
      if (validation){
         validation = (boolean) visit(ctx.statList());
      }
     
     return validation;
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
                  if (ctx.expr().uni != null) {
                     String unit = ctx.expr().uni.replace("(", "").replace(")", "");
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
      checkInput=false;
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
   public Object visitConditional(MainGramParser.ConditionalContext ctx) {
      validation = (boolean) visit(ctx.expr());
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
      validation = (boolean) visit(ctx.assignment());
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
      validation = (boolean) visit(ctx.expr());
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
      return true;
   }

   @Override
   public Object visitIncrement(MainGramParser.IncrementContext ctx) {
      String var = ctx.ID().getText();
      validation = true;
      if (MainGramParser.symbolTable.containsKey(var)) {
         Symbol sb = MainGramParser.symbolTable.get(var);
         if (!sb.type().isNumeric()) {
            ErrorHandling.printError(ctx, "Cannot use operator \"" + ctx.incre + "\"for non numeric type");
            validation = false;
         }
         if (!sb.type().conformsTo(integerType)) {
            ErrorHandling.printError(ctx, "Cannot use operator \"" + ctx.incre + "\"for type real");
            validation = false;
         }
         if (!sb.valueDefined()) {
            ErrorHandling.printError(ctx, "Variable \"" + sb.name() + "\" was not initialized");
            validation = false;
         }
      } else {
         ErrorHandling.printError(ctx, "Variable \"" + var + "\" not defined");
         validation = false;
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
      String dimname = ctx.DIMID.getText();
      if (MainGramParser.dimTable.containsKey(dimname)) {
         ctx.res = MainGramParser.dimTable.get(dimname);
         return true;
      } else {
         ErrorHandling.printError(ctx, "Dimension \"" + dimname + "\" not found!");
         return false;
      }
   }

   @Override
   public Object visitStrExpr(MainGramParser.StrExprContext ctx) {
      ctx.eType=stringType;
      ctx.dim="NoDim";
      ctx.uni="NoUnit";
      return true;
   }

   @Override
   public Object visitAddSubExpr(MainGramParser.AddSubExprContext ctx) {
      validation=(boolean)visit(ctx.e1) && (boolean) visit(ctx.e2);
      boolean flag=false;
      if(validation){
         if(ctx.e1.eType.conformsTo(booleanType) | ctx.e2.eType.conformsTo(booleanType)){
            ErrorHandling.printError(ctx, "Cannot apply operator\\" + ctx.op + "\" to boolean operand");
            validation=false;
         }
         else{
            if(!ctx.e1.eType.conformsTo(stringType) && !ctx.e2.eType.conformsTo(stringType)){
               if(!ctx.e1.dim.equals(ctx.e2.dim)){
                  ErrorHandling.printError(ctx, "Cannot apply operator\\" + ctx.op + "\" to operands from diferent dimensions");
                  validation=false;
               } 
         
               if(ctx.e1.uni.equals("NoUnit") &&  ctx.e2.uni.equals("NoUnit") ){
                  ctx.uni="NoUnit";
               }
               else if((!ctx.e2.uni.equals("NoUnit") &&  ctx.e1.uni.equals("NoUnit")) ||( !ctx.e1.uni.equals("NoUnit") &&  ctx.e2.uni.equals("NoUnit"))){
                  ErrorHandling.printError(ctx, "Cannot apply operator\\" + ctx.op + "\" for a dimensional operand and a adimensional operand");
                  validation=false;
               }
               else if (!ctx.e1.unit.equals("NoUnit") && !ctx.e2.unit.equals("NoUnit")){
                  for (Dimension  d : MainGramParser.dimTable.keySet()) {
                     if(!d.checkUnit(ctx.e1.uni) && !d.checkUnit(ctx.e2.uni)){
                         ctx.unit=d.getBaseUnit();
                         flag=true;
                     }
                 }
                  if(!flag){
                     ErrorHandling.printError(ctx, "Both operands must have units that were specified for this Dimension");
                     validation = false;
                  }
               }
            }
            else{
               ctx.unit="Void";
            }
            //ainda falta ver dimensao e type do contexto da expressao atuals
         }
      }
      
   }

   @Override
   public Object visitEqualComparisonExpr(MainGramParser.EqualComparisonExprContext ctx) {
      validation = (boolean) visit(ctx.e1) && (boolean)visit(ctx.e2);
      if (validation) {
         if ((ctx.e1.eType.conformsTo(stringType) || ctx.e2.eType.conformsTo(stringType))
               && !ctx.e1.eType.conformsTo(ctx.e2.eType)) {
            ErrorHandling.printError(ctx, "Cannot compare \"" + ctx.e1.eType + "\" with  \"" + ctx.e2.eType);
            validation = false;
         } else if ((ctx.e1.eType.conformsTo(booleanType) || ctx.e2.eType.conformsTo(booleanType))
               && !ctx.e1.eType.conformsTo(ctx.e2.eType)) {
            ErrorHandling.printError(ctx, "Cannot compare \"" + ctx.e1.eType + "\" with  \"" + ctx.e2.eType);
            validation = false;
         }
      }
      ctx.eType = booleanType;
      ctx.uni = "NoUnit";
      ctx.dim = "NoDim";
      return validation;
      ;
   }

   @Override
   public Object visitIntegerExpr(MainGramParser.IntegerExprContext ctx) {
      validation = true;
      ctx.eType = integerType;
      if (ctx.unit() != null) {
         validation = (boolean) visit(ctx.unit());
         if (validation) {
            ctx.unit = ctx.unit().getText().replace("(", "").replace(")", "");

         } else {
            ErrorHandling.printError(ctx, "Invalid Unit");
         }
      } else {
         ctx.dim = "NoDim";
         ctx.uni = "NoUnit";
      }

      return validation;
   }

   @Override
   public Object visitRealExpr(MainGramParser.RealExprContext ctx) {
      validation = true;
      ctx.eType = realType;
      if (ctx.unit() != null) {
         validation = (boolean) visit(ctx.unit());
         if (validation) {
            ctx.uni = ctx.unit().getText().replace("(", "").replace(")", "");

         } else {
            ErrorHandling.printError(ctx, "Invalid Unit");
         }
      } else {
         ctx.dim = "NoDim";
         ctx.uni = "NoUnit";
      }

      return validation;
   }

   @Override
   public Object visitBooleanExpr(MainGramParser.BooleanExprContext ctx) {
      ctx.eType = booleanType;
      ctx.dim = "noDim";
      ctx.uni = "NoUnit";
      return true;
   }

   @Override
   public Object visitInputExpr(MainGramParser.InputExprContext ctx) {
      validation=(boolean) visit(ctx.type());
      if(validation){
         ctx.eType=ctx.type().res;
         
      }
      return validation;
   }

   @Override
   public Object visitParenExpr(MainGramParser.ParenExprContext ctx) {
      validation = (boolean) visit(ctx.expr());
      if (validation) {
         ctx.eType = ctx.expr().eType;
         ctx.dim = ctx.expr().dim;
         ctx.uni = ctx.expr().unit;
      }
      return validation;
   }

   @Override
   public Object visitGreatLowComparisonExpr(MainGramParser.GreatLowComparisonExprContext ctx) {
      validation = (boolean) visit(ctx.e1) && (boolean) visit(ctx.e2);
      if (validation) {
         if (!(ctx.e1.eType.isNumeric() || ctx.e2.eType.isNumeric())) {
            ErrorHandling.printError(ctx, "Cannot Use operator\"" + ctx.op + "\"for Non Numeric Types of Expressions");
            validation = false;
         }
         // ver depois esta cena para as dimensoes.. verificar?
         ctx.eType = booleanType;
         ctx.dim = "NoDim";
         ctx.uni = "NoUnit";
      }
      return validation;
   }

   @Override
   public Object visitNotExpr(MainGramParser.NotExprContext ctx) {
      validation = (boolean) visit(ctx.expr());
      if (validation) {
         // check if type of the context of expr() is boolean
         if (ctx.expr().eType.conformsTo(booleanType)) {
            ctx.eType = booleanType;
            // boolean expressions dont have a dimension or unit associated
            ctx.dim = "NoDim";
            ctx.uni = "NoUnit";
         } else {
            ErrorHandling.printError(ctx, "Cannot use operator '!' for a non boolean expression");
         }
      }
      return validation;
   }

   @Override
   public Object visitSignExpr(MainGramParser.SignExprContext ctx) {
      validation = (boolean) visit(ctx.e);
      if (validation) {
         if (!ctx.e.eType.isNumeric()) {
            ErrorHandling.printError(ctx,
                  "Cannot Use operator\"" + ctx.sign + "\"for Non Numeric Types of Expressions");
            validation = false;
         }
         ctx.eType = ctx.e.eType;
         ctx.uni = ctx.e.unit;
         ctx.dim = ctx.e.dim;
      }
      return validation;
   }

   @Override
   public Object visitMultDivExpr(MainGramParser.MultDivExprContext ctx) {
      validation = (boolean)visit (ctx.e1) && (boolean) visit(ctx.e2);
      boolean flag=false;
      if(validation){
         if(!ctx.e1.eType.isNumeric()&& ctx.e2.eType.isNumeric()){
            ErrorHandling.printError(ctx, "Cannot apply operator \"" + ctx.op + "\" for non Numeric expressions!" );
            validation=false;
         }
         else{
            if (ctx.e1.unit.equals("NoUnit") && ctx.e2.unit.equals("NoUnit")){
               ctx.uni="NoUnit";
               ctx.dim="NoDim";
            }
            else if(!ctx.e1.unit.equals("NoUnit") && ctx.e2.unit.equals("NoUnit")){
               ctx.uni=ctx.e1.unit;
               ctx.dim=ctx.e1.dim;
            }
            else if (ctx.e1.unit.equals("NoUnit") && !ctx.e2.unit.equals("NoUnit")){
               ctx.uni=ctx.e2.unit;
               ctx.dim=ctx.e2.dim;
            }
            else if(!ctx.e1.unit.equals("Nounit") && !ctx.e2.unit.equals("NoUnit")){
               String op = ctx.op.getText();
               ctx.uni=(ctx.e1.unit + ctx.op + ctx.e2.unit);
            }
            for (Dimension  d : MainGramParser.dimTable.keySet()) {
               if(!d.checkUnit(ctx.uni)){
                  ctx.dim=d.name();
                  flag=true;
               }
           }
           if(!flag) ctx.dim="NoDim";
           if(ctx.e1.eType.conformsTo(realType) !! ctx.e2.eType.conformsTo(realtype)){
              ctx.eType=realType;
           }
           else ctx.eType=integerType;
           

         }
      }
      return validation;
   }

   @Override
   public Object visitPowExpr(MainGramParser.PowExprContext ctx) {
      validation = (boolean) visit(ctx.e1) && visit(ctx.e2);

      if (validation) {
         if (!(ctx.e.eType.isNumeric() && ctx.e.eType.isNumeric())) {
            ErrorHandling.printError(ctx, "Cannot Use pow operation for Non Numeric Types of Expressions");
            validation = false;
         }
         ctx.eType = ctx.e1.eType;
         ctx.uni = ctx.e1.uni;
         ctx.dim = ctx.e1.dim;
      }

      return validation;
   }

   @Override
   public Object visitIdExpr(MainGramParser.IdExprContext ctx) {
      validation = true;
      String id = ctx.ID().getText();
      if (MainGramParser.symbolTable.containsKey(id)) {
         Symbol sb = MainGramParser.symbolTable.get(id);
         if (sb.valueDefined()) {
            ctx.eType = sb.type();
            ctx.uni = sb.unitName;
            ctx.dim = sb.dimensionName;
         } else {
            ErrorHandling.printError(ctx, "Variable \"" + id + "\"  has no value associated");
            validation = false;
         }
      } else {
         ErrorHandling.printError(ctx, "Variable \"" + id + "\"  not found");
         validation = false;
      }

      return validation;
   }

   @Override
   public Object visitUnitCheck(MainGramParser.UnitCheckContext ctx) {
      return true;
   }
}

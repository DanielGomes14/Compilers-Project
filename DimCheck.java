public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitProg(DimensionsParser.ProgContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitStat(DimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = ctx.DIMID().getText();
      if(DimensionsParser.dimTable.containsKey(dimensionName)){
         ErrorHandling.printError(ctx, "Dimension" + dimensionName+ "already defined");
      }
      else {
       String  temp = (String) visit(ctx.type());
       dimTable.put(dimensionName,temp);
      }
      return "";
   }

   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitTypeNormal(DimensionsParser.TypeNormalContext ctx) {
      String datatype = visit(ctx.datatype());
      String unit = visit(ctx.unit());
      return null;
   }

   @Override public Object visitTypeVars(DimensionsParser.TypeVarsContext ctx) {
      
      return visitChildren(ctx);
   }

   @Override public Object visitTypeConversions(DimensionsParser.TypeConversionsContext ctx) {
       if (visit(ctx.datatype() && visit(ctx.conversion()){
          return true;
       }
       else{
         ErrorHandling.printError(ctx, "Conversao invalida");
         return false;
       }
   }


   @Override public Object visitConvCheck(DimensionsParser.ConvCheckContext ctx) {
      try {
         Double d = Double.parseDouble(ctx.DIGIT().getText());
         return Dimension.checkConversion(ctx.ID(0).getText(), ctx.ID(1).getText(), d);
      } catch(ParserError e) {
         
      }
      if(d != null) {
      } else {
         ErrorHandling.printError(ctx, "Digito Inválido!");
      }

   }

   @Override public Object visitDTypeCheck(DimensionsParser.DTypeCheckContext  ctx) {
      if (ctx.tp.equals("real") ||ctx.tp.equals("integer") ) {
         return ctx.tp;
      }
      else {
         ErrorHandling.printError(ctx, "Primitive Type" + ctx.tp + "Not Found!");
         return false;
      }
   }
   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
     String tmp =ctx.getText().replace("(","").replace(")","");
     return tmp;
   }
}





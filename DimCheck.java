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
      }
      return "Cona.";
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
      return visitChildren(ctx);
   }

   @Override public Object visitConvCheck(DimensionsParser.ConvCheckContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDTypeCheck(DimensionsParser.DTypeCheckContext  ctx) {
      if (ctx.tp.equals("Real") ||ctx.tp.equals("Integer") ) {
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
}

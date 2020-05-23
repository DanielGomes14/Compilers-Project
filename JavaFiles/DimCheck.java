public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitProg(DimensionsParser.ProgContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitStat(DimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = ctx.DIMID().getText();
      if(DimensionsParser.symbolTable.containsKey(dimensionName)){
         ErrorHandling.printError(ctx, "Dimension" + dimensionName+ "already defined");
      }
      else {
         String type = (String) visit(ctx.type());
         String[] types = type.split(" ");
         String datatype = types[0];
         String unit = types[1];
         Dimension d = new Dimension(dimensionName, datatype, unit);
         Symbol s = new Symbol(dimensionName, d);
         DimensionParser.symbolTable.put(dimensionName,s);
      }
      return "";
   }

   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitTypeNormal(DimensionsParser.TypeNormalContext ctx) {
      String datatype = visit(ctx.datatype());
      String unit = visit(ctx.unit());
      if(datatype != null) {
         datatype = datatype + " ";
         typefinal = datatype + unit;
      } else {
         ErrorHandling.printError(ctx, "Datatype invalid!");
      }
      return typefinal;
   }

   @Override public Object visitTypeVars(DimensionsParser.TypeVarsContext ctx) {
      String dimensionName1 = ctx.DIMID(0).getText();
      String dimensionName2 = ctx.DIMID(1).getText();
      String unit = (String) visit(ctx.unit());
      if(DimensionsParser.symbolTable.containsKey(dimensionName1) && DimensionsParser.symbolTable.containsKey(dimensionName2) && Dimension.checkUnit(unit)) {
         String datatype = dimensionName1 + ctx.op.getText() + dimensionName2;
         String finaltype = datatype + " " + unit;
      } else {
         ErrorHandling.printError(ctx, "Dimension is not defined!");
      }
      return finaltype;
   }

   @Override public Object visitTypeConversions(DimensionsParser.TypeConversionsContext ctx) {
       if (visit(ctx.datatype()) != null && visit(ctx.conversion()){
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
      } catch(ParseException e) {
         System.out.println("Error in parsing double!");
         e.printStackTrace();
      }
      if( d != null) {
         return Dimension.checkConversion(ctx.ID(0).getText(), ctx.ID(1).getText(), d);
      } else {
         ErrorHandling.printError(ctx, "Digito Inválido!");
      }

   }

   @Override public Object visitDTypeCheck(DimensionsParser.DTypeCheckContext  ctx) {
      if (ctx.tp.getText().equals("real") ||ctx.tp.getText()equals("integer") ) {
         return ctx.tp;
      }
      else {
         ErrorHandling.printError(ctx, "Primitive Type" + ctx.tp + "Not Found!");
         return null;
      }
   }
   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
     String tmp =ctx.getText().replace("(","").replace(")","");
     return tmp;
   }
}





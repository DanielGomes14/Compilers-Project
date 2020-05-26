import java.util.ArrayList;
public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitProg(DimensionsParser.ProgContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitStat(DimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = ctx.DIMID().getText();
      String primType;
      String unit;
      Dimension d;
      Symbol s;
      String[] dimensions;
      
      if(ctx.getChildCount() == 2) {

         String datatype = visit(ctx.datatype());
         String unit = visit(ctx.unit());

         if(datatype==null || unit==null){
            ErrorHandling.printError(ctx, "The declaration was invalid");
         }
         else {

            

            // DimensionsParser.dimTable.containsKey(dimensionName1)
         }



      } else {
         if ( ctx.getChildCount() == 3) {
            
         } else {
            ErrorHandling.printError(ctx, "Not allowed to make conversions!");
         }
      }
         
      return "";
   }

   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {//conversion 

      if(ctx.datatype()!=null){
         ErrorHandling.printError(ctx, "Impossivel fazer essa conversao!");
      }
      else if(ctx.DIMID(0)!=null){
         ErrorHandling.printError(ctx, "Impossivel fazer essa conversao!");
      }
      else{
         //String s = ctx.ID(0).getText() + "=" + ctx.DIGIT().getText() + ctx.op + ctx.ID(1).getText();

         String conv = visit(ctx.conversion());
         String[] sepequal = conv.split("=");
         String[] sepmult = sepequal[1].split("*");
         String[] sepdiv = sepequal[1].split("\\");
         Dimension dim;
         String unitName;
         String primtype;
         if(sepmult.length==2){
               try{
                  dim.checkConversion(sepequal[0],sepmult[1],Double.parseDouble(sepmult[0]));
                  if(Dimensions.dimTable.containsKey(sepdiv[1])){
                     primtype=Dimensions.dimTable.getValue(sepdiv[1]).getPrimType();
                     unitName=Dimensions.dimTable.getValue(sepdiv[1]).getUnits();

                  }
               }
               catch(Exception e){
                  ErrorHandling.printError(ctx, "Valor de conversao invalido!");
               }

            }
         else if(sepdiv.length==2){
            try{
               if(Dimensions.dimTable.containsKey(sepdiv[1])){
                  if(Dimensions.dimTable.containsKey(sepdiv[1])){
                     primtype=Dimensions.dimTable.getValue(sepdiv[1]).getPrimType();
                     unitName=Dimensions.dimTable.getValue(sepdiv[1]).getUnits();

                  }
               }
                  dim.checkConversion(sepequal[0],sepdiv[1],1/Double.parseDouble(sepdiv[0]));
            }
            catch(Exception e){
               ErrorHandling.printError(ctx, "Valor de conversao invalido!");
            }
         }
         else{
            ErrorHandling.printError(ctx, "Operacao errada na conversao!");
         }
         dim = new Dimension(unitName,primtype,sepequal[0]);

      }
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
      if(DimensionsParser.dimTable.containsKey(dimensionName1) && DimensionsParser.dimTable.containsKey(dimensionName2)) {
         String datatype = dimensionName1 + ctx.op.getText() + dimensionName2;
      } else {
         ErrorHandling.printError(ctx, "Dimension is not defined!");
      }
      return datatype;
   }

   @Override public Object visitTypeConversions(DimensionsParser.TypeConversionsContext ctx) {
      String conversion = visit(ctx.conversion);
       if (conversion != null){
          return conversion;
       }
       else{
         ErrorHandling.printError(ctx, "Conversao invalida");
         return null;
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
         String s = ctx.ID(0).getText() + "=" + ctx.DIGIT().getText() + ctx.op + ctx.ID(1).getText();
         return s;
      } else {
         ErrorHandling.printError(ctx, "Digito Inválido!");
         return null;
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





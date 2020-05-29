import java.util.ArrayList;
import java.text.ParseException;
public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = (String)ctx.DIMID().getText();
      boolean validation = false;
      Dimension d;
      Symbol s;
      
      if(ctx.type().getChildCount() == 2) {

         String type = (String)visit(ctx.type());
         String[] subtype = type.split(" ");
         String datatype = subtype[0];
         String unit = subtype[1];
         if(unit==null){
            ErrorHandling.printError(ctx, "The declaration or unit was invalid");
            validation = false;
         }
         else {
            if (DimensionsParser.dimTable.containsKey(dimensionName)) {
               ErrorHandling.printError(ctx, "Dimension already exists");
               validation =false;
            } else {

               d = new Dimension(dimensionName, datatype, unit);
               DimensionsParser.dimTable.put(dimensionName, d);
               validation =true;
            } 
         }

      } else if ( ctx.type().getChildCount() == 3){
         String type = (String)visit(ctx.type());
         String[] subtype ;
         char op;
         if(type.contains("/")) {
            subtype = type.split("/");
            op = '/';
         } else {
            subtype = type.split("*");
            op = '*';
         }
         String dimensionName1 = subtype[0];
         String dimensionName2 = subtype[1];

         if( dimensionName1 == null || dimensionName2 == null) {
            ErrorHandling.printError(ctx, "Dimension invalid");
         } else {
            Dimension dimension1 = DimensionsParser.dimTable.get(dimensionName1);
            Dimension dimension2 = DimensionsParser.dimTable.get(dimensionName2);
            d = new Dimension(dimensionName, dimension1.getPrimType() + op + dimension2.getPrimType(), dimension1.getBaseUnit()+ op+ dimension2.getBaseUnit());
            DimensionsParser.dimTable.put(dimensionName, d);
            validation =true;
         }
      } else {
         ErrorHandling.printError(ctx, "Not allowed to make conversions!");
         validation =false;
      }
         
      return validation;
   }

   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {//conversion 
      boolean validation=true;
      if(ctx.getChildCount()!=1){
         ErrorHandling.printError(ctx, "Impossivel fazer essa conversao!");
         validation=false;
      }

      String conv = (String) visit(ctx.type());
      String[] sepequal = conv.split("=");//0-nome da unidade
      String[] sepmult = sepequal[1].split("*");//0-valor 1-base
      String[] sepdiv = sepequal[1].split("/");//0-valor 1-base
      Dimension dim;
      String unitName="";
      String primtype="";
      Double ratio=0.0;
      if(sepmult.length==2){
               ratio = Double.parseDouble(sepmult[0]);
               if(DimensionsParser.dimTable.containsKey(sepdiv[1])){
                  primtype=DimensionsParser.dimTable.get(sepdiv[1]).getPrimType();
                  unitName=DimensionsParser.dimTable.get(sepdiv[1]).getBaseUnit();
               }
         }
      else if(sepdiv.length==2){
            if(DimensionsParser.dimTable.containsKey(sepdiv[1])){
               if(DimensionsParser.dimTable.containsKey(sepdiv[1])){
                  primtype=DimensionsParser.dimTable.get(sepdiv[1]).getPrimType();
                  unitName=DimensionsParser.dimTable.get(sepdiv[1]).getBaseUnit();
               }
            }
               ratio = 1/Double.parseDouble(sepdiv[0]);
      }
      else{
         ErrorHandling.printError(ctx, "Operacao errada na conversao!");
         validation=false;
      }
      dim = new Dimension(unitName,primtype,sepequal[0].trim());
      dim.checkConversion(sepequal[0],unitName,ratio);
      return validation;
   }
   @Override public Object visitTypeNormal(DimensionsParser.TypeNormalContext ctx) {
      String datatype = (String) visit(ctx.datatype());
      String unit = (String) visit(ctx.unit());
      String typefinal="";
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
      String datatype ="";
      if(DimensionsParser.dimTable.containsKey(dimensionName1) && DimensionsParser.dimTable.containsKey(dimensionName2)) {
         datatype = dimensionName1 + ctx.op.getText() + dimensionName2;
      } else {
         ErrorHandling.printError(ctx, "Dimension is not defined!");
      }
      return datatype;
   }

   @Override public Object visitTypeConversions(DimensionsParser.TypeConversionsContext ctx) {
      boolean validation=true;
      String conversion = (String) visit(ctx.conversion());
       if (conversion != null){
          return conversion;
       }
       else{
         ErrorHandling.printError(ctx, "Conversao invalida");
         return null;
       }
   }


   @Override public Object visitConvCheck(DimensionsParser.ConvCheckContext ctx) {
      boolean validation = true;
      Double d=Double.parseDouble(ctx.number().getText());
      if( d != null) {
         String s = ctx.ID(0).getText() + "=" + ctx.number().getText() + ctx.op + ctx.ID(1).getText();
      } else {
         ErrorHandling.printError(ctx, "Digito Inválido!");
         validation=false;
      }

      return validation;
   }
   
   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
     String tmp =ctx.getText().replace("(","").replace(")","");
     return tmp;
   }
}






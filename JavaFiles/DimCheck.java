import java.util.ArrayList;
import java.text.ParseException;
public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = (String)ctx.ID().getText();
      boolean validation = false;
      Dimension d;
      if(!(dimensionName.toLowerCase().equals(dimensionName))){
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
               subtype = type.split("\\/");
               op = '/';
            } else {
               subtype = type.split("\\*");
               op = '*';
            }
            String dimensionName1 = subtype[0];
            String dimensionName2 = subtype[1];
   
            if( dimensionName1 == null || dimensionName2 == null) {
               ErrorHandling.printError(ctx, "Dimension invalid");
            } else {
               Dimension dimension1 = DimensionsParser.dimTable.get(dimensionName1);
               Dimension dimension2 = DimensionsParser.dimTable.get(dimensionName2);
               String primType = dimension1.getPrimType().equals(dimension2.getPrimType()) ? dimension1.getPrimType() : "real";
               d = new Dimension(dimensionName, primType, dimension1.getBaseUnit()+ op+ dimension2.getBaseUnit());
               DimensionsParser.dimTable.put(dimensionName, d);
               validation =true;
            }
         } else {
            ErrorHandling.printError(ctx, "Not allowed to make conversions!");
            validation =false;
         }
      } else {
         ErrorHandling.printError(ctx, "Dimension name has to start with Upper Case");
      }
      
      return validation;
   }

   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {//conversion 
      boolean validation=true;
      char op;
      String conv = (String) visit(ctx.type());
      String[] sepequal = conv.split("=");//0-nome da unidade
      String[] sepoper;//0-valor 1-base
      if(ctx.type().getChildCount()!=1){
         ErrorHandling.printError(ctx, "Impossivel fazer essa conversao!");
         validation=false;
      }
      if(sepequal[1].contains("/")) {
         sepoper = sepequal[1].split("\\/");
         op = '/';
      } else {
         sepoper = sepequal[1].split("\\*");
         op = '*';
      }
      Dimension dim;
      String unitName="";
      String primtype="";
      Double ratio=0.0;
      if(op=='*'){
               ratio = Double.parseDouble(sepoper[0]);
               if(DimensionsParser.dimTable.containsKey(sepoper[1])){
                  primtype=DimensionsParser.dimTable.get(sepoper[1]).getPrimType();
                  unitName=DimensionsParser.dimTable.get(sepoper[1]).getBaseUnit();
               }
      }
      else if(op=='/'){
               if(DimensionsParser.dimTable.containsKey(sepoper[1])){
                  primtype=DimensionsParser.dimTable.get(sepoper[1]).getPrimType();
                  unitName=DimensionsParser.dimTable.get(sepoper[1]).getBaseUnit();
               }
               ratio = 1/Double.parseDouble(sepoper[0]);
      }
      else{
         ErrorHandling.printError(ctx, "Operacao errada na conversao!");
         validation=false;
      }
      dim = new Dimension(unitName,primtype,sepequal[0].trim());
      if(!dim.checkConversion(sepequal[0],unitName,ratio)) {
         ErrorHandling.printError(ctx, "Unidade já existente!");
      }
      return validation;
   }
   @Override public Object visitTypeNormal(DimensionsParser.TypeNormalContext ctx) {
      String datatype = (String) visit(ctx.datatype());
      String unit = (String) visit(ctx.unit());
      String typefinal="";
      boolean validation = true;
      if(datatype != null) {
         datatype = datatype + " ";
         typefinal = datatype + unit;
         return typefinal;
      } else {
         ErrorHandling.printError(ctx, "Datatype invalid!");
         validation =false;
      }
      return validation;
   }

   @Override public Object visitTypeVars(DimensionsParser.TypeVarsContext ctx) {
      String dimensionName1 = ctx.ID(0).getText();
      String dimensionName2 = ctx.ID(1).getText();
      String datatype ="";
      boolean validation = true;
      if (dimensionName1.toLowerCase().equals(dimensionName1) && dimensionName2.toLowerCase().equals(dimensionName2)) {
         ErrorHandling.printError(ctx, "Dimension name has to start with Upper Case");
         validation =false;

      } else {
         if(DimensionsParser.dimTable.containsKey(dimensionName1) && DimensionsParser.dimTable.containsKey(dimensionName2)) {
            datatype = dimensionName1 + ctx.op.getText() + dimensionName2;
            return datatype;
         } else {
            ErrorHandling.printError(ctx, "Dimension is not defined!");
            validation = false;
         }
      }
      return validation;
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
      String d = ctx.number().getText();      
      if( d != null) {
         String s = ctx.ID(0).getText() + "=" + ctx.number().getText() + ctx.op.getText() + ctx.ID(1).getText();
         return s;
      } else {
         ErrorHandling.printError(ctx, "Digito Inválido!");
         validation=false;
      }

      return validation;
   }
   @Override public Object visitDTypeCheck(DimensionsParser.DTypeCheckContext ctx) {
      String datatype = (String)ctx.dt.getText();
      boolean validation = true;
      if(datatype.equals("real") || datatype.equals("integer")) {
         return datatype;
      } else {
         ErrorHandling.printError(ctx, "Datatype insered not valid!");
         validation = false;
      }
      return validation;
    }
   
   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
     String tmp =ctx.getText().replace("(","").replace(")","");
     return tmp;
   }
}
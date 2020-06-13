import java.util.ArrayList;
import java.text.ParseException;
import java.util.Iterator;

import org.xml.sax.ErrorHandler;
public class DimCheck extends DimensionsBaseVisitor<Object> {

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      String dimensionName = ctx.ID().getText();
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
                  ErrorHandling.printError(ctx, "Dimension \"" + dimensionName +  "\"already exists");
                  validation =false;
               } else {
                  d = new Dimension(dimensionName, datatype, unit);
                  DimensionsParser.dimTable.put(dimensionName, d);
                  validation =true;
               } 
            }
         } else if ( ctx.type().getChildCount() == 3){
            String type = (String)visit(ctx.type());
            if(type!=null){
               String[] subtype ;
               char op;
               if(type.contains("/")) {
                  subtype = type.split("/");
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
            }
            else{
               validation =false;
            }
            
         } 

      } else {
         ErrorHandling.printError(ctx, "Dimension name has to start with Upper Case");
      }
      return validation;
   }



   @Override public Object visitAddUn(DimensionsParser.AddUnContext ctx) {//conversion 
      boolean validation=true;
      char op;
      String dmname = ctx.ID().getText();
      String conv = (String) visit(ctx.type());
      String[] sepequal = conv.split("=");//0-nome da unidade
      String[] sepoper;//0-valor 1-base
  
      if(ctx.type().getChildCount()!=1){
         ErrorHandling.printError(ctx, "Cannot make this conversion!");
         validation=false;
      }
      String polynomial = sepequal[1];
      String [] splitpoly = polynomial.split("\\|");  
      String unit =sepequal[0];
      Dimension d =DimensionsParser.dimTable.get(dmname);
      if (d==null){
         ErrorHandling.printError(ctx, "Dimension \"" + dmname + "\" not defined! "  );
         validation=false;
      }
      else{
        validation=d.checkFormula(ctx,splitpoly);
        if(validation){
           d.addConversion(unit, polynomial);
            System.out.println(d.calcConversion(unit, 1));
        }
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
         return null;
      }
      
   }

   @Override public Object visitTypeVars(DimensionsParser.TypeVarsContext ctx) {
      String dimensionName1 = ctx.ID(0).getText();
      String dimensionName2 = ctx.ID(1).getText();
      String datatype ="";
      boolean validation = true;
      if (dimensionName1.toLowerCase().equals(dimensionName1) && dimensionName2.toLowerCase().equals(dimensionName2)) {
         ErrorHandling.printError(ctx, "Dimension name has to start with Upper Case");
         return null;

      } else {
         if(DimensionsParser.dimTable.containsKey(dimensionName1) && DimensionsParser.dimTable.containsKey(dimensionName2)) {
            datatype = dimensionName1 + ctx.op.getText() + dimensionName2;
            return datatype;
         } else {
            ErrorHandling.printError(ctx, "Dimension is not defined!");
            return null;
         }
      }
   }

   @Override public Object visitTypeConversions(DimensionsParser.TypeConversionsContext ctx) {
      return (String) visit(ctx.conversion());
   }
   @Override public Object visitConversion(DimensionsParser.ConversionContext ctx){
      String ID = ctx.ID().getText();
      String polynomial = (String) visit(ctx.polynomial());
      return ID + "=" + polynomial;
   }


   @Override public Object visitPolynomial(DimensionsParser.PolynomialContext ctx){
      String polynomial = "";
      if(ctx.sg != null){
         polynomial += ctx.SIGN(0).getText();
      }
      polynomial += (String) visit(ctx.monomial(0))+ "|";
      int counter=0;
  
      if (ctx.monomial().size() > 1 ){
         Iterator <DimensionsParser.MonomialContext> it  = ctx.monomial().iterator();
         while (it.hasNext()){
            if (counter==0){
               counter++;
               continue;
            }
            if(counter==ctx.monomial().size() - 1){
               polynomial+= ctx.SIGN(0).getText();
               polynomial+= (String) (visit(ctx.monomial(counter)));
               break;
            }
            else{
               polynomial+= ctx.SIGN(counter);
               polynomial+= (String) visit(ctx.monomial(counter)) + "|";
            }
            counter++;
         }
      }
      return polynomial;
   }      

   @Override public Object visitRealMonomial(DimensionsParser.RealMonomialContext ctx){
      String num1 = ctx.number().getText();
      String nome = ctx.ID().getText();
      return num1+"*"+nome;
      
   }
   
   @Override public Object visitConst(DimensionsParser.ConstContext ctx){
      String num = ctx.number().getText();

      return  num;
   }

   /*
   @Override public Object visitConvCheck(DimensionsParser.ConvCheckContext ctx) {
      boolean validation = true;
      String d = ctx.number().getText();     
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
   */
   @Override public Object visitDTypeCheck(DimensionsParser.DTypeCheckContext ctx) {
      String datatype = (String)ctx.dt.getText();
      boolean validation = true;
      if(datatype.equals("real") || datatype.equals("integer")) {
         return datatype;
      } else {
         ErrorHandling.printError(ctx, "Datatype insered not valid!");
         return null;
      }
    }
   
   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
     String tmp =ctx.getText().replace("(","").replace(")","");
     return tmp;
   }
}

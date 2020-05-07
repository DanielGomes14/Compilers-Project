import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

//gestao de erros nas metricas

public class DimIntepreter extends DimensionsBaseVisitor<Object> {
   
   @Override public Object visitProg(DimensionsParser.ProgContext ctx) {
      
      return true;
   }

   @Override public Object visitStat(DimensionsParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDeclar(DimensionsParser.DeclarContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitTypeNormal(DimensionsParser.TypeNormalContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitTypeVars(DimensionsParser.TypeVarsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitDatatype(DimensionsParser.DatatypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Object visitUnitCheck(DimensionsParser.UnitCheckContext ctx) {
      return visitChildren(ctx);
   }
}

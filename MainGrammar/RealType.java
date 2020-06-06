public class RealType extends Type {
   public RealType() {
      super("real");
   }

   public boolean isNumeric() {
      return true;
   }
   @Override
   public boolean conformsTo(Type other) {
       if (other.name().equals("integer")) {
           return true;
       }
       return name.equals(other.name());
   }
}


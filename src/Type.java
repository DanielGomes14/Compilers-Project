
public abstract class Type
{
   protected Type(String name) {
      assert name != null;
      this.name = name;
   }

   public String name() {
      return name;
   }

   public boolean conformsTo(Type other) {
      return name.equals(other.name());
   }

   public boolean isNumeric() {
      return false;
   }

   public String getPrimType( ){
     return name;
   }

   @Override
   public String toString()
   {
      return name;
   }
   
   protected final String name;
}

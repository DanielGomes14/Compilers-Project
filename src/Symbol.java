
public  class Symbol {
   protected final String name;
   protected final Type type;
   protected Value value;
   protected boolean valueDefined;
   protected String varName;
   protected String dimensionName;
   protected String unitName;
   public Symbol(String name, Type type) {
      assert name != null;
      assert type != null;

      this.name = name;
      this.type = type;
      this.dimensionName = "noDim";
      this.unitName = "noUnit";
   }

   public void setValue(Value value) {
      assert value != null;

      this.value = value;
   }

   public String name(){
      return name;
   }

   public void setVarName(String varName) {
      assert varName != null;

      this.varName = varName;
   }
   public void setDim(String dimName){
      this.dimensionName = dimName;
   }

   public void setUnit(String unitName){
      this.unitName = unitName;
   }

   public String varName(){
      return varName;
   }

   public Type type(){
      return type;
   }

   public void setValueDefined(){
      valueDefined = true;
   }

   public boolean valueDefined(){
      return valueDefined;
   }

   public Value value(){
      assert valueDefined();

      return value;
   }
   public String toString(){
     return "Symbol" + this.name + "," + this.type;
   }


}


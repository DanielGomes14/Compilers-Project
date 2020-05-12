import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Dimension extends Type{
	/*
	name is the Dimension name, like Length for example
	unit corresponds to the  the initial unit that was associated with the dimension
	primtype corresponds to the primitive type of data associated with this dimension 
	*/
	private String primtype;
	private List <String> units = new ArrayList<String>(); //the units of the Dimension
	private Map<String,Double> conversions = new HashMap <String,Double>();//In case it's added more units, we need to convert them to the first unit added;
	public Dimension(String name){
		super(name);
	}
	public Dimension(String name, String primtype, String unit){
		 super(name);
		 assert primtype!=null;
		 assert unit!=null;
		 this.primtype=primtype;
		 this.units.add(unit);
		 this.conversions.put(unit,-1.0); //quick way to find out the first unit added, so that we can convert every unit to the first created
	}
	
	@Override
	public boolean isNumeric(){
		return (this.primtype.equals("integer") || this.primtype.equals("real"));
	}

	@Override
	public boolean conformsTo(Type other){
	//first check if "this" and "other" are Dimensions
		if(!other.getClass().getName().equals(this.getClass().getName())){ //Dimension Distance/Time/...
			String otherprimtype=other.name(); //real ou int
			//"Dist" / "Tempo"
			
			return ( super.conformsTo(other) || this.primtype.equals(otherprimtype) || this.primtype.equals(other.name) || this.name.equals(otherprimtype));
		}
		return false;
	}


	public boolean checkConversion(String unit, String convertedunit ,double valuetoconvert){
		if(conversions.get(unit)==null)return false;
		if(conversions.get(unit)==-1){
			if(checkUnit(convertedunit)){
				units.add(convertedunit);
			}
			conversions.put(convertedunit,valuetoconvert);
			return true;
		} 
		else{
			double finalval= valuetoconvert* conversions.get(unit);
			if(checkUnit(convertedunit)){
				units.add(convertedunit);
			}
			conversions.put(convertedunit,finalval);
			return true;
		}
	}

	public boolean checkUnit(String unit){
		for(int i = 0; i< units.size();i++){
			if(units.get(i).equals(unit)) return false;
		}
		return true;
	}
	
	public List<String> getUnits(){
		return this.units;
	}
	public String getPrimType(){
		return this.primtype;
	}
}



package exSnack12;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	//생성자 2개
	Snack() {
	}
	Snack( String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
	}
	
	public void setKind(String kind) {
		this.kind = kind;
		
	}
	String getKind() {
		return kind;
	}
	public void setName(String name) {
        this.name = name;    	
    }
    String getName() {
    	return name;
    }
    public void setflavor(String flavor) {
    	this.flavor = flavor;
    }
    String getflavor() {
    	return flavor;
    }
    public void setNumOf(int NumOF) {
    	this.numOf = numOf;
    }
    int numof() {
    	return numOf;
    }
    public void setPrice(int price) {
    	this.price = price;
    }
    public String information() {
    	return kind + ", " + name + ", " + flavor + ", " + numOf + ", " + price;
    }
    
}

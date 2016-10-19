package javatraining;

public class Fish extends Animal{
private String gills;
private String swims;
public String getGills() {
	return gills;
}
public void setGills(String gills) {
	this.gills = gills;
}
public String getSwims() {
	return swims;
}
public void setSwims(String swims) {
	this.swims = swims;
}
public Fish(String legs, String teeth, String tounge, String gills, String swims) {
	super(legs, teeth, tounge);
	this.gills = gills;
	this.swims = swims;
}

public void swim (){
	System.out.println("fish swims in the water ");
	
}

public void eat(){
	System.out.println(" minguthadii anthe, it does'nt chew  ");
}

}

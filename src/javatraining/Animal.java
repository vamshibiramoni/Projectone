package javatraining;

public class Animal {

	private String legs;
	private String teeth;
	private String tounge;
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getTeeth() {
		return teeth;
	}
	public void setTeeth(String teeth) {
		this.teeth = teeth;
	}
	public String getTounge() {
		return tounge;
	}
	public void setTounge(String tounge) {
		this.tounge = tounge;
	}
	public Animal(String legs, String teeth, String tounge) {
		super();
		this.legs = legs;
		this.teeth = teeth;
		this.tounge = tounge;
	}
	
	public void locomotion(){
		
		System.out.println("animal moves with the help of their locomotary organ");
		
		
	}
	public void eat(){
		
	}
}

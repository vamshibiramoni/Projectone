package javatraining;

public class Dog extends Animal{
	private String barks;
	private String runs;
	public String getBarks() {
		return barks;
	}
	public void setBarks(String barks) {
		this.barks = barks;
	}
	public String getRuns() {
		return runs;
	}
	public void setRuns(String runs) {
		this.runs = runs;
	}
	public Dog(String legs, String teeth, String tounge, String barks, String runs) {
		super(legs, teeth, tounge);
		this.barks = barks;
		this.runs = runs;
	}
	 
	public void walk(){
		System.out.println("Dog moves with the help of legs");
		
	}
	public void eat(){
		System.out.println("Dog Chews");
	}

}

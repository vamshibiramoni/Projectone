package javatraining;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal= new Animal("4Legs", "sharpteeth","veylong" );
animal.locomotion();
Dog dog= new Dog("hello ", "sharp teeth", "long tongue", "strongly barks", "very fast");
dog.walk();
dog.locomotion();
Animal a = new Dog("hello ", "sharp teeth", "long tongue", "strongly barks", "very fast");

a.eat();
	} 

}

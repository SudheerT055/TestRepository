package Inheritance;

public class Dog extends Animal{
	int noofLegs = 4;
	static String getBreed() {
		return breed;
	}
	private static void rabis() {
		System.out.println("Dog has rabis");
	}
	protected static void sleep() {
		System.out.println("Dog is sleeping");
	}
	public static void main(String[] args) {
		rabis();
		running();
		System.out.println(getBreed());
		sleep();
		age = 100;
	
	}
	

}

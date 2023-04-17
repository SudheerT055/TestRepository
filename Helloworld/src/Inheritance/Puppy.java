package Inheritance;

public class Puppy extends Dog{
	private static String breed;
	public static void main(String[] args) {
		sleep();
		running();
		breed = getBreed();
		System.out.println(breed);
	}

}

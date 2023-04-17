package com.javalearn.Obj;

public class Animals {

	int age ;
	String breed;
	int noOfLegs;
	boolean isMamal;
	
	Animals(int age, String breed){
		this.age = age;
		this.breed = breed;
		System.out.println("Animals : Constructor  " + age +"  "+breed);
	}
	Animals(){
		System.out.println("Animals : Constructor  ");
	}
	
	void eat(String eat) {
		System.out.println("Animal: eat() = "+ eat);
	}
	protected void sleep() {
		System.out.println("Animal: sleep()");
	}
	protected void bark() {
		System.out.println("Animal: bark()");
	}
	protected void play() {
		System.out.println("Animal: play()");
	}
	protected void protect() {
		System.out.println("Animal: protect()");
	}
	protected int getAge() {
		return age;
	}
	protected String getBread() {
		return breed;
	}
	
}

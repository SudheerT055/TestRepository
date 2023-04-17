package com.javalearn.Obj;

public class Tiger {
	public static void main(String [] args) {
		Animals tiger = new Animals();
		tiger.age = 30;
		tiger.breed = "Bengal";
		tiger.eat("Meat");
		String bread = tiger.getBread();
		int age = tiger.getAge();
		System.out.println(bread);
		System.out.println(age);
	}
}

package com.java.training;

public class MyClass {

	public static void main(String[] args) {

		// execute
		MyClass obj = new MyClass(10,20);
	}
	public MyClass() {
	 System.out.println("Myclass");
	}
	public MyClass(int num) {
		this();
		 System.out.println("Myclass with 1 int");
	}
	public MyClass(int num1, int num2) {
		this(50);
		 System.out.println("Myclass with 2 int");
	}

}

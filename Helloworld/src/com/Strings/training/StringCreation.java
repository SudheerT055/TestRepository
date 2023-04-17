package com.Strings.training;

public class StringCreation {

	public static void main(String[] args) {
		stringWithoutNew();
//		stringWithNew();
	}
	
	public static void stringWithoutNew() {
		String a = "Saag";
		String b = "Tech";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println("--------------------------------------");
		String c = "Saag";
		System.out.println(a.equals(c));
		System.out.println(a==c);
	}
	public static void stringWithNew() {
		String a = new String("Saag");
		String b = new String("Tech");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println("--------------------------------------");
		String c = new String("Saag");
		System.out.println(a.equals(c));
		System.out.println(a==c);
	}

}

package com.java.training;

public class MethodOverloading {
	public static void main(String[] args) {
		System.out.println(add(1,2,3,4));
	}
	
	public static int add(int a, int b){
		return a + b;
	}
	public static int add(int a, int b, int c){
		int result = add(a,b);
		return result + c;
	}
	public static int add(int a, int b, int c, int d){
		int result = add(a,b,c);
		return result + d;
	}
}

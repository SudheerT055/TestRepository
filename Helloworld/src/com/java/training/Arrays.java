package com.java.training;

import Inheritance.Animal;

public class Arrays {
	public static void main(String[] args) {
		int a[];
		a = new int[5];
		a[0] = 10; 
		a[1] = 100;
		a[2] = 1000;
		a[3] = 10000;
		a[4] = 100000;
		
		for (int arr: a) {
			System.out.print(arr+ " ");
		}
	}
}

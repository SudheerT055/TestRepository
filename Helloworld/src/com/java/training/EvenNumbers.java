package com.java.training;

public class EvenNumbers {
	public static void main(String[] args) {
		int min = 40;
		int max = 80;
		int total = 0;
		for(;min<max;min++) {
			if(min%2 == 0) {
				total += min;
			}
		}
		System.out.println(total);
	}

}

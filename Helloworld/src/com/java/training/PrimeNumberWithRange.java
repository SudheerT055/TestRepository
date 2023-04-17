package com.java.training;

public class PrimeNumberWithRange {

	public static void main(String[] args) {

		for(int n= 0; n<=150; n++) {
			if(isPrime(n)) {
				System.out.println(n);
			}
		}

	}
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}

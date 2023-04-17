package com.testing;

public class StarProgram {
	public static void main(String[] args) {
		
		for (int i = 20; i> 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for(int i = 2; i<=20; i++) {
			for (int j =0; j< i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}

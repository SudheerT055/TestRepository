package com.testing;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		try (Scanner num = new Scanner(System.in)) {
			System.out.print("Please enter the value:");
			my_Functionality(num.nextInt());
		}
	}

	public static void my_Functionality(int a) {
		for (int i = 4; i <= a; i += 4) {
			System.out.println(i);
		}
	}

}

package com.java.training;

import java.io.IOException;
import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) throws InterruptedException, IOException {
		int age = 1;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		while(age != 0) {
			System.out.println("Please enter your age: ");
			age = scn.nextInt();
			if(age >= 0) {
				System.out.println("input is valid");
				if(age < 12) {
					System.out.println("Child");
				}
				else if (age < 20) {
					System.out.println("Teen");
				}
				else {
					System.out.println("Adult");
				}
			}
			else {
				System.out.println("input is invalid");
			}
		}
	}
}

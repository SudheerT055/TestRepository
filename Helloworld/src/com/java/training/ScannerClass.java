package com.java.training;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		int a = scan.nextInt();
		System.out.println(a);
	}
	}
}

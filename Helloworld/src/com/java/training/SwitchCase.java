package com.java.training;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		while(true) {
		int speed = scn.nextInt();
		if(speed == 100) {
			System.out.println("speed reached 100");
		}
		
		switch(speed) {
		case 100: 
			System.out.println("speed reached 100");
			break;
			}
		}
	
		
		
	}

}

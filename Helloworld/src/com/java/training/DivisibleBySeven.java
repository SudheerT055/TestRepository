package com.java.training;

public class DivisibleBySeven {

	public static void main(String[] args) {

		int min = 150;
		int max = 200;
		int dividant = 7;
		
		while(min < max ) {
			if(min%dividant == 0)
			{
				System.out.println(min);
			}
			min++;
		}
	}

}

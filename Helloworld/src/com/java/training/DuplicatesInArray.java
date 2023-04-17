package com.java.training;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int [] a = {10,20,110,10,20,18,10,87,10,60,10};
		int num = 110;
		int noofDuplicats= duplicatesinArray(a,num);
		System.out.println(noofDuplicats);
	}
	public static int duplicatesinArray(int [] a, int num) {
		int noofDuplicate = 0;
		for(int val:a) {
			if(val == num) {
				noofDuplicate++;
			}
		}
		return noofDuplicate;
	}

}

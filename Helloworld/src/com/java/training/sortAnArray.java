package com.java.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortAnArray {

	public static void main(String[] args) {
		int temp = 0;
		int[] a = {20,98,215,21,1052,50,5,7878,200,15};
//		for(int i =0; i<a.length;i++) {
//			for(int j = i+1; j<a.length; j++) {
//				if(a[i]>a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		String s= Arrays.toString(a);
//		System.out.println(s);
		Arrays.sort(a);
		String s= Arrays.toString(a);
		System.out.println(s);
		
		Arrays.binarySearch(a, 0);
	}

}

package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class Hashset_TreeSet {

	public static void main(String[] args) {
		Set<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(20);
		ts1.add(40);
		ts1.add(50);
		ts1.add(10);
		ts1.add(90);
		ts1.add(100);
		
		System.out.println(ts1);
		
	}
	
}

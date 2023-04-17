package com.collections;

import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedLists {
	public static void main(String[] args) {
		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Sudheer");
		linkedlist.add("Talapadra");
		linkedlist.add("Sudheer");
		linkedlist.add("Bangalore");
		linkedlist.add("India");
		
		System.out.println(linkedlist);
		System.out.println(linkedlist.size());
		System.out.println(linkedlist.contains("Sudheer"));
		System.out.println(linkedlist.indexOf("Bangalore"));
		System.out.println(linkedlist.isEmpty());
		System.out.println(linkedlist.set(1, "T"));
		System.out.println(linkedlist);
		System.out.println(linkedlist.remove(3));
		System.out.println(linkedlist);
		System.out.println(linkedlist.lastIndexOf("Sudheer"));
		
	}

}

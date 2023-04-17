package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MyCollections {


		public static void main(String[] args) {
			treeSetExample();
			iteratingUsingIterator();
			printUniqueCharsFromString();
			setExample();
			arrayListClassConstructors();
			listEx4();
			listSpecificMethod3();
			listSpecificMethod2();
			listSpecificMethod1();
			loopingThroughList();

		}

		public static void treeSetExample() {
			Set<String> ts = new TreeSet<String>();

			ts.add("Testing");
			ts.add("Java");
			ts.add("Automation");
			ts.add("Selenium");

			System.out.println(ts);

			Set<Integer> ts1 = new TreeSet<Integer>();

			ts1.add(500);
			ts1.add(150);
			ts1.add(50);
			ts1.add(600);

			System.out.println(ts1);
		}

		public static void iteratingUsingIterator() {
			Set<String> hs = new HashSet<String>();

			hs.add("Testing");
			hs.add("Java");
			hs.add("Automation");
			hs.add("Selenium");

			Iterator<String> itr = hs.iterator();

			while (itr.hasNext())
				;
			{
				System.out.println(itr.next());
			}
		}

		public static void printUniqueCharsFromString() {

			String s = "Selenium";

			Set<Character> cSet = new HashSet<Character>();

			for (int x = 0; x < s.length(); x++) {

				char c = s.charAt(x);
				cSet.add(c);
			}
			System.out.println(cSet);

		}

		public static void setExample() {
			Set<String> hs = new HashSet<String>();

			/*
			 * String s = "Testing"; String s1 = "Java"; String s2 = "Automation"; String s3
			 * = "Selenium";
			 * 
			 * 
			 * System.out.println(s.hashCode());System.out.println(s1.hashCode());
			 * System.out.println(s2.hashCode());System.out.println(s3.hashCode());
			 * 
			 */

			hs.add("Testing");
			hs.add("Java");
			hs.add("Automation");
			hs.add("Selenium");

			System.out.println(hs.add("Automation"));

			System.out.println(hs);

		}

		public static void arrayListClassConstructors() {
			// Constructors available in ArrayList Class

			List<String> list = new ArrayList<String>(); // By default we can add upto 16 Objects

			List<String> list1 = new ArrayList<String>(5); // Initial Capacity

			List<String> list2 = new ArrayList<String>(list1);
		}

		public static void listEx4() {
			List<String> list = new ArrayList<String>();

			list.add("selenium");
			list.add("java");
			list.add("Automation");
			list.add("selenium");

			System.out.println(list);

			list.add(1, "Testing");
			System.out.println(list);

			list.set(1, "DevOps");
			System.out.println(list);

			list.set(1, "DataBase");
			System.out.println(list);

		}

		public static void listSpecificMethod3() {
			List<Integer> list1 = new ArrayList<Integer>();

			list1.add(500);
			list1.add(150);
			list1.add(600);

			System.out.println(list1);

			list1.add(1, 250);

			System.out.println(list1);

			list1.add(1, 250);

			list1.add(1, 250);

			System.out.println(list1);

		}

		public static void listSpecificMethod2() {

			List<String> list = new ArrayList<String>();

			list.add("selenium");
			list.add("java");
			list.add("Automation");
			list.add("selenium");

			System.out.println(list);

			System.out.println(list.indexOf("selenium"));

			System.out.println(list.lastIndexOf("selenium"));

			// list.rmove("java"); removes the object from collection

			list.remove(1);

			System.out.println(list);

			list.set(1, "CoreJava");

			System.out.println(list);

		}

		public static void listSpecificMethod1() {

			List<String> list = new ArrayList<String>();

			list.add("selenium");
			list.add("java");
			list.add("Automation");
			list.add("selenium");

			list.add(1, "Testing");
			System.out.println(list);

			List<String> list2 = new ArrayList<String>();

			list2.add("Development");
			list2.add("Devops");

			// list.addAll(2,list2);
			// System.out.println(list);

			list.addAll(2, list2);
			System.out.println(list);

		}

		public static void loopingThroughList() {
			List<String> list = new ArrayList<String>();

			list.add("selenium");
			list.add("java");
			list.add("Automation");
			list.add("selenium");

			// System.out.println(list.get(1));

			// Iterating over a list collection

			for (int x = 0; x < list.size(); x++) {
				System.out.println(list.get(x));
			}

			System.out.println("====================");

			for (String m : list) {
				System.out.println(m);
			}
		}
	}

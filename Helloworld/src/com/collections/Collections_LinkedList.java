package com.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Collections_LinkedList {

		public static void main(String[] args) {
			
		
			/*
				ArrayList<String> al = new ArrayList<String>();
				
				al.add("Ramu");
				al.add("Bangalore");
				al.add("Karnataka");
				
				
				System.out.println(al);
				
				Collections.sort(al);
				
				System.out.println(al);
			*/
			
			/*
			Mobile m1 = new Mobile(10000.50, "Black", 4);
			Mobile m2 = new Mobile(15000.50, "White", 6);
			Mobile m3 = new Mobile(8000.70, "Red", 5);
			
			
			ArrayList<Mobile> al = new ArrayList<Mobile>();
			
			al.add(m1);
			al.add(m2);
			al.add(m3);
			
			System.out.println(al);
			
			Collections.sort(al);
			
			
			System.out.println(al);
			*/
			
			Laptop lap1 = new Laptop(10000.50, "Black", 4);
			Laptop lap2 = new Laptop(15000.50, "White", 6);
			Laptop lap3 = new Laptop(8000.70, "Red", 5);
			
			ArrayList<Laptop> al = new ArrayList<Laptop>();
			
			al.add(lap1);
			al.add(lap2);
			al.add(lap3);
			
			System.out.println(al);
			
			Comparator<Laptop> comp = new Comparator<Laptop>() {

			
				public int compare(Laptop o1, Laptop o2) {
					if(o1.ram < o2.ram)
						return -1;
					else
						return 1;
				}
				
				
			};
			
			Collections.sort(al, comp);
			System.out.println(al);
			
			


		}
		
		public static void findOccurancesOfCharInString()
		{

			String s = "GlassesAndClasses";
			
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			
			for(int x=0; x<s.length();x++)
			{
				
				char c = s.charAt(x);		
				
				
				if(hm.containsKey(c))
				{
					Integer val = hm.get(c);
					val++;
					hm.put(c, val);
				}
				else
				{
					hm.put(c, 1);
				}
			}
			
			System.out.println(hm);
			
		}
		
		public  static void hashMapIntegerAndArrayList()
		{
		ArrayList<String> rList = new ArrayList<String>();
			
			rList.add("Ramu");
			rList.add("Bangalore");
			rList.add("Karnataka");
			
			ArrayList<String> sList = new ArrayList<String>();
			sList.add("Shamu");
			sList.add("Hyderabad");
			sList.add("Telangana");
			
			ArrayList<String> pList = new ArrayList<String>();
			pList.add("Peter");
			pList.add("Kochi");
			pList.add("Kerala");
			
			
			
			HashMap<Integer,ArrayList<String>> hm = new HashMap<Integer,ArrayList<String>>();
		
			hm.put(101, rList);	
			hm.put(102, sList);
			hm.put(103, pList);
			
		System.out.println(hm);
		}
		
		public static void hashMapEx3()
		{
			Map<Integer,String> hm = new HashMap<Integer,String>();
			
			hm.put(101, "Ramu");
			hm.put(102, "Shankar");
			hm.put(103, "Peter");
			hm.put(104, "Ahmed");
			
			System.out.println(hm.containsKey(104));
			
			System.out.println(hm.containsValue("Ramu"));
		}
		
		public static void hashMapEx2()
		{
			Map<Integer,String> hm = new HashMap<Integer,String>();
			
			hm.put(101, "Ramu");
			hm.put(102, "Shankar");
			hm.put(103, "Peter");
			hm.put(104, "Ahmed");
			
			Set<Integer> hmSet = hm.keySet();
			
			// To fetch all the keys of a hashMap as Set
			System.out.println(hmSet);
			
			// To fetch all the values of a HashMap
			Collection<String> hmCol = hm.values();
			
			System.out.println(hmCol);
		}
		
		public static void hashMapEx1()
		{

			Map<Integer,String> hm = new HashMap<Integer,String>();
			
			hm.put(101, "Ramu");
			hm.put(102, "Shankar");
			hm.put(103, "Peter");
			hm.put(104, "Ahmed");
			
			System.out.println(hm);		
			
			System.out.println(hm.get(103));
		}

	}
}

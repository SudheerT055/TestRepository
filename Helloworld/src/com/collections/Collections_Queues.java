package com.collections;

	import java.util.Iterator;
	import java.util.PriorityQueue;
	import java.util.Queue;
	import java.util.Set;
	import java.util.TreeSet;

	public class Collections_Queues {

		public static void main(String[] args) {		
					
			
			priorityQueueMobile();
			
		}
		
		public static void priorityQueueEx2()
		{

			Queue<String> pq = new PriorityQueue<String>();
			
			pq.add("abcd");
			pq.add("1234");
			pq.add("23bc");
			pq.add("zzxx");
			pq.add("abxy");
			
			System.out.println(pq);
			
			while(!pq.isEmpty()) {
				System.out.println(pq.poll());
			}
			
		}
		
		public static void priorityQueueMobile()
		{
			Mobile m1 = new Mobile(10000.50, "Black", 4);
			Mobile m2 = new Mobile(15000.50, "White", 6);
			Mobile m3 = new Mobile(8000.70, "Red", 5);
			
			
			Queue<Mobile> pq = new PriorityQueue<Mobile>();
				pq.add(m3);
				pq.add(m1);
				pq.add(m2);
				
					
			System.out.println(pq);
			
			System.out.println(pq.poll());
			System.out.println(pq.poll());
			System.out.println(pq.poll());
			
		}
		
		public static void priorityQueueEx()
		{

			Queue<String> pq = new PriorityQueue<String>();
			
					
			pq.add("Automation");
			pq.add("Testing");
			pq.add("Selenium");
			
			System.out.println(pq);
			
			while(!pq.isEmpty()) {
				System.out.println(pq.poll());
			}
			
			
			//System.out.println(pq.peek());
			
			
			// Iterating over a queue using iterator
			Iterator<String> itr = pq.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			
			//System.out.println(pq.poll());
			//System.out.println(pq.poll());
			//System.out.println(pq.poll());
			

		}
		
		public static void comparableobileObjectsEx2()
		{
			Mobile m1 = new Mobile(10000.50, "Black", 4);
			Mobile m2 = new Mobile(15000.50, "White", 6);
			Mobile m3 = new Mobile(8000.70, "Red", 5);
			
			Set<Mobile> mSet = new TreeSet<Mobile>();
			
			mSet.add(m1);
			mSet.add(m3);
			mSet.add(m2);
			
			System.out.println(mSet);
			
			
		}
		
		public static void comparableInterfaceCompareToMethod()
		{
			Dog d = new Dog();		
			d.age = 10;
			d.colour = "white";	
			
			Dog d1 = new Dog();		
			d1.age = 5;
			d1.colour = "Black";
			
			Dog d2 = new Dog();		
			d2.age = 15;
			d2.colour = "Gray";
			
			
		  Set<Dog> dSet = new TreeSet<Dog>();
		  
		  dSet.add(d); 
		  dSet.add(d1);
		  dSet.add(d2);
		
		 System.out.println(dSet);
			 
			
		}
		
		
		public static void treeSetEx1()
		{
	// Tree Set can only store Objects which are comparable to each other
	// i.e. the class must implement Comparable Interface..
			
			
			Set ts = new TreeSet();
			
				ts.add("Java");
				ts.add("Selenium");
				ts.add(500);
			
			
			System.out.println(ts);
		}

	}
}

package com.collections;
import  java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<>();
		System.out.println(q.poll());
		q.offer("Apple");
		q.offer("Aaappleiuiuu");
		q.offer("orange");
		q.offer("grape");
		q.offer("pear");
		System.out.println(q); //automaticaly print alphabetic order
		
		System.out.println("List add to a queue");
		List<String> l=List.of("artrt","aaaaasasas");
		q.addAll(l);
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove(0)); //it is not possible
		System.out.println(q);
		System.out.println(q.remove("grape")); //it is possible
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		q.add("Orange");
		q.add("Apple");
		q.add("Grape");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		q.offer("Orange");
		q.offer("Apple");
		q.offer("Grape");
		q.offer("Avacado");
		System.out.println(q);
		
		
		
		

	}

}

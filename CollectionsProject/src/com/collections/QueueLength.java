package com.collections;
import java.util.*;


public class QueueLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new PriorityQueue<>(new QueueLengthRunner());
		q.offer("Orange");
		q.offer("Pinepple");
		q.offer("Apple");
		q.offer("Grapes");
		q.offer("plum");
		q.offer("Avacado");
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		

	}

}

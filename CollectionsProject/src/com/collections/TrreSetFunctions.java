package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TrreSetFunctions {
	public static void main(String[] args) {
		Set<Integer> s=Set.of(34,23,55,12,10,8,9,45,67,37);
		TreeSet<Integer> ts=new TreeSet<>(s);
		System.out.println(ts.floor(12));
		System.out.println(ts.lower(12));
		System.out.println(ts.ceiling(12));
		System.out.println(ts.higher(12));
		System.out.println(ts.subSet(8,55));
		System.out.println(ts.subSet(10,true,55,true));
		System.out.println(ts.subSet(10,false,55,false));
		System.out.println(ts.headSet(45));
		System.out.println(ts.tailSet(45));
	}

}

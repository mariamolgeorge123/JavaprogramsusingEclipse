package com.collections;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> s=Set.of(1,4,2,8,9);
		Set<Integer> s1=new HashSet(s);
		s1.add(100);
		System.out.println(s1);
		
		
		System.out.println("HAshSet %%%%%%%%%%%%%%%%%%%%%%%%");
		Set<Integer> setdata=new HashSet<>();
		setdata.add(45);
		setdata.add(405);
		setdata.add(25);
		setdata.add(35);
		setdata.add(305);
		System.out.println(setdata);
		
		
		
		System.out.println("LinkedHashSet %%%%%%%%%%%%%%%%%%%%%%%%");
		Set<Integer> setdata1=new LinkedHashSet<>();
		setdata1.add(45);
		setdata1.add(405);
		setdata1.add(25);
		setdata1.add(35);
		setdata1.add(305);
		System.out.println(setdata1);
		
		
		System.out.println("TreeSet %%%%%%%%%%%%%%%%%%%%%%%%");
		Set<Integer> setdata21=new TreeSet<>();
		setdata21.add(45);
		setdata21.add(405);
		setdata21.add(25);
		setdata21.add(35);
		setdata21.add(305);
		System.out.println(setdata21);
		
		
		List<Character> ch=List.of('G','C','B','A','E','D','A','D','E','A');
		Set<Character> sl=new TreeSet(ch);
		System.out.println(sl);
		
		
	}

}

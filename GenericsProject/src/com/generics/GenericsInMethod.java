package com.generics;
import java.util.*;

public class GenericsInMethod {
	static <x> x doublemethod(x value)
	{
		return value;
	}
	static <x extends List> void duplicate(x list)
	{
		list.addAll(list);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(doublemethod(1));
		System.out.println(doublemethod("ahshags"));
		System.out.println(doublemethod(2.00f));
		String val=doublemethod("ahshags");
		ArrayList l1=new ArrayList(List.of(1,2,3,4,4,4,9));	
		ArrayList<Integer> lt=doublemethod(l1);
		System.out.println(lt);
		System.out.println(val);
		long V=doublemethod(2l);
		System.out.println(V);
		
		ArrayList ll=new ArrayList(List.of(1,2,3,4));		
		duplicate(ll);
		System.out.println(ll);
		
		
		
		

	}

}

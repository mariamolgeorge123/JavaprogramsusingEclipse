package com.data.project;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
String ss;
ArrayList<String> a=new ArrayList<String>();
ArrayList<Integer> ar=new ArrayList<Integer>();
String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListBasics al=new ArrayListBasics();
		al.list();
		al.arrayToArrayList("str",1,2,3,4,5);
		al.maxof();
		al.min();
		al.size();
		
		System.out.println(al);
		al.add(100);
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
	}

	private void remove(int i) {
		// TODO Auto-generated method stub
		ar.remove(i);
		
	}

	private void add(int i) {
		// TODO Auto-generated method stub
		ar.add(i);
		
	}

	private void size() {
		// TODO Auto-generated method stub
		System.out.println("size"+a.size());
	}

	private void min() {
		// TODO Auto-generated method stub
		System.out.println("max"+Collections.max(a));
		
	}

	private void maxof() {
		// TODO Auto-generated method stub
		System.out.println(Collections.min(a));
		
	}

	private void list() {
		// TODO Auto-generated method stub
		
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		System.out.println(a);
		a.remove("orange");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.add("apple");
		a.add("orange");
		System.out.println(a.size());
	//	a.arrayToArrayList("str",1,2,3,4,5);
		
		
	}

	private void arrayToArrayList(String s,int... data)

	{
		name=s;
		for(int i:data)
		{
			ar.add(i);
		}
		System.out.println(ar);
	}
	public String toString()
	{
		return name+" "+ar;
	}
	

}

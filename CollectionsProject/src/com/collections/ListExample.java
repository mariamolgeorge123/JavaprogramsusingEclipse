package com.collections;

import java.util.List;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {
	public static void main(String[] args) {
		List<String> l=List.of("apple","orange","kiwi"); 
		System.out.println(l);
		//l.add("peach"); //list created by using List.of() method which is immutable.so we can't add any data.
		//l.remove(0);//list created by using List.of() method which is immutable.so we can't remove any data.
		//System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.indexOf("kiwi"));
		System.out.println(l.isEmpty());
		System.out.println(l.contains("kiwi"));
		
		List<String> fruits=new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("Apple");
		fruits.add("Avacado");
		System.out.println(fruits);
		fruits.remove(0);
		System.out.println(fruits);
		fruits.remove("orange");
		System.out.println(fruits);
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("kiwi");
		System.out.println(fruits);
		System.out.println(fruits.get(0));
		for(String l1:fruits)
		{
			System.out.println(l1);
		}
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.indexOf("Apple"));
		System.out.println(fruits.contains("Apple"));
		
		List<String> LinkedAnimals=new LinkedList<String>();
		LinkedAnimals.add("goat");
		LinkedAnimals.add("cat");
		LinkedAnimals.add("Dog");
		LinkedAnimals.add("cow");
		LinkedAnimals.add("lion");
		System.out.println(LinkedAnimals);
		LinkedAnimals.remove(0);
		System.out.println(LinkedAnimals);
		LinkedAnimals.remove("cow");
		System.out.println(LinkedAnimals);
		System.out.println(LinkedAnimals.isEmpty());
		System.out.println(LinkedAnimals.indexOf("lion"));
		System.out.println(LinkedAnimals.contains("lion"));
		for(String i:LinkedAnimals)
		{
			System.out.println(i);
		}
		System.out.println(LinkedAnimals.get(0));
		
		
		List<String> AnimalVector=new Vector<String>();
		AnimalVector.add("cat");
		AnimalVector.add("cow");
		AnimalVector.add("lion");
		AnimalVector.add("rabit");
		AnimalVector.add("dog");
		AnimalVector.add("tiger");
		System.out.println(AnimalVector);
		AnimalVector.remove(0);
		System.out.println(AnimalVector);
		AnimalVector.remove("cow");
		System.out.println(AnimalVector);
		System.out.println(AnimalVector.isEmpty());
		System.out.println(AnimalVector.indexOf("lion"));
		System.out.println(AnimalVector.contains("lion"));
		System.out.println(AnimalVector.get(0));
		for(String j:AnimalVector)
		{
			System.out.println(j);
		}
		
		ArrayList<String> fruitsdata1=new ArrayList<String>(fruits); //Convert list to Arraylist
		System.out.println(fruitsdata1);
		System.out.println(fruitsdata1.getClass().getSimpleName());
		System.out.println(("*********"));
		
		List<String> fruitsdata=new ArrayList<String>(fruits); //Convert list to Arraylist
		System.out.println(fruitsdata);
		System.out.println(fruitsdata.getClass().getSimpleName());
	;
		
		List<String> fruitslinked=new LinkedList<String>(fruits); //Convert list to Arraylist
		System.out.println(fruitslinked);
		
		List<String> fruitsvector=new Vector<String>(fruits); //Convert list to Arraylist
		System.out.println(fruitsvector);
		
		
		System.out.println("\n\n\n===============================================");
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("parrot");
		a1.add("peacock");
		a1.add("hen");
		System.out.println("Arraylist a1:"+a1);
		a1.add(1,"sparrow");
		System.out.println("Modified Arraylist a1:"+a1);
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("1");
		a2.add("2");
		a2.add("3");
		System.out.println("Arraylist a2:"+a2);
		
		List<String> a3=List.of("table","chair","glass","fridge");
		System.out.println("list a3:"+a3);
		
		System.out.println("Merge a1 and a2"); //merge two array list
		a1.addAll(a2);
		System.out.println("merge two arralist"+a1);
		
		System.out.println("Merge a2 and a3"); //merge on arraylist and list
		a2.addAll(a3);
		System.out.println("merge one arralist and one list"+a2);
		
		//change value in a particular position
		a2.set(2,"aaaaaa");
		System.out.println(a2);
		
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i));
		}
		
	ArrayList<String> a4=new ArrayList<String>();
	a4.add("adsasd");
	a4.add("jhjhh");
	a4.add("hdshdsjd");
	
	Iterator i=a4.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("''''''''''''''''''");
	Iterator i1=a4.iterator();
	System.out.println(i1.next());
	System.out.println("''''''''''''''''''");
	
	
	ArrayList<Integer> num=new ArrayList<Integer>();
	for(int i11=0;i11<20;i11++)
	{
		num.add(i11);
	}
	
	Iterator<Integer> numiter=num.iterator();
	while(numiter.hasNext())
	{
		Integer j=numiter.next();
		if(j<10)
		{
			numiter.remove();
		}
		
	}
	System.out.println(num);
	System.out.println("-------------------------------------");
	List<String> l1=List.of("cat","rat","mat","haha","hagt");
	List<String> l2=new ArrayList<>(l1);
	for(String ij:l2)
	{
		if(ij.endsWith("at"))
		{
			System.out.println(ij);
		}
	}
		
	System.out.println("-------we can't use this type of for loop when we remove any data from a list.in this case use iterator------------------------------");
//	List<String> l23=List.of("cat","rat","mat","haha","hagt");
//	List<String> l24=new ArrayList<>(l23);
//	for(String ij1:l24)
//	{
//		if(ij1.endsWith("at"))
//		{
//			l24.remove(ij1);
//		}
//		System.out.println(l24);
//	}
	
	
	System.out.println("*************************");

	List<String> listdata=List.of("cat","rat","mat","haha","hagt");
	List<String> data=new ArrayList<>(listdata);
	Iterator<String> iterdata=data.iterator();
	while(iterdata.hasNext())
	{
		String data1=iterdata.next();
		
		if(data1.endsWith("at"))
		{
			iterdata.remove();
		}
	}
	
	System.out.println(data);
	
	List<Integer> intdata=List.of(101,201,301,401);
	ArrayList<Integer> ALintdata=new ArrayList<>(intdata);
	//ALintdata.remove(101); it is not possible
	ALintdata.remove(Integer.valueOf(101));
	System.out.println(ALintdata);
	
	System.out.println("*************************");
	
	List<Integer> listdata1=List.of(401,302,109,119,190,32,034);
	List<Integer> dataint1=new ArrayList<>(listdata1);
	Collections.sort(dataint1);
	System.out.println(dataint1);
	
	
	
	
		
}	
		
	}
	


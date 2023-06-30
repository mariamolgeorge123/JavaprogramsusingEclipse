package com.generics;
import java.util.*;

public class MyCustomList<T> {
	ArrayList<T> al=new ArrayList<>();

	public void addElement(T s1) {
		// TODO Auto-generated method stub
		al.add(s1);
		
	}

	public void removeElement(T string) {
		// TODO Auto-generated method stub
		al.remove(string);
		
	}
	public String toString() {
		return al.toString();
		
	}



	public T getData(int i) {
		// TODO Auto-generated method stub
		return al.get(i);
	}

}

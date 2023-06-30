package com.generics;
import java.util.*;

public class GenericsAdvanced<T extends Number> {
	ArrayList<T> l=new ArrayList<>();

	public void addElament(T i) {
		// TODO Auto-generated method stub
		
		i.floatValue();
		i.byteValue();
		l.add(i);
		
	}

	public void remove(T i) {
		// TODO Auto-generated method stub
		l.remove(i);
		
	}
	public String toString() {
		return l.toString();
		
	}

	
}

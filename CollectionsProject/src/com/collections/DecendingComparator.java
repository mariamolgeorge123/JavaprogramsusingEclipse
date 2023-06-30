package com.collections;

import java.util.Comparator;

public class DecendingComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getId(),o1.getId());
	}

	

}

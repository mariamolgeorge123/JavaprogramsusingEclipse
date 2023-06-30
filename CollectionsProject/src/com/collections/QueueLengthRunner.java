package com.collections;

import java.util.Comparator;

public class QueueLengthRunner implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(),o2.length());
	}

	

}

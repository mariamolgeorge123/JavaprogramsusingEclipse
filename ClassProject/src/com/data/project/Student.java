package com.data.project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;

public class Student {
String name;
int[] ar=new int[5];
int numofmarks,sum;
BigDecimal Avg,len;
	
	public Student(String str, int[] arr) {
		// TODO Auto-generated constructor stub
		name=str;
		ar=arr;
	}

	public int numberOfMarks() {
		// TODO Auto-generated method stub
		numofmarks=ar.length;
		return numofmarks;
	}

	public int maxOfMarks() {
		// TODO Auto-generated method stub
	Arrays.sort(ar);
		
	return ar[ar.length-1];
//		int min=0;
//		for(int i:ar)
//		{
//			if(i<min)
//			{
//				min=i;
//			}
//		}
//		return min;
	}

	public int sumOfMarks() {
		// TODO Auto-generated method stub
		for (int i:ar) {
			sum+=i;
			
		}
		return sum;
	}

	public int minOfMarks() {
		// TODO Auto-generated method stub
		return ar[0];
		
//		int max=Intger.MAX_VALUE;
//		for(int i:ar)
//		{
//			if(i>max)
//			{
//				max=i;
//			}
//		}
//		return max;
//		
	}

	public BigDecimal averageOfMarks() {
		// TODO Auto-generated method stub
		len=new BigDecimal(ar.length);
		Avg=(new BigDecimal(sum).divide(len));
		return Avg;
	}

}

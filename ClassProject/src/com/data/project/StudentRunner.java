package com.data.project;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,45,11,34,46};
		Student s=new Student("anu",arr);
		int number=s.numberOfMarks();
		int sum=s.sumOfMarks();
		int max=s.maxOfMarks();
		int min=s.minOfMarks();
		BigDecimal avge=s.averageOfMarks();
System.out.println("number of marks"+number);
System.out.println("sum of marks"+sum);
System.out.println("max of marks"+max);
System.out.println("min of marks"+min);
System.out.println("average f marks"+avge);
	}

}

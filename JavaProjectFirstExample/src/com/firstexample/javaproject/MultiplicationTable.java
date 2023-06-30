package com.firstexample.javaproject;
import java.util.*;

public class MultiplicationTable {
	public void Multiplication(int n)
	{
		for(int i=1;i<=10;i++)
		{
//			System.out.printf("%d*%d=%d",i,n,i*n).println();
			System.out.println(i+"*"+n+"="+i*n);
		}
	}
	public static void main(String[] args) {
		MultiplicationTable m=new MultiplicationTable();
		System.out.println("Which Multiplication Table do you want");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		m.Multiplication(number);
		// TODO Auto-generated method stub

	}

}

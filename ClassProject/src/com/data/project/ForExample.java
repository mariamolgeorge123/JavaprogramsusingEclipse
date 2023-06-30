package com.data.project;

import java.util.Scanner;

public class ForExample {
int num1,sum=0,num2;
	public ForExample(int num) {
		
		// TODO Auto-generated constructor stub
		num1=num;
		
	}
	public void isPrime() {
		// TODO Auto-generated method stub
		if(num1==2 || num1==1)
		{
			System.out.println("it's a prime number");
		}
		else
		{
		for(int i=2;i<num1-1;i++)
		{
			if(num1%2==0)
			{
				System.out.println("it's not a prime number");
				break;
			}
			else
			{
				System.out.println("it's a prime number");
				break;
			}
		}
		}
		
	}
	public void sum() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=num1;i++)
		{
			 sum+=i;
		}
		System.out.println("Sum of Number from 1 to "+num1+"is"+sum);
	}
	public void divisorsum() {
		// TODO Auto-generated method stub
		sum=0;
		for(int i=2;i<=num1-1;i++)
		{
			 if(num1%i==0)
			 {
				 sum+=i;
			 }
		}
		System.out.println("Sum of Number Divisor of "+num1+"is"+sum);
		
		
	}
	public void trianglepattern(int rows) {
		// TODO Auto-generated method stub
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.printf(j+" ");
			 }
			System.out.println("\n");
		}
		
	}
	public void cube() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		do {
			
		System.out.println("Enter a Number");
		 num2=sc.nextInt();
		
			int cube=num2*num2*num2;
			System.out.println("Cube"+cube);
	
			
		}while(num2>0);
		System.out.println("Thank you!");
	}

}

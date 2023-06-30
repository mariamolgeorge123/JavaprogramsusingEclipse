package com.data.project;
import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number1");
			int num1=sc.nextInt();	
			System.out.println("Enter Number2");
			int num2=sc.nextInt();	
			
			System.out.println("1-Add");
			System.out.println("2-Substraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			
			System.out.println("Enter Your Choice?");
			int ch=sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Addition Result:\t"+(num1+num2));
						break;
				case 2: System.out.println("Subtraction Result:\t"+(num1-num2));
						break;
				case 3: System.out.println("Multiplication Result:\t"+(num1*num2));
						break;
				case 4: System.out.println("Division Result:\t"+(num1/num2));
						break;
				default: System.out.println("Invalid Choice");
						break;
			}
			
	}

}

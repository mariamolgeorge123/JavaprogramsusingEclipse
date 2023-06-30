package com.data.project;
import java.util.Scanner;

public class ForExampleRunner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		ForExample f=new ForExample(num);
		f.isPrime();
		f.sum();
		f.divisorsum();
		System.out.println("Enter Number of rows do you want?");
		int rows=sc.nextInt();
		f.trianglepattern(rows);
		
		f.cube();

	}

	
}

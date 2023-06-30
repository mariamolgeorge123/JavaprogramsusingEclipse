package com.data.project;

import java.util.Scanner;

public class StringExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringExercise se=new StringExercise();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String s=sc.nextLine();
		se.word(s);
		
	}

}

package com.data.project;

public class TypeExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypeExercise t=new TypeExercise(2,3);
		System.out.println("Add"+t.add());
		System.out.println("Multiplication"+t.multiply());
		t.doubleData();
		System.out.println(t.getNumber1());
		System.out.println(t.getNumber2());
	}

}

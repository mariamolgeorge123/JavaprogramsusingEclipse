package com.data.project;

public class VariableArgument {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableArgument v=new VariableArgument();
		v.sum(3,4);
		v.sum(3,4,5,3,7);
		v.sum(3,4,3);
		v.sum(3,4,1,2);
		v.printArray("data",1,2,3);
		v.printArray("data",1,2,4,5,3);

	}

	private void printArray(String s, int... i  ) {
		// TODO Auto-generated method stub
		System.out.println(s);
		for(int j:i)
		{
			System.out.println(j);
		}
		
	}

	private void sum(int... i) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int j:i)
		{
			sum+=j;
		}
		System.out.println("sum is"+sum);
	}

}

package com.generics;
import java.util.List;
import java.util.ArrayList;

public class WildCard {
	public static double sumofLists(List<? extends Number> number) //upper bound
	{
		double sum=0.0;
		for(Number s:number)
		{
			sum+=s.doubleValue();
		}
		return sum;
		
	}
	public static void addtoList(List<? super Number> number) //lower bound
	{
		number.add(1);
		number.add(1.0);
		number.add(2l);
		number.add(1.98f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList<Number>();
		addtoList(l);
		System.out.println(l);
		System.out.println(sumofLists(List.of(1,2,3,4)));
		System.out.println(sumofLists(List.of(1.1,2.2,3.3,4.4)));
		System.out.println(sumofLists(List.of(1l,2l,3l,4l)));
	
	}

}

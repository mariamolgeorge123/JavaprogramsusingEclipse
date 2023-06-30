package com.functional.programming;

import java.util.List;

public class FunctinalProgramming {
	public static void printwithFP(List<String> l)
	{
		l.stream().forEach(
				element->System.out.println("element"+element)
				);
	}
	public static void printwithFPwithFilter(List<String> listdata)
	{
		listdata.stream().
		filter(
				element->element.endsWith("at")
				).
		forEach(
						element->System.out.println("elements are :"+element)
				);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=List.of("apple","bat","sat","jit","jat");
		printwithFP(list);
		printwithFPwithFilter(list);
		
		
		

	}

}

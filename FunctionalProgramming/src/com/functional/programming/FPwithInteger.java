package com.functional.programming;

import java.util.List;

public class FPwithInteger {
	
	public static void printwithFP(List<Integer> l1)
	{
		l1.stream().forEach(
				element->System.out.println(element)
				);
		
	}
	private static void sumwithFp(List<Integer> l2) {

		int sum=l2.stream().reduce(
				0,(number1,number2)->number1+number2
				); 
		System.out.println("sum is :"+sum);
		
	}
	private static void evenwithFp(List<Integer> i) {
		i.stream().filter(element->element%2==0).forEach(
				
				element->System.out.println("even"+ element)
				);
	}
	private static void sumofEven(List<Integer> li) {
		// TODO Auto-generated method stub
		int sumofEven=li.stream().filter(x->x%2==0).reduce(0,(num1,num2)->num1+num2);
		System.out.println("sum of eveen"+sumofEven);
		
		
	}
	private static void sortofNumbers(List<Integer> l)
	{
		l.stream().sorted().forEach(
				element->System.out.println(element) );
	}
	private static void distinctsortofNumbers(List<Integer> l)
	{
		l.stream().sorted().distinct().forEach(
				element->System.out.println(element) );
	}
	private static void distinctSquares(List<Integer> li)
	{
		li.stream().distinct().map(x->x *x).forEach(element->System.out.println(element));
	}
	private static void distinctSortedSquares(List<Integer> li)
	{
		li.stream().distinct().sorted().map(x->x*x).forEach(x->System.out.println(x));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(3,2,4,5,2,4,3,1);
		printwithFP(li);
		sumwithFp(li);
		evenwithFp(li);
		sumofEven(li);
		sortofNumbers(li);
		System.out.println("***********************");
		distinctsortofNumbers(li);
		System.out.println("***********************");
		distinctSquares(li);
		System.out.println("***********************");
		distinctSortedSquares(li);

	}
	
	
	


}

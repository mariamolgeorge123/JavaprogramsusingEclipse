package com.data.project;

public class DayMonthRunner {
public static void main(String[] args) {
	DayMonth d=new DayMonth();
	boolean b=d.isWeekDay(5);
	if(b==true)
	{
		System.out.println("weekday");
	}
	else
	{
		System.out.println("weekend");
	}
	d.nameMonth(4);
	d.nameDay(3);
	boolean c=d.isEven(2);
	if(c==true)
	{
		System.out.println("Even");
	}
	else
	{
		System.out.println("Odd");
	}
	
}
}

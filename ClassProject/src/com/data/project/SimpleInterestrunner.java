package com.data.project;

import java.math.BigDecimal;

public class SimpleInterestrunner {
	public static void main(String[] args) {
		SimpleInterest si=new SimpleInterest("4500.00","7.5");
		BigDecimal TotalValue=si.calculate(5);
		System.out.println("total"+TotalValue);
		
	}

}

package com.data.project;

import java.math.BigDecimal;

public class SimpleInterest {
BigDecimal pr,r;
	public SimpleInterest(String principal,String rate) {
		// TODO Auto-generated constructor stub
		pr=new BigDecimal(principal);
		r=new BigDecimal(rate);
	}
	public BigDecimal calculate(int i) {
		// TODO Auto-generated method stub
//		BigDecimal m1=pr.multiply(r);
//		BigDecimal m2=m1.multiply(new BigDecimal(i));
//		BigDecimal total=pr.add(m2);
		BigDecimal total=pr.add(pr.multiply(r.multiply(new BigDecimal(i))));
		return total;
	}

}

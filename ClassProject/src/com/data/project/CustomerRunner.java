package com.data.project;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("Avarppadath","Thirumarady","686662");
		Customer c=new Customer("Maria",add);
		//System.out.println(c);
		
		Address add1=new Address("TCS","Canada","M4P1Y3");
		c.setWorkaddress(add1);
		System.out.println(c);

	}

}

package com.data.project;

public class Customer {
private String name1;
private Address homeaddress;
private Address workaddress;
	
	public Customer(String name, Address add) {
		// TODO Auto-generated constructor stub
		name1=name;
		homeaddress=add;
	}
	public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}
	public Address getWorkaddress() {
		return workaddress;
	}
	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}
	public String toString()
	{
		return String.format("Name-[%s] homeaddress-[%s] workaddress-[%s]",name1,homeaddress,workaddress);
	}

}

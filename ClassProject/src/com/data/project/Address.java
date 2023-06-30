package com.data.project;

public class Address {
	private String homename;
	private String city;
	private String zip;
	public Address(String homename, String city, String zip) {
		super();
		this.homename = homename;
		this.city = city;
		this.zip = zip;
	}
	public String toString()
	{
		return String.format("%s,%s,%s",homename,city,zip);
	}

}

package com.inheri;

public class StudentInheri extends Person{
	private String college;
	private int year;
	public StudentInheri(String name)
	{
		super(name);
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}

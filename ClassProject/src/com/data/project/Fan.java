package com.data.project;

import java.util.*;

public class Fan {

	private String manufacture;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;
	
	

	public Fan(String manfact, double r, String clr) {
		// TODO Auto-generated constructor stub
		manufacture=manfact;
		radius=r;
		color=clr;
	}
	public String toString()
	{
		return String.format("Manufacturer- %s,Radius- %f,Color- %s,isOn- %b,speed- %d",manufacture,radius,color,isOn,speed);
	}
	public void switchOff() {
		// TODO Auto-generated method stub
		isOn=false;
		
	}
	public void switchOn() {
		// TODO Auto-generated method stub
		isOn=true;
		
	}
	public void speed(byte i) {
		// TODO Auto-generated method stub
		speed=i;
		
	}

}

package com.data.project;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan f=new Fan("Manufacturer 1",0.234,"Green");
		System.out.println(f);
		f.switchOn();
		//f.switchOff();
		f.speed((byte)4);
		System.out.println(f);

	}

}

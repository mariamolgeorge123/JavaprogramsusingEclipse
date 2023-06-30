package com.data.project;

public class MotorBike {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed>0)
		{
		this.speed = speed;
		}
	}

	public void increaseSpeed(int i) {
		// TODO Auto-generated method stub
		this.speed=this.speed+i;
		
	}

	public void decreaseSpeed(int i) {
		// TODO Auto-generated method stub
//		if(this.speed-i>0)
//		{
//			
//		this.speed=this.speed-i;
//		}
		this.setSpeed(this.speed-i);
	}
	
//
//	public void breakdata() {
//		// TODO Auto-generated method stub
//		System.out.println("break applied !");
//	}


//public void setSpeed(int speed) {
//	// TODO Auto-generated method stub
//	this. speed=speed;
//	
//}
//public void getSpeed() {
//	// TODO Auto-generated method stub
//	System.out.println("speed is"+speed);
//}
	
}

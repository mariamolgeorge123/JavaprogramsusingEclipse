package com.data.project;
import com.data.project.MotorBike;
public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorBike honda =new MotorBike();
		MotorBike activa =new MotorBike();
//		b.breakdata();
		honda.setSpeed(200);
		honda.increaseSpeed(100);
		System.out.println(honda.getSpeed());
		honda.decreaseSpeed(50);
		System.out.println(honda.getSpeed());
		
		System.out.println("-----------------");
		
		
		activa.setSpeed(100);
		activa.increaseSpeed(100);
		System.out.println(activa.getSpeed());
		activa.decreaseSpeed(50);
		System.out.println(activa.getSpeed());
		
//		honda.setSpeed(a+100);
//		System.out.println("increatsed speed - honda"+honda.getSpeed());
//		
//		
//		//activa.setSpeed(300);
//		int a1=honda.getSpeed();
//		int a2=a1+100;
//		activa.setSpeed(a2);
//		System.out.println("increatsed speed - activa"+activa.getSpeed());
	}

}

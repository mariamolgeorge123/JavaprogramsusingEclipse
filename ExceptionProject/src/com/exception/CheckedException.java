package com.exception;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			someotherexception();
//			Thread.sleep(100);
//		}catch(InterruptedException e)
//		{
//			e.printStackTrace();
//		}
		
		//someotherexception(); //it is checked exception.so it is put either in try catch or use throws
		someotherexception2();

	}

	private static void someotherexception() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(100);
		
	}

	private static void someotherexception2() throws RuntimeException {
		// TODO Auto-generated method stub
	
		
	}
}

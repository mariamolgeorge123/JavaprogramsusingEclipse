package com.thread;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("thread1 started");
		for(int i=100;i<200;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread1 ended");
	}
}
public class ThreadExampleExtends  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//task1
		System.out.println("start 1st task");
		Thread1 t=new Thread1();
		t.start();
		
		
		//task2
		System.out.println("start 2nd task");
		for(int i=200;i<300;i++)
		{
			System.out.println(i);
		}
		System.out.println("end 2nd task");
		//task3
		System.out.println("start 3rd task");
		for(int i=300;i<400;i++)
		{
			System.out.println(i);
		}
		System.out.println("end 3rd task");
		
		

	}

}

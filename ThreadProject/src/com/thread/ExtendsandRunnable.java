package com.thread;

class threaddata extends Thread 
{
	public void run()
	{
		System.out.println("1st thread Started");
		for(int i=100;i<200;i++)
		{
			System.out.println(i);
			
		}
		System.out.println("1st thread end");
	}
}
class Thread2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread2 Started");
		for(int i=200;i<300;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread2 end");
	}
	
}

public class ExtendsandRunnable {
	public static void main(String[] args) throws InterruptedException {
		//task1
		System.out.println("task1 starts");
		threaddata t=new threaddata();
		t.setPriority(5);
		t.start();
		t.join();  //if we use join task2 and task3 start only after task1 is completed.
		//task2
		System.out.println("task2 starts");
		Thread2 t2=new Thread2();
		Thread t3=new Thread(t2);
		t3.setPriority(10);
		t3.start();
		//t3.wait();  //thred is waiting
		//Thread.sleep(10000); //need to wait for some time
		Thread.yield(); //request for give up cpu
		
	
		
		//task3
		System.out.println("task3Started");
		for(int i=300;i<400;i++)
		{
			System.out.println(i);
		}
		System.out.println("task3 end");
		
		
	}

}

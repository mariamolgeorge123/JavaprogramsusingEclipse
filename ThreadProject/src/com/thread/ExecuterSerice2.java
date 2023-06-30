package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread
{
	private int number;
	Task(int number)
	{
		this.number=number;
	}
	public void run()
	{
		System.out.println("Task"+number+"started");
		for(int i=number;i<number+100;i++)
		{
			System.out.println(i);
		}
		System.out.println("Task"+number+"ended");
	}
}
public class ExecuterSerice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Task t=new Task(100);
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(new Task(1));
		es.execute(new Task(2));
		es.execute(new Task(3));
		es.execute(new Task(4));
		es.execute(new Task(5));
		es.execute(new Task(6));
		es.execute(new Task(7));
		es.execute(new Task(8));
		es.shutdown();

	}

}

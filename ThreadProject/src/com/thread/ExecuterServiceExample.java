package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {
	public static void main(String[] args) {
	//	ExecutorService es=Executors.newSingleThreadExecutor();
		ExecutorService es1=Executors.newFixedThreadPool(2);
		es1.execute(new threaddata());
		es1.execute(new Thread(new Thread2()));
		System.out.println("Task3 kicked of");
		System.out.println("task3Started");
		for(int i=300;i<400;i++)
		{
			System.out.println(i);
		}
		System.out.println("task3 end");
		es1.shutdown();
	}

}

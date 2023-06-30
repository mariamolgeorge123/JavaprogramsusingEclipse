package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class callableclass implements Callable<String>
{

	private String str;
	public callableclass(String str)
	{
		this.str=str;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hii");
		Thread.sleep(1000); 
		return "Hello"+str;
	}
	
}
public class CalableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<String> data=es.submit(new callableclass("Ammu"));
	    System.out.println("print callable method");	
	    String message=data.get();
	    System.out.println(message);
         System.out.println("completed");	
	es.shutdown();
	}

}

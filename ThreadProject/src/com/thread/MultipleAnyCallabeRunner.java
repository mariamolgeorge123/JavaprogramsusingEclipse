package com.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallabeRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(3);
		List<callableclass> list=List.of(new callableclass("Appu"),new callableclass("Anju"),new callableclass("Annu"));
		String result=es.invokeAny(list);
		System.out.println(result);
				
	}

}

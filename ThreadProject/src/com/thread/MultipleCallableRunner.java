package com.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es=Executors.newFixedThreadPool(1);
		//ExecutorService es=Executors.newFixedThreadPool(3);//fast
		List<callableclass> list=List.of(new callableclass("Appu"),new callableclass("Anju"),new callableclass("Annu"));
		List<Future<String>> data=es.invokeAll(list);
		for(Future<String> datas:data) 
		{
			System.out.println(datas.get());
		}
	}

}

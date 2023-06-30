package com.data.project;

public class BookRunner {
	public static void main(String[] args) {
		Book book=new Book("1234","OOPS through java","gosling");
		Review r=new Review("1","verygood",4);
		Review r1=new Review("2","Excellent",5);
		book.addreview(r);
		book.addreview(r1);
		System.out.println(book);
		
	}



}

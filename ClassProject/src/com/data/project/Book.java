package com.data.project;

import java.util.ArrayList;

public class Book {
	private String Id;
	private String BookName;
	private String Author;
	private ArrayList<Review> review=new ArrayList<>();
//	private Review[] review=new Review[2];
	

	

public Book(String id, String bookname, String author) {
	this.Id=id;
	this.BookName=bookname;
	this.Author=author;
		// TODO Auto-generated constructor stub
	}

public void addreview(Review r)
{
	
	this.review.add(r); //using arraylist
//	for(int i=0;i<2;i++)
//	{
//		review[i]=r;
//	}
	
}
public String toString()
{
	return String.format("BookId-[%s] BookName-[%s] AuthorName-[%s] ReviewDetails-[%s]",Id,BookName,Author,review);
}
	

}

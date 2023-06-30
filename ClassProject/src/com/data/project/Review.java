package com.data.project;

public class Review {
private String Id;
private String review;
private int rating;
public Review(String id, String review, int rating) {
	super();
	Id = id;
	this.review = review;
	this.rating = rating;
}

public String toString()
{
	return String.format("%s,%s,%d",Id,review,rating);
}
}

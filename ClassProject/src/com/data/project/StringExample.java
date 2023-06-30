package com.data.project;

public class StringExample {
String[] day=new String[7];
	public StringExample(String[] ar) {
		// TODO Auto-generated constructor stub
		day=ar;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ar= {"Sunday","Monday","Tuesday","Wednesday","Thurseday","Friday","Saturday"};
		StringExample se=new StringExample(ar);
		se.longestString();
		se.reverseArray();
	}

	private void reverseArray() {
		// TODO Auto-generated method stub
		for(int i=day.length-1;i>=0;i--)
		{
			System.out.println(day[i]);
			
		}
		
	}

	private void longestString() {
		// TODO Auto-generated method stub
		String a="";
		String longest="";
		for(String i:day)
		{
			if(i.length()>longest.length())
			{
				longest=i;
			}
			
		}
		
		System.out.println("longest string is"+longest);
	}

}

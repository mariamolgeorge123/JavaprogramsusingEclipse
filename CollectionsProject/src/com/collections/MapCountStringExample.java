package com.collections;
import java.util.LinkedHashMap;

public class MapCountStringExample {
	public static void main(String[] args) {
		String s="This is awesome occcasion"+"I know this is very awesome";
		LinkedHashMap<Character,Integer> hm=new LinkedHashMap<>();
		char[] character=s.toCharArray();
		for(char c:character)
		{
			Integer i=hm.get(c);
			if(i==null)
			{
				hm.put(c,1);
			}
			else
			{
				hm.put(c,i+1);
			}
			
		}
		System.out.println(hm);
		
		
		
		
		
		
		
		String s1="This is awesome occcasion"+"I know this is very awesome";
		LinkedHashMap<Character,Integer> hm1=new LinkedHashMap<>();
		for(int ik=0;ik<s1.length();ik++)
		{
			Integer j=hm1.get(s1.charAt(ik));
			if(j==null)
			{
				hm1.put(s1.charAt(ik), 1);
			}
			else
			{
				hm1.put(s1.charAt(ik), j+1);
			}
		}
		System.out.println(hm1);

	
	
	String s3="This is awesome occcasion"+"I know this is very awesome";
	LinkedHashMap<String,Integer> ls=new LinkedHashMap<>();
	String[] str=s3.split(" ");
	for(String s5:str)
	{
		Integer in=ls.get(s5);
		if(in==null)
		{
			ls.put(s5,1);
		}
		else
		{
			ls.put(s5, in+1);
		}
	}
	System.out.println(ls);
	
}

}

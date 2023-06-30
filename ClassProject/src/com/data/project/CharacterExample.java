package com.data.project;

public class CharacterExample {
char ch;
	public CharacterExample(char c) {
		// TODO Auto-generated constructor stub
		ch=c;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isNumber() {
		// TODO Auto-generated method stub
		if(ch>=48 && ch<=57)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		if((ch>=65 && ch<=89)||(ch>=97 && ch<=122))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void lower() {
		
		// TODO Auto-generated method stub
		if((ch>=97 && ch<=122))
		{
			int h=(int)ch-32;
			System.out.println("uppercase"+(char)h);
		}
		
		
	}

	public void upper() {
		// TODO Auto-generated method stub
		if((ch>=65 && ch<=89))
		{
			int h=(int)ch+32;
			System.out.println("lowercase"+(char)h);
		}
		
	}

}

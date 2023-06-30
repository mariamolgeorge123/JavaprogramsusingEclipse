package com.data.project;

public class CharacterExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CharacterExample ch=new CharacterExample('c');
System.out.println(ch.isVowel());
System.out.println(ch.isNumber());
System.out.println(ch.isAlphabet());
ch.lower();
ch.upper();

	}

}

package com.generics;

public class GenericExampleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyCustomList<String> ml=new MyCustomList<>();
ml.addElement("element1");
ml.addElement("element2");
ml.addElement("element2");
ml.removeElement("element2");
System.out.println(ml);
String value=ml.getData(0);
System.out.println(value);

MyCustomList<Integer> ml1=new MyCustomList<>();
ml1.addElement(2);
ml1.addElement(3);
ml1.addElement(7);
ml1.addElement(22);
ml1.addElement(72);
System.out.println(ml1);
ml1.removeElement(72);
System.out.println(ml1);
ml1.removeElement(Integer.valueOf(22));
System.out.println(ml1);
Integer value1=ml1.getData(0);
System.out.println(value1);



	}

}

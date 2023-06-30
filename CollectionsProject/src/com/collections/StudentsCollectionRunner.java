package com.collections;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array*************************");
		Student[] s= {new Student(0,"Anu"),new Student(1,"Cinu"),new Student(2,"Minu"),new Student(3,"Jinu"),new Student(4,"Janu")};
		for (Student data:s)
		{
			System.out.println(data.getName());
		}
		
		System.out.println("List*************************");
		List<Student> listdata=List.of(new Student(2,"Minu"),new Student(1,"Cinu"),new Student(3,"Jinu"),new Student(0,"Anu"),new Student(4,"Janu"));
		System.out.println(listdata);
		List<Student> listdataAl=new ArrayList<>(listdata);
		System.out.println(listdataAl.get(0));
		Collections.sort(listdataAl);
		System.out.println(listdataAl);
		
		
		System.out.println("List*****Ascending order********************");
		List<Student> listdata22=List.of(new Student(2,"Minu"),new Student(1,"Cinu"),new Student(3,"Jinu"),new Student(0,"Anu"),new Student(4,"Janu"));
		System.out.println(listdata22);
		List<Student> listdataAl22=new ArrayList<>(listdata22);
		System.out.println(listdataAl22.get(0));
		Collections.sort(listdataAl22,new AscendingComparator());
		System.out.println(listdataAl22);
		
		
		System.out.println("List*****Descending order********************");
		List<Student> listdata222=List.of(new Student(2,"Minu"),new Student(1,"Cinu"),new Student(3,"Jinu"),new Student(0,"Anu"),new Student(4,"Janu"));
		System.out.println(listdata222);
		List<Student> listdataAl222=new ArrayList<>(listdata222);
		System.out.println(listdataAl222.get(0));
		Collections.sort(listdataAl222,new DecendingComparator());
		System.out.println(listdataAl222);
	}

}

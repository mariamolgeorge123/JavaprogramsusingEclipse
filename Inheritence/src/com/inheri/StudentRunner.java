package com.inheri;

public class StudentRunner {
	public static void main(String[] args) {
		StudentInheri s=new StudentInheri("Appu");
		//s.setName("maria");
		String name=s.getName();
		System.out.println(name);
		Person p=new Person("mari");
		String value=p.toString();
//		System.out.println(value);
//		System.out.println(p);
		
		Employee e=new Employee("asas");
		e.setEmployeegrade("A");
		e.setEmail("aaa@gmail.com");
		e.setEmployer("abc");
		//e.setName("hgsdggs");
		e.setPhone("67878900");
		e.setSalary(120000);
		e.setTitle("ghsdgshgd");
		System.out.println(e);
	}
	
	
	

}

package com.inheri;

public class Employee extends Person{
private String title;
private String employer;
private String employeegrade;
private int salary;
public Employee(String name)
{
	super(name);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getEmployer() {
	return employer;
}
public void setEmployer(String employer) {
	this.employer = employer;
}
public String getEmployeegrade() {
	return employeegrade;
}
public void setEmployeegrade(String employeegrade) {
	this.employeegrade = employeegrade;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String toString()
{
	return String.format("Title-%s Employer-%s EmployeeGrade-%s Salary-%s Name-%s Email-%s phone-%s",title,employer,employeegrade,salary,super.getName(),super.getEmail(),super.getPhone());
//	return super.toString();
}

}

package com.del.second.entity;
import java.sql.Date;
public class Employee 
{
	int emp_id;
	String name;
	double salary;
	Date doj;
	public Employee() {}
	public Employee(int emp_id, String name, double salary, Date doj) 
	{
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
}

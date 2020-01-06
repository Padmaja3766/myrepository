package com.deloitte.firstmvn.hibfirst.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class Employee 
{
	@Id
	int emp_id;
	String ename;
	double salary;
	Date doj;
	public Employee() {}
	public Employee(int emp_id, String ename, double salary, Date doj) {
		super();
		this.emp_id = emp_id;
		this.ename = ename;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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

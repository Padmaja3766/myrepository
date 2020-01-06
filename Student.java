package com.del.entity;
import java.sql.Date;
public class Student 
{
	int rno;
	String name;
	int age;
	Date doj;
	public Student() {}
	public Student(int rno, String name, int age, Date doj) 
	{
		this.rno = rno;
		this.name = name;
		this.age = age;
		this.doj = doj;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
}

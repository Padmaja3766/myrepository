class Person
{
 private int ssn,age;
 private String name;
 public Person() {}
 public Person(int ssn,String name,int age)
 {
  this.ssn=ssn;
  this.name=name;
  this.age=age;
 }
 public void setSsn(int ssn)
 {
  this.ssn=ssn;
 }
 public void setName(String name)
 {
  this.name=name;
 }
 public void setAge(int age)
 {
  this.age=age;
 }
 public int getSsn()
 {
  return ssn;
 }
 public String getName()
 {
  return name;
 }
 public int getAge()
 {
  return age;
 } 
}
class Emp extends Person
{
 private int empid;
 private double salary;
 public Emp() {}
 public Emp(int ssn,String name,int age,int empid,double salary)
 {
  super(ssn,name,age);
  this.empid=empid;
  this.salary=salary;
 }
 public void setEmpid(int empid)
 {
  this.empid=empid;
 }
 public void setSalary(double salary)
 {
  this.salary=salary;
 }
 public int getEmpid()
 {
  return empid;
 }
 public double getSalary()
 {
  return salary;
 } 
}
class Test1
{
 public static void main(String[] args)
 {
  Emp e = new Emp(101,"john",25,7001,25000);
  System.out.println(e.getSsn());
  System.out.println(e.getName());
  System.out.println(e.getAge());
  System.out.println(e.getEmpid());
  System.out.println(e.getSalary());
 }
}
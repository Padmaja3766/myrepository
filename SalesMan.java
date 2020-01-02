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
class SalesMan extends Emp
{
 int points;
 public SalesMan(){}
 public SalesMan(int ssn,String name,int age,int empid,double salary,int points)
 {
  super(ssn,name,age,empid,salary);
  this.points = points;
 }
 public void setPoints(int points)
 {
  this.points=points;
 }
 public int getPoints()
 {
  return points;
 }
 public double getIncentives()
 {
  return points*500;
 }
 public double getTotalSalary()
 {
  return getSalary()+points*500;
 }
}
class Test3
{
 public static void main(String[] args)
 {
  SalesMan sm = new SalesMan(101,"john",25,7001,25000,7);
  System.out.println(sm.getSsn());
  System.out.println(sm.getName());
  System.out.println(sm.getAge());
  System.out.println(sm.getEmpid());
  System.out.println(sm.getSalary());
  System.out.println(sm.getPoints());
  System.out.println(sm.getIncentives());
  System.out.println(sm.getTotalSalary());
 }
}
class Empl2 implements java.io.Serializable
{
 int empid;
 String name;
 double salary;
 public Empl2(){}
 public Empl2(int empid,String name,double salary)
 {
  this.empid=empid;
  this.name=name;
  this.salary=salary;
 }
 public void setEmpid(int empid)
 {
  this.empid=empid;
 } 
 public void setName(String name)
 {
  this.name=name;
 } 
 public void setSalary(double salary)
 {
  this.salary=salary;
 } 
 public int getEmpid()
 {
  return empid;
 }
 public String getName()
 {
  return name;
 }
 public double getSalary()
 {
  return salary;
 }
}
  
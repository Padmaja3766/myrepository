class Employees
{
 private int empid;
 private String ename;
 private double salary;
 public Employees(){}
 public Employees(int empid,String ename,double salary)
 {
   this.empid=empid;
   this.ename=ename;
   this.salary=salary;
 }
 public void setEmpid(int empid)
 {
  this.empid=empid;
 }
 public void setEname(String ename)
 {
  this.ename=ename;
 }
 public void setSalary(double salary)
 {
  this.salary=salary;
 }
 public int getEmpid()
 {
  return empid;
 }
 public String getEname()
 {
  return ename;
 }
 public double getSalary()
 {
  return salary;
 }
 public boolean equals(Object obj)
 {
  Employees e = (Employees)obj;
  return empid==e.empid && ename.equals(e.ename) && salary==e.salary;
 }
} 
class Department
{
 private int deptno;
 private String deptname;
 Employees[] e;
 public Department() {}
 public Department(int deptno,String deptname,Employees[] e)
 {
  this.deptno=deptno;
  this.deptname=deptname;
  this.e=e; 
 }
 public void setDeptno(int deptno)
 {
  this.deptno=deptno;
 }
 public void setDeptname(String deptname)
 {
  this.deptname=deptname;
 }
 public void setEmployees(Employees[] e)
 {
  this.e=e;
 }
 public int getDeptno()
 {
  return deptno;
 }
 public String getDeptname()
 {
  return deptname;
 }
 public Employees[] getEmployees()
 {
  return e;
 }
}
class Check
{
 public static void main(String[] args)
 {
  Employees[] e1 ={new Employees(101,"ajay",1000),new Employees(102,"babu",2000),new Employees(103,"chandu",3000)};
  Department d=new Department(10,"sales",e1);
  System.out.println("deptno is "+d.getDeptno());  
  System.out.println("deptname is "+d.getDeptname());
  System.out.println("employee details");
  Employees[] e2 = d.getEmployees();
  for(int i=0;i<e2.length;i++)
  {
   System.out.println("empid is "+e2[i].getEmpid());
   System.out.println("empname is "+e2[i].getEname());
   System.out.println("salary is "+e2[i].getSalary());
   System.out.println();  
  }
 }
}
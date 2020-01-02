class Employee
{
 int empid;
 String ename;
 double salary;
 public Employee(){}
 public Employee(int empid,String ename,double salary)
  {
   this.empid=empid;
   this.ename=ename;
   this.salary=salary;
  }
 public String toString()
 {
   return "Empid is "+empid+"\nEname is "+ename+"\nSalary is "+salary;
 }
}
class tests
{
 public static void main(String[] args)
 {
  Employee e = new Employee(101,"Ajay",25000);
  System.out.println(e); 
 }
}
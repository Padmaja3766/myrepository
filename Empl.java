import java.util.HashSet;
import java.util.Iterator;
class Empl implements Comparable<Empl>
{
 int empid;
 String name;
 double salary;
 public Empl(){}
 public Empl(int empid,String name,double salary)
 {
  this.empid=empid;
  this.name=name;
  this.salary=salary;
 }
 public void display()
 {
  System.out.println(empid+" "+name+" "+salary);
 }
 public int HashCode()
 {
  return empid;
 }
 public boolean equals(Object obj)
 {
  Empl e = (Empl)obj;
  return empid==e.empid && name.equals(e.name) && salary==e.salary;
 }
 public int compareTo(Empl e)
 {
  return empid=empid;
 }
}

//in java either predefined or user defined class is either directly or 
//indirectly is a sub class of object class.  
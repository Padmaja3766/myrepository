import java.util.ArrayList;
import java.util.ListIterator;
class Student
{
 private int sid;
 private String sname;
 private double fee;
 public Student(){}
 public Student(int sid,String sname,double fee)
 {
  this.sid=sid;
  this.sname=sname;
  this.fee=fee;
 }
 public void setSid(int sid)
 {
  this.sid=sid;
 }
 public void setSname(String sname)
 {
  this.sname=sname;
 }
 public void setFee(double fee)
 {
  this.fee=fee;
 }
 public int getSid()
 {
  return sid;
 }
 public String getSname()
 {
  return sname;
 }
 public double getFee()
 {
  return fee;
 }
 public boolean equals(Object obj)
 {
  Student s = (Student)obj;
  return sid==s.sid && sname.equals(s.sname) && fee==s.fee;
 }
}
class Training
{
 private int trainingId;
 private String trainingName;
 ArrayList<Student> slist=new ArrayList<>();
 public Training(){}
 public Training(int trainingId,String trainingName,ArrayList slist)
 {
  this.trainingId=trainingId;
  this.trainingName=trainingName;
  this.slist=slist;
 }
 public void setTrainingId(int trainingId)
 {
  this.trainingId=trainingId;
 }
 public void setTrainingName(String trainingName)
 {
  this.trainingName=trainingName;
 }
 public void setSlist(ArrayList slist)
 {
  this.slist=slist;
 }
 public int getTrainingId()
 {
  return trainingId;
 }
 public String getTrainingName()
 {
  return trainingName;
 }
 public ArrayList getSlist()
 {
  return slist;
 }
}
class Test
{
 public static void main(String[] args)
 {
  ArrayList<String> list=new ArrayList<>();
  list.add("john");
  Training t = new Training();
  Student[] s={new Student(10,"ajay",1000),new Student(20,"arun",2000)};
  System.out.println(t.getTrainingId());
  System.out.println(t.getTrainingName());
  System.out.println("student details");
  for(int i=0;i<s.length;i++)
  {
   System.out.println(s[i].getSid());
   System.out.println(s[i].getSname());
   System.out.println(s[i].getFee());
  }
 }
}
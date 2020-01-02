class Person
{
 private int rno,age;
 private String name;
 public Person() {}
 public Person(int rno,String name,int age)
 {
  this.rno=rno;
  this.name=name;
  this.age=age;
 }
 public void setRno(int rno)
 {
  this.rno=rno;
 }
 public void setName(String name)
 {
  this.name=name;
 }
 public void setAge(int age)
 {
  this.age=age;
 }
 public int getRno()
 {
  return rno;
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
class Std extends Person
{
 private int m1,m2,m3;
 public Std() {}
 public Std(int rno,String name,int age,int m1,int m2,int m3)
 {
  super(rno,name,age);
  this.m1=m1;
  this.m2=m2;
  this.m3=m3;
 }
 public void setM1(int m1)
 {
  this.m1=m1;
 }
 public void setM2(int m2)
 {
  this.m2=m2;
 }
 public void setM3(int m3)
 {
  this.m3=m3;
 }
 public int getM1()
 {
  return m1;
 }
 public int getM2()
 {
  return m2;
 }
 public int getM3()
 {
  return m3;
 }
 public int getTotalMarks() 
 {
  return m1+m2+m3;
 }
 public int getAverage()
 {
  return (m1+m2+m3)/3;
 }
 public String getResults()
 {
  if(m1>40 && m2>40 && m3>40)
   return "passed";
  return "failed";
 }
 public String getDivision()
 {
  if(m1>=40 && m2>=40 && m3>=40)
  {
   int avg = getAverage();
   if(avg>=70)
    return "First";
   else if(avg>=50)
    return "Second";
   else
    return "Third";
   }
   else
     return "Nill";
 }
}
class Test2
{
 public static void main(String[] args)
 {
   Std s=new Std(657,"john",15,55,68,46);
   System.out.println(s.getRno());
   System.out.println(s.getName());
   System.out.println(s.getAge());
   System.out.println(s.getTotalMarks());
   System.out.println(s.getAverage());
   System.out.println(s.getResults());
   System.out.println(s.getDivision());
 }
}
class Student
{
 private int rno,m1,m2,m3;
 private String name;
 public Student(){}
 public Student(int rno,String name,int m1,int m2,int m3)
 {
  this.rno=rno;
  this.name=name;
  this.m1=m1;
  this.m2=m2;
  this.m3=m3;
 }
 public int getRno()
 {
  return rno;
 }
 public String getName()
 {
  return name;
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
class Testing
{
 public static void main(String[] args)
 {
  Student[] s={new Student(101,"john",50,60,70),new Student(102,"chandu",60,70,80)};
  for(int i=0;i<s.length;i++)
  {
   System.out.println(s[i].getRno());
   System.out.println(s[i].getName());
   System.out.println(s[i].getTotalMarks());
   System.out.println(s[i].getAverage());
   System.out.println(s[i].getResults());
   System.out.println(s[i].getDivision());
  }
 }
}

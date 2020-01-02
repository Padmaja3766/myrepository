class Excepti
{
 public static void main(String[] args)
 { 
  int a,b,c;
  a=23;
  b=0;
  try
  {
   c=a/b;
   System.out.println("c=" +c);
  }
  catch(Exception e)
  {
   System.out.println("can't divide with 0");
  }
  finally
  {
   System.out.println("exception");
  }
  System.out.println("end");
 }
}
  
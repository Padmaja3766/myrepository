interface Calculator
{
 int sum(int x,int y);
 int product(int x,int y);
}
class AbcCalc implements Calculator
{
 public int sum(int x,int y)
 {
  return x+y;
 }
 public int product(int x,int y)
 {
  return x*y;
 }
}
class XyzCalc implements Calculator
{
 public int sum(int x,int y)
 {
  return x-(-y);
 }
 public int product(int x,int y)
 {
  return x*y;
 }
}
class Test
{
 public static void main(String[] args)
 {
  AbcCalc a=new AbcCalc();
  XyzCalc x=new XyzCalc();
  System.out.println("sum in AbcCalc is"+a.sum(1,2));
  System.out.println("product in AbcCalc is"+a.product(5,8));
  System.out.println("sum in XyzCalc is"+x.sum(7,2));
  System.out.println("product in XyzCalc is"+x.product(9,45));  
 }
}
   

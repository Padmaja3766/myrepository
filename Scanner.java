import java.util.Scanner;
class Scanner
{
 public static void main(String[] args)
 {
  Scanner sc= new Scanner();
  System.out.println("enter a number:");
  int x = sc.nextInt();
  sc.nextLine();
  System.out.println("enter a String:");
  String s = sc.nextLine();
  System.out.println("you have entered");
  System.out.println(x+" "+s);
 }
}
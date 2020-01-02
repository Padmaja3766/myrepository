import java.util.Scanner;
class Scan
{
 public static void main(String[] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter a number:");
  int x = sc.nextInt();
  sc.nextLine();
  System.out.println("enter a String:");
  String s = sc.nextLine();
  System.out.println("you have entered "+x+" "+s);
 }
}
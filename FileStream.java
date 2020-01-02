import java.io.File;
class Test9
{
 public static void main(String[] args)
 {
  File f = new File("Empl.java");
  System.out.println(f.isFile());
  System.out.println(f.length());
  System.out.println(f.isDirectory());
  System.out.println(f.canRead());
  System.out.println(f.getName());
  System.out.println(f.canExecute());
  //f.delete(); (it will delete the file perminently) 
 }
}
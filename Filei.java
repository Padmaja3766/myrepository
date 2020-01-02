import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
class Test
{
 public static void main(String[] args)
 {
  try(FileInputStream fis = new FileInputStream("abc.dat"))
  {
   int ch;
   while((ch=fis.read())!=-1)
    System.out.println(()char(ch)+" ");  //if we dont give char it will give integer
  }
  catch(IOException ex)
  {
   System.out.println(ex);
  }
 }
}
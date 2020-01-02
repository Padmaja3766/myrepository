import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Test
{
 public static void main(String[] args)
 {
  Empl2 e = new Empl2(786,"John Miller",25000);
  try(FileOutputStream fos = new FileOutputStream("emp.dat");
      ObjectOutputStream oos = new ObjectOutputStream(fos);)
  {
   oos.writeObject(e);
  }
  catch(IOException ex)
  {
   System.out.println(ex);
  }
 }
}
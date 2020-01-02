import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
class Test
{
 public static void main(String[] args)
 {
  Empl2 e =new Empl2(786,"John Miller",25000);
  try(FileInputStream fis = new FileInputStream("emp.dat");
      ObjectInputStream ois = new ObjectInputStream(fis);)
  {
   e = (Empl2)ois.readObject();
   System.out.println(e.getEmpid()+" "+e.getName()+" "+e.getSalary());
  }
  catch(IOException | ClassNotFoundException ex)
  {
   System.out.println(ex);
  }
 }
}
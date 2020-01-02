import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
class Test
{
 public static void main(String[] args)
 {
  try(FileOutputStream fos = new FileOutputStream("abc.dat");
      DataOutputStream dos = new DataOutputStream(fos);)
  {
   int i=214764516;
   float f=15687.78F;
   double d=9999999999.999;
   dos.writeInt(i);
   dos.writeFloat(f);
   dos.writeDouble(d);
  }
   
  catch(IOException ex)
  {
   System.out.println(ex);
  }
 }
}
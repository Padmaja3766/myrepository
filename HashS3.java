import java.util.HashSet;
import java.util.Iterator;
class HashS3
{
 public static void main(String[] args)
 {
  HashSet<Integer> hs1=new HashSet<Integer>();
  hs1.add(10);
  hs1.add(100);
  hs1.add(new Integer(786));
  hs1.add(999);
  for(Integer i : hs1)
   System.out.println(i);
 }
}
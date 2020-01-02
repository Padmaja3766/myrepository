import java.util.HashSet;
import java.util.Iterator;
class HashS2
{
 public static void main(String[] args)
 {
  HashSet<String> hs1=new HashSet<String>();
  hs1.add("welcome");
  hs1.add("hello");
  hs1.add("bye bye");
  hs1.add("farewell");
  HashSet<String> hs2 = new HashSet<String>();
  hs2.add("apple"); 
  hs2.add("banana");
  hs2.add("hello");
  hs1.retainAll(hs2);
  for(String s : hs1)
   System.out.println(s);
 }
} 

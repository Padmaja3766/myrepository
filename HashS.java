import java.util.HashSet;
import java.util.Iterator;
class HashS
{
 public static void main(String[] args)
 {
  HashSet<String> hs=new HashSet<String>();
  hs.add("welcome");
  hs.add("hello");
  hs.add("bye bye");
  hs.add("farewell");
  System.out.println(hs.add("welcome"));
  System.out.println(hs.size());
  for(String s : hs)
   System.out.println(s);
  System.out.println(hs.contains("hello"));
  System.out.println(hs.remove("hello"));
  System.out.println(hs.remove("null"));
  Iterator<String> itr = hs.iterator();
  while(itr.hasNext())
   System.out.println(itr.next());
  hs.clear();
 }
} 

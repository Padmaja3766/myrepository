import java.util.TreeSet;
import java.util.Iterator;
class Test5
{
 public static void main(String[] args)
 {
  TreeSet<String> tset = new TreeSet<>();
  tset.add("Welcome");
  tset.add("Hello");
  tset.add("Farewell");
  tset.add("Zebra");
  for(String s : tset)
   System.out.println(s);
 }
}
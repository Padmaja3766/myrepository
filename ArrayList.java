import java.util.ArrayList;
import java.util.ListIterator;
class Test6
{
 public static void main(String[] args)
 {
  ArrayList<String> list = new ArrayList<>();
  list.add("Welcome");
  list.add("Hello");
  list.add("Apple");
  list.add("Welcome");
  list.add("Farewell");
  list.add("Bye Bye");
  list.add(1,"Banana");
  //for (String s : list)
   //System.out.println(s);
  //for(int i=0;i<list.size();i++)
   //System.out.println(list.get(i));
  ListIterator<String> itr = list.listIterator();
  while(itr.hasNext())
   System.out.println(itr.next());
  while(itr.hasPrevious())
   System.out.println(itr.previous());
 }
}
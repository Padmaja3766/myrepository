import java.util.TreeSet;
import java.util.Iterator;
class Test
{
 public static void main(String[] args)
 {
  TreeSet<Empl> tset = new TreeSet<>();
  tset.add(new Empl(102,"babu",2000));
  tset.add(new Empl(101,"arun",1000));
  tset.add(new Empl(104,"dinesh",4000));
  tset.add(new Empl(103,"chandhra",3000));
  for(Empl e : tset)
   e.display();
 }
} 
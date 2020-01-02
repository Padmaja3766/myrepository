import java.util.LinkedHashSet;
import java.util.Iterator;
class HashEmp
{
 public static void main(String[] args)
 {
  LinkedHashSet<Empl> hs = new LinkedHashSet<Empl>();
  hs.add(new Empl(101,"ajay",25000.00));
  hs.add(new Empl(102,"babu",15000.00));
  hs.add(new Empl(103,"chandu",35000.00)); 
  hs.add(new Empl(101,"ajay",25000.00));
  for(Empl e : hs)
   e.display();
  Iterator<Empl> itr = hs.iterator();
  while(itr.hasNext());
   itr.next().display();
 }
}
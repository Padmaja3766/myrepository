import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map.Entry;
class Test
{
 public static void main(String[] args)
 {
  LinkedHashMap<String,String> map = new LinkedHashMap<>();
  map.put("abc@gmail.com","abc@123");
  map.put("xyz@yahoo.com","xyz@321");
  map.put("bbc@rediff.com","redbbc");
  map.put("someuser@xyz.com","somexyz");
  Set<Entry<String,String>> set = map.entrySet();
  for(Entry<String,String> s : set)
   System.out.println(s.getKey()+"  "+s.getValue());
 }
}
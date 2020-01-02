import java.util.StringTokenizer;
class Test
{
 public static void main(String[] args)
 {
  String s = "something to be, written and shown, to the Participants";
  StringTokenizer st = new StringTokenizer(s,",");
  System.out.println(st.countTokens());
  while(st.hasMoreTokens())
   System.out.println(st.nextToken());
 }
}
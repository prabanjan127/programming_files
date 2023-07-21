
import java.util.*;
 public class distance
{
  public static void main(String[] args )
  {
    Scanner obj = new Scanner(System.in);
    {
      long days = obj.nextLong();
      long sec,dist;
      sec = days*24*60*60;
      dist = sec*186000;
      System.out.println(dist);
    }
  }
}
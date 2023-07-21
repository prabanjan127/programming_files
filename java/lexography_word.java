
import java.util.Scanner;

public class lexography_word {
    public static String getSmallestAndLargest(String s, int k) {
        String sm = "";
        String lr = "";
        sm=lr=s.substring(0,k);
        for(int i=1;i<s.length()-k+1;i++)
        {
            String sub= s.substring(i,i+k);
            if(sm.compareTo(sub)>0)
            {
                sm=sub;
            }
            if(lr.compareTo(sub)<0)
            {
             lr = sub; 
            }
        }
        
        return sm + "\n" + lr;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

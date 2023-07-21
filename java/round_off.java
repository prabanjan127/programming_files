import java.util.*;
import java.math.*;
class round_off {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        float b = sc.nextFloat();
       double roundoff = Math.round(a*100)/100;
       System.out.println(roundoff);
       System.out.printf("%.2f",b);
    }
    
}

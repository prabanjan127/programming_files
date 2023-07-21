import java.util.*;
class check_prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int i=2;
        boolean flag = false;
        while(i<=n/2)
        {
            if(n%i==0)
            {
               flag=true;
                break;
            }
           i++;
        }
        if(!flag)
        {
            System.out.println("prime "+n);
        }
        else
        {
            System.out.println("not prime also composite "+n);
        }
    }
    
}

import java.util.*;
class prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++)
        {
            count =0;
           for(int j=2;j<=i/2;j++)
           {
            if(i%j==0)
            {
                count++;
                break;
            }
           }
        if(count==0)
        {
            System.out.println(i);
        }
        }
        
    }
}

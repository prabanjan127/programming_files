import java.util.*;
class sliding_window_max {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
       
       int max;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-k;i++)
        {
           max=a[i];
            for(int j=1;j<=k;j++)
            {
                if(a[i+j]>max)
                {
                    max=a[i+j];
                }
            }
            System.out.print(max+" ");
        }
    }
    
}

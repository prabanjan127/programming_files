import java.util.*;
class triple_n {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int a[] = {1,2,3,4,6};
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                for(int k=2;k<n;k++)
                {
                    if(a[i] < a[j] && a[j] < a[k] && a[i]+a[j]+a[k]<=t)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
}

import java.util.*;
class q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  a[] = new int[n];
        int s=0,k=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=a[i+1]-1;
            k=a[i]-1;

        }
        System.out.println(s*k);

    }
    
}

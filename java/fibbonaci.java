import java.util.*;
class fibbonaci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+2];
        a[0] = 0;
        a[1] = 1;
        System.out.println(a[0]+"\n"+a[1]);
        for(int i=2;i<n;i++)
        {
            a[i] = a[i-1]+a[i-2];
            System.out.println(a[i]);
        }
       
    }
    
}

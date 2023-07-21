import java.util.*;
class sin_do {
    public static void main(String[] arga)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(a[i]<10)
           {
            System.out.print("S"+" ");
           }
           else{
            System.out.print("D"+" ");
           }
        }

    }
    
}

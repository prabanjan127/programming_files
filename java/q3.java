package d_14_3;
import java.util.*;;
public class q3 {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            b[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
                c[i]=a[i]+b[i];
                System.out.print(c[i]);
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
                c[i]=a[i]%b[i];
                System.out.print(c[i]);
        }
        

    }
    
}
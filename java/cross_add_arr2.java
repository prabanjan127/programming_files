import java.util.*;
class cross_add_arr2 {
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0||i==2||i==3||i==4||i==5||i==6)
            {
            c[0]=a[0]+b[2];
            c[1]=a[2]+b[0];
            c[2]=a[1]+b[1];
            c[3]=a[3]+b[3];
            c[4]=a[4]+b[6];
            c[5]=a[6]+b[4];
            c[6]=a[5]+b[5];
            System.out.print(c[i]+" ");
            }
        }
    }
}

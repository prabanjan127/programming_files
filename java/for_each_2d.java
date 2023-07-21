import java.util.*;
class for_each_2d {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[][] = new int[n][m];
        for(int j=0; j<n; j++)  
        {
            for(int k=0; k<m;k++)
            {
                arr1[j][k] =sc.nextInt();
            }
        }
        for(int a[]:arr1)
        {
            for(int b: a)
            {
             
                System.out.print(b);
            }
            System.out.println();
        }
        
    }
    
}

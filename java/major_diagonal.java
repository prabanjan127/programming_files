import java.util.*;
class major_diagonal {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        int arr[][] = new int[n][m];
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++,System.out.println("\n"))
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
        
        for(int i=0;i<n;i++,System.out.println("\n"))
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    sum = sum+ arr[i][j];
                }

            }

        }
        System.out.println(sum);
       
    }


    }
    
}

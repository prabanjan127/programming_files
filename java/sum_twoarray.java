import java.util.*;
class sum_twoarray {
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
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);


    
}}}

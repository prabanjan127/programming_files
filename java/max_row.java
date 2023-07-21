import java.util.*;
class max_row
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int a[][] =new int[n][m];
        int count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
            a[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++,System.out.println())
        {
            for(int j=0; j<m; j++)
            {
                if(a[i][j]==0)
                {
                    count++;
                }
        }
        }


        System.out.println(count);
        
    }
}
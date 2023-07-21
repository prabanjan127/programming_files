import java.util.*;
class matrix
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int m = s.nextInt();
            int arr[][] = new int[n][m];   
            for(int i=0; i<n; i++)
            {
                for(int j=0;j<m; j++)
                {
                    arr[i][j] =s.nextInt();
                    
                }
            } 
            System.out.println("original");
            for(int i=0; i<n; i++,System.out.println())
            {
                for(int j=0;j<m; j++)
                {
                
                    System.out.print(arr[i][j]+" ");

                }
            }    
            System.out.println("changed matrix");
            for(int i=0; i<m; i++,System.out.println())
            {
                for(int j=0;j<n; j++)
                {
                   
                    System.out.print(arr[j][i]+" ");
                }
            }      
        }
    }
}
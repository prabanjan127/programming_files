import java.util.*;
class adjoint {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int a2[][] = new int[n][m];
        for(int i=0; i<n; i++,System.out.println())
        {
            for(int j=0; j<m; j++)
            {
                arr[i][j]= sc.nextInt();
                 System.out.print(arr[i][j]);
            }
        }
        for(int i=0; i<n; i++,System.out.println())
        {
            for(int j=0; j<m; j++)
            {
             if(i==0 && j==0)
             {
                 a2[i][j]=arr[1][1];          
                } 
                else if(i==1 && j==1){
                       a2[i][j]=arr[0][0];            
                }
                else if((i==0 && j==1)||(i==1 && j==0)){
                    a2[i][j]=-arr[i][j];                   
                }
               System.out.print(a2[i][j]+" ");
            }
        }   


    }
  

    
}

import java.util.*;
class transpose {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int b[][]= new int[m][n];
        int c[][]= new int [n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
        a[i][j]=sc.nextInt();
        //System.out.println(a[i][j]);
        }
        }
        for(int i=0; i<m; i++,System.out.println())
        {
            for(int j=0;j<n; j++)
            {
               b[i][j]=a[j][i];
               System.out.print(b[i][j]+" ");
                
            }
        }  
        for(int i=0; i<n; i++,System.out.println())
        {
            for(int j=0; j<n; j++)
            {
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]+" ");
            }
        }  
        
    }
    
}

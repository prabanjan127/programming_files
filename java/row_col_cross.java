import java.util.*;
class row_col_cross {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    {
        int n =sc.nextInt();
        for (int i=1; i<=n; i++)
        {
          
            for (int k = i*2; k <= n*2-1; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}}

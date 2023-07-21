import java.util.*;
class n_patt {
    public static void main(String[] args)
    {
        Scanner dc = new Scanner(System.in);
        int n = dc.nextInt();
        for(int i=1; i<n; i++)
        {
            for(int j=1; j<n; j++)
            {
                if(i==j)
                {
                    System.out.println("*");
                }
               
            }
           
      System.out.println();
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           
           
                }        }
        
    }
    


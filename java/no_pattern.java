import java.util.*;
class no_pattern {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        {
            int n = s.nextInt();
            int count=1;
            
            for(int row=0;row<n;row++)
            {
                
                for(int col=0;col<row;col++)
                {
                   System.out.print(count+" ");
                   count++;
                }
                System.out.println();
            }
          
        }
    }
    
    
}

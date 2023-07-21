import java.util.*;
class prabanjan_patt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int t = n-n/2;
//pattern P.
       for(int i=0;i<n;i++)                        
       {
        System.out.print("#");
       
       }
       System.out.println();
      
       for(int i=0;i<n;i++)
       {
        if((i>=0 && i<1)||(i>=n-1 && i<n))
        {
        System.out.print("#");
        }
        else
        {
            System.out.print(" ");
        }
       
       }

       System.out.println();
      
       for(int i=0;i<n;i++)
       {
        if((i>=0 && i<1)||(i>=n-1 && i<n))
        {
        System.out.print("#");
        }
        else
        {
            System.out.print(" ");
        }
       
       }
       System.out.println();
       for(int i=0;i<n-1;i++)
       {
        System.out.print("#");
       
       }
       

       for(int i=0;i<n;i++)
       {
        if(i>=0 && i<=t)
        {
        System.out.println("#");
        }
        else
       {
        System.out.println(" ");
       }

       }
      
//pattern R.
        for(int i=0;i<n;i++)                        
        {
        System.out.print("#");

        }
        System.out.println();

        for(int i=0;i<n;i++)
        {
        if((i>=0 && i<1)||(i>=n-1 && i<n))
        {
        System.out.print("#");
        }
        else
        {
            System.out.print(" ");
        }

        }

        System.out.println();

        for(int i=0;i<n;i++)
        {
        if((i>=0 && i<1)||(i>=n-1 && i<n))
        {
        System.out.print("#");
        }
        else
        {
            System.out.print(" ");
        }

        }

        System.out.println();
        for(int i=1;i<n-1;i++)
        {
        System.out.print("#");

        }

        for(int i=1;i<t+1;i++,System.out.println())
            {
            for(int j=1;j<t+1;j++)
            {
                if(i<=t && j==1)
                {
                    System.out.print("#");
                }
                if(i==j)
                {

                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
                
                
                
            }
        }
  
//pattern.A
    //     for(int i=0; i<t; i++)
    //     {
    //         for(int j=0; j<t; j++)
    //         {
    //             if()
    //         }
    //     }
        











    
     }}
       


        

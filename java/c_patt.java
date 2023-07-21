import java.util.*;
class c_patt {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q=n-6;
        for(int i=0;i<n;i++)
        {
            if(i>=4 && i<=7)
            {
                System.out.print("#");
            }
            else
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if((i>=3 && i<=4) || (i>=7 && i<=8))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if((i>=2 && i<=3) || (i>=8 && i<=9))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=2;i<q+2;i++)
        {
           System.out.println("##");
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if((i>=2 && i<=3) || (i>=8 && i<=9))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if((i>=3 && i<=4) || (i>=7 && i<=8))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(i>=4 && i<=7)
            {
                System.out.print("#");
            }
            else
            System.out.print(" ");
        }
        



    }
    
}

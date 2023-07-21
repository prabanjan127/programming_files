import java.util.*;
class center_all
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        {
        int n = sc.nextInt();
        int row,col;
        for(row=1;row<=n;row++,System.out.print("\n"))
        {
         for (col=1;col<=n;col++)
         if((n%2==0)&&(row==n/2+1 && col==n/2+1))
         System.out.print("0");
         else if ((row==n/2 || row==n/2+1)&&(col==n/2 || col==n/2+1))
         System.out.print("0");
         else
         System.out.print("1");
        }




    }

}
    }
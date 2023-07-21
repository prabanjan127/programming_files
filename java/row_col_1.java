import java.util.*;
class row_col_1
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    {
    int row;
    int col;
    int n = sc.nextInt();
    for(row=1; row<=n; row++,System.out.print("\n"))
    {
        if(row%2==0)
         System.out.print(row+1);
         for(col=1; col<=n; col++)
            System.out.print(row);
            if(row%2!=0)
            System.out.print(row+1);
    }


    }
}
}
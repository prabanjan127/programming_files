// code to print prime numbers       


import java.util.*;
class zeroone_patt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row;
        int col;
        for ( row = 1; row<=num; row++)
        {
            System.out.printf("\n");
            for ( col = 1; col<=row; col++)
            {
                System.out.print(row%2);
            }
            
        }

}
}

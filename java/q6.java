package d_14_3;

import java.util.Scanner;
class q6
{
  public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int rows = scanner.nextInt();
            for (int i=1; i<=rows; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                for (int k = 1; k <= (rows-i)*2; k++)
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
       
    }
}

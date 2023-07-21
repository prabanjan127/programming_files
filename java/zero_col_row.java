import java.util.*;
class main
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int num,row,col;
    num = obj.nextInt();
    for(row=1;row<=num;row++,System.out.print("\n"))
    {
        for(col=1;col<=num;col++)
        {
            if(row == num/2+1 || col == num/2+1)
            {
              System.out.print("0");
            }
            else
           {
               System.out.print("1");
           }
      }
   }
}}
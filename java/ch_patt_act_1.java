import java.util.*;
class ch_patt_act_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int row =sc.nextInt();
        int col=sc.nextInt();
        int s=0;
        while(s<t)
        {
            for(int i=0;i<row-1;i++)
            {
                System.out.print("*");
                for(int j=0;j<col-1;j++)
                {
                    System.out.print(".");
                    break;
                   
                }
            }
           s++; 
        }
    }
    
}

import java.util.*;

class q1_test_12_5_23
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            difference d = new difference();
          d.diffence(a,b);
           
        }
       
    }
}
class difference
{  int d=0,f=0;
    
  void diffence(int a,int b)
{
  
    for(int i=1;i<=b;i++)
    {
        if(i%a==0)
        {
            d=d+i;
        }
        else{
            f=f+i;
        }
    }
System.out.println(f-d);
 
}

}
import java.util.*;
class n_distinct_no {
  public static void findsum(int n)
  {
    int half = n/2;
    if(n%2==0)
    {
        half--;
    }
    for(int i=1;i<=half;i++)
    {
        System.out.println((-1)*i+","+i+",");
    }
    int check = n & 1;
    if(check !=0)
    {
        System.out.println(n);
    }
    else{
        System.out.println(0+","+n);
    }
  }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findsum(n);
    }
    
}

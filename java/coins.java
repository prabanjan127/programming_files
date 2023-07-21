import java.util.*;
class coins {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int a[]={1,2,5,10,20,50,100,200,500,2000};
       int n = sc.nextInt();
       int max=0;
       for(int i=a.length-1; i>=0; i--)
       {
       if(n>=a[i])
       {
        max=a[i];
        if(n>=max)
        {
            n=n-max;
            i++;
            System.out.println(max);
        }
       }
       } 
    }
    
}
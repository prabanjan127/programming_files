import java.util.*;
class max_prod {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int n=4;
    int a[] = new int[n];
    int max=0;
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }

    for(int i=0;i<n-1;i++)
    {
        int e=a[i]*a[i+1];
    if(e>max)
    {
        System.out.println(e);
    }
    }
    
}}

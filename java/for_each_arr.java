import java.util.*;
class for_each_arr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int s:arr){
            System.out.print(s);
        }
        
    }
    
}

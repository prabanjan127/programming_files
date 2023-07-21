
import java.util.*;
class insert_arr_ele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int v = sc.nextInt();
        int in = sc.nextInt();
         int n = sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=in;i--)
        {
            a[i]=a[i-1];
        }
        a[in]=v;
        System.out.println(Arrays.toString(a));
        
    }
}
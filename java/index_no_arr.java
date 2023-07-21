import java.util.*;
class index_no_arr {
    public static void main(String[] args) {
{
    {
        Scanner obj = new Scanner(System.in);{
            int n = obj.nextInt();
            int arr[] = new int[n];
            int k = obj.nextInt();
            for(int i=0;i<n;i++)
            {
                arr[i] = obj.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(k==arr[i])
                {
                    System.out.print("found");
                }
                else
                {
                    System.out.println("not found");
                }
            }
        }
    }
    
}
}}

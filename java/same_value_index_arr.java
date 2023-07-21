import java.util.*;
class same_value_index_arr {
    public static void main(String[] args)
    {
    Scanner obj  = new Scanner(System.in);
    {
        int n = obj.nextInt();
        int arr[] = new int[n];
        int k =obj.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i] =obj.nextInt();
         
        }
        
        for(int i=0;i<arr.length;i++)
        {
        if(arr[k]==arr[i])
        {
            System.out.print("Found");
            break;
        }
        else{
            System.out.println("Not found");
            break;
        }}
       
       }
    }
 
    
}

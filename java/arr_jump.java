import java.util.*;
class arr_jump {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int jump=0;
        for(int i=0; i<n; i++)
        {
            arr[i] =sc.nextInt();
           
        }
        for(int i=0; i<arr.length; i++)
        {
              i=i+arr[i];
                jump++;
        }
        System.out.println(jump);
        int count=0; 
        for(int i=0; i<arr.length; i+=arr[i])
        {
            if(arr[i]!=0)
            {
                count++;
            }
        }
        System.out.println(count);
       
       
    }
    
}

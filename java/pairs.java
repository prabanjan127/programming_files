import java.util.*;
class pairs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k[] = new int[n];
       int count=0;
       
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int temp[] = new int[2];
        
        for(int i=0 ; i<n-1; i++)
        { 
            
          temp[0] = arr[i];
           temp[1] = arr[i+1];
           if(temp[0]==temp[1])
           {
            count++;
           }
        }
        System.out.println(count);

        
       
       
    }
}
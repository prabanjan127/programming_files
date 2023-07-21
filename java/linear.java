import java.util.*;
class linear {
    
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    {
        int n = obj.nextInt();
        int arr[] = new int[n];
        int flag = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        int k = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            
            if(k == arr[i])
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
        }
        
    }
    
}

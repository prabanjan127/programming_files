import java.util.*;
class slice {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            int a=0;
            for(int i=0; i<n; i++)
            {
                arr[i] = s.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(arr[i]==arr[i])
                {
                    a=n-1;
                    System.out.println(a);
                    break;
                }
            }
               
            }
            
        }
    }
    


import java.util.*;

class array_odd_even{
    public static void main(String[] args){
     Scanner obj = new Scanner(System.in);
        {
            int n = obj.nextInt();
            int odd=0,even=0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
             arr[i] = obj.nextInt();
            }
            for(int i=0;i<n;i++){
                if(arr[i]%2==0)
                {
                   even++;
                }
                else{
                    odd++;
                }
                System.out.print(arr[i]+" ");
            }
            System.out.println("\neven "+even);
            System.out.println("odd "+odd);

    }}}
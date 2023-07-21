import java.util.*;
class arr_value_equal_add_x {

    public static void main(String[] args)
    {
        int[] arr={1,2,4,5,7};
        int [] brr={5,6,3,4,8};
        int x=9;
        
            for(int i=0;i<arr.length;i++)
            {
                System.out.println();
                for(int j=0;j<brr.length;j++)
                {
                    if(arr[i]+brr[j]==x)
                    {
                        System.out.print(arr[i]);
                        System.out.print(brr[j]);
                    }
                   
                }

                
            }


    }
}
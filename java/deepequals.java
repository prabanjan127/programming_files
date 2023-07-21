import java.util.*;
class deepequals {
    public static void main(String[] args)
    {
        int arr[][] = {{1,2},{4,5}};
        int arr1[][] = {{1,2},{4,5}};
        int ar1[] = {1,2,3,4,5};
        int ar[] = {1,2,3,4,5};
        System.out.println(Arrays.equals(ar1,ar));
        System.out.println(Arrays.deepEquals( arr,arr1));

    }
    
}

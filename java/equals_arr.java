import java.util.*;
class equals_arr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[]{1,2,3};
    int arr1[] =new int[]{1,2,3}; 
    System.out.println(arr.toString());
    System.out.println(Arrays.toString(arr));
    System.out.println(arr.equals(arr1));
    System.out.println(Arrays.equals(arr, arr1));
    System.out.println(Arrays.binarySearch(arr, 2));
    }
    
}

package d_15_3;
 import java.util.Arrays;  
class binary_search_method{  
    public static void main(String args[]){  
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int result = Arrays.binarySearch(arr,key); 
        System.out.print(result);
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }  
}   
import java.util.Arrays;
import java.util.Scanner; 
public class insert_ele_array {
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
   int Index_position = sc.nextInt();
   int newValue    = sc.nextInt();
    for(int i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }  
   
  for(int i=n-1; i > Index_position; i--){
    arr[i] = arr[i-1];
   }
   arr[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(arr));
 }
 }
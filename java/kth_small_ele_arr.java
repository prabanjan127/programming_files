import java.util.*;
class kth_small_ele_arr 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[] = new int[n];
   
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("--------------------");
        System.out.println(arr[k-1]);
       

        
}}

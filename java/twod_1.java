import java.util.*;
public class twod_1 {
  public static void main(String[] args) 
    {
        Integer arr[] = new Integer[]{32,4,65,78,3,21,68,1};
        int k = 6;

        Arrays.sort(arr);   
        for(int i=0; i<arr.length; i++)
        {
        System.out.println(arr[i]); 
        }   		
        System.out.print(arr[k-1]+"\n");

	}
}
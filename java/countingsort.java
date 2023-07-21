package d23_3;
import java.util.*;
 class countingsort {
    void sort(int arr[],int s)
    {
        int o[] =new int[s+1];

        int max = arr[0];
        for(int i=0;i<s;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int count[] = new int[max +1];
        for(int i=0;i<max;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<s;i++)
        {
            count[arr[i]]++;
        }
        for(int i=0;i<max;i++)
        {
            count[i]+=count[i=1];
        }
        for(int i=s-1;i>=0;i--)
        {
            o[count[arr[i]]-1] =arr[i];
            count[arr[i]-1]--;
        }
        for(int i=0;i<s;i++)
        {
            arr[i]=o[i];
        }
    }
    public static void main(String[] args)
    {
        int[] data = { 4, 2, 2, 8, 3, 3, 1 };
        int s = data.length;
        countingsort c = new  countingsort();
        c.sort(data,s);
        // for(int i=0;i<s;i++)
        // {
        //     //System.out.println(data[i]);
          
        // }
        System.out.println(Arrays.toString(data));
    }
    
}

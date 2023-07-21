import java.util.*;
 class equals_char_string {
    
    public static void main (String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
        char arr1[]=a.toCharArray();
        String b=obj.nextLine();
        char arr2[]=b.toCharArray();
        int count=0;

        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("0");  
        }
         if(arr1.length<arr2.length)
        {
        count=arr1.length-arr2.length;
        }
         if(arr1.length==arr2.length)
        {
            for(int i=0;i<a.length();i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    count++;
                }
            }
        }
        if(arr1.length!=arr2.length)
        {
            for(int i=0;i<a.length();i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    count++;
                }
            }
        }
         if(arr1.length>arr2.length)
        {
            count=arr1.length-arr2.length;
        }
    
        System.out.println(count);

        
    



    }
}


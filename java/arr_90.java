/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arr90
{
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0)
        {
            int n1=sc.nextInt();
            int b[]=new int[n1];
            for(int j=0;j<n1;j++)
            {
                b[j]=sc.nextInt();
            }
            int count=0;
            for(int k=0;k<n1;k++)
            {
            if(b[k]>=1000)
            {
                count++;
            }
            }
            System.out.println(count);
            t--;
        }
	}
}

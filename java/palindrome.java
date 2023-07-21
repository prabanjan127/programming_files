import java.util.*;

public class palindrome {

    public static void main(String[] args) 
    {
    Scanner ss = new Scanner(System.in);
    {
        int n = ss.nextInt();
        int rem,rev=0,temp;
        temp=n;
        while(n!=0)
        {
        rem = n%10;
        rev = rev*10+rem;
        n/=10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    }
    }

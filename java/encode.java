import java.util.*;
class encode {
    public static void main(String[] args)
    {
        String s = "aaaabbbccdefaa";
        char ch[]= s.toCharArray();
        int n=0;
        int count;
        for(int i=0;i<s.length()-1;i++)
        {
             count=0;
           if(ch[n]==(ch[i]))
           {
            count++;
           }
           else
           {
            n++;
           }
          
        }
        for(int i=0;i<s.length()-1;i++)
        {
            System.out.println(ch[i]+" "+count);
        }

    }

    
}

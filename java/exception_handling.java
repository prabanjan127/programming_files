import java.util.*;
class exception_handling {
    public static void main(String[] args)
    {

        int a=10;
        int b=0,c=0;
        try{
        c=a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(c);
    }
    
}

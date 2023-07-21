import java.util.*;
class reverse_word {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            String a= sc.nextLine();
            String s = "";
            int l=a.length();
            for(int i=l-1;i>=0;i--)
            {
                s = s+a.charAt(i);
            }
            
            System.out.println(s);
            System.out.println(a.charAt(0));
        }
    }
    
}

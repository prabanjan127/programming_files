import java.util.*;
class anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        if(s1.length()==s2.length())
        {
            char[] ca1 = s1.toCharArray();                                                      
            char[] ca2 = s2.toCharArray();

            Arrays.sort(ca1);
            Arrays.sort(ca2);
            boolean result = Arrays.equals(ca1, ca2);
            if(result)
            {
                System.out.println("anagram");
            }
            else
            {
                System.out.println("not anagram");

            }
            
        }
        else{
            System.out.println("not anagram");
        }

    }
    
}

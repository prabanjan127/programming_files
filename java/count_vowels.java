import java.util.*;
class count_vowels {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
        }
        System.out.println(count);
    }
    
}

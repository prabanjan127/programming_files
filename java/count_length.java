import java.util.*;
class count_length {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            count++;
        }
        System.out.println(count);
        
    }
    
}

import java.util.*;
class count_words2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            String a = sc .nextLine();
            int count=0;
            for(String word:a.split(" "))
            {
                count++;
                System.out.println(word);
            }
            System.out.println(count);
           
        }
    }
    
}

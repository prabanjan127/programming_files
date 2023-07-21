import java.util.*;
class upper_lower {
    public static void main(String[] args) {
 
    Scanner obj = new Scanner(System.in);
    
    {
        char n = obj.next().charAt(0);

        if(Character.isUpperCase(n)) {
            System.out.println("upper_case");
            
        }
        else
        {
            System.out.println("lower_case");
        }

    }
}
}

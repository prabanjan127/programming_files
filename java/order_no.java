import java.util.*;
class order_no{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    System.out.print("Increment: ");

    if (a >= b) { 
        int temp; 
        temp = a;
        a = b;
        b = temp;
    }
    if (c < a) 
    {
        System.out.println(c + " <" + a + "< " + b);
    } else if (c > b) 
    {
        System.out.println(a + "< " + b + "< " + c);
    } else 
    {
        System.out.println(a + "< " + c + "< " + b);
    }
    }
    
}

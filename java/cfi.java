 import java.util.*;

 class cfi {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        {
            int a = obj.nextInt();
            float b = obj.nextFloat();
            String f = obj.nextLine();
            char c = obj.next().charAt(0);
            int d = (int) c;
            System.out.printf("%d %f %s %d", a, b,f,d);
        }
    }
    
}

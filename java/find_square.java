
import java.util.*;
class sqr{
    int a;
    int b;
    void find_square(){
        double power = Math.pow(a, b);  
        System.out.println(power);
    }
}

public class find_square {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        sqr square = new sqr();

        square.a = obj.nextInt(); 
        square.b = obj.nextInt(); 
        square.find_square();


    }
    
}

import java.util.*;
class alpha_no {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        {
            char a = obj.next().charAt(0);
            if (a>=0 && a<=9)
            {
                int i = (int)a;
                System.out.print("a is number");
                if(!(a>=0 && a<=9) ||(a>='a' && a<='z')||(a>='A' && a<='Z'))
                {
                    System.out.print("a is Symbol");
                }
                else                         
                {
                    System.out.print("a is alphabet");
                }
            }

        }
    }}

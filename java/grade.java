import java.util.*;
class grade {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=91)
        {
            System.out.println("Grade A");
        }
        else if(76 <= n && n <= 90)
        {
            System.out.println("Grade B");
        }
        else if(61<=n && n<=75)
        {
             System.out.println("Grade C");
        }
        if(n<=60)
        {
            System.out.println("Grade D");
        }

    }
    
}



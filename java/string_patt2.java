import java.util.*;
class string_patt2 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String a = sc.nextLine();
    
    for(int i=0;i<a.length()-2;i++){
        for(int ic=0;ic<a.length();ic++){
            System.out.print(" ");
            }
    for(int j=a.length()-i-2;j>1;j--)
    {
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++)
    {
        System.out.print("*");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
    }
   

    for(int i=0;i<a.length();i++){
        System.out.print("*");
    }
    System.out.print(a);
    for(int i=0;i<a.length();i++){
        System.out.print("*");
    }
    System.out.println();
    for(int i=0;i<a.length();i++){
        System.out.print(" ");
        }
        for(int i=0;i<a.length();i++){
            System.out.print("*");
            }

    }
    
}

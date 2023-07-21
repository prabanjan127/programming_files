import java.util.*;
class string_patt1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i=0;i<a.length();i++){
        System.out.print(" ");
        }
        for(int i=0;i<a.length();i++){
            System.out.print("*");
            }
            System.out.println();
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

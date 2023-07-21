import java.util.*;
class string_patt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        for(int i=0;i<a.length();i++){
                System.out.print("*");
        }
        System.out.print(a);
        for(int i=0;i<a.length();i++){
            System.out.print("*");
       
        }

System.out.println();

        for(int i=0;i<b.length();i++){
            System.out.print("*");
         }
        System.out.print(b);
        for(int i=0;i<b.length();i++){
            System.out.print("*");  }

System.out.println();

        for(int i=0;i<c.length();i++){
            System.out.print("*");
        }
        System.out.print(c);
        for(int i=0;i<c.length();i++){
        System.out.print("*");

        }
   
}
}


import java.util.*;
class string_rotation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     String a = "ABC";
     String b = "BAC";
     String c = a+b;
     String w = sc.nextLine();
     System.out.println(c.contains(w));
     if(c.contains(w)) 
     {
      System.out.println(a.indexOf(w));
        System.out.println("yes");
     }
     else{
        System.out.println("no");
     }
     

     
    }
    
}

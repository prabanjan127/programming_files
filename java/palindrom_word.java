import java.util.*;
class palindrom_word {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str="";
        String s=sc.nextLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            str = str +s.charAt(i);
        }
        if(s.equalsIgnoreCase(str))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
}

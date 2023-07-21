import java.util.*;
class duplicate_sting
{
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    String s =  sc.nextLine();
    String w = sc.nextLine();
    String a[] = s.split(" ");
    int count=0;
    for(int i=0;i<a.length;i++)
    {
    if(w.equals(a[i]))
    {
        count++;
        System.out.println(a[i]);
    }
    }
    System.out.println(count);
}
}


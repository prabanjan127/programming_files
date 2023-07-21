import java.util.*;
class linkedlist
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a=new LinkedList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        System.out.println(a);
        
    }
}
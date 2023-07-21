import java.util.*;
class arraylist {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();

        al.add(1);
        al.add(3);
        al.add(2);
        a.addAll(al);
        System.out.println(a);

        al.set(1,4);
         a.addAll(al);
        System.out.println(al);
        System.out.println(a);
        int n1=al.get(1);
        System.out.println(n1);
        int n2=al.remove(0);
        System.out.println(n2);
        System.out.println(al);
        int size=al.size();
        System.out.println(size);
        al.sort(Comparator.naturalOrder());
        System.out.println(al);
        al.sort(Comparator.reverseOrder());
        System.out.println(al);
        int n= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            b.add(sc.nextInt());
            System.out.println(b);
        }
        System.out.println("--------------------------");
        System.out.println(b);
    }
    
}

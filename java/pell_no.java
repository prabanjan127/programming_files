import java.util.*;
class pell_no {

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
int o=0;
int d=1;
int a=0;
System.out.println(o+" ");
System.out.println(d+" ");
while(n-->2)
{
a=o*2+d;
d=o;
o=a;
System.out.println(a);
}

}
}
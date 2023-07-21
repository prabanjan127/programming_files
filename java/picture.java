import java.util.*;
class picture {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        {
            int l = s.nextInt();
            int n =s.nextInt();

            for(int i=0;i<n;i++)
            {
            int a =s.nextInt();
             int b =s.nextInt();
            
             if(a<l || b<l)
             {
                System.out.println("upload");
             }
             if(a==l && b==l)
             {
                System.out.println("accepted");
             }
             if(a>l && b>l)
             {
                System.out.println("crop it");
             }
             
            }
            
        }
    }
    
}

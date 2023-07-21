package d_15_3;
import java.util.*;
class area{
        int area;
              void  rect(int a,int b)
                {
                         area=a*b;
                       
                }
               void squr(int a)
                {
                        area=a*a;
                      
                }
              void  tri(int a,int b)
                {
                         area=(a*b)/2;
                       
                }
                void display()
                {
                        System.out.println(area);
                }
}
 class areamain {
    public static void main(String[] args)
            {
                area a = new area();
                a.rect(2,4);
                a.display();
                a.squr(6);
                a.display();
                a.tri(2,6);
                a.display();
                
               

        
    }
    
}

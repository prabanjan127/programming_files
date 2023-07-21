package d_15_3;

public class area{
    int result;
   int c=2;
            area(int a)
            {
                result=a*a;
            }
            area(int d ,int b,int c)
            {
                result= (d*b)/c;
            }
            area(int f ,int v)
            {
                result= (d*b)/2;
            }
            void display()
            {
                System.out.println(result);
            }
    public static void main(String[] args)
    {
        area squar =new area(2);
        area rect =new area(2,4);
        area tri =new area(2,4);
       
        squar.display();
        rect.display();
        tri.display();


    }
}
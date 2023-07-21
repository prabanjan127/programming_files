import java.util.*;
class rect{
    void display1()
    {
        System.out.println("hi");
    }
}
class sqrrr extends rect{
void display()
    {
        System.out.println("bye");
    }
}
class hierarchical_inheritance {
    public static void main(String[] args)  
    {
        sqrrr sc = new sqrrr();
        sc.display1();
        sc.display();
    }
    
}

// class copy_constructor {
//     int a;
//     int b;
//     copy_constructor(int r,int s)
//     {
//         a=r;
//         b=s;
//     }
//     copy_constructor(copy_constructor b2)
//     {
//         a=b2.a;
//         b=b2.b;

      
//     }
//     void display(){
//         System.out.println(a);
//         System.out.println(b);
//     }
// public static void main(String[] args) {
//  copy_constructor b = new  copy_constructor(1,5);
// copy_constructor b1 = new  copy_constructor(b);
// b.display();
// }    
// }
class copy_constructor {
    int a;
    int b;
    copy_constructor(int r,int s)
    {
        a=r;
        b=s;
    }
    copy_constructor() {}
    void display(){
        System.out.println(a+" "+b);
    }
public static void main(String[] args) {
 copy_constructor b = new  copy_constructor(1,5);
copy_constructor b1 = new  copy_constructor();
b1.a=b.a;
b1.b=b.b;
b1.display();
}    
}
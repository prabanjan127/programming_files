
// class constructor {
//     constructor()
//     {
//         int a=1;
//         int b=2;
//         int c=a+b;
//         System.out.println(c);
//     }
// public static void main(String[] args) {
//  constructor b = new  constructor();

// }    
// }

// class constructor {
//     int a;
//     int b;
//     int c;
//     constructor(int r,int s)
//     {
//         c=r+s;
      
//     }
//     void display(){
//         System.out.println(c);
//     }
// public static void main(String[] args) {
//  constructor b = new  constructor(1,5);
// b.display();
// }    
// }

class constructor {

    int c;
    String name;
    constructor(int r,int s)
    {
        c=r+s;
    }
    constructor(int r,int s,String g)
    {
        c=r+s;
        name=g;
    }
    void display(){
        System.out.println(c+name+" ");
    }
public static void main(String[] args) {
 constructor b = new  constructor(1,5);
 constructor b1 = new  constructor(5,5,"name");
b.display();
b1.display();
}    
}



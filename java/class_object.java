
//   class class_v {
//      int id=1;
//     String name="name ";

//   public static void main(String[] args) {
//    class_v s1 = new class_v();

//    System.out.println(s1.id);
//     System.out.println(s1.name);
    
// }    
//  }
// class student
// {
//     int id;
//     String name;
// }
// class test
// {
//     public static void main(String[] args)
//     {
//         student s1 = new student();
//         student s2 = new student();
//         s1.id=10;
//         s1.name="name";
//         s2.id=1;
//         s2.name="ns";
//         System.out.println(s1.id + " " +s1.name);
//         System.out.println(s2.id + " " +s2.name);
//     }
// }
class student{
    int roll;
    String name;
    void insert(int r,String n)
    {
        roll = r;
        name =n;
    }
    void display()
    {
        System.out.println(roll+" "+name);
    }
}
    class test{
        public static void main(String[] args) {
            student s1 = new student();
            s1.insert(55,"name");
            s1.display();
    }
}
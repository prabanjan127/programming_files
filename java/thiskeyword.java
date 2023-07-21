class superclass
{
    int age;
    superclass(int age)
    {
        this.age=age;
    }
    public void getage()
    {
        System.out.println(age);
    }
}
class thiskeyword extends superclass{
    thiskeyword(int age)
    {
        super(age);
    }
    public static  void main(String[] args){
        thiskeyword s= new thiskeyword(24);
        s.getage();
    }

    
}

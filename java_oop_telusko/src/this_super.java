class A
{
public A()
{
    super();
    System.out.println("in A");
}

public A(int a)
{  super();
    System.out.println("in A int");
}

}

class B extends A
{
    public B()
    {  super();
        System.out.println("in B");
    }

    public B(int a)
    {  //super(a);//in A int

        this();
        System.out.println("in B int");
    }
}

public class this_super
{
    public static void main(String[] args)
    {
        B obj=new B(5);
//        B obj1=new B();
    }
}

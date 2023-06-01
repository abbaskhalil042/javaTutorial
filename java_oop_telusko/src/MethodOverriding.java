
class Cal
{
    public int add(int a,int b)
    {
        return a+b;
    }
}

class Advcal extends Cal
{
public int add(int a, int b)
{
    return a+b+2;
}
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
//        A3 obj=new A3();
         Advcal obj=new Advcal();//it works
       int r= obj.add(3,5);
        System.out.println(r);//overrided


    }
}

/*method overriding - if a child has the same method as declared in parents class , in is known as
method overriding in java.*/
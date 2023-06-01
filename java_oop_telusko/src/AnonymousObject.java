class A1
{
    public A1()
    {
        System.out.println("object created");
    }

    public void show()
    {
        System.out.println("in A show ");
    }

}

public class AnonymousObject
{
    public static void main(String[] args)
    {
        int marks;
        marks = 99;

        //similarly like above we can create
//        A1 obj;//declaring
//        obj=new A1();//assigning - this is where you create the obj.
//        obj.show();

        new A1().show();//anonymous object.

//        A1 obj=new A1();
//        obj.show();
    }
}

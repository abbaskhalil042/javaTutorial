class Mobile
{
    String brand;//these are instance variable
    int price;//instance variable
    static String name;//a variable which is come for every obj.
// static variable should be call by class name.
    //u can call it by obj also but avoid it.

    static//static block
    {
        name="phone";
        System.out.println("static block ");
    }


    public Mobile()
    {
        brand="";
        price=200;
        System.out.println("in constructor");
    }
    public void display()
    {
        System.out.println(brand+":"+price+":"+name);
    }

 public static void static_method(Mobile obj1)//static method.
 {
     System.out.println(obj1.brand+":"+obj1.price+":"+name);
 }

}

public class static_keyword {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("Mobile");//forname function used to load the class.
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=70000;
        Mobile.name="smartphone";

        Mobile obj2=new Mobile();
        obj1.brand="Apple";
        obj1.price=70000;
        Mobile.name="smartphone";

//        obj1.display();
//        obj2.display();

//        obj1.static_method();
        Mobile.static_method(obj1);//indirect way to use non-static variable
//        obj1.name="smartphone";// you can call it by obj name.




    }
}

// abstract class A {
//      public abstract void show();
//      public abstract void config();
// }

// when u have abstract class and contains only abstract method so for that we have another way do so....and that is *interface*
//so instead of creating abstract class we can create interface.....remember interface is not a class....and it's a main difference.
//and by default every method in interface is public abstract so those two keywords are not required even if you mentioned or not
//syntax...............

interface A {

    int age = 20; // all the variabel are by default final and static in interface, since these
                  // are static so we can use directly by interface name
    String area = "patna";

    // declaring methods
    // public abstract void show();//or
    void show();

    // public abstract void config();//or
    void config();
}

// question is how will we instantiate it....as we know abstract class can't be
// instantiate.

// interface just show how you have to work....it tells you what are the methods
// you need....but i will not implement that it's your(talking about class) job
// to implement....it just show you the design.

class B implements A {
    // implements is a keyword to implement the interface .... when you implements
    // the interface then it's become compulsory for you to define the methods

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

}

public class demo {

    public static void main(String[] args) {

        A obj;// interface reference ..... it is okay
        // obj=new A();// but u can't instantiate it.

        // so now you can create obj of concrete class

        obj = new B();
        obj.config();
        obj.show();

        A.area="siwan";//will give an error....cuzz its final 
        System.out.println(A.area);

    }

}


/// interface don't have it's own heap memory because it does'nt get instantiated rather the class get instantiated.

//why variable has be to declared static final....???
//->you do not instantiate interface rather you instantiate class ..... and you are not doing extends rather you are doing implement.
//and what you get in implement only the methods....so you don't get the variable in implements.

//and another thing is that interface don't have it's own memroy then how can you have non-final variables




//######### need for interface ############3
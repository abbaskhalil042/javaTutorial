//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface A {
    int age = 20;
    String name = "abbas";

    void show();

    void config();

}

interface X {
    void run();

}

interface Y extends X// X have been inherited by Y.
{

}

class B implements A, Y {
    // implements is a keyword to implement the interface .... when you implements
    // the interface then it's become compulsory for you to define the methods

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("runnig...");
    }

}

public class Demo1 {

    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        // let's create reference of X
        X obj1;
        obj1 = new B();
        obj1.run();// it will give an error because reference is A and A doesn't know about run()

    }

}

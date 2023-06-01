
// package Abst and anonymous  inner class;

abstract class A {
    public abstract void show();

}

// class B extends A { #if i'm using only once then why i need this...instead i
// can use inner anonymous class

// public void show() {
// System.out.println("in the show");

// }

// }

public class Demo {
    public static void main(String[] args) {
        // A obj=new A();// you can't do that...u can't create of abstract class.

        // ############ Anonymous inner class #############################

        A obj = new A()// this is not a object of A rather it is a obj of anonymous inner class.
        {

            public void show() {
                System.out.println("in A  show");
                // and you can use multiple methods inside anonymous inner class

            }

        };
        obj.show();

        // ######################################################################

    }

}

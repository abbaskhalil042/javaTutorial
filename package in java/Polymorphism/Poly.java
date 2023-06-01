// package Polymorphism;

class Computer {

}

class Laptop extends Computer {

}

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }

}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }

}

public class Poly {
    public static void main(String[] args) {

        // B obj = new B();
        // can i
        A obj;
        // or A obj = new A ();
        obj = new A();// obj is a A type reference variable but the implementation is B.
        obj.show();

        obj = new B();// we are derefrencing the obj of B
        obj.show();// call the show method of B

        obj = new C();
        obj.show();

        // Laptop obj1=new Laptop(); //or

        // Computer obj1=new Laptop();//we r refering the obj as computer but
        // technically it is a laptop.
    }

}

// conclusion : the same object which is obj.show() is behaving differently with
// different obj-polymorphism which is runtime.
// cuzz we don't know obj.show() will call which method of which class.....so
// it's decided at runtime that's why -it's a runtime

// and all this concept is called dynamic method dispatch....for this you need
// inheritance.

//

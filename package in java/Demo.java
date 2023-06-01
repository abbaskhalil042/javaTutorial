
// package com.google.calculation;//agr tumhe open source par project dena hai , you library must have a unique name
// import other.package1.*;
import other.*;//star means all the files not the folders so it's not work

class C extends A {

    public void abc() {
        System.out.println(amarks);// protected but same package so , accessed.
    }
}

public class Demo {
    public static void main(String[] args) {

        // Calcu obj = new Calcu();// first you have to import that
        // AdvCalc obj1 = new AdvCalc();
        A obj = new A();
        // System.out.println(obj.marks);// it's not public
        obj.show();// cuzz it's public

        B obj1 = new B();
        System.out.println(obj1.bmarks);

    }

}

// package Upcasting and Downcasting;
class A {

    public void show1() {
        System.out.println("in A show1");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in B show1");
    }

}

public class demo {
    public static void main(String[] args) {
        // double d = 3.5;
        // int i = (int) d;
        // System.out.println(i);//typecasting

        // A obj=(A) new B(); OR|
        A obj = new B();// upcasting-> child act like parent
        obj.show1();// one thing i got here i.e reference hamara jis type ka wahi call hoga.
        // so that's why ye hua ->// obj.show2();//you can't call this even its belongs
        // to B...cuzz it is type A and A has no idea about show2().

        B obj1 = (B) obj;// DOWNCASTING - it can be but the problem is obj is type of A and here obj1 is
                         // type of B, so
                         // both has to be the same reference

        obj1.show2();

    }
}

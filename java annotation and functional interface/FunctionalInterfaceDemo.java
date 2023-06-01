// an interface that has only one method

@FunctionalInterface
interface A {

    void show(int i);

    // void run();// error
}

// class B implements A {
// public void show() {
// System.out.println("in B show");

// }
// }

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // A obj =new A();//not possible to create an object of interface
        // instead
        // A obj= new B();

        // another way using anonymous class
        // A obj = new A() {
        // public void show() {
        // System.out.println("in show anonymous");
        // }
        // };
        // obj.show();

        // functional interface is used build lambda expression
        // doing same thing as above using lambda expression

        // A obj = (int i, int j) -> System.out.println("in show using lambda
        // expression" + i);
        // or
        A obj = i -> System.out.println("in show using lambda expression" + i);
        obj.show(3);

    }

}

// import java.util.Base64;

// package Inner class;

class A {
    int age;

    public void show() {
        System.out.println("outer class in show");
    }

    static class B {
        public void Innershow() {
            System.out.println("inner class");
        }

    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // B obj1=new B();// give an error
        // A.B obj1 = obj.new B();// proper syntax to call inner class.....it is for
        // non-static class.
        // obj1.Innershow();
        A.B obj2 = new A.B();// static class -> here only inner class can be static,outer can not be static.
        obj2.Innershow();

    }
}

package other;

class Launch {
    public void abc() {
        A obj = new A();
        System.out.println(obj.amarks);
        obj.show();
    }
}

public class A {

    protected int amarks = 6;// accessed in the same package

    public void show() {
        System.out.println("hey A");
    }
}

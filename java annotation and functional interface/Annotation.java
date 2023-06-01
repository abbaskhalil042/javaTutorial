
// @Deprecated//for class-> means u can use it but you can not.
class A {

    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show ");
    }
}

class B extends A {
    @Override()
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();// A

    }

}

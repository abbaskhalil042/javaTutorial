// package Anonymous class;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

// class B extends A { // i don't need this

// public void show() {
// System.out.println("in B show");
// }
// }

public class Demo {
    public static void main(String[] args) {


//############################  ANONYMOUS CLASS####################
        A obj = new A()
         {
            public void show() {
                System.out.println("in new show");

            }
        };
        obj.show();//this show will call the new implementation i.e new show not the A show.
        
//########################### ANONYMOUS CLASS######################



        // A obj1 = new B();
        // obj1.show();
    }

}

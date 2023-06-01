
// package Throw Throws by Naveen;

// class A {
//     public void show() {
//         try {
//             Class.forName("calc");
//         } catch (ClassNotFoundException e) {
//             System.out.println("not able to find the class" + e);
//         }
//     }
// }

//now i don't want to use try 

class A {
    public void show() throws ClassNotFoundException {

        Class.forName("calc");
        // now it's main responsibilty to handle this exception or any other method

    }
}

public class ThrowsException {
    static {
        System.out.println("class loaded");
    }

    public static void main(String[] args) {
        // it's not recommmend to use thorow with main function
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

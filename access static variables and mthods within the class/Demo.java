/*
Static Methods
Static methods are also called class methods. 
It is because a static method belongs to the class rather than the object of a class.
And we can invoke static methods directly using the class name. 

For example...

class Test {
    // static method inside the Test class
    public static void method() {...}
}

class Main {
    // invoking the static method
    Test.method();
}

Here, we can see that the static method
can be accessed directly from other classes
using the class name.


#############
It is because like static methods, static variables are also associated with the class. 
And, we don't need to create objects of the class to access the static variables. 
For example,

class Test {
    // static variable
    static int age;
}
class Main {
    // access the static variable
    Test.age = 20;
}

Here, we can see that we are accessing the 
static variable from the other
class using the class name.







Access static Variables and Methods within the Class
We are accessing the static variable from another class. 
Hence, we have used the class name to access it. 
However, if we want to access the static member from inside the class, 
it can be accessed directly. For example, */

public class Demo {

    // static variable
    static int age;

    // static method
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {

        // access the static variable
        age = 30;
        System.out.println("Age is " + age);

        // access the static method
        display();
    }
}

/*
 * Here, we are able to access the static variable and method directly without
 * using the class name.
 * It is because static variables and methods are by default public. And, since
 * we are accessing from the same class,
 * we don't have to specify the class name.
 */

// STATIC METHODS-> Static and Non-Static Methods
// STATIC VARIABLES->Static and Non-Static Variable

// STATIC BLOCKS->it is used to initialize the static variables.
// the static block is executed only once when the class is loaded
// in memory.
// A class can have multiple static blocks and each static block is executed in
// the same sequence in which they have been written in a program.

// Syntax
/*
 * class Test {
 * // static variable
 * static int age;
 * 
 * // static block
 * static {
 * age = 23;
 * }
 * }
 */

// for example

/*
 * class Main {
 * 
 * // static variables
 * static int a = 23;
 * static int b;
 * static int max;
 * 
 * // static blocks
 * static {
 * System.out.println("First Static block.");
 * b = a * 4;
 * }
 * static {
 * System.out.println("Second Static block.");
 * max = 30;
 * }
 * 
 * // static method
 * static void display() {
 * 
 * System.out.println("a = " + a);
 * System.out.println("b = " + b);
 * System.out.println("max = " + max);
 * }
 * 
 * public static void main(String args[]) {
 * // calling the static method
 * display();
 * }
 * }
 */
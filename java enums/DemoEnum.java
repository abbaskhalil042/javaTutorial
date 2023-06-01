enum Status {
    // Status is class
    RUNNING, FAILED, PENDDING, SUCCESS;// and all these are obj.
}

public class DemoEnum {
    public static void main(String[] args) {

        int i = 5;
        System.out.println(Status.RUNNING);// OR
        // You can access enum constants with the dot syntax:
        Status s = Status.RUNNING;// Every enum is internally implemented by using Class.
        System.out.println(s.ordinal());// it gives us indexes.

        // another way to print
        Status[] ss = Status.values();
        System.out.println(ss[0]);

        // another way to print using Enhance for loop i.e for each loop
        for (Status sss : ss) {
            System.out.println(sss + " = " + sss.ordinal());
        }

    }

}
// Note: The enum constants are usually represented in uppercase.

// Declaration of enum in Java: Enum declaration can be done outside a Class or
// inside a Class but not inside a Method.

// The main objective of enum is to define our own data types(Enumerated Data
// Types).

// A Java enumeration is a class type.

// Enum may implement many interfaces but cannot extend any class because it
// internally extends Enum class

// An enum can, just like a class, have attributes and methods. The only
// difference is that enum constants are public, static and final (unchangeable
// - cannot be overridden).
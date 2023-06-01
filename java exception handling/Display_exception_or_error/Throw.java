// package Display_exception_or_error;

public class Throw {

    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }

}

/*
 * By default, all predefined exceptions are created and thrown implicitly and
 * identified by JVM. But if we want to throw the exceptions explicitly then we
 * have to use the throw keyword.
 * 
 * 
 * The “throw” keyword is used to throw an exception manually. In most cases, we
 * use it for throwing checked exceptions explicitly. The “throw” keyword must
 * follow the Throwable type of object and It must be used in method logic.
 * Since it is a transfer statement, we cannot place a statement after the throw
 * keyword. It leads to a compile-time error “Unreachable statement”.
 * .
 */
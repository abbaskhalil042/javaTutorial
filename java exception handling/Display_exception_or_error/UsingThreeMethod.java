// package Display exception or error;

public class UsingThreeMethod {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println("getMessage  method output");
            System.out.println(ae.getMessage());
            System.out.println();
            System.out.println("toString method output");
            System.out.println(ae.toString());
            System.out.println();
            System.out.println("printStackTrace() method output");
            ae.printStackTrace();
            System.out.println();
            System.out.println("JVM default output");
            throw ae;
            // by using above statement we are just re-throwing the caught exception this
            // exception is caught by JVM default handler and prints full exception messages
            // along with thread name
        }
    }
}

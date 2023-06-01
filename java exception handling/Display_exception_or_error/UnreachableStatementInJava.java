package Display_exception_or_error;

public class UnreachableStatementInJava {

    public static void main(String[] args) {
        System.out.println(m1());
    }

    static int m1() {
        try {
            System.out.println("in try");
            return 10;
        } catch (ArithmeticException ae) {
            System.out.println("in catch");
            return 20;
        } finally {
            System.out.println("in finally");
            return 30;
        }
        System.out.println("after try catch finally"); // unreachable statement
    }
}

// If we place the return statement in the finally block and if we can place
// statement after finally block it leads to CE: “unreachable statements”. Let
// us see a program for better understanding
// package Throw Throws by Naveen;
class AbbasExceptions extends Exception {
    public AbbasExceptions(String string) {

        super(string);//still confusion
    }
}

public class ThrowException {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("i don't want to print zero");// here you are
                // throwihng the error
                // let's create my own exception
                throw new AbbasExceptions("i dont want to print zero ");
            }
        } catch (AbbasExceptions e) {
            // System.out.println("cannot divide by zero");
            j = 18 / 1;
            System.out.println("that's the default output " + e);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
}


//if you want to create your own exception then you need certains thing to keep that mind 
// first- create your class and extends that from Exception then use throw in the method 
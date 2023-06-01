import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {

        // let's create our own exception.........
        class AgeInvalidException extends Exception {

            AgeInvalidException() {
                super("age is invalid !!");
            }
        }

        try {

            // you can use many catch block with try
            System.out.println("programe started.......");
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the first no: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second no: ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(" the result is : " + result);

        }

        catch (ArithmeticException e) {
            System.out.println("dividor can't be zero!!!!!!!");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e)// this is for invalid no meand if you enter char...
        {
            System.out.println("invalid no !!!!");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("error!!!!");
            System.out.println(e.getMessage());
        }

        finally {
            // always gets executed irrespective try and catch run or not
            System.out.println("i am in finally block");
            System.out.println("closing all the resources");

        }
        System.out.println("programe ended.......");
    }
}
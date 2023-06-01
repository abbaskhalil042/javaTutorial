import java.util.Scanner;

public class return_type {
    public static void main(String[] args) {
        System.out.println(sum());
        //0r
        int ans =sum();
        System.out.println(ans);
        /*
        this is going to give the value whatever i have
        returned */

       String message= greet();
        System.out.println(message);
    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        int a,b,sum1;
        System.out.print("enter the first no: ");
        a=in.nextInt();
        System.out.print("enter the second no: ");
        b=in.nextInt();
        sum1=a+b;
        return sum1;
//        System.out.println("function end!");//error : unreachable statement.
        /*
         1. return basically means, whatever i have returned here function call
         going to give this.

        2. return basically means this function is over or end.
         */
        }

    // let's return a stirng:-
    static String greet(){
        String greeting="hello how are you?";
        return greeting;
    }

}

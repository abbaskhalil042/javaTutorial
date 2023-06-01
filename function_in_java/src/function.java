import java.util.Scanner;

public class function {
    public static void main(String[] args) {


//        sum();//it will give error because of access modifier.
        //calling the function:
        sum();//code will start to execute from here.

    }
          /*
         function or methods :- function is a block of code
         */

        /*
        SYNTAX:->
         access modifier (we'll look in oop) Return_type function name(){
        //body
        return statement;
        }
         */
    //e.g:->

    static void sum(){
        Scanner in=new Scanner(System.in);
        int a,b,sum;
        System.out.print("enter the first no: ");
        a=in.nextInt();
        System.out.print("enter the second no: ");
        b=in.nextInt();
        sum=a+b;
        System.out.println("sum is : "+ sum);
    }
}

import java.util.Scanner;

public class parameter_argument {
    public static void main(String[] args) {

//        int ans= sum1();//give error
        int ans=sum1(12,34);
        System.out.println(ans);

        String message1=greet();//without parameter.
        System.out.println(message1);


        String message2=greet1("Abbas khalil");//with parameter.

        System.out.println(message2);

        System.out.print("by taking input from keyboard - ");
        Scanner in=new Scanner(System.in);
        String name=in.next();
        //on the place of name there can name also , we will see further,
//        e.g String naam=in.next();
//        String message3=greet1(naam);

        String message3=greet1(name);
        System.out.println(message3);
        
    }

    //passing parameters means:- pass the value of numbers when you are calling the methods in main().

    static String greet1( String name) {
        String message="hello "+name;
        return message;
    }

    static int sum1(int a , int b){
        int sum=a+b;
        return sum;
    }

    static String greet(){
        String greeting="hey how are you?";
        return greeting;
    }
}

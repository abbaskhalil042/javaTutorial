import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {

        // System.out.println("hello");
        // System.out.print("Enter the no : ");
        // int num = System.in.read();
        // System.out.println(num - 48);
        // we are not getting correct value why cuzz System.in.read() give ascii value
        // for the no you entered

        // so we have special Method

        // System.out.println("enter a no :");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);// it can take input from file ,
        // network.....etc also.

        // int num1 = Integer.parseInt(bf.readLine());//
        // System.out.println(num1);

        // bf.close();// bufferreader is a resource so it's a good practice to close it

        // now we have another best way
        System.out.println("enter the no :");

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);
    }
}
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the radius: ");
        float r=input.nextFloat();
        float pie=3.14F;
        float area=pie*r*r;
        System.out.println("area of cicle is: "+area );


    }
}

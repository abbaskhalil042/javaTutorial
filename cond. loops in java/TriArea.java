import java.util.Scanner;

public class TriArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the base: ");
        int b=input.nextInt();
        System.out.println("enter the height: ");
        int h=input.nextInt();
        int area=((b*h)/2);
        System.out.println("area of triangle is: "+area );
    }
}

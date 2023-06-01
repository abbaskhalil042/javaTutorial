import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the length: ");
        int l=input.nextInt();
        System.out.println("enter the breadth: ");
        int b=input.nextInt();
        int area=l*b;
        System.out.println("area of Rectangle is : "+area+" sq2");
    }
}

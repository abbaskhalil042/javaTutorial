
import java.util.Scanner;

class root_of_quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three numbers for quadrtic equation:\n");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int r1 = (-b + (b * b - 4 * a * c)) / (2 * a);
        int r2 = (-b - (b * b - 4 * a * c)) / (2 * a);
        System.out.println("root of quadratic equation is:" + r1);
        System.out.println("root of quadratic equation is:" + r2);

    }

}
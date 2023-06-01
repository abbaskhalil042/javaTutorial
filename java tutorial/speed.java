// there is confusion in finding the speed 🙄🙄🤔;

import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter initial speed and final speed:");
        int v = input.nextInt();
        int u = input.nextInt();
        int a = input.nextInt();
        // now
        int speed = (v * v - u * u) / (2 * a);
        System.out.println("speed is :" + speed);

    }
}

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("enter the radius:");
        float radius = inputScanner.nextFloat();
        float pie = 3.14f;

        float area = pie * radius * radius;
        System.out.println("area is :" + area);
    }
}

import java.util.Scanner;

public class switch_string_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the fruit:");
        String fruit = input.next();
        switch (fruit) {
            case "apple":
                System.out.println("a sweet red fruit.");
                break;

            case "pineapple":
                System.out.println("my favorite fruit.");
                break;

            case "mango":
                System.out.println("king of fruits.");
                break;

            case "orange":
                System.out.println("round fruit.");
                break;

            case "graspe":
                System.out.println("small size fruit.");
                break;

            default:
                System.out.println("please enter the valid fruit.");
        }
    }
}

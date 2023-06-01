
// #::::::::::::DISPLAY GRADES FOR STUDENTS:::::::::::::
import java.util.Scanner;

public class nested_loop {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("marks in DSA:");
            int DSA = input.nextInt();
            System.out.println("marks in Java:");
            int Java = input.nextInt();
            System.out.println("marks in c_plus_plus:");
            int c_plus_plus = input.nextInt();
            System.out.println("marks in math:");
            int math = input.nextInt();
            System.out.println("marks in english:");
            int english = input.nextInt();

            int total = DSA + Java + c_plus_plus + math + english;
            System.out.println("total is :" + total);

            float average = total / 5;
            System.out.println("average is :" + average);

            if (average >= 60) {
                System.out.println("grade A");
            } else if (average >= 40) {
                System.out.println("grade B");
            } else {
                System.out.println("grade C");
            }
        }

    }

}

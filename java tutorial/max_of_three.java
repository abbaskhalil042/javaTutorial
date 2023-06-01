
package loops_and_conditions;

import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first no:");
        int first = input.nextInt();
        System.out.println("enter the first no:");
        int second = input.nextInt();
        System.out.println("enter the first no:");
        int third = input.nextInt();

        if (first > second && first > third) {
            System.out.println("first is max.");
        } else if (second > first && second > third) {
            System.out.println("second is max.");
        } else {
            System.out.println("third is max.");
        }

    }
}

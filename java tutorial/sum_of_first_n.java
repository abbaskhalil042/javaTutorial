import java.util.Scanner;

public class sum_of_first_n {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number:");
        int n = input.nextInt();
        // formula to finding the first N natural number....is N*(N+1)/2

        int sum = n * (n + 1) / 2;

        System.out.println("the sum of first natural no is:" + sum);

    }
}

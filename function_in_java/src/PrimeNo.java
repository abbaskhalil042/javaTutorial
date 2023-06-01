import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int a=input.nextInt();
        prime();
    }
    static void prime() {
        System.out.print("Enter the no: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        if(a%a==0 && a%1==0){
            System.out.println("no is prime");
        }
        else{
            System.out.println("no is not prime");
        }


    }
}

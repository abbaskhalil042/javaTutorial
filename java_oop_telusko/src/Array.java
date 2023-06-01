
//################## main class#############
public class Array {
    public static void main(String[] args) {

        // int num[]={2,3,4,43};
        //// change
        // num[1]=90;

        int num[] = new int[4];
        num[0] = 2;
        num[1] = 8;
        num[2] = 7;
        num[3] = 3;

        // System.out.println(num[1]);
        // System.out.println(num[2]);
        // System.out.println(num[3]);
        // System.out.println(num[4]);
        // these are lengthy steps for accessing the array
        // here comes loops

        System.out.println("using normal for loop ");
        for (int i = 0; i < 4; i++) {
            System.out.println(num[i]);
        }
        System.out.println();
        System.out.println("using for each loop");
        for (int n : num) {
            System.out.println(n);
        }

    }
}

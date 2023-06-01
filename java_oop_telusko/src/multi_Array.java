public class multi_Array {
    public static void main(String[] args) {

        int num[][] = new int[3][4];
        // normal for loop
        System.out.println("by using normal for loop -> ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("by using enhanced for loop ->");
        // let's use enhanced for loop
        for (int n[] : num) {
            for (int m : n) {
                m = (int) (Math.random() * 10);
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}

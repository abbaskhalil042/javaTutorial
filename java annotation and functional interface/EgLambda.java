@FunctionalInterface
interface A {

    int add(int i, int j);

    // void run();// error
}

public class EgLambda {
    public static void main(String[] args) {

        // A obj = new A() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };
        // int resutl = obj.add(23, 42);
        // System.out.println(resutl);

        // now using lambda expression

        A obj = (int i, int j) -> i + j;

        int resutl = obj.add(23, 42);
        System.out.println(resutl);

    }
}

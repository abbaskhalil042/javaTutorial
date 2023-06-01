//final- it can be used with - variable , method and class

// final class Calc{//prevent inheritance

// }
class Calc {

    final public void show() {
        System.out.println("by abbas ");

    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

}

class AdvCalc extends Calc {
    // public void show() {
    // System.out.println("by Max");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {

        final int num = 2;
        // num = 9; you can't change this now
        // it's good practice to make final
        System.out.println(num);

        // final with method

        Calc obj = new AdvCalc();

        obj.show();
        obj.add(3, 24);

    }

}

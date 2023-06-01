// package Abstract class;

abstract class Car {

    /*
     * abstract method must have abstract class but abstract class can have normal
     * method as well as abstract method.
     */

    public abstract void drive();// abstract method lie only in abstract class
    // if you declare abstract method in abstract class you must define it in extend
    // class
    // otherwise it will through an error

    public abstract void fly();// it's compulsory to define all the abstract method

    public void playMusic() {
        System.out.println("play music");
    }

}

abstract class WagonR extends Car {
    public void drive()

    {
        System.out.println("Driving...... ");
    }

    public void fly() {
        System.out.println("fly.....");
    }
}

class AdvWagonR extends WagonR
/*
 * it's a concrete class -> so you can create obj of concrete not abstract
 * class.
 */
{
    public void fly() {
        System.out.println("flying .....");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car obj = new AdvWagonR();
        /*
         * yaha par tum Car jo ki asbtract hai uska obj nahi bana sakte,haa reference
         * ban saktah so instead of
         * Car() it will be WagonR().
         * you can't creat obj of abstract class.
         * if you have abstract class then you will have to creat another non-abstract
         * class in
         * order to implement abstract class.
         * - so WagonR can't be abstract if it is then it will give error.
         */
        obj.drive();// here is happening Runtime polymorphism
        obj.playMusic();
        obj.fly();
    }
}

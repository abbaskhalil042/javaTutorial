// enum Size {

//     // enum constants calling the enum constructors
//     SMALL("The size is small."),
//     MEDIUM("The size is medium."),
//     LARGE("The size is large."),
//     EXTRALARGE("The size is extra large.");

//     private final String pizzaSize;

//     // private enum constructor
//     private Size(String pizzaSize) {
//         this.pizzaSize = pizzaSize;
//     }

//     public String getSize() {
//         return pizzaSize;
//     }
// }

// class ConstructorEnum {
//     public static void main(String[] args) {
//         Size size = Size.SMALL;
//         System.out.println(size.getSize());
//     }
// }

//another example using constructor

enum Laptop {
    MACBOOK(2000), XPS(2200), SURFACE, THINKPAD(1800);// these all are obj

    private int price;

    // default constructor for surface
    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;

        System.out.println("in laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        this.price = 23424;
    }

}

class ConstructorEnum {
    public static void main(String[] args) {
        Laptop lap = Laptop.MACBOOK;
        System.out.println(lap + " : " + lap.getPrice());
        // we can't print the price cuzz they're private..so we can create our own
        // methods that is getters ans setters.
        // now
        System.out.println(lap.getPrice());

        // printing all the laptops
        for (Laptop lap1 : Laptop.values()) {
            System.out.println(lap1 + " : " + lap1.getPrice());
        }
    }
}
// package RunTimeOrDynamicMethodDispatchPoly;

class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog is eating...");
    }
}

class AnotherExNotGet extends Dog {
    public static void main(String args[]) {
        Animal a = new AnotherExNotGet();
        a.eat();
    }
}

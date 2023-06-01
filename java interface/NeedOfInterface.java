interface Computer {
    public abstract void code();
   
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code,compile and run ....in laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println(" code , compile and run faster....in Desktop");
    }
}

class Developer {
    public void devApp(Computer lap)// here developer is dependant on laptop....tight coupling.
    // he should be able to work on any system.....so how can we make it flexible by
    // creating a class called computer for both
    // laptop will be replaced by Computer in arg.
    {
        lap.code();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {

        // Laptop lap=new Laptop();// can't do this
        Computer lap = new Laptop();// but we can do that....cuzz reference is parent class and obj of child class
        Computer desk = new Desktop();

        Developer abbas = new Developer();
        abbas.devApp(desk);
        abbas.devApp(lap);
    }

}

// now we have made this loselly couple .... developer will neither depend on laptop or desktop but it will depend on computer.


//########### why we need interface or use.
//so initially we have declared a code method which was useless just for desing.
// and then we make it abstract method and then class ..... so why we are doing this ....?
//rather we can use interface instead.....cuzz we are just designing.
//so finally we made it interface and instead of extends we use implements.
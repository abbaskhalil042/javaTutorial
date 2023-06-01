public class Shadowing {
   static int x=10;//this will be shadowed at line 11
    public static void main(String[] args) {
        System.out.println(x);//10
        /*
        what is shadowing:- shadowing in java is basically a practice of
        using two variables with the same name within the scope that overlaps.
         */
        //let's say,
        /*int x=12;//the class variable at line 2 is shadowed by this.
        System.out.println(x);//12*/
        int x;
//        System.out.println(x);//Variable 'x' might not have been initialized
        x=23;//initialized, so scope will begin when the value is initialized.
        System.out.println(x);
        fun();


    }
    static void fun(){
        System.out.println(x);//10

        //shadowing affect doesn't take place in methods so , in method is not work that way
    }
}

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {

        /*
        overloading is basically means two or more function having same name
        but different argument or parameters.
         */
        /*
        function overloading - compile time it's going decide function is to run,
        it's happen at compile time .
        but function overriding happens at run time.
         */

        //there are two ways first is ,(1)- either the no of argument should be different or type.
        fun(23);
//        fun("abbas",21);
        System.out.println(sum(23,12));
        System.out.println(sum(12,3,23));

//        System.out.println(demo(1,23,4));//error why???
//        System.out.println(demo("abbas"));//error why???
        demo(1,23,4);
        demo("abbas");
//        demo();//error: ambiguity.....it cannot  be empty.
    }
    static void demo(int ...x){
        System.out.println(Arrays.toString(x));
    }
    static void demo(String ...x){
        System.out.println(Arrays.toString(x));
    }
    static int sum(int a , int b){
        return a+b;
    }

    static int sum(int a , int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("first");
        System.out.println(a);
    }
    static void fun(String name,int a){

        System.out.println(name);
    }
}

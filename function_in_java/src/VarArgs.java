import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,24,21,12,3,31,124,43,12);//know as variable length argument, length is not constant.
        fun();//empty or zero.
        multiple(2,21,"abbas","khalil");//it's amazing

    }

    static void fun(int ...a){
        /*if u don't know how many integer you are passing then use ...variable_name
       this internally it's taking an array of integer.
       if String then array of string,
       if char then array of char.
        */
        System.out.println(Arrays.toString(a));//toString make this array as original looks.
    }
    static void multiple(int a,int b,String  ...x){
        //variable length argument always at the end.
        //not like int ...x,int a,int b or int a,int ...x, int b;
    }
}

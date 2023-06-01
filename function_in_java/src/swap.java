public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // swap the numbers
//        int temp;
//        temp=a;
//        a=b;
//        b=temp;

        Swap(a,b);
        System.out.println(a +" "+ b);//

        String name="abbas";
        changeName(name);
        System.out.println(name);


    }
    //        Now let's try to do this in function
 static void changeName(String name) {
        name ="khalil";//not changing the name actually but u R creating a new object.
        // won't changed. 00:33:00 min
    }


     static void Swap(int a, int b) {
        int temp;
//        temp=a;
//        a=b;
//        b=temp;
         //won't swapped.

    }
    // LET'S SEE IN THE ANOTHER SECTION THAT IS, how things works internally in passing .


}

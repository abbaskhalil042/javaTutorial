public class Scoping {

    public static void main(String[] args) {
        //scope basically means ,where we can access our variable.
        int a=19;
        int b=20;
//        System.out.println(num);//u can't access this.
//        System.out.println(marks);//you can't

        String name="abbas";

        /*
        anything that is initialized outside the block can be used inside but anything
        initializing inside the block can't be used outside.

        similarly,
        anything that is initialized outside the block cannot be again initialized inside the block
        but anything initialized inside the block can again be initialized outside the block.
         */

        {
            //block scope .

//            int a =12;//a is already initialized outside the block in the same method ,hence you can not be initialized again,but
            a=12;//you can modify it,and reassign the original ref var to some other value.
            System.out.println(a);//
            int c =132;
            //so value initialize in this block, will remain in this block.

            name="khalil";
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);//you can't access outside the block.
        //scoping in for loop.

        for (int i=0; i<4;i++){
            System.out.println(i);
            int num=30;
//            int a=14;//can't initialize again.
            a=100;//changing the original value.
        }
//        System.out.println(i);//can't access,but
        System.out.println(a);
    }
    static void random(int marks){
//        System.out.println(a);//a, you can't access inside this function.
        int num=10;
        //this change will only be valid in this function scope only.

        //these are function scope.

    }
}

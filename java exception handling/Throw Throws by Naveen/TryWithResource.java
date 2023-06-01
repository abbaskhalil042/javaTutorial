import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package Throw Throws by Naveen;

public class TryWithResource {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i = 0;
        // int j = 0;

        int num = 0;
        // BufferedReader br=null;

        // try {
        //     // j = 18 / i;
        //     // System.out.println("bye");//intead of wriring here i can write it in finally
        //     // block

        //     System.out.println("enter the no");
        // //     InputStreamReader in = new InputStreamReader(System.in);
        // //    br = new BufferedReader(in);
        //    //or
        //    br = new BufferedReader(new InputStreamReader(System.in));

        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        //     // br.close();//where it should be closed ? so here comes finally
        // }

        // finally {
        //     // System.out.println("bye");// finally is a block which execute whehter exception found or not
        //     // and you can skip catch
        //     // why it is used ?
        //     // it is used to close the resource
        //     //finally block is meant for closing the resource
        //     br.close();
        // }





// now let's do the actuall thing try with resources
//these are the syntax try with resources
//if you do this then resources will be closed automatically

try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
{
    System.out.println("hey");
num=Integer.parseInt(br.readLine());
System.out.println(num);

}
    }
}
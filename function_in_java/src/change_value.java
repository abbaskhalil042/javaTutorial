import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        //create an array

        int[] arr={1,2,34,53,22};
        change(arr);
        System.out.println(Arrays.toString(arr));//toString??

    }
    static void change(int[] nums){
        nums[0]=99;//if u make a change to the object via this ref variable , same obj will be changed.
    }
}

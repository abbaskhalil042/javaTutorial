import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collectionInterface {
    public static void main(String[] args) {

        // Collection<Integer> nums = new ArrayList<Integer>();//collectiion does't give
        // index value
        // nums.add(4);
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);

        // for (int n : nums) {

        // System.out.println(n);

        // }

        List<Integer> nums = new ArrayList<Integer>();// collectiion does give index value
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        for (int n = 0; n < nums; n++) {

            System.out.println(n);

        }

    }
}

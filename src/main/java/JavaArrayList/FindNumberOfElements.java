package JavaArrayList;


import java.util.ArrayList;
import java.util.List;

public class FindNumberOfElements {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(8);
        nums.add(4);
        nums.add(1);
        nums.add(6);

        int numOfEl = nums.size();

        for (Integer w : nums){
            if(w>numOfEl){
                System.out.print(w + " ");

                // note that in an interview:
                // number of elements in an "Array" = use length() method
                // number of elements in an "List" = use size() method


            }
        }
    }
}

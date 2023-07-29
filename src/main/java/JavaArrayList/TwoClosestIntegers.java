package JavaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoClosestIntegers {
    public static void main(String[] args) {

        // find the minimum difference between integers
        // when you are trying to find the difference between integers and you are using Index in the
        // solution you have to start with 1 because index does not work with negative numbers
        // if you start at 0 and subtract 1 from 0 you will end up with a negative number and will not work.

        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(10);
        nums.add(7);
        nums.add(15);

        Collections.sort(nums);
        System.out.println(nums);

        int minDiff = nums.get(1) - nums.get(0);



        for(int i = 1; i<nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1)); // comparing the number at index get(i) and get(i-1)
                                                                    // to minDiff ane which ever is lower will save in minDiff.


        }
        System.out.println(minDiff); //2

        for (int i=1; i<nums.size(); i++){
            if (nums.get(i) - nums.get(i-1) == minDiff){ // if these elements == minDiff then they are the closest elements.
                System.out.println(nums.get(i) + " and " + nums.get(i-1)); //7 and 5
            }
        }


    }
}

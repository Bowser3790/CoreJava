package JavaArray;

import java.util.Arrays;

public class IntegerArrayGreaterThan10Char {
    public static void main(String[] args) {
        int nums[] = new int[7];
        nums[0] = 100;
        nums[1] = 5;
        nums[2] = 77;
        nums[3] = 50;
        nums[4] = 7;
        nums[5] = -3;
        nums[6] = 15;

        // create an integer array and print elements greater than 10 on the console.

        for (int w: nums){
            if (w>10){
                System.out.println(w);
            }
        }
        Arrays.sort(nums);

        for (int t = nums.length-1; t>0; t--){
            if (nums[t]<11){
                break;
            }else{
                System.out.println(nums[t]);
            }
        }
        // another way to do this is with continue statement which will skip the number and move to the next number.
        for (int i : nums){
            if (i<=10){
                continue;
            }else{
                System.out.println(i + " ");
            }
        }

    }


}

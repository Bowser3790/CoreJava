package JavaArray;

import java.util.Arrays;

public class convert2dimensionArrayOneDimensionArray {
    public static void main(String[] args) {
        // convert 2 dimensional array into 1 dimensional array

        //1. Step: find the number of elements in the multidimensional array

        int a[][] = {{10,2}, {5,1,17}};
        int sum= 0;

        for (int[] w : a){
            sum = sum + w.length;// this is counting the number of elements in each array which is 5 in this case.

        }
        System.out.println(sum);
        //2. Step: Create new 1 dimensional array whose length is the same with number of
        // elements in the multidimensional array
        int b[]= new int[sum];
        // 3. Transfer the elements from the multidimensional array to the 1 dimensional array
        int idx = 0;
        for (int[] w: a){
            for (int k : w){
                b[idx]= k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));




    }
}

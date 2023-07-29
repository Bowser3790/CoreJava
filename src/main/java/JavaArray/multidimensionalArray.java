package JavaArray;

import java.util.Arrays;

public class multidimensionalArray {
    public static void main(String[] args) {
        // how to create a multidimensional Array

        int arr[][] = new int[4][2];// this means that there are a total of 4 elements with 2 elements in each array.

        System.out.println(Arrays.deepToString(arr));// deepToString is for multidimensional array, [[0, 0], [0, 0], [0, 0], [0, 0]]

        arr [0][0] = 3;
        arr [0][1] = 10;

        arr [1][0] = 60;
        arr [1][1] = 70;

        arr [2][0] = 40;
        arr [2][1] = 25;

        arr [3][0] = 99;
        arr [3][1] = 15;

        System.out.println(Arrays.deepToString(arr)); // deepToString for multidimensional arrays only.
        System.out.println(Arrays.toString(arr[1])); // you cannot use deepToString here because it is an array not
                                                        // a multidimensional string and would only work using toString.

        // how do you print array elements one by one

        System.out.println(arr[2][1]); //25

        // how to use different number of elements in inner arrays
        int brr [][]= { {12,45}, {33}, {76,3,-21}};
        System.out.println(Arrays.deepToString(brr)); //[[12, 45], [33], [76, 3, -21]]

        //type the code to find the sum of all elements in an integer multidimensional array
        // video 14 day 13... 2 hrs in

        int crr[][]= {{5,34},{12,98,-7}};
        int sum = 0;

        for (int[] w : crr){
            for (int u : w){
                sum = sum + u;
            }
        }
        System.out.println(sum);
    }
}

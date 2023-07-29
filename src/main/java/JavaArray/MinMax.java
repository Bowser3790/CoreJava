package JavaArray;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int ages[] = new int[6];
        //System.out.println(ages);

        ages[0] = 13;
        ages[1] = 21;
        ages[2] = 29;
        ages[3] = 39;
        ages[4] = 17;
        ages[5] = 75;

//        System.out.println(Arrays.toString(ages));
//
//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));
//
//        int sumOfMinMax = ages[0] + ages[ages.length-1];
//        System.out.println(sumOfMinMax);
// or
        int minValues = ages[0];
        int maxValues = ages[0];


        for (int w: ages){

            minValues = Math.min(minValues, w);
            maxValues = Math.max(maxValues, w);


        }
        System.out.println(minValues);
        System.out.println(maxValues);
        System.out.println(minValues + maxValues);
    }
}

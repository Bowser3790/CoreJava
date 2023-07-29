package JavaArray;

public class sumOfMinMaxElementsMultiDarray {
    public static void main(String[] args) {
        int b[][] = {{2, 5}, {30,20,10}};

        int minVal = b[0][0];// here we are making the first elements the min value as we loop through the values will change.
        int maxVal = b[0][0];// same for this, as we compare values looking for max values will change. This sets the starting values.
        int sum = 0;

        for (int[] w : b){
            for (int k : w){
                minVal= Math.min(minVal,k);
                maxVal= Math.max(maxVal,k);
            }
        }
        System.out.println(minVal + maxVal);
    }
}

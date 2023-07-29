package JavaArray;

public class multiplyMultidemensionalArray {
    public static void main(String[] args) {

        // Type code to find the multiplication of all elements of multidimensional array
        int b[][] = {{20, 5}, {30,2}};

        int multiplication = 1;
        for (int[] w : b){
            for (int k : w){
                multiplication=multiplication*k;

            }


        }
        System.out.println(multiplication);
    }

}

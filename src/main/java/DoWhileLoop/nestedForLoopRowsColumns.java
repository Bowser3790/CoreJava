package DoWhileLoop;

public class nestedForLoopRowsColumns {
    public static void main(String[] args) {
        // nested loop half pyramid
        int numOfRows = 5;

        for (int i = 1; i<=numOfRows; i++){
            for (int k = 1; k<=i; k++){
                System.out.print(k);

            }
            System.out.println();
        }
    }
}

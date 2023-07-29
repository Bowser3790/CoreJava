package DoWhileLoop;

public class MultiplyIntegers {
    public static void main(String[] args) {
        // type code to calculate the multiplication of integers from 3 to 6
        // 3*4*5*6 ==> 360
        int multiplication = 1;

        for (int i = 3; i<7; i++){
            multiplication = multiplication * i;
        }
        System.out.println(multiplication);


    }

}

package JavaArray;

import java.util.Arrays;

public class IntegerArrayLessThan10Char {
    public static void main(String[] args) {
        // Createl array integer array and print elements less than 10 on the console

        int ages[] = new int[7];

        ages[0]= 12;
        ages[1]= 22;
        ages[2]= 10;
        ages[3]= 99;
        ages[4]= 5;
        ages[5]= -19;
        ages[6]= 3;

        for (int w: ages){
            if (w<10){
                System.out.println(w + " ");
            }
        }
        Arrays.sort(ages);

        for (int w: ages){
            if (w>=10){
                break;

            }else {
                System.out.println(w + " ");
            }
        }


    }
}

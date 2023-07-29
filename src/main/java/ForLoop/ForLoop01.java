package ForLoop;

public class ForLoop01 {
    public static void main(String[] args) {
        // Type all integers from 11 to 44 in the same line with a space between consecutive integers 11, 12, 13, 14...

        int i;
        for (i = 11; i < 15; i = i + 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        // type odd integers from 68 to 13 in the same line with a space between consecutive integers.
        int j;
        for (j=64; j>=13; j=j-1 ){
            if (j%2!=0){
                System.out.print(j + " ");
            }
        }
        for(char ch = 'c'; ch < 'v'; ch++){
            System.out.print(ch + " ");
        }
        // note that if you use char with mathmatical values then java will use ascii values.

        for (int d='a'-'a'; d<'e'; d++){
            System.out.println(d + " ");
        }
        // note you can use "int" as data type for char data
        // if you use "char" as data type for "char"s Java gives you the character
        // If you use "int" as data type for "char"s Java gives you the ASCII value of the char

        char ch = 'm';
        System.out.println(ch);//m
        int dh = 'm';
        System.out.println(dh);//109



    }
}

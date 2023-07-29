package JavaArray;

public class integerArray {
    public static void main(String[] args) {
        // create an integer array, add 6 elements in it. Find the sum of all elements.

        int ages[] = new int[6];
        System.out.println(ages);

        ages[0] = 13;
        ages[1] = 21;
        ages[2] = 29;
        ages[3] = 39;
        ages[4] = 17;
        ages[5] = 75;

        int sum = 0;
        for (int w : ages){
            sum = sum + w;
        }
        System.out.println("The sum of all ages is: " + sum);
    }
}

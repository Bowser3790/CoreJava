package StringManipulations01;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        // type code to swap two integers a=12 b=5  and b = 12
        int a = 12;
        int b = 5;

        System.out.println(a + " " + b);

        int temp = 0;

        temp = a;

        a=b;

        b=temp;

        System.out.println(a+ " " + b);

    }
}

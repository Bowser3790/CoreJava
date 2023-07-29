package StringManipulations01;

public class dy07ifstatmentTernaryStatment {
    public static void main(String[] args) {
        // ternary statment even or odd?
        int num = 8;
//
//        if (num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
    // Ternary statment where the even in it checks for a true statment odd is where checks for false statment.
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println(result);

        int n = 143;
        n=Math.abs(n);

        String r = n>99 && n<1000 ? "It has 3 digits" : "It does not have 3 digits";
        System.out.println(r);
    }
}

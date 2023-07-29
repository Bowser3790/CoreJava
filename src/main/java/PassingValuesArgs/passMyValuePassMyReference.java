package PassingValuesArgs;

public class passMyValuePassMyReference {
    public static void main(String[] args) {
        int shirtPrice = 100; // pass by value goal is to retain origional value of variable.

        // using a method inside of your main method is called a "Method Call"

        studentShirtPrice(shirtPrice, 10); // 90
                            // we are calling the method we created below.

        String name = "Christopher";
        String result = putExclamation(name);
        System.out.println(result);

        System.out.println(name);

        double newSalary = increaseSalary(20000);
        System.out.println(newSalary);

        int numAbsoluteVal = absValue(-3);
        System.out.println(numAbsoluteVal);

    }

    // this is a method that we created and we have not used this method inside the main method.
    public static void studentShirtPrice(int shirtPrice, int discount){ // this is saying we should accept two
                                                                        // integers over here when calling the
                                                                        // method in the main class
        int discountedPrice = shirtPrice - discount;
        System.out.println(discountedPrice);

    }

    public static String putExclamation(String name){
        return name + "!";

    }

    public static double increaseSalary(double salary){
        return salary*1.2;


    }

    public static int absValue(int n){
        if(n<0){
            return -1*n;
        }else{
            return n;
        }
    }


}

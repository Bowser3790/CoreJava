package StringManipulations01;

public class joinMultipleStrings {
    public static void main(String[] args) {
        String u1 = "Park";
        String u2 = "Gym";
        String u3 = "School";

        String result1 = u1 + u2 + u3;
        System.out.println(result1);

        // way #2

        String result2 = u1.concat(u2).concat(u3);
        System.out.println(result2);
    }
}

package StringManipulations01;

public class StringManipulationIndex {
    public static void main(String[] args) {
        String y = "miami";

        char ch = 'a';

        boolean r1 = y.indexOf(ch) == y.lastIndexOf(ch);
        System.out.println("is the character unique? " + r1);
    }
}

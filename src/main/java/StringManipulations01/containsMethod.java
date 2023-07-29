package StringManipulations01;

// methods used: contains(), replaceFirst(word,replacement), concat(), repeat(4)

public class containsMethod {
    public static void main(String[] args) {
        String w = "New York";

        boolean r1 = w.contains("Xxx");
        System.out.println("Is it containing the given character? " + r1);

        // type a string to replace the first java in a string of 3 java's
        String t = "java is java, I like java ";

        String updatedT = t.replaceFirst("java", "python");
        System.out.println(updatedT);

        // type a code to repeat a given string

        // type java 4 times

        String u = "Java";
        // way number 1
        String u1 = u+u+u+u;
        System.out.println(u1);
        // way number 2
        String u2 = u.concat(u).concat(u).concat(u);
        // way number 3
        String u3 = u.repeat(4);
        System.out.println(u3);
    }
}

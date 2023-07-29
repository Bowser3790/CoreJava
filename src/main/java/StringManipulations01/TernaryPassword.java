package StringManipulations01;

public class TernaryPassword {
    public static void main(String[] args) {
        // type password code to check if more than 8 chars, initial should be i,
        // if no more than 8 char initial should be k
        // solve using nested ternary

        String pwd = "ia1b3cxx";
        String r2 = pwd.length()>8 ? (pwd.startsWith("i") ? "Valid Password" : "Invalid Password") : (pwd.startsWith("K") ? "Valid Password" : "Invalid Password");
        System.out.println(r2);
    }
}

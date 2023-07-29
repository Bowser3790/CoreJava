package StringManipulations01;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        // password requirements starts with "J", length must be 8, and last 3 characters AVA

//        String pwd = "JanftAVA";
//
//
//
//        boolean firstLetter = pwd.startsWith("J");
//        System.out.println(firstLetter);
//
//        boolean pwdLen = pwd.length()>7;
//        System.out.println(pwdLen);
//
//        boolean endingTrue = pwd.substring(5).equals("AVA");
//        System.out.println(endingTrue);


        String pwd = "JanftAVA";

        boolean upperLetter = pwd.replaceAll("[^A-Z]", "").length()>0;
        System.out.println(upperLetter);
        boolean LenPwd = pwd.length()>7;
        System.out.println(LenPwd);
        boolean specChar = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(specChar);
        boolean number1 = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(number1);
        boolean lowchar = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(lowchar);

    }
}

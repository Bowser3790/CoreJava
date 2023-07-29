package StringManipulations01;

public class ascii1 {
    public static void main(String[] args) {
        char ch = '!';
        if(ch>='A' && ch<='Z'){
            System.out.println("Letter is Uppercase");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Letter is Lowercase");
        }else{
            System.out.println("character is not upper or lowercase");
        }
    }
    }



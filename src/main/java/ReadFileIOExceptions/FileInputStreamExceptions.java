package ReadFileIOExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// note: when trying to figure out the parent class you have to ask which is more general?
// IOException and FileNotFoundException which is parent class? IOException, Why?
// Because IOException covers more, i.e. is more general.
// If you use IOException no need to use FileNotFound. IOException can handle all issues.

public class FileInputStreamExceptions {
    public static void main(String[] args) throws IOException { // example the main method needs a door out
        // to read the exception and to execute the exception for the method below. that is why we need to throw
        // exception in main method as well.
        readTextFile();

    }
    public static void readTextFile() throws IOException {// Note: only handles file not found - cannot handle reading files(example:(different languages)
    // There are 2 things you need to be aware of with reading files(FileInputStream) with Java:
        // 1) what happen if the address is wrong?
        // 2) what happens if the address is correct but file is no longer avail, file was deleted?
        // this is why you have to use either a try-catch block or throws FileNotFoundException
        // with the FileInputStream object

        // next step is to create a way to read all characters in the file we created.
        FileInputStream fis = new FileInputStream("src/main/java/ReadFileIOExceptions/ObjectOrientedProgramming");

        int k = 0;

        while((k=fis.read())!=-1){ // read() (does not understand language UTF8 file converts language)
            //read() method gets ascii value for example the first letter is capital O and will return 79
            // Note FileNotFound exception does not handle reading exceptions from main method().
            // IOException can handle all Input and Output exceptions
            // (char converts ascii value to letter value 79 will convert to capital O. if there are no more characters then 'k' will turn -1
            System.out.print((char)k); // how do you change letters from the file to ascii values with (char) called typecasting.
            // characters are on the same line so we can remove ln from print.
            // Java worries about reading because Java does not know different languages, we need to specify the language
            // such as UTF8 => english alphabet.

        }
        /*
        Notes for this file:
        FileNotFoundException and IOException are compile time exceptions because there is a red underline when you type the code.
        FileNotFoundException is related to file path and file existance
        IOException is related with all Input Output exceptions
        IOException is the parent of FileNotFound
        you don't need to use FileNotFound unless there is no specific requirement
        if you use fileNotFound and IOException in try-catch blocks you need to put fileNotFound first because it is the child.
         */


    }
}

package ReadFileIOExceptions;

public class customIllegalAgeException extends RuntimeException {
    // we are going to make this a runtime exception class.
    // extend the runtimeException class
    public customIllegalAgeException(String message){
        super(message);
    }
    public customIllegalAgeException(){
        super();
    }

}

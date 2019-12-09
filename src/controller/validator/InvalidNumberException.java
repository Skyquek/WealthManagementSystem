package controller.validator;

public class InvalidNumberException extends Exception{
    private static final long serialVersionUID = 1L;

    public InvalidNumberException(String val1){
        super(val1 + " is not a number.");
    }
    
    public InvalidNumberException(String val1, String val2){
        super(val1 + " or " + val2 + " is not a number.");
    }
    
    public InvalidNumberException(String val1, String val2, String val3){
        super(val1 + " or " + val2 + " or " + val3 + " is not a number.");
    }
}
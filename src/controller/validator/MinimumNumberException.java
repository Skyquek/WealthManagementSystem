package controller.validator;

public class MinimumNumberException extends Exception {
    private static final long serialVersionUID = 1L;

    // House, Car, Motorcycle
    public MinimumNumberException(double val1, int maximum) {
        super("Input value " + val1  + " must be greater than or equals to " + maximum + ".");
    }
    
    // Land, BankAccount
    public MinimumNumberException(double val1, double val2, int maximum) {
        super("Input value " + val1 + " or " + val2 + " must be greater than or equals to " + maximum + ".");
    }
    
    // Gold
    public MinimumNumberException(double val1, double val2, double val3, int maximum) {
        super("Input value " + val1 + " or " + val2 + " or " + val3 + " must be greater than or equals to " + maximum + ".");
    }
}
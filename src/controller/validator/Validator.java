package controller.validator;

public class Validator {
	// House, Car, Motorcycle
    public static void validate(String val1, boolean required)throws MinimumNumberException,InvalidNumberException
    {
    	double number = 0;
    	try {
            number = Double.parseDouble(val1);

        } catch (NumberFormatException e) {
            throw new InvalidNumberException(val1);
        }
    	
    	// Check minimum value
        if(number < 0)
        {
        	throw new MinimumNumberException(number, 0);
        }
    }
    
	// Land, Bank Account
    public static void validate(String val1, String val2, boolean required)throws MinimumNumberException,InvalidNumberException
    {
    	double number1 = 0, number2 = 0;
    	
    	try {
            number1 = Double.parseDouble(val1);
            number2 = Double.parseDouble(val2);

        } catch (NumberFormatException e) {
            throw new InvalidNumberException(val1, val2);
        }
    	
    	// Check minimum value
        if(number1 < 0 || number2 < 0)
        {
        	throw new MinimumNumberException(number1, number2, 0);
        }
    }
    
    // Gold
    public static void validate(String val1, String val2, String val3, boolean required)throws MinimumNumberException, InvalidNumberException
    {
    	
    	double number1 = 0, number2 = 0, number3 = 0;
    	
    	try {
            number1 = Double.parseDouble(val1);
            number2 = Double.parseDouble(val2);
            number3 = Double.parseDouble(val3);

        } catch (NumberFormatException e) {
            throw new InvalidNumberException(val1, val2, val3);
        }
    	
    	// Check minimum value
        if(number1 < 0 || number2 < 0 || number3 < 0)
        {
        	throw new MinimumNumberException(number1, number2, number3, 0);
        }
    }
    
}
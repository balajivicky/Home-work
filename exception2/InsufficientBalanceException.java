import java.util.Scanner;
class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}
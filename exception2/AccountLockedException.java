import java.util.Scanner;

class AccountLockedException extends Exception 
{
    public AccountLockedException(String message) 
    {
        super(message);
    }
}
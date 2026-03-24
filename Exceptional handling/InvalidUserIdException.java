import java.util.Scanner;

class InvalidUserIdException extends Exception 
{
    public InvalidUserIdException(String message) 
	{
        super(message);
    }
}
import java.util.Scanner;

public class UserIdValidation 
{

    public static void validateUserId(String input) throws InvalidUserIdException 
	{
        
        int userId;

        try 
		{
            userId = Integer.parseInt(input);

        } 
		catch (NumberFormatException e) 
		{
            System.out.println("Error: User ID must be a number");
            return;
        }

        if (userId <= 0) 
		{
            throw new InvalidUserIdException("Error: User ID must be positive");
        }

        System.out.println("Valid User ID: " + userId);
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String input = sc.next();

        try 
		{
            validateUserId(input);
        } 
		catch (InvalidUserIdException e) 
		{
            System.out.println(e.getMessage());
        }

    }
}
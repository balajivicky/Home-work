import java.util.Scanner;

public class UserIdValidation 
{

    public static int validateUserId(String input) throws InvalidUserIdException 
	{
        int userId;

        try 
		{
            userId = Integer.parseInt(input);
        } 
		catch (NumberFormatException e) 
		{
            throw new InvalidUserIdException("User ID must be a number");
        }

        if (userId <= 0) 
		{
            throw new InvalidUserIdException("User ID must be positive");
        }

        return userId;
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String input = sc.nextLine();

        try 
		{
            int validId = validateUserId(input);
            System.out.println("Valid User ID: " + validId);
        } 
		catch (InvalidUserIdException e) 
		{
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
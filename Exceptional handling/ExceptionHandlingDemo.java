import java.util.Scanner;

public class ExceptionHandlingDemo 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Exception Handling Menu =====");
            System.out.println("1. Arithmetic Exception Demo");
            System.out.println("2. Null Pointer Exception Demo");
            System.out.println("3. Array Index Out Of Bounds Demo");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    arithmeticDemo(sc);
                    break;

                case 2:
                    nullPointerDemo(sc);
                    break;

                case 3:
                    arrayIndexDemo(sc);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

    }

    public static void arithmeticDemo(Scanner sc) 
	{
        try 
		{
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) 
		{
            System.out.println("Error: Cannot divide by zero!");
        }
    }

    public static void nullPointerDemo(Scanner sc) 
	{
        try 
		{
            System.out.print("Enter a string (type 'null' to simulate null): ");
            String input = sc.next();

            if (input.equals("null")) 
			{
                input = null;
            }

            int length = input.length();
            System.out.println("Length of string: " + length);

        } 
		catch (NullPointerException e) 
		{
            System.out.println("Error: String is null, cannot find length!");
        }
    }

    public static void arrayIndexDemo(Scanner sc) 
	{
        try 
		{
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index (0 to 4): ");
            int index = sc.nextInt();

            System.out.println("Element at index " + index + ": " + arr[index]);

        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Error: Invalid index! Please enter between 0 and 4.");
        }
    }
}
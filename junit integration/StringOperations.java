import java.util.*;

public class StringOperations 
{

    public static Set<Character> findDuplicates(String str) 
	{
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char ch : str.toCharArray()) 
		{
            if (!seen.add(ch)) 
			{
                duplicates.add(ch);
            }
        }
        return duplicates;
    }

    public static String removeSpaces(String str) 
	{
        return str.replaceAll("\\s+", "");
    }

    public static String reverseString(String str) 
	{
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        while (true) 
		{
            System.out.println("\n--- String Operations Menu ---");
            System.out.println("1. Find Duplicate Characters");
            System.out.println("2. Remove Spaces");
            System.out.println("3. Reverse String");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            switch (choice) 
			{
                case 1:
                    System.out.println("Duplicates: " + findDuplicates(input));
                    break;

                case 2:
                    System.out.println("Without spaces: " + removeSpaces(input));
                    break;

                case 3:
                    System.out.println("Reversed: " + reverseString(input));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
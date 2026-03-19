import java.util.Scanner;
import java.util.Stack;

public class SupermarketBilling 
{

    public static void main(String[] args) 
	{

        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) 
		{

            System.out.println("1. Add Item");
            System.out.println("2. Undo Last Item");
            System.out.println("3. View Last Scanned Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    stack.push(item);
                    System.out.println("Item added: " + item);
                    break;

                case 2:
                    if (stack.isEmpty()) 
					{
                        System.out.println("No items to remove!");
                    } else {
                        String removed = stack.pop();
                        System.out.println("Removed last scanned item: " + removed);
                    }
                    break;

                case 3:
                    if (stack.isEmpty()) 
					{
                        System.out.println("No items in stack!");
                    } else 
					{
                        System.out.println("Last scanned item: " + stack.peek());
                    }
                    break;

                case 4:
                    if (stack.isEmpty()) 
					{
                        System.out.println("No items scanned!");
                    } else 
					{
                        System.out.println("Scanned items: " + stack);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
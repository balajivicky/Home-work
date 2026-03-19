import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class RestaurantQueue 
{
    public static void main(String[] args) 
	{
        Queue<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) 
		{

            System.out.println("1. Add Order");
            System.out.println("2. Serve Order");
            System.out.println("3. View Next Order");
            System.out.println("4. Display All Orders");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter order: ");
                    String order = sc.nextLine();
                    queue.add(order);  
                    System.out.println("Order added: " + order);
                    break;

                case 2:
                    if (queue.isEmpty()) 
					{
                        System.out.println("No orders to serve!");
                    } else 
					{
                        String served = queue.remove(); 
                        System.out.println("Served order: " + served);
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) 
					{
                        System.out.println("No orders in queue!");
                    } else 
					{
                        System.out.println("Next order: " + queue.peek());
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) 
					{
                        System.out.println("No pending orders!");
                    } 
					else 
					{
                        System.out.println("Pending orders: " + queue);
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
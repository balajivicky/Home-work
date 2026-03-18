import java.util.Scanner;
public class MainApp1
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        FoodOrder order = null;
        int choice;

        do {
            System.out.println("--- Online Food Order System ---");
            System.out.println("1. Place Order");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Food Item: ");
                    String item = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    order = new FoodOrder(name, item, price);
                    order.placeOrder();
                    break;

                case 2:
                    if (order != null) 
					{
                        order.showBill();
                    } else {
                        System.out.println("No order placed yet!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
}
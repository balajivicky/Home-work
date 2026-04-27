import java.util.*;



public class TransportSystem 
{

    static String companyName;
    static String vehicleNumber;
    static String driverName;

    static List<ShopDelivery> deliveries = new ArrayList<>();

    static double totalKM;
    static double ratePerKM;

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        while (true) 
		{
            System.out.println("\n--- Transport Delivery System ---");
            System.out.println("1. Add Company");
            System.out.println("2. Add Vehicle");
            System.out.println("3. Add Driver");
            System.out.println("4. Add Shop Delivery");
            System.out.println("5. View Trip Details");
            System.out.println("6. View Pending Deliveries");
            System.out.println("7. Mark Delivery Completed");
            System.out.println("8. Calculate Trip Amount");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter Company Name: ");
                    companyName = sc.nextLine();
                    break;

                case 2:
                    System.out.print("Enter Vehicle Number: ");
                    vehicleNumber = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Enter Driver Name: ");
                    driverName = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Enter Shop Name: ");
                    String shop = sc.nextLine();
                    deliveries.add(new ShopDelivery(shop));
                    break;

                case 5:
                    System.out.println("\nCompany: " + companyName);
                    System.out.println("Vehicle: " + vehicleNumber);
                    System.out.println("Driver: " + driverName);
                    System.out.println("Deliveries:");
                    for (ShopDelivery d : deliveries) 
					{
                        System.out.println(d.shopName + " - " + d.status);
                    }
                    break;

                case 6:
                    System.out.println("Pending Deliveries:");
                    for (ShopDelivery d : deliveries) 
					{
                        if (d.status.equals("Pending")) 
						{
                            System.out.println(d.shopName);
                        }
                    }
                    break;

                case 7:
                    System.out.print("Enter Shop Name to Complete: ");
                    String name = sc.nextLine();
                    for (ShopDelivery d : deliveries) {
                        if (d.shopName.equalsIgnoreCase(name)) 
						{
                            d.status = "Completed";
                        }
                    }
                    break;

                case 8:
                    System.out.print("Enter Total KM: ");
                    totalKM = sc.nextDouble();
                    System.out.print("Enter Rate per KM: ");
                    ratePerKM = sc.nextDouble();
                    double amount = totalKM * ratePerKM;
                    System.out.println("Total Trip Amount = " + amount);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
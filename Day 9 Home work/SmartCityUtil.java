import java.util.Scanner;

class SmartCityUtil 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("SMART CITY UTILITY MENU");
        System.out.println("1. Electricity Bill");
        System.out.println("2. Water Bill");
        System.out.println("3. Internet Plan");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) 
		{

            case 1:
                System.out.print("Enter units consumed: ");
                int units = sc.nextInt();
                int bill;

                if (units <= 100) 
				{
                    bill = units * 2;
                } 
				else if (units <= 300) 
				{
                    bill = units * 3;
                } 
				else 
				{
                    bill = units * 5;
                }

                System.out.println("Electricity Bill Amount: Rs " + bill);
                break;

            case 2:
                System.out.println("Select House Type");
                System.out.println("1. Apartment");
                System.out.println("2. Individual House");

                int houseType = sc.nextInt();

                if (houseType == 1) 
				{
                    System.out.println("Water Bill: Rs 300");
                } 
				else if (houseType == 2) 
				{
                    System.out.println("Water Bill: Rs 500");
                } 
				else 
				{
                    System.out.println("Invalid House Type");
                }
                break;

            case 3:
                System.out.println("Internet Plans");
                System.out.println("1. Basic - Rs 399");
                System.out.println("2. Standard - Rs 699");
                System.out.println("3. Premium - Rs 999");

                int plan = sc.nextInt();

                if (plan == 1) 
				{
                    System.out.println("You selected Basic Plan");
                } 
				else if (plan == 2) 
				{
                    System.out.println("You selected Standard Plan");
                } 
				else if (plan == 3) 
				{
                    System.out.println("You selected Premium Plan");
                } else 
				{
                    System.out.println("Invalid Plan");
                }
                break;

            case 4:
                System.out.println("Thank you for using Smart City Utility System");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

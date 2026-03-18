import java.util.Scanner;
public class MainApp 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- Shape Area Calculator ---");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Shape c = new Circle(r);
                    c.calculateArea();
                    break;

                case 2:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    Shape sq = new Square(s);
                    sq.calculateArea();
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
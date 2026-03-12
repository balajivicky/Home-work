import java.util.Scanner;
public class ShapeCalculator 
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
                    double radius = sc.nextDouble();

                    Circle c = new Circle(radius);
                    c.calculateArea();
                    break;

                case 2:
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();

                    Square s = new Square(side);
                    s.calculateArea();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } 
		while (choice != 3);
    }
}
import java.util.Scanner;

public class Shop
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println();

        Product p = new Product(id, name, price, quantity);

        System.out.println("Shop Name: " + Product.shopName);
        System.out.println();

        p.displayBill();

        sc.close();
    }
}
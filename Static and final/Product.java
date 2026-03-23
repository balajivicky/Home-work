import java.util.Scanner;

class Product 
{

    int productId;
    String productName;
    double price;
    int quantity;

    static String shopName = "Mano Fabrics Online Store";
    static double gstPercent = 18; 

    final double DELIVERY_CHARGE = 50;

    Product(int productId, String productName, double price, int quantity) 
	{
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateSubtotal() 
	{
        return price * quantity;
    }

    double calculateGST() 
	{
        return calculateSubtotal() * gstPercent / 100;
    }

    double calculateFinalBill() 
	{
        return calculateSubtotal() + calculateGST() + DELIVERY_CHARGE;
    }

    void displayBill() 
	{
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("GST: " + calculateGST());
        System.out.println("Delivery Charge: " + DELIVERY_CHARGE);
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}


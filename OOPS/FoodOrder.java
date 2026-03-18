class FoodOrder extends Customer implements Order 
{

    String foodItem;
    double price;

    FoodOrder(String name, String foodItem, double price) {
        super(name);
        this.foodItem = foodItem;
        this.price = price;
    }

    public void placeOrder() 
	{
        System.out.println("Order placed successfully!");
    }

    public void showBill() 
	{
        System.out.println("--- Bill ---");
        System.out.println("Customer Name: " + name);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: " + price);
    }
}

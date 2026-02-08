class OnlineOrderStatus
{
	public static void main(String[] args)
	{
	char orderstatus = 'D';
	
	switch(orderstatus)
	{
	case 'P' :
	System.out.println("Order placed");
	break;
	
	case 'S' :
	System.out.println("Shipped");
	break;
	
	case 'D' :
	System.out.println("Delivered");
	break;
	
	case 'C' :
	System.out.println("Cancelled");
	break;
	
	default :
	System.out.println("Invalid Order");
	
	
	}
	
	}
	
}
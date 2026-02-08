import java.util.Scanner;
class BookShop
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Book shop");
		System.out.println("1. Academic Books");
		System.out.println("2. Story Books");
		System.out.println("3. Magazines");
		System.out.println("4. Competitive Exam Books");
		System.out.println("5. Comics");
		System.out.print("Enter your choise : ");
		
		int choise = sc.nextInt();
		
		if(choise==1)
		{
			System.out.println("1. Maths Book");
		    System.out.println("2. Science Book");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Maths Book - Rs.200");
			}
			else if(option==2)
			{
				System.out.println("Science Book - Rs.250");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		
		else if(choise==2)
		{
			System.out.println("1. Adventure Story- Rs.150");
		    System.out.println("2. Moral Story – Rs.120 ");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("1. Adventure Story- Rs.150");
			}
			else if(option==2)
			{
				System.out.println("2. Moral Story – Rs.120 ");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		
		else if(choise==3)
		{
			System.out.println("1. Weekly Magazine");
		    System.out.println("2. Monthly Magazine");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Weekly Magazine – Rs.50");
			}
			else if(option==2)
			{
				System.out.println("Monthly Magazine – Rs.120");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		else if(choise==4)
		{
			System.out.println("1. Banking Exam Book");
		    System.out.println("2. SSC Exam Book");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Banking Exam Book – Rs.400");
			}
			else if(option==2)
			{
				System.out.println("SSC Exam Book – Rs.350");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		else if(choise==4)
		{
			System.out.println("1. Kids Comics");
		    System.out.println("2. Superhero Comics");
		    System.out.print("Enter your Option : ");
			
			int option = sc.nextInt();
			
			if(option==1)
			{
				System.out.println("Kids Comics – Rs.80");
			}
			else if(option==2)
			{
				System.out.println("Superhero Comics – Rs.120");
			}
			else
			{
				System.out.println("Not Available");
			}
		}
		else
		{
			System.out.println("Your Choise is not available");
		}
		
	}
}
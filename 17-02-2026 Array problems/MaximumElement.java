import java.util.Scanner;
class MaximumElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE ARRAY LENGTH : ");
		
        int length = sc.nextInt();
		
		int age[] = new int [length];
		
		for(int i=0; i < age.length; i++)
		{
			System.out.print("Enter the "+ i +"index value");
			age[i] = sc.nextInt();
		}
			
			int max = age[0];
			for(int i=0;i<age.length;i++)
			{
				if (age[i]>max)
				{
					max = age[i];
				}
			}
			System.out.println("The maximum age is :"+max);
		
	}
}
		
		

	
	
	
	
	
	

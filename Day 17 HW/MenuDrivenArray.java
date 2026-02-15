import java.util.Scanner;

class MenuDrivenArray 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];   
        int n = 0;             
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Insert elements");
            System.out.println("2. Display elements");
            System.out.println("3. Count Even numbers");
            System.out.println("4. Count Odd numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.print("How many elements? ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) 
					{
                        a[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) 
					{
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int even = 0;
                    for (int i = 0; i < n; i++) 
					{
                        if (a[i] % 2 == 0) 
						{
                            even++;
                        }
                    }
                    System.out.println("Even numbers count: " + even);
                    break;

                case 4:
                    int odd = 0;
                    for (int i = 0; i < n; i++) 
					{
                        if (a[i] % 2 != 0) 
						{
                            odd++;
                        }
                    }
                    System.out.println("Odd numbers count: " + odd);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}

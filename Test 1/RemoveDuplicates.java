import java.util.Scanner;

class RemoveDuplicates 
{
    public static void main(String args[]) 
	{

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];
        int unique[] = new int[n];
        int count = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)			
		{
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
		{
            int j=0;

            for (j = 0; j < count; j++) 
			{
                if (arr[i] == unique[j]) 
				{
					break;
				}
            }

            if (j == count) 
			{  
                unique[count] = arr[i];
                count++;
            }
        }

        System.out.println("Array elements without duplicates:");
        for (int i = 0; i < count; i++) 
		{
            System.out.print(unique[i] + " ");
        }
    }
}
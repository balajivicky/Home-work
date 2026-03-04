import java.util.Scanner;

class BubbleSortWithPasses 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int ar[] = new int[n];

        for(int i = 0; i < n; i++) 
		{
            ar[i] = sc.nextInt();
        }

        int passCount = 0;

        for(int i = 0; i < n - 1; i++) 
		{
            passCount++;  

            for(int j = 0; j < n - 1 - i; j++) 
			{
                if(ar[j] > ar[j + 1]) 
				{
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int num : ar) 
		{
            System.out.print(num + " ");
        }

        System.out.println("Number of Passes: " + passCount);
    }
}
import java.util.Scanner;

class BinarySearch 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
		{
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int index = -1;

        while (start <= end) 
		{
            int mid = (start + end) / 2;

            if (arr[mid] == target) 
			{
                index = mid;
                break;
            } else if (arr[mid] < target) 
			{
                start = mid + 1;  
            } else {
                end = mid - 1; 
            }
        }

        if (index != -1) 
		{
            System.out.println("Index: " + index);
        } else 
		{
            System.out.println(-1);
        }
    }
}
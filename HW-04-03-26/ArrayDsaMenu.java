import java.util.Scanner;

class ArrayDsaMenu 
{
    int 
	ar[];
    int n;

    Scanner sc = new Scanner(System.in);

    void accept() 
	{
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        ar = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) 
		{
            ar[i] = sc.nextInt();
        }
    }

    void display() 
	{
        System.out.println("aray Elements:");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    void bubbleSort() 
	{
        for (int i = 0; i < n - 1; i++) 
		{
            for (int j = 0; j < n - i - 1; j++) 
			{
                if (ar[j] > ar[j + 1]) 
				{
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorting Successful (Bubble Sort)");
    }
void mergeSort(int l, int r) {

        if (l < r) 
		{

            int mid = (l + r) / 2;

            mergeSort(l, mid);
            mergeSort(mid + 1, r);

            merge(l, mid, r);
        }
    }

    void merge(int l, int m, int r) 
	{
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = ar[l + i];

        for (int j = 0; j < n2; j++)
            R[j] = ar[m + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                ar[k] = L[i];
                i++;
            } else {
                ar[k] = R[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            ar[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            ar[k] = R[j];
            j++;
            k++;
        }
    }

    void linearSearch(int target) 
	{
        int found = 0;

        for (int i = 0; i < n; i++) 
		{
            if (ar[i] == target) 
			{
                System.out.println("Linear Search Successful at index " + i);
                found = 1;
                break;
            }
        }

        if (found==0)
            System.out.println("Linear Search Unsuccessful");
    }

    void binarySearch(int target) 
	{
        int low = 0;
        int high = n - 1;
        int found = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (ar[mid] == target) 
			{
                System.out.println("Binary Search Successful at index " + mid);
                found = 1;
                break;
            }

            if (ar[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (found==0)
            System.out.println("Binary Search Unsuccessful");
    }

    void start() 
	{
        int choice;

        do 
		{
            System.out.println("----------MAIN MENU----------");
			
            System.out.println("1. Accept Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Sort aray");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    accept();
                    break;

                case 2:
                    display();
                    break;

                case 3:

                    System.out.println("Choose Sorting Method");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Merge Sort");

                    int s = sc.nextInt();

                    if (s == 1)
                        bubbleSort();

                    else if (s == 2) 
					{
                        mergeSort(0, n - 1);
                        System.out.println("Sorting Successful (Merge Sort)");
                    }

                    display();
					break;

                case 4:

                    System.out.print("Enter element to search: ");
                    int target = sc.nextInt();

                    System.out.println("Choose Search Method");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");

                    int se = sc.nextInt();

                    if (se == 1)
                        linearSearch(target);

                    else if (se == 2)
                        binarySearch(target);

                    break;

                case 5:
                    System.out.println("Program Exit");

            }

        } while (choice != 5);
    }

    public static void main(String args[]) 
	{

        ArrayDsaMenu obj = new ArrayDsaMenu();
        obj.start();

    }
}
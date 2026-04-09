package pattern;
public class PatternPrinting
{
    public static void main(String[] args) 
    {
        int n = 5;
        int ar[][] = new int[n][n];

        int num = 1;

        for (int j = 0; j < n; j++) 
        {
            for (int i = j; i < n; i++) 
            {
                ar[i][j] = num++;
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}


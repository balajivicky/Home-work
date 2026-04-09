package zohoquestions;
import java.util.Arrays;

public class ArrayRearrange
{
    public static void main(String[] args) 
    {
        int[] ar = {1, -2, 3, -4, 5, -6};

        int pos = 0;

        for (int i = 0; i < ar.length; i++) 
        {
            if (ar[i] < 0) 
            {
                int temp = ar[i];
                ar[i] = ar[pos];
                ar[pos] = temp;

                pos++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
    
    


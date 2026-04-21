public class ArrayUtils 
{

    public int findMax(int[] arr) 
    {
        int max = arr[0];
        for (int num : arr) 
        {
            if (num > max) max = num;
        }
        return max;
    }

    public int findMin(int[] arr) 
    {
        int min = arr[0];
        for (int num : arr) 
        {
            if (num < min) min = num;
        }
        return min;
    }
}
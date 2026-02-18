class AverageArray 
{
    public static void main(String[] args) 
	{

        int ar[] = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < ar.length; i++) 
		{
            sum = sum + ar[i];
        }

        double average = (double) sum / ar.length;
        System.out.println("Average = " + average);
    }
}

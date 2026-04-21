public class NumberUtils
{

    public int factorial(int n) 
    {
        if (n < 0) 
        {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result *= i;
        }
        return result;
    }

    public boolean isPrime(int n) 
    {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}
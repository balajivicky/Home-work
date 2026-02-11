class FactorialNumber
{
	public static void main(String[] args)
	{
		int number = 4;
		int factorial = 1;
		
		for(int a =1; a<= number; a++)
		{
			factorial = factorial * a;
		}
		System.out.println("Factorial = "+ factorial);
	}
}
class AlphabetPattern
{
	public static void main(String[] args)
	{
		int row = 5;
		for (int i = 1; i <= row; i++)
		{
			for (char ch = 'A'; ch < 'A' + i; ch++)
  		    {
				System.out.print(ch);
			}
	         System.out.println();
		}
	}	
}
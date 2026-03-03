class InsertArray
{
	public static void main(String args[])
	{
		int ar[] = {12,24,36,48,60,72};
		
		int pos = 4;
		int value = 40
		
		int br[] = new int[ar.length+1];
	
		for(int i=0;i<pos-1;i++)
		{
			br[i]=ar[i];
		}
		
		br[pos-1]= value;
	
		for(int i=pos;i<br.length;i++)
		{
			br[i]=ar[i-1];
		}
	
		for(int i=0;i<br.length;i++)
		{
			System.out.print(br[i]+",");
		}
	}
}
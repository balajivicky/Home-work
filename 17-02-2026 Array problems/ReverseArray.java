class ReverseArray
{
	public static void main(String[] args)
	{
		int numb[]={10,20,53,70,90,110};
		for(int i=0;i<numb.length/2;i++)
		{
			int temp = numb[i];
			int back = numb.length-1-i;
			
			numb[i]=numb[back];
			numb[back]=temp;
		}
		for(int i=0;i<numb.length;i++)
		{
			System.out.println(numb[i]+" ");
		}
	}
}
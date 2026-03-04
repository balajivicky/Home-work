import java.util.Arrays;
class MergeSort
{
	int[] divide(int ar[])
	{
		if(ar.length<=1)
		{
			return ar;
		}
		int mid = ar.length/2;
		int left[] = divide(Arrays.copyOfRange(ar,0,mid));
		int right[] = divide(Arrays.copyOfRange(ar,mid,ar.length));
		return conquer(left,right);
		
	}
	int[] conquer(int left[],int right[])
	{
		int i =0;
		int j =0;
		int k =0;
		int newArray[] = new int[left.length+right.length];
		
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				newArray[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newArray[k]=right[j];
				j++;
				k++;
			}
				
		}
		while(i<left.length)
		{
			newArray[k]=left[i];
				i++;
				k++;
		}
		while(j<right.length)
		{
			newArray[k]=right[j];
				j++;
				k++;
		}
		return newArray;
	}
	public static void main(String[] args)
	{
		int ar[] = {10,23,15,12,30,3,8,21,45,7};
		MergeSort ms = new MergeSort();
		int res[] = ms.divide(ar);
		
		System.out.println(Arrays.toString(res));
	}
}
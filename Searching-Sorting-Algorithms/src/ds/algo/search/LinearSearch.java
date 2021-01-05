package ds.algo.search;

public class LinearSearch 
{
	public static boolean search(int[] arr,int item) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==item)
				return true;
		}
		return false;
	}	
	public static void main(String[] args) 
	{
		int[] input= {12,5,14,77,45,3};
		int item=15;
		System.out.println(search(input, item));
	}
}

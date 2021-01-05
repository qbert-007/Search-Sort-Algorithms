package ds.algo.basic.sort;

public class InsertionSort 
{
	public static void insertionSort(int[] arr) 
	{
		for(int i=1;i<arr.length;i++) 
		{
			int hole=i;
			int val=arr[i];
			while(hole>0 && arr[hole-1]>val) 
			{
				arr[hole]=arr[hole-1];
				hole--;
			}
			arr[hole]=val;
		}
	} 
	public static void main(String[] args) {
		int[] input= {15,4,54,16,8,25};
		insertionSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

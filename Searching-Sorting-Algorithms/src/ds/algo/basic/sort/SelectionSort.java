package ds.algo.basic.sort;

public class SelectionSort 
{
	private static void swap(int[] arr,int a,int b) 
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void selectionSort(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			swap(arr,i,min);
		}
	}
	public static void main(String[] args) 
	{
		int[] input= {15,4,54,16,8,25};
		selectionSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

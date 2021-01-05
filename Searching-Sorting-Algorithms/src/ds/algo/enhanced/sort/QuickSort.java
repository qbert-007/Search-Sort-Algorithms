package ds.algo.enhanced.sort;

import java.util.Random;

public class QuickSort 
{
	private static void swap(int[] arr,int a,int b) 
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	private static int partition(int[] arr,int low,int high) 
	{
		int pivot=arr[high];
		int ind=low-1;
		for(int j=low;j<=high-1;j++) 
		{
			if(arr[j]<pivot) 
			{
				ind++;
				swap(arr,ind,j);
			}
		}
		swap(arr,ind+1,high);
		return ind+1;
	}
	private static int randomizedPartition(int[] arr,int low,int high) 
	{
		int pivot=(new Random().nextInt(high-low+1))+low;
		if(pivot!=high)
			swap(arr,pivot,high);
		return partition(arr,low,high);
	} 
	private static void quickSort(int[] arr,int start,int end) 
	{
		if(start<end) {
			int ind=randomizedPartition(arr,start,end);
			quickSort(arr,start,ind-1);
			quickSort(arr,ind+1,end);
		}
	}
	public static void quickSort(int[]arr) 
	{
		quickSort(arr,0,arr.length-1);
	}
	public static void main(String[] args) 
	{
		int[] input= {15,4,54,16,8,25};
		quickSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

package ds.algo.basic.sort;

public class BubbleSort 
{
	private static void swap(int[] arr,int a,int b) 
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	public static void bubbleSort(int[] arr) 
	{
		int end=arr.length-1;
		while(end>=0) {
			boolean flag=false;
			for(int j=0;j<end;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					flag=true;
					swap(arr,j,j+1);
				}
			}
			if(flag==false) break;
			end--;
		}
	}
	public static void main(String[] args) 
	{
		int[] input= {4,8,15,27,25,26};
		bubbleSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

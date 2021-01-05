package ds.algo.enhanced.sort;

public class HeapSort 
{
	private static void swap(int[] arr,int a,int b) 
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	private static void heapify(int[] arr,int size,int root) 
	{
			int largest=root;
			int leftInd=(2*root)+1;
			int rightInd=(2*root)+2;
			if(leftInd<size && arr[leftInd]>arr[largest]) {
				largest=leftInd;
			}
			if(rightInd<size && arr[rightInd]>arr[largest]) {
				largest=rightInd;
			}
			if(largest!=root) {
				swap(arr,root,largest);
				heapify(arr,size,largest);
			}
	}
	public static void heapSort(int[] arr) 
	{
		int size=arr.length;
		for(int i=(size/2)-1;i>=0;i--) 
		{
			heapify(arr,arr.length,i);
		}
		while(size>1) {
			swap(arr,0,size-1);
			size--;
			heapify(arr,size,0);
		}
	}
	public static void main(String[] args) 
	{
		int[] input= {15,8,55,24,12,16,22};
		heapSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

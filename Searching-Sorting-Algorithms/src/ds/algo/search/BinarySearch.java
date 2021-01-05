package ds.algo.search;

public class BinarySearch 
{
	private static boolean search(int[] arr,int item,int start,int end) 
	{
		if(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==item) return true;
			if(arr[mid]>item) {
				return search(arr,item,start,mid-1);
			}else if(arr[mid]<item) {
				return search(arr,item,mid+1,end);
			}
		}
		return false;
	}
	public static boolean search(int[] arr,int item) 
	{
		return search(arr,item,0,arr.length-1);
	}
	public static void main(String[] args) 
	{
		int[] input= {12,15,24,37,45,63};
		int item=455;
		System.out.println(search(input, item));
	}
}

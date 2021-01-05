package ds.algo.enhanced.sort;

public class MergeSort 
{
	private static void merge(int[] arr,int[] left,int[] right) 
	{
		int i=0,l=0,r=0;
		while(l<left.length && r<right.length) 
		{
			if(left[l]<right[r]) {
				arr[i]=left[l];
				l++;
			}else {
				arr[i]=right[r];
				r++;
			}
			i++;
		}
		while(l<left.length) {
			arr[i]=left[l];
			l++;
			i++;
		}
		while(r<right.length) {
			arr[i]=right[r];
			r++;
			i++;
		}
	}
	public static void mergeSort(int[] arr) 
	{
		if(arr.length>1) {
			int mid=arr.length/2;
			int[] left=new int[mid];
			int[] right=new int[arr.length-mid];
			for(int k=0;k<left.length;k++) 
			{
				left[k]=arr[k];
			}
			for(int j=0;j<right.length;j++) 
			{
				right[j]=arr[mid+j];
			}
			mergeSort(left);
			mergeSort(right);
			merge(arr,left,right);
		}
	}
	public static void main(String[] args) 
	{
		int[] input= {15,4,54,16,8,25};
		mergeSort(input);
		for(int i:input) {
			System.out.print(i+" ");
		}
	}
}

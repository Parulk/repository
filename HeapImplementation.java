package com.kronos.test;

public class HeapImplementation {
	
	
	public void heapSort(int arr[], int n)
	{
		for(int i=n-1/2;i>=0;i--)
		{
			heapify(arr,i,n);
		}
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,0,i);
		}
	}
	

	public void heapify(int[] arr, int i,int n)
	{
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[i])
			largest=l;
		if(r<n && arr[r]>arr[largest])
			largest = r;
		if(largest!=i)
		{
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,largest,n);
		}
	}


	public void print(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
	HeapImplementation h = new HeapImplementation();
	int[] arr={2,5,6,1,3,8,4,9};
	int n=arr.length;
	h.heapSort(arr,n);
	h.print(arr, n);
	}

}



package com.kronos.test;



public class FirstByte {

	public static void main(String[] args) {
		
	   int arr[] ={-2, -3, 4, -1, -2, 1, 5, -3};
	   int n = arr.length;
	   findLargestSum(arr,n);
		}
	/*--- Kadane's Algorithm--- */
	static void findLargestSum(int arr[],int n)
	{
		int max_value =0;
		int max_sum =Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			max_value = max_value + arr[i];
			if(max_value < 0)
				max_value =0;
			else
				if(max_sum<max_value)
					max_sum=max_value;
		}
		System.out.println(max_sum);
	}

}

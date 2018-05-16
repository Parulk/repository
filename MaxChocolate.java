package com.kronos.test;

public class MaxChocolate {

	public static void main(String[] args) {
		
		int arr[] = {10,7,6,10,5,2,8,1,9,3,4};
		int n= arr.length;
		findMaxChoc(arr,n);

	}
	
	/*static void findMaxChoc(int arr[],int n)
	{
		int maxCount=0;
		int count=0;
		int maxIndex=0;
		for(int i=0;i<n-2;i++)
		{
		  for(int j=i+1;j<=n-1;j++)
		  {
			  if((arr[j]<arr[i]) && (j>i) && (arr[j]!=arr[i]))
				  count++;
			  else
				  break;
		  }
		  if(maxCount<count)
		  {
			  maxCount=count;
			  maxIndex=i;
		  }
		  count=0;
		}
		System.out.println(maxCount + " " + maxIndex);
	}*/
	
	static void findMaxChoc(int arr[], int n)
	{
		int max = arr[0];
		int count=0;
		int maxIndex=0;
		int maxCount=0;
		for(int j=1;j<n;j++)
		{
			if(arr[j]<max)
			{
				count++;
			}
			else//(arr[j]>max)
			{
				max= arr[j];
			     count=0;
			     maxIndex = j;
			}
		}
		if(maxCount<count)
		{
			maxCount=count;
		}
		
       System.out.println(maxCount + " " + maxIndex + " " + max );
	}

}

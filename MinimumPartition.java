package com.kronos.test;

public class MinimumPartition {

	public static void main(String[] args) {
		
		 int arr[] = {3, 1, 4, 2, 2, 1};
	     int n = arr.length;
	     System.out.println(minPartition(arr,n));
	 }
	
	static int minPartition(int[] arr, int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		
		boolean dp[][] = new boolean[sum+1][n+1];
		for(int i=0;i<=sum;i++)
		{
			dp[i][0]=false;
		}
		for(int j=0;j<=n;j++)
		{
			dp[0][j]= true;
		}
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=n;j++)
			{
				dp[i][j]=dp[i][j-1];
				if(i>=arr[j-1])
					dp[i][j]=dp[i-arr[j-1]][j-1];
			}
		}
		
		int diff=0;
		for(int i=sum/2;i>=0;i--)
		{
			if(dp[i][n]==true)
				diff = sum-2*i;
			    break;
		}
		return diff;
	}

}

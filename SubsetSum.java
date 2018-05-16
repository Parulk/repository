package com.kronos.test;

public class SubsetSum {

	public static void main(String[] args) {
		
		int arr[] = {3, 34, 4, 12, 5, 2};
		  int sum = 9;
		  int n = arr.length;
		  subsetSum(arr, n, sum);

	}
	
	static void subsetSum(int[] arr, int n,int sum)
	{
		boolean[][] dp= new boolean[sum+1][n+1];
		for(int i=0;i<=sum;i++)
		{
			dp[i][0]=false;
		}
		for(int j=0;j<=n;j++)
		{
			dp[0][j]=true;
		}
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<arr[j-1])
				dp[i][j]=dp[i][j-1];
				if(i>=arr[j-1])
					dp[i][j]=dp[i][j-1]||dp[i-arr[j-1]][j-1];
			}
		}
		System.out.println(dp[sum][n]);
	}

}

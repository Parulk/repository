package com.kronos.test;

public class PartitionProblem {

	public static void main(String[] args) {
		
		int arr[] = {1,6,5,10};
        int n = arr.length;
        System.out.println(findPartition(arr,n));
	}
	
	static boolean findPartition(int arr[], int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		
		boolean dp[][]= new boolean[sum/2+1][n+1];
		
		for(int i=0;i<=sum/2;i++)
		{
			dp[i][0]=false;
		}
		for(int j=0;j<=n;j++)
		{
			dp[0][j]=true;
		}
		for(int i=1;i<=sum/2;i++)
		{
			for(int j=1;j<=n;j++)
			{
				dp[i][j]=dp[i][j-1];
				if(i>=arr[j-1])
				{
					dp[i][j]=dp[i][j-1]||dp[i-arr[j-1]][j-1];
				}
			}
		}
		return dp[sum/2][n];
			
	}

}

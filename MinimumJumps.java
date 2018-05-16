package com.kronos.test;

public class MinimumJumps {

	public static void main(String[] args) {
		
		int arr[] = {1, 3, 6, 1, 0, 9};
		int n = arr.length;
		minJumps(arr,n);

	}
	
	static void minJumps(int arr[], int n)
	{
		
		int dp[] = new int[n+1];
		dp[0]=0;
		for(int i=1;i<=n;i++)
		{
			dp[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
			{
				if(i<=j+arr[j])
					dp[i]=Math.min(dp[i], dp[j]+1);
			}
		}
		System.out.println(dp[n]);
	}

}

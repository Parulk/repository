package com.kronos.test;

public class RodCutting {

	public static void main(String[] args) {
		
		 int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
	        int n = arr.length;
	        cutRod(arr,n);
	      }
	
	public static void cutRod(int arr[],int n)
	{
		int dp[]= new int[100];
		dp[0]=0;
		for(int i=1;i<=n;i++)
		{
			int max_val=Integer.MIN_VALUE;
			for(int j=0;j<i;j++)
			{
			max_val= max(max_val,arr[j]+dp[i-j-1]);
			dp[i]=max_val;
			}
		}
		System.out.println(dp[n]);
	}
	
	public static int max(int a, int b)
	{
		return(a>b?a:b);
	}

}

package com.kronos.test;

public class LongestIncreasing {
	public static void main(String[] args) {
		
		int arr[] = { 5,1,2,3,6,4,5};
        int n = arr.length;
        findLis(arr,n);

	}
	
	static void findLis(int a[], int n)
	{
		int[] dp = new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			dp[i]=1;	
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i] && dp[i]<dp[j]+1 && (a[i]-a[j]==1))
					dp[i]=dp[j]+1;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(max<dp[i])
				max=dp[i];
		}
		System.out.println(max);
		int print[] = new int[n];
		for(int i=n-1; i>=0;i--)
		{
          if(dp[i] == max)
          {
        	  print[i]=a[i];
        	  max--;
          }
	   }
		for(int i=0; i<n;i++)
		{
		  if(print[i]!=0)
          System.out.print(print[i] + " ");
	   }
	}
	
}

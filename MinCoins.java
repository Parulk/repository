package com.kronos.test;

public class MinCoins {

	public static void main(String[] args) {
		
		int n=5;
		int s[]={1,2,3};
		minCoin(s,n);

	}
	
	static void minCoin(int s[],int n)
	{
		int[] dp=new int[n+1];
		dp[0]=1;
		for(int i:s)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
					dp[j]=dp[j]+dp[j-i];
			}
		}
		System.out.println(dp[n]);
	}
	
	static int min(int x, int y, int z)
	{
		 if (x <= y && x <= z) return x;
	        if (y <= x && y <= z) return y;
	        else return z;
	}
//	
//	static int min(int a , int b)
//	{
//		return a<b?a:b;
//	}

}

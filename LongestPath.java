package com.kronos.test;

public class LongestPath {
 
	public static int n=3;
	public static void main(String[] args) {
		
		int mat[][]={ {1,2,9},{5,3,8},{4,6,7}};
		findLongestPath(mat);
	}
	
	static void findLongestPath(int[][] mat)
	{
		int result =1;
		int dp[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				dp[i][j]=-1;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(dp[i][j] == -1){
				findLongestPathUtil(mat,dp,i,j);
				result = Math.max(result, dp[i][j]);
				}
			}
		}
		System.out.println(result);
	}
	
	static int findLongestPathUtil(int mat[][],int dp[][],int i, int j)
	{
		if(i>=n || j>=n || i<0 || j<0)
			return 0;
		if(dp[i][j]!= -1)
			return dp[i][j];
		else if(i<n-1 && (mat[i][j]+1 == mat[i+1][j]))
			return dp[i][j] = 1 + findLongestPathUtil(mat, dp, i+1, j);
		else if(i>0 && (mat[i][j]+1 == mat[i-1][j]))
			return dp[i][j] = 1 + findLongestPathUtil(mat, dp, i-1,j);
		else if(j<n-1 && (mat[i][j]+1 == mat[i][j+1]))
			return dp[i][j] = 1 + findLongestPathUtil(mat, dp, i, j+1);
		else if(j>0 && (mat[i][j]+1 == mat[i][j-1]))
			return dp[i][j] = 1 + findLongestPathUtil(mat, dp, i, j-1);
		else
		return dp[i][j]=1;
	}

}

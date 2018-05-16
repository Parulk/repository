package com.kronos.test;

import java.util.Scanner;

public class Dynamic {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int dist=in.nextInt();
		countWays(dist);

	}
	
	static void countWays(int dist)
	{
		int[] dp = new int[dist+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=dist;i++)
		{
			dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
		}
		System.out.println(dp[dist]);
				
	}
	

}

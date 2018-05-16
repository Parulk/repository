package com.kronos.test;

public class MaximumProductCutting {

	public static void main(String[] args) {
		
		int n = 3;
		maxProduct(n);

	}
	
	static void maxProduct(int n)
	{
		int[] val = new int[n+1];
		val[0]=0;
		val[1]=0;
		for(int i=2;i<=n;i++)
		{
			int max_val = Integer.MIN_VALUE;
			for(int j=1;j<=i;j++)
			{
				max_val = max(max_val,j*val[i-j],j*(i-j));
				val[i]=max_val;
			}
		}
		System.out.println(val[n]);
	}
	
	static int max(int x, int y, int z)
	{
		 if (x >= y && x >= z) return x;
	        if (y >= x && y >= z) return y;
	        else return z;
	}
}

package com.kronos.test;

import java.util.Arrays;
import java.util.Scanner;

public class WaterSystem {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int sz[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			sz[i]=in.nextInt();
			k += sz[i];
		}
		Arrays.sort(sz,1,n);
		/*for(int l=0;l<n;l++)
		{
			System.out.println(sz[l]);
		}*/
		for(int j=n-1;j>=0;--j)
		{
			if(sz[0]*a/k>=b)
			{
				System.out.println(n-j-1);
				return;
			}
			k=k-sz[j];
		 }
		
	}
		
}


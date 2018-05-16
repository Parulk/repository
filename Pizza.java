package com.kronos.test;

import java.util.Scanner;

public class Pizza {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		long n= in.nextLong();
		findMinCuts(n);
	}
	
	static void findMinCuts(long n)
	{
		if(n==0)
		{
			System.out.println(0);
			return;
		}
		n++;
		if(n%2!=0)
		{
			System.out.println(n);
			return;
		}
		else{
			long m=n/2;
			System.out.println(m);
			return;
		}
	}

}

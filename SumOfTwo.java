package com.kronos.test;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     int k = in.nextInt();
	     int[] arr = new int[n]; 
	     for(int i=0;i<n;i++)
	     {
	    	 arr[i]=in.nextInt();
	     }
	     pairSum(arr,n,k);
     }
	
	static void pairSum(int[] arr, int n, int k)
	{
		Arrays.sort(arr);
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if(arr[i]+arr[j] == k)
			{
				System.out.println("Number found : a = " +arr[i]+ " b = " +arr[j]);
				break;
			}
			 else if(arr[i]+arr[j]<k)
			 {
				i++;
			 }
			  else
			  {
				j--;
			  }
		}
	}

}

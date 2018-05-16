package com.kronos.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PairSum {
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,4,3,2};
		int n= arr.length;
		findCount(arr,n);
	}
	
	static void findCount(int a[], int n)
	{
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			if(mp.containsKey(a[i]))
			{
				int count= mp.get(a[i]);
			      count++;
			    mp.put(a[i], count);
			}
			else if(mp.containsKey(a[i])==false)
			{
				mp.put(a[i],1);
			}
		
		   }
       
          for(int i=0;i<mp.size();i++)
          {
        	  if(mp.get(a[i])>1)
        		  System.out.println(a[i]);
          }
	}

}

package com.kronos.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
	
		int arr[] ={6,3,-1,-3,4,-2,2,4,6,-12,-7};
		Map<Integer, List<Integer>> mp= new HashMap<Integer, List<Integer>>();
		List<Integer> ls = new ArrayList<Integer>();
		List<Integer> temp = new ArrayList<Integer>();
		int zero_sum=0;
		int start=0;
		for(int i=0;i<arr.length;i++)
		{
			zero_sum += arr[i];
			if(zero_sum == 0)
			{
				if(!mp.containsKey(0)){
				ls.add(start);	
				ls.add(i);
				mp.put(0,ls);
				;
				i=start;
				}
				else{
					temp = mp.get(0);
					ls.add(start);
					temp.add(i);
					mp.put(0,temp);
					++start;
					i=start;
				}
	
		   }			
		}
		List<Integer> value = new ArrayList<Integer>();
		for(Map.Entry<Integer,List<Integer>> entry : mp.entrySet()) {
			  value = entry.getValue();
          }
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i));
		}
	}
}

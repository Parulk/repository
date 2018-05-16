package com.kronos.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PerfectString {

	public static void main(String[] args) {
		
		/*Scanner in = new Scanner(System.in);
		String s = in.nextLine();*/
		String[] s= {"a","ab","aabb","aaabbbc","aabbbb",""};
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			System.out.println(isPerfectString(s[i]));
		}

	}
	
	static boolean isPerfectString(String s)
	{	
		Map<Character,Integer> mp = new HashMap<Character,Integer>();          
		for(int i = 0; i < s.length(); i++){
		   char c = s.charAt(i);
		   Integer x = mp.get(c);
		   if(x != null){
		     mp.put(c, new Integer(x + 1));
		   }else{
		     mp.put(c,1);
		   }
		}
		int count =0;
		int min=1;
		int max =0;
		int diff =0;
		for(Map.Entry<Character,Integer> entry : mp.entrySet()) {
			  Character key = entry.getKey();
			  Integer value = entry.getValue();
			  if(min > value)
			  {
				  min =value;
			  }
			  if(max < value)
			  {
				  max = value;
			  }
			  if(value>1)
			  count++;
			 System.out.println(key + " => " + value);
			 }
		 diff = max-min;
		/* System.out.println("Count :" + count);
		 System.out.println("Max :" + max);
		 System.out.println("min :" + min);
		 System.out.println("diff :" + diff);*/
		 if(diff>1 && count!=1)
			 return false;
		 else if(count > 1 && diff!=1)
			return false;
		 else
			 return true;
	    }
}

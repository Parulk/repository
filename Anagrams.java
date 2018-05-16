package com.kronos.test;

public class Anagrams {

	public static void main(String[] args) {
		
		String s= "tac";
		int l=0;
		int r= s.length()-1;
		int k =2;
		printAllAnagrams(s,l,r,k);

	}
	
	static void printAllAnagrams(String s, int l, int r, int k)
	{
		if(l==k)
		{
			if(isValidAnagram(s))
			System.out.println(s);
		}
		else
		{		
		for(int i=l;i<=k;i++)
		{
			s = swap(s,l,i);
			printAllAnagrams(s, l+1,r, k);
			s= swap(s,l,i);
		 }
	  }
   }
	
	static boolean isValidAnagram(String s) {
		String wordArr[]={"cat", "dog", "tac", "god", "act"};
		for(int i=0;i<wordArr.length;i++)
		{
			if(s.equalsIgnoreCase(wordArr[i]))
				return true;
		}
			return false;
	}

	static String swap(String s,int a, int b)
			{
		        char[] sw= s.toCharArray();
		        char temp;
		        temp= sw[a];
		        sw[a]= sw[b];
		        sw[b]= temp;
		        
	      return (String.valueOf(sw));
			}
	   

}

/*for(Map.Entry<String,Integer> entry : treeMap.entrySet()) {
	  String key = entry.getKey();
	  Integer value = entry.getValue();

	  System.out.println(key + " => " + value);
	}*/

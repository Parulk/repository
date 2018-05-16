package com.kronos.test;
//Excel column name to number
public class NameToNumber {

	public static void main(String[] args) {
		
		nameToNumber("A");

	}
	
	static void nameToNumber(String s)
	{
		if(s==null)
			return;
		int result=0;
		int i = s.length()-1;
		int t=0;
		while(i>=0)
		{
			char c = s.charAt(i);
			result = result +(int) Math.pow(26, t)*(c-'A'+1);
			t++;
			i--;
		}
		System.out.println(result);
	}

}

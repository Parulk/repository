package com.kronos.test;

//Excel coulumn number to name
public class NumberToName {

	public static void main(String[] args) {
		
		numberToName(26);
		numberToName(80);
		numberToName(676);
		numberToName(705);
		
	}
	
	static void numberToName(int n)
	{
		
		StringBuilder sb = new StringBuilder();
		
		while(n>0)
		{
			n--;
			char c= (char)(n%26 +'A');
			n=n/26;
			sb.append(c);
		}
		sb = sb.reverse();
		System.out.println(sb);
	}

}

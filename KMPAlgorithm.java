package com.kronos.test;

public class KMPAlgorithm {
	
	public static void main(String[] args)
	{
	
	String text1 = "bacbabababacaca";
	String pattern1 = "ababaca";
	char text[] = text1.toCharArray();
	char pattern[] = pattern1.toCharArray();
	kmpSearch(text,pattern);
	}
	
	static void kmpSearch(char[] text, char[] pattern)
	{
		int[] lps = new int[pattern.length];
		int m= text.length;
		lps = computeLpsArray(pattern);
		int n=lps.length;
		
		for(int i=0,j=0;i<m;)
		{
			if(text[i]==pattern[j])
			{
				i++;
				j++;
			}
			if(j == n)
			{
				System.out.println("Pattern found at " + (i-j));
				j =lps[j-1];
			}
			else if(i<m && text[i]!=pattern[j])
			{
				if(j!=0)
				j=lps[j-1];
				else
					i=i+1;
			}
		}
	}
	
	static int[] computeLpsArray(char[] pattern)
	{
		int n= pattern.length;
		int[] temp = new int[n];
		int i=1;
		int j=0;
		temp[0]=0;
		while(i<n)
		{
			if(pattern[i]==pattern[j])
			{
				temp[i]=j+1;
				i++;
		        j++;
			}
			else if(pattern[i]!=pattern[j])
			{
				if(j!=0){
				      j=temp[j-1];
				}
				else
				{
					temp[i]=0;
				   i++;
				}
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(temp[k] + " ");
		}
		return temp;
	}

}

package com.kronos.test;

public class moveSpaces {

	public static void main(String[] args) {
	
		String in = "move spaces to the front";
		char[] s_in = in.toCharArray();
		int n = s_in.length;
		int i=n-1,j=n-1;
		
		for(i=n-1,j=n-1;i>=0;i--)
		{
			if(s_in[i]!=' ')
			{
				s_in[j--]=s_in[i];
				}
		}
		while(j>=0)
		{
			s_in[j--] ='p';
		}
	  
		System.out.println(s_in);
	}

}

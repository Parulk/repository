package com.kronos.test;

import java.util.Scanner;

public class BinaryReps {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		convertToBinary(x);
		
	}
	
	static void convertToBinary(int x)
	{
		String a="";
		int i=0;
		while(x>0)
		{
		i= x%2;
		if(i==1)
			a +="1";
		else
		    a +="0";
		x=x/2;
		}
		for(int j=a.length()-1;j>=0;j--)
			System.out.print(a.charAt(j));
	}

}

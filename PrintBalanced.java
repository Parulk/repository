package com.kronos.test;

public class PrintBalanced {

	public static void main(String[] args) {

         int n= 4;
         char[] str = new char[8];
         printBalanced(str,n);

	}
	
	static void printBalanced(char[] str, int n)
	{
		printBal(str,n,0,0,0);
	}
	
	static void printBal(char str[], int n, int open, int close, int position)
	{
		if(close==n)
		{
			for(int i=0;i<str.length;i++)
				System.out.print(str[i]);
				System.out.println();
				return;
		}
		else{
		if(open<n)
		{
			str[position]='{';
			printBal(str, n, open+1,close,position+1);
		}
		if(open>close){
			str[position]='}';
			printBal(str, n, open, close+1, position+1);
		}
	  }
	}

}

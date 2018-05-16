package com.kronos.test;

import java.util.Stack;

public class BalanceParantheses {

	public static void main(String[] args) {
		 String exp = "{[]}{(())";
		 char[] a = exp.toCharArray();
		 int n=a.length;
		 isBalanced(a,n);

	}
	
	static void isBalanced(char[] a, int n)
	{
		System.out.println(a);
		Stack<Character> s= new Stack<Character>();
		int i=0;
	    while(i!=n)
	    {
	    	if(a[i]== '{' || a[i]=='(' || a[i]=='[')
	    	{
	    		s.push(a[i]);
	    		i++;
	    	}
	    	else if(a[i]=='}' || a[i]==')' || a[i]==']')
	    	{
	    		if(s.isEmpty()){
	    			System.out.println("Error");
	    		   break;
	    		}
	    		else if(!s.isEmpty()){
	    			char c= s.pop();
	    			if(( c == '{' && a[i]=='}') || (c== '(' && a[i]==')') || (c== '[' && a[i]==']')){
//	    				System.out.println("matched");
	    			     i++;
	    			}
	    			else
	    			{
//	    				System.out.println("does not match");
	    			    break;
	    			}
	    		}
	    		
	    	}
	    }
	    if(!s.isEmpty())
	    	System.out.println("Not Balanced");
	    else
	    	System.out.println("Balanced");
	}

}

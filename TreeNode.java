package com.kronos.test;

public class TreeNode {
	
    
	@Override
	public String toString() {
		return "TreeNode [val=" + val + "]";
	}

	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x)
	{
	   val=x;
	   left = right=null;
	}

}

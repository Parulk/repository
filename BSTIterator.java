package com.kronos.test;

import java.util.Stack;

public class BSTIterator {
	
	Stack<TreeNode> st;
	public BSTIterator(TreeNode root) {
		
		st= new Stack<TreeNode>();
		while(root!=null)
		{
			st.push(root);
			root=root.left;
		}
	}

	
	public int next()
	{
		TreeNode node = st.pop();
		int result = node.val;
		if(node.right!=null)
	     node=node.right;
		while(node!=null)
		{
			st.push(node);
			node=node.left;
		}
		return result;
	}
	
	public boolean hasNext()
	{
		return !st.isEmpty();
	}
}

 

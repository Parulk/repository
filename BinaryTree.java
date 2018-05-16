package com.kronos.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class BinaryTree {
	
	
	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

	TreeNode root;
	TreeNode lca(TreeNode node, int n1, int n2)
	{
		TreeNode left=null; TreeNode right=null;
		if(node==null)
			return null;
		if(node.val==n1 || node.val==n2)
		     return node;
		left= lca(node.left,n1,n2);
		right= lca(node.right,n1,n2);
		if(left!=null && right!=null)
			return node;
		else return(left != null?left:right);
     }
	
	static void PreOrder(TreeNode node)
	{
		if(node==null)
			return;
		if(node != null)
		{
		System.out.println(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
		}
	}
	static void InOrder(TreeNode node)
	{
		if(node==null)
			return;
		if(node != null)
		{
		InOrder(node.left);
		System.out.println(node.val + " ");
		InOrder(node.right);
		}
	}
	
	static void PostOrder(TreeNode node)
	{
		if(node==null)
			return;
		if(node != null)
		{
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.println(node.val + " ");
		}
	}

	
	static void PreOrderIterative(TreeNode node)
	{
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode temp;
		while(true)
		{
			while(node!=null)
			{
				System.out.println(node.val + " ");
				s.push(node);
				node = node.left;
			}
			if(s.isEmpty())
				break;
			node=s.pop();
			node=node.right;
		}
    }
	
	static void InOrderIterative(TreeNode node)
	{
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ArrayList<Integer> lsi = new ArrayList<Integer>();
		TreeNode temp;
		while(true)
		{
			while(node!=null)
			{
				ls.add(node.val);
				s.push(node);
				node = node.left;
			}
			if(s.isEmpty())
				break;
			node=s.pop();
			lsi.add(node.val);
			node=node.right;
		}
		System.out.println(lsi);
		Collections.sort(ls);
		System.out.println(ls);
		
//		for(int i=0;i<ls.size()-1;i++)
//		{
//			for(int j=i+1;j<ls.size();)
//			{
//			if(ls.get(j)<ls.get(i) && (j-i!=1))
//			{
//				System.out.println(ls.get(i) + "," + ls.get(j));
//				j=j+1;
//			   }
//			else
//			  {
//				j=j+1;
//			  }
//		    }
//       }
	}
	
	static void LevelOrder(TreeNode node)
	{
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode temp;
		if(node!=null)
			q.add(node);
		while(!q.isEmpty())
		{
			temp=q.poll();
			if(temp!=null)
				System.out.println(temp.val);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	
	static void PostOrderIterative(TreeNode node)
	{
		Stack<TreeNode> s = new Stack<TreeNode>();
		ArrayList<Integer> ls = new ArrayList<Integer>();
		TreeNode temp;
		while(true)
		{
			while(node!=null)
			{
				ls.add(node.val);
				s.push(node);
				node = node.right;
			}
			if(s.isEmpty())
				break;
			node=s.pop();
			node=node.left;
		}
		Collections.reverse(ls);
		System.out.println(ls);
	}
	
	static void printLeftView(TreeNode node)
	{

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		TreeNode temp;
		if(node!=null)
			q.add(node);
		while(!q.isEmpty())
		{
			int n=q.size();
			for(int i=0;i<n;i++){
			temp=q.poll();
			if(i==0)
				System.out.println("left view : " +temp.val);
			if(i==n-1)
				System.out.println("right view: " + temp.val);
			if(temp.left == null && temp.right == null)
			    System.out.println("leaf node : " + temp.val);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
			}
		}
	}
  
}
	


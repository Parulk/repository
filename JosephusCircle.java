package com.kronos.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.kronos.test.*;

class Node{
	int data;
	Node next;
	public Node(int x)
	{
		data=x;
		next=null;
	}
}

public class JosephusCircle {
	
	public static void main(String[] args) {
		
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = in.nextInt();
     getJosephusPosition(n,k);
     
	}
	
	static void getJosephusPosition(int a,int b)
	{
		Node head = new Node(1);
		Node prev = head;
		
		for(int i=2;i<=a;i++)
		{
			Node newNode = new Node(i);
			prev.next=newNode;
			prev=prev.next;
		}
		prev.next=head;
		Node current=head;
//		do
//		{
//		System.out.println(current.data);
//		current=current.next;
//		}while(current!=head);
		
		Node ptrS=head;
		Node ptrE=head;
		
		while(ptrS.next!=ptrS)
		{
			int count=1;
			while(count!=b)
			{
				ptrE=ptrS;
				ptrS=ptrS.next;
				count++;
			}
			ptrE.next=ptrS.next;
			ptrS=ptrE.next;
	  }
		System.out.println(ptrS.data);
	}

}

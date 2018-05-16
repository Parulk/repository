package com.kronos.test;


public class SingleLL {
	
	Node head;
	
	public SingleLL()
	{
		head=null;
	}
	
	static void insert(Node head, int data, int position)
	{
			Node newNode = new Node(data);
			newNode.next=null;
            int k=1;
            Node p= null;
            Node q=null;
            if(position==1)
            {
            	if(head!=null)
            	{
            		newNode.next=head;
            		head=newNode;
            	}
            	else
            	{
            		head=newNode;
            	}
            }
            else
            {
            	p=head;
            	while(p!=null && k<position)
            	{
            		k++;
            		q=p;
            		p=p.next;
            	}
            	q.next=newNode;
            	newNode.next=p;
            }
	  }
  
}

package com.kronos.test;

import java.util.HashMap;
import java.util.Map;

//to detect cycle in an undirected graph as well as disjoint set implementation

public class DisjointSets {
	
	private Map<Long, Node> mp = new HashMap<Long, Node>();

   class Node{
	
	int rank;
	long data;
	Node parent;
   }
   
   public void makeSet(long data)
   {
	  Node node = new Node();
	  node.data=data;
	  node.rank=-1;
	  node.parent=node;
	  mp.put(data, node);
   }
   
   public long findSet(long data)
   {
	   return findSetN(mp.get(data)).data;
   }
   
   private Node findSetN(Node node){
	   Node p=node.parent;
	   if(p == node)
		   return node;
	   else
		   node.parent = findSetN(node.parent);
		   return node.parent;
   }
   
   public void union(long x, long y)
   {
	   Node node1= mp.get(x);
	   Node node2= mp.get(y);
	   
	   Node parent1 = findSetN(node1);
	   Node parent2 = findSetN(node2);
	   
	   if((parent1.data)==(parent2.data))
		   return;
	   else if(parent1.rank < parent2.rank)
	   {
		   parent1.parent=parent2;
	   }
	   else if(parent2.rank < parent1.rank)
	   {
		   parent2.parent=parent1;
	   }
	   else //if(node1.rank==node2.rank)
	   {
		   parent2.parent=parent1;
		   parent1.rank++;
	   }
   }
   
   public void display()
   {
	  for(Long i: mp.keySet()){
		  String key =i.toString();
          String value = mp.get(i).toString();
          System.out.println(key + " " + value);
		  }
	   
   }
   

public static void main(String[] args)
   {
	   DisjointSets ds = new DisjointSets();
	   ds.makeSet(1);
	   ds.makeSet(2);
	   ds.makeSet(0);
//	   ds.makeSet(4);
//	   ds.makeSet(5);
//	   ds.makeSet(6);
//	   ds.makeSet(7);
	   
	   ds.union(0, 1);
	   ds.union(1, 2);
//	   ds.union(4, 5);
//	   ds.union(6, 7);
//	   ds.union(5, 6);
//	   ds.union(3, 7);
//	   ds.display();
	   System.out.println(ds.findSet(2));
	   System.out.println(ds.findSet(1));
	   System.out.println(ds.findSet(0));
//	   System.out.println(ds.findSet(7));
//	   System.out.println(ds.findSet(3));
//	   System.out.println(ds.findSet(5));
//	   System.out.println(ds.findSet(6));
   }
   
}

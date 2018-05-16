package com.kronos.test;

import java.util.Arrays;

public class KruskalMST {
	
class Graph{
	
	class Edge implements Comparable<Edge>
	{
		int src, dest, weight;
		
		@Override
		public int compareTo(Edge e) {
			return this.weight-e.weight;
		}
	};
	
	class subset{
		
		int parent;
		int rank;
	};
	
	int V,E;
	Edge edge[];
	Graph(int v, int e)
	{
		V=v;
		E=e;
		edge=new Edge[E];
		for(int i=0;i<E;i++)
		{
			edge[i]=new Edge();
		}
	}
	
	public int find(subset sub[],int x)
	{
		if(sub[x].parent ==x)
			return x;
		else
		{
			sub[x].parent = find(sub,sub[x].parent);
			return sub[x].parent;
		}
		
	}
	
	public void union(subset sub[], int x, int y)
	{
		int xp = find(sub,x);
		int yp = find(sub,y);
		if(xp == yp)
			return;
		else if(sub[xp].rank<sub[yp].rank)
			sub[xp].parent=yp;
		else if(sub[yp].rank < sub[xp].rank)
			sub[yp].parent=xp;
		else //i(sub[xp].rank==sub[yp].rank)
			sub[xp].parent=yp;
		    sub[yp].rank++;
	}
	
	public void kruskalMST()
	{
		Edge result[]= new Edge[E];
		for(int i=0;i<E;i++)
			result[i]=new Edge();
		
		Arrays.sort(edge);
		
		subset sub[] = new subset[V];
		for(int i=0;i<V;i++)
		{
			sub[i]= new subset();
		}
		for(int i=0;i<V;i++)
		{
			sub[i].parent=i;
			sub[i].rank=0;
		}
		
		int k=0;
		int p=0;
		while(k < V-1)
		{
			Edge next = new  Edge();
			next = edge[p++];
			
			int x = find(sub,next.src);
			int y = find(sub, next.dest);
			
			if(x!=y)
			{
				result[k++]=next;
				union(sub,x,y);
			}
		}
		
		for (int i = 0; i < E; ++i)
            System.out.println(result[i].src+" -- " + 
                   result[i].dest+" == " + result[i].weight);
	  }
  };
   
  public static void main(String[] args)
  {
	  int V = 4;  // Number of vertices in graph
      int E = 5;  // Number of edges in graph
      KruskalMST ks = new KruskalMST();
      Graph graph =  ks.new Graph(V, E);

      // add edge 0-1
      graph.edge[0].src = 0;
      graph.edge[0].dest = 1;
      graph.edge[0].weight = 10;

      // add edge 0-2
      graph.edge[1].src = 0;
      graph.edge[1].dest = 2;
      graph.edge[1].weight = 6;

      // add edge 0-3
      graph.edge[2].src = 0;
      graph.edge[2].dest = 3;
      graph.edge[2].weight = 5;

      // add edge 1-3
      graph.edge[3].src = 1;
      graph.edge[3].dest = 3;
      graph.edge[3].weight = 15;

      // add edge 2-3
      graph.edge[4].src = 2;
      graph.edge[4].dest = 3;
      graph.edge[4].weight = 4;

      graph.kruskalMST();
    }
}

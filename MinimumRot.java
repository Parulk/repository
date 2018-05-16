package com.kronos.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point1{
	
	int x;
	int y;
	
	public Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class MinimumRot {
	
	static int ix[] ={0, 1, -1, 0};
	static int iy[] ={1, 0, 0, -1};
	static int n,m;
	
	static boolean check(int x, int y){
		
		if(x<0 || y<0 || x>=n || y>=m)
			return false;
		
		return true;
      }
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		int [][] arr = new int[100][100];
		boolean vis[][] = new boolean[100][100];
		int count =0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		
		Queue<Point1> q = new LinkedList<Point1>();
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(arr[i][j]==2)
					 q.add(new Point1(i, j));
			 }
		 }
		 q.add(new Point1(-1,-1));
		 
		 while(!q.isEmpty())
		 {
			 Point1 temp=q.remove();
			 
			 int p1,q1;
			 
			 if(temp.x !=-1 && temp.y!=-1)
			 {
				for(int i=0; i<4; i++){
					
					p1 = temp.x + ix[i];
					q1 = temp.y + iy[i];
					
					if(check(p1,q1) && !vis[p1][q1] && arr[p1][q1] == 1){
						arr[p1][q1]=2;
						q.add(new Point1(p1,q1));
						vis[p1][q1] = true;
					}
					
				}
		     }
			 else if(temp.x==-1 && temp.y== -1)
			 {
				 count++;
				if(!q.isEmpty())
					q.add(new Point1(-1, -1));
			 }
			 
		}
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(arr[i][j]==1)
				   System.out.println("Rotten orange present");
				 else
					 break;
			 }
		 }
		 System.out.println(count-1);
		
      }
}

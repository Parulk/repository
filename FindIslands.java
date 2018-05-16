package com.kronos.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
}
public class FindIslands {

	static int ix[] ={0, 1, -1, 0};
	static int iy[] ={1, 0, 0, -1};
	static int n,m;
	
	static boolean check(int x, int y){
		
		if(x<0 || y<0 || x>=n || y>=m)
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		
		int ar[][] = new int[100][100];
		boolean vis[][] = new boolean[100][100];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				ar[i][j] = in.nextInt();
				vis[i][j] = false;
			}
		}
		
		int count=0;
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m ;j++){
				
				if(ar[i][j] == 1 && !vis[i][j]){
					
					System.out.println("# "+ i +" "+ j);
					bfs(i,j,ar,vis);
					count++;
				}
				
			}
		}
		
		System.out.println(count);

	}

	private static void bfs(int x, int y, int ar[][], boolean vis[][]) {
		
		Queue<Point> queue = new LinkedList<Point>();
		
		queue.add(new Point(x,y));
		vis[x][y] = true;
		
		while(!queue.isEmpty()){
			
			Point temp = queue.remove();
			
			int p,q;
			for(int i=0; i<4; i++){
				
				p = temp.x + ix[i];
				q = temp.y + iy[i];
				
				if(check(p,q) && !vis[p][q] && ar[p][q] == 1){
					queue.add(new Point(p,q));
					vis[p][q] = true;
				}				
				
			}
			
		}
		
	}

}

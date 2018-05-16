package com.kronos.test;

import java.util.Scanner;

public class PatternPresent {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		int m;
		n=in.nextInt();
		m=in.nextInt();
		String s1= "GEEKSFORGEEKS"; 
		
        char[][] grid = new char[n][m];
        int offset=0;
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
        		grid[i][j]= s1.charAt(offset++);
        	}
        	
        }
		System.out.println(grid);
		
	}

}

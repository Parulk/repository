package com.kronos.test;

public class Invertmage {
	
	public static void main(String[] args){
	int a[][]={{1,1,0},{1,0,1},{0,0,0}};
	int b[][] = new int[a[0].length][];
	 b=flipAndInvertImage(a);
	 for(int i=0;i<a[0].length;i++)
	 {
		 for(int j=0;j<a[0].length;j++)
		 {
			 System.out.print(a[i][j]+ " ");
			 if(j==a[0].length-1)
			 {
				 System.out.println("\n");
			 }
		 }
	 }
	}

	private static int[][] flipAndInvertImage(int[][] a) {
        
		int i=0;
		int j=0;int k=a[0].length;
        for(i=0;i<a[0].length;i++)
        {
        	for(j=0,k=a[0].length-1;j<k;j++,k--)
        	{
        		int temp= a[i][j];
        		a[i][j]=a[i][k];
        		a[i][k]=temp;
        	}
        }
        for(i=0;i<a[0].length;i++)
        {
        	for(j=0;j<a[0].length;j++)
        	{
        		if(a[i][j]==0)
        		{
        			a[i][j]=1;
        		}
        		else
        		{
        			a[i][j]=0;
        		}
        	}
        }
        
		return a;
	}
	
	

}

package com.kronos.test;

public class LongestCommonSubstring {
	
	    static void LCSubStr(char X[], char Y[], int m, int n) 
	    {
	        int LCStuff[][] = new int[m + 1][n + 1];
	        int result = 0;  // To store length of the longest common substring
	         
	        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
	        for (int i = 0; i <= m; i++) 
	        {
	            for (int j = 0; j <= n; j++) 
	            {
	                if (i == 0 || j == 0)
	                    LCStuff[i][j] = 0;
	                else if (X[i - 1] == Y[j - 1])
	                {
	                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
	                    result = Math.max(result, LCStuff[i][j]);
	                } 
	                else
	                    LCStuff[i][j] = 0;
	            }
	        }
	      System.out.println(result);
	      int p = result;
	      char[] res = new char[p+1];
	      res[p]='\0';
	      int x=m,y=n;
	      while(x>0 && y>0)
	      {
	    	  if(LCStuff[x][y] == LCStuff[x - 1][y - 1] + 1)
	    	  {
	    		  res[p-1]=X[x-1];
	    		  p--;
	    		  x--;
	    		  y--;
	    	  }
	    	  else
	    	  {
	    		  x--;
	    		  y--;
	    	  }
	      }
	      for(int k=0;k<=p;k++)
	      {
	    	  System.out.print(res[k]);
	      }
	    }
	    
	     
	    // Driver Program to test above function
	    public static void main(String[] args) 
	    {
	        String X = "forgeeksskeegfor";
	        String Y = "rofgeeksskeegrof";
	 
	        int m = X.length();
	        int n = Y.length();
	 
	        LCSubStr(X.toCharArray(), Y.toCharArray(), m, n);
	    }
	}

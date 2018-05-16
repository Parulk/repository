package com.kronos.test;

public class ShortestCommonSuper {


			public static void main(String[] args) {
				
				String s1 = "AGGTAB";
			    String s2 = "GXTXAYB";
			    
			    char[] a=s1.toCharArray();
			    char[] b=s2.toCharArray();
			    int m=a.length;
			    int n=b.length;
			    findlcs(a,b,m,n);

			}

			static void findlcs(char[] a, char[] b, int m,int n)
			{
				int[][] dp = new int[m+1][n+1];
				
				for(int i=0;i<=m;i++)
				{
					for(int j=0;j<=n;j++)
					{
						if(i==0||j==0)
							dp[i][j]=0;
						else if(a[i-1]==b[j-1])
							dp[i][j]= 1+dp[i-1][j-1];
						else 
							dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
					}
				}
				System.out.println(m+n-dp[m][n]);
				
				
				int p= m+n-dp[m][n];
				char[] lcs = new char[p+1];
				lcs[p]='\0';
				int i=m,j=n;
				while(i>0 && j>0){
						if(a[i-1]==b[j-1])
						{
							lcs[p-1]=a[i-1];
							p--;
							i--;
							j--;
						}
						else if(dp[i-1][j]>dp[i][j-1])
						{ 
							lcs[p-1]=a[i-1];
							i--;
							p--;
						}
						else
						{
							lcs[p-1]=b[j-1];
							p--;
							j--;
						}
				}
						while(i>0)
						{
							lcs[p-1]=a[i-1];
							p--;
							i--;
						}
						while(j>0)
						{
							lcs[p-1]=b[j-1];
							p--;
							j--;
						}
						System.out.println(lcs);
					}
			
			static int max(int a, int b)
			{
				return (a>b)?a:b;
			}


}

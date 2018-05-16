package com.kronos.test;


public class HackTest {

	public static void main(String[] args) {
		
		String s =mergeString("zbxnsjdns", "idowdk");
		 System.out.println(s);
	}
	
	static String mergeString(String a , String b)
	{
		char[] arr = a.toCharArray();
		char[] brr = b.toCharArray();
		int n = arr.length;
		int m = brr.length;
		int i=0,j=0,k=0;
		char[] crr = new char[n+m];
		
		for(i=0;i<n+m;i=i+2)
		{
			crr[i]=arr[j++];
			crr[i+1]=brr[k++];
			if(j==n || k==m)
				break;
		}
		i=i+2;
		while(j!=n)
		{
			crr[i]=arr[j];
			i++;
			j++;
		}
		while(k!=m)
		{
			crr[i]=brr[k];
			i++;
			k++;
		}
		String res = new String(crr);
		return res;	
	}
}

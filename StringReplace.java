package com.kronos.test;

public class StringReplace {

	public static void main(String[] args) {
//		String s = "wreorttvosuidhrxvmvo";
//		int[] index= {14,12,10,5,0,18};
//		String[] sources={"rxv","dh","ui","ttv","wreor","vo"};
//		String targets[]={"frs","c","ql","qpir","gwbeve","n"};
		
//		String s = "abcd";
//		int[] index= {0,2};
//		String[] sources={"ab","ec"};
//		String targets[]={"eee","ffff"}; 
		
		String s = "fvokzonyhukpwbnkomdianhirsvdulhsfseaqzktupyeverfsd";
		int[] index= {26,30,38,2,41,10,8,44,19,4,13,28,21,35,23,16};
		String[] sources={"vd","hsfs","ktu","ok","pye","kp","hu","verfs","ia","zon","bnk","ul","nh","aqz","irs","om"};
		String targets[]={"h","gdlf","nl","sr","xhn","ax","arf","ifuax","a","mk","vwqe","fdl","n","miyr","ibh","den"}; 
		
		
		System.out.println(findReplaceString(s,index,sources,targets));

	}
	
 static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
	 
	 int i=0;
	 int t=0;
	 String a = S;
	 System.out.println(S.indexOf("vd"));
	 for(i=0;i<indexes.length;)
	 {
		 if(a.contains(sources[i]))
		 {
			if(a.indexOf(sources[i])== indexes[i])
			{
				a=a.replace(sources[i], targets[i]);
				i++;
			}
			else{
				indexes[i]=-1;
				i++;
			}
		 }
		 else{
			 sources[i]="NA";
			 i++;
		 }
	 }
	 System.out.println(a);
	 while(i<S.length())
	 { 
//		
        if(t==sources.length)
        {
        	break;
        }
		if(S.contains(sources[t]))
		{
		   S=S.replace(sources[t], targets[t]);
		   t++;
		}
	   //}
		i++;
	 }	
	return S;
        
    }

}

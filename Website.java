package com.kronos.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Website {
	
	static List<String> url = new ArrayList<String>();
	static TreeMap<String,Integer> mp = new TreeMap<String,Integer>();
	
	public void addUrl(String l)
	{
		url.add(l);
		if(!mp.containsKey(l))
		{
			mp.put(l, 1);
		}
		else if(mp.containsKey(l))
		{
			int count = mp.get(l);
			count = count + 1;
			mp.put(l, count);
		}
	}
	
	public static List<String> getMostVisitedPages()
	{
		List<String> ls = new ArrayList<String>();
		int c = 0;
		Set set = mp.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			String link = (String) me.getKey();
			Integer val= (Integer) me.getValue();
			if(val!=1)
			{
				c=c+1;
			}
			ls.add(link);
		}
		System.out.println(c);
		return ls;
	}
	
   public static void main(String[] args)
  
	{
		Website web = new Website();
		web.addUrl("http://www.google.com");
		web.addUrl("http://www.hackerearth.com");
		web.addUrl("http://www.geeksforgeeks.com");
		web.addUrl("http://www.google.com");
		web.addUrl("http://www.geeksforgeeks.com");
		web.addUrl("http://www.geeksforgeeks.com");
		web.addUrl("http://www.hackerrank.com");
		
		List<String> result =Website.getMostVisitedPages();
		ListIterator<String> lsi = result.listIterator();
		while(lsi.hasNext())
		{
			System.out.println(lsi.next());
		}
		
		
	}
}


package com.kronos.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LRUCache {
	
	static Deque<Integer> dq;
	static HashMap<Integer, Integer> mp;
	private final int csize;
	
	public LRUCache(int n)
	{
		this.csize = n;
		dq = new ArrayDeque<Integer>(csize);
		mp = new HashMap<Integer, Integer>(csize);
	}
	
	public void refer(int x)
	{
		int last=0;
//		System.out.println(last);
//		System.out.println(mp.get(x));
		if(null==mp.get(x))
		{
			if(dq.size() == csize)
			{
				last = dq.pollLast();
				mp.remove(last);
			    dq.offerFirst(x);
			    mp.put(x, x);
			    display();
			    System.out.println("\n");
			}
			else if(dq.size()!= csize)
			{
				dq.offerFirst(x);
				mp.put(x, x);
				display();
				System.out.println("\n");
			}
		}
		
		else if(mp.containsKey(x))
		{
		    mp.remove(dq.pollLast());
		    dq.offerFirst(x);
		    mp.put(x, x);
		    display();
		    System.out.println("\n");
		}
		
		
		
}

	public int getCsize() {
		return csize;
	}

	public void display()
	{
		Iterator<Integer> itr = dq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
			
		}
		
//		for(Integer i:dq)
//		{
//			System.out.println(i);
//		}
//		
     }

}


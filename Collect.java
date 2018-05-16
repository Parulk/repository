package com.kronos.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


class Person implements Comparable<Person>{
	
	private int id;
	private String name;
	
	public Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	//---setters---
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//---getters---
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Person p) {
//		int len1 =name.length();
//		int len2 =p.name.length();
//		if(len1>len2)
//			return 2;
//		else if(len1<len2)
//		   return -2;
//		else 
//			return name.compareTo(p.name);
		
		Integer i1=id;
		Integer i2=p.id;
		return i1.compareTo(i2);
		
//		return name.compareTo(p.name);
	}
	
	
}

public class Collect {
	
	public static void main(String[] args)
	{
		SortedSet<Person> st = new TreeSet<Person>();
		List<Person> ls = new ArrayList<Person>();
		
		addElement(ls);
		addElement(st);
		
		showElement(ls);
		System.out.println();
		showElement(st);
		
		Collections.sort(ls);
		
	}
	
	public static void addElement(Collection<Person> ppl)
	{
		ppl.add(new Person(1,"Jon"));
		ppl.add(new Person(5,"Sue"));
		ppl.add(new Person(3,"Jack"));
		ppl.add(new Person(4,"Clark"));
	}
	
	public static void showElement(Collection<Person> ppl)
	{
		for(Person i:ppl)
		{
			System.out.println(i);
		}
    }
	
	

}

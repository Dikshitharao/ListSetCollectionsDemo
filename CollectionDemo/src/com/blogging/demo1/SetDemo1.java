package com.blogging.demo1;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Set s = new TreeSet();
	    s.add("a");
	    s.add("f");
	    s.add("c");
	    s.add("b");
	    s.add("d");
	    s.add(2);	    
	    System.out.println(s);
	    
	    s.remove("a");
	    System.out.println("After removing 'a' element: "+s);
	    
	    System.out.println("Checking if 'a' is present or no in the given set: "+s.contains("a"));
	    
	    System.out.println("Size of the set is "+s.size());
	    
	    s.removeAll(s);
	    System.out.println("After removing all the elements :"+s);
	    
	    
	    
	    
	   
	    
	}

}

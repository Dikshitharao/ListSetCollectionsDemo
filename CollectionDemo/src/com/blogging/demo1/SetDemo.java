package com.blogging.demo1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s = new HashSet();
	    s.add(34);
	    s.add(2);
	    s.add(56);
	    s.add(100);
	    s.add(null);
	    System.out.println("Hash set : "+s);//Observe that this set takes null values, that appears at the beginning.
	    
	    Set s1 = new LinkedHashSet();
	    s1.add(34);
	    s1.add(2);
	    s1.add(56);
	    s1.add(null);
	    System.out.println("Linked hash set :"+s1);//Observe how elements are in the same order as they were entered.
	    
	    Set s2 = new TreeSet();
	    s2.add(34);
	    s2.add(2);
	    s2.add(56);
	    
	    System.out.println("Tree set : "+s2);//Observe how the elements enetered arre sorted and try to add a null value to treeset and observe the output
	    

	}

}

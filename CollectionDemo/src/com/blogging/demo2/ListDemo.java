package com.blogging.demo2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(4);
		l.add(56);
		l.add(43);
		System.out.println(l);//Observe that the list are in order
		
		List<String> ll = new LinkedList<String>();
		ll.add("java");
		ll.add("is");
		ll.add("so");
		ll.add("cool");
		System.out.println(ll);//Observe that the list are in order
		
	
		

	}

}

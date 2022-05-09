package com.guardian.mypractice;

import java.util.LinkedList;
import java.util.List;

public class LinkPrac {

	public static void main(String[] args) {
	
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("Apple");
		link1.add("Amazon");
		link1.add("Facebook");
		link1.add("Microsoft");
		link1.add("Netflix");
		link1.add("Google");
		
		link1.addFirst("Fitlrsoc");
		link1.addLast("Lastloc");
		
		System.out.println(link1.set(2,"nnnnnnnnnnn"));
		System.out.println(link1.contains("abc"));
		System.out.println(link1.size());
		System.out.println(link1.indexOf("Google"));
		//Collection.link1(sort);
	
		
		for(String i: link1) {
			System.out.println("Brand name is "+i);
		}

	}

}

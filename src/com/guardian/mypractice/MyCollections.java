package com.guardian.mypractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollections {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();

		list.add("Faridabad");
		list.add("Delhi");
		list.add("Gurgaon");
		list.add("Noida");
		list.add("Chennai");
		
		System.out.println(list.get(3));	
		//list.clear();
		System.out.println(list);
		System.out.println(list.contains("Noida"));
		System.out.println(list.remove(2));
		System.out.println(list.size());
		//System.out.println(list.indexOf('B'));
		//System.out.println(list.size());
		//System.out.println(list.isEmpty());
		System.out.println(list);
		//Iterator it = list.iterator();
		//while (it.hasNext()){
			//System.out.println(it.next());
			
		//}
	}

}

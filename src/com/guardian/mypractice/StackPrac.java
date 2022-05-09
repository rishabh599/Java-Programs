package com.guardian.mypractice;

import java.util.Collections;
import java.util.Stack;

public class StackPrac {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(21);
		s1.push(32);
		s1.push(41);
		s1.push(64);
		s1.push(51);
		s1.push(72);
		
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.push(99));
		System.out.println(30);
		
		//Collections.sort(s1);

	}

}

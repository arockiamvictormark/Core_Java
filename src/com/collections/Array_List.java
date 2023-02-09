package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(70);
		
		List<Integer> al2=new ArrayList<>();
		
		al2.add(30);
		al2.add(40);
		al2.add(50);
		al2.add(60);
		
		System.out.println(al);
		System.out.println(al2);
		System.out.println();
		
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al2);
		System.out.println();
		
		al.removeAll(al2);
		System.out.println(al);
		System.out.println(al2);
		System.out.println();
		
		al2.removeAll(al);
		System.out.println(al);
		System.out.println(al2);
		
	}

}

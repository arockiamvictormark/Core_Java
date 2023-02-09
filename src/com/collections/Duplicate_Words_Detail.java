package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Duplicate_Words_Detail {
	
	public static void main(String[] args) {
		
		String s="Welcome God god GOD here HERE where";
		System.out.println("String: "+s);		
		String lowerCase = s.toLowerCase();
		System.out.println("LowerCase: "+lowerCase);
		System.out.println();
		
		String[] split = lowerCase.split(" ");
		
		Map<String, Integer> dupe = new LinkedHashMap<>();
		
		for (String string : split) {
			
			System.out.println(string);
			System.out.println(dupe);
			System.out.println(dupe.get(string));
			System.out.println(dupe.containsKey(string));
			
			if (dupe.containsKey(string)) {
				dupe.put(string, dupe.get(string)+1);
			} else {
				dupe.put(string, 1);
			}
			
			System.out.println(dupe);
			System.out.println();
		}
		System.out.println();
		System.out.println(dupe);
		
		Set<Entry<String, Integer>> entrySet = dupe.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}

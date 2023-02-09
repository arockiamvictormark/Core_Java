package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Integer {
	
	public static void main(String[] args) {
		
		int[] dupArr = {10,20,10,30,10,40,30,50,10,50,30};
		
		Map<Integer, Integer> dupMap = new LinkedHashMap<>();
		for (int dupCheck : dupArr) {
			
			if(dupMap.containsKey(dupCheck)) {
				dupMap.put(dupCheck, dupMap.get(dupCheck)+1);
			}
			else {
				dupMap.put(dupCheck, 1);
			}
			
		}
		System.out.println("dupMap: "+dupMap);
		
		Set<Entry<Integer, Integer>> dupSet = dupMap.entrySet();
		for (Entry<Integer, Integer> dupCheck : dupSet) {
			if(dupCheck.getValue()>1)
				System.out.println(dupCheck);
		}
		
	}

}

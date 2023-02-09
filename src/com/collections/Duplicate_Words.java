package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate_Words {

	public static void main(String[] args) {

		String s="Welcome God god GOD here HERE where";
		String lowerCase = s.toLowerCase();
		String[] split = lowerCase.split(" ");

		Map<String, Integer> dupe = new LinkedHashMap<>();

		for (String string : split) {

			if (dupe.containsKey(string)) {
				dupe.put(string, dupe.get(string)+1);
			} else {
				dupe.put(string, 1);
			}

		}

		Set<Entry<String, Integer>> entrySet = dupe.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}

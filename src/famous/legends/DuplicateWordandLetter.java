package famous.legends;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordandLetter {
	
	private static void dupLet() {
		String s = "welcomegod";
		System.out.println("letters: "+s);
		char[] ch = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (charMap.containsKey(c)) {
				Integer it = charMap.get(c);
				charMap.put(c, it+1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println("charout: "+charMap);
		System.out.println("List of duplicate letters: ");
		Set<Entry<Character, Integer>> charSet = charMap.entrySet();
		for (Entry<Character, Integer> entry : charSet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}				
	}
	
	private static void dupWord() {
		String s = "welcome god god god here here where";
		System.out.println("words: "+s);
		String[] words = s.split(" ");
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		for (String string : words) {
			if (wordMap.containsKey(string)) {
				Integer it = wordMap.get(string);
				wordMap.put(string, it+1);
			} else {
				wordMap.put(string, 1);
			}
		}
		System.out.println("wordsOut: "+wordMap);
		System.out.println("List of duplicate words: ");
		Set<Entry<String, Integer>> entrySet = wordMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		dupLet();
		System.out.println();
		dupWord();
		System.out.println();
		wordCount();
		System.out.println();
		letterCount();
	}
	
	private static void wordCount() {
		String s = "welcome to java class java course to java";
		System.out.println("word: "+s);
		String[] words = s.split(" ");
		Map<String, Integer> wordMap = new LinkedHashMap<String, Integer>();
		for (String string : words) {
			if (wordMap.containsKey(string)) {
				Integer it = wordMap.get(string);
				wordMap.put(string, it+1);
			} else {
				wordMap.put(string, 1);
			}
		}
		System.out.println("word count: "+wordMap);
	}
	
	private static void letterCount() {
		String s = "welcome to java class java course to java";
		System.out.println("letter: "+s);
		char[] charArray = s.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if(charMap.containsKey(c)) {
				Integer it = charMap.get(c);
				charMap.put(c, it+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		System.out.println("letter count: "+charMap);
	}

}

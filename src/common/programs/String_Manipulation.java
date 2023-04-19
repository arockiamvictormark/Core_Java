package common.programs;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class String_Manipulation {
	
	public static void main(String[] args) {		
		countOfEachCharacters();
		firstLetterCaps();
		replaceString();
		duplicateFromArray();
	}
	
	private static void countOfEachCharacters() {
		String str = "M0bile number of Ar0ck!am Victor Mark !$ 9876543210";
		int caps=0,small=0,num=0,spl=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
				caps++;
			} else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
				small++;
			} else if (str.charAt(i)>='0' && str.charAt(i)<='9') {
				num++;
			}else {
				spl++;
			}
		}
		System.out.println("Caps: "+caps);
		System.out.println("Small: "+small);
		System.out.println("Num: "+num);
		System.out.println("Special: "+spl);
	}
	
	private static void firstLetterCaps() {
		String s = "welcome to java";
		String[] sa = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < sa.length; i++) {
			char c = sa[i].charAt(0);
			char su = Character.toUpperCase(c);
			String ss = sa[i].substring(1);
			sb.append(su).append(ss).append(" ");
		}
		String flc = sb.toString().trim();
		System.out.println("\n1st Caps: "+flc);
	}
	
	private static void replaceString() {
		String s = "Welcome to class";
		String rs = s.replace("to", "to my");
		System.out.println("\nReplaced String: "+rs);
	}
	
	private static void duplicateFromArray() {
		String[] s = {"ABC", "BCD", "CDE", "ABC", "BCD"};
		List<String> list = Arrays.asList(s);
		TreeSet<String> ts = new TreeSet<String>(list);
		System.out.println("\nDulicated removed in string: "+ts);
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i]==s[j])
					System.out.println("Duplicates are: "+s[i]);
			}
		}
	}

}

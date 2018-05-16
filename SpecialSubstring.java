package com.kronos.test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SpecialSubstring {

	public static void main(String[] args) {
		String s = "rejhiuecumovsutyrulqaeuouiecodjlmjeaummaoqkexylwaaopnfvlbiiiidyckzfhe";
		findSubstring(s);
	}

	private static void findSubstring(String s) {
		char[] ch = s.toCharArray();
		List<Integer> firstVowel = getFirstVowelIndex(s);
		List<String> substrings = new ArrayList<String>();
		for (int index : firstVowel) {
			int firstConsonent = getFirstConsonentIndex(ch, index);
			String firstsubstring = s.substring(index, firstConsonent + 1);
			substrings.add(firstsubstring);
		}
		Collections.sort(substrings);
		System.out.println(substrings.get(0));
		substrings.clear();

		int lastConsonent = getlastConsonentIndex(ch);
		List<Integer> lastVowel = getLastVowelIndex(s, lastConsonent);
		for (int index : lastVowel) {
			String lastsubstring = s.substring(index, lastConsonent + 1);
			substrings.add(lastsubstring);
		}

		Collections.sort(substrings);
		System.out.println(substrings.get(substrings.size() - 1));
	}

	private static int getlastConsonentIndex(char[] ch) {
		int lastIndex = ch.length - 1;
		while (isVowel(ch[lastIndex])) {
			lastIndex--;
		}
		return lastIndex;
	}

	private static List<Integer> getLastVowelIndex(String ss, int beforeIndex) {
		String s = ss.substring(0, beforeIndex);
		int temp = -1;
		char c = ' ';
		int index = s.indexOf('a');
		if (temp != -1) {
			index = temp;
			c = 'a';
		}
		temp = s.indexOf('e');
		if (temp != -1) {
			index = temp;
			c = 'e';
		}
		temp = s.indexOf('i');
		if (temp != -1) {
			index = temp;
			c = 'i';
		}
		temp = s.indexOf('o');
		if (temp != -1) {
			index = temp;
			c = 'o';
		}
		temp = s.indexOf('u');
		if (temp != -1) {
			index = temp;
			c = 'u';
		}
		return getAllIndexes(s, c);

	}

	private static int getFirstConsonentIndex(char[] c, int fromIndex) {
		while (isVowel(c[fromIndex])) {
			fromIndex++;
		}
		return fromIndex;
	}

	private static List<Integer> getFirstVowelIndex(String s) {
		int temp;
		int index = s.indexOf('u');
		char c = ' ';
		temp = s.indexOf('o');
		if (temp != -1) {
			index = temp;
			c = 'o';
		}
		temp = s.indexOf('i');
		if (temp != -1) {
			index = temp;
			c = 'i';
		}
		temp = s.indexOf('e');
		if (temp != -1) {
			index = temp;
			c = 'e';
		}
		temp = s.indexOf('a');
		if (temp != -1) {
			index = temp;
			c = 'a';
		}
		return getAllIndexes(s, c);
	}

	private static List getAllIndexes(String s, char c) {
		List<Integer> indexes = new ArrayList<Integer>();
		int index = s.indexOf(c);
		while (index >= 0) {
			indexes.add(index);
			index = s.indexOf(c, index + 1);
		}

		return indexes;
	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

}
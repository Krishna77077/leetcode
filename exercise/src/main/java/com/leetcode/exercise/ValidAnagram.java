package com.leetcode.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {

	public static boolean isAnagramUsingArrays(String s, String t) {
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		Arrays.sort(sChars);
		Arrays.sort(tChars);
		return Arrays.equals(tChars, sChars);
	}

	public static boolean isAnagramUsingHashMap(String s, String t) {
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> countMap = new HashMap<>();
		for (Character character : s.toCharArray()) {
			countMap.put(character, countMap.getOrDefault(character, 0) + 1);
		}
		for (Character character : t.toCharArray()) {
			countMap.put(character, countMap.getOrDefault(character, 0) - 1);
		}
		for (int value : countMap.values()) {
			if (value != 0)
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		// System.out.println(isAnagramUsingArrays("anagram", "nagaram"));
		// System.out.println(isAnagramUsingArrays("rat", "cat"));
		System.out.println(isAnagramUsingHashMap("anagram", "nagaram"));
	}

}

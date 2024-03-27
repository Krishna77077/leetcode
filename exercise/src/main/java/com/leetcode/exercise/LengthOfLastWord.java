package com.leetcode.exercise;

import java.util.Iterator;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length-1].length();
	}
	
	public static int lengthOfLastWordWithoutFunctions(String s) {
		int length = 0;
		for(int i = s.length()-1;i>0;i--) {
			if(s.charAt(i)!= ' ') length++;
			else 
				if(length>0) return length;
		}
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWordWithoutFunctions("Hello World"));
		System.out.println(lengthOfLastWordWithoutFunctions("   fly me   to   the moon  "));
	}

}

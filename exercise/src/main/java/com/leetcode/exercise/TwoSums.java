package com.leetcode.exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	/**
	 * Brute force Idea
	 * Time complexity O(n2)
	 * Space complexity O(n)
	 * */
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
	/**
	 * Optimal Idea
	 * Time complexity O(n2)
	 * Space complexity O(n)
	 * */
	public static int[] twoSumUsingHashMap(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		int diff;
		for(int i=0;i<nums.length;i++) {
			diff = target - nums[i];
			if(numMap.containsKey(diff))
				return new int[] {numMap.get(target - nums[i]),i};
			else 
				numMap.put(nums[i], i);
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		int[] result = twoSumUsingHashMap(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
        
        int[] result2 = twoSumUsingHashMap(new int[] {3,2,4}, 6);
        System.out.println(Arrays.toString(result2));
        
        int[] result3 = twoSumUsingHashMap(new int[] {3,3}, 6);
        System.out.println(Arrays.toString(result3));
  	}
}

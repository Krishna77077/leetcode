package com.leetcode.exercise;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
		int first = 0, last = nums.length -1;
		while(first<=last) {
			int mid = (last+first)/2;
			if(nums[mid] == target)
				return mid;
			else if (nums[mid] > target) 
				last = mid - 1;
			else
				first = mid + 1;
		}
		return first;
	}

	public static void main(String[] args) {
		//System.out.println(searchInsert(new int[] {1,3,5,6}, 5));
		System.out.println(searchInsert(new int[] {1,3,5,6}, 2));
	}

}

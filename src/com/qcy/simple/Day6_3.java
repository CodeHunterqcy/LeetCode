package com.qcy.simple;

public class Day6_3 {
	public static void main(String[] args) {
		int[] num = { 5, 7, 7, 8, 8, 10 };
		int[] res = searchRange(num, 7);
		System.out.println(findR(num, 6));
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

	public static int[] searchRange(int[] nums, int target) {
		int[] res = new int[2];
		res[0] = findR(nums, target - 1);
		res[1] = findR(nums, target) - 1;
		return res;
	}

	public static int findR(int[] nums, int t) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] <= t) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return l;
	}

}

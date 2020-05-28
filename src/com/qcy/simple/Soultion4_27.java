package com.qcy.simple;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 
 * @author CodeHunter_qcy
 *
 */
public class Soultion4_27 {
	public static void main(String[] args) {
		int[] nums = { 4, 4, 1, 7 };
		singleNumbers(nums);
		int mask = 1;
		int k = 6;

		while ((k & mask) == 0) {
			mask <<= 1;
			System.out.println(mask);
		}

	}

	public static int[] singleNumbers(int[] nums) {
		int k = 0;
		for (int num : nums) {
			k ^= num;
		}
		int mask = 1;
		while ((k & mask) == 0) {
			mask <<= 1;

		}
		int a = 0;
		int b = 0;
		for (int num : nums) {
			if ((num & mask) == 0) {
				a ^= num;
			} else {
				b ^= num;
			}
		}
		System.out.println(a);
		System.out.println(b);
		return new int[] { a, b };
	}
}

package com.qcy.medium;

import java.util.Arrays;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。 示例 1: 输入: [10,2] 输出: "102"
 * 示例 2: 输入: [3,30,34,5,9] 输出: "3033459"
 * 
 * @author CodeHunter_qcy
 *
 */
public class MinNUMS {
	public String minNumber(int[] nums) {
		String[] strings = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strings[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(strings, (x, y) -> (x + y).compareTo(y + x));
		StringBuilder res = new StringBuilder();
		for (String s : strings) {
			res.append(s);
		}
		return res.toString();
	}
}

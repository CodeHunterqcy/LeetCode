package com.qcy.medium;

/**
 * 盛最多水的容器
 * 
 * 思路：双指针 面积等于左右最小的高度*距离 每次移动最小的边
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution4_18 {

	public int maxArea(int[] height) {
		int res = 0, right = height.length - 1, left = 0;
		while (left < right) {
			int len = right - left;
			if (height[left] < height[right]) {
				res = Math.max(res, height[left] * len);
				left++;

			} else {
				res = Math.max(res, height[right] * len);
				right--;
			}

		}
		return res;

	}

}

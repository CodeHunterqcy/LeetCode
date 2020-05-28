package com.qcy.medium;

/**
 * ʢ���ˮ������
 * 
 * ˼·��˫ָ�� �������������С�ĸ߶�*���� ÿ���ƶ���С�ı�
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

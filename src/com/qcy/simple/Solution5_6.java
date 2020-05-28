package com.qcy.simple;

/**
 * �������ĺ����������
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution5_6 {

	public boolean verifyPostorder(int[] postorder) {
		int len = postorder.length - 1;
		return rec(postorder, 0, len);
	}

	public boolean rec(int[] arr, int start, int end) {
		if (start >= end) {
			return true;
		}
		int p = start;
		while (arr[p] < arr[end]) {
			p++;
		}
		int m = p;
		while (arr[p] > arr[end]) {
			p++;
		}
		return p == end && rec(arr, start, m - 1) && rec(arr, m + 1, end - 1);
	}

}

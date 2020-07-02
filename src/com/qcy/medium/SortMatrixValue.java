package com.qcy.medium;

/**
 * 行列递增数组 找出第K小的数字
 * 
 * @author CodeHunter_qcy
 *
 */
public class SortMatrixValue {
	public int kthSmallest(int[][] matrix, int k) {
		int len = matrix.length;
		int left = matrix[0][0];
		int right = matrix[len - 1][len - 1];
		while (left < right) {
			int mid = left + (right - left) / 2;

			if (check(matrix, mid, k)) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}
		return left;
	}

	private boolean check(int[][] matrix, int mid, int k) {
		// TODO Auto-generated method stub
		int num = 0;
		int j = 0;
		int i = matrix.length - 1;
		while (i >= 0 && j < matrix.length) {
			if (matrix[i][j] <= mid) {
				j++;
				num += i + 1;
			} else {
				i--;
			}
			if (num >= k) {
				return false;
			}
		}

		return true;
	}
}

package com.qcy.medium;

import java.util.Arrays;

public class TopK {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 6, 7, 9, 2, 4, 3 };
		for (int i = 0; i < arr.length - 1; i++) {

			boolean flag = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = false;
				}

			}
			if (flag) {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}

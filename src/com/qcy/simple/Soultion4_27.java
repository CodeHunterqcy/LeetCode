package com.qcy.simple;

/**
 * һ���������� nums �����������֮�⣬�������ֶ����������Ρ� ��д�����ҳ�������ֻ����һ�ε����֡�Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��
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

package com.qcy.simple;

public class Mian7_4 {
	public static boolean isAnagram(String s, String t) {
		char[] ch_s = s.toCharArray();
		char[] ch_t = t.toCharArray();
		int[] flag = new int[26];
		int len = s.length();
		int i = 0;
		while (i < len) {
			flag[ch_s[i] - 'a'] += 1;
			flag[ch_t[i] - 'a'] -= 1;
			i++;
		}
		for (int j = 0; j < flag.length; j++) {
			if (flag[j] != 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("avc", "cba"));
	}
}

package com.qcy.medium;

import java.util.HashMap;
import java.util.Map;

public class Main7_7 {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		char[] c = s.toCharArray();
		int res = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; j < c.length; j++) {
			if (map.containsKey(c[j])) {
				i = Math.max(i, map.get(c[j]));
			}
			map.put(c[j], j);
			res = Math.max(res, j - i + 1);
		}
		return res;
	}
}

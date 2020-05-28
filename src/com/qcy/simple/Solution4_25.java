package com.qcy.simple;

public class Solution4_25 {
	public static void main(String[] args) {
		String s = "  ss  ssd   sewq ";
		System.out.println("abcdefghigkl".substring(0, 12));
		System.out.println(reverseWords(s));

	}

	public static String reverseWords(String s) {
		s = s.trim();
		int len = s.length();
		int i = len - 1, j = len - 1;
		StringBuilder res = new StringBuilder();
		while (i > 0) {
			while (i >= 0 && s.charAt(i) != ' ') {
				i--;
			}
			res.append(s.substring(i + 1, j + 1) + " ");
			while (i >= 0 && s.charAt(i) == ' ') {
				i--;
			}
			j = i;

		}
		return res.toString();
	}
}

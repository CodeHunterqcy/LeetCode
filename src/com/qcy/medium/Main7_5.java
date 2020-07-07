package com.qcy.medium;

public class Main7_5 {
	public static void main(String[] args) {
		System.out.println(numDecodings("223"));
	}

	public static int numDecodings(String s) {
		char[] ch = s.toCharArray();
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = ch[0] == '0' ? 0 : 1;
		if (s.length() <= 1) {
			return dp[1];
		}
		for (int i = 2; i <= s.length(); i++) {
			int n = (ch[i - 2] - '0') * 10 + (ch[i - 1] - '0');
			if (ch[i - 2] == '0' && ch[i - 1] == '0') {
				return 0;
			} else if (ch[i - 2] == '0') {
				dp[i] = dp[i - 1];
			} else if (ch[i - 1] == '0') {
				if (n > 26) {
					return 0;
				}
				dp[i] = dp[i - 2];
			} else if (n > 26) {
				dp[i] = dp[i - 1];
			} else {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
		}
		return dp[dp.length - 1];
	}

}

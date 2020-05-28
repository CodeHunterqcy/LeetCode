package com.qcy.medium;

import java.util.Stack;

public class DecodeString {
	public static void main(String[] args) {
		System.out.println(decodeString("30[aaa]"));
	}

	public static String decodeString(String s) {
		String res = "";
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ']') {
				String code = "";
				while (!stack.peek().equals("[")) {
					code = stack.pop() + code;
				}
				stack.pop();
				String strNum = "";
				while (!stack.isEmpty() && (stack.peek().charAt(0) >= '0' && stack.peek().charAt(0) <= '9')) {
					strNum = stack.pop() + strNum;
				}
				int num = Integer.valueOf(strNum);
				String str = "";
				for (int j = 0; j < num; j++) {
					str = str + code;
				}
				stack.push(str);
			} else {
				String string = "" + s.charAt(i);
				stack.push(string);
			}

		}
		while (!stack.isEmpty()) {
			res = stack.pop() + res;
		}
		return res;

	}
}

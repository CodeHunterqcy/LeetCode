package com.qcy.simple;

import java.util.Stack;

/**
 * 实现一个min方法返回栈的最小元素
 * 
 * @author CodeHunter_qcy
 *
 */
public class MinStack {
	public static void main(String[] args) {
		int a = 0, b = 3;
		b = a;
		System.out.println(b);
	}

	Stack<Integer> stack, minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();// 辅助栈，装严格降序
	}

	public void push(int x) {
		stack.add(x);
		if (minStack.empty() || minStack.peek() >= x)
			minStack.add(x);

	}

	public void pop() {
		if (stack.pop().equals(minStack.peek())) {
			minStack.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return minStack.peek();
	}
}

package com.qcy.simple;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacklist {
	Deque<Integer> stack1 = new ArrayDeque<>();
	Deque<Integer> stack2 = new ArrayDeque<>();

	public void add(int value) {
		stack1.add(value);
	}

	public int peek() {
		if (stack2.isEmpty()) {
			if (stack1.isEmpty()) {
				return -1;
			}
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	public int pop() {
		if (stack2.isEmpty()) {
			if (stack1.isEmpty()) {
				return -1;
			}
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}

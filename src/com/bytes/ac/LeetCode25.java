package com.bytes.ac;

import java.util.LinkedList;
import java.util.List;

/**
 * k个一组反转链表
 * 
 * @author CodeHunter_qcy
 *
 */
public class LeetCode25 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

	}

	public ListNode reverseK(ListNode head, int k) {
		ListNode tummy = new ListNode(0);
		tummy.next = head;

		ListNode pre = head;
		ListNode end = head;

		while (end.next != null) {
			for (int i = 0; i < k && end != null; i++) {
				end = end.next;
			}
			if (end == null) {
				break;
			}

			ListNode start = pre.next;
			ListNode next = end.next;
			end.next = null;

			pre.next = reverse(start);
			start.next = next;

			pre = start;
			end = start;

		}
		return tummy.next;

	}

	public ListNode reverse(ListNode head) {
		ListNode pre = null, cur = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
}

class ListNode {
	ListNode next;
	int val;

	public ListNode(int val) {

		this.val = val;
	}

}
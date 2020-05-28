package com.qcy.simple;

/**
 * 反转链表 常规解法和递归解法
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution4_17 {
	/*
	 * public ListNode reverseList(ListNode head) { // 常规 if (head == null) { return
	 * null; } ListNode cur = head, temp = null, pre = null; while (cur != null) {
	 * temp=cur.next; cur.next =pre; pre=cur; cur=temp; } return pre; }
	 */
	// 递归
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode cur = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return cur;
	}
}

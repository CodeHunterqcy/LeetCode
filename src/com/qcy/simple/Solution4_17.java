package com.qcy.simple;

/**
 * ��ת���� ����ⷨ�͵ݹ�ⷨ
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution4_17 {
	/*
	 * public ListNode reverseList(ListNode head) { // ���� if (head == null) { return
	 * null; } ListNode cur = head, temp = null, pre = null; while (cur != null) {
	 * temp=cur.next; cur.next =pre; pre=cur; cur=temp; } return pre; }
	 */
	// �ݹ�
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

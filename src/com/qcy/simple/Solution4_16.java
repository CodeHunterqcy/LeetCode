package com.qcy.simple;

/**
 * 判断两个单链表是否交叉 分析：单链表，如果相交，之后节点一样 那么A链表到节点长度a B链表到节点长度b 如果相交一定存在a+b=b+a；
 * 所以，当A节点不等于B节点时，一直往后找，A到头切到B，B到头切到A，如果相交，一定会遇到；
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution4_16 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode nA = headA, nB = headB;
		while (nA != nB) {
			nA = nA == null ? headB : nA.next;

			nB = nB == null ? headA : nB.next;
		}
		return nA;
	}
}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

}

package com.qcy.simple;

/**
 * �ж������������Ƿ񽻲� ����������������ཻ��֮��ڵ�һ�� ��ôA�����ڵ㳤��a B�����ڵ㳤��b ����ཻһ������a+b=b+a��
 * ���ԣ���A�ڵ㲻����B�ڵ�ʱ��һֱ�����ң�A��ͷ�е�B��B��ͷ�е�A������ཻ��һ����������
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

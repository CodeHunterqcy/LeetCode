package com.qcy.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author CodeHunter_qcy
 *
 */
public class CopyList {
	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}
		Node p = head;
		Map<Node, Node> map = new HashMap<Node, Node>();
		while (p != null) {
			map.put(p, new Node(p.val));
			p = p.next;
		}
		p = head;
		while (p != null) {
			map.get(p).next = map.get(p.next);
			map.get(p).random = map.get(p.random);
			p = p.next;
		}
		return map.get(head);
	}
}

class Node {
	int val;
	Node next;
	Node random;

	public Node(int x) {
		val = x;
		next = null;
		random = null;
	}

}

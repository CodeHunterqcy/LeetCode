package com.qcy.medium;

import java.util.HashMap;

public class LRU<K, V> {
	private int currentSize;
	private int capcity;
	private HashMap<K, Node> caches;
	private Node first;
	private Node last;

	public LRU(int size) {
		currentSize = 0;
		this.capcity = size;
		caches = new HashMap<K, Node>(size);
	}

	public void put(K key, V value) {
		Node node = caches.get(key);

		if (null == node) {
			if (caches.size() >= capcity) {
				caches.remove(last.key);
				removeLast();
			}
			node = new Node(key, value);
			caches.put(key, node);
			currentSize++;
		} else {
			node.value = value;
		}
		moveToHead(node);
	}

	public Object get(K key) {
		Node node = caches.get(key);
		if (node == null) {
			return null;
		}
		moveToHead(node);
		return node.value;
	}

	public Object remove(K key) {
		Node node = caches.get(key);
		if (node != null) {
			if (node.pre != null) {
				node.pre.next = node.next;
			}
			if (node.next != null) {
				node.next.pre = node.pre;
			}
			if (node == first) {
				first = node.next;
			}
			if (node == last) {
				last = node.pre;
			}
		}
		return caches.remove(key);
	}

	private void moveToHead(Node node) {
		if (first == node) {
			return;
		}
		if (node.pre != null) {
			node.pre.next = node.next;
		}
		if (node.next != null) {
			node.next.pre = node.pre;
		}

		if (node == last) {
			last = node.pre;
		}
		if (first == null || last == null) {
			first = last = node;
			return;
		}
		node.next = first;
		first.pre = node;
		first = node;
		first.pre = null;

	}

	private void removeLast() {
		if (last != null) {
			last = last.pre;
			if (last == null) {
				first = null;
			} else {
				last.next = null;
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node node = first;
		while (node != null) {
			sb.append(String.format("%s:%s ", node.key, node.value));
			node = node.next;
		}
		return sb.toString();
	}

	public void clear() {
		first = null;
		last = null;
		caches.clear();
	}

	public static void main(String[] args) {
		LRU<Integer, String> lru = new LRU<Integer, String>(5);
		lru.put(1, "a");
		lru.put(2, "b");
		lru.put(3, "c");
		lru.put(4, "d");
		lru.put(5, "e");
		System.out.println("原始链表为:" + lru.toString());

		lru.get(4);
		System.out.println("获取key为4的元素之后的链表:" + lru.toString());

		lru.put(6, "f");
		System.out.println("新添加一个key为6之后的链表:" + lru.toString());

		lru.remove(3);
		System.out.println("移除key=3的之后的链表:" + lru.toString());
	}
}

class Node {
	Object key;
	Object value;
	Node pre;
	Node next;

	public Node(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

}

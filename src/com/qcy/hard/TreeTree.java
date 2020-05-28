package com.qcy.hard;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 序列化二叉树 请实现两个函数，分别用来序列化和反序列化二叉树。
 * 
 * 示例: 
 * 
 * 你可以将以下二叉树：
 * 
 * 序列化为 "[1,2,3,null,null,4,5]"
 * 
 * @author CodeHunter_qcy
 *
 */
public class TreeTree {
	String res;

	// 序列化
	public String serialize(TreeNode root) {
		if (root == null) {
			return "[]";
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		res = "[" + root.val;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
				res += "," + node.left.val;
			} else {
				res += ",null";
			}
			if (node.right != null) {
				queue.add(node.right);
				res += "," + node.right.val;
			} else {
				res += ",null";
			}
		}
		res += "]";
		return res;
	}

	// 反序列化.
	public TreeNode deserialize(String data) {
		if (data.length() == 2) {
			return null;
		}
		// 去括号
		data = data.substring(1, data.length() - 1);
		// 逗号分割
		String str[] = data.split(",");
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode root = new TreeNode(Integer.valueOf(str[0]));
		queue.add(root);
		int i = 1;
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (str[i].equals("null")) {
				node.left = null;
			} else {
				node.left = new TreeNode(Integer.valueOf(str[i]));
				queue.add(node.left);
			}
			i++;
			if (str[i].equals("null")) {
				node.right = null;
			} else {
				node.right = new TreeNode(Integer.valueOf(str[i]));
				queue.add(node.right);
			}
			i++;
		}
		return root;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int x) {
			val = x;
		}
	}

}

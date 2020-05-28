package com.qcy.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上到下打印二叉树 也就是层次遍历二叉树，只不过不需要按照层次打印
 * 
 * @author CodeHunter_qcy
 *
 */
public class Solution5_4 {
	public int[] levelOrder(TreeNode root) {
		if (root == null) {
			return new int[0];
		}
		List<Integer> res = new ArrayList<Integer>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			res.add(node.val);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		res.stream().mapToInt(Integer::intValue).toArray();
		return res.stream().mapToInt(Integer::intValue).toArray();// 记住这句
	}
}
